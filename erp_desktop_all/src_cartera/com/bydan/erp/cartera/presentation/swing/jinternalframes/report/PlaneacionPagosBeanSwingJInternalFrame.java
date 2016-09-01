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

//import com.bydan.erp.cartera.util.PlaneacionPagosConstantesFunciones;
import com.bydan.erp.cartera.util.report.PlaneacionPagosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.PlaneacionPagosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.PlaneacionPagosBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PlaneacionPagosBeanSwingJInternalFrame extends PlaneacionPagosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PlaneacionPagosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PlaneacionPagos> planeacionpagosValidator = new ClassValidator<PlaneacionPagos>(PlaneacionPagos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PlaneacionPagos planeacionpagos;	
	public PlaneacionPagos planeacionpagosAux;
	public PlaneacionPagos planeacionpagosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PlaneacionPagos planeacionpagosTotales;
	public Long idPlaneacionPagosActual;
	public Long iIdNuevoPlaneacionPagos=0L;
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

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
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
	
	public Boolean isPermisoTodoPlaneacionPagos;
	public Boolean isPermisoNuevoPlaneacionPagos;
	public Boolean isPermisoActualizarPlaneacionPagos;
	public Boolean isPermisoActualizarOriginalPlaneacionPagos;
	public Boolean isPermisoEliminarPlaneacionPagos;
	public Boolean isPermisoGuardarCambiosPlaneacionPagos;
	public Boolean isPermisoConsultaPlaneacionPagos;
	public Boolean isPermisoBusquedaPlaneacionPagos;
	public Boolean isPermisoReportePlaneacionPagos;
	public Boolean isPermisoPaginacionMedioPlaneacionPagos;
	public Boolean isPermisoPaginacionAltoPlaneacionPagos;
	public Boolean isPermisoPaginacionTodoPlaneacionPagos;
	public Boolean isPermisoCopiarPlaneacionPagos;
	public Boolean isPermisoVerFormPlaneacionPagos;
	public Boolean isPermisoDuplicarPlaneacionPagos;
	public Boolean isPermisoOrdenPlaneacionPagos;
	
	
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
	
	public PlaneacionPagosParameterReturnGeneral planeacionpagosReturnGeneral;
	public PlaneacionPagosParameterReturnGeneral planeacionpagosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPlaneacionPagos=false;
	public Boolean esParaAccionDesdeFormularioPlaneacionPagos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PlaneacionPagosSessionBeanAdditional planeacionpagosSessionBeanAdditional=null;
	
	public PlaneacionPagosSessionBeanAdditional getPlaneacionPagosSessionBeanAdditional() {
		return this.planeacionpagosSessionBeanAdditional;
	}
	
	public void setPlaneacionPagosSessionBeanAdditional(PlaneacionPagosSessionBeanAdditional planeacionpagosSessionBeanAdditional) {
		try {
			this.planeacionpagosSessionBeanAdditional=planeacionpagosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PlaneacionPagosBeanSwingJInternalFrameAdditional planeacionpagosBeanSwingJInternalFrameAdditional=null;
	//public class PlaneacionPagosBeanSwingJInternalFrame
	
	public PlaneacionPagosBeanSwingJInternalFrameAdditional getPlaneacionPagosBeanSwingJInternalFrameAdditional() {
		return this.planeacionpagosBeanSwingJInternalFrameAdditional;
	}
	
	public void setPlaneacionPagosBeanSwingJInternalFrameAdditional(PlaneacionPagosBeanSwingJInternalFrameAdditional planeacionpagosBeanSwingJInternalFrameAdditional) {
		try {
			this.planeacionpagosBeanSwingJInternalFrameAdditional=planeacionpagosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PlaneacionPagosLogic planeacionpagosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PlaneacionPagos planeacionpagosBean;
	public PlaneacionPagosConstantesFunciones planeacionpagosConstantesFunciones;
	//public PlaneacionPagosParameterReturnGeneral planeacionpagosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public FacturaLogic facturaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<PlaneacionPagos> planeacionpagoss;	
	//public List<PlaneacionPagos> planeacionpagossEliminados;
	//public List<PlaneacionPagos> planeacionpagossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPlaneacionPagos=false;
	public Boolean isVisibilidadCeldaDuplicarPlaneacionPagos=true;
	public Boolean isVisibilidadCeldaCopiarPlaneacionPagos=true;
	public Boolean isVisibilidadCeldaVerFormPlaneacionPagos=true;
	public Boolean isVisibilidadCeldaOrdenPlaneacionPagos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
	public Boolean isVisibilidadCeldaModificarPlaneacionPagos=false;
	public Boolean isVisibilidadCeldaActualizarPlaneacionPagos=false;
	public Boolean isVisibilidadCeldaEliminarPlaneacionPagos=false;
	public Boolean isVisibilidadCeldaCancelarPlaneacionPagos=false;
	public Boolean isVisibilidadCeldaGuardarPlaneacionPagos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;	
	
	
	public Boolean isVisibilidadBusquedaPlaneacionPagos=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	
	public Long getiIdNuevoPlaneacionPagos() {
		return this.iIdNuevoPlaneacionPagos;
	}

	public void setiIdNuevoPlaneacionPagos(Long iIdNuevoPlaneacionPagos) {
		this.iIdNuevoPlaneacionPagos = iIdNuevoPlaneacionPagos;
	}
	
	public Long getidPlaneacionPagosActual() {
		return this.idPlaneacionPagosActual;
	}

	public void setidPlaneacionPagosActual(Long idPlaneacionPagosActual) {
		this.idPlaneacionPagosActual = idPlaneacionPagosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PlaneacionPagos getplaneacionpagos() {
		return this.planeacionpagos;
	}

	public void setplaneacionpagos(PlaneacionPagos planeacionpagos) {
		this.planeacionpagos = planeacionpagos;
	}
	
	public PlaneacionPagos getplaneacionpagosAux() {
		return this.planeacionpagosAux;
	}

	public void setplaneacionpagosAux(PlaneacionPagos planeacionpagosAux) {
		this.planeacionpagosAux = planeacionpagosAux;
	}				
	
	public PlaneacionPagos getplaneacionpagosAnterior() {
		return this.planeacionpagosAnterior;
	}

	public void setplaneacionpagosAnterior(PlaneacionPagos planeacionpagosAnterior) {
		this.planeacionpagosAnterior = planeacionpagosAnterior;
	}	
	
	public PlaneacionPagos getplaneacionpagosTotales() {
		return this.planeacionpagosTotales;
	}

	public void setplaneacionpagosTotales(PlaneacionPagos planeacionpagosTotales) {
		this.planeacionpagosTotales = planeacionpagosTotales;
	}	
	
	public PlaneacionPagos getplaneacionpagosBean() {
		return this.planeacionpagosBean;
	}

	public void setplaneacionpagosBean(PlaneacionPagos planeacionpagosBean) {
		this.planeacionpagosBean = planeacionpagosBean;
	}	
	
	public PlaneacionPagosParameterReturnGeneral getplaneacionpagosReturnGeneral() {
		return this.planeacionpagosReturnGeneral;
	}

	public void setplaneacionpagosReturnGeneral(PlaneacionPagosParameterReturnGeneral planeacionpagosReturnGeneral) {
		this.planeacionpagosReturnGeneral = planeacionpagosReturnGeneral;
	}	
	
	
	public Long id_grupo_clienteBusquedaPlaneacionPagos=-1L;

	public Long getid_grupo_clienteBusquedaPlaneacionPagos() {
		return this.id_grupo_clienteBusquedaPlaneacionPagos;
	}

	public void setid_grupo_clienteBusquedaPlaneacionPagos(Long id_grupo_clienteBusquedaPlaneacionPagos) {
		this.id_grupo_clienteBusquedaPlaneacionPagos = id_grupo_clienteBusquedaPlaneacionPagos;
	}

;
	public Date fecha_pago_inicioBusquedaPlaneacionPagos=new Date();

	public Date getfecha_pago_inicioBusquedaPlaneacionPagos() {
		return this.fecha_pago_inicioBusquedaPlaneacionPagos;
	}

	public void setfecha_pago_inicioBusquedaPlaneacionPagos(Date fecha_pago_inicioBusquedaPlaneacionPagos) {
		this.fecha_pago_inicioBusquedaPlaneacionPagos = fecha_pago_inicioBusquedaPlaneacionPagos;
	}

;
	public Date fecha_pago_finBusquedaPlaneacionPagos=new Date();

	public Date getfecha_pago_finBusquedaPlaneacionPagos() {
		return this.fecha_pago_finBusquedaPlaneacionPagos;
	}

	public void setfecha_pago_finBusquedaPlaneacionPagos(Date fecha_pago_finBusquedaPlaneacionPagos) {
		this.fecha_pago_finBusquedaPlaneacionPagos = fecha_pago_finBusquedaPlaneacionPagos;
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

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PlaneacionPagosLogic getPlaneacionPagosLogic()	{		
		return planeacionpagosLogic;
	}

	public void setPlaneacionPagosLogic(PlaneacionPagosLogic planeacionpagosLogic) {
		this.planeacionpagosLogic = planeacionpagosLogic;
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
	
	public Boolean getIsEsNuevoPlaneacionPagos() {
		return isEsNuevoPlaneacionPagos;
	}

	public void setIsEsNuevoPlaneacionPagos(Boolean isEsNuevoPlaneacionPagos) {
		this.isEsNuevoPlaneacionPagos = isEsNuevoPlaneacionPagos;
	}

	public Boolean getEsParaAccionDesdeFormularioPlaneacionPagos() {
		return esParaAccionDesdeFormularioPlaneacionPagos;
	}
	
	public void setEsParaAccionDesdeFormularioPlaneacionPagos(Boolean esParaAccionDesdeFormularioPlaneacionPagos) {
		this.esParaAccionDesdeFormularioPlaneacionPagos = esParaAccionDesdeFormularioPlaneacionPagos;
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

			if(this.planeacionpagosSessionBean==null) {
				this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
			}

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(planeacionpagosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.planeacionpagosSessionBean==null) {
				this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
			}

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(planeacionpagosSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
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

			if(this.planeacionpagosSessionBean==null) {
				this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
			}

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
					facturaLogic.getEntityWithConnection(planeacionpagosSessionBean.getlidFacturaActual());
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

			if(this.planeacionpagosSessionBean==null) {
				this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
			}

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(planeacionpagosSessionBean.getlidClienteActual());
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

					if(this.planeacionpagos!=null) {
						this.planeacionpagos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPlaneacionPagos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPlaneacionPagosGenerico)throws Exception
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
				jComboBoxid_empresaPlaneacionPagosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPlaneacionPagosGenerico!=null && jComboBoxid_empresaPlaneacionPagosGenerico.getItemCount()>0) {
					jComboBoxid_empresaPlaneacionPagosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.planeacionpagos!=null) {
						this.planeacionpagos.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clientePlaneacionPagos.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPlaneacionPagos") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos!=null) {
						jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos!=null) {
							//jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setSelectedIndex(0);
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

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clientePlaneacionPagosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clientePlaneacionPagosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clientePlaneacionPagosGenerico!=null && jComboBoxid_grupo_clientePlaneacionPagosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clientePlaneacionPagosGenerico.setSelectedIndex(0);
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

					if(this.planeacionpagos!=null) {
						this.planeacionpagos.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaPlaneacionPagos.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setSelectedIndex(0);
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
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaPlaneacionPagosGenerico)throws Exception
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
				jComboBoxid_facturaPlaneacionPagosGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaPlaneacionPagosGenerico!=null && jComboBoxid_facturaPlaneacionPagosGenerico.getItemCount()>0) {
					jComboBoxid_facturaPlaneacionPagosGenerico.setSelectedIndex(0);
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

					if(this.planeacionpagos!=null) {
						this.planeacionpagos.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clientePlaneacionPagos.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clientePlaneacionPagosGenerico)throws Exception
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
				jComboBoxid_clientePlaneacionPagosGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clientePlaneacionPagosGenerico!=null && jComboBoxid_clientePlaneacionPagosGenerico.getItemCount()>0) {
					jComboBoxid_clientePlaneacionPagosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PlaneacionPagos planeacionpagos,JComboBox jComboBoxid_empresaPlaneacionPagosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPlaneacionPagosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPlaneacionPagosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				planeacionpagos.setid_empresa(empresaAux.getId());
				planeacionpagos.setempresa_descripcion(PlaneacionPagosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				planeacionpagos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(PlaneacionPagos planeacionpagos,JComboBox jComboBoxid_grupo_clientePlaneacionPagosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clientePlaneacionPagosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clientePlaneacionPagosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				planeacionpagos.setid_grupo_cliente(grupoclienteAux.getId());
				planeacionpagos.setgrupocliente_descripcion(PlaneacionPagosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				planeacionpagos.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(PlaneacionPagos planeacionpagos,JComboBox jComboBoxid_facturaPlaneacionPagosGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaPlaneacionPagosGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaPlaneacionPagosGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				planeacionpagos.setid_factura(facturaAux.getId());
				planeacionpagos.setfactura_descripcion(PlaneacionPagosConstantesFunciones.getFacturaDescripcion(facturaAux));
				planeacionpagos.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(PlaneacionPagos planeacionpagos,JComboBox jComboBoxid_clientePlaneacionPagosGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clientePlaneacionPagosGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clientePlaneacionPagosGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				planeacionpagos.setid_cliente(clienteAux.getId());
				planeacionpagos.setcliente_descripcion(PlaneacionPagosConstantesFunciones.getClienteDescripcion(clienteAux));
				planeacionpagos.setCliente(clienteAux);			}
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

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
					}

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
					}

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPlaneacionPagos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.addItem(grupocliente);
							}
						}

						if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
					}

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { 
					}

					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPlaneacionPagos() throws Exception {
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
		
	public PlaneacionPagosParameterReturnGeneral getPlaneacionPagosParameterGeneral() {
		return this.planeacionpagosParameterGeneral;
	}
	
	public void setPlaneacionPagosParameterGeneral(PlaneacionPagosParameterReturnGeneral planeacionpagosParameterGeneral) {
		this.planeacionpagosParameterGeneral = planeacionpagosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPlaneacionPagos() {
		return isPermisoTodoPlaneacionPagos;
	}

	public void setIsPermisoTodoPlaneacionPagos(Boolean isPermisoTodoPlaneacionPagos) {
		this.isPermisoTodoPlaneacionPagos = isPermisoTodoPlaneacionPagos;
	}

	public Boolean getIsPermisoNuevoPlaneacionPagos() {
		return isPermisoNuevoPlaneacionPagos;
	}

	public void setIsPermisoNuevoPlaneacionPagos(Boolean isPermisoNuevoPlaneacionPagos) {
		this.isPermisoNuevoPlaneacionPagos = isPermisoNuevoPlaneacionPagos;
	}

	public Boolean getIsPermisoActualizarPlaneacionPagos() {
		return isPermisoActualizarPlaneacionPagos;
	}

	public void setIsPermisoActualizarPlaneacionPagos(Boolean isPermisoActualizarPlaneacionPagos) {
		this.isPermisoActualizarPlaneacionPagos = isPermisoActualizarPlaneacionPagos;
	}

	public Boolean getIsPermisoEliminarPlaneacionPagos() {
		return isPermisoEliminarPlaneacionPagos;
	}

	public void setIsPermisoEliminarPlaneacionPagos(Boolean isPermisoEliminarPlaneacionPagos) {
		this.isPermisoEliminarPlaneacionPagos = isPermisoEliminarPlaneacionPagos;
	}

	public Boolean getIsPermisoGuardarCambiosPlaneacionPagos() {
		return isPermisoGuardarCambiosPlaneacionPagos;
	}

	public void setIsPermisoGuardarCambiosPlaneacionPagos(Boolean isPermisoGuardarCambiosPlaneacionPagos) {
		this.isPermisoGuardarCambiosPlaneacionPagos = isPermisoGuardarCambiosPlaneacionPagos;
	}
	
	public Boolean getIsPermisoConsultaPlaneacionPagos() {
		return isPermisoConsultaPlaneacionPagos;
	}

	public void setIsPermisoConsultaPlaneacionPagos(Boolean isPermisoConsultaPlaneacionPagos) {
		this.isPermisoConsultaPlaneacionPagos = isPermisoConsultaPlaneacionPagos;
	}

	public Boolean getIsPermisoBusquedaPlaneacionPagos() {
		return isPermisoBusquedaPlaneacionPagos;
	}

	public void setIsPermisoBusquedaPlaneacionPagos(Boolean isPermisoBusquedaPlaneacionPagos) {
		this.isPermisoBusquedaPlaneacionPagos = isPermisoBusquedaPlaneacionPagos;
	}

	public Boolean getIsPermisoReportePlaneacionPagos() {
		return isPermisoReportePlaneacionPagos;
	}

	public void setIsPermisoReportePlaneacionPagos(Boolean isPermisoReportePlaneacionPagos) {
		this.isPermisoReportePlaneacionPagos = isPermisoReportePlaneacionPagos;
	}
	
	public Boolean getIsPermisoPaginacionMedioPlaneacionPagos() {
		return isPermisoPaginacionMedioPlaneacionPagos;
	}

	public void setIsPermisoPaginacionMedioPlaneacionPagos(Boolean isPermisoPaginacionMedioPlaneacionPagos) {
		this.isPermisoPaginacionMedioPlaneacionPagos = isPermisoPaginacionMedioPlaneacionPagos;
	}
	
	public Boolean getIsPermisoPaginacionTodoPlaneacionPagos() {
		return isPermisoPaginacionTodoPlaneacionPagos;
	}

	public void setIsPermisoPaginacionTodoPlaneacionPagos(Boolean isPermisoPaginacionTodoPlaneacionPagos) {
		this.isPermisoPaginacionTodoPlaneacionPagos = isPermisoPaginacionTodoPlaneacionPagos;
	}
	
	public Boolean getIsPermisoPaginacionAltoPlaneacionPagos() {
		return isPermisoPaginacionAltoPlaneacionPagos;
	}

	public void setIsPermisoPaginacionAltoPlaneacionPagos(Boolean isPermisoPaginacionAltoPlaneacionPagos) {
		this.isPermisoPaginacionAltoPlaneacionPagos = isPermisoPaginacionAltoPlaneacionPagos;
	}
	
	public Boolean getIsPermisoCopiarPlaneacionPagos() {
		return isPermisoCopiarPlaneacionPagos;
	}

	public void setIsPermisoCopiarPlaneacionPagos(Boolean isPermisoCopiarPlaneacionPagos) {
		this.isPermisoCopiarPlaneacionPagos = isPermisoCopiarPlaneacionPagos;
	}
	
	public Boolean getIsPermisoVerFormPlaneacionPagos() {
		return isPermisoVerFormPlaneacionPagos;
	}

	public void setIsPermisoVerFormPlaneacionPagos(Boolean isPermisoVerFormPlaneacionPagos) {
		this.isPermisoVerFormPlaneacionPagos = isPermisoVerFormPlaneacionPagos;
	}
	
	public Boolean getIsPermisoDuplicarPlaneacionPagos() {
		return isPermisoDuplicarPlaneacionPagos;
	}

	public void setIsPermisoDuplicarPlaneacionPagos(Boolean isPermisoDuplicarPlaneacionPagos) {
		this.isPermisoDuplicarPlaneacionPagos = isPermisoDuplicarPlaneacionPagos;
	}
	
	public Boolean getIsPermisoOrdenPlaneacionPagos() {
		return isPermisoOrdenPlaneacionPagos;
	}

	public void setIsPermisoOrdenPlaneacionPagos(Boolean isPermisoOrdenPlaneacionPagos) {
		this.isPermisoOrdenPlaneacionPagos = isPermisoOrdenPlaneacionPagos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPlaneacionPagos() {
		return isVisibilidadCeldaNuevoPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaNuevoPlaneacionPagos(Boolean isVisibilidadCeldaNuevoPlaneacionPagos) {
		this.isVisibilidadCeldaNuevoPlaneacionPagos = isVisibilidadCeldaNuevoPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPlaneacionPagos() {
		return isVisibilidadCeldaDuplicarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaDuplicarPlaneacionPagos(Boolean isVisibilidadCeldaDuplicarPlaneacionPagos) {
		this.isVisibilidadCeldaDuplicarPlaneacionPagos = isVisibilidadCeldaDuplicarPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPlaneacionPagos() {
		return isVisibilidadCeldaCopiarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaCopiarPlaneacionPagos(Boolean isVisibilidadCeldaCopiarPlaneacionPagos) {
		this.isVisibilidadCeldaCopiarPlaneacionPagos = isVisibilidadCeldaCopiarPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPlaneacionPagos() {
		return isVisibilidadCeldaVerFormPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaVerFormPlaneacionPagos(Boolean isVisibilidadCeldaVerFormPlaneacionPagos) {
		this.isVisibilidadCeldaVerFormPlaneacionPagos = isVisibilidadCeldaVerFormPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPlaneacionPagos() {
		return isVisibilidadCeldaOrdenPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaOrdenPlaneacionPagos(Boolean isVisibilidadCeldaOrdenPlaneacionPagos) {
		this.isVisibilidadCeldaOrdenPlaneacionPagos = isVisibilidadCeldaOrdenPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPlaneacionPagos() {
		return isVisibilidadCeldaNuevoRelacionesPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPlaneacionPagos(Boolean isVisibilidadCeldaNuevoRelacionesPlaneacionPagos) {
		this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos = isVisibilidadCeldaNuevoRelacionesPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPlaneacionPagos() {
		return isVisibilidadCeldaModificarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaModificarPlaneacionPagos(Boolean isVisibilidadCeldaModificarPlaneacionPagos) {
		this.isVisibilidadCeldaModificarPlaneacionPagos = isVisibilidadCeldaModificarPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPlaneacionPagos() {
		return isVisibilidadCeldaActualizarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaActualizarPlaneacionPagos(Boolean isVisibilidadCeldaActualizarPlaneacionPagos) {
		this.isVisibilidadCeldaActualizarPlaneacionPagos = isVisibilidadCeldaActualizarPlaneacionPagos;
	}

	public Boolean getIsVisibilidadCeldaEliminarPlaneacionPagos() {
		return isVisibilidadCeldaEliminarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaEliminarPlaneacionPagos(Boolean isVisibilidadCeldaEliminarPlaneacionPagos) {
		this.isVisibilidadCeldaEliminarPlaneacionPagos = isVisibilidadCeldaEliminarPlaneacionPagos;
	}

	public Boolean getIsVisibilidadCeldaCancelarPlaneacionPagos() {
		return isVisibilidadCeldaCancelarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaCancelarPlaneacionPagos(Boolean isVisibilidadCeldaCancelarPlaneacionPagos) {
		this.isVisibilidadCeldaCancelarPlaneacionPagos = isVisibilidadCeldaCancelarPlaneacionPagos;
	}

	public Boolean getIsVisibilidadCeldaGuardarPlaneacionPagos() {
		return isVisibilidadCeldaGuardarPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaGuardarPlaneacionPagos(Boolean isVisibilidadCeldaGuardarPlaneacionPagos) {
		this.isVisibilidadCeldaGuardarPlaneacionPagos = isVisibilidadCeldaGuardarPlaneacionPagos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPlaneacionPagos() {
		return isVisibilidadCeldaGuardarCambiosPlaneacionPagos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPlaneacionPagos(Boolean isVisibilidadCeldaGuardarCambiosPlaneacionPagos) {
		this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos = isVisibilidadCeldaGuardarCambiosPlaneacionPagos;
	}
		
	public PlaneacionPagosSessionBean getplaneacionpagosSessionBean() {
		return this.planeacionpagosSessionBean;
	}
	
	public void setplaneacionpagosSessionBean(PlaneacionPagosSessionBean planeacionpagosSessionBean) {
		this.planeacionpagosSessionBean=planeacionpagosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPlaneacionPagos() {
		return this.isVisibilidadBusquedaPlaneacionPagos;
	}

	public void setisVisibilidadBusquedaPlaneacionPagos(Boolean isVisibilidadBusquedaPlaneacionPagos) {
		this.isVisibilidadBusquedaPlaneacionPagos=isVisibilidadBusquedaPlaneacionPagos;
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

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(PlaneacionPagos planeacionpagos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(planeacionpagos,null);
				this.setActualParaGuardarGrupoClienteForeignKey(planeacionpagos,null);
				this.setActualParaGuardarFacturaForeignKey(planeacionpagos,null);
				this.setActualParaGuardarClienteForeignKey(planeacionpagos,null);
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
	
	public void bugActualizarReferenciaActual(PlaneacionPagos planeacionpagos,PlaneacionPagos planeacionpagosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPlaneacionPagos(planeacionpagos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		planeacionpagosAux.setId(planeacionpagos.getId());
		planeacionpagosAux.setVersionRow(planeacionpagos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PlaneacionPagos planeacionpagosLocal) throws Exception {
		
		if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PlaneacionPagos planeacionpagosLocal) throws Exception {	
		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				planeacionpagosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				planeacionpagosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				planeacionpagosLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				planeacionpagosLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPlaneacionPagosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = planeacionpagosValidator.getInvalidValues(this.planeacionpagos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PlaneacionPagos planeacionpagos,List<PlaneacionPagos> planeacionpagoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(PlaneacionPagos planeacionpagos,List<PlaneacionPagos> planeacionpagoss) throws Exception {
		try	{			
			PlaneacionPagosConstantesFunciones.actualizarSelectedLista(planeacionpagos,planeacionpagoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PlaneacionPagos> planeacionpagossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				planeacionpagossLocal=this.planeacionpagosLogic.getPlaneacionPagoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				planeacionpagossLocal=this.planeacionpagoss;
			}
			//ARCHITECTURE
		
			for(PlaneacionPagos planeacionpagosLocal:planeacionpagossLocal) {
				if(this.permiteMantenimiento(planeacionpagosLocal) && planeacionpagosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PlaneacionPagosConstantesFunciones.getPlaneacionPagosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelid_facturaPlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelid_clientePlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelnombre_clientePlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelnumero_facturaPlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_emisionPlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.FECHAVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_ventaPlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.FECHAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_pagoPlaneacionPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionPagosConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelsaldoPlaneacionPagos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelid_facturaPlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelid_clientePlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelnombre_clientePlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelnumero_facturaPlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_emisionPlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_ventaPlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_pagoPlaneacionPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelsaldoPlaneacionPagos,"");
		
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
		this.iIdNuevoPlaneacionPagos--;	
		
		
		this.planeacionpagosAux=new PlaneacionPagos();
		
		this.planeacionpagosAux.setId(this.iIdNuevoPlaneacionPagos);
		this.planeacionpagosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planeacionpagosLogic.getPlaneacionPagoss().add(this.planeacionpagosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.planeacionpagoss.add(this.planeacionpagosAux);
		}
		//ARCHITECTURE
		
		this.planeacionpagos=this.planeacionpagosAux;
		
		if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagos);
			this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionPagos(this.planeacionpagos);
		}
				
		//this.setDefaultControlesPlaneacionPagos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPlaneacionPagos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPlaneacionPagos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlaneacionPagos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlaneacionPagos(this.planeacionpagosBean,this.planeacionpagos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPlaneacionPagos(this.planeacionpagosReturnGeneral,this.planeacionpagosBean,false);
		
		if(this.planeacionpagosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionPagos(this.planeacionpagosReturnGeneral.getPlaneacionPagos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagosReturnGeneral.getPlaneacionPagos());
		}
		
		if(this.planeacionpagosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagosReturnGeneral.getPlaneacionPagos(),classes);//this.planeacionpagosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPlaneacionPagos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPlaneacionPagos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.RecargarFormPlaneacionPagos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPlaneacionPagos(false);
						
			if(planeacionpagosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaneacionPagos();
			}
			
			this.actualizarVisualTableDatosPlaneacionPagos();
			
			this.jTableDatosPlaneacionPagos.setRowSelectionInterval(this.getIndiceNuevoPlaneacionPagos(), this.getIndiceNuevoPlaneacionPagos());
			
			this.seleccionarFilaTablaPlaneacionPagosActual();
						
			this.actualizarEstadoCeldasBotonesPlaneacionPagos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPlaneacionPagos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_inicioPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarfecha_pago_inicioPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_finPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarfecha_pago_finPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarnombre_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarnumero_facturaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarfecha_emisionPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarfecha_ventaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarfecha_pagoPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarsaldoPlaneacionPagos);	
		//
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarid_empresaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarid_grupo_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarid_facturaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setEnabled(isHabilitar && this.planeacionpagosConstantesFunciones.activarid_clientePlaneacionPagos);
	};
	
	public void setDefaultControlesPlaneacionPagos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPlaneacionPagos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.planeacionpagosSessionBean.setConGuardarRelaciones(true);			
			this.planeacionpagosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.setVisible(true);
			
					
		} else {
			//this.planeacionpagosSessionBean.setConGuardarRelaciones(false);			
			this.planeacionpagosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPlaneacionPagos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
				if(planeacionpagosAux.getId().equals(this.iIdNuevoPlaneacionPagos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionPagos planeacionpagosAux:this.planeacionpagoss) {
				if(planeacionpagosAux.getId().equals(this.iIdNuevoPlaneacionPagos)) {
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
	
	public int getIndiceActualPlaneacionPagos(PlaneacionPagos planeacionpagos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
				if(planeacionpagosAux.getId().equals(planeacionpagos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionPagos planeacionpagosAux:this.planeacionpagoss) {
				if(planeacionpagosAux.getId().equals(planeacionpagos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPlaneacionPagos(PlaneacionPagos planeacionpagosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
				if(planeacionpagosAux.getPlaneacionPagosOriginal().getId().equals(planeacionpagosOriginal.getId())) {
					existe=true;
					planeacionpagosOriginal.setId(planeacionpagosAux.getId());
					planeacionpagosOriginal.setVersionRow(planeacionpagosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionPagos planeacionpagosAux:this.planeacionpagoss) {
				if(planeacionpagosAux.getPlaneacionPagosOriginal().getId().equals(planeacionpagosOriginal.getId())) {
					existe=true;
					planeacionpagosOriginal.setId(planeacionpagosAux.getId());
					planeacionpagosOriginal.setVersionRow(planeacionpagosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPlaneacionPagos(Boolean esParaCancelar) throws Exception {
		planeacionpagossAux=new ArrayList<PlaneacionPagos>();
		planeacionpagosAux=new PlaneacionPagos();
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
					if(planeacionpagosAux.getId()<0) {
						planeacionpagossAux.add(planeacionpagosAux);
					}		
				}
				this.iIdNuevoPlaneacionPagos=0L;
				this.planeacionpagosLogic.getPlaneacionPagoss().removeAll(planeacionpagossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionPagos planeacionpagosAux:this.planeacionpagoss) {
					if(planeacionpagosAux.getId()<0) {
						planeacionpagossAux.add(planeacionpagosAux);
					}		
				}
				this.iIdNuevoPlaneacionPagos=0L;
				this.planeacionpagoss.removeAll(planeacionpagossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPlaneacionPagos 
					&& this.planeacionpagosLogic.getPlaneacionPagoss().size()>0
					) {
					planeacionpagosAux=this.planeacionpagosLogic.getPlaneacionPagoss().get(this.planeacionpagosLogic.getPlaneacionPagoss().size() - 1);
				
					if(planeacionpagosAux.getId()<0) {
						this.planeacionpagosLogic.getPlaneacionPagoss().remove(planeacionpagosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPlaneacionPagos && this.planeacionpagoss.size()>0) {
					planeacionpagosAux=this.planeacionpagoss.get(this.planeacionpagoss.size() - 1);
				
					if(planeacionpagosAux.getId()<0) {
						this.planeacionpagoss.remove(planeacionpagosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPlaneacionPagos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(planeacionpagos.getId()<0) {
				this.planeacionpagosLogic.getPlaneacionPagoss().remove(this.planeacionpagos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(planeacionpagos.getId()<0) {
				this.planeacionpagoss.remove(this.planeacionpagos);
			}
		}			
	}
	
	public void setEstadosInicialesPlaneacionPagos(List<PlaneacionPagos> planeacionpagossAux) throws Exception {
		PlaneacionPagosConstantesFunciones.setEstadosInicialesPlaneacionPagos(planeacionpagossAux);
	}
	
	public void setEstadosInicialesPlaneacionPagos(PlaneacionPagos planeacionpagosAux) throws Exception {
		PlaneacionPagosConstantesFunciones.setEstadosInicialesPlaneacionPagos(planeacionpagosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPlaneacionPagosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPlaneacionPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPlaneacionPagosActual()) {
				if(!this.isEsNuevoPlaneacionPagos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPlaneacionPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPlaneacionPagos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPlaneacionPagosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Planeacion Pagos ?", "MANTENIMIENTO DE Planeacion Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPlaneacionPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PlaneacionPagos planeacionpagos) throws Exception {
		PlaneacionPagosConstantesFunciones.seleccionarAsignar(this.planeacionpagos,planeacionpagos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPlaneacionPagos=this.isPermisoActualizarOriginalPlaneacionPagos;
			
			
			this.seleccionarAsignar(planeacionpagos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPlaneacionPagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.planeacionpagosSessionBean.setsFuncionBusquedaRapida(this.planeacionpagosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPlaneacionPagos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPlaneacionPagos(esParaCancelar);				
				this.cancelarNuevoPlaneacionPagos(esParaCancelar);								
			}
			
			this.planeacionpagos=new PlaneacionPagos();
			
			this.inicializarPlaneacionPagos();
			
			this.actualizarEstadoCeldasBotonesPlaneacionPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPlaneacionPagos() throws Exception {
		try {
			PlaneacionPagosConstantesFunciones.inicializarPlaneacionPagos(this.planeacionpagos);
			
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
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.planeacionpagosLogic.getPlaneacionPagoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePlaneacionPagoss(String sAccionBusqueda,List<PlaneacionPagos> planeacionpagossParaReportes) throws Exception {
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
					sPathReporteFinal="PlaneacionPagos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PlaneacionPagosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PlaneacionPagosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PlaneacionPagos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Planeacion Pagoses");		
		parameters.put("busquedapor", PlaneacionPagosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePlaneacionPagos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PlaneacionPagosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PlaneacionPagosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePlaneacionPagos=new JRBeanArrayDataSource(PlaneacionPagosJInternalFrame.TraerPlaneacionPagosBeans(planeacionpagossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePlaneacionPagos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PlaneacionPagosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PlaneacionPagosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PlaneacionPagosBean.TraerPlaneacionPagosBeans(planeacionpagossParaReportes).toArray()));
							
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
				this.generarExcelReportePlaneacionPagoss(sAccionBusqueda,sTipoArchivoReporte,planeacionpagossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPlaneacionPagoss(sAccionBusqueda,sTipoArchivoReporte,planeacionpagossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPlaneacionPagosActionPerformed(null);
					//this.generarExcelReportePlaneacionPagoss(sAccionBusqueda,sTipoArchivoReporte,planeacionpagossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPlaneacionPagoss(sAccionBusqueda,sTipoArchivoReporte,planeacionpagossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPlaneacionPagoss(sAccionBusqueda,sTipoArchivoReporte,planeacionpagossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPlaneacionPagoss(sAccionBusqueda,sTipoArchivoReporte,planeacionpagossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePlaneacionPagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaneacionPagos> planeacionpagossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaneacionPagoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlaneacionPagos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PlaneacionPagos planeacionpagos : planeacionpagossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PlaneacionPagosConstantesFunciones.generarExcelReporteDataPlaneacionPagos("NORMAL",row,workbook,planeacionpagos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPlaneacionPagos(String sTipo,Row row,Workbook workbook) {
		
		PlaneacionPagosConstantesFunciones.generarExcelReporteHeaderPlaneacionPagos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPlaneacionPagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaneacionPagos> planeacionpagossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaneacionPagoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PlaneacionPagos planeacionpagos : planeacionpagossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PlaneacionPagosConstantesFunciones.getPlaneacionPagosDescripcion(planeacionpagos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getfecha_pago_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getfecha_pago_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getfecha_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getfecha_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionPagosConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacionpagos.getsaldo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPlaneacionPagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaneacionPagos> planeacionpagossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PlaneacionPagos> planeacionpagossRespaldo=null;
		
		classes=PlaneacionPagosConstantesFunciones.getClassesRelationshipsOfPlaneacionPagos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.planeacionpagosLogic.setDatosCliente(this.datosCliente);
		this.planeacionpagosLogic.setDatosDeep(this.datosDeep);
		this.planeacionpagosLogic.setIsConDeep(true);
		
		planeacionpagossRespaldo=this.planeacionpagosLogic.getPlaneacionPagoss();
		
		this.planeacionpagosLogic.setPlaneacionPagoss(planeacionpagossParaReportes);	
		this.planeacionpagosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		planeacionpagossParaReportes=this.planeacionpagosLogic.getPlaneacionPagoss();
		this.planeacionpagosLogic.setPlaneacionPagoss(planeacionpagossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaneacionPagoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlaneacionPagos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PlaneacionPagos planeacionpagos : planeacionpagossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPlaneacionPagos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PlaneacionPagosConstantesFunciones.generarExcelReporteDataPlaneacionPagos("NORMAL",row,workbook,planeacionpagos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PlaneacionPagosConstantesFunciones.getPlaneacionPagosDescripcion(planeacionpagos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPlaneacionPagos() throws Exception {		
		this.startProcessPlaneacionPagos(true);
	}
	
	public void startProcessPlaneacionPagos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPlaneacionPagos ,this.jPanelParametrosReportesPlaneacionPagos, this.jScrollPanelDatosPlaneacionPagos,this.jPanelPaginacionPlaneacionPagos, this.jScrollPanelDatosEdicionPlaneacionPagos, this.jPanelAccionesPlaneacionPagos,this.jPanelAccionesFormularioPlaneacionPagos,this.jmenuBarPlaneacionPagos,this.jmenuBarDetallePlaneacionPagos,this.jTtoolBarPlaneacionPagos,this.jTtoolBarDetallePlaneacionPagos);		
		
		final JTabbedPane jTabbedPaneBusquedasPlaneacionPagos=this.jTabbedPaneBusquedasPlaneacionPagos; 
		
		final JPanel jPanelParametrosReportesPlaneacionPagos=this.jPanelParametrosReportesPlaneacionPagos;
		//final JScrollPane jScrollPanelDatosPlaneacionPagos=this.jScrollPanelDatosPlaneacionPagos;
		final JTable jTableDatosPlaneacionPagos=this.jTableDatosPlaneacionPagos;		
		final JPanel jPanelPaginacionPlaneacionPagos=this.jPanelPaginacionPlaneacionPagos;
		//final JScrollPane jScrollPanelDatosEdicionPlaneacionPagos=this.jScrollPanelDatosEdicionPlaneacionPagos;
		final JPanel jPanelAccionesPlaneacionPagos=this.jPanelAccionesPlaneacionPagos;
		
		JPanel jPanelCamposAuxiliarPlaneacionPagos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPlaneacionPagos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			jPanelCamposAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jPanelCamposPlaneacionPagos;
			jPanelAccionesFormularioAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jPanelAccionesFormularioPlaneacionPagos;
		}
		
		final JPanel jPanelCamposPlaneacionPagos=jPanelCamposAuxiliarPlaneacionPagos;
		final JPanel jPanelAccionesFormularioPlaneacionPagos=jPanelAccionesFormularioAuxiliarPlaneacionPagos;
		
		
		final JMenuBar jmenuBarPlaneacionPagos=this.jmenuBarPlaneacionPagos;
		final JToolBar jTtoolBarPlaneacionPagos=this.jTtoolBarPlaneacionPagos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPlaneacionPagos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlaneacionPagos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			jmenuBarDetalleAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jmenuBarDetallePlaneacionPagos;
			jTtoolBarDetalleAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jTtoolBarDetallePlaneacionPagos;
		}
		
		final JMenuBar jmenuBarDetallePlaneacionPagos=jmenuBarDetalleAuxiliarPlaneacionPagos;
		final JToolBar jTtoolBarDetallePlaneacionPagos=jTtoolBarDetalleAuxiliarPlaneacionPagos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlaneacionPagos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlaneacionPagos;
			processRunnable.jTableDatos=jTableDatosPlaneacionPagos;
			processRunnable.jPanelCampos=jPanelCamposPlaneacionPagos;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlaneacionPagos;
			processRunnable.jPanelAcciones=jPanelAccionesPlaneacionPagos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlaneacionPagos;
			
			
			processRunnable.jmenuBar=jmenuBarPlaneacionPagos;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlaneacionPagos;
			processRunnable.jTtoolBar=jTtoolBarPlaneacionPagos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlaneacionPagos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlaneacionPagos ,jPanelParametrosReportesPlaneacionPagos,jTableDatosPlaneacionPagos, /*jScrollPanelDatosPlaneacionPagos,*/jPanelCamposPlaneacionPagos,jPanelPaginacionPlaneacionPagos, /*jScrollPanelDatosEdicionPlaneacionPagos,*/ jPanelAccionesPlaneacionPagos,jPanelAccionesFormularioPlaneacionPagos,jmenuBarPlaneacionPagos,jmenuBarDetallePlaneacionPagos,jTtoolBarPlaneacionPagos,jTtoolBarDetallePlaneacionPagos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlaneacionPagos ,jPanelParametrosReportesPlaneacionPagos, jScrollPanelDatosPlaneacionPagos,jPanelPaginacionPlaneacionPagos, jScrollPanelDatosEdicionPlaneacionPagos, jPanelAccionesPlaneacionPagos,jPanelAccionesFormularioPlaneacionPagos,jmenuBarPlaneacionPagos,jmenuBarDetallePlaneacionPagos,jTtoolBarPlaneacionPagos,jTtoolBarDetallePlaneacionPagos);
						
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
	
	public void finishProcessPlaneacionPagos() {// throws Exception 
		this.finishProcessPlaneacionPagos(true);
	}
	
	public void finishProcessPlaneacionPagos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPlaneacionPagos ,this.jPanelParametrosReportesPlaneacionPagos, this.jScrollPanelDatosPlaneacionPagos,this.jPanelPaginacionPlaneacionPagos, this.jScrollPanelDatosEdicionPlaneacionPagos, this.jPanelAccionesPlaneacionPagos,this.jPanelAccionesFormularioPlaneacionPagos,this.jmenuBarPlaneacionPagos,this.jmenuBarDetallePlaneacionPagos,this.jTtoolBarPlaneacionPagos,this.jTtoolBarDetallePlaneacionPagos);		
		
		final JTabbedPane jTabbedPaneBusquedasPlaneacionPagos=this.jTabbedPaneBusquedasPlaneacionPagos; 
		
		final JPanel jPanelParametrosReportesPlaneacionPagos=this.jPanelParametrosReportesPlaneacionPagos;
		//final JScrollPane jScrollPanelDatosPlaneacionPagos=this.jScrollPanelDatosPlaneacionPagos;
		final JTable jTableDatosPlaneacionPagos=this.jTableDatosPlaneacionPagos;		
		final JPanel jPanelPaginacionPlaneacionPagos=this.jPanelPaginacionPlaneacionPagos;
		//final JScrollPane jScrollPanelDatosEdicionPlaneacionPagos=this.jScrollPanelDatosEdicionPlaneacionPagos;
		final JPanel jPanelAccionesPlaneacionPagos=this.jPanelAccionesPlaneacionPagos;
		
		JPanel jPanelCamposAuxiliarPlaneacionPagos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPlaneacionPagos=new JPanel();
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			jPanelCamposAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jPanelCamposPlaneacionPagos;
			jPanelAccionesFormularioAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jPanelAccionesFormularioPlaneacionPagos;
		}
		
		final JPanel jPanelCamposPlaneacionPagos=jPanelCamposAuxiliarPlaneacionPagos;
		final JPanel jPanelAccionesFormularioPlaneacionPagos=jPanelAccionesFormularioAuxiliarPlaneacionPagos;
		
		
		final JMenuBar jmenuBarPlaneacionPagos=this.jmenuBarPlaneacionPagos;		
		final JToolBar jTtoolBarPlaneacionPagos=this.jTtoolBarPlaneacionPagos;
				
		JMenuBar jmenuBarDetalleAuxiliarPlaneacionPagos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlaneacionPagos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			jmenuBarDetalleAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jmenuBarDetallePlaneacionPagos;
			jTtoolBarDetalleAuxiliarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jTtoolBarDetallePlaneacionPagos;		
		}
		
		final JMenuBar jmenuBarDetallePlaneacionPagos=jmenuBarDetalleAuxiliarPlaneacionPagos;
		final JToolBar jTtoolBarDetallePlaneacionPagos=jTtoolBarDetalleAuxiliarPlaneacionPagos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlaneacionPagos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlaneacionPagos;
			processRunnable.jTableDatos=jTableDatosPlaneacionPagos;
			processRunnable.jPanelCampos=jPanelCamposPlaneacionPagos;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlaneacionPagos;
			processRunnable.jPanelAcciones=jPanelAccionesPlaneacionPagos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlaneacionPagos;
			
			
			processRunnable.jmenuBar=jmenuBarPlaneacionPagos;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlaneacionPagos;
			processRunnable.jTtoolBar=jTtoolBarPlaneacionPagos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlaneacionPagos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPlaneacionPagos ,jPanelParametrosReportesPlaneacionPagos, jTableDatosPlaneacionPagos,/*jScrollPanelDatosPlaneacionPagos,*/jPanelCamposPlaneacionPagos,jPanelPaginacionPlaneacionPagos, /*jScrollPanelDatosEdicionPlaneacionPagos,*/ jPanelAccionesPlaneacionPagos,jPanelAccionesFormularioPlaneacionPagos,jmenuBarPlaneacionPagos,jmenuBarDetallePlaneacionPagos,jTtoolBarPlaneacionPagos,jTtoolBarDetallePlaneacionPagos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPlaneacionPagos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPlaneacionPagos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPlaneacionPagos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPlaneacionPagos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPlaneacionPagos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePlaneacionPagos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPlaneacionPagos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPlaneacionPagos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePlaneacionPagos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.planeacionpagosConstantesFunciones.getsFinalQueryPlaneacionPagos();
		String  finalQueryPaginacionTodos=this.planeacionpagosConstantesFunciones.getsFinalQueryPlaneacionPagos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PlaneacionPagosConstantesFunciones.getArrayColumnasGlobalesNoPlaneacionPagos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PlaneacionPagosConstantesFunciones.getArrayColumnasGlobalesPlaneacionPagos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PlaneacionPagosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.planeacionpagossEliminados= new ArrayList<PlaneacionPagos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPlaneacionPagos();
		
				///*PlaneacionPagosSessionBean*/this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
			
			if(this.planeacionpagosSessionBean==null) {
				this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
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
					this.iNumeroPaginacion=PlaneacionPagosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PlaneacionPagosConstantesFunciones.getClassesForeignKeysOfPlaneacionPagos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/planeacionpagos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			planeacionpagossAux= new ArrayList<PlaneacionPagos>();
			
				
			planeacionpagosLogic.setDatosCliente(this.datosCliente);
			planeacionpagosLogic.setDatosDeep(this.datosDeep);
			planeacionpagosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPlaneacionPagos")) {
				this.sDetalleReporte=PlaneacionPagosConstantesFunciones.getDetalleIndiceBusquedaPlaneacionPagos(id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacionpagosLogic.getPlaneacionPagossBusquedaPlaneacionPagos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionPagosConstantesFunciones.getDetalleIndiceBusquedaPlaneacionPagos(id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionPagosConstantesFunciones.getDetalleIndiceBusquedaPlaneacionPagos(id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacionpagosLogic.getPlaneacionPagoss()==null||planeacionpagosLogic.getPlaneacionPagoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacionpagoss==null|| planeacionpagoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacionpagossAux=new ArrayList<PlaneacionPagos>();
						planeacionpagossAux.addAll(planeacionpagosLogic.getPlaneacionPagoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacionpagossAux=new ArrayList<PlaneacionPagos>();
							planeacionpagossAux.addAll(planeacionpagoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacionpagosLogic.getPlaneacionPagossBusquedaPlaneacionPagos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionPagosConstantesFunciones.getDetalleIndiceBusquedaPlaneacionPagos(id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionPagosConstantesFunciones.getDetalleIndiceBusquedaPlaneacionPagos(id_grupo_clienteBusquedaPlaneacionPagos,fecha_pago_inicioBusquedaPlaneacionPagos,fecha_pago_finBusquedaPlaneacionPagos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionPagoss("BusquedaPlaneacionPagos",planeacionpagosLogic.getPlaneacionPagoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionPagoss("BusquedaPlaneacionPagos",planeacionpagoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacionpagosLogic.setPlaneacionPagoss(new ArrayList<PlaneacionPagos>());
						planeacionpagosLogic.getPlaneacionPagoss().addAll(planeacionpagossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacionpagoss=new ArrayList<PlaneacionPagos>();
							planeacionpagoss.addAll(planeacionpagossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPlaneacionPagos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPlaneacionPagos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planeacionpagosLogic.getPlaneacionPagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planeacionpagoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planeacionpagosLogic.getPlaneacionPagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planeacionpagoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PlaneacionPagos planeacionpagos) {
		Boolean permite=true;
		
		if(this.planeacionpagos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PlaneacionPagosConstantesFunciones.getOrderByListaPlaneacionPagos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PlaneacionPagosConstantesFunciones.getOrderByListaPlaneacionPagos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionPagos planeacionpagos:planeacionpagosLogic.getPlaneacionPagoss()) {
				if(planeacionpagos.getsType().equals(Constantes2.S_TOTALES)) {
					planeacionpagosTotales=planeacionpagos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionPagos planeacionpagos:this.planeacionpagoss) {
				if(planeacionpagos.getsType().equals(Constantes2.S_TOTALES)) {
					planeacionpagosTotales=planeacionpagos;
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
			this.planeacionpagosAux=new PlaneacionPagos();
			this.planeacionpagosAux.setsType(Constantes2.S_TOTALES);
			this.planeacionpagosAux.setIsNew(false);
			this.planeacionpagosAux.setIsChanged(false);
			this.planeacionpagosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PlaneacionPagosConstantesFunciones.TotalizarValoresFilaPlaneacionPagos(this.planeacionpagosLogic.getPlaneacionPagoss(),this.planeacionpagosAux);
				
				//this.planeacionpagosLogic.getPlaneacionPagoss().add(this.planeacionpagosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PlaneacionPagosConstantesFunciones.TotalizarValoresFilaPlaneacionPagos(this.planeacionpagoss,this.planeacionpagosAux);
				
				this.planeacionpagoss.add(this.planeacionpagosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		planeacionpagosTotales=new PlaneacionPagos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planeacionpagosLogic.getPlaneacionPagoss().remove(planeacionpagosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planeacionpagoss.remove(planeacionpagosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		planeacionpagosTotales=new PlaneacionPagos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionPagos planeacionpagos:planeacionpagosLogic.getPlaneacionPagoss()) {
				if(planeacionpagos.getsType().equals(Constantes2.S_TOTALES)) {
					planeacionpagosTotales=planeacionpagos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlaneacionPagosConstantesFunciones.TotalizarValoresFilaPlaneacionPagos(this.planeacionpagosLogic.getPlaneacionPagoss(),planeacionpagosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionPagos planeacionpagos:this.planeacionpagoss) {
				if(planeacionpagos.getsType().equals(Constantes2.S_TOTALES)) {
					planeacionpagosTotales=planeacionpagos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlaneacionPagosConstantesFunciones.TotalizarValoresFilaPlaneacionPagos(this.planeacionpagoss,planeacionpagosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPlaneacionPagossBusquedaPlaneacionPagos()throws Exception {
		try {
			sAccionBusqueda="BusquedaPlaneacionPagos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionPagossFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionPagossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionPagossFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionPagossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPlaneacionPagossBusquedaPlaneacionPagos(String sFinalQuery,Long id_grupo_cliente,Date fecha_pago_inicio,Date fecha_pago_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//planeacionpagosLogic.getPlaneacionPagossBusquedaPlaneacionPagos(sFinalQuery,this.pagination,id_grupo_cliente,fecha_pago_inicio,fecha_pago_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionPagossFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//planeacionpagosLogic.getPlaneacionPagossFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionPagossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//planeacionpagosLogic.getPlaneacionPagossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionPagossFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//planeacionpagosLogic.getPlaneacionPagossFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionPagossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//planeacionpagosLogic.getPlaneacionPagossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
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
	
	public void inicializarPermisosPlaneacionPagos() {
		this.isPermisoTodoPlaneacionPagos=false;
		this.isPermisoNuevoPlaneacionPagos=false;
		this.isPermisoActualizarPlaneacionPagos=false;
		this.isPermisoActualizarOriginalPlaneacionPagos=false;
		this.isPermisoEliminarPlaneacionPagos=false;
		this.isPermisoGuardarCambiosPlaneacionPagos=false;
		this.isPermisoConsultaPlaneacionPagos=true;
		this.isPermisoBusquedaPlaneacionPagos=true;
		this.isPermisoReportePlaneacionPagos=true;
		this.isPermisoOrdenPlaneacionPagos=false;		
		this.isPermisoPaginacionMedioPlaneacionPagos=false;		
		this.isPermisoPaginacionAltoPlaneacionPagos=false;		
		this.isPermisoPaginacionTodoPlaneacionPagos=false;		
		this.isPermisoCopiarPlaneacionPagos=false;		
		this.isPermisoVerFormPlaneacionPagos=false;		
		this.isPermisoDuplicarPlaneacionPagos=false;
		this.isPermisoOrdenPlaneacionPagos=false;
	}
	
	public void setPermisosUsuarioPlaneacionPagos(Boolean isPermiso) {
		this.isPermisoTodoPlaneacionPagos=isPermiso;
		this.isPermisoNuevoPlaneacionPagos=isPermiso;
		this.isPermisoActualizarPlaneacionPagos=isPermiso;
		this.isPermisoActualizarOriginalPlaneacionPagos=isPermiso;
		this.isPermisoEliminarPlaneacionPagos=isPermiso;
		this.isPermisoGuardarCambiosPlaneacionPagos=isPermiso;
		this.isPermisoConsultaPlaneacionPagos=isPermiso;
		this.isPermisoBusquedaPlaneacionPagos=isPermiso;
		this.isPermisoReportePlaneacionPagos=isPermiso;
		this.isPermisoOrdenPlaneacionPagos=isPermiso;		
		this.isPermisoPaginacionMedioPlaneacionPagos=isPermiso;		
		this.isPermisoPaginacionAltoPlaneacionPagos=isPermiso;		
		this.isPermisoPaginacionTodoPlaneacionPagos=isPermiso;		
		this.isPermisoCopiarPlaneacionPagos=isPermiso;		
		this.isPermisoVerFormPlaneacionPagos=isPermiso;		
		this.isPermisoDuplicarPlaneacionPagos=isPermiso;
		this.isPermisoOrdenPlaneacionPagos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPlaneacionPagos(Boolean isPermiso) {
		//this.isPermisoTodoPlaneacionPagos=isPermiso;
		this.isPermisoNuevoPlaneacionPagos=isPermiso;
		this.isPermisoActualizarPlaneacionPagos=isPermiso;
		this.isPermisoActualizarOriginalPlaneacionPagos=isPermiso;
		this.isPermisoEliminarPlaneacionPagos=isPermiso;
		this.isPermisoGuardarCambiosPlaneacionPagos=isPermiso;
		//this.isPermisoConsultaPlaneacionPagos=isPermiso;
		//this.isPermisoBusquedaPlaneacionPagos=isPermiso;
		//this.isPermisoReportePlaneacionPagos=isPermiso;
		//this.isPermisoOrdenPlaneacionPagos=isPermiso;		
		//this.isPermisoPaginacionMedioPlaneacionPagos=isPermiso;		
		//this.isPermisoPaginacionAltoPlaneacionPagos=isPermiso;		
		//this.isPermisoPaginacionTodoPlaneacionPagos=isPermiso;		
		//this.isPermisoCopiarPlaneacionPagos=isPermiso;		
		//this.isPermisoDuplicarPlaneacionPagos=isPermiso;
		//this.isPermisoOrdenPlaneacionPagos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPlaneacionPagosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PlaneacionPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPlaneacionPagos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPlaneacionPagosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPlaneacionPagosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPlaneacionPagosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPlaneacionPagosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPlaneacionPagos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PlaneacionPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PlaneacionPagosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPlaneacionPagos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPlaneacionPagos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPlaneacionPagos=this.isPermisoActualizarPlaneacionPagos;
			this.isPermisoEliminarPlaneacionPagos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPlaneacionPagos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPlaneacionPagos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPlaneacionPagos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPlaneacionPagos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePlaneacionPagos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlaneacionPagos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPlaneacionPagos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPlaneacionPagos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPlaneacionPagos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPlaneacionPagos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPlaneacionPagos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPlaneacionPagos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlaneacionPagos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPlaneacionPagos.setToolTipText(this.jTableDatosPlaneacionPagos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPlaneacionPagos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPlaneacionPagos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PlaneacionPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PlaneacionPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPlaneacionPagos() throws Exception {
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
	public void inicializarCombosForeignKeyPlaneacionPagosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPlaneacionPagosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PlaneacionPagosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPlaneacionPagos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.planeacionpagosSessionBean==null) {
				this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
			}

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.planeacionpagosSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyPlaneacionPagos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPlaneacionPagos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPlaneacionPagos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlaneacionPagos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPlaneacionPagos(PlaneacionPagos planeacionpagos)throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(planeacionpagos.getid_factura(),false,"Formulario");
			this.setActualClienteForeignKey(planeacionpagos.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPlaneacionPagos(PlaneacionPagos planeacionpagos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPlaneacionPagos()throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(this.planeacionpagosConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualClienteForeignKey(this.planeacionpagosConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPlaneacionPagos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPlaneacionPagos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPlaneacionPagos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPlaneacionPagos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPlaneacionPagos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPlaneacionPagos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPlaneacionPagos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public PlaneacionPagosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PlaneacionPagosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PlaneacionPagosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean(); 
		this.planeacionpagosConstantesFunciones=new PlaneacionPagosConstantesFunciones(); 
		this.planeacionpagosBean=new PlaneacionPagos();//(this.planeacionpagosConstantesFunciones); 		
		this.planeacionpagosReturnGeneral=new PlaneacionPagosParameterReturnGeneral(); 
		
		this.planeacionpagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planeacionpagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PlaneacionPagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PlaneacionPagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PlaneacionPagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPlaneacionPagos(true);
			
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
			
			this.planeacionpagosConstantesFunciones=new PlaneacionPagosConstantesFunciones(); 
			this.planeacionpagosBean=new PlaneacionPagos();//this.planeacionpagosConstantesFunciones); 			
			this.planeacionpagosReturnGeneral=new PlaneacionPagosParameterReturnGeneral(); 
		
			PlaneacionPagosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Planeacion Pagos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.planeacionpagos=new PlaneacionPagos();
			this.planeacionpagoss = new ArrayList<PlaneacionPagos>();
			this.planeacionpagossAux = new ArrayList<PlaneacionPagos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic=new PlaneacionPagosLogic();
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			//this.planeacionpagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.planeacionpagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPlaneacionPagos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlaneacionPagos);	
					}
					
					if(this.jInternalFrameImportacionPlaneacionPagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlaneacionPagos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPlaneacionPagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPlaneacionPagos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPlaneacionPagos);
				this.jInternalFrameDetalleFormPlaneacionPagos.setVisible(false);
				this.jInternalFrameDetalleFormPlaneacionPagos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlaneacionPagos);
					this.jInternalFrameReporteDinamicoPlaneacionPagos.setVisible(false);
					this.jInternalFrameReporteDinamicoPlaneacionPagos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPlaneacionPagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPlaneacionPagos);
					this.jInternalFrameImportacionPlaneacionPagos.setVisible(false);
					this.jInternalFrameImportacionPlaneacionPagos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPlaneacionPagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPlaneacionPagos);
					this.jInternalFrameOrderByPlaneacionPagos.setVisible(false);
					this.jInternalFrameOrderByPlaneacionPagos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPlaneacionPagosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PlaneacionPagosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.planeacionpagosReturnGeneral=new PlaneacionPagosParameterReturnGeneral();
			
			this.planeacionpagosParameterGeneral=new PlaneacionPagosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.planeacionpagosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PlaneacionPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlaneacionPagosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),this.planeacionpagosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlaneacionPagosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),this.planeacionpagosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaDuplicarPlaneacionPagos=true;
			this.isVisibilidadCeldaCopiarPlaneacionPagos=true;
			this.isVisibilidadCeldaVerFormPlaneacionPagos=true;
			this.isVisibilidadCeldaOrdenPlaneacionPagos=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
			this.isVisibilidadCeldaModificarPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
			
			
			this.isVisibilidadBusquedaPlaneacionPagos=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPlaneacionPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPlaneacionPagos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPlaneacionPagos(false);
			
			this.setPermisosUsuarioPlaneacionPagos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado() 
				|| (this.planeacionpagosSessionBean.getEsGuardarRelacionado() && this.planeacionpagosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPlaneacionPagosClasesRelacionadas();
			}
			
			if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPlaneacionPagosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPlaneacionPagos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPlaneacionPagos();
			}
			
			if(!this.isPermisoBusquedaPlaneacionPagos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PlaneacionPagosConstantesFunciones.getTiposSeleccionarPlaneacionPagos());
				
				this.tiposColumnasSelect=PlaneacionPagosConstantesFunciones.getTiposSeleccionarPlaneacionPagos(true);
				
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
			//if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPlaneacionPagos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPlaneacionPagos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPlaneacionPagos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionPagos() ;
			
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
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.facturaLogic=new FacturaLogic();
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
				planeacionpagosImplementable= (PlaneacionPagosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlaneacionPagosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				planeacionpagosImplementableHome= (PlaneacionPagosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlaneacionPagosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.planeacionpagoss= new ArrayList<PlaneacionPagos>();
			this.planeacionpagossEliminados= new ArrayList<PlaneacionPagos>();
						
			this.isEsNuevoPlaneacionPagos=false;
			this.esParaAccionDesdeFormularioPlaneacionPagos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPlaneacionPagos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPlaneacionPagos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PlaneacionPagosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PlaneacionPagosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPlaneacionPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPlaneacionPagos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPlaneacionPagos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPlaneacionPagos();
			}
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPlaneacionPagos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPlaneacionPagos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPlaneacionPagos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPlaneacionPagos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PlaneacionPagos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPlaneacionPagos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPlaneacionPagos")) {
				iIndex=this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPlaneacionPagos();	
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
	
	public void cargarCombosForeignKeyPlaneacionPagos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPlaneacionPagos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPlaneacionPagos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPlaneacionPagosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPlaneacionPagos();
		
		this.cargarCombosFrameForeignKeyPlaneacionPagos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPlaneacionPagos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPlaneacionPagos();
		}
	}
	
	

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

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
	
	public void jButtonNuevoPlaneacionPagosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			
			if(jTableDatosPlaneacionPagos.getRowCount()>=1) {
				jTableDatosPlaneacionPagos.removeRowSelectionInterval(0, jTableDatosPlaneacionPagos.getRowCount()-1);						
			}
			
			this.isEsNuevoPlaneacionPagos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPlaneacionPagos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPlaneacionPagos(true);			
			//this.planeacionpagos=new PlaneacionPagos();
			//this.planeacionpagos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaneacionPagos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionPagos() ;
			
			if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaneacionPagos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.planeacionpagos);	
			this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);				
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PlaneacionPagos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPlaneacionPagosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPlaneacionPagos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPlaneacionPagos.getSelectedRows().length;			
			}
			
			planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPlaneacionPagos--;			
				//PlaneacionPagos planeacionpagosAux= new PlaneacionPagos();			
				//planeacionpagosAux.setId(this.iIdNuevoPlaneacionPagos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PlaneacionPagos planeacionpagosOrigen=new PlaneacionPagos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PlaneacionPagos planeacionpagosOrigen : planeacionpagossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							planeacionpagosOrigen =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacionpagosOrigen =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPlaneacionPagos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.planeacionpagos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPlaneacionPagos(planeacionpagosOrigen,this.planeacionpagos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planeacionpagosLogic.getPlaneacionPagoss().add(this.planeacionpagosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planeacionpagoss.add(this.planeacionpagosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
				
				this.jTableDatosPlaneacionPagos.setRowSelectionInterval(this.getIndiceNuevoPlaneacionPagos(), this.getIndiceNuevoPlaneacionPagos());
				
				int iLastRow =  this.jTableDatosPlaneacionPagos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlaneacionPagos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlaneacionPagos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaneacionPagos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();									
		
			PlaneacionPagos planeacionpagosOrigen=new PlaneacionPagos();
			PlaneacionPagos planeacionpagosDestino=new PlaneacionPagos();
				
			planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPlaneacionPagos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || planeacionpagossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPlaneacionPagos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacionpagosOrigen =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planeacionpagosOrigen =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacionpagosDestino =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planeacionpagosDestino =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				planeacionpagosOrigen =planeacionpagossSeleccionados.get(0);
				planeacionpagosDestino =planeacionpagossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPlaneacionPagos(planeacionpagosOrigen,planeacionpagosDestino,true,false);
				
				planeacionpagosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planeacionpagosDestino,planeacionpagosLogic.getPlaneacionPagoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planeacionpagosDestino,planeacionpagoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
				
				//this.jTableDatosPlaneacionPagos.setRowSelectionInterval(this.getIndiceNuevoPlaneacionPagos(), this.getIndiceNuevoPlaneacionPagos());
				
				int iLastRow =  this.jTableDatosPlaneacionPagos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlaneacionPagos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlaneacionPagos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaneacionPagos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPlaneacionPagos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPlaneacionPagos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPlaneacionPagos.setVisible(!isVisible);
			this.jPanelPaginacionPlaneacionPagos.setVisible(!isVisible);
			this.jPanelAccionesPlaneacionPagos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePlaneacionPagos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPlaneacionPagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPlaneacionPagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPlaneacionPagos();
			
			this.abrirFrameOrderByPlaneacionPagos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPlaneacionPagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePlaneacionPagos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlaneacionPagos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPlaneacionPagos.isMaximum()) {
					this.jInternalFrameDetalleFormPlaneacionPagos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPlaneacionPagos.setSize(this.jInternalFrameDetalleFormPlaneacionPagos.iWidthFormulario,this.jInternalFrameDetalleFormPlaneacionPagos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPlaneacionPagos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPlaneacionPagos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPlaneacionPagos.isMaximum()) {
						this.jInternalFrameDetalleFormPlaneacionPagos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPlaneacionPagos.jContentPaneDetallePlaneacionPagos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPlaneacionPagos.jContentPaneDetallePlaneacionPagos.getWidth(),PlaneacionPagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPlaneacionPagos.jContentPaneDetallePlaneacionPagos.getWidth(),PlaneacionPagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPlaneacionPagos.jContentPaneDetallePlaneacionPagos.getWidth(),PlaneacionPagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPlaneacionPagos.setVisible(true);
	        this.jInternalFrameDetalleFormPlaneacionPagos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPlaneacionPagos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPlaneacionPagos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPlaneacionPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionPagos,false,this);
				} else {
					this.jInternalFrameOrderByPlaneacionPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionPagos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPlaneacionPagos);
				this.jInternalFrameOrderByPlaneacionPagos.setVisible(false);
				this.jInternalFrameOrderByPlaneacionPagos.setSelected(false);
				
				this.jInternalFrameOrderByPlaneacionPagos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlaneacionPagos"));
				
				this.inicializarActualizarBindingTablaOrderByPlaneacionPagos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPlaneacionPagos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPlaneacionPagos==null) {
				
				this.jInternalFrameImportacionPlaneacionPagos=new ImportacionJInternalFrame(PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlaneacionPagos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPlaneacionPagos);
				this.jInternalFrameImportacionPlaneacionPagos.setVisible(false);
				this.jInternalFrameImportacionPlaneacionPagos.setSelected(false);


				this.jInternalFrameImportacionPlaneacionPagos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlaneacionPagos"));
				this.jInternalFrameImportacionPlaneacionPagos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlaneacionPagos"));
				this.jInternalFrameImportacionPlaneacionPagos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlaneacionPagos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPlaneacionPagos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPlaneacionPagos==null) {
				this.jInternalFrameReporteDinamicoPlaneacionPagos=new ReporteDinamicoJInternalFrame(PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlaneacionPagos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlaneacionPagos);
				this.jInternalFrameReporteDinamicoPlaneacionPagos.setVisible(false);
				this.jInternalFrameReporteDinamicoPlaneacionPagos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaneacionPagos"));
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaneacionPagos"));
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaneacionPagos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaneacionPagos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePlaneacionPagos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlaneacionPagos);
			
	       	this.jInternalFrameDetalleFormPlaneacionPagos.setVisible(false);
	        this.jInternalFrameDetalleFormPlaneacionPagos.setSelected(false);
			
			//this.jInternalFrameDetalleFormPlaneacionPagos.dispose();
			//this.jInternalFrameDetalleFormPlaneacionPagos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPlaneacionPagos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPlaneacionPagos.setVisible(true);
	        this.jInternalFrameReporteDinamicoPlaneacionPagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPlaneacionPagos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPlaneacionPagos.setVisible(true);
	        this.jInternalFrameImportacionPlaneacionPagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPlaneacionPagos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPlaneacionPagos.setVisible(true);
	        this.jInternalFrameOrderByPlaneacionPagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPlaneacionPagos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPlaneacionPagos.setVisible(false);
	        this.jInternalFrameOrderByPlaneacionPagos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPlaneacionPagos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPlaneacionPagos.setVisible(false);
	        this.jInternalFrameReporteDinamicoPlaneacionPagos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPlaneacionPagos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPlaneacionPagos.setVisible(false);
	        this.jInternalFrameImportacionPlaneacionPagos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPlaneacionPagos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPlaneacionPagos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPlaneacionPagos(true);
			//this.isEsNuevoPlaneacionPagos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPlaneacionPagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaneacionPagos(false) ;
			
			if(planeacionpagosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaneacionPagos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionPagos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPlaneacionPagosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPlaneacionPagos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPlaneacionPagos(true);
			//this.isEsNuevoPlaneacionPagos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.planeacionpagos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPlaneacionPagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPlaneacionPagos(false) ;
			
			if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaneacionPagos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionPagos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionPagos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionPagos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionPagos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPlaneacionPagos(false);
			
			//if(!this.isEsNuevoPlaneacionPagos) {								
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				
			}
			
			if(this.permiteMantenimiento(this.planeacionpagos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPlaneacionPagos=true;
					this.inicializarActualizarBindingTablaPlaneacionPagos(false);
					this.isEsNuevoPlaneacionPagos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPlaneacionPagos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPlaneacionPagos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlaneacionPagos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaneacionPagos(false);
				
				this.habilitarDeshabilitarControlesPlaneacionPagos(false);
			
												
				
				if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePlaneacionPagos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPlaneacionPagosActionPerformed(evt,planeacionpagosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPlaneacionPagos(this.planeacionpagos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPlaneacionPagos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,planeacionpagosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.planeacionpagos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				this.planeacionpagos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				this.planeacionpagos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.planeacionpagos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PlaneacionPagosModel) this.jTableDatosPlaneacionPagos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPlaneacionPagos=true;
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
				this.isEsNuevoPlaneacionPagos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlaneacionPagos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaneacionPagos(false);
				
				this.habilitarDeshabilitarControlesPlaneacionPagos(false);
				
				
				
				if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePlaneacionPagos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPlaneacionPagos.getRowCount()>=1) {
				jTableDatosPlaneacionPagos.removeRowSelectionInterval(0, jTableDatosPlaneacionPagos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPlaneacionPagos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaneacionPagos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionPagos(false) ;
			
			this.isEsNuevoPlaneacionPagos=false;
			
			if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePlaneacionPagos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPlaneacionPagos(false);
				
				//SI ES MANUAL
				if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPlaneacionPagos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPlaneacionPagos--;			
			//PlaneacionPagos planeacionpagosAux= new PlaneacionPagos();			
			//planeacionpagosAux.setId(this.iIdNuevoPlaneacionPagos);
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPlaneacionPagos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
			
			this.planeacionpagos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.planeacionpagosLogic.getPlaneacionPagoss().add(this.planeacionpagosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.planeacionpagoss.add(this.planeacionpagosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			
			this.jTableDatosPlaneacionPagos.setRowSelectionInterval(this.getIndiceNuevoPlaneacionPagos(), this.getIndiceNuevoPlaneacionPagos());
			
			int iLastRow =  this.jTableDatosPlaneacionPagos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPlaneacionPagos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPlaneacionPagos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPlaneacionPagos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionPagos(false);
			
			//SI ES MANUAL
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaneacionPagos();
			}
			
			//this.abrirFrameTreePlaneacionPagos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPlaneacionPagos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPlaneacionPagos.setFileImportacion(this.jInternalFrameImportacionPlaneacionPagos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPlaneacionPagos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPlaneacionPagos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPlaneacionPagos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPlaneacionPagos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		

		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PlaneacionPagosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PlaneacionPagosBaseDesign.jrxml";
			
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
			
			this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionPagosConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoria="fecha_venta";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoria="fecha_pago";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoriaValor="fecha_venta";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoriaValor="fecha_pago";
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_venta");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pago");
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
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
	
	public void jButtonGenerarExcelReporteDinamicoPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PlaneacionPagoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getfecha_pago_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getfecha_pago_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getfecha_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getfecha_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionPagosConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(PlaneacionPagos planeacionpagos:planeacionpagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacionpagos.getsaldo());
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
			//	this.getFilaCabeceraExportarExcelPlaneacionPagos(row);				
			//	iRow++;
			//}				
			
			//for(PlaneacionPagos planeacionpagosAux:planeacionpagossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPlaneacionPagos(planeacionpagosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
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
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionPagos(false);
			
			//SI ES MANUAL
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaneacionPagos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionPagos(false);
			
			//SI ES MANUAL
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlaneacionPagos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionPagos(false);
			
			//SI ES MANUAL
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlaneacionPagos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPlaneacionPagos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPlaneacionPagos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPlaneacionPagos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPlaneacionPagos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPlaneacionPagos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPlaneacionPagos.setMinimumSize(dimensionMinimum);
		this.jTableDatosPlaneacionPagos.setMaximumSize(dimensionMaximum);
		this.jTableDatosPlaneacionPagos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPlaneacionPagos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPlaneacionPagos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPlaneacionPagos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPlaneacionPagos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPlaneacionPagos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPlaneacionPagos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionPagos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPlaneacionPagos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPlaneacionPagos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPlaneacionPagos();
		
		this.inicializarActualizarBindingBotonesManualPlaneacionPagos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPlaneacionPagos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionPagos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPlaneacionPagos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPlaneacionPagos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPlaneacionPagos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPlaneacionPagos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePlaneacionPagos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPlaneacionPagos.jCheckBoxPostAccionNuevoPlaneacionPagos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPlaneacionPagos.jCheckBoxPostAccionSinCerrarPlaneacionPagos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPlaneacionPagos.jCheckBoxPostAccionSinMensajePlaneacionPagos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPlaneacionPagos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPlaneacionPagos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePlaneacionPagos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
				this.jInternalFrameDetalleFormPlaneacionPagos.jCheckBoxPostAccionNuevoPlaneacionPagos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPlaneacionPagos.jCheckBoxPostAccionSinCerrarPlaneacionPagos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPlaneacionPagos.jCheckBoxPostAccionSinMensajePlaneacionPagos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPlaneacionPagos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPlaneacionPagos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPlaneacionPagos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPlaneacionPagos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPlaneacionPagos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPlaneacionPagos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPlaneacionPagos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPlaneacionPagos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPlaneacionPagos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPlaneacionPagos(Boolean esInicializar) throws Exception {
		try	{	
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPlaneacionPagos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionPagos() throws Exception {
		try	{
			if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPlaneacionPagos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlaneacionPagos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPlaneacionPagos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPlaneacionPagos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPlaneacionPagos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPlaneacionPagos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPlaneacionPagos.addItem(reporte);
			}
			
			
			if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPlaneacionPagos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPlaneacionPagos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPlaneacionPagos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPlaneacionPagos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPlaneacionPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPlaneacionPagos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPlaneacionPagos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaneacionPagos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaneacionPagos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
				
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PlaneacionPagosConstantesFunciones.getTiposSeleccionarPlaneacionPagos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PlaneacionPagosConstantesFunciones.getTiposSeleccionarPlaneacionPagos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PlaneacionPagosConstantesFunciones.getTiposSeleccionarPlaneacionPagos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPlaneacionPagos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPlaneacionPagos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.getSelectedItem()!=null){this.id_grupo_clienteBusquedaPlaneacionPagos=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.getSelectedItem()).getId();}
		this.fecha_pago_inicioBusquedaPlaneacionPagos=new Date(this.jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.getDate().getTime());
		this.fecha_pago_finBusquedaPlaneacionPagos=new Date(this.jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPlaneacionPagos(Boolean esInicializar) throws Exception {				
		if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPlaneacionPagos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPlaneacionPagos() throws Exception {
		this.inicializarActualizarBindingTablaPlaneacionPagos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPlaneacionPagos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPlaneacionPagosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPlaneacionPagos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=planeacionpagosLogic.getPlaneacionPagoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=planeacionpagoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPlaneacionPagos.setModel(new PlaneacionPagosModel(this.planeacionpagosLogic.getPlaneacionPagoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPlaneacionPagos.setModel(new PlaneacionPagosModel(this.planeacionpagoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPlaneacionPagos!=null && this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPlaneacionPagos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO,planeacionpagosConstantesFunciones.resaltarSeleccionarPlaneacionPagos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO,planeacionpagosConstantesFunciones.resaltarSeleccionarPlaneacionPagos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_ID));

		if(this.planeacionpagosConstantesFunciones.mostraridPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planeacionpagosConstantesFunciones.resaltaridPlaneacionPagos,this.planeacionpagosConstantesFunciones.activaridPlaneacionPagos,iSizeTabla,this,true,"idPlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacionpagosConstantesFunciones.resaltaridPlaneacionPagos,this.planeacionpagosConstantesFunciones.activaridPlaneacionPagos,this,true,"idPlaneacionPagos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA));

		if(this.planeacionpagosConstantesFunciones.mostrarid_facturaPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.planeacionpagosConstantesFunciones.resaltarid_facturaPlaneacionPagos,this,this.planeacionpagosConstantesFunciones.activarid_facturaPlaneacionPagos,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.planeacionpagosConstantesFunciones.resaltarid_facturaPlaneacionPagos,this,this.planeacionpagosConstantesFunciones.activarid_facturaPlaneacionPagos,true,"id_facturaPlaneacionPagos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE));

		if(this.planeacionpagosConstantesFunciones.mostrarid_clientePlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.planeacionpagosConstantesFunciones.resaltarid_clientePlaneacionPagos,this,this.planeacionpagosConstantesFunciones.activarid_clientePlaneacionPagos,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.planeacionpagosConstantesFunciones.resaltarid_clientePlaneacionPagos,this,this.planeacionpagosConstantesFunciones.activarid_clientePlaneacionPagos,true,"id_clientePlaneacionPagos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.planeacionpagosConstantesFunciones.mostrarnombre_clientePlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacionpagosConstantesFunciones.resaltarnombre_clientePlaneacionPagos,this.planeacionpagosConstantesFunciones.activarnombre_clientePlaneacionPagos,iSizeTabla,this,true,"nombre_clientePlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacionpagosConstantesFunciones.resaltarnombre_clientePlaneacionPagos,this.planeacionpagosConstantesFunciones.activarnombre_clientePlaneacionPagos,this,true,"nombre_clientePlaneacionPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.planeacionpagosConstantesFunciones.mostrarnumero_facturaPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacionpagosConstantesFunciones.resaltarnumero_facturaPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarnumero_facturaPlaneacionPagos,iSizeTabla,this,true,"numero_facturaPlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacionpagosConstantesFunciones.resaltarnumero_facturaPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarnumero_facturaPlaneacionPagos,this,true,"numero_facturaPlaneacionPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.planeacionpagosConstantesFunciones.mostrarfecha_emisionPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planeacionpagosConstantesFunciones.resaltarfecha_emisionPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarfecha_emisionPlaneacionPagos,iSizeTabla,this,true,"fecha_emisionPlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planeacionpagosConstantesFunciones.resaltarfecha_emisionPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarfecha_emisionPlaneacionPagos,this,true,"fecha_emisionPlaneacionPagos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA));

		if(this.planeacionpagosConstantesFunciones.mostrarfecha_ventaPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planeacionpagosConstantesFunciones.resaltarfecha_ventaPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarfecha_ventaPlaneacionPagos,iSizeTabla,this,true,"fecha_ventaPlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planeacionpagosConstantesFunciones.resaltarfecha_ventaPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarfecha_ventaPlaneacionPagos,this,true,"fecha_ventaPlaneacionPagos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO));

		if(this.planeacionpagosConstantesFunciones.mostrarfecha_pagoPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planeacionpagosConstantesFunciones.resaltarfecha_pagoPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarfecha_pagoPlaneacionPagos,iSizeTabla,this,true,"fecha_pagoPlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planeacionpagosConstantesFunciones.resaltarfecha_pagoPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarfecha_pagoPlaneacionPagos,this,true,"fecha_pagoPlaneacionPagos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,PlaneacionPagosConstantesFunciones.LABEL_SALDO));

		if(this.planeacionpagosConstantesFunciones.mostrarsaldoPlaneacionPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionPagosConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planeacionpagosConstantesFunciones.resaltarsaldoPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarsaldoPlaneacionPagos,iSizeTabla,this,true,"saldoPlaneacionPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacionpagosConstantesFunciones.resaltarsaldoPlaneacionPagos,this.planeacionpagosConstantesFunciones.activarsaldoPlaneacionPagos,this,true,"saldoPlaneacionPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaneacionPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlaneacionPagos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlaneacionPagos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.planeacionpagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPlaneacionPagos.addColumn(tableColumn);
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
			
			this.jTableDatosPlaneacionPagos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPlaneacionPagos.moveColumn(this.jTableDatosPlaneacionPagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPlaneacionPagos.moveColumn(this.jTableDatosPlaneacionPagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPlaneacionPagos.moveColumn(this.jTableDatosPlaneacionPagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPlaneacionPagos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPlaneacionPagos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPlaneacionPagos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPlaneacionPagos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPlaneacionPagos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPlaneacionPagos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPlaneacionPagos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=planeacionpagosLogic.getPlaneacionPagoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=planeacionpagoss.size()-1;
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
		//this.jTableDatosPlaneacionPagos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPlaneacionPagos();
			
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
				
				//this.isEsNuevoPlaneacionPagos=false;
					
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
				if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPlaneacionPagos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlaneacionPagos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlaneacionPagos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.planeacionpagos.getsType().equals("DUPLICADO")
				   || this.planeacionpagos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPlaneacionPagos=true;
				
				} else {
					this.isEsNuevoPlaneacionPagos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
					if(this.planeacionpagos.getId()>=0 && !this.planeacionpagos.getIsNew()) {						
						this.isEsNuevoPlaneacionPagos=false;
						
					} else {
						this.isEsNuevoPlaneacionPagos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPlaneacionPagos(esRelaciones);						
				
				this.seleccionarPlaneacionPagos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.planeacionpagos.getId()<0) {
					this.isEsNuevoPlaneacionPagos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPlaneacionPagos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPlaneacionPagos(evt,rowIndex);
				}	
				
				if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PlaneacionPagos: " + this.dDif); 
					}
				}								
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPlaneacionPagos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.planeacionpagos)) {
					if(this.planeacionpagos.getId()>0) {
						this.planeacionpagos.setIsDeleted(true);
						
						this.planeacionpagossEliminados.add(this.planeacionpagos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planeacionpagosLogic.getPlaneacionPagoss().remove(this.planeacionpagos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planeacionpagoss.remove(this.planeacionpagos);				
					}
					
					
					((PlaneacionPagosModel) this.jTableDatosPlaneacionPagos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaneacionPagos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPlaneacionPagos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPlaneacionPagos) {
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlaneacionPagos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlaneacionPagos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagos);
				}
				
				//ARCHITECTURE
				try {
					

					//Factura
					if(!this.planeacionpagosConstantesFunciones.cargarid_facturaPlaneacionPagos || this.planeacionpagosConstantesFunciones.event_dependid_facturaPlaneacionPagos) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.planeacionpagos.getid_factura());
									//this.inicializarActualizarBindingPlaneacionPagos(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(planeacionpagos.getFactura()!=null) {
							this.facturasForeignKey.add(planeacionpagos.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.planeacionpagos.getid_factura(),false,"Formulario");

					//Cliente
					if(!this.planeacionpagosConstantesFunciones.cargarid_clientePlaneacionPagos || this.planeacionpagosConstantesFunciones.event_dependid_clientePlaneacionPagos) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.planeacionpagos.getid_cliente());
									//this.inicializarActualizarBindingPlaneacionPagos(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(planeacionpagos.getCliente()!=null) {
							this.clientesForeignKey.add(planeacionpagos.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.planeacionpagos.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPlaneacionPagos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPlaneacionPagos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaneacionPagos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlaneacionPagos(PlaneacionPagos planeacionpagos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPlaneacionPagos(planeacionpagos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlaneacionPagos(PlaneacionPagos planeacionpagos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPlaneacionPagos(planeacionpagos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPlaneacionPagos(planeacionpagos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionPagos(planeacionpagos);
	}
	
	public void setVariablesObjetoActualToFormularioPlaneacionPagos(PlaneacionPagos planeacionpagos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setText(planeacionpagos.getId().toString());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setText(planeacionpagos.getnombre_cliente());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setText(planeacionpagos.getnumero_factura());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setDate(planeacionpagos.getfecha_emision());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setDate(planeacionpagos.getfecha_venta());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setDate(planeacionpagos.getfecha_pago());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setText(planeacionpagos.getsaldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PlaneacionPagos planeacionpagosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,planeacionpagosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PlaneacionPagos planeacionpagosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				planeacionpagosLocal=this.planeacionpagos;
			} else {
				planeacionpagosLocal=this.planeacionpagosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(planeacionpagosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPlaneacionPagos(planeacionpagosLocal,true);
					
					if(planeacionpagosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(planeacionpagosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(planeacionpagosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPlaneacionPagos(PlaneacionPagos planeacionpagos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlaneacionPagos(planeacionpagos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(planeacionpagos);
	}
	
	public void setVariablesFormularioToObjetoActualPlaneacionPagos(PlaneacionPagos planeacionpagos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlaneacionPagos(planeacionpagos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPlaneacionPagos(PlaneacionPagos planeacionpagos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.getText()==null || this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.getText()=="" || this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.getText()=="Id") {
				this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setText("0");
			}

			if(conColumnasBase) {planeacionpagos.setId(Long.parseLong(this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelIdPlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacionpagos.setnombre_cliente(this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelnombre_clientePlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacionpagos.setnumero_factura(this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelnumero_facturaPlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacionpagos.setfecha_emision(this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_emisionPlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacionpagos.setfecha_venta(this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_ventaPlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacionpagos.setfecha_pago(this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelfecha_pagoPlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacionpagos.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionPagosConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionPagos.jLabelsaldoPlaneacionPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlaneacionPagos(PlaneacionPagos planeacionpagosBean,PlaneacionPagos planeacionpagos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && planeacionpagosBean.getid_factura()!=null && !planeacionpagosBean.getid_factura().equals(-1L))) {planeacionpagos.setid_factura(planeacionpagosBean.getid_factura());}
			if(conDefault || (!conDefault && planeacionpagosBean.getid_cliente()!=null && !planeacionpagosBean.getid_cliente().equals(-1L))) {planeacionpagos.setid_cliente(planeacionpagosBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPlaneacionPagos(PlaneacionPagos planeacionpagosOrigen,PlaneacionPagos planeacionpagos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planeacionpagosOrigen.getId()!=null && !planeacionpagosOrigen.getId().equals(0L))) {planeacionpagos.setId(planeacionpagosOrigen.getId());}}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getfecha_pago_inicio()!=null && !planeacionpagosOrigen.getfecha_pago_inicio().equals(new Date()))) {planeacionpagos.setfecha_pago_inicio(planeacionpagosOrigen.getfecha_pago_inicio());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getfecha_pago_fin()!=null && !planeacionpagosOrigen.getfecha_pago_fin().equals(new Date()))) {planeacionpagos.setfecha_pago_fin(planeacionpagosOrigen.getfecha_pago_fin());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getid_factura()!=null && !planeacionpagosOrigen.getid_factura().equals(-1L))) {planeacionpagos.setid_factura(planeacionpagosOrigen.getid_factura());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getid_cliente()!=null && !planeacionpagosOrigen.getid_cliente().equals(-1L))) {planeacionpagos.setid_cliente(planeacionpagosOrigen.getid_cliente());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getnombre_cliente()!=null && !planeacionpagosOrigen.getnombre_cliente().equals(""))) {planeacionpagos.setnombre_cliente(planeacionpagosOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getnumero_factura()!=null && !planeacionpagosOrigen.getnumero_factura().equals(""))) {planeacionpagos.setnumero_factura(planeacionpagosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getfecha_emision()!=null && !planeacionpagosOrigen.getfecha_emision().equals(new Date()))) {planeacionpagos.setfecha_emision(planeacionpagosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getfecha_venta()!=null && !planeacionpagosOrigen.getfecha_venta().equals(new Date()))) {planeacionpagos.setfecha_venta(planeacionpagosOrigen.getfecha_venta());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getfecha_pago()!=null && !planeacionpagosOrigen.getfecha_pago().equals(new Date()))) {planeacionpagos.setfecha_pago(planeacionpagosOrigen.getfecha_pago());}
			if(conDefault || (!conDefault && planeacionpagosOrigen.getsaldo()!=null && !planeacionpagosOrigen.getsaldo().equals(0.0))) {planeacionpagos.setsaldo(planeacionpagosOrigen.getsaldo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlaneacionPagos(PlaneacionPagos planeacionpagos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setText(planeacionpagos.getId().toString());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setText(planeacionpagos.getnombre_cliente());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setText(planeacionpagos.getnumero_factura());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setDate(planeacionpagos.getfecha_emision());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setDate(planeacionpagos.getfecha_venta());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setDate(planeacionpagos.getfecha_pago());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setText(planeacionpagos.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlaneacionPagos(PlaneacionPagosBean planeacionpagosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setText(planeacionpagosBean.getId().toString());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setText(planeacionpagosBean.getnombre_cliente());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setText(planeacionpagosBean.getnumero_factura());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setDate(planeacionpagosBean.getfecha_emision());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setDate(planeacionpagosBean.getfecha_venta());
			this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setDate(planeacionpagosBean.getfecha_pago());
			this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setText(planeacionpagosBean.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPlaneacionPagos(PlaneacionPagosParameterReturnGeneral planeacionpagosReturnGeneral,PlaneacionPagosBean planeacionpagosBean,Boolean conDefault) throws Exception { 
		try {
			PlaneacionPagos planeacionpagosLocal=new PlaneacionPagos();
			
			planeacionpagosLocal=planeacionpagosReturnGeneral.getPlaneacionPagos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planeacionpagosLocal.getId()!=null && !planeacionpagosLocal.getId().equals(0L))) {planeacionpagosBean.setId(planeacionpagosLocal.getId());}}
			if(conDefault || (!conDefault && planeacionpagosLocal.getid_factura()!=null && !planeacionpagosLocal.getid_factura().equals(-1L))) {planeacionpagosBean.setid_factura(planeacionpagosLocal.getid_factura());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getid_cliente()!=null && !planeacionpagosLocal.getid_cliente().equals(-1L))) {planeacionpagosBean.setid_cliente(planeacionpagosLocal.getid_cliente());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getnombre_cliente()!=null && !planeacionpagosLocal.getnombre_cliente().equals(""))) {planeacionpagosBean.setnombre_cliente(planeacionpagosLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getnumero_factura()!=null && !planeacionpagosLocal.getnumero_factura().equals(""))) {planeacionpagosBean.setnumero_factura(planeacionpagosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getfecha_emision()!=null && !planeacionpagosLocal.getfecha_emision().equals(new Date()))) {planeacionpagosBean.setfecha_emision(planeacionpagosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getfecha_venta()!=null && !planeacionpagosLocal.getfecha_venta().equals(new Date()))) {planeacionpagosBean.setfecha_venta(planeacionpagosLocal.getfecha_venta());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getfecha_pago()!=null && !planeacionpagosLocal.getfecha_pago().equals(new Date()))) {planeacionpagosBean.setfecha_pago(planeacionpagosLocal.getfecha_pago());}
			if(conDefault || (!conDefault && planeacionpagosLocal.getsaldo()!=null && !planeacionpagosLocal.getsaldo().equals(0.0))) {planeacionpagosBean.setsaldo(planeacionpagosLocal.getsaldo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPlaneacionPagosGenerico(Long idPlaneacionPagosSeleccionado,JComboBox jComboBoxPlaneacionPagos,List<PlaneacionPagos> planeacionpagossLocal)throws Exception {
		try {
			PlaneacionPagos  planeacionpagosTemp=null;

			for(PlaneacionPagos planeacionpagosAux:planeacionpagossLocal) {
				if(planeacionpagosAux.getId()!=null && planeacionpagosAux.getId().equals(idPlaneacionPagosSeleccionado)) {
					planeacionpagosTemp=planeacionpagosAux;
					break;
				}
			}

			jComboBoxPlaneacionPagos.setSelectedItem(planeacionpagosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPlaneacionPagosGenerico(JComboBox jComboBoxPlaneacionPagos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlaneacionPagos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPlaneacionPagos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlaneacionPagos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPlaneacionPagos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planeacionpagos=(PlaneacionPagos) planeacionpagosLogic.getPlaneacionPagoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planeacionpagos =(PlaneacionPagos) planeacionpagoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!planeacionpagos.getIsNew() && !planeacionpagos.getIsChanged() && !planeacionpagos.getIsDeleted()) {
				sDescripcion=planeacionpagos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=planeacionpagos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!planeacionpagos.getIsNew() && !planeacionpagos.getIsChanged() && !planeacionpagos.getIsDeleted()) {
				sDescripcion=planeacionpagos.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=planeacionpagos.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!planeacionpagos.getIsNew() && !planeacionpagos.getIsChanged() && !planeacionpagos.getIsDeleted()) {
				sDescripcion=planeacionpagos.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=planeacionpagos.getfactura_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!planeacionpagos.getIsNew() && !planeacionpagos.getIsChanged() && !planeacionpagos.getIsDeleted()) {
				sDescripcion=planeacionpagos.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=planeacionpagos.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PlaneacionPagos planeacionpagosRow=new PlaneacionPagos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planeacionpagosRow=(PlaneacionPagos) planeacionpagosLogic.getPlaneacionPagoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planeacionpagosRow=(PlaneacionPagos) planeacionpagoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPlaneacionPagos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos));			
			this.jButtonDuplicarPlaneacionPagos.setVisible((this.isVisibilidadCeldaDuplicarPlaneacionPagos && this.isPermisoDuplicarPlaneacionPagos));			
			this.jButtonCopiarPlaneacionPagos.setVisible((this.isVisibilidadCeldaCopiarPlaneacionPagos && this.isPermisoCopiarPlaneacionPagos));
			this.jButtonVerFormPlaneacionPagos.setVisible((this.isVisibilidadCeldaVerFormPlaneacionPagos && this.isPermisoVerFormPlaneacionPagos));
			
			this.jButtonAbrirOrderByPlaneacionPagos.setVisible((this.isVisibilidadCeldaOrdenPlaneacionPagos && this.isPermisoOrdenPlaneacionPagos));			
			
			this.jButtonNuevoRelacionesPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos));			
			this.jButtonNuevoGuardarCambiosPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarPlaneacionPagos.setVisible((this.isVisibilidadCeldaModificarPlaneacionPagos && this.isPermisoActualizarPlaneacionPagos));	
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarPlaneacionPagos.setVisible((this.isVisibilidadCeldaActualizarPlaneacionPagos && this.isPermisoActualizarPlaneacionPagos));	
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarPlaneacionPagos.setVisible((this.isVisibilidadCeldaEliminarPlaneacionPagos && this.isPermisoEliminarPlaneacionPagos));
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarPlaneacionPagos.setVisible(this.isVisibilidadCeldaCancelarPlaneacionPagos);							
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));			
			
			}
						
			this.jButtonGuardarCambiosTablaPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos));						
			this.jButtonDuplicarToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaDuplicarPlaneacionPagos && this.isPermisoDuplicarPlaneacionPagos));						
			this.jButtonCopiarToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaCopiarPlaneacionPagos && this.isPermisoCopiarPlaneacionPagos));			
			this.jButtonVerFormToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaVerFormPlaneacionPagos && this.isPermisoVerFormPlaneacionPagos));			
			this.jButtonAbrirOrderByToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaOrdenPlaneacionPagos && this.isPermisoOrdenPlaneacionPagos));
			this.jButtonNuevoRelacionesToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos));			
			this.jButtonNuevoGuardarCambiosToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));			
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaModificarPlaneacionPagos && this.isPermisoActualizarPlaneacionPagos));	
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaActualizarPlaneacionPagos  && this.isPermisoActualizarPlaneacionPagos));	
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaEliminarPlaneacionPagos && this.isPermisoEliminarPlaneacionPagos));
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarToolBarPlaneacionPagos.setVisible(this.isVisibilidadCeldaCancelarPlaneacionPagos);				
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos));			
			this.jMenuItemDuplicarPlaneacionPagos.setVisible((this.isVisibilidadCeldaDuplicarPlaneacionPagos && this.isPermisoDuplicarPlaneacionPagos));			
			this.jMenuItemCopiarPlaneacionPagos.setVisible((this.isVisibilidadCeldaCopiarPlaneacionPagos && this.isPermisoCopiarPlaneacionPagos));			
			this.jMenuItemVerFormPlaneacionPagos.setVisible((this.isVisibilidadCeldaVerFormPlaneacionPagos && this.isPermisoVerFormPlaneacionPagos));			
			this.jMenuItemAbrirOrderByPlaneacionPagos.setVisible((this.isVisibilidadCeldaOrdenPlaneacionPagos && this.isPermisoOrdenPlaneacionPagos));			
			//this.jMenuItemMostrarOcultarPlaneacionPagos.setVisible((this.isVisibilidadCeldaOrdenPlaneacionPagos && this.isPermisoOrdenPlaneacionPagos));
			this.jMenuItemDetalleAbrirOrderByPlaneacionPagos.setVisible((this.isVisibilidadCeldaOrdenPlaneacionPagos && this.isPermisoOrdenPlaneacionPagos));			
			//this.jMenuItemDetalleMostrarOcultarPlaneacionPagos.setVisible((this.isVisibilidadCeldaOrdenPlaneacionPagos && this.isPermisoOrdenPlaneacionPagos));			
			this.jMenuItemNuevoRelacionesPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos));			
			this.jMenuItemNuevoGuardarCambiosPlaneacionPagos.setVisible((this.isVisibilidadCeldaNuevoPlaneacionPagos && this.isPermisoNuevoPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));									
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemModificarPlaneacionPagos.setVisible((this.isVisibilidadCeldaModificarPlaneacionPagos && this.isPermisoActualizarPlaneacionPagos));	
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemActualizarPlaneacionPagos.setVisible((this.isVisibilidadCeldaActualizarPlaneacionPagos && this.isPermisoActualizarPlaneacionPagos));	
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemEliminarPlaneacionPagos.setVisible((this.isVisibilidadCeldaEliminarPlaneacionPagos && this.isPermisoEliminarPlaneacionPagos));
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemCancelarPlaneacionPagos.setVisible(this.isVisibilidadCeldaCancelarPlaneacionPagos);				
			}
			
			this.jMenuItemGuardarCambiosPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));						
			this.jMenuItemGuardarCambiosTablaPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=this.jButtonNuevoPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaDuplicarPlaneacionPagos=this.jButtonDuplicarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaCopiarPlaneacionPagos=this.jButtonCopiarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaVerFormPlaneacionPagos=this.jButtonVerFormPlaneacionPagos.isVisible();
			
			this.isVisibilidadCeldaOrdenPlaneacionPagos=this.jButtonAbrirOrderByPlaneacionPagos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=this.jButtonNuevoRelacionesPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaModificarPlaneacionPagos=this.jButtonModificarPlaneacionPagos.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.isVisibilidadCeldaActualizarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaEliminarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaCancelarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaGuardarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=this.jButtonGuardarCambiosTablaPlaneacionPagos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPlaneacionPagos=this.jButtonNuevoToolBarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=this.jButtonNuevoRelacionesToolBarPlaneacionPagos.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.isVisibilidadCeldaModificarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarToolBarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaActualizarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarToolBarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaEliminarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarToolBarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaCancelarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarToolBarPlaneacionPagos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlaneacionPagos=this.jButtonGuardarCambiosToolBarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=this.jButtonGuardarCambiosTablaToolBarPlaneacionPagos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPlaneacionPagos=this.jMenuItemNuevoPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=this.jMenuItemNuevoRelacionesPlaneacionPagos.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.isVisibilidadCeldaModificarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemModificarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaActualizarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemActualizarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaEliminarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemEliminarPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaCancelarPlaneacionPagos=this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemCancelarPlaneacionPagos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlaneacionPagos=this.jMenuItemGuardarCambiosPlaneacionPagos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=this.jMenuItemGuardarCambiosTablaPlaneacionPagos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPlaneacionPagos(Boolean esInicializar) {
		if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
				//if(this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPlaneacionPagos();
			}
			
			this.inicializarActualizarBindingBotonesManualPlaneacionPagos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPlaneacionPagos() {
		this.jButtonNuevoPlaneacionPagos.setVisible(this.isPermisoNuevoPlaneacionPagos);			
		this.jButtonDuplicarPlaneacionPagos.setVisible(this.isPermisoDuplicarPlaneacionPagos);			
		this.jButtonCopiarPlaneacionPagos.setVisible(this.isPermisoCopiarPlaneacionPagos);			
		this.jButtonVerFormPlaneacionPagos.setVisible(this.isPermisoVerFormPlaneacionPagos);			
		
		this.jButtonAbrirOrderByPlaneacionPagos.setVisible(this.isPermisoOrdenPlaneacionPagos);					
		
		this.jButtonNuevoRelacionesPlaneacionPagos.setVisible(this.isPermisoNuevoPlaneacionPagos);			
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarPlaneacionPagos.setVisible(this.isPermisoActualizarPlaneacionPagos);	
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarPlaneacionPagos.setVisible(this.isPermisoActualizarPlaneacionPagos);	
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarPlaneacionPagos.setVisible(this.isPermisoEliminarPlaneacionPagos);
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarPlaneacionPagos.setVisible(this.isVisibilidadCeldaCancelarPlaneacionPagos);						
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.setVisible(this.isPermisoGuardarCambiosPlaneacionPagos);							
		}
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.setVisible(this.isPermisoActualizarPlaneacionPagos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePlaneacionPagos() {
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarPlaneacionPagos.setVisible(this.isPermisoActualizarPlaneacionPagos);	
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarPlaneacionPagos.setVisible(this.isPermisoActualizarPlaneacionPagos);	
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarPlaneacionPagos.setVisible(this.isPermisoEliminarPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarPlaneacionPagos.setVisible(this.isVisibilidadCeldaCancelarPlaneacionPagos);							
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.setVisible((this.isVisibilidadCeldaGuardarPlaneacionPagos && this.isPermisoGuardarCambiosPlaneacionPagos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPlaneacionPagos() {
		if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPlaneacionPagos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPlaneacionPagos() {
	}
	
	public void jTableDatosPlaneacionPagosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPlaneacionPagos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.planeacionpagos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPlaneacionPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPlaneacionPagos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.planeacionpagosLogic.getConnexion());

				if(this.planeacionpagos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.planeacionpagos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionPagos=(TitledBorder)this.jScrollPanelDatosPlaneacionPagos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPlaneacionPagos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.planeacionpagos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clientePlaneacionPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebPlaneacionPagos(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.planeacionpagosLogic.getConnexion());

				if(this.planeacionpagos.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.planeacionpagos.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionPagos=(TitledBorder)this.jScrollPanelDatosPlaneacionPagos.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderPlaneacionPagos.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clientePlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.planeacionpagos.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pago_inicioPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getfecha_pago_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago_inicio = '"+Funciones2.getStringPostgresDate(this.planeacionpagos.getfecha_pago_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pago_finPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getfecha_pago_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago_fin = '"+Funciones2.getStringPostgresDate(this.planeacionpagos.getfecha_pago_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaPlaneacionPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebPlaneacionPagos(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.planeacionpagosLogic.getConnexion());

				if(this.planeacionpagos.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.planeacionpagos.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionPagos=(TitledBorder)this.jScrollPanelDatosPlaneacionPagos.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderPlaneacionPagos.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.planeacionpagos.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clientePlaneacionPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebPlaneacionPagos(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.planeacionpagosLogic.getConnexion());

				if(this.planeacionpagos.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.planeacionpagos.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionPagos=(TitledBorder)this.jScrollPanelDatosPlaneacionPagos.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderPlaneacionPagos.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clientePlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.planeacionpagos.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clientePlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.planeacionpagos.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.planeacionpagos.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.planeacionpagos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ventaPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getfecha_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_venta = '"+Funciones2.getStringPostgresDate(this.planeacionpagos.getfecha_venta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pagoPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getfecha_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago = '"+Funciones2.getStringPostgresDate(this.planeacionpagos.getfecha_pago())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoPlaneacionPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.getplaneacionpagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacionpagos==null) {
						this.planeacionpagos = new PlaneacionPagos();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);
				}

				if(this.planeacionpagos.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.planeacionpagos.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPlaneacionPagosPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionPagos(false,false);

			this.getPlaneacionPagossBusquedaPlaneacionPagos();

			this.inicializarActualizarBindingPlaneacionPagos(false);

			//if(PlaneacionPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClientePlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionPagos(false,false);

			this.getPlaneacionPagossFK_IdCliente();

			this.inicializarActualizarBindingPlaneacionPagos(false);

			//if(PlaneacionPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionPagos(false,false);

			this.getPlaneacionPagossFK_IdEmpresa();

			this.inicializarActualizarBindingPlaneacionPagos(false);

			//if(PlaneacionPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaPlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionPagos(false,false);

			this.getPlaneacionPagossFK_IdFactura();

			this.inicializarActualizarBindingPlaneacionPagos(false);

			//if(PlaneacionPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClientePlaneacionPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionPagos(false,false);

			this.getPlaneacionPagossFK_IdGrupoCliente();

			this.inicializarActualizarBindingPlaneacionPagos(false);

			//if(PlaneacionPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacionpagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePlaneacionPagos() {
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
			this.jInternalFrameDetalleFormPlaneacionPagos.setVisible(false);	    			
			this.jInternalFrameDetalleFormPlaneacionPagos.dispose();
			this.jInternalFrameDetalleFormPlaneacionPagos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
			this.jInternalFrameReporteDinamicoPlaneacionPagos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPlaneacionPagos.dispose();
			this.jInternalFrameReporteDinamicoPlaneacionPagos=null;
		}
		
		if(this.jInternalFrameImportacionPlaneacionPagos!=null) {
			this.jInternalFrameImportacionPlaneacionPagos.setVisible(false);	    			
			this.jInternalFrameImportacionPlaneacionPagos.dispose();
			this.jInternalFrameImportacionPlaneacionPagos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPlaneacionPagos();
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			
			if(sTipo.equals("NuevoPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPlaneacionPagos")) {
				jButtonDuplicarPlaneacionPagosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPlaneacionPagos")) {
				jButtonCopiarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("VerFormPlaneacionPagos")) {
				jButtonVerFormPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPlaneacionPagos")) {
				jButtonDuplicarPlaneacionPagosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPlaneacionPagos")) {
				jButtonDuplicarPlaneacionPagosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPlaneacionPagos")) {
				jButtonModificarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPlaneacionPagos")) {
				jButtonModificarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPlaneacionPagos")) {
				jButtonModificarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPlaneacionPagos")) {
				jButtonActualizarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPlaneacionPagos")) {
				jButtonActualizarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPlaneacionPagos")) {
				jButtonActualizarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("EliminarPlaneacionPagos")) {
				jButtonEliminarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPlaneacionPagos")) {
				jButtonEliminarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPlaneacionPagos")) {
				jButtonEliminarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("CancelarPlaneacionPagos")) {
				jButtonCancelarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPlaneacionPagos")) {
				jButtonCancelarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPlaneacionPagos")) {
				jButtonCancelarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("CerrarPlaneacionPagos")) {
				jButtonCerrarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPlaneacionPagos")) {
				jButtonCerrarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPlaneacionPagos")) {
				jButtonCerrarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPlaneacionPagos")) {
				jButtonMostrarOcultarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPlaneacionPagos")) {
				jButtonCancelarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPlaneacionPagos")) {
				jButtonCopiarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPlaneacionPagos")) {
				jButtonVerFormPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPlaneacionPagos")) {
				jButtonCopiarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPlaneacionPagos")) {
				jButtonVerFormPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPlaneacionPagos")) {
				jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPlaneacionPagos")) {
				jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPlaneacionPagos")) {
				jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPlaneacionPagos")) {
				jButtonAnterioresPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPlaneacionPagos")) {
				jButtonAnterioresPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePlaneacionPagos")) {
				jButtonAnterioresPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPlaneacionPagos")) {
				jButtonSiguientesPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPlaneacionPagos")) {
				jButtonSiguientesPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPlaneacionPagos")) {
				jButtonSiguientesPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPlaneacionPagos") || sTipo.equals("MenuItemDetalleAbrirOrderByPlaneacionPagos")) {
				jButtonAbrirOrderByPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPlaneacionPagos") || sTipo.equals("MenuItemDetalleMostrarOcultarPlaneacionPagos")) {
				jButtonMostrarOcultarPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPlaneacionPagos")) {
				jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPlaneacionPagos")) {
				jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPlaneacionPagos")) {
				jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPlaneacionPagos")) {
				jButtonCerrarReporteDinamicoPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPlaneacionPagos")) {
				jButtonGenerarReporteDinamicoPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPlaneacionPagos")) {
				
				jButtonGenerarExcelReporteDinamicoPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPlaneacionPagos")) {
				jButtonCerrarImportacionPlaneacionPagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPlaneacionPagos")) {
				
				jButtonGenerarImportacionPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPlaneacionPagos")) {
				
				jButtonAbrirImportacionPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPlaneacionPagos")) {
				jComboBoxTiposAccionesPlaneacionPagosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPlaneacionPagos")) {
				jComboBoxTiposRelacionesPlaneacionPagosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPlaneacionPagos")) {
				jComboBoxTiposAccionesPlaneacionPagosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPlaneacionPagos")) {
				
				jComboBoxTiposSeleccionarPlaneacionPagosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPlaneacionPagos")) {
				jTextFieldValorCampoGeneralPlaneacionPagosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPlaneacionPagos")) {
				jButtonAbrirOrderByPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPlaneacionPagos")) {
				jButtonAbrirOrderByPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPlaneacionPagos")) {
				jButtonCerrarOrderByPlaneacionPagosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlaneacionPagosBusqueda")) {
				this.jButtonidPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPlaneacionPagosUpdate")) {
				this.jButtonid_empresaPlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPlaneacionPagosBusqueda")) {
				this.jButtonid_empresaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clientePlaneacionPagosUpdate")) {
				this.jButtonid_grupo_clientePlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clientePlaneacionPagosBusqueda")) {
				this.jButtonid_grupo_clientePlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pago_inicioPlaneacionPagosBusqueda")) {
				this.jButtonfecha_pago_inicioPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pago_finPlaneacionPagosBusqueda")) {
				this.jButtonfecha_pago_finPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaPlaneacionPagosUpdate")) {
				this.jButtonid_facturaPlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaPlaneacionPagosBusqueda")) {
				this.jButtonid_facturaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clientePlaneacionPagosUpdate")) {
				this.jButtonid_clientePlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clientePlaneacionPagosBusqueda")) {
				this.jButtonid_clientePlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clientePlaneacionPagosBusqueda")) {
				this.jButtonnombre_clientePlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaPlaneacionPagosBusqueda")) {
				this.jButtonnumero_facturaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPlaneacionPagosBusqueda")) {
				this.jButtonfecha_emisionPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaPlaneacionPagosBusqueda")) {
				this.jButtonfecha_ventaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoPlaneacionPagosBusqueda")) {
				this.jButtonfecha_pagoPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoPlaneacionPagosBusqueda")) {
				this.jButtonsaldoPlaneacionPagosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPlaneacionPagosPlaneacionPagos")) {
				this.jButtonBusquedaPlaneacionPagosPlaneacionPagosActionPerformed(evt);
			}
			
			;
			
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPlaneacionPagos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PlaneacionPagos planeacionpagosLocal=null;
			
			if(!this.getEsControlTabla()) {
				planeacionpagosLocal=this.planeacionpagos;
			} else {
				planeacionpagosLocal=this.planeacionpagosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
							
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
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
			
			


			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
								
						
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
								
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
							
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
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
			
			


			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
								
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPlaneacionPagos")) {
					jCheckBoxSeleccionarTodosPlaneacionPagosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPlaneacionPagos")) {
					jCheckBoxSeleccionadosPlaneacionPagosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPlaneacionPagos")) {
					
				}
				
				


				
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
												
				
				


				
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
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
			
			


			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionPagosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacionpagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacionpagos);
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
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
				
				


				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionPagos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacionpagosAnterior =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPlaneacionPagos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPlaneacionPagosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPlaneacionPagos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.planeacionpagos =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.planeacionpagos =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.planeacionpagos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPlaneacionPagos")) {
				
				}
				
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPlaneacionPagos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPlaneacionPagos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPlaneacionPagos")) {
			
			}
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPlaneacionPagos();
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			if(sTipo.equals("NuevoPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPlaneacionPagos")) {
				jButtonDuplicarPlaneacionPagosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPlaneacionPagos")) {
				jButtonCopiarPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPlaneacionPagos")) {
				jButtonVerFormPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPlaneacionPagos")) {
				jButtonNuevoPlaneacionPagosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPlaneacionPagos")) {
				jButtonModificarPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPlaneacionPagos")) {
				jButtonActualizarPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPlaneacionPagos")) {
				jButtonEliminarPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPlaneacionPagos")) {
				jButtonCancelarPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPlaneacionPagos")) {
				jButtonCerrarPlaneacionPagosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPlaneacionPagos")) {
				jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPlaneacionPagos")) {
				jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPlaneacionPagos")) {
				jButtonAbrirOrderByPlaneacionPagosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPlaneacionPagos")) {
				jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPlaneacionPagos")) {
				jButtonAnterioresPlaneacionPagosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPlaneacionPagos")) {
				jButtonSiguientesPlaneacionPagosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlaneacionPagosBusqueda")) {
				this.jButtonidPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPlaneacionPagosUpdate")) {
				this.jButtonid_empresaPlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPlaneacionPagosBusqueda")) {
				this.jButtonid_empresaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clientePlaneacionPagosUpdate")) {
				this.jButtonid_grupo_clientePlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clientePlaneacionPagosBusqueda")) {
				this.jButtonid_grupo_clientePlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pago_inicioPlaneacionPagosBusqueda")) {
				this.jButtonfecha_pago_inicioPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pago_finPlaneacionPagosBusqueda")) {
				this.jButtonfecha_pago_finPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaPlaneacionPagosUpdate")) {
				this.jButtonid_facturaPlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaPlaneacionPagosBusqueda")) {
				this.jButtonid_facturaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clientePlaneacionPagosUpdate")) {
				this.jButtonid_clientePlaneacionPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clientePlaneacionPagosBusqueda")) {
				this.jButtonid_clientePlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clientePlaneacionPagosBusqueda")) {
				this.jButtonnombre_clientePlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaPlaneacionPagosBusqueda")) {
				this.jButtonnumero_facturaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPlaneacionPagosBusqueda")) {
				this.jButtonfecha_emisionPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaPlaneacionPagosBusqueda")) {
				this.jButtonfecha_ventaPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoPlaneacionPagosBusqueda")) {
				this.jButtonfecha_pagoPlaneacionPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoPlaneacionPagosBusqueda")) {
				this.jButtonsaldoPlaneacionPagosBusquedaActionPerformed(evt);
			}
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPlaneacionPagos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePlaneacionPagos")) {
				closingInternalFramePlaneacionPagos();
				
			} else if(sTipo.equals("jButtonCancelarPlaneacionPagos")) {
				JInternalFrameBase jInternalFrameDetalleFormPlaneacionPagos = (JInternalFrameBase)evt.getSource();
	            	
	            PlaneacionPagosBeanSwingJInternalFrame jInternalFrameParent=(PlaneacionPagosBeanSwingJInternalFrame)jInternalFrameDetalleFormPlaneacionPagos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPlaneacionPagosActionPerformed(null);
			}
			
			PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planeacionpagos,new Object(),this.planeacionpagosParameterGeneral,this.planeacionpagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPlaneacionPagos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPlaneacionPagos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPlaneacionPagos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.planeacionpagos)) {
			if(!esControlTabla) {
				if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);			
				}
				
				if(this.planeacionpagosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPlaneacionPagos(this.planeacionpagos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPlaneacionPagos(this.planeacionpagosReturnGeneral,this.planeacionpagosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.planeacionpagosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPlaneacionPagos(classes,this.planeacionpagosReturnGeneral,this.planeacionpagosBean,false);
					}
						
					if(this.planeacionpagosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionPagos(this.planeacionpagosReturnGeneral.getPlaneacionPagos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagosReturnGeneral.getPlaneacionPagos());	
					}
						
					if(this.planeacionpagosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagosReturnGeneral.getPlaneacionPagos(),classes);//this.planeacionpagosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPlaneacionPagos(this.planeacionpagos,classes);//this.planeacionpagosBean);									
				}
			
				if(PlaneacionPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPlaneacionPagos(this.planeacionpagos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionPagos(this.planeacionpagos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.planeacionpagosAnterior!=null) {
						this.planeacionpagos=this.planeacionpagosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planeacionpagosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planeacionpagosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.planeacionpagosReturnGeneral.getPlaneacionPagos(),planeacionpagosLogic.getPlaneacionPagoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.planeacionpagosReturnGeneral.getPlaneacionPagos(),this.planeacionpagoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPlaneacionPagos.repaint();
				
				//((AbstractTableModel) this.jTableDatosPlaneacionPagos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPlaneacionPagos();
			}
		}
	}
	
	public void actualizarVisualTableDatosPlaneacionPagos() throws Exception {
		
		PlaneacionPagosModel planeacionpagosModel=(PlaneacionPagosModel)this.jTableDatosPlaneacionPagos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planeacionpagosModel.planeacionpagoss=this.planeacionpagosLogic.getPlaneacionPagoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			planeacionpagosModel.planeacionpagoss=this.planeacionpagoss;
		}
		
		
		((PlaneacionPagosModel) this.jTableDatosPlaneacionPagos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPlaneacionPagos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getplaneacionpagosAnterior(),this.planeacionpagosLogic.getPlaneacionPagoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getplaneacionpagosAnterior(),this.planeacionpagoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPlaneacionPagos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPlaneacionPagos(PlaneacionPagos planeacionpagos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
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
										
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planeacionpagos,new Object(),generalEntityParameterGeneral,this.planeacionpagosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PlaneacionPagosConstantesFunciones.getClassesRelationshipsOfPlaneacionPagos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PlaneacionPagosConstantesFunciones.getClassesRelationshipsFromStringsOfPlaneacionPagos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPlaneacionPagos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PlaneacionPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planeacionpagos,new Object(),generalEntityParameterGeneral,this.planeacionpagosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPlaneacionPagos(PlaneacionPagosBean planeacionpagosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPlaneacionPagos(ArrayList<Classe> classes,PlaneacionPagosReturnGeneral planeacionpagosReturnGeneral,PlaneacionPagosBean planeacionpagosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPlaneacionPagos(PlaneacionPagos planeacionpagos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.planeacionpagos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPlaneacionPagos = new PlaneacionPagosDetalleFormJInternalFrame(jDesktopPane,this.planeacionpagosSessionBean.getConGuardarRelaciones(),this.planeacionpagosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.setVisible(false);
		this.jInternalFrameDetalleFormPlaneacionPagos.setSelected(false);						
		
		this.jInternalFrameDetalleFormPlaneacionPagos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPlaneacionPagos.planeacionpagosLogic=this.planeacionpagosLogic;
		
		this.cargarCombosFrameForeignKeyPlaneacionPagos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePlaneacionPagos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlaneacionPagos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPlaneacionPagos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPlaneacionPagos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPlaneacionPagos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlaneacionPagos"));
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"ModificarPlaneacionPagos"));

		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlaneacionPagos"));
					
		this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemModificarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlaneacionPagos"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"ActualizarPlaneacionPagos"));
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlaneacionPagos"));
						
		this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemActualizarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlaneacionPagos"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"EliminarPlaneacionPagos"));
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlaneacionPagos"));
								
		this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemEliminarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlaneacionPagos"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CancelarPlaneacionPagos"));
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlaneacionPagos"));
					
		this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemCancelarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlaneacionPagos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemDetalleCerrarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlaneacionPagos"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaneacionPagos"));
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaneacionPagos"));
		
		
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlaneacionPagos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonidPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"idPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_empresaPlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_empresaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_grupo_clientePlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clientePlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_grupo_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pago_inicioPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pago_finPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pago_finPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_facturaPlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_facturaPlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_facturaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_clientePlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_clientePlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonnombre_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonnumero_facturaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_emisionPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_ventaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pagoPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonsaldoPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"saldoPlaneacionPagosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlaneacionPagos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePlaneacionPagos"));
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlaneacionPagos"));
		}
		
		this.jTableDatosPlaneacionPagos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPlaneacionPagos"));
		
		this.jTableDatosPlaneacionPagos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPlaneacionPagos"));
		
		this.jButtonNuevoPlaneacionPagos.addActionListener(new ButtonActionListener(this,"NuevoPlaneacionPagos"));
		
		this.jButtonDuplicarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"DuplicarPlaneacionPagos"));
		
		this.jButtonCopiarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"CopiarPlaneacionPagos"));
		
		this.jButtonVerFormPlaneacionPagos.addActionListener(new ButtonActionListener(this,"VerFormPlaneacionPagos"));
		
		
		this.jButtonNuevoToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"NuevoToolBarPlaneacionPagos"));
			
		this.jButtonDuplicarToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPlaneacionPagos"));
			
		this.jMenuItemNuevoPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPlaneacionPagos"));
			
		this.jMenuItemDuplicarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPlaneacionPagos"));		
		
		
		this.jButtonNuevoRelacionesPlaneacionPagos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPlaneacionPagos"));
		
		
		this.jButtonNuevoRelacionesToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPlaneacionPagos"));
			
		this.jMenuItemNuevoRelacionesPlaneacionPagos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPlaneacionPagos"));		
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"ModificarPlaneacionPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonModificarToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlaneacionPagos"));
			
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemModificarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlaneacionPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"ActualizarPlaneacionPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonActualizarToolBarPlaneacionPagos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlaneacionPagos"));
				
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemActualizarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlaneacionPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"EliminarPlaneacionPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonEliminarToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlaneacionPagos"));
						
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemEliminarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlaneacionPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CancelarPlaneacionPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonCancelarToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlaneacionPagos"));
			
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemCancelarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlaneacionPagos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPlaneacionPagos"));		
		
		
		this.jButtonCerrarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CerrarPlaneacionPagos"));
		
		
		this.jButtonCerrarToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CerrarToolBarPlaneacionPagos"));
			
		this.jMenuItemCerrarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPlaneacionPagos"));
			
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jMenuItemDetalleCerrarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlaneacionPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosPlaneacionPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaneacionPagos"));
		}
		
		this.jButtonCopiarToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CopiarToolBarPlaneacionPagos"));
			
		this.jButtonVerFormToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"VerFormToolBarPlaneacionPagos"));
		
		this.jMenuItemGuardarCambiosPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPlaneacionPagos"));
			
		this.jMenuItemCopiarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPlaneacionPagos"));		
		
		this.jMenuItemVerFormPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPlaneacionPagos"));		
		
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlaneacionPagos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPlaneacionPagos"));
			
		this.jMenuItemGuardarCambiosTablaPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlaneacionPagos"));		
		
		
		
		this.jButtonRecargarInformacionPlaneacionPagos.addActionListener (new ButtonActionListener(this,"RecargarInformacionPlaneacionPagos"));
					
		this.jButtonRecargarInformacionToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPlaneacionPagos"));
		
		this.jMenuItemRecargarInformacionPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPlaneacionPagos"));		
		
		
		
		this.jButtonAnterioresPlaneacionPagos.addActionListener (new ButtonActionListener(this,"AnterioresPlaneacionPagos"));
		
		
		this.jButtonAnterioresToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPlaneacionPagos"));
		
		this.jMenuItemAnterioresPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPlaneacionPagos"));		
		
		
		this.jButtonSiguientesPlaneacionPagos.addActionListener (new ButtonActionListener(this,"SiguientesPlaneacionPagos"));
		
		
		this.jButtonSiguientesToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPlaneacionPagos"));
			
		this.jMenuItemSiguientesPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPlaneacionPagos"));
			
		this.jMenuItemAbrirOrderByPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPlaneacionPagos"));
			
		this.jMenuItemMostrarOcultarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPlaneacionPagos"));
			
		this.jMenuItemDetalleAbrirOrderByPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPlaneacionPagos"));
			
		this.jMenuItemDetalleMostarOcultarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPlaneacionPagos"));		
		
		
		this.jButtonNuevoGuardarCambiosPlaneacionPagos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPlaneacionPagos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPlaneacionPagos"));
			
		this.jMenuItemNuevoGuardarCambiosPlaneacionPagos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPlaneacionPagos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPlaneacionPagos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPlaneacionPagos"));

		this.jCheckBoxSeleccionadosPlaneacionPagos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPlaneacionPagos"));
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlaneacionPagos"));
		}
		
		
		this.jComboBoxTiposRelacionesPlaneacionPagos.addActionListener (new ButtonActionListener(this,"TiposRelacionesPlaneacionPagos"));
			
		this.jComboBoxTiposAccionesPlaneacionPagos.addActionListener (new ButtonActionListener(this,"TiposAccionesPlaneacionPagos"));
					
		this.jComboBoxTiposSeleccionarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPlaneacionPagos"));
			
		this.jTextFieldValorCampoGeneralPlaneacionPagos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPlaneacionPagos"));		
		
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonidPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"idPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_empresaPlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_empresaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_grupo_clientePlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clientePlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_grupo_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pago_inicioPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pago_finPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pago_finPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_facturaPlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_facturaPlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_facturaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_clientePlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_clientePlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonnombre_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonnumero_facturaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_emisionPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_ventaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pagoPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonsaldoPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"saldoPlaneacionPagosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPlaneacionPagosPlaneacionPagos.addActionListener(new ButtonActionListener(this,"BusquedaPlaneacionPagosPlaneacionPagos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPlaneacionPagos!=null) {
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaneacionPagos"));
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaneacionPagos"));
				this.jInternalFrameReporteDinamicoPlaneacionPagos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaneacionPagos"));
			}
			
			//this.jButtonCerrarReporteDinamicoPlaneacionPagos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaneacionPagos"));				
			//this.jButtonGenerarReporteDinamicoPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaneacionPagos"));
			//this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaneacionPagos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPlaneacionPagos!=null) {
				this.jInternalFrameImportacionPlaneacionPagos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlaneacionPagos"));
				this.jInternalFrameImportacionPlaneacionPagos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlaneacionPagos"));
				this.jInternalFrameImportacionPlaneacionPagos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlaneacionPagos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPlaneacionPagos.addActionListener (new ButtonActionListener(this,"AbrirOrderByPlaneacionPagos"));
			
			this.jButtonAbrirOrderByToolBarPlaneacionPagos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPlaneacionPagos"));			
			
			if(this.jInternalFrameOrderByPlaneacionPagos!=null) {
				this.jInternalFrameOrderByPlaneacionPagos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlaneacionPagos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionPagos.jTabbedPaneRelacionesPlaneacionPagos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlaneacionPagos"));
		
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
            		closingInternalFramePlaneacionPagos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPlaneacionPagos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPlaneacionPagos = (JInternalFrameBase)event.getSource();
	            	
	            PlaneacionPagosBeanSwingJInternalFrame jInternalFrameParent=(PlaneacionPagosBeanSwingJInternalFrame)jInternalFrameDetalleFormPlaneacionPagos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPlaneacionPagosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPlaneacionPagos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPlaneacionPagosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPlaneacionPagos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPlaneacionPagos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionPagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionPagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionPagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPlaneacionPagos";
		inputMap = this.jButtonNuevoPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlaneacionPagosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionPagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionPagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionPagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPlaneacionPagos";
		inputMap = this.jButtonNuevoRelacionesPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlaneacionPagosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPlaneacionPagos";
		inputMap = this.jButtonModificarPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPlaneacionPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPlaneacionPagos";
		inputMap = this.jButtonActualizarPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPlaneacionPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPlaneacionPagos";
		inputMap = this.jButtonEliminarPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPlaneacionPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPlaneacionPagos";
		inputMap = this.jButtonCancelarPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPlaneacionPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPlaneacionPagos";
		inputMap = this.jButtonCerrarPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPlaneacionPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPlaneacionPagos";
		inputMap = this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonGuardarCambiosPlaneacionPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPlaneacionPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPlaneacionPagos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPlaneacionPagosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPlaneacionPagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPlaneacionPagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPlaneacionPagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPlaneacionPagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPlaneacionPagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPlaneacionPagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonidPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"idPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_empresaPlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_empresaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_grupo_clientePlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clientePlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_grupo_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pago_inicioPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pago_finPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pago_finPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_facturaPlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_facturaPlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_facturaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaPlaneacionPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_clientePlaneacionPagosUpdate.addActionListener(new ButtonActionListener(this,"id_clientePlaneacionPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonid_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonnombre_clientePlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonnumero_facturaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_emisionPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_ventaPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonfecha_pagoPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoPlaneacionPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionPagos.jButtonsaldoPlaneacionPagosBusqueda.addActionListener(new ButtonActionListener(this,"saldoPlaneacionPagosBusqueda"));
		
		
		this.jButtonBusquedaPlaneacionPagosPlaneacionPagos.addActionListener(new ButtonActionListener(this,"BusquedaPlaneacionPagosPlaneacionPagos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPlaneacionPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPlaneacionPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPlaneacionPagosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPlaneacionPagos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPlaneacionPagos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
					planeacionpagosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionPagos planeacionpagosAux:planeacionpagoss) {
					planeacionpagosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPlaneacionPagosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlaneacionPagos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
						planeacionpagosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaneacionPagos planeacionpagosAux:planeacionpagoss) {
						planeacionpagosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaneacionPagos planeacionpagosAux:planeacionpagoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlaneacionPagos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlaneacionPagos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPlaneacionPagosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlaneacionPagos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPlaneacionPagos.getSelectedRows();
			
			PlaneacionPagos planeacionpagosLocal=new PlaneacionPagos();
			
			//this.seleccionarTodosPlaneacionPagos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacionpagosLocal =(PlaneacionPagos) this.planeacionpagosLogic.getPlaneacionPagoss().toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					planeacionpagosLocal =(PlaneacionPagos) this.planeacionpagoss.toArray()[this.jTableDatosPlaneacionPagos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				planeacionpagosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
						planeacionpagosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaneacionPagos planeacionpagosAux:planeacionpagoss) {
						planeacionpagosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlaneacionPagos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlaneacionPagos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionPagos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPlaneacionPagosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPlaneacionPagosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPlaneacionPagosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPlaneacionPagos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPlaneacionPagos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlaneacionPagos planeacionpagosAux:this.planeacionpagosLogic.getPlaneacionPagoss()) {
				
						if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO)) {
							existe=true;
							planeacionpagosAux.setfecha_pago_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN)) {
							existe=true;
							planeacionpagosAux.setfecha_pago_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							planeacionpagosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							planeacionpagosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							planeacionpagosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							planeacionpagosAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							planeacionpagosAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							planeacionpagosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionPagos planeacionpagosAux:planeacionpagoss) {
					
						if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO)) {
							existe=true;
							planeacionpagosAux.setfecha_pago_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN)) {
							existe=true;
							planeacionpagosAux.setfecha_pago_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							planeacionpagosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							planeacionpagosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							planeacionpagosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							planeacionpagosAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							planeacionpagosAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							planeacionpagosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPlaneacionPagosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPlaneacionPagos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPlaneacionPagos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPlaneacionPagos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePlaneacionPagos) {				
					conSplash=true;//false;										
					
					//this.startProcessPlaneacionPagos(conSplash);
				
					this.generarReportePlaneacionPagossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPlaneacionPagossSeleccionados();
				//this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlaneacionPagossSeleccionados(false);
				//this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlaneacionPagossSeleccionados(true);
				//this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlaneacionPagos();
				
				this.exportarPlaneacionPagossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPlaneacionPagoss();
				//this.importarPlaneacionPagoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlaneacionPagos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPlaneacionPagossSeleccionados();
				//this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Planeacion Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPlaneacionPagos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPlaneacionPagos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPlaneacionPagos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
				}	
			} 			
			else if(PlaneacionPagosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePlaneacionPagos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPlaneacionPagos(conSplash);
					
						//this.actualizarParametrosGeneralPlaneacionPagos();
						
						this.generarReporteProcesoAccionPlaneacionPagossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PlaneacionPagosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Planeacion PagosES SELECCIONADOS?", "MANTENIMIENTO DE Planeacion Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPlaneacionPagos();
				
						this.actualizarParametrosGeneralPlaneacionPagos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.planeacionpagosReturnGeneral=planeacionpagosLogic.procesarAccionPlaneacionPagossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.planeacionpagosLogic.getPlaneacionPagoss(),this.planeacionpagosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPlaneacionPagosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPlaneacionPagos();
					
					PlaneacionPagosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPlaneacionPagosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlaneacionPagos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxTiposAccionesFormularioPlaneacionPagos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPlaneacionPagos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPlaneacionPagosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPlaneacionPagos();
			
			if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
			PlaneacionPagos planeacionpagos=new PlaneacionPagos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPlaneacionPagos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPlaneacionPagos.getSelectedItem();
			
			
			
			
			planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
			//this.sTipoAccion;
			
			if(planeacionpagossSeleccionados.size()==1) {
				for(PlaneacionPagos planeacionpagosAux:planeacionpagossSeleccionados) {
					planeacionpagos=planeacionpagosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPlaneacionPagos();
			
      		//this.finishProcessPlaneacionPagos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPlaneacionPagosReturnGeneral() throws Exception {
		if(this.planeacionpagosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.planeacionpagosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.planeacionpagosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.planeacionpagosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.planeacionpagosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.planeacionpagosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPlaneacionPagos(false);
		}
		
		if(this.planeacionpagosReturnGeneral.getConRetornoLista() || this.planeacionpagosReturnGeneral.getConRetornoObjeto()) {
			if(this.planeacionpagosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planeacionpagosLogic.setPlaneacionPagoss(this.planeacionpagosReturnGeneral.getPlaneacionPagoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPlaneacionPagos(false);
		}
	}
	
	public void actualizarParametrosGeneralPlaneacionPagos() throws Exception {
		
		
	}
	
	public ArrayList<PlaneacionPagos> getPlaneacionPagossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPlaneacionPagos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PlaneacionPagos planeacionpagosAux:planeacionpagosLogic.getPlaneacionPagoss()) {
					if(planeacionpagosAux.getIsSelected()) {
						planeacionpagossSeleccionados.add(planeacionpagosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionPagos planeacionpagosAux:this.planeacionpagoss) {
					if(planeacionpagosAux.getIsSelected()) {
						planeacionpagossSeleccionados.add(planeacionpagosAux);				
					}
				}
			}
			
			if(planeacionpagossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						planeacionpagossSeleccionados.addAll(this.planeacionpagosLogic.getPlaneacionPagoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						planeacionpagossSeleccionados.addAll(this.planeacionpagoss);				
					}
				}
			}
		} else {
			planeacionpagossSeleccionados.add(this.planeacionpagos);
		}
		
		return planeacionpagossSeleccionados;
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
	
	public void generarReportePlaneacionPagossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPlaneacionPagossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPlaneacionPagossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlaneacionPagossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlaneacionPagossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Planeacion Pagos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPlaneacionPagossSeleccionados() throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados);
		
	}	
	
	public void generarReporteNormalPlaneacionPagossSeleccionados() throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPlaneacionPagossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPlaneacionPagossSeleccionados() throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPlaneacionPagos();
		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPlaneacionPagos();
		
		
		//this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados ,planeacionpagosImplementable,planeacionpagosImplementableHome);
	}
	
	public void mostrarImportacionPlaneacionPagoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPlaneacionPagos();
		
		this.abrirFrameImportacionPlaneacionPagos();		
		
			
		//this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados ,planeacionpagosImplementable,planeacionpagosImplementableHome);
	}
	
	public void importarPlaneacionPagoss() throws Exception {		
	
	}
	
	public void exportarPlaneacionPagossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPlaneacionPagossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPlaneacionPagossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPlaneacionPagossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Planeacion Pagos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPlaneacionPagossSeleccionados() throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPlaneacionPagos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PlaneacionPagos planeacionpagosAux:planeacionpagossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPlaneacionPagos(planeacionpagosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//planeacionpagosAux.setsDetalleGeneralEntityReporte(planeacionpagosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPlaneacionPagos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionPagosConstantesFunciones.LABEL_SALDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPlaneacionPagos(PlaneacionPagos planeacionpagos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=planeacionpagos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getfecha_pago_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getfecha_pago_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getfecha_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getfecha_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacionpagos.getsaldo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPlaneacionPagossSeleccionados() throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PlaneacionPagoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPlaneacionPagos(row);				
				iRow++;
			}				
			
			for(PlaneacionPagos planeacionpagosAux:planeacionpagossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPlaneacionPagos(planeacionpagosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPlaneacionPagossSeleccionados() throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();		
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacionpagos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("planeacionpagoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("planeacionpagos");
			//elementRoot.appendChild(element);
		
			for(PlaneacionPagos planeacionpagosAux:planeacionpagossSeleccionados) {
				element = document.createElement("planeacionpagos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPlaneacionPagos(planeacionpagosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPlaneacionPagos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionPagosConstantesFunciones.LABEL_SALDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPlaneacionPagos(PlaneacionPagos planeacionpagos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getfecha_pago_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getfecha_pago_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getfecha_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getfecha_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacionpagos.getsaldo());				
	}
	
	public void setFilaDatosExportarXmlPlaneacionPagos(PlaneacionPagos planeacionpagos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PlaneacionPagosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(planeacionpagos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PlaneacionPagosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(planeacionpagos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PlaneacionPagosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(planeacionpagos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(PlaneacionPagosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(planeacionpagos.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementfecha_pago_inicio = document.createElement(PlaneacionPagosConstantesFunciones.FECHAPAGOINICIO);
		elementfecha_pago_inicio.appendChild(document.createTextNode(planeacionpagos.getfecha_pago_inicio().toString().trim()));
		element.appendChild(elementfecha_pago_inicio);

		Element elementfecha_pago_fin = document.createElement(PlaneacionPagosConstantesFunciones.FECHAPAGOFIN);
		elementfecha_pago_fin.appendChild(document.createTextNode(planeacionpagos.getfecha_pago_fin().toString().trim()));
		element.appendChild(elementfecha_pago_fin);

		Element elementfactura_descripcion = document.createElement(PlaneacionPagosConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(planeacionpagos.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementcliente_descripcion = document.createElement(PlaneacionPagosConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(planeacionpagos.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnombre_cliente = document.createElement(PlaneacionPagosConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(planeacionpagos.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnumero_factura = document.createElement(PlaneacionPagosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(planeacionpagos.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_emision = document.createElement(PlaneacionPagosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(planeacionpagos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_venta = document.createElement(PlaneacionPagosConstantesFunciones.FECHAVENTA);
		elementfecha_venta.appendChild(document.createTextNode(planeacionpagos.getfecha_venta().toString().trim()));
		element.appendChild(elementfecha_venta);

		Element elementfecha_pago = document.createElement(PlaneacionPagosConstantesFunciones.FECHAPAGO);
		elementfecha_pago.appendChild(document.createTextNode(planeacionpagos.getfecha_pago().toString().trim()));
		element.appendChild(elementfecha_pago);

		Element elementsaldo = document.createElement(PlaneacionPagosConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(planeacionpagos.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);
	}
	
	public void generarReporteGroupGenericoPlaneacionPagossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PlaneacionPagos> planeacionpagossSeleccionados=new ArrayList<PlaneacionPagos>();
		
		planeacionpagossSeleccionados=this.getPlaneacionPagossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPlaneacionPagos(planeacionpagossSeleccionados);
		
		this.generarReportePlaneacionPagoss("Todos",planeacionpagossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPlaneacionPagos(ArrayList<PlaneacionPagos> planeacionpagossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PlaneacionPagos planeacionpagosAux:planeacionpagossSeleccionados) {
				planeacionpagosAux.setsDetalleGeneralEntityReporte(planeacionpagosAux.toString());
			
				if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(planeacionpagosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(planeacionpagosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacionpagosAux.getfecha_pago_inicio()));
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacionpagosAux.getfecha_pago_fin()));
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(planeacionpagosAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(planeacionpagosAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(planeacionpagosAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(planeacionpagosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacionpagosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacionpagosAux.getfecha_venta()));
				}
				 else if(sTipoSeleccionar.equals(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO)) {
					existe=true;
					planeacionpagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacionpagosAux.getfecha_pago()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPlaneacionPagos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPlaneacionPagos=true;
				this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=true;
				this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=true;
			}
			
			this.isVisibilidadCeldaModificarPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
			this.isVisibilidadCeldaModificarPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=true;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
			this.isVisibilidadCeldaModificarPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=true;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=true;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
			this.isVisibilidadCeldaModificarPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=true;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=true;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=true;
			this.isVisibilidadCeldaModificarPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
			this.isVisibilidadCeldaModificarPlaneacionPagos=true;
			this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
			this.isVisibilidadCeldaCancelarPlaneacionPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPlaneacionPagos=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=true;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=true;
		} else {
			this.actualizarEstadoPanelsPlaneacionPagos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPlaneacionPagos=false;
			//this.isVisibilidadCeldaVerFormPlaneacionPagos=false;
			this.isVisibilidadCeldaDuplicarPlaneacionPagos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!planeacionpagosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
		} else {
			this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			if(!planeacionpagosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;												
			}
			
			this.jButtonCerrarPlaneacionPagos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
		}
		
		if(!this.permiteMantenimiento(this.planeacionpagos)) {
			this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
			this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPlaneacionPagos=false;
		this.isVisibilidadCeldaNuevoRelacionesPlaneacionPagos=false;
		this.isVisibilidadCeldaGuardarCambiosPlaneacionPagos=false;
		//this.isVisibilidadCeldaModificarPlaneacionPagos=true;
		this.isVisibilidadCeldaActualizarPlaneacionPagos=false;
		this.isVisibilidadCeldaEliminarPlaneacionPagos=false;
		//this.isVisibilidadCeldaCancelarPlaneacionPagos=true;			
		this.isVisibilidadCeldaGuardarPlaneacionPagos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPlaneacionPagos() {
	}
	
	public void actualizarEstadoPanelsPlaneacionPagos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPlaneacionPagos!=null) {
				this.jScrollPanelDatosEdicionPlaneacionPagos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionPagos!=null) {
				this.jScrollPanelDatosPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionPagos!=null) {
				this.jPanelPaginacionPlaneacionPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
					this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionPagos!=null) {
				this.jTabbedPaneBusquedasPlaneacionPagos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPlaneacionPagos!=null) {
				this.jPanelParametrosReportesPlaneacionPagos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPlaneacionPagos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPlaneacionPagos) {this.jTabbedPaneBusquedasPlaneacionPagos.remove(jPanelBusquedaPlaneacionPagosPlaneacionPagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaPlaneacionPagos=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaPlaneacionPagos) {this.jTabbedPaneBusquedasPlaneacionPagos.remove(jPanelBusquedaPlaneacionPagosPlaneacionPagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadBusquedaPlaneacionPagos=isParaFacturaNegation;
			if(!this.isVisibilidadBusquedaPlaneacionPagos) {this.jTabbedPaneBusquedasPlaneacionPagos.remove(jPanelBusquedaPlaneacionPagosPlaneacionPagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaPlaneacionPagos=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPlaneacionPagos) {this.jTabbedPaneBusquedasPlaneacionPagos.remove(jPanelBusquedaPlaneacionPagosPlaneacionPagos);}
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
			
			this.inicializarActualizarBindingTablaPlaneacionPagos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPlaneacionPagos() {
		this.updateBorderResaltarBusquedasFormularioPlaneacionPagos();
		this.updateVisibilidadBusquedasFormularioPlaneacionPagos();
		this.updateHabilitarBusquedasFormularioPlaneacionPagos();
	}
	
	public void updateBorderResaltarBusquedasFormularioPlaneacionPagos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPlaneacionPagos.getComponents().length>0) {
	

		if(this.planeacionpagosConstantesFunciones.resaltarBusquedaPlaneacionPagosPlaneacionPagos!=null) {
			index= this.jTabbedPaneBusquedasPlaneacionPagos.indexOfComponent(this.jPanelBusquedaPlaneacionPagosPlaneacionPagos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionPagos.getComponent(index);
				jPanel.setBorder(this.planeacionpagosConstantesFunciones.resaltarBusquedaPlaneacionPagosPlaneacionPagos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPlaneacionPagos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPlaneacionPagos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlaneacionPagos.indexOfComponent(this.jPanelBusquedaPlaneacionPagosPlaneacionPagos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionPagos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planeacionpagosConstantesFunciones.mostrarBusquedaPlaneacionPagosPlaneacionPagos);
			if(!this.planeacionpagosConstantesFunciones.mostrarBusquedaPlaneacionPagosPlaneacionPagos && index>-1) {
				this.jTabbedPaneBusquedasPlaneacionPagos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPlaneacionPagos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPlaneacionPagos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlaneacionPagos.indexOfComponent(this.jPanelBusquedaPlaneacionPagosPlaneacionPagos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionPagos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planeacionpagosConstantesFunciones.activarBusquedaPlaneacionPagosPlaneacionPagos);
				this.jTabbedPaneBusquedasPlaneacionPagos.setEnabledAt(index,this.planeacionpagosConstantesFunciones.activarBusquedaPlaneacionPagosPlaneacionPagos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPlaneacionPagos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPlaneacionPagos")) {
			index= this.jTabbedPaneBusquedasPlaneacionPagos.indexOfComponent(this.jPanelBusquedaPlaneacionPagosPlaneacionPagos);

			this.jTabbedPaneBusquedasPlaneacionPagos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionPagos.getComponent(index);

			this.planeacionpagosConstantesFunciones.setResaltarBusquedaPlaneacionPagosPlaneacionPagos(resaltar);

			jPanel.setBorder(this.planeacionpagosConstantesFunciones.resaltarBusquedaPlaneacionPagosPlaneacionPagos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPlaneacionPagos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPlaneacionPagos() throws Exception {

		if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPlaneacionPagos();
		this.updateVisibilidadResaltarControlesFormularioPlaneacionPagos();
		this.updateHabilitarResaltarControlesFormularioPlaneacionPagos();
		
	}
	
	public void updateBorderResaltarControlesFormularioPlaneacionPagos() throws Exception {
		if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.planeacionpagosConstantesFunciones.resaltaridPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltaridPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarid_empresaPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarid_empresaPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarid_grupo_clientePlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarid_grupo_clientePlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarfecha_pago_inicioPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_inicioPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarfecha_pago_inicioPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarfecha_pago_finPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_finPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarfecha_pago_finPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarid_facturaPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarid_facturaPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarid_clientePlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarid_clientePlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarnombre_clientePlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarnombre_clientePlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarnumero_facturaPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarnumero_facturaPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarfecha_emisionPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarfecha_emisionPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarfecha_ventaPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarfecha_ventaPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarfecha_pagoPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarfecha_pagoPlaneacionPagos);}
		if(this.planeacionpagosConstantesFunciones.resaltarsaldoPlaneacionPagos!=null && this.jInternalFrameDetalleFormPlaneacionPagos!=null) {this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setBorder(this.planeacionpagosConstantesFunciones.resaltarsaldoPlaneacionPagos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPlaneacionPagos() throws Exception {		
		if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
	
		//this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostraridPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelidPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostraridPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_empresaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelid_empresaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_empresaPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_grupo_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelid_grupo_clientePlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_grupo_clientePlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_inicioPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_pago_inicioPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelfecha_pago_inicioPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_pago_inicioPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_finPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_pago_finPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelfecha_pago_finPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_pago_finPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_facturaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelid_facturaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_facturaPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelid_clientePlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarid_clientePlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarnombre_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelnombre_clientePlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarnombre_clientePlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarnumero_facturaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelnumero_facturaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarnumero_facturaPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_emisionPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelfecha_emisionPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_emisionPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_ventaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelfecha_ventaPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_ventaPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_pagoPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelfecha_pagoPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarfecha_pagoPlaneacionPagos);
		//this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarsaldoPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jPanelsaldoPlaneacionPagos.setVisible(this.planeacionpagosConstantesFunciones.mostrarsaldoPlaneacionPagos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPlaneacionPagos() throws Exception {
		if(this.jInternalFrameDetalleFormPlaneacionPagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlaneacionPagos!=null) {
	
		this.jInternalFrameDetalleFormPlaneacionPagos.jLabelidPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activaridPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_empresaPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarid_empresaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_grupo_clientePlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarid_grupo_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_inicioPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarfecha_pago_inicioPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pago_finPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarfecha_pago_finPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_facturaPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarid_facturaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jComboBoxid_clientePlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarid_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jTextAreanombre_clientePlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarnombre_clientePlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldnumero_facturaPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarnumero_facturaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_emisionPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarfecha_emisionPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_ventaPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarfecha_ventaPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jDateChooserfecha_pagoPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarfecha_pagoPlaneacionPagos);
		this.jInternalFrameDetalleFormPlaneacionPagos.jTextFieldsaldoPlaneacionPagos.setEnabled(this.planeacionpagosConstantesFunciones.activarsaldoPlaneacionPagos);
		}
	}
	
		
}