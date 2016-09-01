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

import com.bydan.erp.cartera.util.MontoConstantesFunciones;
import com.bydan.erp.cartera.util.MontoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.MontoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.MontoBean;
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
public class MontoBeanSwingJInternalFrame extends MontoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MontoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Monto> montoValidator = new ClassValidator<Monto>(Monto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Monto monto;	
	public Monto montoAux;
	public Monto montoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Monto montoTotales;
	public Long idMontoActual;
	public Long iIdNuevoMonto=0L;
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
	
	public Boolean isPermisoTodoMonto;
	public Boolean isPermisoNuevoMonto;
	public Boolean isPermisoActualizarMonto;
	public Boolean isPermisoActualizarOriginalMonto;
	public Boolean isPermisoEliminarMonto;
	public Boolean isPermisoGuardarCambiosMonto;
	public Boolean isPermisoConsultaMonto;
	public Boolean isPermisoBusquedaMonto;
	public Boolean isPermisoReporteMonto;
	public Boolean isPermisoPaginacionMedioMonto;
	public Boolean isPermisoPaginacionAltoMonto;
	public Boolean isPermisoPaginacionTodoMonto;
	public Boolean isPermisoCopiarMonto;
	public Boolean isPermisoVerFormMonto;
	public Boolean isPermisoDuplicarMonto;
	public Boolean isPermisoOrdenMonto;
	
	
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
	
	public MontoParameterReturnGeneral montoReturnGeneral;
	public MontoParameterReturnGeneral montoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMonto=false;
	public Boolean esParaAccionDesdeFormularioMonto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MontoSessionBeanAdditional montoSessionBeanAdditional=null;
	
	public MontoSessionBeanAdditional getMontoSessionBeanAdditional() {
		return this.montoSessionBeanAdditional;
	}
	
	public void setMontoSessionBeanAdditional(MontoSessionBeanAdditional montoSessionBeanAdditional) {
		try {
			this.montoSessionBeanAdditional=montoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MontoBeanSwingJInternalFrameAdditional montoBeanSwingJInternalFrameAdditional=null;
	//public class MontoBeanSwingJInternalFrame
	
	public MontoBeanSwingJInternalFrameAdditional getMontoBeanSwingJInternalFrameAdditional() {
		return this.montoBeanSwingJInternalFrameAdditional;
	}
	
	public void setMontoBeanSwingJInternalFrameAdditional(MontoBeanSwingJInternalFrameAdditional montoBeanSwingJInternalFrameAdditional) {
		try {
			this.montoBeanSwingJInternalFrameAdditional=montoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MontoLogic montoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Monto montoBean;
	public MontoConstantesFunciones montoConstantesFunciones;
	//public MontoParameterReturnGeneral montoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<Monto> montos;	
	//public List<Monto> montosEliminados;
	//public List<Monto> montosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMonto=false;
	public Boolean isVisibilidadCeldaDuplicarMonto=true;
	public Boolean isVisibilidadCeldaCopiarMonto=true;
	public Boolean isVisibilidadCeldaVerFormMonto=true;
	public Boolean isVisibilidadCeldaOrdenMonto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMonto=false;
	public Boolean isVisibilidadCeldaModificarMonto=false;
	public Boolean isVisibilidadCeldaActualizarMonto=false;
	public Boolean isVisibilidadCeldaEliminarMonto=false;
	public Boolean isVisibilidadCeldaCancelarMonto=false;
	public Boolean isVisibilidadCeldaGuardarMonto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMonto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorEsGeneral=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoMonto() {
		return this.iIdNuevoMonto;
	}

	public void setiIdNuevoMonto(Long iIdNuevoMonto) {
		this.iIdNuevoMonto = iIdNuevoMonto;
	}
	
	public Long getidMontoActual() {
		return this.idMontoActual;
	}

	public void setidMontoActual(Long idMontoActual) {
		this.idMontoActual = idMontoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Monto getmonto() {
		return this.monto;
	}

	public void setmonto(Monto monto) {
		this.monto = monto;
	}
	
	public Monto getmontoAux() {
		return this.montoAux;
	}

	public void setmontoAux(Monto montoAux) {
		this.montoAux = montoAux;
	}				
	
	public Monto getmontoAnterior() {
		return this.montoAnterior;
	}

	public void setmontoAnterior(Monto montoAnterior) {
		this.montoAnterior = montoAnterior;
	}	
	
	public Monto getmontoTotales() {
		return this.montoTotales;
	}

	public void setmontoTotales(Monto montoTotales) {
		this.montoTotales = montoTotales;
	}	
	
	public Monto getmontoBean() {
		return this.montoBean;
	}

	public void setmontoBean(Monto montoBean) {
		this.montoBean = montoBean;
	}	
	
	public MontoParameterReturnGeneral getmontoReturnGeneral() {
		return this.montoReturnGeneral;
	}

	public void setmontoReturnGeneral(MontoParameterReturnGeneral montoReturnGeneral) {
		this.montoReturnGeneral = montoReturnGeneral;
	}	
	
	
	public Boolean es_generalBusquedaPorEsGeneral=false;

	public Boolean getes_generalBusquedaPorEsGeneral() {
		return this.es_generalBusquedaPorEsGeneral;
	}

	public void setes_generalBusquedaPorEsGeneral(Boolean es_generalBusquedaPorEsGeneral) {
		this.es_generalBusquedaPorEsGeneral = es_generalBusquedaPorEsGeneral;
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
	
	
	public MontoLogic getMontoLogic()	{		
		return montoLogic;
	}

	public void setMontoLogic(MontoLogic montoLogic) {
		this.montoLogic = montoLogic;
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
	
	public Boolean getIsEsNuevoMonto() {
		return isEsNuevoMonto;
	}

	public void setIsEsNuevoMonto(Boolean isEsNuevoMonto) {
		this.isEsNuevoMonto = isEsNuevoMonto;
	}

	public Boolean getEsParaAccionDesdeFormularioMonto() {
		return esParaAccionDesdeFormularioMonto;
	}
	
	public void setEsParaAccionDesdeFormularioMonto(Boolean esParaAccionDesdeFormularioMonto) {
		this.esParaAccionDesdeFormularioMonto = esParaAccionDesdeFormularioMonto;
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

			if(this.montoSessionBean==null) {
				this.montoSessionBean=new MontoSessionBean();
			}

			if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(montoSessionBean.getlidEmpresaActual());
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

			if(this.montoSessionBean==null) {
				this.montoSessionBean=new MontoSessionBean();
			}

			if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(montoSessionBean.getlidSucursalActual());
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

			if(this.montoSessionBean==null) {
				this.montoSessionBean=new MontoSessionBean();
			}

			if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(montoSessionBean.getlidClienteActual());
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

					if(this.monto!=null) {
						this.monto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMonto!=null) {
						this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMonto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMonto!=null) {
						if(this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMontoGenerico)throws Exception
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
				jComboBoxid_empresaMontoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMontoGenerico!=null && jComboBoxid_empresaMontoGenerico.getItemCount()>0) {
					jComboBoxid_empresaMontoGenerico.setSelectedIndex(0);
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

					if(this.monto!=null) {
						this.monto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMonto!=null) {
						this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMonto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMonto!=null) {
						if(this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMontoGenerico)throws Exception
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
				jComboBoxid_sucursalMontoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMontoGenerico!=null && jComboBoxid_sucursalMontoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMontoGenerico.setSelectedIndex(0);
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

					if(this.monto!=null) {
						this.monto.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormMonto!=null) {
						this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteMonto.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormMonto!=null) {
						if(this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteMonto!=null) {
						jComboBoxid_clienteFK_IdClienteMonto.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteMonto!=null) {
							//jComboBoxid_clienteFK_IdClienteMonto.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteMonto.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteMonto.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteMontoGenerico)throws Exception
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
				jComboBoxid_clienteMontoGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteMontoGenerico!=null && jComboBoxid_clienteMontoGenerico.getItemCount()>0) {
					jComboBoxid_clienteMontoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Monto monto,JComboBox jComboBoxid_empresaMontoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMontoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMontoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				monto.setid_empresa(empresaAux.getId());
				monto.setempresa_descripcion(MontoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				monto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Monto monto,JComboBox jComboBoxid_sucursalMontoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMontoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMontoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				monto.setid_sucursal(sucursalAux.getId());
				monto.setsucursal_descripcion(MontoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				monto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Monto monto,JComboBox jComboBoxid_clienteMontoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteMontoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteMontoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				monto.setid_cliente(clienteAux.getId());
				monto.setcliente_descripcion(MontoConstantesFunciones.getClienteDescripcion(clienteAux));
				monto.setCliente(clienteAux);			}
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

					if(!MontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMonto!=null) { 
							this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMonto!=null) { 
					}

					if(!MontoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMonto!=null) { 
							this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMonto!=null) { 
					}

					if(!MontoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMonto!=null) { 
							this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMonto!=null) { 
					}

					if(!MontoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MontoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteMonto.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteMonto.addItem(cliente);
							}
						}

						if(!MontoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMonto!=null) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMonto!=null) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMonto!=null) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMonto!=null) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMonto!=null) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormMonto!=null) {
							this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteMonto.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteMonto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMonto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MontoConstantesFunciones.refrescarForeignKeysDescripcionesMonto(this.montoLogic.getMontos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MontoConstantesFunciones.refrescarForeignKeysDescripcionesMonto(this.montos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//montoLogic.setMontos(this.montos);
			montoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MontoParameterReturnGeneral getMontoParameterGeneral() {
		return this.montoParameterGeneral;
	}
	
	public void setMontoParameterGeneral(MontoParameterReturnGeneral montoParameterGeneral) {
		this.montoParameterGeneral = montoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMonto() {
		return isPermisoTodoMonto;
	}

	public void setIsPermisoTodoMonto(Boolean isPermisoTodoMonto) {
		this.isPermisoTodoMonto = isPermisoTodoMonto;
	}

	public Boolean getIsPermisoNuevoMonto() {
		return isPermisoNuevoMonto;
	}

	public void setIsPermisoNuevoMonto(Boolean isPermisoNuevoMonto) {
		this.isPermisoNuevoMonto = isPermisoNuevoMonto;
	}

	public Boolean getIsPermisoActualizarMonto() {
		return isPermisoActualizarMonto;
	}

	public void setIsPermisoActualizarMonto(Boolean isPermisoActualizarMonto) {
		this.isPermisoActualizarMonto = isPermisoActualizarMonto;
	}

	public Boolean getIsPermisoEliminarMonto() {
		return isPermisoEliminarMonto;
	}

	public void setIsPermisoEliminarMonto(Boolean isPermisoEliminarMonto) {
		this.isPermisoEliminarMonto = isPermisoEliminarMonto;
	}

	public Boolean getIsPermisoGuardarCambiosMonto() {
		return isPermisoGuardarCambiosMonto;
	}

	public void setIsPermisoGuardarCambiosMonto(Boolean isPermisoGuardarCambiosMonto) {
		this.isPermisoGuardarCambiosMonto = isPermisoGuardarCambiosMonto;
	}
	
	public Boolean getIsPermisoConsultaMonto() {
		return isPermisoConsultaMonto;
	}

	public void setIsPermisoConsultaMonto(Boolean isPermisoConsultaMonto) {
		this.isPermisoConsultaMonto = isPermisoConsultaMonto;
	}

	public Boolean getIsPermisoBusquedaMonto() {
		return isPermisoBusquedaMonto;
	}

	public void setIsPermisoBusquedaMonto(Boolean isPermisoBusquedaMonto) {
		this.isPermisoBusquedaMonto = isPermisoBusquedaMonto;
	}

	public Boolean getIsPermisoReporteMonto() {
		return isPermisoReporteMonto;
	}

	public void setIsPermisoReporteMonto(Boolean isPermisoReporteMonto) {
		this.isPermisoReporteMonto = isPermisoReporteMonto;
	}
	
	public Boolean getIsPermisoPaginacionMedioMonto() {
		return isPermisoPaginacionMedioMonto;
	}

	public void setIsPermisoPaginacionMedioMonto(Boolean isPermisoPaginacionMedioMonto) {
		this.isPermisoPaginacionMedioMonto = isPermisoPaginacionMedioMonto;
	}
	
	public Boolean getIsPermisoPaginacionTodoMonto() {
		return isPermisoPaginacionTodoMonto;
	}

	public void setIsPermisoPaginacionTodoMonto(Boolean isPermisoPaginacionTodoMonto) {
		this.isPermisoPaginacionTodoMonto = isPermisoPaginacionTodoMonto;
	}
	
	public Boolean getIsPermisoPaginacionAltoMonto() {
		return isPermisoPaginacionAltoMonto;
	}

	public void setIsPermisoPaginacionAltoMonto(Boolean isPermisoPaginacionAltoMonto) {
		this.isPermisoPaginacionAltoMonto = isPermisoPaginacionAltoMonto;
	}
	
	public Boolean getIsPermisoCopiarMonto() {
		return isPermisoCopiarMonto;
	}

	public void setIsPermisoCopiarMonto(Boolean isPermisoCopiarMonto) {
		this.isPermisoCopiarMonto = isPermisoCopiarMonto;
	}
	
	public Boolean getIsPermisoVerFormMonto() {
		return isPermisoVerFormMonto;
	}

	public void setIsPermisoVerFormMonto(Boolean isPermisoVerFormMonto) {
		this.isPermisoVerFormMonto = isPermisoVerFormMonto;
	}
	
	public Boolean getIsPermisoDuplicarMonto() {
		return isPermisoDuplicarMonto;
	}

	public void setIsPermisoDuplicarMonto(Boolean isPermisoDuplicarMonto) {
		this.isPermisoDuplicarMonto = isPermisoDuplicarMonto;
	}
	
	public Boolean getIsPermisoOrdenMonto() {
		return isPermisoOrdenMonto;
	}

	public void setIsPermisoOrdenMonto(Boolean isPermisoOrdenMonto) {
		this.isPermisoOrdenMonto = isPermisoOrdenMonto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMonto() {
		return isVisibilidadCeldaNuevoMonto;
	}

	public void setIsVisibilidadCeldaNuevoMonto(Boolean isVisibilidadCeldaNuevoMonto) {
		this.isVisibilidadCeldaNuevoMonto = isVisibilidadCeldaNuevoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMonto() {
		return isVisibilidadCeldaDuplicarMonto;
	}

	public void setIsVisibilidadCeldaDuplicarMonto(Boolean isVisibilidadCeldaDuplicarMonto) {
		this.isVisibilidadCeldaDuplicarMonto = isVisibilidadCeldaDuplicarMonto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMonto() {
		return isVisibilidadCeldaCopiarMonto;
	}

	public void setIsVisibilidadCeldaCopiarMonto(Boolean isVisibilidadCeldaCopiarMonto) {
		this.isVisibilidadCeldaCopiarMonto = isVisibilidadCeldaCopiarMonto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMonto() {
		return isVisibilidadCeldaVerFormMonto;
	}

	public void setIsVisibilidadCeldaVerFormMonto(Boolean isVisibilidadCeldaVerFormMonto) {
		this.isVisibilidadCeldaVerFormMonto = isVisibilidadCeldaVerFormMonto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMonto() {
		return isVisibilidadCeldaOrdenMonto;
	}

	public void setIsVisibilidadCeldaOrdenMonto(Boolean isVisibilidadCeldaOrdenMonto) {
		this.isVisibilidadCeldaOrdenMonto = isVisibilidadCeldaOrdenMonto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMonto() {
		return isVisibilidadCeldaNuevoRelacionesMonto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMonto(Boolean isVisibilidadCeldaNuevoRelacionesMonto) {
		this.isVisibilidadCeldaNuevoRelacionesMonto = isVisibilidadCeldaNuevoRelacionesMonto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMonto() {
		return isVisibilidadCeldaModificarMonto;
	}

	public void setIsVisibilidadCeldaModificarMonto(Boolean isVisibilidadCeldaModificarMonto) {
		this.isVisibilidadCeldaModificarMonto = isVisibilidadCeldaModificarMonto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMonto() {
		return isVisibilidadCeldaActualizarMonto;
	}

	public void setIsVisibilidadCeldaActualizarMonto(Boolean isVisibilidadCeldaActualizarMonto) {
		this.isVisibilidadCeldaActualizarMonto = isVisibilidadCeldaActualizarMonto;
	}

	public Boolean getIsVisibilidadCeldaEliminarMonto() {
		return isVisibilidadCeldaEliminarMonto;
	}

	public void setIsVisibilidadCeldaEliminarMonto(Boolean isVisibilidadCeldaEliminarMonto) {
		this.isVisibilidadCeldaEliminarMonto = isVisibilidadCeldaEliminarMonto;
	}

	public Boolean getIsVisibilidadCeldaCancelarMonto() {
		return isVisibilidadCeldaCancelarMonto;
	}

	public void setIsVisibilidadCeldaCancelarMonto(Boolean isVisibilidadCeldaCancelarMonto) {
		this.isVisibilidadCeldaCancelarMonto = isVisibilidadCeldaCancelarMonto;
	}

	public Boolean getIsVisibilidadCeldaGuardarMonto() {
		return isVisibilidadCeldaGuardarMonto;
	}

	public void setIsVisibilidadCeldaGuardarMonto(Boolean isVisibilidadCeldaGuardarMonto) {
		this.isVisibilidadCeldaGuardarMonto = isVisibilidadCeldaGuardarMonto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMonto() {
		return isVisibilidadCeldaGuardarCambiosMonto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMonto(Boolean isVisibilidadCeldaGuardarCambiosMonto) {
		this.isVisibilidadCeldaGuardarCambiosMonto = isVisibilidadCeldaGuardarCambiosMonto;
	}
		
	public MontoSessionBean getmontoSessionBean() {
		return this.montoSessionBean;
	}
	
	public void setmontoSessionBean(MontoSessionBean montoSessionBean) {
		this.montoSessionBean=montoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorEsGeneral() {
		return this.isVisibilidadBusquedaPorEsGeneral;
	}

	public void setisVisibilidadBusquedaPorEsGeneral(Boolean isVisibilidadBusquedaPorEsGeneral) {
		this.isVisibilidadBusquedaPorEsGeneral=isVisibilidadBusquedaPorEsGeneral;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMonto(Monto monto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(monto,null);
				this.setActualParaGuardarSucursalForeignKey(monto,null);
				this.setActualParaGuardarClienteForeignKey(monto,null);
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
	
	public void bugActualizarReferenciaActual(Monto monto,Monto montoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMonto(monto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		montoAux.setId(monto.getId());
		montoAux.setVersionRow(monto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMonto();
		
			int intSelectedRow = this.jTableDatosMonto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = montoValidator.getInvalidValues(this.monto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			montoLogic.setDatosCliente(datosCliente);
			montoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				montoAux=new  Monto();
				
				montoAux.setIsNew(true);
				montoAux.setIsChanged(true);
				
				montoAux.setMontoOriginal(this.monto);
				
				montoAux.setId(this.monto.getId());	
				montoAux.setVersionRow(this.monto.getVersionRow());	
				montoAux.setid_empresa(this.monto.getid_empresa());	
				montoAux.setid_sucursal(this.monto.getid_sucursal());	
				montoAux.setid_cliente(this.monto.getid_cliente());	
				montoAux.setvalor_inicio(this.monto.getvalor_inicio());	
				montoAux.setvalor_fin(this.monto.getvalor_fin());	
				montoAux.setnumero_dias(this.monto.getnumero_dias());	
				montoAux.setnumero_cuota(this.monto.getnumero_cuota());	
				montoAux.setes_general(this.monto.getes_general());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.montoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.montoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(montoAux,montoLogic.getMontos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(montoAux,montos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.montoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.montoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.saveMontos();//WithConnection
						//montoLogic.getSetVersionRowMontos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.monto,montoAux);
					
					this.refrescarForeignKeysDescripcionesMonto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.montoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.montoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								montoLogic.saveMontoRelaciones(montoAux);//WithConnection
								//montoLogic.getSetVersionRowMontos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.monto,montoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.montoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.montoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(montoAux,montoLogic.getMontos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(montoAux,montos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.monto,montoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				montoAux=new  Monto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.montoSessionBean.getEsGuardarRelacionado() 
					|| (this.montoSessionBean.getEsGuardarRelacionado() && this.monto.getId()>=0)) {
						
					montoAux.setIsNew(false);
				}
				
				montoAux.setIsDeleted(false);
			
				montoAux.setId(this.monto.getId());	
				montoAux.setVersionRow(this.monto.getVersionRow());	
				montoAux.setid_empresa(this.monto.getid_empresa());	
				montoAux.setid_sucursal(this.monto.getid_sucursal());	
				montoAux.setid_cliente(this.monto.getid_cliente());	
				montoAux.setvalor_inicio(this.monto.getvalor_inicio());	
				montoAux.setvalor_fin(this.monto.getvalor_fin());	
				montoAux.setnumero_dias(this.monto.getnumero_dias());	
				montoAux.setnumero_cuota(this.monto.getnumero_cuota());	
				montoAux.setes_general(this.monto.getes_general());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(montoAux,montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(montoAux,montos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.montoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.montoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.saveMontos();//WithConnection
						//montoLogic.getSetVersionRowMontos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.monto,montoAux);
					
					this.refrescarForeignKeysDescripcionesMonto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.montoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.montoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								montoLogic.saveMontoRelaciones(montoAux);//WithConnection
								//montoLogic.getSetVersionRowMontos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.monto,montoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.montoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.montoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(montoAux,montoLogic.getMontos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(montoAux,montos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.monto,montoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				montoAux=new  Monto();
				
				montoAux.setIsNew(false);
				montoAux.setIsChanged(false);
				
				montoAux.setIsDeleted(true);
				
				montoAux.setId(this.monto.getId());	
				montoAux.setVersionRow(this.monto.getVersionRow());	
				montoAux.setid_empresa(this.monto.getid_empresa());	
				montoAux.setid_sucursal(this.monto.getid_sucursal());	
				montoAux.setid_cliente(this.monto.getid_cliente());	
				montoAux.setvalor_inicio(this.monto.getvalor_inicio());	
				montoAux.setvalor_fin(this.monto.getvalor_fin());	
				montoAux.setnumero_dias(this.monto.getnumero_dias());	
				montoAux.setnumero_cuota(this.monto.getnumero_cuota());	
				montoAux.setes_general(this.monto.getes_general());	
				
				if(this.montoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.montoAux.getId()>=0) {	
						this.montosEliminados.add(montoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(montoAux,montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(montoAux,montos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.montoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.montoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.saveMontos();//WithConnection
						//montoLogic.getSetVersionRowMontos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.montoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.montoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								montoLogic.saveMontoRelaciones(montoAux);//WithConnection
								//montoLogic.getSetVersionRowMontos();//WithConnection
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
							if(this.montoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.montoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(montoAux,montoLogic.getMontos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(montoAux,montos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getMontos().addAll(this.montosEliminados);
					
					montoLogic.saveMontos();//WithConnection
					//montoLogic.getSetVersionRowMontos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMonto();
				
				this.montosEliminados= new ArrayList<Monto>();		
			}
			
			if(this.montoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Monto De Facturacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.monto=montoAux;
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
      		//this.finishProcessMonto();
      	}
		
	}	
	
	public void actualizarRelaciones(Monto montoLocal) throws Exception {
		
		if(this.montoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Monto montoLocal) throws Exception {	
		if(this.montoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				montoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				montoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				montoLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMontoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMonto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = montoValidator.getInvalidValues(this.monto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Monto monto,List<Monto> montos) throws Exception {
		try	{		
			MontoConstantesFunciones.actualizarLista(monto,montos,this.montoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Monto monto,List<Monto> montos) throws Exception {
		try	{			
			MontoConstantesFunciones.actualizarSelectedLista(monto,montos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Monto> montosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				montosLocal=this.montoLogic.getMontos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				montosLocal=this.montos;
			}
			//ARCHITECTURE
		
			for(Monto montoLocal:montosLocal) {
				if(this.permiteMantenimiento(montoLocal) && montoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MontoConstantesFunciones.getMontoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelid_empresaMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelid_sucursalMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelid_clienteMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.VALORINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelvalor_inicioMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.VALORFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelvalor_finMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelnumero_diasMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.NUMEROCUOTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelnumero_cuotaMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MontoConstantesFunciones.ESGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabeles_generalMonto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelid_empresaMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelid_sucursalMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelid_clienteMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelvalor_inicioMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelvalor_finMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelnumero_diasMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabelnumero_cuotaMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMonto.jLabeles_generalMonto,"");
		
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
		this.iIdNuevoMonto--;	
		
		
		this.montoAux=new Monto();
		
		this.montoAux.setId(this.iIdNuevoMonto);
		this.montoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.montoLogic.getMontos().add(this.montoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.montos.add(this.montoAux);
		}
		//ARCHITECTURE
		
		this.monto=this.montoAux;
		
		if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMonto(this.monto);
			this.setVariablesObjetoActualToFormularioForeignKeyMonto(this.monto);
		}
				
		//this.setDefaultControlesMonto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMonto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMonto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMonto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMonto(this.montoBean,this.monto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MontoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.montoSessionBean.getConGuardarRelaciones()) {
			classes=MontoConstantesFunciones.getClassesRelationshipsOfMonto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.montoReturnGeneral=montoLogic.procesarEventosMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.montoLogic.getMontos(),this.monto,this.montoParameterGeneral,this.isEsNuevoMonto,classes);//this.montoLogic.getMonto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMonto(this.montoReturnGeneral,this.montoBean,false);
		
		if(this.montoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMonto(this.montoReturnGeneral.getMonto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMonto(this.montoReturnGeneral.getMonto());
		}
		
		if(this.montoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMonto(this.montoReturnGeneral.getMonto(),classes);//this.montoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMonto(this.monto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMonto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMonto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MontoBeanSwingJInternalFrameAdditional.RecargarFormMonto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMonto(false);
						
			if(montoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMonto();
			}
			
			this.actualizarVisualTableDatosMonto();
			
			this.jTableDatosMonto.setRowSelectionInterval(this.getIndiceNuevoMonto(), this.getIndiceNuevoMonto());
			
			this.seleccionarFilaTablaMontoActual();
						
			this.actualizarEstadoCeldasBotonesMonto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMonto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarvalor_inicioMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarvalor_finMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarnumero_diasMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarnumero_cuotaMonto);
		this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activares_generalMonto);	
		//
		this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarid_empresaMonto);//
		this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarid_sucursalMonto);
		this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setEnabled(isHabilitar && this.montoConstantesFunciones.activarid_clienteMonto);
	};
	
	public void setDefaultControlesMonto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMonto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.montoSessionBean.setConGuardarRelaciones(true);			
			this.montoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.setVisible(true);
			
					
		} else {
			//this.montoSessionBean.setConGuardarRelaciones(false);			
			this.montoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMonto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Monto montoAux:this.montoLogic.getMontos()) {
				if(montoAux.getId().equals(this.iIdNuevoMonto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Monto montoAux:this.montos) {
				if(montoAux.getId().equals(this.iIdNuevoMonto)) {
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
	
	public int getIndiceActualMonto(Monto monto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Monto montoAux:this.montoLogic.getMontos()) {
				if(montoAux.getId().equals(monto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Monto montoAux:this.montos) {
				if(montoAux.getId().equals(monto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMonto(Monto montoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Monto montoAux:this.montoLogic.getMontos()) {
				if(montoAux.getMontoOriginal().getId().equals(montoOriginal.getId())) {
					existe=true;
					montoOriginal.setId(montoAux.getId());
					montoOriginal.setVersionRow(montoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Monto montoAux:this.montos) {
				if(montoAux.getMontoOriginal().getId().equals(montoOriginal.getId())) {
					existe=true;
					montoOriginal.setId(montoAux.getId());
					montoOriginal.setVersionRow(montoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMonto(Boolean esParaCancelar) throws Exception {
		montosAux=new ArrayList<Monto>();
		montoAux=new Monto();
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Monto montoAux:this.montoLogic.getMontos()) {
					if(montoAux.getId()<0) {
						montosAux.add(montoAux);
					}		
				}
				this.iIdNuevoMonto=0L;
				this.montoLogic.getMontos().removeAll(montosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Monto montoAux:this.montos) {
					if(montoAux.getId()<0) {
						montosAux.add(montoAux);
					}		
				}
				this.iIdNuevoMonto=0L;
				this.montos.removeAll(montosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMonto 
					&& this.montoLogic.getMontos().size()>0
					) {
					montoAux=this.montoLogic.getMontos().get(this.montoLogic.getMontos().size() - 1);
				
					if(montoAux.getId()<0) {
						this.montoLogic.getMontos().remove(montoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMonto && this.montos.size()>0) {
					montoAux=this.montos.get(this.montos.size() - 1);
				
					if(montoAux.getId()<0) {
						this.montos.remove(montoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMonto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(monto.getId()<0) {
				this.montoLogic.getMontos().remove(this.monto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(monto.getId()<0) {
				this.montos.remove(this.monto);
			}
		}			
	}
	
	public void setEstadosInicialesMonto(List<Monto> montosAux) throws Exception {
		MontoConstantesFunciones.setEstadosInicialesMonto(montosAux);
	}
	
	public void setEstadosInicialesMonto(Monto montoAux) throws Exception {
		MontoConstantesFunciones.setEstadosInicialesMonto(montoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMontoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMontoActual()) {
				if(!this.isEsNuevoMonto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMonto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMontoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Monto De Facturacion ?", "MANTENIMIENTO DE Monto De Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Monto monto) throws Exception {
		MontoConstantesFunciones.seleccionarAsignar(this.monto,monto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMonto=this.isPermisoActualizarOriginalMonto;
			
			
			this.seleccionarAsignar(monto);
			
			

			idClienteActual=monto.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MontoConstantesFunciones.quitarEspaciosMonto(this.monto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMonto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.montoSessionBean.setsFuncionBusquedaRapida(this.montoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoMonto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMonto(esParaCancelar);				
				this.cancelarNuevoMonto(esParaCancelar);								
			}
			
			this.monto=new Monto();
			
			this.inicializarMonto();
			
			this.actualizarEstadoCeldasBotonesMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMonto() throws Exception {
		try {
			MontoConstantesFunciones.inicializarMonto(this.monto);
			
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
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.montoLogic.getMontos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMontos(String sAccionBusqueda,List<Monto> montosParaReportes) throws Exception {
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
					sPathReporteFinal="Monto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MontoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MontoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Monto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Monto De Facturacions");		
		parameters.put("busquedapor", MontoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMonto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MontoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MontoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMonto=new JRBeanArrayDataSource(MontoJInternalFrame.TraerMontoBeans(montosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMonto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MontoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MontoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MontoBean.TraerMontoBeans(montosParaReportes).toArray()));
							
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
				this.generarExcelReporteMontos(sAccionBusqueda,sTipoArchivoReporte,montosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMontos(sAccionBusqueda,sTipoArchivoReporte,montosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMontoActionPerformed(null);
					//this.generarExcelReporteMontos(sAccionBusqueda,sTipoArchivoReporte,montosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMontos(sAccionBusqueda,sTipoArchivoReporte,montosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMontos(sAccionBusqueda,sTipoArchivoReporte,montosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMontos(sAccionBusqueda,sTipoArchivoReporte,montosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMontos(String sAccionBusqueda,String sTipoArchivoReporte,List<Monto> montosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Montos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMonto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Monto monto : montosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MontoConstantesFunciones.generarExcelReporteDataMonto("NORMAL",row,workbook,monto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMonto(String sTipo,Row row,Workbook workbook) {
		
		MontoConstantesFunciones.generarExcelReporteHeaderMonto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMontos(String sAccionBusqueda,String sTipoArchivoReporte,List<Monto> montosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Montos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Monto monto : montosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MontoConstantesFunciones.getMontoDescripcion(monto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_VALORINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_VALORINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getvalor_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_VALORFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_VALORFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getvalor_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getnumero_dias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_NUMEROCUOTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_NUMEROCUOTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(monto.getnumero_cuota());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MontoConstantesFunciones.LABEL_ESGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MontoConstantesFunciones.LABEL_ESGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(monto.getes_general()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMontos(String sAccionBusqueda,String sTipoArchivoReporte,List<Monto> montosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Monto> montosRespaldo=null;
		
		classes=MontoConstantesFunciones.getClassesRelationshipsOfMonto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.montoLogic.setDatosCliente(this.datosCliente);
		this.montoLogic.setDatosDeep(this.datosDeep);
		this.montoLogic.setIsConDeep(true);
		
		montosRespaldo=this.montoLogic.getMontos();
		
		this.montoLogic.setMontos(montosParaReportes);	
		this.montoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		montosParaReportes=this.montoLogic.getMontos();
		this.montoLogic.setMontos(montosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Montos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMonto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Monto monto : montosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMonto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MontoConstantesFunciones.generarExcelReporteDataMonto("NORMAL",row,workbook,monto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MontoConstantesFunciones.getMontoDescripcion(monto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMonto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMonto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMonto() throws Exception {		
		this.startProcessMonto(true);
	}
	
	public void startProcessMonto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMonto ,this.jPanelParametrosReportesMonto, this.jScrollPanelDatosMonto,this.jPanelPaginacionMonto, this.jScrollPanelDatosEdicionMonto, this.jPanelAccionesMonto,this.jPanelAccionesFormularioMonto,this.jmenuBarMonto,this.jmenuBarDetalleMonto,this.jTtoolBarMonto,this.jTtoolBarDetalleMonto);		
		
		final JTabbedPane jTabbedPaneBusquedasMonto=this.jTabbedPaneBusquedasMonto; 
		
		final JPanel jPanelParametrosReportesMonto=this.jPanelParametrosReportesMonto;
		//final JScrollPane jScrollPanelDatosMonto=this.jScrollPanelDatosMonto;
		final JTable jTableDatosMonto=this.jTableDatosMonto;		
		final JPanel jPanelPaginacionMonto=this.jPanelPaginacionMonto;
		//final JScrollPane jScrollPanelDatosEdicionMonto=this.jScrollPanelDatosEdicionMonto;
		final JPanel jPanelAccionesMonto=this.jPanelAccionesMonto;
		
		JPanel jPanelCamposAuxiliarMonto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMonto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
			jPanelCamposAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jPanelCamposMonto;
			jPanelAccionesFormularioAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jPanelAccionesFormularioMonto;
		}
		
		final JPanel jPanelCamposMonto=jPanelCamposAuxiliarMonto;
		final JPanel jPanelAccionesFormularioMonto=jPanelAccionesFormularioAuxiliarMonto;
		
		
		final JMenuBar jmenuBarMonto=this.jmenuBarMonto;
		final JToolBar jTtoolBarMonto=this.jTtoolBarMonto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMonto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMonto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
			jmenuBarDetalleAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jmenuBarDetalleMonto;
			jTtoolBarDetalleAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jTtoolBarDetalleMonto;
		}
		
		final JMenuBar jmenuBarDetalleMonto=jmenuBarDetalleAuxiliarMonto;
		final JToolBar jTtoolBarDetalleMonto=jTtoolBarDetalleAuxiliarMonto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMonto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMonto;
			processRunnable.jTableDatos=jTableDatosMonto;
			processRunnable.jPanelCampos=jPanelCamposMonto;
			processRunnable.jPanelPaginacion=jPanelPaginacionMonto;
			processRunnable.jPanelAcciones=jPanelAccionesMonto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMonto;
			
			
			processRunnable.jmenuBar=jmenuBarMonto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMonto;
			processRunnable.jTtoolBar=jTtoolBarMonto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMonto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMonto ,jPanelParametrosReportesMonto,jTableDatosMonto, /*jScrollPanelDatosMonto,*/jPanelCamposMonto,jPanelPaginacionMonto, /*jScrollPanelDatosEdicionMonto,*/ jPanelAccionesMonto,jPanelAccionesFormularioMonto,jmenuBarMonto,jmenuBarDetalleMonto,jTtoolBarMonto,jTtoolBarDetalleMonto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMonto ,jPanelParametrosReportesMonto, jScrollPanelDatosMonto,jPanelPaginacionMonto, jScrollPanelDatosEdicionMonto, jPanelAccionesMonto,jPanelAccionesFormularioMonto,jmenuBarMonto,jmenuBarDetalleMonto,jTtoolBarMonto,jTtoolBarDetalleMonto);
						
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
	
	public void finishProcessMonto() {// throws Exception 
		this.finishProcessMonto(true);
	}
	
	public void finishProcessMonto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMonto ,this.jPanelParametrosReportesMonto, this.jScrollPanelDatosMonto,this.jPanelPaginacionMonto, this.jScrollPanelDatosEdicionMonto, this.jPanelAccionesMonto,this.jPanelAccionesFormularioMonto,this.jmenuBarMonto,this.jmenuBarDetalleMonto,this.jTtoolBarMonto,this.jTtoolBarDetalleMonto);		
		
		final JTabbedPane jTabbedPaneBusquedasMonto=this.jTabbedPaneBusquedasMonto; 
		
		final JPanel jPanelParametrosReportesMonto=this.jPanelParametrosReportesMonto;
		//final JScrollPane jScrollPanelDatosMonto=this.jScrollPanelDatosMonto;
		final JTable jTableDatosMonto=this.jTableDatosMonto;		
		final JPanel jPanelPaginacionMonto=this.jPanelPaginacionMonto;
		//final JScrollPane jScrollPanelDatosEdicionMonto=this.jScrollPanelDatosEdicionMonto;
		final JPanel jPanelAccionesMonto=this.jPanelAccionesMonto;
		
		JPanel jPanelCamposAuxiliarMonto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMonto=new JPanel();
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
			jPanelCamposAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jPanelCamposMonto;
			jPanelAccionesFormularioAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jPanelAccionesFormularioMonto;
		}
		
		final JPanel jPanelCamposMonto=jPanelCamposAuxiliarMonto;
		final JPanel jPanelAccionesFormularioMonto=jPanelAccionesFormularioAuxiliarMonto;
		
		
		final JMenuBar jmenuBarMonto=this.jmenuBarMonto;		
		final JToolBar jTtoolBarMonto=this.jTtoolBarMonto;
				
		JMenuBar jmenuBarDetalleAuxiliarMonto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMonto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
			jmenuBarDetalleAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jmenuBarDetalleMonto;
			jTtoolBarDetalleAuxiliarMonto=this.jInternalFrameDetalleFormMonto.jTtoolBarDetalleMonto;		
		}
		
		final JMenuBar jmenuBarDetalleMonto=jmenuBarDetalleAuxiliarMonto;
		final JToolBar jTtoolBarDetalleMonto=jTtoolBarDetalleAuxiliarMonto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMonto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMonto;
			processRunnable.jTableDatos=jTableDatosMonto;
			processRunnable.jPanelCampos=jPanelCamposMonto;
			processRunnable.jPanelPaginacion=jPanelPaginacionMonto;
			processRunnable.jPanelAcciones=jPanelAccionesMonto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMonto;
			
			
			processRunnable.jmenuBar=jmenuBarMonto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMonto;
			processRunnable.jTtoolBar=jTtoolBarMonto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMonto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMonto ,jPanelParametrosReportesMonto, jTableDatosMonto,/*jScrollPanelDatosMonto,*/jPanelCamposMonto,jPanelPaginacionMonto, /*jScrollPanelDatosEdicionMonto,*/ jPanelAccionesMonto,jPanelAccionesFormularioMonto,jmenuBarMonto,jmenuBarDetalleMonto,jTtoolBarMonto,jTtoolBarDetalleMonto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMonto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMonto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMonto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMonto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMonto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMonto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMonto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMonto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMonto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.montoConstantesFunciones.getsFinalQueryMonto();
		String  finalQueryPaginacionTodos=this.montoConstantesFunciones.getsFinalQueryMonto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MontoConstantesFunciones.getArrayColumnasGlobalesNoMonto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MontoConstantesFunciones.getArrayColumnasGlobalesMonto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MontoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.montosEliminados= new ArrayList<Monto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMonto();
		
				///*MontoSessionBean*/this.montoSessionBean=new MontoSessionBean();
			
			if(this.montoSessionBean==null) {
				this.montoSessionBean=new MontoSessionBean();
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
					this.iNumeroPaginacion=MontoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MontoConstantesFunciones.getClassesForeignKeysOfMonto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/monto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			montosAux= new ArrayList<Monto>();
			
				
			montoLogic.setDatosCliente(this.datosCliente);
			montoLogic.setDatosDeep(this.datosDeep);
			montoLogic.setIsConDeep(true);
			
			
			montoLogic.getMontoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					montoLogic.getTodosMontos(finalQueryGlobal,pagination);
					
					//montoLogic.getTodosMontosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(montoLogic.getMontos()==null|| montoLogic.getMontos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							montosAux= new ArrayList<Monto>();
							montosAux.addAll(montoLogic.getMontos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montosAux= new ArrayList<Monto>();
							montosAux.addAll(montos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							montoLogic.getTodosMontos(finalQueryGlobal+"",this.pagination);												
							
							//montoLogic.getTodosMontosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMontos("Todos",montoLogic.getMontos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							montoLogic.setMontos(new ArrayList<Monto>());					
							montoLogic.getMontos().addAll(montosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montos=new ArrayList<Monto>();
							montos.addAll(montosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMonto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMonto=this.idActual;
				
				} else if(this.idMontoActual!=null && this.idMontoActual!=0L) {
					idMonto=idMontoActual;
				}
				
					
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndicePorId(idMonto);
				
				this.montos=new ArrayList<Monto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					montoLogic.getEntity(idMonto);
					
					//montoLogic.getEntityWithConnection(idMonto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					montoLogic.setMontos(new ArrayList<Monto>());
					montoLogic.getMontos().add(montoLogic.getMonto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.montos=new ArrayList<Monto>();
					this.montos.add(monto);
				}
				
				if(montoLogic.getMonto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorEsGeneral")) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceBusquedaPorEsGeneral(es_generalBusquedaPorEsGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					montoLogic.getMontosBusquedaPorEsGeneral(finalQueryGlobal,pagination,es_generalBusquedaPorEsGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceBusquedaPorEsGeneral(es_generalBusquedaPorEsGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceBusquedaPorEsGeneral(es_generalBusquedaPorEsGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=montoLogic.getMontos()==null||montoLogic.getMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=montos==null|| montos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						montosAux=new ArrayList<Monto>();
						montosAux.addAll(montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montosAux=new ArrayList<Monto>();
							montosAux.addAll(montos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							montoLogic.getMontosBusquedaPorEsGeneral(finalQueryGlobal,pagination,es_generalBusquedaPorEsGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceBusquedaPorEsGeneral(es_generalBusquedaPorEsGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceBusquedaPorEsGeneral(es_generalBusquedaPorEsGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMontos("BusquedaPorEsGeneral",montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMontos("BusquedaPorEsGeneral",montos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.setMontos(new ArrayList<Monto>());
						montoLogic.getMontos().addAll(montosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montos=new ArrayList<Monto>();
							montos.addAll(montosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					montoLogic.getMontosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=montoLogic.getMontos()==null||montoLogic.getMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=montos==null|| montos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						montosAux=new ArrayList<Monto>();
						montosAux.addAll(montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montosAux=new ArrayList<Monto>();
							montosAux.addAll(montos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							montoLogic.getMontosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMontos("FK_IdCliente",montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMontos("FK_IdCliente",montos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.setMontos(new ArrayList<Monto>());
						montoLogic.getMontos().addAll(montosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montos=new ArrayList<Monto>();
							montos.addAll(montosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					montoLogic.getMontosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=montoLogic.getMontos()==null||montoLogic.getMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=montos==null|| montos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						montosAux=new ArrayList<Monto>();
						montosAux.addAll(montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montosAux=new ArrayList<Monto>();
							montosAux.addAll(montos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							montoLogic.getMontosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMontos("FK_IdEmpresa",montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMontos("FK_IdEmpresa",montos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.setMontos(new ArrayList<Monto>());
						montoLogic.getMontos().addAll(montosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montos=new ArrayList<Monto>();
							montos.addAll(montosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					montoLogic.getMontosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=montoLogic.getMontos()==null||montoLogic.getMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=montos==null|| montos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						montosAux=new ArrayList<Monto>();
						montosAux.addAll(montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montosAux=new ArrayList<Monto>();
							montosAux.addAll(montos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							montoLogic.getMontosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMontos("FK_IdSucursal",montoLogic.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMontos("FK_IdSucursal",montos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						montoLogic.setMontos(new ArrayList<Monto>());
						montoLogic.getMontos().addAll(montosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montos=new ArrayList<Monto>();
							montos.addAll(montosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMonto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMonto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=montoLogic.getMontos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=montos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=montoLogic.getMontos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=montos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Monto monto) {
		Boolean permite=true;
		
		if(this.monto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MontoConstantesFunciones.getOrderByListaMonto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MontoConstantesFunciones.getOrderByListaMonto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Monto monto:montoLogic.getMontos()) {
				if(monto.getsType().equals(Constantes2.S_TOTALES)) {
					montoTotales=monto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Monto monto:this.montos) {
				if(monto.getsType().equals(Constantes2.S_TOTALES)) {
					montoTotales=monto;
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
			this.montoAux=new Monto();
			this.montoAux.setsType(Constantes2.S_TOTALES);
			this.montoAux.setIsNew(false);
			this.montoAux.setIsChanged(false);
			this.montoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MontoConstantesFunciones.TotalizarValoresFilaMonto(this.montoLogic.getMontos(),this.montoAux);
				
				this.montoLogic.getMontos().add(this.montoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MontoConstantesFunciones.TotalizarValoresFilaMonto(this.montos,this.montoAux);
				
				this.montos.add(this.montoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		montoTotales=new Monto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.montoLogic.getMontos().remove(montoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.montos.remove(montoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		montoTotales=new Monto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Monto monto:montoLogic.getMontos()) {
				if(monto.getsType().equals(Constantes2.S_TOTALES)) {
					montoTotales=monto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MontoConstantesFunciones.TotalizarValoresFilaMonto(this.montoLogic.getMontos(),montoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Monto monto:this.montos) {
				if(monto.getsType().equals(Constantes2.S_TOTALES)) {
					montoTotales=monto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MontoConstantesFunciones.TotalizarValoresFilaMonto(this.montos,montoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMontosBusquedaPorEsGeneral()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorEsGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMontosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMontosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMontosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMontosBusquedaPorEsGeneral(String sFinalQuery,Boolean es_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					montoLogic.getMontosBusquedaPorEsGeneral(sFinalQuery,this.pagination,es_general);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMontosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					montoLogic.getMontosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMontosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					montoLogic.getMontosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMontosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					montoLogic.getMontosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosMonto() {
		this.isPermisoTodoMonto=false;
		this.isPermisoNuevoMonto=false;
		this.isPermisoActualizarMonto=false;
		this.isPermisoActualizarOriginalMonto=false;
		this.isPermisoEliminarMonto=false;
		this.isPermisoGuardarCambiosMonto=false;
		this.isPermisoConsultaMonto=false;
		this.isPermisoBusquedaMonto=false;
		this.isPermisoReporteMonto=false;		
		this.isPermisoOrdenMonto=false;		
		this.isPermisoPaginacionMedioMonto=false;		
		this.isPermisoPaginacionAltoMonto=false;
		this.isPermisoPaginacionTodoMonto=false;
		this.isPermisoCopiarMonto=false;		
		this.isPermisoVerFormMonto=false;		
		this.isPermisoDuplicarMonto=false;		
		this.isPermisoOrdenMonto=false;		
	}
	
	public void setPermisosUsuarioMonto(Boolean isPermiso) {
		this.isPermisoTodoMonto=isPermiso;
		this.isPermisoNuevoMonto=isPermiso;
		this.isPermisoActualizarMonto=isPermiso;
		this.isPermisoActualizarOriginalMonto=isPermiso;
		this.isPermisoEliminarMonto=isPermiso;
		this.isPermisoGuardarCambiosMonto=isPermiso;
		this.isPermisoConsultaMonto=isPermiso;
		this.isPermisoBusquedaMonto=isPermiso;
		this.isPermisoReporteMonto=isPermiso;
		this.isPermisoOrdenMonto=isPermiso;		
		this.isPermisoPaginacionMedioMonto=isPermiso;		
		this.isPermisoPaginacionAltoMonto=isPermiso;		
		this.isPermisoPaginacionTodoMonto=isPermiso;		
		this.isPermisoCopiarMonto=isPermiso;		
		this.isPermisoVerFormMonto=isPermiso;		
		this.isPermisoDuplicarMonto=isPermiso;
		this.isPermisoOrdenMonto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMonto(Boolean isPermiso) {
		//this.isPermisoTodoMonto=isPermiso;
		this.isPermisoNuevoMonto=isPermiso;
		this.isPermisoActualizarMonto=isPermiso;
		this.isPermisoActualizarOriginalMonto=isPermiso;
		this.isPermisoEliminarMonto=isPermiso;
		this.isPermisoGuardarCambiosMonto=isPermiso;
		//this.isPermisoConsultaMonto=isPermiso;
		//this.isPermisoBusquedaMonto=isPermiso;
		//this.isPermisoReporteMonto=isPermiso;
		//this.isPermisoOrdenMonto=isPermiso;		
		//this.isPermisoPaginacionMedioMonto=isPermiso;		
		//this.isPermisoPaginacionAltoMonto=isPermiso;		
		//this.isPermisoPaginacionTodoMonto=isPermiso;		
		//this.isPermisoCopiarMonto=isPermiso;		
		//this.isPermisoDuplicarMonto=isPermiso;
		//this.isPermisoOrdenMonto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMontoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MontoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMonto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMontoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMontoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMontoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMontoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMonto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MontoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.montoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MontoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMonto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMonto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMonto=this.isPermisoActualizarMonto;
			this.isPermisoEliminarMonto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMonto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMonto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMonto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMonto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMonto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMonto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMonto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMonto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMonto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMonto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMonto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMonto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMonto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.montoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMonto.setToolTipText(this.jTableDatosMonto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMonto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMonto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MontoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MontoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMonto() throws Exception {
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
	public void inicializarCombosForeignKeyMontoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMontoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MontoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMontoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyMontoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MontoParameterReturnGeneral montoReturnGeneral=new MontoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.montoConstantesFunciones.cargarid_empresaMonto)
					 || (this.esRecargarFks && this.montoConstantesFunciones.cargarid_empresaMonto)) {

					if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+montoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.montoConstantesFunciones.cargarid_sucursalMonto)
					 || (this.esRecargarFks && this.montoConstantesFunciones.cargarid_sucursalMonto)) {

					if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+montoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.montoConstantesFunciones.cargarid_clienteMonto)
					 || (this.esRecargarFks && this.montoConstantesFunciones.cargarid_clienteMonto)) {

					if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+montoSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				montoReturnGeneral=montoLogic.cargarCombosLoteForeignKeyMonto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=montoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=montoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=montoReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMonto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.montoSessionBean==null) {
				this.montoSessionBean=new MontoSessionBean();
			}

			if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.montoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyMonto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMonto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMonto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMonto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMonto(Monto monto)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(monto.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMonto(Monto monto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(monto.getCliente()!=null && !sTipoEvento.equals("id_clienteMonto")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(monto.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMonto()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.montoConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMonto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMonto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMonto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMonto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMonto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMonto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMonto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto!=null && this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto!=null && this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto!=null && this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public MontoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MontoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MontoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.montoSessionBean=new MontoSessionBean(); 
		this.montoConstantesFunciones=new MontoConstantesFunciones(); 
		this.montoBean=new Monto();//(this.montoConstantesFunciones); 		
		this.montoReturnGeneral=new MontoParameterReturnGeneral(); 
		
		this.montoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.montoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MontoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MontoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MontoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMonto(true);
			
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
			
			this.montoConstantesFunciones=new MontoConstantesFunciones(); 
			this.montoBean=new Monto();//this.montoConstantesFunciones); 			
			this.montoReturnGeneral=new MontoParameterReturnGeneral(); 
		
			MontoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Monto De Facturacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.monto=new Monto();
			this.montos = new ArrayList<Monto>();
			this.montosAux = new ArrayList<Monto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic=new MontoLogic();
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			//this.montoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.montoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMonto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMonto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMonto);	
					}
					
					if(this.jInternalFrameImportacionMonto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMonto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMonto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMonto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMonto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMonto);
				this.jInternalFrameDetalleFormMonto.setVisible(false);
				this.jInternalFrameDetalleFormMonto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMonto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMonto);
					this.jInternalFrameReporteDinamicoMonto.setVisible(false);
					this.jInternalFrameReporteDinamicoMonto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMonto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMonto);
					this.jInternalFrameImportacionMonto.setVisible(false);
					this.jInternalFrameImportacionMonto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMonto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMonto);
					this.jInternalFrameOrderByMonto.setVisible(false);
					this.jInternalFrameOrderByMonto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMontoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MontoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.montoReturnGeneral=new MontoParameterReturnGeneral();
			
			this.montoParameterGeneral=new MontoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.montoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.montoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MontoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.montoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MontoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.montoSessionBean.getEsGuardarRelacionado(),this.montoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MontoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.montoSessionBean.getEsGuardarRelacionado(),this.montoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaDuplicarMonto=true;
			this.isVisibilidadCeldaCopiarMonto=true;
			this.isVisibilidadCeldaVerFormMonto=true;
			this.isVisibilidadCeldaOrdenMonto=true;
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
			this.isVisibilidadCeldaModificarMonto=false;
			this.isVisibilidadCeldaActualizarMonto=false;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=false;
			this.isVisibilidadCeldaGuardarMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
			
			
			this.isVisibilidadBusquedaPorEsGeneral=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMonto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMonto(false);
			
			this.setPermisosUsuarioMonto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.montoSessionBean.getEsGuardarRelacionado() 
				|| (this.montoSessionBean.getEsGuardarRelacionado() && this.montoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMontoClasesRelacionadas();
			}
			
			if(this.montoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMontoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MontoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMonto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMonto();
			}
			
			if(!this.isPermisoBusquedaMonto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMonto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.montoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMonto,this.isPermisoPaginacionMedioMonto,this.isPermisoPaginacionTodoMonto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MontoConstantesFunciones.getTiposSeleccionarMonto());
				
				this.tiposColumnasSelect=MontoConstantesFunciones.getTiposSeleccionarMonto(true);
				
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
			//if(!this.montoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMonto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioMonto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioMonto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMonto() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				montoImplementable= (MontoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MontoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				montoImplementableHome= (MontoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MontoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.montos= new ArrayList<Monto>();
			this.montosEliminados= new ArrayList<Monto>();
						
			this.isEsNuevoMonto=false;
			this.esParaAccionDesdeFormularioMonto=false;
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
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMonto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMonto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.montoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MontoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MontoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMonto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMonto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMonto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMonto();
			}
			
			MontoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMonto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMonto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMonto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMonto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Monto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMonto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMonto")) {
				iIndex=this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMonto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMonto();	
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
	
	public void cargarCombosForeignKeyMonto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMonto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMonto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMontoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMonto();
		
		this.cargarCombosFrameForeignKeyMonto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMonto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMonto();
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
	
	public void jButtonNuevoMontoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.montoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			
			if(jTableDatosMonto.getRowCount()>=1) {
				jTableDatosMonto.removeRowSelectionInterval(0, jTableDatosMonto.getRowCount()-1);						
			}
			
			this.isEsNuevoMonto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMonto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMonto(true);			
			//this.monto=new Monto();
			//this.monto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMonto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMonto() ;
			
			if(MontoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMonto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.monto);	
			this.actualizarInformacion("INFO_PADRE",false,this.monto);				
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			if(this.montoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Monto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMontoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMonto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMonto.getSelectedRows().length;			
			}
			
			montosSeleccionados=this.getMontosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMonto--;			
				//Monto montoAux= new Monto();			
				//montoAux.setId(this.iIdNuevoMonto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Monto montoOrigen=new Monto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Monto montoOrigen : montosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMonto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							montoOrigen =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							montoOrigen =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMonto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.monto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMonto(montoOrigen,this.monto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.montoLogic.getMontos().add(this.montoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.montos.add(this.montoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMonto(false);
				
				this.jTableDatosMonto.setRowSelectionInterval(this.getIndiceNuevoMonto(), this.getIndiceNuevoMonto());
				
				int iLastRow =  this.jTableDatosMonto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMonto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMonto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMonto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();									
		
			Monto montoOrigen=new Monto();
			Monto montoDestino=new Monto();
				
			montosSeleccionados=this.getMontosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMonto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || montosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMonto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						montoOrigen =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						montoOrigen =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						montoDestino =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						montoDestino =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				montoOrigen =montosSeleccionados.get(0);
				montoDestino =montosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMonto(montoOrigen,montoDestino,true,false);
				
				montoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(montoDestino,montoLogic.getMontos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(montoDestino,montos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMonto(false);
				
				//this.jTableDatosMonto.setRowSelectionInterval(this.getIndiceNuevoMonto(), this.getIndiceNuevoMonto());
				
				int iLastRow =  this.jTableDatosMonto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMonto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMonto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMonto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMonto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMonto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMonto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMonto.setVisible(!isVisible);
			this.jPanelPaginacionMonto.setVisible(!isVisible);
			this.jPanelAccionesMonto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMonto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMonto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMonto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMonto();
			
			this.abrirFrameOrderByMonto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMonto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMonto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMonto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMonto.isMaximum()) {
					this.jInternalFrameDetalleFormMonto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMonto.setSize(this.jInternalFrameDetalleFormMonto.iWidthFormulario,this.jInternalFrameDetalleFormMonto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMonto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMonto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMonto.isMaximum()) {
						this.jInternalFrameDetalleFormMonto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMonto.jContentPaneDetalleMonto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMonto.jContentPaneDetalleMonto.getWidth(),MontoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMonto.jContentPaneDetalleMonto.getWidth(),MontoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMonto.jContentPaneDetalleMonto.getWidth(),MontoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMonto.setVisible(true);
	        this.jInternalFrameDetalleFormMonto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMonto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMonto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMonto,false,this);
				} else {
					this.jInternalFrameOrderByMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMonto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMonto);
				this.jInternalFrameOrderByMonto.setVisible(false);
				this.jInternalFrameOrderByMonto.setSelected(false);
				
				this.jInternalFrameOrderByMonto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMonto"));
				
				this.inicializarActualizarBindingTablaOrderByMonto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMonto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMonto==null) {
				
				this.jInternalFrameImportacionMonto=new ImportacionJInternalFrame(MontoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMonto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMonto);
				this.jInternalFrameImportacionMonto.setVisible(false);
				this.jInternalFrameImportacionMonto.setSelected(false);


				this.jInternalFrameImportacionMonto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMonto"));
				this.jInternalFrameImportacionMonto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMonto"));
				this.jInternalFrameImportacionMonto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMonto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMonto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMonto==null) {
				this.jInternalFrameReporteDinamicoMonto=new ReporteDinamicoJInternalFrame(MontoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMonto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMonto);
				this.jInternalFrameReporteDinamicoMonto.setVisible(false);
				this.jInternalFrameReporteDinamicoMonto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMonto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMonto"));
				this.jInternalFrameReporteDinamicoMonto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMonto"));
				this.jInternalFrameReporteDinamicoMonto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMonto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMonto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMonto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMonto);
			
	       	this.jInternalFrameDetalleFormMonto.setVisible(false);
	        this.jInternalFrameDetalleFormMonto.setSelected(false);
			
			//this.jInternalFrameDetalleFormMonto.dispose();
			//this.jInternalFrameDetalleFormMonto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMonto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMonto.setVisible(true);
	        this.jInternalFrameReporteDinamicoMonto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMonto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMonto.setVisible(true);
	        this.jInternalFrameImportacionMonto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMonto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMonto.setVisible(true);
	        this.jInternalFrameOrderByMonto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMonto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMonto.setVisible(false);
	        this.jInternalFrameOrderByMonto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMonto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMonto.setVisible(false);
	        this.jInternalFrameReporteDinamicoMonto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMonto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMonto.setVisible(false);
	        this.jInternalFrameImportacionMonto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMonto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMonto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMonto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMonto(true);
			//this.isEsNuevoMonto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMonto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMonto(false) ;
			
			if(montoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MontoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMonto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMonto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMontoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMonto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMonto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMonto(true);
			//this.isEsNuevoMonto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.monto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMonto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMonto(false) ;
			
			if(MontoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMonto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMonto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.montoConstantesFunciones.cargarid_clienteMonto) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingMonto(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMonto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarMontoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMonto(false);
			
			//if(!this.isEsNuevoMonto) {								
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				
			}
			
			if(this.permiteMantenimiento(this.monto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.montoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMonto=true;
					this.inicializarActualizarBindingTablaMonto(false);
					this.isEsNuevoMonto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMonto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMonto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMonto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMonto(false);
				
				this.habilitarDeshabilitarControlesMonto(false);
			
												
				
				if(MontoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMonto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMontoActionPerformed(evt,montoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMonto(this.monto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMonto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,montoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.monto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMontoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMonto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				this.monto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				this.monto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.monto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.montoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MontoModel) this.jTableDatosMonto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMonto=true;
				this.inicializarActualizarBindingTablaMonto(false);
				this.isEsNuevoMonto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMonto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMonto(false);
				
				this.habilitarDeshabilitarControlesMonto(false);
				
				
				
				if(MontoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMonto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMontoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMonto.getRowCount()>=1) {
				jTableDatosMonto.removeRowSelectionInterval(0, jTableDatosMonto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMonto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMonto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMonto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMonto(false) ;
			
			this.isEsNuevoMonto=false;
			
			if(MontoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMonto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMonto(false);
				
				//SI ES MANUAL
				if(MontoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMonto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMonto--;			
			//Monto montoAux= new Monto();			
			//montoAux.setId(this.iIdNuevoMonto);
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMonto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
			
			this.monto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.montoLogic.getMontos().add(this.montoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.montos.add(this.montoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMonto(false);
			
			this.jTableDatosMonto.setRowSelectionInterval(this.getIndiceNuevoMonto(), this.getIndiceNuevoMonto());
			
			int iLastRow =  this.jTableDatosMonto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMonto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMonto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMonto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMonto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMonto(false);
			
			//SI ES MANUAL
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMonto();
			}
			
			//this.abrirFrameTreeMonto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMontoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Monto De FacturacionS ?", "MANTENIMIENTO DE Monto De Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMonto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMonto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.montoReturnGeneral=montoLogic.procesarImportacionMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.montoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMontoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMontoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMonto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMonto.setFileImportacion(this.jInternalFrameImportacionMonto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMonto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMonto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMonto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMonto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		

		montosSeleccionados=this.getMontosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MontoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MontoBaseDesign.jrxml";
			
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
			
			this.generarReporteMontos("Todos",montosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MontoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_VALORINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_VALORFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_NUMEROCUOTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuota_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuota_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuota_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuota_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MontoConstantesFunciones.LABEL_ESGENERAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_General_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_General_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_General_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_General_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMonto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MontoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MontoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case MontoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case MontoConstantesFunciones.LABEL_VALORINICIO:
					sNombreCampoCategoria="valor_inicio";
					break;

				case MontoConstantesFunciones.LABEL_VALORFIN:
					sNombreCampoCategoria="valor_fin";
					break;

				case MontoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;

				case MontoConstantesFunciones.LABEL_NUMEROCUOTA:
					sNombreCampoCategoria="numero_cuota";
					break;

				case MontoConstantesFunciones.LABEL_ESGENERAL:
					sNombreCampoCategoria="es_general";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MontoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MontoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case MontoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case MontoConstantesFunciones.LABEL_VALORINICIO:
					sNombreCampoCategoriaValor="valor_inicio";
					break;

				case MontoConstantesFunciones.LABEL_VALORFIN:
					sNombreCampoCategoriaValor="valor_fin";
					break;

				case MontoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;

				case MontoConstantesFunciones.LABEL_NUMEROCUOTA:
					sNombreCampoCategoriaValor="numero_cuota";
					break;

				case MontoConstantesFunciones.LABEL_ESGENERAL:
					sNombreCampoCategoriaValor="es_general";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMonto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMonto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MontoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MontoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case MontoConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case MontoConstantesFunciones.LABEL_VALORINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_inicio");
					break;

				case MontoConstantesFunciones.LABEL_VALORFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_fin");
					break;

				case MontoConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
					break;

				case MontoConstantesFunciones.LABEL_NUMEROCUOTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuota",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuota");
					break;

				case MontoConstantesFunciones.LABEL_ESGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_general");
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
	
	public void jButtonGenerarExcelReporteDinamicoMontoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Montos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MontoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_VALORINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_VALORINICIO);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getvalor_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_VALORFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_VALORFIN);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getvalor_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getnumero_dias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_NUMEROCUOTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_NUMEROCUOTA);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getnumero_cuota());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MontoConstantesFunciones.LABEL_ESGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MontoConstantesFunciones.LABEL_ESGENERAL);
					iRow++;

					for(Monto monto:montosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(monto.getes_general());
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
			//	this.getFilaCabeceraExportarExcelMonto(row);				
			//	iRow++;
			//}				
			
			//for(Monto montoAux:montosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMonto(montoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMonto(false);
			
			//SI ES MANUAL
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMonto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMonto(false);
			
			//SI ES MANUAL
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMonto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMonto(false);
			
			//SI ES MANUAL
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMonto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMonto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMonto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMonto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMonto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMonto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMonto.setMinimumSize(dimensionMinimum);
		this.jTableDatosMonto.setMaximumSize(dimensionMaximum);
		this.jTableDatosMonto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMonto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMonto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMonto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMonto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMonto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMonto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMonto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMonto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MontoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MontoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMonto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMonto();
		
		this.inicializarActualizarBindingBotonesManualMonto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMonto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMonto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMonto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMonto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMonto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMonto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMonto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMonto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMonto.jCheckBoxPostAccionNuevoMonto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMonto.jCheckBoxPostAccionSinCerrarMonto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMonto.jCheckBoxPostAccionSinMensajeMonto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMonto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMonto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMonto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMonto!=null) {
				this.jInternalFrameDetalleFormMonto.jCheckBoxPostAccionNuevoMonto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMonto.jCheckBoxPostAccionSinCerrarMonto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMonto.jCheckBoxPostAccionSinMensajeMonto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMonto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMonto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMonto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMonto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMonto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMonto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMonto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMonto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMonto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMonto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMonto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMonto(Boolean esInicializar) throws Exception {
		try	{	
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMonto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMonto() throws Exception {
		try	{
			if(MontoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMonto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMonto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMonto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMonto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMonto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMonto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMonto.addItem(reporte);
			}
			
			
			if(!this.montoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMonto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMonto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMonto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMonto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMonto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMonto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMonto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMonto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMonto!=null) {
				this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMonto!=null) {
				this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMonto!=null) {
				
				if(this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMonto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMonto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMonto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMonto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MontoConstantesFunciones.getTiposSeleccionarMonto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MontoConstantesFunciones.getTiposSeleccionarMonto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMonto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMonto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMonto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MontoConstantesFunciones.getTiposSeleccionarMonto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMonto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMonto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMonto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.es_generalBusquedaPorEsGeneral=this.jCheckBoxes_generalBusquedaPorEsGeneralMonto.isSelected();
		if(this.jComboBoxid_clienteFK_IdClienteMonto.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteMonto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMonto(Boolean esInicializar) throws Exception {				
		if(MontoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMonto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMonto() throws Exception {
		this.inicializarActualizarBindingTablaMonto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMonto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMonto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMonto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMontoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMontoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMonto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMonto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=montoLogic.getMontos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=montos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMonto.setModel(new MontoModel(this.montoLogic.getMontos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMonto.setModel(new MontoModel(this.montos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMonto!=null && this.jInternalFrameOrderByMonto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMonto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MontoConstantesFunciones.SCLASSWEBTITULO,montoConstantesFunciones.resaltarSeleccionarMonto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MontoConstantesFunciones.SCLASSWEBTITULO,montoConstantesFunciones.resaltarSeleccionarMonto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_ID));

		if(this.montoConstantesFunciones.mostraridMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.montoConstantesFunciones.resaltaridMonto,this.montoConstantesFunciones.activaridMonto,iSizeTabla,this,true,"idMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.montoConstantesFunciones.resaltaridMonto,this.montoConstantesFunciones.activaridMonto,this,true,"idMonto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.montoConstantesFunciones.mostrarid_empresaMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.montoConstantesFunciones.resaltarid_empresaMonto,this,this.montoConstantesFunciones.activarid_empresaMonto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.montoConstantesFunciones.resaltarid_empresaMonto,this,this.montoConstantesFunciones.activarid_empresaMonto,false,"id_empresaMonto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.montoConstantesFunciones.mostrarid_sucursalMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.montoConstantesFunciones.resaltarid_sucursalMonto,this,this.montoConstantesFunciones.activarid_sucursalMonto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.montoConstantesFunciones.resaltarid_sucursalMonto,this,this.montoConstantesFunciones.activarid_sucursalMonto,false,"id_sucursalMonto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_IDCLIENTE));

		if(this.montoConstantesFunciones.mostrarid_clienteMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.montoConstantesFunciones.resaltarid_clienteMonto,this,this.montoConstantesFunciones.activarid_clienteMonto,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.montoConstantesFunciones.resaltarid_clienteMonto,this,this.montoConstantesFunciones.activarid_clienteMonto,true,"id_clienteMonto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_VALORINICIO));

		if(this.montoConstantesFunciones.mostrarvalor_inicioMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_VALORINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.montoConstantesFunciones.resaltarvalor_inicioMonto,this.montoConstantesFunciones.activarvalor_inicioMonto,iSizeTabla,this,true,"valor_inicioMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.montoConstantesFunciones.resaltarvalor_inicioMonto,this.montoConstantesFunciones.activarvalor_inicioMonto,this,true,"valor_inicioMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_VALORFIN));

		if(this.montoConstantesFunciones.mostrarvalor_finMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_VALORFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.montoConstantesFunciones.resaltarvalor_finMonto,this.montoConstantesFunciones.activarvalor_finMonto,iSizeTabla,this,true,"valor_finMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.montoConstantesFunciones.resaltarvalor_finMonto,this.montoConstantesFunciones.activarvalor_finMonto,this,true,"valor_finMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_NUMERODIAS));

		if(this.montoConstantesFunciones.mostrarnumero_diasMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.montoConstantesFunciones.resaltarnumero_diasMonto,this.montoConstantesFunciones.activarnumero_diasMonto,iSizeTabla,this,true,"numero_diasMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.montoConstantesFunciones.resaltarnumero_diasMonto,this.montoConstantesFunciones.activarnumero_diasMonto,this,true,"numero_diasMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_NUMEROCUOTA));

		if(this.montoConstantesFunciones.mostrarnumero_cuotaMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_NUMEROCUOTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.montoConstantesFunciones.resaltarnumero_cuotaMonto,this.montoConstantesFunciones.activarnumero_cuotaMonto,iSizeTabla,this,true,"numero_cuotaMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.montoConstantesFunciones.resaltarnumero_cuotaMonto,this.montoConstantesFunciones.activarnumero_cuotaMonto,this,true,"numero_cuotaMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMonto,MontoConstantesFunciones.LABEL_ESGENERAL));

		if(this.montoConstantesFunciones.mostrares_generalMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MontoConstantesFunciones.LABEL_ESGENERAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.montoConstantesFunciones.resaltares_generalMonto,this.montoConstantesFunciones.activares_generalMonto,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.montoConstantesFunciones.resaltares_generalMonto,this.montoConstantesFunciones.activares_generalMonto,this,true,"es_generalMonto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.montoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.montoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.montoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMonto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.montoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.montoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMonto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMonto && this.isPermisoGuardarCambiosMonto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.montoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.montoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMonto.addColumn(tableColumn);
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
			
			this.jTableDatosMonto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMonto && this.isPermisoGuardarCambiosMonto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMonto && this.isPermisoGuardarCambiosMonto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMonto.moveColumn(this.jTableDatosMonto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMonto.moveColumn(this.jTableDatosMonto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMonto.moveColumn(this.jTableDatosMonto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMonto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMonto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMonto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMonto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMonto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMonto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMonto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMonto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=montoLogic.getMontos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=montos.size()-1;
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
		//this.jTableDatosMonto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMonto();
			
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
				
				//this.isEsNuevoMonto=false;
					
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
				if(this.montoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMonto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMonto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMonto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.monto.getsType().equals("DUPLICADO")
				   || this.monto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMonto=true;
				
				} else {
					this.isEsNuevoMonto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.montoSessionBean.getEsGuardarRelacionado()) {
					if(this.monto.getId()>=0 && !this.monto.getIsNew()) {						
						this.isEsNuevoMonto=false;
						
					} else {
						this.isEsNuevoMonto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMonto(esRelaciones);						
				
				this.seleccionarMonto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.monto.getId()<0) {
					this.isEsNuevoMonto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMonto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMonto(evt,rowIndex);
				}	
				
				if(this.montoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Monto: " + this.dDif); 
					}
				}								
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMonto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.monto)) {
					if(this.monto.getId()>0) {
						this.monto.setIsDeleted(true);
						
						this.montosEliminados.add(this.monto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.montoLogic.getMontos().remove(this.monto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.montos.remove(this.monto);				
					}
					
					
					((MontoModel) this.jTableDatosMonto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMonto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMonto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMonto) {
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMonto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMonto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMonto(this.monto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.montoConstantesFunciones.cargarid_empresaMonto || this.montoConstantesFunciones.event_dependid_empresaMonto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.monto.getid_empresa());
									//this.inicializarActualizarBindingMonto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(monto.getEmpresa()!=null) {
							this.empresasForeignKey.add(monto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.monto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.montoConstantesFunciones.cargarid_sucursalMonto || this.montoConstantesFunciones.event_dependid_sucursalMonto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.monto.getid_sucursal());
									//this.inicializarActualizarBindingMonto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(monto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(monto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.monto.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.montoConstantesFunciones.cargarid_clienteMonto || this.montoConstantesFunciones.event_dependid_clienteMonto) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.monto.getid_cliente());
									//this.inicializarActualizarBindingMonto(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(monto.getCliente()!=null) {
							this.clientesForeignKey.add(monto.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.monto.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMonto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMonto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMonto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMonto(Monto monto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMonto(monto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMonto(Monto monto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMonto(monto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMonto(monto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMonto(monto);
	}
	
	public void setVariablesObjetoActualToFormularioMonto(Monto monto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMonto.jLabelidMonto.setText(monto.getId().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setText(monto.getvalor_inicio().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setText(monto.getvalor_fin().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setText(monto.getnumero_dias().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setText(monto.getnumero_cuota().toString());
			this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setSelected(monto.getes_general());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Monto montoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,montoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Monto montoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				montoLocal=this.monto;
			} else {
				montoLocal=this.montoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(montoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMonto(montoLocal,true);
					
					if(montoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(montoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.montoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(montoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMonto(Monto monto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMonto(monto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMonto(monto);
	}
	
	public void setVariablesFormularioToObjetoActualMonto(Monto monto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMonto(monto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMonto(Monto monto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMonto.jLabelidMonto.getText()==null || this.jInternalFrameDetalleFormMonto.jLabelidMonto.getText()=="" || this.jInternalFrameDetalleFormMonto.jLabelidMonto.getText()=="Id") {
				this.jInternalFrameDetalleFormMonto.jLabelidMonto.setText("0");
			}

			if(conColumnasBase) {monto.setId(Long.parseLong(this.jInternalFrameDetalleFormMonto.jLabelidMonto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MontoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelIdMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			monto.setvalor_inicio(Double.parseDouble(this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MontoConstantesFunciones.LABEL_VALORINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelvalor_inicioMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			monto.setvalor_fin(Double.parseDouble(this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MontoConstantesFunciones.LABEL_VALORFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelvalor_finMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			monto.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MontoConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelnumero_diasMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			monto.setnumero_cuota(Integer.parseInt(this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MontoConstantesFunciones.LABEL_NUMEROCUOTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabelnumero_cuotaMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			monto.setes_general(this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MontoConstantesFunciones.LABEL_ESGENERAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMonto.jLabeles_generalMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMonto(Monto montoBean,Monto monto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && montoBean.getid_cliente()!=null && !montoBean.getid_cliente().equals(-1L))) {monto.setid_cliente(montoBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMonto(Monto montoOrigen,Monto monto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && montoOrigen.getId()!=null && !montoOrigen.getId().equals(0L))) {monto.setId(montoOrigen.getId());}}
			if(conDefault || (!conDefault && montoOrigen.getid_cliente()!=null && !montoOrigen.getid_cliente().equals(-1L))) {monto.setid_cliente(montoOrigen.getid_cliente());}
			if(conDefault || (!conDefault && montoOrigen.getvalor_inicio()!=null && !montoOrigen.getvalor_inicio().equals(0.0))) {monto.setvalor_inicio(montoOrigen.getvalor_inicio());}
			if(conDefault || (!conDefault && montoOrigen.getvalor_fin()!=null && !montoOrigen.getvalor_fin().equals(0.0))) {monto.setvalor_fin(montoOrigen.getvalor_fin());}
			if(conDefault || (!conDefault && montoOrigen.getnumero_dias()!=null && !montoOrigen.getnumero_dias().equals(0))) {monto.setnumero_dias(montoOrigen.getnumero_dias());}
			if(conDefault || (!conDefault && montoOrigen.getnumero_cuota()!=null && !montoOrigen.getnumero_cuota().equals(0))) {monto.setnumero_cuota(montoOrigen.getnumero_cuota());}
			if(conDefault || (!conDefault && montoOrigen.getes_general()!=null && !montoOrigen.getes_general().equals(false))) {monto.setes_general(montoOrigen.getes_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMonto(Monto monto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMonto.jLabelidMonto.setText(monto.getId().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setText(monto.getvalor_inicio().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setText(monto.getvalor_fin().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setText(monto.getnumero_dias().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setText(monto.getnumero_cuota().toString());
			this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setSelected(monto.getes_general());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMonto(MontoBean montoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMonto.jLabelidMonto.setText(montoBean.getId().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setText(montoBean.getvalor_inicio().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setText(montoBean.getvalor_fin().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setText(montoBean.getnumero_dias().toString());
			this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setText(montoBean.getnumero_cuota().toString());
			this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setSelected(montoBean.getes_general());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMonto(MontoParameterReturnGeneral montoReturnGeneral,MontoBean montoBean,Boolean conDefault) throws Exception { 
		try {
			Monto montoLocal=new Monto();
			
			montoLocal=montoReturnGeneral.getMonto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && montoLocal.getId()!=null && !montoLocal.getId().equals(0L))) {montoBean.setId(montoLocal.getId());}}
			if(conDefault || (!conDefault && montoLocal.getid_cliente()!=null && !montoLocal.getid_cliente().equals(-1L))) {montoBean.setid_cliente(montoLocal.getid_cliente());}
			if(conDefault || (!conDefault && montoLocal.getvalor_inicio()!=null && !montoLocal.getvalor_inicio().equals(0.0))) {montoBean.setvalor_inicio(montoLocal.getvalor_inicio());}
			if(conDefault || (!conDefault && montoLocal.getvalor_fin()!=null && !montoLocal.getvalor_fin().equals(0.0))) {montoBean.setvalor_fin(montoLocal.getvalor_fin());}
			if(conDefault || (!conDefault && montoLocal.getnumero_dias()!=null && !montoLocal.getnumero_dias().equals(0))) {montoBean.setnumero_dias(montoLocal.getnumero_dias());}
			if(conDefault || (!conDefault && montoLocal.getnumero_cuota()!=null && !montoLocal.getnumero_cuota().equals(0))) {montoBean.setnumero_cuota(montoLocal.getnumero_cuota());}
			if(conDefault || (!conDefault && montoLocal.getes_general()!=null && !montoLocal.getes_general().equals(false))) {montoBean.setes_general(montoLocal.getes_general());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMontoGenerico(Long idMontoSeleccionado,JComboBox jComboBoxMonto,List<Monto> montosLocal)throws Exception {
		try {
			Monto  montoTemp=null;

			for(Monto montoAux:montosLocal) {
				if(montoAux.getId()!=null && montoAux.getId().equals(idMontoSeleccionado)) {
					montoTemp=montoAux;
					break;
				}
			}

			jComboBoxMonto.setSelectedItem(montoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMontoGenerico(JComboBox jComboBoxMonto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMonto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMonto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMonto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMonto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			monto=(Monto) montoLogic.getMontos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			monto =(Monto) montos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!monto.getIsNew() && !monto.getIsChanged() && !monto.getIsDeleted()) {
				sDescripcion=monto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=monto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!monto.getIsNew() && !monto.getIsChanged() && !monto.getIsDeleted()) {
				sDescripcion=monto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=monto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!monto.getIsNew() && !monto.getIsChanged() && !monto.getIsDeleted()) {
				sDescripcion=monto.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=monto.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Monto montoRow=new Monto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			montoRow=(Monto) montoLogic.getMontos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			montoRow=(Monto) montos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMonto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMonto.setVisible((this.isVisibilidadCeldaNuevoMonto && this.isPermisoNuevoMonto));			
			this.jButtonDuplicarMonto.setVisible((this.isVisibilidadCeldaDuplicarMonto && this.isPermisoDuplicarMonto));			
			this.jButtonCopiarMonto.setVisible((this.isVisibilidadCeldaCopiarMonto && this.isPermisoCopiarMonto));
			this.jButtonVerFormMonto.setVisible((this.isVisibilidadCeldaVerFormMonto && this.isPermisoVerFormMonto));
			
			this.jButtonAbrirOrderByMonto.setVisible((this.isVisibilidadCeldaOrdenMonto && this.isPermisoOrdenMonto));			
			
			this.jButtonNuevoRelacionesMonto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMonto && this.isPermisoNuevoMonto));			
			this.jButtonNuevoGuardarCambiosMonto.setVisible((this.isVisibilidadCeldaNuevoMonto && this.isPermisoNuevoMonto && this.isPermisoGuardarCambiosMonto));
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.jInternalFrameDetalleFormMonto.jButtonModificarMonto.setVisible((this.isVisibilidadCeldaModificarMonto && this.isPermisoActualizarMonto));	
			this.jInternalFrameDetalleFormMonto.jButtonActualizarMonto.setVisible((this.isVisibilidadCeldaActualizarMonto && this.isPermisoActualizarMonto));	
			this.jInternalFrameDetalleFormMonto.jButtonEliminarMonto.setVisible((this.isVisibilidadCeldaEliminarMonto && this.isPermisoEliminarMonto));
			this.jInternalFrameDetalleFormMonto.jButtonCancelarMonto.setVisible(this.isVisibilidadCeldaCancelarMonto);							
			this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.setVisible((this.isVisibilidadCeldaGuardarMonto && this.isPermisoGuardarCambiosMonto));			
			
			}
						
			this.jButtonGuardarCambiosTablaMonto.setVisible((this.isVisibilidadCeldaGuardarCambiosMonto && this.isPermisoGuardarCambiosMonto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMonto.setVisible((this.isVisibilidadCeldaNuevoMonto && this.isPermisoNuevoMonto));						
			this.jButtonDuplicarToolBarMonto.setVisible((this.isVisibilidadCeldaDuplicarMonto && this.isPermisoDuplicarMonto));						
			this.jButtonCopiarToolBarMonto.setVisible((this.isVisibilidadCeldaCopiarMonto && this.isPermisoCopiarMonto));			
			this.jButtonVerFormToolBarMonto.setVisible((this.isVisibilidadCeldaVerFormMonto && this.isPermisoVerFormMonto));			
			this.jButtonAbrirOrderByToolBarMonto.setVisible((this.isVisibilidadCeldaOrdenMonto && this.isPermisoOrdenMonto));
			this.jButtonNuevoRelacionesToolBarMonto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMonto && this.isPermisoNuevoMonto));			
			this.jButtonNuevoGuardarCambiosToolBarMonto.setVisible((this.isVisibilidadCeldaNuevoMonto && this.isPermisoNuevoMonto && this.isPermisoGuardarCambiosMonto));			
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.jInternalFrameDetalleFormMonto.jButtonModificarToolBarMonto.setVisible((this.isVisibilidadCeldaModificarMonto && this.isPermisoActualizarMonto));	
			this.jInternalFrameDetalleFormMonto.jButtonActualizarToolBarMonto.setVisible((this.isVisibilidadCeldaActualizarMonto  && this.isPermisoActualizarMonto));	
			this.jInternalFrameDetalleFormMonto.jButtonEliminarToolBarMonto.setVisible((this.isVisibilidadCeldaEliminarMonto && this.isPermisoEliminarMonto));
			this.jInternalFrameDetalleFormMonto.jButtonCancelarToolBarMonto.setVisible(this.isVisibilidadCeldaCancelarMonto);				
			this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosToolBarMonto.setVisible((this.isVisibilidadCeldaGuardarMonto && this.isPermisoGuardarCambiosMonto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMonto.setVisible((this.isVisibilidadCeldaGuardarCambiosMonto && this.isPermisoGuardarCambiosMonto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMonto.setVisible((this.isVisibilidadCeldaNuevoMonto && this.isPermisoNuevoMonto));			
			this.jMenuItemDuplicarMonto.setVisible((this.isVisibilidadCeldaDuplicarMonto && this.isPermisoDuplicarMonto));			
			this.jMenuItemCopiarMonto.setVisible((this.isVisibilidadCeldaCopiarMonto && this.isPermisoCopiarMonto));			
			this.jMenuItemVerFormMonto.setVisible((this.isVisibilidadCeldaVerFormMonto && this.isPermisoVerFormMonto));			
			this.jMenuItemAbrirOrderByMonto.setVisible((this.isVisibilidadCeldaOrdenMonto && this.isPermisoOrdenMonto));			
			//this.jMenuItemMostrarOcultarMonto.setVisible((this.isVisibilidadCeldaOrdenMonto && this.isPermisoOrdenMonto));
			this.jMenuItemDetalleAbrirOrderByMonto.setVisible((this.isVisibilidadCeldaOrdenMonto && this.isPermisoOrdenMonto));			
			//this.jMenuItemDetalleMostrarOcultarMonto.setVisible((this.isVisibilidadCeldaOrdenMonto && this.isPermisoOrdenMonto));			
			this.jMenuItemNuevoRelacionesMonto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMonto && this.isPermisoNuevoMonto));			
			this.jMenuItemNuevoGuardarCambiosMonto.setVisible((this.isVisibilidadCeldaNuevoMonto && this.isPermisoNuevoMonto && this.isPermisoGuardarCambiosMonto));									
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.jInternalFrameDetalleFormMonto.jMenuItemModificarMonto.setVisible((this.isVisibilidadCeldaModificarMonto && this.isPermisoActualizarMonto));	
			this.jInternalFrameDetalleFormMonto.jMenuItemActualizarMonto.setVisible((this.isVisibilidadCeldaActualizarMonto && this.isPermisoActualizarMonto));	
			this.jInternalFrameDetalleFormMonto.jMenuItemEliminarMonto.setVisible((this.isVisibilidadCeldaEliminarMonto && this.isPermisoEliminarMonto));
			this.jInternalFrameDetalleFormMonto.jMenuItemCancelarMonto.setVisible(this.isVisibilidadCeldaCancelarMonto);				
			}
			
			this.jMenuItemGuardarCambiosMonto.setVisible((this.isVisibilidadCeldaGuardarMonto && this.isPermisoGuardarCambiosMonto));						
			this.jMenuItemGuardarCambiosTablaMonto.setVisible((this.isVisibilidadCeldaGuardarCambiosMonto && this.isPermisoGuardarCambiosMonto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMonto=this.jButtonNuevoMonto.isVisible();
			this.isVisibilidadCeldaDuplicarMonto=this.jButtonDuplicarMonto.isVisible();
			this.isVisibilidadCeldaCopiarMonto=this.jButtonCopiarMonto.isVisible();
			this.isVisibilidadCeldaVerFormMonto=this.jButtonVerFormMonto.isVisible();
			
			this.isVisibilidadCeldaOrdenMonto=this.jButtonAbrirOrderByMonto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMonto=this.jButtonNuevoRelacionesMonto.isVisible();
			this.isVisibilidadCeldaModificarMonto=this.jButtonModificarMonto.isVisible();
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.isVisibilidadCeldaActualizarMonto=this.jInternalFrameDetalleFormMonto.jButtonActualizarMonto.isVisible();
			this.isVisibilidadCeldaEliminarMonto=this.jInternalFrameDetalleFormMonto.jButtonEliminarMonto.isVisible();
			this.isVisibilidadCeldaCancelarMonto=this.jInternalFrameDetalleFormMonto.jButtonCancelarMonto.isVisible();
			this.isVisibilidadCeldaGuardarMonto=this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMonto=this.jButtonGuardarCambiosTablaMonto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMonto=this.jButtonNuevoToolBarMonto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMonto=this.jButtonNuevoRelacionesToolBarMonto.isVisible();
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.isVisibilidadCeldaModificarMonto=this.jInternalFrameDetalleFormMonto.jButtonModificarToolBarMonto.isVisible();
			this.isVisibilidadCeldaActualizarMonto=this.jInternalFrameDetalleFormMonto.jButtonActualizarToolBarMonto.isVisible();
			this.isVisibilidadCeldaEliminarMonto=this.jInternalFrameDetalleFormMonto.jButtonEliminarToolBarMonto.isVisible();
			this.isVisibilidadCeldaCancelarMonto=this.jInternalFrameDetalleFormMonto.jButtonCancelarToolBarMonto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMonto=this.jButtonGuardarCambiosToolBarMonto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMonto=this.jButtonGuardarCambiosTablaToolBarMonto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMonto=this.jMenuItemNuevoMonto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMonto=this.jMenuItemNuevoRelacionesMonto.isVisible();
			
			if(this.jInternalFrameDetalleFormMonto!=null) {
			this.isVisibilidadCeldaModificarMonto=this.jInternalFrameDetalleFormMonto.jMenuItemModificarMonto.isVisible();
			this.isVisibilidadCeldaActualizarMonto=this.jInternalFrameDetalleFormMonto.jMenuItemActualizarMonto.isVisible();
			this.isVisibilidadCeldaEliminarMonto=this.jInternalFrameDetalleFormMonto.jMenuItemEliminarMonto.isVisible();
			this.isVisibilidadCeldaCancelarMonto=this.jInternalFrameDetalleFormMonto.jMenuItemCancelarMonto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMonto=this.jMenuItemGuardarCambiosMonto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMonto=this.jMenuItemGuardarCambiosTablaMonto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMonto(Boolean esInicializar) {
		if(MontoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.montoSessionBean.getConGuardarRelaciones()) {
				//if(this.montoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMonto();
			}
			
			this.inicializarActualizarBindingBotonesManualMonto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMonto() {
		this.jButtonNuevoMonto.setVisible(this.isPermisoNuevoMonto);			
		this.jButtonDuplicarMonto.setVisible(this.isPermisoDuplicarMonto);			
		this.jButtonCopiarMonto.setVisible(this.isPermisoCopiarMonto);			
		this.jButtonVerFormMonto.setVisible(this.isPermisoVerFormMonto);			
		
		this.jButtonAbrirOrderByMonto.setVisible(this.isPermisoOrdenMonto);					
		
		this.jButtonNuevoRelacionesMonto.setVisible(this.isPermisoNuevoMonto);			
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonModificarMonto.setVisible(this.isPermisoActualizarMonto);	
			this.jInternalFrameDetalleFormMonto.jButtonActualizarMonto.setVisible(this.isPermisoActualizarMonto);	
			this.jInternalFrameDetalleFormMonto.jButtonEliminarMonto.setVisible(this.isPermisoEliminarMonto);
			this.jInternalFrameDetalleFormMonto.jButtonCancelarMonto.setVisible(this.isVisibilidadCeldaCancelarMonto);						
			this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.setVisible(this.isPermisoGuardarCambiosMonto);							
		}
		
		this.jButtonGuardarCambiosTablaMonto.setVisible(this.isPermisoActualizarMonto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMonto() {
		this.jInternalFrameDetalleFormMonto.jButtonModificarMonto.setVisible(this.isPermisoActualizarMonto);	
		this.jInternalFrameDetalleFormMonto.jButtonActualizarMonto.setVisible(this.isPermisoActualizarMonto);	
		this.jInternalFrameDetalleFormMonto.jButtonEliminarMonto.setVisible(this.isPermisoEliminarMonto);
		this.jInternalFrameDetalleFormMonto.jButtonCancelarMonto.setVisible(this.isVisibilidadCeldaCancelarMonto);							
		this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.setVisible((this.isVisibilidadCeldaGuardarMonto && this.isPermisoGuardarCambiosMonto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMonto() {
		if(MontoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMonto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMonto() {
	}
	
	public void jTableDatosMontoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMonto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.monto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMonto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.montoLogic.getConnexion());

				if(this.monto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.monto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMonto=(TitledBorder)this.jScrollPanelDatosMonto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMonto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.monto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMonto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.montoLogic.getConnexion());

				if(this.monto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.monto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMonto=(TitledBorder)this.jScrollPanelDatosMonto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMonto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.monto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteMontoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderMonto=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosMonto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderMonto=(TitledBorder)this.jScrollPanelDatosMonto.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderMonto.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebMonto(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.montoLogic.getConnexion());

				if(this.monto.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.monto.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMonto=(TitledBorder)this.jScrollPanelDatosMonto.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderMonto.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.monto.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_inicioMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getvalor_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_inicio = "+this.monto.getvalor_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_finMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getvalor_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_fin = "+this.monto.getvalor_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.monto.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuotaMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getnumero_cuota()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuota = "+this.monto.getnumero_cuota().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_generalMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMonto(this.getmonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.monto==null) {
						this.monto = new Monto();
					}

					this.setVariablesFormularioToObjetoActualMonto(this.monto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);
				}

				if(this.monto.getes_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_general = "+this.monto.getes_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorEsGeneralMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMonto(false,false);

			this.getMontosBusquedaPorEsGeneral();

			this.inicializarActualizarBindingMonto(false);

			//if(MontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMonto(false,false);

			this.getMontosFK_IdCliente();

			this.inicializarActualizarBindingMonto(false);

			//if(MontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMonto(false,false);

			this.getMontosFK_IdEmpresa();

			this.inicializarActualizarBindingMonto(false);

			//if(MontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMonto(false,false);

			this.getMontosFK_IdSucursal();

			this.inicializarActualizarBindingMonto(false);

			//if(MontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.montoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMonto() {
		if(this.jInternalFrameDetalleFormMonto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
			this.jInternalFrameDetalleFormMonto.setVisible(false);	    			
			this.jInternalFrameDetalleFormMonto.dispose();
			this.jInternalFrameDetalleFormMonto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMonto!=null) {
			this.jInternalFrameReporteDinamicoMonto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMonto.dispose();
			this.jInternalFrameReporteDinamicoMonto=null;
		}
		
		if(this.jInternalFrameImportacionMonto!=null) {
			this.jInternalFrameImportacionMonto.setVisible(false);	    			
			this.jInternalFrameImportacionMonto.dispose();
			this.jInternalFrameImportacionMonto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMonto();
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			
			if(sTipo.equals("NuevoMonto")) {
				jButtonNuevoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMonto")) {
				jButtonDuplicarMontoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMonto")) {
				jButtonCopiarMontoActionPerformed(evt);
			} else if(sTipo.equals("VerFormMonto")) {
				jButtonVerFormMontoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMonto")) {
				jButtonNuevoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMonto")) {
				jButtonDuplicarMontoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMonto")) {
				jButtonNuevoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMonto")) {
				jButtonDuplicarMontoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMonto")) {
				jButtonNuevoMontoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMonto")) {
				jButtonNuevoMontoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMonto")) {
				jButtonNuevoMontoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMonto")) {
				jButtonModificarMontoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMonto")) {
				jButtonModificarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMonto")) {
				jButtonModificarMontoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMonto")) {
				jButtonActualizarMontoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMonto")) {
				jButtonActualizarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMonto")) {
				jButtonActualizarMontoActionPerformed(evt);
			} else if(sTipo.equals("EliminarMonto")) {
				jButtonEliminarMontoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMonto")) {
				jButtonEliminarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMonto")) {
				jButtonEliminarMontoActionPerformed(evt);
			} else if(sTipo.equals("CancelarMonto")) {
				jButtonCancelarMontoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMonto")) {
				jButtonCancelarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMonto")) {
				jButtonCancelarMontoActionPerformed(evt);
			} else if(sTipo.equals("CerrarMonto")) {
				jButtonCerrarMontoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMonto")) {
				jButtonCerrarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMonto")) {
				jButtonCerrarMontoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMonto")) {
				jButtonMostrarOcultarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMonto")) {
				jButtonCancelarMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMonto")) {
				jButtonCopiarMontoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMonto")) {
				jButtonVerFormMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMonto")) {
				jButtonCopiarMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMonto")) {
				jButtonVerFormMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMonto")) {
				jButtonRecargarInformacionMontoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMonto")) {
				jButtonRecargarInformacionMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMonto")) {
				jButtonRecargarInformacionMontoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMonto")) {
				jButtonAnterioresMontoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMonto")) {
				jButtonAnterioresMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMonto")) {
				jButtonAnterioresMontoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMonto")) {
				jButtonSiguientesMontoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMonto")) {
				jButtonSiguientesMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMonto")) {
				jButtonSiguientesMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMonto") || sTipo.equals("MenuItemDetalleAbrirOrderByMonto")) {
				jButtonAbrirOrderByMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMonto") || sTipo.equals("MenuItemDetalleMostrarOcultarMonto")) {
				jButtonMostrarOcultarMontoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMonto")) {
				jButtonNuevoGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMonto")) {
				jButtonNuevoGuardarCambiosMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMonto")) {
				jButtonNuevoGuardarCambiosMontoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMonto")) {
				jButtonCerrarReporteDinamicoMontoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMonto")) {
				jButtonGenerarReporteDinamicoMontoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMonto")) {
				
				jButtonGenerarExcelReporteDinamicoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMonto")) {
				jButtonCerrarImportacionMontoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMonto")) {
				
				jButtonGenerarImportacionMontoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMonto")) {
				
				jButtonAbrirImportacionMontoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMonto")) {
				jComboBoxTiposAccionesMontoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMonto")) {
				jComboBoxTiposRelacionesMontoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMonto")) {
				jComboBoxTiposAccionesMontoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMonto")) {
				
				jComboBoxTiposSeleccionarMontoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMonto")) {
				jTextFieldValorCampoGeneralMontoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMonto")) {
				jButtonAbrirOrderByMontoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMonto")) {
				jButtonAbrirOrderByMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMonto")) {
				jButtonCerrarOrderByMontoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMontoBusqueda")) {
				this.jButtonidMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMontoUpdate")) {
				this.jButtonid_empresaMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMontoBusqueda")) {
				this.jButtonid_empresaMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMontoUpdate")) {
				this.jButtonid_sucursalMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMontoBusqueda")) {
				this.jButtonid_sucursalMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteMonto")) {
				this.jButtonid_clienteMontoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteMontoUpdate")) {
				this.jButtonid_clienteMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteMontoBusqueda")) {
				this.jButtonid_clienteMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_inicioMontoBusqueda")) {
				this.jButtonvalor_inicioMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_finMontoBusqueda")) {
				this.jButtonvalor_finMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasMontoBusqueda")) {
				this.jButtonnumero_diasMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotaMontoBusqueda")) {
				this.jButtonnumero_cuotaMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_generalMontoBusqueda")) {
				this.jButtones_generalMontoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteMonto")) {
				this.jButtonid_clienteMontoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorEsGeneralMonto")) {
				this.jButtonBusquedaPorEsGeneralMontoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteMonto")) {
				this.jButtonFK_IdClienteMontoActionPerformed(evt);
			}
			
			;
			
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMonto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Monto montoLocal=null;
			
			if(!this.getEsControlTabla()) {
				montoLocal=this.monto;
			} else {
				montoLocal=this.montoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
							
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
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
			
			


			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
								
						
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
								
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
							
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
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
			
			


			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
								
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMonto")) {
					jCheckBoxSeleccionarTodosMontoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMonto")) {
					jCheckBoxSeleccionadosMontoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMonto")) {
					
				}
				
				


				
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
												
				
				


				
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
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
			
			


			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMontoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.monto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.monto);
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
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
				
				


				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Monto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Monto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.montoAnterior =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.montoAnterior =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMonto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMontoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMonto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.monto =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.monto =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.monto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMonto")) {
				
				}
				
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMonto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMonto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMonto")) {
			
			}
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMonto();
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			if(sTipo.equals("NuevoMonto")) {
				jButtonNuevoMontoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMonto")) {
				jButtonDuplicarMontoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMonto")) {
				jButtonCopiarMontoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMonto")) {
				jButtonVerFormMontoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMonto")) {
				jButtonNuevoMontoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMonto")) {
				jButtonModificarMontoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMonto")) {
				jButtonActualizarMontoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMonto")) {
				jButtonEliminarMontoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMonto")) {
				jButtonCancelarMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMonto")) {
				jButtonCerrarMontoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMonto")) {
				jButtonGuardarCambiosMontoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMonto")) {
				jButtonNuevoGuardarCambiosMontoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMonto")) {
				jButtonAbrirOrderByMontoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMonto")) {
				jButtonRecargarInformacionMontoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMonto")) {
				jButtonAnterioresMontoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMonto")) {
				jButtonSiguientesMontoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMontoBusqueda")) {
				this.jButtonidMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMontoUpdate")) {
				this.jButtonid_empresaMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMontoBusqueda")) {
				this.jButtonid_empresaMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMontoUpdate")) {
				this.jButtonid_sucursalMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMontoBusqueda")) {
				this.jButtonid_sucursalMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteMonto")) {
				this.jButtonid_clienteMontoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteMontoUpdate")) {
				this.jButtonid_clienteMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteMontoBusqueda")) {
				this.jButtonid_clienteMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_inicioMontoBusqueda")) {
				this.jButtonvalor_inicioMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_finMontoBusqueda")) {
				this.jButtonvalor_finMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasMontoBusqueda")) {
				this.jButtonnumero_diasMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotaMontoBusqueda")) {
				this.jButtonnumero_cuotaMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_generalMontoBusqueda")) {
				this.jButtones_generalMontoBusquedaActionPerformed(evt);
			}
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMonto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMonto")) {
				closingInternalFrameMonto();
				
			} else if(sTipo.equals("jButtonCancelarMonto")) {
				JInternalFrameBase jInternalFrameDetalleFormMonto = (JInternalFrameBase)evt.getSource();
	            	
	            MontoBeanSwingJInternalFrame jInternalFrameParent=(MontoBeanSwingJInternalFrame)jInternalFrameDetalleFormMonto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMontoActionPerformed(null);
			}
			
			MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.monto,new Object(),this.montoParameterGeneral,this.montoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMonto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMonto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMonto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.monto)) {
			if(!esControlTabla) {
				if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMonto(this.monto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);			
				}
				
				if(this.montoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMonto(this.monto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.montoReturnGeneral=montoLogic.procesarEventosMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.montoLogic.getMontos(),this.monto,this.montoParameterGeneral,this.isEsNuevoMonto,classes);//this.montoLogic.getMonto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMonto(this.montoReturnGeneral,this.montoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.montoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMonto(classes,this.montoReturnGeneral,this.montoBean,false);
					}
						
					if(this.montoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMonto(this.montoReturnGeneral.getMonto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMonto(this.montoReturnGeneral.getMonto());	
					}
						
					if(this.montoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMonto(this.montoReturnGeneral.getMonto(),classes);//this.montoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMonto(this.monto,classes);//this.montoBean);									
				}
			
				if(MontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMonto(this.monto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMonto(this.monto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.montoAnterior!=null) {
						this.monto=this.montoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.montoReturnGeneral=montoLogic.procesarEventosMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.montoLogic.getMontos(),this.monto,this.montoParameterGeneral,this.isEsNuevoMonto,classes);//this.montoLogic.getMonto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.montoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.montoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.montoReturnGeneral.getMonto(),montoLogic.getMontos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.montoReturnGeneral.getMonto(),this.montos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMonto.repaint();
				
				//((AbstractTableModel) this.jTableDatosMonto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMonto();
			}
		}
	}
	
	public void actualizarVisualTableDatosMonto() throws Exception {
		
		MontoModel montoModel=(MontoModel)this.jTableDatosMonto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			montoModel.montos=this.montoLogic.getMontos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			montoModel.montos=this.montos;
		}
		
		
		((MontoModel) this.jTableDatosMonto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMonto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmontoAnterior(),this.montoLogic.getMontos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmontoAnterior(),this.montos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMonto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMonto(Monto monto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
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
										
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.monto,new Object(),generalEntityParameterGeneral,this.montoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.montoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MontoConstantesFunciones.getClassesRelationshipsOfMonto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MontoConstantesFunciones.getClassesRelationshipsFromStringsOfMonto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMonto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.monto,new Object(),generalEntityParameterGeneral,this.montoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMonto(MontoBean montoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMonto(ArrayList<Classe> classes,MontoReturnGeneral montoReturnGeneral,MontoBean montoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMonto(Monto monto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.monto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMonto = new MontoDetalleFormJInternalFrame(jDesktopPane,this.montoSessionBean.getConGuardarRelaciones(),this.montoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMonto);
		this.jInternalFrameDetalleFormMonto.setVisible(false);
		this.jInternalFrameDetalleFormMonto.setSelected(false);						
		
		this.jInternalFrameDetalleFormMonto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMonto.montoLogic=this.montoLogic;
		
		this.cargarCombosFrameForeignKeyMonto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMonto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMonto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMonto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMonto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMonto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMonto"));
		
		this.jInternalFrameDetalleFormMonto.jButtonModificarMonto.addActionListener(new ButtonActionListener(this,"ModificarMonto"));

		
		this.jInternalFrameDetalleFormMonto.jButtonModificarToolBarMonto.addActionListener(new ButtonActionListener(this,"ModificarToolBarMonto"));
					
		this.jInternalFrameDetalleFormMonto.jMenuItemModificarMonto.addActionListener(new ButtonActionListener(this,"MenuItemModificarMonto"));		
		
		
		
		this.jInternalFrameDetalleFormMonto.jButtonActualizarMonto.addActionListener (new ButtonActionListener(this,"ActualizarMonto"));
		
		
		this.jInternalFrameDetalleFormMonto.jButtonActualizarToolBarMonto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMonto"));
						
		this.jInternalFrameDetalleFormMonto.jMenuItemActualizarMonto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMonto"));		
		
		
		
		this.jInternalFrameDetalleFormMonto.jButtonEliminarMonto.addActionListener (new ButtonActionListener(this,"EliminarMonto"));
		
		
		this.jInternalFrameDetalleFormMonto.jButtonEliminarToolBarMonto.addActionListener (new ButtonActionListener(this,"EliminarToolBarMonto"));
								
		this.jInternalFrameDetalleFormMonto.jMenuItemEliminarMonto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMonto"));		
		
		
		
		this.jInternalFrameDetalleFormMonto.jButtonCancelarMonto.addActionListener (new ButtonActionListener(this,"CancelarMonto"));
		
		
		this.jInternalFrameDetalleFormMonto.jButtonCancelarToolBarMonto.addActionListener (new ButtonActionListener(this,"CancelarToolBarMonto"));
					
		this.jInternalFrameDetalleFormMonto.jMenuItemCancelarMonto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMonto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMonto.jMenuItemDetalleCerrarMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMonto"));		
		
		
		
		this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosToolBarMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMonto"));
		
		
		
		this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosToolBarMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMonto"));
		
		
		
		this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMonto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonidMontoBusqueda.addActionListener(new ButtonActionListener(this,"idMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_empresaMontoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_empresaMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_sucursalMontoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_sucursalMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMontoBusqueda"));
		//jButtonid_clienteMonto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteMontoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMonto.addActionListener(new ButtonActionListener(this,"id_clienteMonto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMontoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonvalor_inicioMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_inicioMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonvalor_finMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_finMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonnumero_diasMontoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonnumero_cuotaMontoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotaMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtones_generalMontoBusqueda.addActionListener(new ButtonActionListener(this,"es_generalMontoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMonto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMonto"));
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMonto"));
		}
		
		this.jTableDatosMonto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMonto"));
		
		this.jTableDatosMonto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMonto"));
		
		this.jButtonNuevoMonto.addActionListener(new ButtonActionListener(this,"NuevoMonto"));
		
		this.jButtonDuplicarMonto.addActionListener(new ButtonActionListener(this,"DuplicarMonto"));
		
		this.jButtonCopiarMonto.addActionListener(new ButtonActionListener(this,"CopiarMonto"));
		
		this.jButtonVerFormMonto.addActionListener(new ButtonActionListener(this,"VerFormMonto"));
		
		
		this.jButtonNuevoToolBarMonto.addActionListener(new ButtonActionListener(this,"NuevoToolBarMonto"));
			
		this.jButtonDuplicarToolBarMonto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMonto"));
			
		this.jMenuItemNuevoMonto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMonto"));
			
		this.jMenuItemDuplicarMonto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMonto"));		
		
		
		this.jButtonNuevoRelacionesMonto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMonto"));
		
		
		this.jButtonNuevoRelacionesToolBarMonto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMonto"));
			
		this.jMenuItemNuevoRelacionesMonto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMonto"));		
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonModificarMonto.addActionListener(new ButtonActionListener(this,"ModificarMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonModificarToolBarMonto.addActionListener(new ButtonActionListener(this,"ModificarToolBarMonto"));
			
			this.jInternalFrameDetalleFormMonto.jMenuItemModificarMonto.addActionListener(new ButtonActionListener(this,"MenuItemModificarMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMonto.jButtonActualizarMonto.addActionListener (new ButtonActionListener(this,"ActualizarMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonActualizarToolBarMonto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMonto"));
				
			this.jInternalFrameDetalleFormMonto.jMenuItemActualizarMonto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonEliminarMonto.addActionListener (new ButtonActionListener(this,"EliminarMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonEliminarToolBarMonto.addActionListener (new ButtonActionListener(this,"EliminarToolBarMonto"));
						
			this.jInternalFrameDetalleFormMonto.jMenuItemEliminarMonto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonCancelarMonto.addActionListener (new ButtonActionListener(this,"CancelarMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonCancelarToolBarMonto.addActionListener (new ButtonActionListener(this,"CancelarToolBarMonto"));
			
			this.jInternalFrameDetalleFormMonto.jMenuItemCancelarMonto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMonto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMonto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMonto"));		
		
		
		this.jButtonCerrarMonto.addActionListener (new ButtonActionListener(this,"CerrarMonto"));
		
		
		this.jButtonCerrarToolBarMonto.addActionListener (new ButtonActionListener(this,"CerrarToolBarMonto"));
			
		this.jMenuItemCerrarMonto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMonto"));
			
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jMenuItemDetalleCerrarMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosToolBarMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMonto"));
		}
		
		this.jButtonCopiarToolBarMonto.addActionListener (new ButtonActionListener(this,"CopiarToolBarMonto"));
			
		this.jButtonVerFormToolBarMonto.addActionListener (new ButtonActionListener(this,"VerFormToolBarMonto"));
		
		this.jMenuItemGuardarCambiosMonto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMonto"));
			
		this.jMenuItemCopiarMonto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMonto"));		
		
		this.jMenuItemVerFormMonto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMonto"));		
		
		
		this.jButtonGuardarCambiosTablaMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMonto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMonto"));
			
		this.jMenuItemGuardarCambiosTablaMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMonto"));		
		
		
		
		this.jButtonRecargarInformacionMonto.addActionListener (new ButtonActionListener(this,"RecargarInformacionMonto"));
					
		this.jButtonRecargarInformacionToolBarMonto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMonto"));
		
		this.jMenuItemRecargarInformacionMonto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMonto"));		
		
		
		
		this.jButtonAnterioresMonto.addActionListener (new ButtonActionListener(this,"AnterioresMonto"));
		
		
		this.jButtonAnterioresToolBarMonto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMonto"));
		
		this.jMenuItemAnterioresMonto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMonto"));		
		
		
		this.jButtonSiguientesMonto.addActionListener (new ButtonActionListener(this,"SiguientesMonto"));
		
		
		this.jButtonSiguientesToolBarMonto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMonto"));
			
		this.jMenuItemSiguientesMonto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMonto"));
			
		this.jMenuItemAbrirOrderByMonto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMonto"));
			
		this.jMenuItemMostrarOcultarMonto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMonto"));
			
		this.jMenuItemDetalleAbrirOrderByMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMonto"));
			
		this.jMenuItemDetalleMostarOcultarMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMonto"));		
		
		
		this.jButtonNuevoGuardarCambiosMonto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMonto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMonto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMonto"));
			
		this.jMenuItemNuevoGuardarCambiosMonto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMonto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMonto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMonto"));

		this.jCheckBoxSeleccionadosMonto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMonto"));
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMonto"));
		}
		
		
		this.jComboBoxTiposRelacionesMonto.addActionListener (new ButtonActionListener(this,"TiposRelacionesMonto"));
			
		this.jComboBoxTiposAccionesMonto.addActionListener (new ButtonActionListener(this,"TiposAccionesMonto"));
					
		this.jComboBoxTiposSeleccionarMonto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMonto"));
			
		this.jTextFieldValorCampoGeneralMonto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMonto"));		
		
		
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonidMontoBusqueda.addActionListener(new ButtonActionListener(this,"idMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_empresaMontoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_empresaMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_sucursalMontoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_sucursalMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMontoBusqueda"));
		//jButtonid_clienteMonto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteMontoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMonto.addActionListener(new ButtonActionListener(this,"id_clienteMonto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMontoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonvalor_inicioMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_inicioMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonvalor_finMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_finMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonnumero_diasMontoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonnumero_cuotaMontoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotaMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtones_generalMontoBusqueda.addActionListener(new ButtonActionListener(this,"es_generalMontoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorEsGeneralMonto.addActionListener(new ButtonActionListener(this,"BusquedaPorEsGeneralMonto"));

			this.jButtonFK_IdClienteMonto.addActionListener(new ButtonActionListener(this,"FK_IdClienteMonto"));

			this.jButtonBuscarFK_IdClienteid_clienteMonto.addActionListener(new ButtonActionListener(this,"id_clienteMonto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMonto!=null) {
				this.jInternalFrameReporteDinamicoMonto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMonto"));
				this.jInternalFrameReporteDinamicoMonto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMonto"));
				this.jInternalFrameReporteDinamicoMonto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMonto"));
			}
			
			//this.jButtonCerrarReporteDinamicoMonto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMonto"));				
			//this.jButtonGenerarReporteDinamicoMonto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMonto"));
			//this.jButtonGenerarExcelReporteDinamicoMonto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMonto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMonto!=null) {
				this.jInternalFrameImportacionMonto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMonto"));
				this.jInternalFrameImportacionMonto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMonto"));
				this.jInternalFrameImportacionMonto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMonto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMonto.addActionListener (new ButtonActionListener(this,"AbrirOrderByMonto"));
			
			this.jButtonAbrirOrderByToolBarMonto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMonto"));			
			
			if(this.jInternalFrameOrderByMonto!=null) {
				this.jInternalFrameOrderByMonto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMonto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMonto.jTabbedPaneRelacionesMonto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMonto"));
		
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
            		closingInternalFrameMonto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMonto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMonto = (JInternalFrameBase)event.getSource();
	            	
	            MontoBeanSwingJInternalFrame jInternalFrameParent=(MontoBeanSwingJInternalFrame)jInternalFrameDetalleFormMonto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMontoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMonto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMontoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMonto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMonto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMontoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMontoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMontoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMonto";
		inputMap = this.jButtonNuevoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMontoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMontoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMontoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMontoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMonto";
		inputMap = this.jButtonNuevoRelacionesMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMontoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMonto";
		inputMap = this.jButtonModificarMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMonto";
		inputMap = this.jButtonActualizarMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMonto";
		inputMap = this.jButtonEliminarMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMonto";
		inputMap = this.jButtonCancelarMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMonto";
		inputMap = this.jButtonCerrarMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMonto";
		inputMap = this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMonto.jButtonGuardarCambiosMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMonto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMontoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMonto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMontoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMonto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMontoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMonto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMontoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonidMontoBusqueda.addActionListener(new ButtonActionListener(this,"idMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_empresaMontoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_empresaMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_sucursalMontoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_sucursalMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMontoBusqueda"));
		//jButtonid_clienteMonto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteMontoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMonto.addActionListener(new ButtonActionListener(this,"id_clienteMonto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMontoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonid_clienteMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonvalor_inicioMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_inicioMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonvalor_finMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_finMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonnumero_diasMontoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtonnumero_cuotaMontoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotaMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMonto.jButtones_generalMontoBusqueda.addActionListener(new ButtonActionListener(this,"es_generalMontoBusqueda"));
		
		
		this.jButtonBusquedaPorEsGeneralMonto.addActionListener(new ButtonActionListener(this,"BusquedaPorEsGeneralMonto"));

		this.jButtonFK_IdClienteMonto.addActionListener(new ButtonActionListener(this,"FK_IdClienteMonto"));

		this.jButtonBuscarFK_IdClienteid_clienteMonto.addActionListener(new ButtonActionListener(this,"id_clienteMonto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMontoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMonto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMonto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Monto montoAux:this.montoLogic.getMontos()) {
					montoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Monto montoAux:montos) {
					montoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMontoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMonto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Monto montoAux:this.montoLogic.getMontos()) {
						montoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Monto montoAux:montos) {
						montoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Monto montoAux:this.montoLogic.getMontos()) {
					
						if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_ESGENERAL)) {
							existe=true;
							montoAux.setes_general(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Monto montoAux:montos) {
						
						if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_ESGENERAL)) {
							existe=true;
							montoAux.setes_general(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMonto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMonto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMonto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMonto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMontoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMonto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMonto.getSelectedRows();
			
			Monto montoLocal=new Monto();
			
			//this.seleccionarTodosMonto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					montoLocal =(Monto) this.montoLogic.getMontos().toArray()[this.jTableDatosMonto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					montoLocal =(Monto) this.montos.toArray()[this.jTableDatosMonto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				montoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Monto montoAux:this.montoLogic.getMontos()) {
						montoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Monto montoAux:montos) {
						montoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMonto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMonto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMonto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMonto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMontoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMontoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMontoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMonto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMonto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Monto montoAux:this.montoLogic.getMontos()) {
				
						if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_VALORINICIO)) {
							existe=true;
							montoAux.setvalor_inicio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_VALORFIN)) {
							existe=true;
							montoAux.setvalor_fin(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							montoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_NUMEROCUOTA)) {
							existe=true;
							montoAux.setnumero_cuota(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Monto montoAux:montos) {
					
						if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_VALORINICIO)) {
							existe=true;
							montoAux.setvalor_inicio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_VALORFIN)) {
							existe=true;
							montoAux.setvalor_fin(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							montoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_NUMEROCUOTA)) {
							existe=true;
							montoAux.setnumero_cuota(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMonto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMontoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMonto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMonto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMonto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMonto) {				
					conSplash=true;//false;										
					
					//this.startProcessMonto(conSplash);
				
					this.generarReporteMontosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMontosSeleccionados();
				//this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMontosSeleccionados(false);
				//this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMontosSeleccionados(true);
				//this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMonto();
				
				this.exportarMontosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMontos();
				//this.importarMontos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMonto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMontosSeleccionados();
				//this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Monto De Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMonto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMonto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMonto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
				}	
			} 			
			else if(MontoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMonto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMonto(conSplash);
					
						//this.actualizarParametrosGeneralMonto();
						
						this.generarReporteProcesoAccionMontosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MontoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Monto De FacturacionS SELECCIONADOS?", "MANTENIMIENTO DE Monto De Facturacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMonto();
				
						this.actualizarParametrosGeneralMonto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.montoReturnGeneral=montoLogic.procesarAccionMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.montoLogic.getMontos(),this.montoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMontoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMonto();
					
					MontoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMontoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMonto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMonto.jComboBoxTiposAccionesFormularioMonto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMonto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMontoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMonto();
			
			if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
			Monto monto=new Monto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMonto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMonto.getSelectedItem();
			
			
			
			
			montosSeleccionados=this.getMontosSeleccionados(true);
			//this.sTipoAccion;
			
			if(montosSeleccionados.size()==1) {
				for(Monto montoAux:montosSeleccionados) {
					monto=montoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMonto();
			
      		//this.finishProcessMonto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMontoReturnGeneral() throws Exception {
		if(this.montoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.montoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.montoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.montoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.montoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.montoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMonto(false);
		}
		
		if(this.montoReturnGeneral.getConRetornoLista() || this.montoReturnGeneral.getConRetornoObjeto()) {
			if(this.montoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.montoLogic.setMontos(this.montoReturnGeneral.getMontos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.montoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.montoLogic.setMonto(this.montoReturnGeneral.getMonto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMonto(false);
		}
	}
	
	public void actualizarParametrosGeneralMonto() throws Exception {
		
		
	}
	
	public ArrayList<Monto> getMontosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMonto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Monto montoAux:montoLogic.getMontos()) {
					if(montoAux.getIsSelected()) {
						montosSeleccionados.add(montoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Monto montoAux:this.montos) {
					if(montoAux.getIsSelected()) {
						montosSeleccionados.add(montoAux);				
					}
				}
			}
			
			if(montosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						montosSeleccionados.addAll(this.montoLogic.getMontos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						montosSeleccionados.addAll(this.montos);				
					}
				}
			}
		} else {
			montosSeleccionados.add(this.monto);
		}
		
		return montosSeleccionados;
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
	
	public void generarReporteMontosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMontosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMontosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMontosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMontosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Monto De Facturacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMontosSeleccionados() throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMontos("Todos",montosSeleccionados);
		
	}	
	
	public void generarReporteNormalMontosSeleccionados() throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMontos("Todos",montosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMontosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMontos("Todos",montosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMontosSeleccionados() throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMonto();
		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMonto();
		
		
		//this.generarReporteMontos("Todos",montosSeleccionados ,montoImplementable,montoImplementableHome);
	}
	
	public void mostrarImportacionMontos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMonto();
		
		this.abrirFrameImportacionMonto();		
		
			
		//this.generarReporteMontos("Todos",montosSeleccionados ,montoImplementable,montoImplementableHome);
	}
	
	public void importarMontos() throws Exception {		
	
	}
	
	public void exportarMontosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMontosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMontosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMontosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Monto De Facturacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMontosSeleccionados() throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMonto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Monto montoAux:montosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMonto(montoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//montoAux.setsDetalleGeneralEntityReporte(montoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMonto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MontoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_VALORINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_VALORFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_NUMERODIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_NUMEROCUOTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MontoConstantesFunciones.LABEL_ESGENERAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMonto(Monto monto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=monto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getvalor_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getvalor_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getnumero_dias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getnumero_cuota().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=monto.getes_general().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMontosSeleccionados() throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Montos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMonto(row);				
				iRow++;
			}				
			
			for(Monto montoAux:montosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMonto(montoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMontosSeleccionados() throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();		
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"monto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("montos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("monto");
			//elementRoot.appendChild(element);
		
			for(Monto montoAux:montosSeleccionados) {
				element = document.createElement("monto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMonto(montoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.montoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Monto De Facturacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMonto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_VALORINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_VALORFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_NUMERODIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_NUMEROCUOTA);
		cell = row.createCell(iColumn++);cell.setCellValue(MontoConstantesFunciones.LABEL_ESGENERAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMonto(Monto monto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getvalor_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getvalor_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getnumero_dias());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getnumero_cuota());
		cell = row.createCell(iColumn++);cell.setCellValue(monto.getes_general());				
	}
	
	public void setFilaDatosExportarXmlMonto(Monto monto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MontoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(monto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MontoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(monto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MontoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(monto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MontoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(monto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(MontoConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(monto.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementvalor_inicio = document.createElement(MontoConstantesFunciones.VALORINICIO);
		elementvalor_inicio.appendChild(document.createTextNode(monto.getvalor_inicio().toString().trim()));
		element.appendChild(elementvalor_inicio);

		Element elementvalor_fin = document.createElement(MontoConstantesFunciones.VALORFIN);
		elementvalor_fin.appendChild(document.createTextNode(monto.getvalor_fin().toString().trim()));
		element.appendChild(elementvalor_fin);

		Element elementnumero_dias = document.createElement(MontoConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(monto.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);

		Element elementnumero_cuota = document.createElement(MontoConstantesFunciones.NUMEROCUOTA);
		elementnumero_cuota.appendChild(document.createTextNode(monto.getnumero_cuota().toString().trim()));
		element.appendChild(elementnumero_cuota);

		Element elementes_general = document.createElement(MontoConstantesFunciones.ESGENERAL);
		elementes_general.appendChild(document.createTextNode(monto.getes_general().toString().trim()));
		element.appendChild(elementes_general);
	}
	
	public void generarReporteGroupGenericoMontosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Monto> montosSeleccionados=new ArrayList<Monto>();
		
		montosSeleccionados=this.getMontosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMonto(montosSeleccionados);
		
		this.generarReporteMontos("Todos",montosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMonto(ArrayList<Monto> montosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Monto montoAux:montosSeleccionados) {
				montoAux.setsDetalleGeneralEntityReporte(montoAux.toString());
			
				if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					montoAux.setsDescripcionGeneralEntityReporte1(montoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					montoAux.setsDescripcionGeneralEntityReporte1(montoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					montoAux.setsDescripcionGeneralEntityReporte1(montoAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					montoAux.setsDescripcionGeneralEntityReporte1(montoAux.getnumero_dias().toString());
				}
				 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_NUMEROCUOTA)) {
					existe=true;
					montoAux.setsDescripcionGeneralEntityReporte1(montoAux.getnumero_cuota().toString());
				}
				 else if(sTipoSeleccionar.equals(MontoConstantesFunciones.LABEL_ESGENERAL)) {
					existe=true;
					montoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(montoAux.getes_general()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMonto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMonto=true;
				this.isVisibilidadCeldaNuevoRelacionesMonto=true;
				this.isVisibilidadCeldaGuardarCambiosMonto=true;
			}
			
			this.isVisibilidadCeldaModificarMonto=false;
			this.isVisibilidadCeldaActualizarMonto=false;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
			this.isVisibilidadCeldaModificarMonto=false;
			this.isVisibilidadCeldaActualizarMonto=true;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
			this.isVisibilidadCeldaModificarMonto=false;
			this.isVisibilidadCeldaActualizarMonto=true;
			this.isVisibilidadCeldaEliminarMonto=true;
			this.isVisibilidadCeldaCancelarMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
			this.isVisibilidadCeldaModificarMonto=false;
			this.isVisibilidadCeldaActualizarMonto=true;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=false;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMonto=true;
			this.isVisibilidadCeldaNuevoRelacionesMonto=true;
			this.isVisibilidadCeldaGuardarCambiosMonto=true;
			this.isVisibilidadCeldaModificarMonto=false;
			this.isVisibilidadCeldaActualizarMonto=false;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
			this.isVisibilidadCeldaActualizarMonto=false;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=false;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
			this.isVisibilidadCeldaModificarMonto=true;
			this.isVisibilidadCeldaActualizarMonto=false;
			this.isVisibilidadCeldaEliminarMonto=false;
			this.isVisibilidadCeldaCancelarMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMonto=false;
				} else {
					this.isVisibilidadCeldaGuardarMonto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MontoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMonto=true;
			this.isVisibilidadCeldaNuevoRelacionesMonto=true;
			this.isVisibilidadCeldaGuardarCambiosMonto=true;
		} else {
			this.actualizarEstadoPanelsMonto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMonto=false;
			//this.isVisibilidadCeldaVerFormMonto=false;
			this.isVisibilidadCeldaDuplicarMonto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!montoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
		} else {
			this.isVisibilidadCeldaNuevoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosMonto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(montoSessionBean.getEsGuardarRelacionado()) {
			if(!montoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMonto=false;												
			}
			
			this.jButtonCerrarMonto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMonto=false;
		}
		
		if(!this.permiteMantenimiento(this.monto)) {
			this.isVisibilidadCeldaActualizarMonto=false;
			this.isVisibilidadCeldaEliminarMonto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMonto() {
	}
	
	public void actualizarEstadoPanelsMonto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMonto!=null) {
				this.jScrollPanelDatosEdicionMonto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMonto!=null) {
				this.jScrollPanelDatosMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMonto!=null) {
				this.jPanelPaginacionMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.montoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMonto!=null) {
					this.jTabbedPaneBusquedasMonto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.montoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMonto!=null) {
				this.jTabbedPaneBusquedasMonto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMonto!=null) {
				this.jPanelParametrosReportesMonto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorEsGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorEsGeneral) {this.jTabbedPaneBusquedasMonto.remove(jPanelBusquedaPorEsGeneralMonto);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasMonto.remove(jPanelFK_IdClienteMonto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorEsGeneral=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorEsGeneral) {this.jTabbedPaneBusquedasMonto.remove(jPanelBusquedaPorEsGeneralMonto);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasMonto.remove(jPanelFK_IdClienteMonto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaPorEsGeneral=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorEsGeneral) {this.jTabbedPaneBusquedasMonto.remove(jPanelBusquedaPorEsGeneralMonto);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasMonto.remove(jPanelFK_IdClienteMonto);}
		}
		
	}
	
	
	
	

	public String registrarSesionMontoParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(montoSessionBean==null) {
				montoSessionBean=new MontoSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(montoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.montoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(MontoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionMonto(true);
			//clienteSessionBean.setlidMontoActual(this.idMontoActual);

			montoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMonto(true);
			montoSessionBean.setlIdMontoActualForeignKey(this.idMontoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MontoSessionBean montoSessionBean=new MontoSessionBean();
		
		if(this.montoSessionBean==null) {
			this.montoSessionBean=new MontoSessionBean();
		}
		
		this.montoSessionBean.setsUltimaBusquedaMonto(this.getsAccionBusqueda());
		this.montoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.montoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorEsGeneral")) {
			montoSessionBean.setes_general(this.getes_generalBusquedaPorEsGeneral());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			montoSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			montoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			montoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MontoSessionBean montoSessionBean=new MontoSessionBean();
		
		if(this.montoSessionBean==null) {
			this.montoSessionBean=new MontoSessionBean();
		}
		
		if(this.montoSessionBean.getsUltimaBusquedaMonto()!=null&&!this.montoSessionBean.getsUltimaBusquedaMonto().equals("")) {
			this.setsAccionBusqueda(montoSessionBean.getsUltimaBusquedaMonto());
			this.setiNumeroPaginacion(montoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(montoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorEsGeneral")) {
				this.setes_generalBusquedaPorEsGeneral(montoSessionBean.getes_general());
				montoSessionBean.setes_general(false);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(montoSessionBean.getid_cliente());
				montoSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(montoSessionBean.getid_empresa());
				montoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(montoSessionBean.getid_sucursal());
				montoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.montoSessionBean.setsUltimaBusquedaMonto("");
		this.montoSessionBean.setiNumeroPaginacion(MontoConstantesFunciones.INUMEROPAGINACION);
		this.montoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMonto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMonto() {
		this.updateBorderResaltarBusquedasFormularioMonto();
		this.updateVisibilidadBusquedasFormularioMonto();
		this.updateHabilitarBusquedasFormularioMonto();
	}
	
	public void updateBorderResaltarBusquedasFormularioMonto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMonto.getComponents().length>0) {
	

		if(this.montoConstantesFunciones.resaltarBusquedaPorEsGeneralMonto!=null) {
			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelBusquedaPorEsGeneralMonto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);
				jPanel.setBorder(this.montoConstantesFunciones.resaltarBusquedaPorEsGeneralMonto);
			}
		}

		if(this.montoConstantesFunciones.resaltarFK_IdClienteMonto!=null) {
			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelFK_IdClienteMonto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);
				jPanel.setBorder(this.montoConstantesFunciones.resaltarFK_IdClienteMonto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMonto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMonto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelBusquedaPorEsGeneralMonto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.montoConstantesFunciones.mostrarBusquedaPorEsGeneralMonto);
			if(!this.montoConstantesFunciones.mostrarBusquedaPorEsGeneralMonto && index>-1) {
				this.jTabbedPaneBusquedasMonto.remove(index);
			}

			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelFK_IdClienteMonto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.montoConstantesFunciones.mostrarFK_IdClienteMonto);
			if(!this.montoConstantesFunciones.mostrarFK_IdClienteMonto && index>-1) {
				this.jTabbedPaneBusquedasMonto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMonto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMonto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelBusquedaPorEsGeneralMonto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.montoConstantesFunciones.activarBusquedaPorEsGeneralMonto);
				this.jTabbedPaneBusquedasMonto.setEnabledAt(index,this.montoConstantesFunciones.activarBusquedaPorEsGeneralMonto);
			}

			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelFK_IdClienteMonto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.montoConstantesFunciones.activarFK_IdClienteMonto);
				this.jTabbedPaneBusquedasMonto.setEnabledAt(index,this.montoConstantesFunciones.activarFK_IdClienteMonto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMonto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorEsGeneral")) {
			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelBusquedaPorEsGeneralMonto);

			this.jTabbedPaneBusquedasMonto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);

			this.montoConstantesFunciones.setResaltarBusquedaPorEsGeneralMonto(resaltar);

			jPanel.setBorder(this.montoConstantesFunciones.resaltarBusquedaPorEsGeneralMonto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasMonto.indexOfComponent(this.jPanelFK_IdClienteMonto);

			this.jTabbedPaneBusquedasMonto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMonto.getComponent(index);

			this.montoConstantesFunciones.setResaltarFK_IdClienteMonto(resaltar);

			jPanel.setBorder(this.montoConstantesFunciones.resaltarFK_IdClienteMonto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMonto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMonto() throws Exception {

		if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMonto();
		this.updateVisibilidadResaltarControlesFormularioMonto();
		this.updateHabilitarResaltarControlesFormularioMonto();
		
	}
	
	public void updateBorderResaltarControlesFormularioMonto() throws Exception {
		if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.montoConstantesFunciones.resaltaridMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jLabelidMonto.setBorder(this.montoConstantesFunciones.resaltaridMonto);}
		if(this.montoConstantesFunciones.resaltarid_empresaMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setBorder(this.montoConstantesFunciones.resaltarid_empresaMonto);}
		if(this.montoConstantesFunciones.resaltarid_sucursalMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setBorder(this.montoConstantesFunciones.resaltarid_sucursalMonto);}
		if(this.montoConstantesFunciones.resaltarid_clienteMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setBorder(this.montoConstantesFunciones.resaltarid_clienteMonto);}
		if(this.montoConstantesFunciones.resaltarvalor_inicioMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setBorder(this.montoConstantesFunciones.resaltarvalor_inicioMonto);}
		if(this.montoConstantesFunciones.resaltarvalor_finMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setBorder(this.montoConstantesFunciones.resaltarvalor_finMonto);}
		if(this.montoConstantesFunciones.resaltarnumero_diasMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setBorder(this.montoConstantesFunciones.resaltarnumero_diasMonto);}
		if(this.montoConstantesFunciones.resaltarnumero_cuotaMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setBorder(this.montoConstantesFunciones.resaltarnumero_cuotaMonto);}
		if(this.montoConstantesFunciones.resaltares_generalMonto!=null && this.jInternalFrameDetalleFormMonto!=null) {this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setBorderPainted(true);this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setBorder(this.montoConstantesFunciones.resaltares_generalMonto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMonto() throws Exception {		
		if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
	
		//this.jInternalFrameDetalleFormMonto.jLabelidMonto.setVisible(this.montoConstantesFunciones.mostraridMonto);
		this.jInternalFrameDetalleFormMonto.jPanelidMonto.setVisible(this.montoConstantesFunciones.mostraridMonto);
		//this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setVisible(this.montoConstantesFunciones.mostrarid_empresaMonto);
		this.jInternalFrameDetalleFormMonto.jPanelid_empresaMonto.setVisible(this.montoConstantesFunciones.mostrarid_empresaMonto);
		//this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setVisible(this.montoConstantesFunciones.mostrarid_sucursalMonto);
		this.jInternalFrameDetalleFormMonto.jPanelid_sucursalMonto.setVisible(this.montoConstantesFunciones.mostrarid_sucursalMonto);
		//this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setVisible(this.montoConstantesFunciones.mostrarid_clienteMonto);
		this.jInternalFrameDetalleFormMonto.jPanelid_clienteMonto.setVisible(this.montoConstantesFunciones.mostrarid_clienteMonto);
			this.jInternalFrameDetalleFormMonto.jButtonid_clienteMonto.setVisible(this.montoConstantesFunciones.mostrarid_clienteMonto);
		//this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setVisible(this.montoConstantesFunciones.mostrarvalor_inicioMonto);
		this.jInternalFrameDetalleFormMonto.jPanelvalor_inicioMonto.setVisible(this.montoConstantesFunciones.mostrarvalor_inicioMonto);
		//this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setVisible(this.montoConstantesFunciones.mostrarvalor_finMonto);
		this.jInternalFrameDetalleFormMonto.jPanelvalor_finMonto.setVisible(this.montoConstantesFunciones.mostrarvalor_finMonto);
		//this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setVisible(this.montoConstantesFunciones.mostrarnumero_diasMonto);
		this.jInternalFrameDetalleFormMonto.jPanelnumero_diasMonto.setVisible(this.montoConstantesFunciones.mostrarnumero_diasMonto);
		//this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setVisible(this.montoConstantesFunciones.mostrarnumero_cuotaMonto);
		this.jInternalFrameDetalleFormMonto.jPanelnumero_cuotaMonto.setVisible(this.montoConstantesFunciones.mostrarnumero_cuotaMonto);
		//this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setVisible(this.montoConstantesFunciones.mostrares_generalMonto);
		this.jInternalFrameDetalleFormMonto.jPaneles_generalMonto.setVisible(this.montoConstantesFunciones.mostrares_generalMonto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMonto() throws Exception {
		if(this.jInternalFrameDetalleFormMonto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMonto!=null) {
	
		this.jInternalFrameDetalleFormMonto.jLabelidMonto.setEnabled(this.montoConstantesFunciones.activaridMonto);
		this.jInternalFrameDetalleFormMonto.jComboBoxid_empresaMonto.setEnabled(this.montoConstantesFunciones.activarid_empresaMonto);
		this.jInternalFrameDetalleFormMonto.jComboBoxid_sucursalMonto.setEnabled(this.montoConstantesFunciones.activarid_sucursalMonto);
		this.jInternalFrameDetalleFormMonto.jComboBoxid_clienteMonto.setEnabled(this.montoConstantesFunciones.activarid_clienteMonto);
			this.jInternalFrameDetalleFormMonto.jButtonid_clienteMonto.setEnabled(this.montoConstantesFunciones.activarid_clienteMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldvalor_inicioMonto.setEnabled(this.montoConstantesFunciones.activarvalor_inicioMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldvalor_finMonto.setEnabled(this.montoConstantesFunciones.activarvalor_finMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldnumero_diasMonto.setEnabled(this.montoConstantesFunciones.activarnumero_diasMonto);
		this.jInternalFrameDetalleFormMonto.jTextFieldnumero_cuotaMonto.setEnabled(this.montoConstantesFunciones.activarnumero_cuotaMonto);
		this.jInternalFrameDetalleFormMonto.jCheckBoxes_generalMonto.setEnabled(this.montoConstantesFunciones.activares_generalMonto);
		}
	}
	
		
}