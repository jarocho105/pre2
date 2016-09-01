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

import com.bydan.erp.cartera.util.DireccionConstantesFunciones;
import com.bydan.erp.cartera.util.DireccionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DireccionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.DireccionBean;
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
public class DireccionBeanSwingJInternalFrame extends DireccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DireccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Direccion> direccionValidator = new ClassValidator<Direccion>(Direccion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Direccion direccion;	
	public Direccion direccionAux;
	public Direccion direccionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Direccion direccionTotales;
	public Long idDireccionActual;
	public Long iIdNuevoDireccion=0L;
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

	public String sFinalQueryComboTipoDireccion="";

	public List<TipoDireccion> tipodireccionsForeignKey;

	public List<TipoDireccion> gettipodireccionsForeignKey() {
		return tipodireccionsForeignKey;
	}

	public void settipodireccionsForeignKey(List<TipoDireccion> tipodireccionsForeignKey) {
		this.tipodireccionsForeignKey = tipodireccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDireccion tipodireccionForeignKey;

	public TipoDireccion gettipodireccionForeignKey() {
		return tipodireccionForeignKey;
	}

	public void settipodireccionForeignKey(TipoDireccion tipodireccionForeignKey) {
		this.tipodireccionForeignKey = tipodireccionForeignKey;
	}

	public String sFinalQueryComboTipoVivienda="";

	public List<TipoVivienda> tipoviviendasForeignKey;

	public List<TipoVivienda> gettipoviviendasForeignKey() {
		return tipoviviendasForeignKey;
	}

	public void settipoviviendasForeignKey(List<TipoVivienda> tipoviviendasForeignKey) {
		this.tipoviviendasForeignKey = tipoviviendasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoVivienda tipoviviendaForeignKey;

	public TipoVivienda gettipoviviendaForeignKey() {
		return tipoviviendaForeignKey;
	}

	public void settipoviviendaForeignKey(TipoVivienda tipoviviendaForeignKey) {
		this.tipoviviendaForeignKey = tipoviviendaForeignKey;
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
	
	public Boolean isPermisoTodoDireccion;
	public Boolean isPermisoNuevoDireccion;
	public Boolean isPermisoActualizarDireccion;
	public Boolean isPermisoActualizarOriginalDireccion;
	public Boolean isPermisoEliminarDireccion;
	public Boolean isPermisoGuardarCambiosDireccion;
	public Boolean isPermisoConsultaDireccion;
	public Boolean isPermisoBusquedaDireccion;
	public Boolean isPermisoReporteDireccion;
	public Boolean isPermisoPaginacionMedioDireccion;
	public Boolean isPermisoPaginacionAltoDireccion;
	public Boolean isPermisoPaginacionTodoDireccion;
	public Boolean isPermisoCopiarDireccion;
	public Boolean isPermisoVerFormDireccion;
	public Boolean isPermisoDuplicarDireccion;
	public Boolean isPermisoOrdenDireccion;
	
	
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
	
	public DireccionParameterReturnGeneral direccionReturnGeneral;
	public DireccionParameterReturnGeneral direccionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDireccion=false;
	public Boolean esParaAccionDesdeFormularioDireccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DireccionSessionBeanAdditional direccionSessionBeanAdditional=null;
	
	public DireccionSessionBeanAdditional getDireccionSessionBeanAdditional() {
		return this.direccionSessionBeanAdditional;
	}
	
	public void setDireccionSessionBeanAdditional(DireccionSessionBeanAdditional direccionSessionBeanAdditional) {
		try {
			this.direccionSessionBeanAdditional=direccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DireccionBeanSwingJInternalFrameAdditional direccionBeanSwingJInternalFrameAdditional=null;
	//public class DireccionBeanSwingJInternalFrame
	
	public DireccionBeanSwingJInternalFrameAdditional getDireccionBeanSwingJInternalFrameAdditional() {
		return this.direccionBeanSwingJInternalFrameAdditional;
	}
	
	public void setDireccionBeanSwingJInternalFrameAdditional(DireccionBeanSwingJInternalFrameAdditional direccionBeanSwingJInternalFrameAdditional) {
		try {
			this.direccionBeanSwingJInternalFrameAdditional=direccionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DireccionLogic direccionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Direccion direccionBean;
	public DireccionConstantesFunciones direccionConstantesFunciones;
	//public DireccionParameterReturnGeneral direccionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoDireccionLogic tipodireccionLogic;
	public TipoViviendaLogic tipoviviendaLogic;
	
	//PARAMETROS
	
	
	//public List<Direccion> direccions;	
	//public List<Direccion> direccionsEliminados;
	//public List<Direccion> direccionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDireccion=false;
	public Boolean isVisibilidadCeldaDuplicarDireccion=true;
	public Boolean isVisibilidadCeldaCopiarDireccion=true;
	public Boolean isVisibilidadCeldaVerFormDireccion=true;
	public Boolean isVisibilidadCeldaOrdenDireccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDireccion=false;
	public Boolean isVisibilidadCeldaModificarDireccion=false;
	public Boolean isVisibilidadCeldaActualizarDireccion=false;
	public Boolean isVisibilidadCeldaEliminarDireccion=false;
	public Boolean isVisibilidadCeldaCancelarDireccion=false;
	public Boolean isVisibilidadCeldaGuardarDireccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDireccion=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdValorClienteVivienda=false;
	public Boolean isVisibilidadFK_IdValorDireccion=false;
	
	public Long getiIdNuevoDireccion() {
		return this.iIdNuevoDireccion;
	}

	public void setiIdNuevoDireccion(Long iIdNuevoDireccion) {
		this.iIdNuevoDireccion = iIdNuevoDireccion;
	}
	
	public Long getidDireccionActual() {
		return this.idDireccionActual;
	}

	public void setidDireccionActual(Long idDireccionActual) {
		this.idDireccionActual = idDireccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Direccion getdireccion() {
		return this.direccion;
	}

	public void setdireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public Direccion getdireccionAux() {
		return this.direccionAux;
	}

	public void setdireccionAux(Direccion direccionAux) {
		this.direccionAux = direccionAux;
	}				
	
	public Direccion getdireccionAnterior() {
		return this.direccionAnterior;
	}

	public void setdireccionAnterior(Direccion direccionAnterior) {
		this.direccionAnterior = direccionAnterior;
	}	
	
	public Direccion getdireccionTotales() {
		return this.direccionTotales;
	}

	public void setdireccionTotales(Direccion direccionTotales) {
		this.direccionTotales = direccionTotales;
	}	
	
	public Direccion getdireccionBean() {
		return this.direccionBean;
	}

	public void setdireccionBean(Direccion direccionBean) {
		this.direccionBean = direccionBean;
	}	
	
	public DireccionParameterReturnGeneral getdireccionReturnGeneral() {
		return this.direccionReturnGeneral;
	}

	public void setdireccionReturnGeneral(DireccionParameterReturnGeneral direccionReturnGeneral) {
		this.direccionReturnGeneral = direccionReturnGeneral;
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

	public Long id_tipo_viviendaFK_IdValorClienteVivienda=-1L;

	public Long getid_tipo_viviendaFK_IdValorClienteVivienda() {
		return this.id_tipo_viviendaFK_IdValorClienteVivienda;
	}

	public void setid_tipo_viviendaFK_IdValorClienteVivienda(Long id_tipo_viviendaFK_IdValorClienteVivienda) {
		this.id_tipo_viviendaFK_IdValorClienteVivienda = id_tipo_viviendaFK_IdValorClienteVivienda;
	}

	public Long id_tipo_direccionFK_IdValorDireccion=-1L;

	public Long getid_tipo_direccionFK_IdValorDireccion() {
		return this.id_tipo_direccionFK_IdValorDireccion;
	}

	public void setid_tipo_direccionFK_IdValorDireccion(Long id_tipo_direccionFK_IdValorDireccion) {
		this.id_tipo_direccionFK_IdValorDireccion = id_tipo_direccionFK_IdValorDireccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DireccionLogic getDireccionLogic()	{		
		return direccionLogic;
	}

	public void setDireccionLogic(DireccionLogic direccionLogic) {
		this.direccionLogic = direccionLogic;
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
	
	public Boolean getIsEsNuevoDireccion() {
		return isEsNuevoDireccion;
	}

	public void setIsEsNuevoDireccion(Boolean isEsNuevoDireccion) {
		this.isEsNuevoDireccion = isEsNuevoDireccion;
	}

	public Boolean getEsParaAccionDesdeFormularioDireccion() {
		return esParaAccionDesdeFormularioDireccion;
	}
	
	public void setEsParaAccionDesdeFormularioDireccion(Boolean esParaAccionDesdeFormularioDireccion) {
		this.esParaAccionDesdeFormularioDireccion = esParaAccionDesdeFormularioDireccion;
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

			if(this.direccionSessionBean==null) {
				this.direccionSessionBean=new DireccionSessionBean();
			}

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(direccionSessionBean.getlidEmpresaActual());
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

			if(this.direccionSessionBean==null) {
				this.direccionSessionBean=new DireccionSessionBean();
			}

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(direccionSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoDireccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodireccionsForeignKey=new ArrayList<TipoDireccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDireccionLogic tipodireccionLogic=new TipoDireccionLogic();

			//tipodireccionLogic.getTipoDireccionDataAccess().setIsForForeingKeyData(true);

			if(this.direccionSessionBean==null) {
				this.direccionSessionBean=new DireccionSessionBean();
			}

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoDireccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodireccionLogic.getTipoDireccionDataAccess().setIsForForeingKeyData(true);

					tipodireccionLogic.getTodosTipoDireccionsWithConnection(sFinalQuery,new Pagination());

					this.tipodireccionsForeignKey=tipodireccionLogic.getTipoDireccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDireccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodireccionLogic.getEntityWithConnection(direccionSessionBean.getlidTipoDireccionActual());
					this.tipodireccionsForeignKey.add(tipodireccionLogic.getTipoDireccion());
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

	public void cargarCombosTipoViviendasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoviviendasForeignKey=new ArrayList<TipoVivienda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoViviendaLogic tipoviviendaLogic=new TipoViviendaLogic();

			//tipoviviendaLogic.getTipoViviendaDataAccess().setIsForForeingKeyData(true);

			if(this.direccionSessionBean==null) {
				this.direccionSessionBean=new DireccionSessionBean();
			}

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoVivienda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoviviendaLogic.getTipoViviendaDataAccess().setIsForForeingKeyData(true);

					tipoviviendaLogic.getTodosTipoViviendasWithConnection(sFinalQuery,new Pagination());

					this.tipoviviendasForeignKey=tipoviviendaLogic.getTipoViviendas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoVivienda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviviendaLogic.getEntityWithConnection(direccionSessionBean.getlidTipoViviendaActual());
					this.tipoviviendasForeignKey.add(tipoviviendaLogic.getTipoVivienda());
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

					if(this.direccion!=null) {
						this.direccion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) {
						this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDireccion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDireccion!=null) {
						if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDireccionGenerico)throws Exception
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
				jComboBoxid_empresaDireccionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDireccionGenerico!=null && jComboBoxid_empresaDireccionGenerico.getItemCount()>0) {
					jComboBoxid_empresaDireccionGenerico.setSelectedIndex(0);
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

					if(this.direccion!=null) {
						this.direccion.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) {
						this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteDireccion.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormDireccion!=null) {
						if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteDireccion!=null) {
						jComboBoxid_clienteFK_IdClienteDireccion.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteDireccion!=null) {
							//jComboBoxid_clienteFK_IdClienteDireccion.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteDireccion.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteDireccion.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteDireccionGenerico)throws Exception
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
				jComboBoxid_clienteDireccionGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteDireccionGenerico!=null && jComboBoxid_clienteDireccionGenerico.getItemCount()>0) {
					jComboBoxid_clienteDireccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDireccionForeignKey(Long idTipoDireccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDireccion  tipodireccionTemp=null;

			for(TipoDireccion tipodireccionAux:tipodireccionsForeignKey) {
				if(tipodireccionAux.getId()!=null && tipodireccionAux.getId().equals(idTipoDireccionSeleccionado)) {
					tipodireccionTemp=tipodireccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodireccionTemp!=null) {

					if(this.direccion!=null) {
						this.direccion.setTipoDireccion(tipodireccionTemp);
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) {
						this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setSelectedItem(tipodireccionTemp);
					}
				} else {
					//jComboBoxid_tipo_direccionDireccion.setSelectedItem(tipodireccionTemp);
					if(this.jInternalFrameDetalleFormDireccion!=null) {
						if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorDireccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodireccionTemp!=null && jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion!=null) {
						jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setSelectedItem(tipodireccionTemp);
					} else {
						if(jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion!=null) {
							//jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setSelectedItem(tipodireccionTemp);
							if(jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.getItemCount()>0) {
								jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setSelectedIndex(0);
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

	public String getActualTipoDireccionForeignKeyDescripcion(Long idTipoDireccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDireccion  tipodireccionTemp=null;

			for(TipoDireccion tipodireccionAux:tipodireccionsForeignKey) {
				if(tipodireccionAux.getId()!=null && tipodireccionAux.getId().equals(idTipoDireccionSeleccionado)) {
					tipodireccionTemp=tipodireccionAux;
					break;
				}
			}


			sDescripcion=TipoDireccionConstantesFunciones.getTipoDireccionDescripcion(tipodireccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDireccionForeignKeyGenerico(Long idTipoDireccionSeleccionado,JComboBox jComboBoxid_tipo_direccionDireccionGenerico)throws Exception
	{
		try
		{
			TipoDireccion  tipodireccionTemp=null;

			for(TipoDireccion tipodireccionAux:tipodireccionsForeignKey) {
				if(tipodireccionAux.getId()!=null && tipodireccionAux.getId().equals(idTipoDireccionSeleccionado)) {
					tipodireccionTemp=tipodireccionAux;
					break;
				}
			}

			if(tipodireccionTemp!=null) {
				jComboBoxid_tipo_direccionDireccionGenerico.setSelectedItem(tipodireccionTemp);
			} else {
				if(jComboBoxid_tipo_direccionDireccionGenerico!=null && jComboBoxid_tipo_direccionDireccionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_direccionDireccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoViviendaForeignKey(Long idTipoViviendaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoVivienda  tipoviviendaTemp=null;

			for(TipoVivienda tipoviviendaAux:tipoviviendasForeignKey) {
				if(tipoviviendaAux.getId()!=null && tipoviviendaAux.getId().equals(idTipoViviendaSeleccionado)) {
					tipoviviendaTemp=tipoviviendaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoviviendaTemp!=null) {

					if(this.direccion!=null) {
						this.direccion.setTipoVivienda(tipoviviendaTemp);
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) {
						this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setSelectedItem(tipoviviendaTemp);
					}
				} else {
					//jComboBoxid_tipo_viviendaDireccion.setSelectedItem(tipoviviendaTemp);
					if(this.jInternalFrameDetalleFormDireccion!=null) {
						if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteVivienda") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoviviendaTemp!=null && jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion!=null) {
						jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setSelectedItem(tipoviviendaTemp);
					} else {
						if(jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion!=null) {
							//jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setSelectedItem(tipoviviendaTemp);
							if(jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.getItemCount()>0) {
								jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setSelectedIndex(0);
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

	public String getActualTipoViviendaForeignKeyDescripcion(Long idTipoViviendaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoVivienda  tipoviviendaTemp=null;

			for(TipoVivienda tipoviviendaAux:tipoviviendasForeignKey) {
				if(tipoviviendaAux.getId()!=null && tipoviviendaAux.getId().equals(idTipoViviendaSeleccionado)) {
					tipoviviendaTemp=tipoviviendaAux;
					break;
				}
			}


			sDescripcion=TipoViviendaConstantesFunciones.getTipoViviendaDescripcion(tipoviviendaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoViviendaForeignKeyGenerico(Long idTipoViviendaSeleccionado,JComboBox jComboBoxid_tipo_viviendaDireccionGenerico)throws Exception
	{
		try
		{
			TipoVivienda  tipoviviendaTemp=null;

			for(TipoVivienda tipoviviendaAux:tipoviviendasForeignKey) {
				if(tipoviviendaAux.getId()!=null && tipoviviendaAux.getId().equals(idTipoViviendaSeleccionado)) {
					tipoviviendaTemp=tipoviviendaAux;
					break;
				}
			}

			if(tipoviviendaTemp!=null) {
				jComboBoxid_tipo_viviendaDireccionGenerico.setSelectedItem(tipoviviendaTemp);
			} else {
				if(jComboBoxid_tipo_viviendaDireccionGenerico!=null && jComboBoxid_tipo_viviendaDireccionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_viviendaDireccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Direccion direccion,JComboBox jComboBoxid_empresaDireccionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDireccionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDireccionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				direccion.setid_empresa(empresaAux.getId());
				direccion.setempresa_descripcion(DireccionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				direccion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Direccion direccion,JComboBox jComboBoxid_clienteDireccionGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteDireccionGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteDireccionGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				direccion.setid_cliente(clienteAux.getId());
				direccion.setcliente_descripcion(DireccionConstantesFunciones.getClienteDescripcion(clienteAux));
				direccion.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDireccionForeignKey(Direccion direccion,JComboBox jComboBoxid_tipo_direccionDireccionGenerico)throws Exception
	{
		try
		{
			TipoDireccion  tipodireccionAux=new TipoDireccion();

			if(jComboBoxid_tipo_direccionDireccionGenerico==null) {
				tipodireccionAux=(TipoDireccion)this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.getSelectedItem();
			} else {
				tipodireccionAux=(TipoDireccion)jComboBoxid_tipo_direccionDireccionGenerico.getSelectedItem();
			}

			if(tipodireccionAux!=null && tipodireccionAux.getId()!=null) {
				direccion.setid_tipo_direccion(tipodireccionAux.getId());
				direccion.settipodireccion_descripcion(DireccionConstantesFunciones.getTipoDireccionDescripcion(tipodireccionAux));
				direccion.setTipoDireccion(tipodireccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoViviendaForeignKey(Direccion direccion,JComboBox jComboBoxid_tipo_viviendaDireccionGenerico)throws Exception
	{
		try
		{
			TipoVivienda  tipoviviendaAux=new TipoVivienda();

			if(jComboBoxid_tipo_viviendaDireccionGenerico==null) {
				tipoviviendaAux=(TipoVivienda)this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.getSelectedItem();
			} else {
				tipoviviendaAux=(TipoVivienda)jComboBoxid_tipo_viviendaDireccionGenerico.getSelectedItem();
			}

			if(tipoviviendaAux!=null && tipoviviendaAux.getId()!=null) {
				direccion.setid_tipo_vivienda(tipoviviendaAux.getId());
				direccion.settipovivienda_descripcion(DireccionConstantesFunciones.getTipoViviendaDescripcion(tipoviviendaAux));
				direccion.setTipoVivienda(tipoviviendaAux);			}
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

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) { 
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) { 
					}

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) { 
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) { 
					}

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteDireccion.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteDireccion.addItem(cliente);
							}
						}

						if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDireccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDireccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) { 
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.removeAllItems();

							for(TipoDireccion tipodireccion:this.tipodireccionsForeignKey) {
								this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.addItem(tipodireccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) { 
					}

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorDireccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.removeAllItems();

							for(TipoDireccion tipodireccion:this.tipodireccionsForeignKey) {
								this.jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.addItem(tipodireccion);
							}
						}

						if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoViviendasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoVivienda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) { 
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.removeAllItems();

							for(TipoVivienda tipovivienda:this.tipoviviendasForeignKey) {
								this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.addItem(tipovivienda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDireccion!=null) { 
					}

					if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteVivienda") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.removeAllItems();

							for(TipoVivienda tipovivienda:this.tipoviviendasForeignKey) {
								this.jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.addItem(tipovivienda);
							}
						}

						if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteDireccion.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteDireccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDireccionForeignKey(TipoDireccion tipodireccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setSelectedItem(tipodireccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setSelectedItem(tipodireccion);
						} else {
							this.jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoViviendaForeignKey(TipoVivienda tipovivienda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setSelectedItem(tipovivienda);
						}
					} else {
						if(this.jInternalFrameDetalleFormDireccion!=null) {
							this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setSelectedItem(tipovivienda);
						} else {
							this.jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDireccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DireccionConstantesFunciones.refrescarForeignKeysDescripcionesDireccion(this.direccionLogic.getDireccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DireccionConstantesFunciones.refrescarForeignKeysDescripcionesDireccion(this.direccions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoDireccion.class));
		classes.add(new Classe(TipoVivienda.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//direccionLogic.setDireccions(this.direccions);
			direccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DireccionParameterReturnGeneral getDireccionParameterGeneral() {
		return this.direccionParameterGeneral;
	}
	
	public void setDireccionParameterGeneral(DireccionParameterReturnGeneral direccionParameterGeneral) {
		this.direccionParameterGeneral = direccionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDireccion() {
		return isPermisoTodoDireccion;
	}

	public void setIsPermisoTodoDireccion(Boolean isPermisoTodoDireccion) {
		this.isPermisoTodoDireccion = isPermisoTodoDireccion;
	}

	public Boolean getIsPermisoNuevoDireccion() {
		return isPermisoNuevoDireccion;
	}

	public void setIsPermisoNuevoDireccion(Boolean isPermisoNuevoDireccion) {
		this.isPermisoNuevoDireccion = isPermisoNuevoDireccion;
	}

	public Boolean getIsPermisoActualizarDireccion() {
		return isPermisoActualizarDireccion;
	}

	public void setIsPermisoActualizarDireccion(Boolean isPermisoActualizarDireccion) {
		this.isPermisoActualizarDireccion = isPermisoActualizarDireccion;
	}

	public Boolean getIsPermisoEliminarDireccion() {
		return isPermisoEliminarDireccion;
	}

	public void setIsPermisoEliminarDireccion(Boolean isPermisoEliminarDireccion) {
		this.isPermisoEliminarDireccion = isPermisoEliminarDireccion;
	}

	public Boolean getIsPermisoGuardarCambiosDireccion() {
		return isPermisoGuardarCambiosDireccion;
	}

	public void setIsPermisoGuardarCambiosDireccion(Boolean isPermisoGuardarCambiosDireccion) {
		this.isPermisoGuardarCambiosDireccion = isPermisoGuardarCambiosDireccion;
	}
	
	public Boolean getIsPermisoConsultaDireccion() {
		return isPermisoConsultaDireccion;
	}

	public void setIsPermisoConsultaDireccion(Boolean isPermisoConsultaDireccion) {
		this.isPermisoConsultaDireccion = isPermisoConsultaDireccion;
	}

	public Boolean getIsPermisoBusquedaDireccion() {
		return isPermisoBusquedaDireccion;
	}

	public void setIsPermisoBusquedaDireccion(Boolean isPermisoBusquedaDireccion) {
		this.isPermisoBusquedaDireccion = isPermisoBusquedaDireccion;
	}

	public Boolean getIsPermisoReporteDireccion() {
		return isPermisoReporteDireccion;
	}

	public void setIsPermisoReporteDireccion(Boolean isPermisoReporteDireccion) {
		this.isPermisoReporteDireccion = isPermisoReporteDireccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioDireccion() {
		return isPermisoPaginacionMedioDireccion;
	}

	public void setIsPermisoPaginacionMedioDireccion(Boolean isPermisoPaginacionMedioDireccion) {
		this.isPermisoPaginacionMedioDireccion = isPermisoPaginacionMedioDireccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoDireccion() {
		return isPermisoPaginacionTodoDireccion;
	}

	public void setIsPermisoPaginacionTodoDireccion(Boolean isPermisoPaginacionTodoDireccion) {
		this.isPermisoPaginacionTodoDireccion = isPermisoPaginacionTodoDireccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoDireccion() {
		return isPermisoPaginacionAltoDireccion;
	}

	public void setIsPermisoPaginacionAltoDireccion(Boolean isPermisoPaginacionAltoDireccion) {
		this.isPermisoPaginacionAltoDireccion = isPermisoPaginacionAltoDireccion;
	}
	
	public Boolean getIsPermisoCopiarDireccion() {
		return isPermisoCopiarDireccion;
	}

	public void setIsPermisoCopiarDireccion(Boolean isPermisoCopiarDireccion) {
		this.isPermisoCopiarDireccion = isPermisoCopiarDireccion;
	}
	
	public Boolean getIsPermisoVerFormDireccion() {
		return isPermisoVerFormDireccion;
	}

	public void setIsPermisoVerFormDireccion(Boolean isPermisoVerFormDireccion) {
		this.isPermisoVerFormDireccion = isPermisoVerFormDireccion;
	}
	
	public Boolean getIsPermisoDuplicarDireccion() {
		return isPermisoDuplicarDireccion;
	}

	public void setIsPermisoDuplicarDireccion(Boolean isPermisoDuplicarDireccion) {
		this.isPermisoDuplicarDireccion = isPermisoDuplicarDireccion;
	}
	
	public Boolean getIsPermisoOrdenDireccion() {
		return isPermisoOrdenDireccion;
	}

	public void setIsPermisoOrdenDireccion(Boolean isPermisoOrdenDireccion) {
		this.isPermisoOrdenDireccion = isPermisoOrdenDireccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDireccion() {
		return isVisibilidadCeldaNuevoDireccion;
	}

	public void setIsVisibilidadCeldaNuevoDireccion(Boolean isVisibilidadCeldaNuevoDireccion) {
		this.isVisibilidadCeldaNuevoDireccion = isVisibilidadCeldaNuevoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDireccion() {
		return isVisibilidadCeldaDuplicarDireccion;
	}

	public void setIsVisibilidadCeldaDuplicarDireccion(Boolean isVisibilidadCeldaDuplicarDireccion) {
		this.isVisibilidadCeldaDuplicarDireccion = isVisibilidadCeldaDuplicarDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDireccion() {
		return isVisibilidadCeldaCopiarDireccion;
	}

	public void setIsVisibilidadCeldaCopiarDireccion(Boolean isVisibilidadCeldaCopiarDireccion) {
		this.isVisibilidadCeldaCopiarDireccion = isVisibilidadCeldaCopiarDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDireccion() {
		return isVisibilidadCeldaVerFormDireccion;
	}

	public void setIsVisibilidadCeldaVerFormDireccion(Boolean isVisibilidadCeldaVerFormDireccion) {
		this.isVisibilidadCeldaVerFormDireccion = isVisibilidadCeldaVerFormDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDireccion() {
		return isVisibilidadCeldaOrdenDireccion;
	}

	public void setIsVisibilidadCeldaOrdenDireccion(Boolean isVisibilidadCeldaOrdenDireccion) {
		this.isVisibilidadCeldaOrdenDireccion = isVisibilidadCeldaOrdenDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDireccion() {
		return isVisibilidadCeldaNuevoRelacionesDireccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDireccion(Boolean isVisibilidadCeldaNuevoRelacionesDireccion) {
		this.isVisibilidadCeldaNuevoRelacionesDireccion = isVisibilidadCeldaNuevoRelacionesDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDireccion() {
		return isVisibilidadCeldaModificarDireccion;
	}

	public void setIsVisibilidadCeldaModificarDireccion(Boolean isVisibilidadCeldaModificarDireccion) {
		this.isVisibilidadCeldaModificarDireccion = isVisibilidadCeldaModificarDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDireccion() {
		return isVisibilidadCeldaActualizarDireccion;
	}

	public void setIsVisibilidadCeldaActualizarDireccion(Boolean isVisibilidadCeldaActualizarDireccion) {
		this.isVisibilidadCeldaActualizarDireccion = isVisibilidadCeldaActualizarDireccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarDireccion() {
		return isVisibilidadCeldaEliminarDireccion;
	}

	public void setIsVisibilidadCeldaEliminarDireccion(Boolean isVisibilidadCeldaEliminarDireccion) {
		this.isVisibilidadCeldaEliminarDireccion = isVisibilidadCeldaEliminarDireccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarDireccion() {
		return isVisibilidadCeldaCancelarDireccion;
	}

	public void setIsVisibilidadCeldaCancelarDireccion(Boolean isVisibilidadCeldaCancelarDireccion) {
		this.isVisibilidadCeldaCancelarDireccion = isVisibilidadCeldaCancelarDireccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarDireccion() {
		return isVisibilidadCeldaGuardarDireccion;
	}

	public void setIsVisibilidadCeldaGuardarDireccion(Boolean isVisibilidadCeldaGuardarDireccion) {
		this.isVisibilidadCeldaGuardarDireccion = isVisibilidadCeldaGuardarDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDireccion() {
		return isVisibilidadCeldaGuardarCambiosDireccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDireccion(Boolean isVisibilidadCeldaGuardarCambiosDireccion) {
		this.isVisibilidadCeldaGuardarCambiosDireccion = isVisibilidadCeldaGuardarCambiosDireccion;
	}
		
	public DireccionSessionBean getdireccionSessionBean() {
		return this.direccionSessionBean;
	}
	
	public void setdireccionSessionBean(DireccionSessionBean direccionSessionBean) {
		this.direccionSessionBean=direccionSessionBean;
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

	public Boolean getisVisibilidadFK_IdValorClienteVivienda() {
		return this.isVisibilidadFK_IdValorClienteVivienda;
	}

	public void setisVisibilidadFK_IdValorClienteVivienda(Boolean isVisibilidadFK_IdValorClienteVivienda) {
		this.isVisibilidadFK_IdValorClienteVivienda=isVisibilidadFK_IdValorClienteVivienda;
	}

	public Boolean getisVisibilidadFK_IdValorDireccion() {
		return this.isVisibilidadFK_IdValorDireccion;
	}

	public void setisVisibilidadFK_IdValorDireccion(Boolean isVisibilidadFK_IdValorDireccion) {
		this.isVisibilidadFK_IdValorDireccion=isVisibilidadFK_IdValorDireccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDireccion(Direccion direccion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(direccion,null);
				this.setActualParaGuardarClienteForeignKey(direccion,null);
				this.setActualParaGuardarTipoDireccionForeignKey(direccion,null);
				this.setActualParaGuardarTipoViviendaForeignKey(direccion,null);
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
	
	public void bugActualizarReferenciaActual(Direccion direccion,Direccion direccionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDireccion(direccion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		direccionAux.setId(direccion.getId());
		direccionAux.setVersionRow(direccion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDireccion();
		
			int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = direccionValidator.getInvalidValues(this.direccion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			direccionLogic.setDatosCliente(datosCliente);
			direccionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				direccionAux=new  Direccion();
				
				direccionAux.setIsNew(true);
				direccionAux.setIsChanged(true);
				
				direccionAux.setDireccionOriginal(this.direccion);
				
				direccionAux.setId(this.direccion.getId());	
				direccionAux.setVersionRow(this.direccion.getVersionRow());	
				direccionAux.setid_empresa(this.direccion.getid_empresa());	
				direccionAux.setid_cliente(this.direccion.getid_cliente());	
				direccionAux.setid_tipo_direccion(this.direccion.getid_tipo_direccion());	
				direccionAux.setid_tipo_vivienda(this.direccion.getid_tipo_vivienda());	
				direccionAux.setsector(this.direccion.getsector());	
				direccionAux.setbarrio(this.direccion.getbarrio());	
				direccionAux.setcalles(this.direccion.getcalles());	
				direccionAux.setasegurada(this.direccion.getasegurada());	
				direccionAux.setdireccion(this.direccion.getdireccion());	
				direccionAux.setesactivo(this.direccion.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.direccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.direccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(direccionAux,direccionLogic.getDireccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(direccionAux,direccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.direccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.direccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.saveDireccions();//WithConnection
						//direccionLogic.getSetVersionRowDireccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.direccion,direccionAux);
					
					this.refrescarForeignKeysDescripcionesDireccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.direccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								direccionLogic.saveDireccionRelaciones(direccionAux);//WithConnection
								//direccionLogic.getSetVersionRowDireccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.direccion,direccionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.direccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.direccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(direccionAux,direccionLogic.getDireccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(direccionAux,direccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.direccion,direccionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				direccionAux=new  Direccion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.direccionSessionBean.getEsGuardarRelacionado() 
					|| (this.direccionSessionBean.getEsGuardarRelacionado() && this.direccion.getId()>=0)) {
						
					direccionAux.setIsNew(false);
				}
				
				direccionAux.setIsDeleted(false);
			
				direccionAux.setId(this.direccion.getId());	
				direccionAux.setVersionRow(this.direccion.getVersionRow());	
				direccionAux.setid_empresa(this.direccion.getid_empresa());	
				direccionAux.setid_cliente(this.direccion.getid_cliente());	
				direccionAux.setid_tipo_direccion(this.direccion.getid_tipo_direccion());	
				direccionAux.setid_tipo_vivienda(this.direccion.getid_tipo_vivienda());	
				direccionAux.setsector(this.direccion.getsector());	
				direccionAux.setbarrio(this.direccion.getbarrio());	
				direccionAux.setcalles(this.direccion.getcalles());	
				direccionAux.setasegurada(this.direccion.getasegurada());	
				direccionAux.setdireccion(this.direccion.getdireccion());	
				direccionAux.setesactivo(this.direccion.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(direccionAux,direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(direccionAux,direccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.direccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.direccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.saveDireccions();//WithConnection
						//direccionLogic.getSetVersionRowDireccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.direccion,direccionAux);
					
					this.refrescarForeignKeysDescripcionesDireccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.direccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								direccionLogic.saveDireccionRelaciones(direccionAux);//WithConnection
								//direccionLogic.getSetVersionRowDireccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.direccion,direccionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.direccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.direccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(direccionAux,direccionLogic.getDireccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(direccionAux,direccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.direccion,direccionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				direccionAux=new  Direccion();
				
				direccionAux.setIsNew(false);
				direccionAux.setIsChanged(false);
				
				direccionAux.setIsDeleted(true);
				
				direccionAux.setId(this.direccion.getId());	
				direccionAux.setVersionRow(this.direccion.getVersionRow());	
				direccionAux.setid_empresa(this.direccion.getid_empresa());	
				direccionAux.setid_cliente(this.direccion.getid_cliente());	
				direccionAux.setid_tipo_direccion(this.direccion.getid_tipo_direccion());	
				direccionAux.setid_tipo_vivienda(this.direccion.getid_tipo_vivienda());	
				direccionAux.setsector(this.direccion.getsector());	
				direccionAux.setbarrio(this.direccion.getbarrio());	
				direccionAux.setcalles(this.direccion.getcalles());	
				direccionAux.setasegurada(this.direccion.getasegurada());	
				direccionAux.setdireccion(this.direccion.getdireccion());	
				direccionAux.setesactivo(this.direccion.getesactivo());	
				
				if(this.direccionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.direccionAux.getId()>=0) {	
						this.direccionsEliminados.add(direccionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(direccionAux,direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(direccionAux,direccions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.direccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.direccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.saveDireccions();//WithConnection
						//direccionLogic.getSetVersionRowDireccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.direccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								direccionLogic.saveDireccionRelaciones(direccionAux);//WithConnection
								//direccionLogic.getSetVersionRowDireccions();//WithConnection
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
							if(this.direccionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.direccionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(direccionAux,direccionLogic.getDireccions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(direccionAux,direccions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getDireccions().addAll(this.direccionsEliminados);
					
					direccionLogic.saveDireccions();//WithConnection
					//direccionLogic.getSetVersionRowDireccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDireccion();
				
				this.direccionsEliminados= new ArrayList<Direccion>();		
			}
			
			if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Direccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.direccion=direccionAux;
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
      		//this.finishProcessDireccion();
      	}
		
	}	
	
	public void actualizarRelaciones(Direccion direccionLocal) throws Exception {
		
		if(this.direccionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Direccion direccionLocal) throws Exception {	
		if(this.direccionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				direccionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				direccionLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDireccionDetalleFormJInternalFrame.class)) {
				TipoDireccionBeanSwingJInternalFrame tipodireccionBeanSwingJInternalFrameLocal=(TipoDireccionBeanSwingJInternalFrame) ((TipoDireccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodireccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDireccion(tipodireccionBeanSwingJInternalFrameLocal.gettipodireccion(),true);
				tipodireccionBeanSwingJInternalFrameLocal.actualizarLista(tipodireccionBeanSwingJInternalFrameLocal.tipodireccion,this.tipodireccionsForeignKey);

				tipodireccionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodireccionBeanSwingJInternalFrameLocal.tipodireccion);

				direccionLocal.setTipoDireccion(tipodireccionBeanSwingJInternalFrameLocal.tipodireccion);

				this.addItemDefectoCombosForeignKeyTipoDireccion();
				this.cargarCombosFrameTipoDireccionsForeignKey("Formulario");
				this.setActualTipoDireccionForeignKey(tipodireccionBeanSwingJInternalFrameLocal.tipodireccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoViviendaDetalleFormJInternalFrame.class)) {
				TipoViviendaBeanSwingJInternalFrame tipoviviendaBeanSwingJInternalFrameLocal=(TipoViviendaBeanSwingJInternalFrame) ((TipoViviendaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoviviendaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoVivienda(tipoviviendaBeanSwingJInternalFrameLocal.gettipovivienda(),true);
				tipoviviendaBeanSwingJInternalFrameLocal.actualizarLista(tipoviviendaBeanSwingJInternalFrameLocal.tipovivienda,this.tipoviviendasForeignKey);

				tipoviviendaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoviviendaBeanSwingJInternalFrameLocal.tipovivienda);

				direccionLocal.setTipoVivienda(tipoviviendaBeanSwingJInternalFrameLocal.tipovivienda);

				this.addItemDefectoCombosForeignKeyTipoVivienda();
				this.cargarCombosFrameTipoViviendasForeignKey("Formulario");
				this.setActualTipoViviendaForeignKey(tipoviviendaBeanSwingJInternalFrameLocal.tipovivienda.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDireccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = direccionValidator.getInvalidValues(this.direccion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Direccion direccion,List<Direccion> direccions) throws Exception {
		try	{		
			DireccionConstantesFunciones.actualizarLista(direccion,direccions,this.direccionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Direccion direccion,List<Direccion> direccions) throws Exception {
		try	{			
			DireccionConstantesFunciones.actualizarSelectedLista(direccion,direccions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Direccion> direccionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				direccionsLocal=this.direccionLogic.getDireccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				direccionsLocal=this.direccions;
			}
			//ARCHITECTURE
		
			for(Direccion direccionLocal:direccionsLocal) {
				if(this.permiteMantenimiento(direccionLocal) && direccionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DireccionConstantesFunciones.getDireccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelid_empresaDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelid_clienteDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.IDTIPODIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelid_tipo_direccionDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.IDTIPOVIVIENDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelid_tipo_viviendaDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.SECTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelsectorDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.BARRIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelbarrioDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.CALLES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelcallesDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.ASEGURADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelaseguradaDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabeldireccionDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DireccionConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelesactivoDireccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelid_empresaDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelid_clienteDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelid_tipo_direccionDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelid_tipo_viviendaDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelsectorDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelbarrioDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelcallesDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelaseguradaDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabeldireccionDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDireccion.jLabelesactivoDireccion,"");
		
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
		this.iIdNuevoDireccion--;	
		
		
		this.direccionAux=new Direccion();
		
		this.direccionAux.setId(this.iIdNuevoDireccion);
		this.direccionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.direccionLogic.getDireccions().add(this.direccionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.direccions.add(this.direccionAux);
		}
		//ARCHITECTURE
		
		this.direccion=this.direccionAux;
		
		if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDireccion(this.direccion);
			this.setVariablesObjetoActualToFormularioForeignKeyDireccion(this.direccion);
		}
				
		//this.setDefaultControlesDireccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDireccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDireccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDireccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDireccion(this.direccionBean,this.direccion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DireccionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.direccionSessionBean.getConGuardarRelaciones()) {
			classes=DireccionConstantesFunciones.getClassesRelationshipsOfDireccion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.direccionReturnGeneral=direccionLogic.procesarEventosDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.direccionLogic.getDireccions(),this.direccion,this.direccionParameterGeneral,this.isEsNuevoDireccion,classes);//this.direccionLogic.getDireccion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDireccion(this.direccionReturnGeneral,this.direccionBean,false);
		
		if(this.direccionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDireccion(this.direccionReturnGeneral.getDireccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDireccion(this.direccionReturnGeneral.getDireccion());
		}
		
		if(this.direccionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDireccion(this.direccionReturnGeneral.getDireccion(),classes);//this.direccionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDireccion(this.direccion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDireccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDireccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DireccionBeanSwingJInternalFrameAdditional.RecargarFormDireccion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDireccion(false);
						
			if(direccionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDireccion();
			}
			
			this.actualizarVisualTableDatosDireccion();
			
			this.jTableDatosDireccion.setRowSelectionInterval(this.getIndiceNuevoDireccion(), this.getIndiceNuevoDireccion());
			
			this.seleccionarFilaTablaDireccionActual();
						
			this.actualizarEstadoCeldasBotonesDireccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDireccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarsectorDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarbarrioDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarcallesDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activaraseguradaDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activardireccionDireccion);
		this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activaresactivoDireccion);	
		//
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarid_empresaDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarid_clienteDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarid_tipo_direccionDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setEnabled(isHabilitar && this.direccionConstantesFunciones.activarid_tipo_viviendaDireccion);
	};
	
	public void setDefaultControlesDireccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDireccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.direccionSessionBean.setConGuardarRelaciones(true);			
			this.direccionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.setVisible(true);
			
					
		} else {
			//this.direccionSessionBean.setConGuardarRelaciones(false);			
			this.direccionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDireccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
				if(direccionAux.getId().equals(this.iIdNuevoDireccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Direccion direccionAux:this.direccions) {
				if(direccionAux.getId().equals(this.iIdNuevoDireccion)) {
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
	
	public int getIndiceActualDireccion(Direccion direccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
				if(direccionAux.getId().equals(direccion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Direccion direccionAux:this.direccions) {
				if(direccionAux.getId().equals(direccion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDireccion(Direccion direccionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
				if(direccionAux.getDireccionOriginal().getId().equals(direccionOriginal.getId())) {
					existe=true;
					direccionOriginal.setId(direccionAux.getId());
					direccionOriginal.setVersionRow(direccionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Direccion direccionAux:this.direccions) {
				if(direccionAux.getDireccionOriginal().getId().equals(direccionOriginal.getId())) {
					existe=true;
					direccionOriginal.setId(direccionAux.getId());
					direccionOriginal.setVersionRow(direccionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDireccion(Boolean esParaCancelar) throws Exception {
		direccionsAux=new ArrayList<Direccion>();
		direccionAux=new Direccion();
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
					if(direccionAux.getId()<0) {
						direccionsAux.add(direccionAux);
					}		
				}
				this.iIdNuevoDireccion=0L;
				this.direccionLogic.getDireccions().removeAll(direccionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Direccion direccionAux:this.direccions) {
					if(direccionAux.getId()<0) {
						direccionsAux.add(direccionAux);
					}		
				}
				this.iIdNuevoDireccion=0L;
				this.direccions.removeAll(direccionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDireccion 
					&& this.direccionLogic.getDireccions().size()>0
					) {
					direccionAux=this.direccionLogic.getDireccions().get(this.direccionLogic.getDireccions().size() - 1);
				
					if(direccionAux.getId()<0) {
						this.direccionLogic.getDireccions().remove(direccionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDireccion && this.direccions.size()>0) {
					direccionAux=this.direccions.get(this.direccions.size() - 1);
				
					if(direccionAux.getId()<0) {
						this.direccions.remove(direccionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDireccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(direccion.getId()<0) {
				this.direccionLogic.getDireccions().remove(this.direccion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(direccion.getId()<0) {
				this.direccions.remove(this.direccion);
			}
		}			
	}
	
	public void setEstadosInicialesDireccion(List<Direccion> direccionsAux) throws Exception {
		DireccionConstantesFunciones.setEstadosInicialesDireccion(direccionsAux);
	}
	
	public void setEstadosInicialesDireccion(Direccion direccionAux) throws Exception {
		DireccionConstantesFunciones.setEstadosInicialesDireccion(direccionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDireccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDireccionActual()) {
				if(!this.isEsNuevoDireccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDireccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDireccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Direccion ?", "MANTENIMIENTO DE Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Direccion direccion) throws Exception {
		DireccionConstantesFunciones.seleccionarAsignar(this.direccion,direccion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDireccion=this.isPermisoActualizarOriginalDireccion;
			
			
			this.seleccionarAsignar(direccion);
			
			

			idClienteActual=direccion.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DireccionConstantesFunciones.quitarEspaciosDireccion(this.direccion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDireccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.direccionSessionBean.setsFuncionBusquedaRapida(this.direccionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoDireccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDireccion(esParaCancelar);				
				this.cancelarNuevoDireccion(esParaCancelar);								
			}
			
			this.direccion=new Direccion();
			
			this.inicializarDireccion();
			
			this.actualizarEstadoCeldasBotonesDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDireccion() throws Exception {
		try {
			DireccionConstantesFunciones.inicializarDireccion(this.direccion);
			
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
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.direccionLogic.getDireccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDireccions(String sAccionBusqueda,List<Direccion> direccionsParaReportes) throws Exception {
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
					sPathReporteFinal="Direccion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DireccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DireccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Direccion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Direcciones");		
		parameters.put("busquedapor", DireccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDireccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DireccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DireccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDireccion=new JRBeanArrayDataSource(DireccionJInternalFrame.TraerDireccionBeans(direccionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDireccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DireccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DireccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DireccionBean.TraerDireccionBeans(direccionsParaReportes).toArray()));
							
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
				this.generarExcelReporteDireccions(sAccionBusqueda,sTipoArchivoReporte,direccionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDireccions(sAccionBusqueda,sTipoArchivoReporte,direccionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDireccionActionPerformed(null);
					//this.generarExcelReporteDireccions(sAccionBusqueda,sTipoArchivoReporte,direccionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDireccions(sAccionBusqueda,sTipoArchivoReporte,direccionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDireccions(sAccionBusqueda,sTipoArchivoReporte,direccionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDireccions(sAccionBusqueda,sTipoArchivoReporte,direccionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDireccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Direccion> direccionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Direccions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDireccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Direccion direccion : direccionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DireccionConstantesFunciones.generarExcelReporteDataDireccion("NORMAL",row,workbook,direccion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDireccion(String sTipo,Row row,Workbook workbook) {
		
		DireccionConstantesFunciones.generarExcelReporteHeaderDireccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDireccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Direccion> direccionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Direccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Direccion direccion : direccionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DireccionConstantesFunciones.getDireccionDescripcion(direccion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_IDTIPODIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_IDTIPODIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.gettipodireccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.gettipovivienda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_SECTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_SECTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getsector());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_BARRIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_BARRIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getbarrio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_CALLES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_CALLES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getcalles());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_ASEGURADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_ASEGURADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getasegurada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(direccion.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DireccionConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DireccionConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(direccion.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDireccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Direccion> direccionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Direccion> direccionsRespaldo=null;
		
		classes=DireccionConstantesFunciones.getClassesRelationshipsOfDireccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.direccionLogic.setDatosCliente(this.datosCliente);
		this.direccionLogic.setDatosDeep(this.datosDeep);
		this.direccionLogic.setIsConDeep(true);
		
		direccionsRespaldo=this.direccionLogic.getDireccions();
		
		this.direccionLogic.setDireccions(direccionsParaReportes);	
		this.direccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		direccionsParaReportes=this.direccionLogic.getDireccions();
		this.direccionLogic.setDireccions(direccionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Direccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDireccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Direccion direccion : direccionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDireccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DireccionConstantesFunciones.generarExcelReporteDataDireccion("NORMAL",row,workbook,direccion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DireccionConstantesFunciones.getDireccionDescripcion(direccion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDireccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDireccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDireccion() throws Exception {		
		this.startProcessDireccion(true);
	}
	
	public void startProcessDireccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDireccion ,this.jPanelParametrosReportesDireccion, this.jScrollPanelDatosDireccion,this.jPanelPaginacionDireccion, this.jScrollPanelDatosEdicionDireccion, this.jPanelAccionesDireccion,this.jPanelAccionesFormularioDireccion,this.jmenuBarDireccion,this.jmenuBarDetalleDireccion,this.jTtoolBarDireccion,this.jTtoolBarDetalleDireccion);		
		
		final JTabbedPane jTabbedPaneBusquedasDireccion=this.jTabbedPaneBusquedasDireccion; 
		
		final JPanel jPanelParametrosReportesDireccion=this.jPanelParametrosReportesDireccion;
		//final JScrollPane jScrollPanelDatosDireccion=this.jScrollPanelDatosDireccion;
		final JTable jTableDatosDireccion=this.jTableDatosDireccion;		
		final JPanel jPanelPaginacionDireccion=this.jPanelPaginacionDireccion;
		//final JScrollPane jScrollPanelDatosEdicionDireccion=this.jScrollPanelDatosEdicionDireccion;
		final JPanel jPanelAccionesDireccion=this.jPanelAccionesDireccion;
		
		JPanel jPanelCamposAuxiliarDireccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDireccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
			jPanelCamposAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jPanelCamposDireccion;
			jPanelAccionesFormularioAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jPanelAccionesFormularioDireccion;
		}
		
		final JPanel jPanelCamposDireccion=jPanelCamposAuxiliarDireccion;
		final JPanel jPanelAccionesFormularioDireccion=jPanelAccionesFormularioAuxiliarDireccion;
		
		
		final JMenuBar jmenuBarDireccion=this.jmenuBarDireccion;
		final JToolBar jTtoolBarDireccion=this.jTtoolBarDireccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDireccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDireccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
			jmenuBarDetalleAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jmenuBarDetalleDireccion;
			jTtoolBarDetalleAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jTtoolBarDetalleDireccion;
		}
		
		final JMenuBar jmenuBarDetalleDireccion=jmenuBarDetalleAuxiliarDireccion;
		final JToolBar jTtoolBarDetalleDireccion=jTtoolBarDetalleAuxiliarDireccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDireccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDireccion;
			processRunnable.jTableDatos=jTableDatosDireccion;
			processRunnable.jPanelCampos=jPanelCamposDireccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDireccion;
			processRunnable.jPanelAcciones=jPanelAccionesDireccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDireccion;
			
			
			processRunnable.jmenuBar=jmenuBarDireccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDireccion;
			processRunnable.jTtoolBar=jTtoolBarDireccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDireccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDireccion ,jPanelParametrosReportesDireccion,jTableDatosDireccion, /*jScrollPanelDatosDireccion,*/jPanelCamposDireccion,jPanelPaginacionDireccion, /*jScrollPanelDatosEdicionDireccion,*/ jPanelAccionesDireccion,jPanelAccionesFormularioDireccion,jmenuBarDireccion,jmenuBarDetalleDireccion,jTtoolBarDireccion,jTtoolBarDetalleDireccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDireccion ,jPanelParametrosReportesDireccion, jScrollPanelDatosDireccion,jPanelPaginacionDireccion, jScrollPanelDatosEdicionDireccion, jPanelAccionesDireccion,jPanelAccionesFormularioDireccion,jmenuBarDireccion,jmenuBarDetalleDireccion,jTtoolBarDireccion,jTtoolBarDetalleDireccion);
						
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
	
	public void finishProcessDireccion() {// throws Exception 
		this.finishProcessDireccion(true);
	}
	
	public void finishProcessDireccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDireccion ,this.jPanelParametrosReportesDireccion, this.jScrollPanelDatosDireccion,this.jPanelPaginacionDireccion, this.jScrollPanelDatosEdicionDireccion, this.jPanelAccionesDireccion,this.jPanelAccionesFormularioDireccion,this.jmenuBarDireccion,this.jmenuBarDetalleDireccion,this.jTtoolBarDireccion,this.jTtoolBarDetalleDireccion);		
		
		final JTabbedPane jTabbedPaneBusquedasDireccion=this.jTabbedPaneBusquedasDireccion; 
		
		final JPanel jPanelParametrosReportesDireccion=this.jPanelParametrosReportesDireccion;
		//final JScrollPane jScrollPanelDatosDireccion=this.jScrollPanelDatosDireccion;
		final JTable jTableDatosDireccion=this.jTableDatosDireccion;		
		final JPanel jPanelPaginacionDireccion=this.jPanelPaginacionDireccion;
		//final JScrollPane jScrollPanelDatosEdicionDireccion=this.jScrollPanelDatosEdicionDireccion;
		final JPanel jPanelAccionesDireccion=this.jPanelAccionesDireccion;
		
		JPanel jPanelCamposAuxiliarDireccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDireccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
			jPanelCamposAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jPanelCamposDireccion;
			jPanelAccionesFormularioAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jPanelAccionesFormularioDireccion;
		}
		
		final JPanel jPanelCamposDireccion=jPanelCamposAuxiliarDireccion;
		final JPanel jPanelAccionesFormularioDireccion=jPanelAccionesFormularioAuxiliarDireccion;
		
		
		final JMenuBar jmenuBarDireccion=this.jmenuBarDireccion;		
		final JToolBar jTtoolBarDireccion=this.jTtoolBarDireccion;
				
		JMenuBar jmenuBarDetalleAuxiliarDireccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDireccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
			jmenuBarDetalleAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jmenuBarDetalleDireccion;
			jTtoolBarDetalleAuxiliarDireccion=this.jInternalFrameDetalleFormDireccion.jTtoolBarDetalleDireccion;		
		}
		
		final JMenuBar jmenuBarDetalleDireccion=jmenuBarDetalleAuxiliarDireccion;
		final JToolBar jTtoolBarDetalleDireccion=jTtoolBarDetalleAuxiliarDireccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDireccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDireccion;
			processRunnable.jTableDatos=jTableDatosDireccion;
			processRunnable.jPanelCampos=jPanelCamposDireccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDireccion;
			processRunnable.jPanelAcciones=jPanelAccionesDireccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDireccion;
			
			
			processRunnable.jmenuBar=jmenuBarDireccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDireccion;
			processRunnable.jTtoolBar=jTtoolBarDireccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDireccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDireccion ,jPanelParametrosReportesDireccion, jTableDatosDireccion,/*jScrollPanelDatosDireccion,*/jPanelCamposDireccion,jPanelPaginacionDireccion, /*jScrollPanelDatosEdicionDireccion,*/ jPanelAccionesDireccion,jPanelAccionesFormularioDireccion,jmenuBarDireccion,jmenuBarDetalleDireccion,jTtoolBarDireccion,jTtoolBarDetalleDireccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDireccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDireccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDireccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDireccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDireccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDireccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDireccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDireccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDireccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.direccionConstantesFunciones.getsFinalQueryDireccion();
		String  finalQueryPaginacionTodos=this.direccionConstantesFunciones.getsFinalQueryDireccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DireccionConstantesFunciones.getArrayColumnasGlobalesNoDireccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DireccionConstantesFunciones.getArrayColumnasGlobalesDireccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DireccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.direccionsEliminados= new ArrayList<Direccion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDireccion();
		
				///*DireccionSessionBean*/this.direccionSessionBean=new DireccionSessionBean();
			
			if(this.direccionSessionBean==null) {
				this.direccionSessionBean=new DireccionSessionBean();
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
					this.iNumeroPaginacion=DireccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DireccionConstantesFunciones.getClassesForeignKeysOfDireccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/direccion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			direccionsAux= new ArrayList<Direccion>();
			
				
			direccionLogic.setDatosCliente(this.datosCliente);
			direccionLogic.setDatosDeep(this.datosDeep);
			direccionLogic.setIsConDeep(true);
			
			
			direccionLogic.getDireccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					direccionLogic.getTodosDireccions(finalQueryGlobal,pagination);
					
					//direccionLogic.getTodosDireccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(direccionLogic.getDireccions()==null|| direccionLogic.getDireccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							direccionsAux= new ArrayList<Direccion>();
							direccionsAux.addAll(direccionLogic.getDireccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccionsAux= new ArrayList<Direccion>();
							direccionsAux.addAll(direccions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							direccionLogic.getTodosDireccions(finalQueryGlobal+"",this.pagination);												
							
							//direccionLogic.getTodosDireccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDireccions("Todos",direccionLogic.getDireccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							direccionLogic.setDireccions(new ArrayList<Direccion>());					
							direccionLogic.getDireccions().addAll(direccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccions=new ArrayList<Direccion>();
							direccions.addAll(direccionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDireccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDireccion=this.idActual;
				
				} else if(this.idDireccionActual!=null && this.idDireccionActual!=0L) {
					idDireccion=idDireccionActual;
				}
				
					
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndicePorId(idDireccion);
				
				this.direccions=new ArrayList<Direccion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					direccionLogic.getEntity(idDireccion);
					
					//direccionLogic.getEntityWithConnection(idDireccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					direccionLogic.setDireccions(new ArrayList<Direccion>());
					direccionLogic.getDireccions().add(direccionLogic.getDireccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.direccions=new ArrayList<Direccion>();
					this.direccions.add(direccion);
				}
				
				if(direccionLogic.getDireccion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					direccionLogic.getDireccionsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=direccionLogic.getDireccions()==null||direccionLogic.getDireccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=direccions==null|| direccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionsAux=new ArrayList<Direccion>();
						direccionsAux.addAll(direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccionsAux=new ArrayList<Direccion>();
							direccionsAux.addAll(direccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							direccionLogic.getDireccionsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDireccions("FK_IdCliente",direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDireccions("FK_IdCliente",direccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.setDireccions(new ArrayList<Direccion>());
						direccionLogic.getDireccions().addAll(direccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccions=new ArrayList<Direccion>();
							direccions.addAll(direccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					direccionLogic.getDireccionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=direccionLogic.getDireccions()==null||direccionLogic.getDireccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=direccions==null|| direccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionsAux=new ArrayList<Direccion>();
						direccionsAux.addAll(direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccionsAux=new ArrayList<Direccion>();
							direccionsAux.addAll(direccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							direccionLogic.getDireccionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDireccions("FK_IdEmpresa",direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDireccions("FK_IdEmpresa",direccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.setDireccions(new ArrayList<Direccion>());
						direccionLogic.getDireccions().addAll(direccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccions=new ArrayList<Direccion>();
							direccions.addAll(direccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteVivienda")) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorClienteVivienda(id_tipo_viviendaFK_IdValorClienteVivienda);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					direccionLogic.getDireccionsFK_IdValorClienteVivienda(finalQueryGlobal,pagination,id_tipo_viviendaFK_IdValorClienteVivienda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorClienteVivienda(id_tipo_viviendaFK_IdValorClienteVivienda);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorClienteVivienda(id_tipo_viviendaFK_IdValorClienteVivienda);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=direccionLogic.getDireccions()==null||direccionLogic.getDireccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=direccions==null|| direccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionsAux=new ArrayList<Direccion>();
						direccionsAux.addAll(direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccionsAux=new ArrayList<Direccion>();
							direccionsAux.addAll(direccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							direccionLogic.getDireccionsFK_IdValorClienteVivienda(finalQueryGlobal,pagination,id_tipo_viviendaFK_IdValorClienteVivienda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorClienteVivienda(id_tipo_viviendaFK_IdValorClienteVivienda);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorClienteVivienda(id_tipo_viviendaFK_IdValorClienteVivienda);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDireccions("FK_IdValorClienteVivienda",direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDireccions("FK_IdValorClienteVivienda",direccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.setDireccions(new ArrayList<Direccion>());
						direccionLogic.getDireccions().addAll(direccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccions=new ArrayList<Direccion>();
							direccions.addAll(direccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorDireccion")) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorDireccion(id_tipo_direccionFK_IdValorDireccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					direccionLogic.getDireccionsFK_IdValorDireccion(finalQueryGlobal,pagination,id_tipo_direccionFK_IdValorDireccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorDireccion(id_tipo_direccionFK_IdValorDireccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorDireccion(id_tipo_direccionFK_IdValorDireccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=direccionLogic.getDireccions()==null||direccionLogic.getDireccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=direccions==null|| direccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionsAux=new ArrayList<Direccion>();
						direccionsAux.addAll(direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccionsAux=new ArrayList<Direccion>();
							direccionsAux.addAll(direccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							direccionLogic.getDireccionsFK_IdValorDireccion(finalQueryGlobal,pagination,id_tipo_direccionFK_IdValorDireccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorDireccion(id_tipo_direccionFK_IdValorDireccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DireccionConstantesFunciones.getDetalleIndiceFK_IdValorDireccion(id_tipo_direccionFK_IdValorDireccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDireccions("FK_IdValorDireccion",direccionLogic.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDireccions("FK_IdValorDireccion",direccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionLogic.setDireccions(new ArrayList<Direccion>());
						direccionLogic.getDireccions().addAll(direccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccions=new ArrayList<Direccion>();
							direccions.addAll(direccionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDireccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDireccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=direccionLogic.getDireccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=direccions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=direccionLogic.getDireccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=direccions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Direccion direccion) {
		Boolean permite=true;
		
		if(this.direccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DireccionConstantesFunciones.getOrderByListaDireccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DireccionConstantesFunciones.getOrderByListaDireccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Direccion direccion:direccionLogic.getDireccions()) {
				if(direccion.getsType().equals(Constantes2.S_TOTALES)) {
					direccionTotales=direccion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Direccion direccion:this.direccions) {
				if(direccion.getsType().equals(Constantes2.S_TOTALES)) {
					direccionTotales=direccion;
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
			this.direccionAux=new Direccion();
			this.direccionAux.setsType(Constantes2.S_TOTALES);
			this.direccionAux.setIsNew(false);
			this.direccionAux.setIsChanged(false);
			this.direccionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DireccionConstantesFunciones.TotalizarValoresFilaDireccion(this.direccionLogic.getDireccions(),this.direccionAux);
				
				this.direccionLogic.getDireccions().add(this.direccionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DireccionConstantesFunciones.TotalizarValoresFilaDireccion(this.direccions,this.direccionAux);
				
				this.direccions.add(this.direccionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		direccionTotales=new Direccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.direccionLogic.getDireccions().remove(direccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.direccions.remove(direccionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		direccionTotales=new Direccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Direccion direccion:direccionLogic.getDireccions()) {
				if(direccion.getsType().equals(Constantes2.S_TOTALES)) {
					direccionTotales=direccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DireccionConstantesFunciones.TotalizarValoresFilaDireccion(this.direccionLogic.getDireccions(),direccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Direccion direccion:this.direccions) {
				if(direccion.getsType().equals(Constantes2.S_TOTALES)) {
					direccionTotales=direccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DireccionConstantesFunciones.TotalizarValoresFilaDireccion(this.direccions,direccionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDireccionsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDireccionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDireccionsFK_IdValorClienteVivienda()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteVivienda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDireccionsFK_IdValorDireccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorDireccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDireccionsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					direccionLogic.getDireccionsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDireccionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					direccionLogic.getDireccionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDireccionsFK_IdValorClienteVivienda(String sFinalQuery,Long id_tipo_vivienda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					direccionLogic.getDireccionsFK_IdValorClienteVivienda(sFinalQuery,this.pagination,id_tipo_vivienda);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDireccionsFK_IdValorDireccion(String sFinalQuery,Long id_tipo_direccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					direccionLogic.getDireccionsFK_IdValorDireccion(sFinalQuery,this.pagination,id_tipo_direccion);
				
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
	
	public void inicializarPermisosDireccion() {
		this.isPermisoTodoDireccion=false;
		this.isPermisoNuevoDireccion=false;
		this.isPermisoActualizarDireccion=false;
		this.isPermisoActualizarOriginalDireccion=false;
		this.isPermisoEliminarDireccion=false;
		this.isPermisoGuardarCambiosDireccion=false;
		this.isPermisoConsultaDireccion=false;
		this.isPermisoBusquedaDireccion=false;
		this.isPermisoReporteDireccion=false;		
		this.isPermisoOrdenDireccion=false;		
		this.isPermisoPaginacionMedioDireccion=false;		
		this.isPermisoPaginacionAltoDireccion=false;
		this.isPermisoPaginacionTodoDireccion=false;
		this.isPermisoCopiarDireccion=false;		
		this.isPermisoVerFormDireccion=false;		
		this.isPermisoDuplicarDireccion=false;		
		this.isPermisoOrdenDireccion=false;		
	}
	
	public void setPermisosUsuarioDireccion(Boolean isPermiso) {
		this.isPermisoTodoDireccion=isPermiso;
		this.isPermisoNuevoDireccion=isPermiso;
		this.isPermisoActualizarDireccion=isPermiso;
		this.isPermisoActualizarOriginalDireccion=isPermiso;
		this.isPermisoEliminarDireccion=isPermiso;
		this.isPermisoGuardarCambiosDireccion=isPermiso;
		this.isPermisoConsultaDireccion=isPermiso;
		this.isPermisoBusquedaDireccion=isPermiso;
		this.isPermisoReporteDireccion=isPermiso;
		this.isPermisoOrdenDireccion=isPermiso;		
		this.isPermisoPaginacionMedioDireccion=isPermiso;		
		this.isPermisoPaginacionAltoDireccion=isPermiso;		
		this.isPermisoPaginacionTodoDireccion=isPermiso;		
		this.isPermisoCopiarDireccion=isPermiso;		
		this.isPermisoVerFormDireccion=isPermiso;		
		this.isPermisoDuplicarDireccion=isPermiso;
		this.isPermisoOrdenDireccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDireccion(Boolean isPermiso) {
		//this.isPermisoTodoDireccion=isPermiso;
		this.isPermisoNuevoDireccion=isPermiso;
		this.isPermisoActualizarDireccion=isPermiso;
		this.isPermisoActualizarOriginalDireccion=isPermiso;
		this.isPermisoEliminarDireccion=isPermiso;
		this.isPermisoGuardarCambiosDireccion=isPermiso;
		//this.isPermisoConsultaDireccion=isPermiso;
		//this.isPermisoBusquedaDireccion=isPermiso;
		//this.isPermisoReporteDireccion=isPermiso;
		//this.isPermisoOrdenDireccion=isPermiso;		
		//this.isPermisoPaginacionMedioDireccion=isPermiso;		
		//this.isPermisoPaginacionAltoDireccion=isPermiso;		
		//this.isPermisoPaginacionTodoDireccion=isPermiso;		
		//this.isPermisoCopiarDireccion=isPermiso;		
		//this.isPermisoDuplicarDireccion=isPermiso;
		//this.isPermisoOrdenDireccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDireccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDireccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDireccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDireccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDireccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDireccionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDireccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DireccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDireccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDireccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDireccion=this.isPermisoActualizarDireccion;
			this.isPermisoEliminarDireccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDireccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDireccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDireccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDireccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDireccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDireccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDireccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDireccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDireccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDireccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDireccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDireccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDireccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDireccion.setToolTipText(this.jTableDatosDireccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDireccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDireccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDireccion() throws Exception {
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
	public void inicializarCombosForeignKeyDireccionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipodireccionsForeignKey=new ArrayList();
				this.tipoviviendasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDireccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DireccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDireccionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDireccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoViviendaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoDireccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodireccionsForeignKey==null||this.tipodireccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDireccionConstantesFunciones.getArrayColumnasGlobalesTipoDireccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDireccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDireccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDireccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoViviendaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoviviendasForeignKey==null||this.tipoviviendasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoViviendaConstantesFunciones.getArrayColumnasGlobalesTipoVivienda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViviendaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoViviendaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoViviendasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDireccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DireccionParameterReturnGeneral direccionReturnGeneral=new DireccionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.direccionConstantesFunciones.cargarid_empresaDireccion)
					 || (this.esRecargarFks && this.direccionConstantesFunciones.cargarid_empresaDireccion)) {

					if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+direccionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.direccionConstantesFunciones.cargarid_clienteDireccion)
					 || (this.esRecargarFks && this.direccionConstantesFunciones.cargarid_clienteDireccion)) {

					if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+direccionSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoDireccion="";

				if(((this.tipodireccionsForeignKey==null||this.tipodireccionsForeignKey.size()<=0) && this.direccionConstantesFunciones.cargarid_tipo_direccionDireccion)
					 || (this.esRecargarFks && this.direccionConstantesFunciones.cargarid_tipo_direccionDireccion)) {

					if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoDireccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDireccionConstantesFunciones.getArrayColumnasGlobalesTipoDireccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDireccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDireccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDireccion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDireccion, "");
						finalQueryGlobalTipoDireccion+=TipoDireccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDireccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDireccion=" WHERE " + ConstantesSql.ID + "="+direccionSessionBean.getlidTipoDireccionActual();
					}
				} else {
					finalQueryGlobalTipoDireccion="NONE";
				}


				String finalQueryGlobalTipoVivienda="";

				if(((this.tipoviviendasForeignKey==null||this.tipoviviendasForeignKey.size()<=0) && this.direccionConstantesFunciones.cargarid_tipo_viviendaDireccion)
					 || (this.esRecargarFks && this.direccionConstantesFunciones.cargarid_tipo_viviendaDireccion)) {

					if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoVivienda()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoViviendaConstantesFunciones.getArrayColumnasGlobalesTipoVivienda(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoVivienda=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViviendaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoVivienda=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoVivienda, "");
						finalQueryGlobalTipoVivienda+=TipoViviendaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoViviendasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoVivienda=" WHERE " + ConstantesSql.ID + "="+direccionSessionBean.getlidTipoViviendaActual();
					}
				} else {
					finalQueryGlobalTipoVivienda="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				direccionReturnGeneral=direccionLogic.cargarCombosLoteForeignKeyDireccion(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoDireccion,finalQueryGlobalTipoVivienda);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=direccionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=direccionReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoDireccion.equals("NONE")) {
				this.tipodireccionsForeignKey=direccionReturnGeneral.gettipodireccionsForeignKey();
			}

			if(!finalQueryGlobalTipoVivienda.equals("NONE")) {
				this.tipoviviendasForeignKey=direccionReturnGeneral.gettipoviviendasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDireccion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoDireccion();
			this.addItemDefectoCombosForeignKeyTipoVivienda();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.direccionSessionBean==null) {
				this.direccionSessionBean=new DireccionSessionBean();
			}

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoDireccion()throws Exception {
		try {

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoDireccion()) {
				TipoDireccion tipodireccion=new TipoDireccion();
				TipoDireccionConstantesFunciones.setTipoDireccionDescripcion(tipodireccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodireccion.setId(null);

				if(!TipoDireccionConstantesFunciones.ExisteEnLista(this.tipodireccionsForeignKey,tipodireccion,true)) {

					this.tipodireccionsForeignKey.add(0,tipodireccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoVivienda()throws Exception {
		try {

			if(!this.direccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoVivienda()) {
				TipoVivienda tipovivienda=new TipoVivienda();
				TipoViviendaConstantesFunciones.setTipoViviendaDescripcion(tipovivienda,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovivienda.setId(null);

				if(!TipoViviendaConstantesFunciones.ExisteEnLista(this.tipoviviendasForeignKey,tipovivienda,true)) {

					this.tipoviviendasForeignKey.add(0,tipovivienda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDireccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDireccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDireccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDireccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDireccion(Direccion direccion)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(direccion.getid_cliente(),false,"Formulario");
			this.setActualTipoDireccionForeignKey(direccion.getid_tipo_direccion(),false,"Formulario");
			this.setActualTipoViviendaForeignKey(direccion.getid_tipo_vivienda(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDireccion(Direccion direccion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(direccion.getCliente()!=null && !sTipoEvento.equals("id_clienteDireccion")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(direccion.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDireccion()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.direccionConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoDireccionForeignKey(this.direccionConstantesFunciones.getid_tipo_direccion(),false,"Formulario");
			this.setActualTipoViviendaForeignKey(this.direccionConstantesFunciones.getid_tipo_vivienda(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDireccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDireccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDireccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDireccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDireccion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoDireccionsForeignKey("Todos");
			this.cargarCombosFrameTipoViviendasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDireccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDireccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoViviendasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDireccion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion!=null && this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion!=null && this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion!=null && this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion!=null && this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DireccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DireccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DireccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.direccionSessionBean=new DireccionSessionBean(); 
		this.direccionConstantesFunciones=new DireccionConstantesFunciones(); 
		this.direccionBean=new Direccion();//(this.direccionConstantesFunciones); 		
		this.direccionReturnGeneral=new DireccionParameterReturnGeneral(); 
		
		this.direccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.direccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DireccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DireccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DireccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDireccion(true);
			
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
			
			this.direccionConstantesFunciones=new DireccionConstantesFunciones(); 
			this.direccionBean=new Direccion();//this.direccionConstantesFunciones); 			
			this.direccionReturnGeneral=new DireccionParameterReturnGeneral(); 
		
			DireccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Direccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.direccion=new Direccion();
			this.direccions = new ArrayList<Direccion>();
			this.direccionsAux = new ArrayList<Direccion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic=new DireccionLogic();
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			//this.direccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.direccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDireccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDireccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDireccion);	
					}
					
					if(this.jInternalFrameImportacionDireccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDireccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDireccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDireccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDireccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDireccion);
				this.jInternalFrameDetalleFormDireccion.setVisible(false);
				this.jInternalFrameDetalleFormDireccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDireccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDireccion);
					this.jInternalFrameReporteDinamicoDireccion.setVisible(false);
					this.jInternalFrameReporteDinamicoDireccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDireccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDireccion);
					this.jInternalFrameImportacionDireccion.setVisible(false);
					this.jInternalFrameImportacionDireccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDireccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDireccion);
					this.jInternalFrameOrderByDireccion.setVisible(false);
					this.jInternalFrameOrderByDireccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDireccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DireccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.direccionReturnGeneral=new DireccionParameterReturnGeneral();
			
			this.direccionParameterGeneral=new DireccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.direccionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.direccionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DireccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.direccionSessionBean.getEsGuardarRelacionado(),this.direccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DireccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.direccionSessionBean.getEsGuardarRelacionado(),this.direccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaDuplicarDireccion=true;
			this.isVisibilidadCeldaCopiarDireccion=true;
			this.isVisibilidadCeldaVerFormDireccion=true;
			this.isVisibilidadCeldaOrdenDireccion=true;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
			this.isVisibilidadCeldaModificarDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=false;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=false;
			this.isVisibilidadCeldaGuardarDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdValorClienteVivienda=true;
			this.isVisibilidadFK_IdValorDireccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDireccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDireccion(false);
			
			this.setPermisosUsuarioDireccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.direccionSessionBean.getEsGuardarRelacionado() 
				|| (this.direccionSessionBean.getEsGuardarRelacionado() && this.direccionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDireccionClasesRelacionadas();
			}
			
			if(this.direccionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDireccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DireccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDireccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDireccion();
			}
			
			if(!this.isPermisoBusquedaDireccion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDireccion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.direccionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDireccion,this.isPermisoPaginacionMedioDireccion,this.isPermisoPaginacionTodoDireccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DireccionConstantesFunciones.getTiposSeleccionarDireccion());
				
				this.tiposColumnasSelect=DireccionConstantesFunciones.getTiposSeleccionarDireccion(true);
				
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
			//if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDireccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDireccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDireccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDireccion() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.tipodireccionLogic=new TipoDireccionLogic();
			this.tipoviviendaLogic=new TipoViviendaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				direccionImplementable= (DireccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DireccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				direccionImplementableHome= (DireccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DireccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.direccions= new ArrayList<Direccion>();
			this.direccionsEliminados= new ArrayList<Direccion>();
						
			this.isEsNuevoDireccion=false;
			this.esParaAccionDesdeFormularioDireccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipodireccionsForeignKey=new ArrayList<TipoDireccion>() ;
			this.tipoviviendasForeignKey=new ArrayList<TipoVivienda>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDireccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDireccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DireccionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DireccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDireccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDireccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDireccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDireccion();
			}
			
			DireccionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDireccion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDireccion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDireccion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDireccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Direccion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDireccion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDireccion")) {
				iIndex=this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDireccion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDireccion();	
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
	
	public void cargarCombosForeignKeyDireccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDireccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDireccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDireccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDireccion();
		
		this.cargarCombosFrameForeignKeyDireccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDireccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDireccion();
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

	public void cargarCombosForeignKeyTipoDireccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDireccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDireccion();
				this.cargarCombosFrameTipoDireccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDireccion(this.tipodireccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoVivienda(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoViviendaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoVivienda();
				this.cargarCombosFrameTipoViviendasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoVivienda(this.tipoviviendasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDireccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.direccionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			
			if(jTableDatosDireccion.getRowCount()>=1) {
				jTableDatosDireccion.removeRowSelectionInterval(0, jTableDatosDireccion.getRowCount()-1);						
			}
			
			this.isEsNuevoDireccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDireccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDireccion(true);			
			//this.direccion=new Direccion();
			//this.direccion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDireccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDireccion() ;
			
			if(DireccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDireccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.direccion);	
			this.actualizarInformacion("INFO_PADRE",false,this.direccion);				
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			if(this.direccionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Direccion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDireccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDireccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDireccion.getSelectedRows().length;			
			}
			
			direccionsSeleccionados=this.getDireccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDireccion--;			
				//Direccion direccionAux= new Direccion();			
				//direccionAux.setId(this.iIdNuevoDireccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Direccion direccionOrigen=new Direccion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Direccion direccionOrigen : direccionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							direccionOrigen =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							direccionOrigen =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDireccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.direccion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDireccion(direccionOrigen,this.direccion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.direccionLogic.getDireccions().add(this.direccionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.direccions.add(this.direccionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDireccion(false);
				
				this.jTableDatosDireccion.setRowSelectionInterval(this.getIndiceNuevoDireccion(), this.getIndiceNuevoDireccion());
				
				int iLastRow =  this.jTableDatosDireccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDireccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDireccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDireccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();									
		
			Direccion direccionOrigen=new Direccion();
			Direccion direccionDestino=new Direccion();
				
			direccionsSeleccionados=this.getDireccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDireccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || direccionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDireccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionOrigen =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						direccionOrigen =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						direccionDestino =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						direccionDestino =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				direccionOrigen =direccionsSeleccionados.get(0);
				direccionDestino =direccionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDireccion(direccionOrigen,direccionDestino,true,false);
				
				direccionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(direccionDestino,direccionLogic.getDireccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(direccionDestino,direccions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDireccion(false);
				
				//this.jTableDatosDireccion.setRowSelectionInterval(this.getIndiceNuevoDireccion(), this.getIndiceNuevoDireccion());
				
				int iLastRow =  this.jTableDatosDireccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDireccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDireccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDireccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDireccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDireccion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDireccion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDireccion.setVisible(!isVisible);
			this.jPanelPaginacionDireccion.setVisible(!isVisible);
			this.jPanelAccionesDireccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDireccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDireccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDireccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDireccion();
			
			this.abrirFrameOrderByDireccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDireccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDireccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDireccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDireccion.isMaximum()) {
					this.jInternalFrameDetalleFormDireccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDireccion.setSize(this.jInternalFrameDetalleFormDireccion.iWidthFormulario,this.jInternalFrameDetalleFormDireccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDireccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDireccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDireccion.isMaximum()) {
						this.jInternalFrameDetalleFormDireccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDireccion.jContentPaneDetalleDireccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDireccion.jContentPaneDetalleDireccion.getWidth(),DireccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDireccion.jContentPaneDetalleDireccion.getWidth(),DireccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDireccion.jContentPaneDetalleDireccion.getWidth(),DireccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDireccion.setVisible(true);
	        this.jInternalFrameDetalleFormDireccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDireccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDireccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDireccion,false,this);
				} else {
					this.jInternalFrameOrderByDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDireccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDireccion);
				this.jInternalFrameOrderByDireccion.setVisible(false);
				this.jInternalFrameOrderByDireccion.setSelected(false);
				
				this.jInternalFrameOrderByDireccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDireccion"));
				
				this.inicializarActualizarBindingTablaOrderByDireccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDireccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDireccion==null) {
				
				this.jInternalFrameImportacionDireccion=new ImportacionJInternalFrame(DireccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDireccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDireccion);
				this.jInternalFrameImportacionDireccion.setVisible(false);
				this.jInternalFrameImportacionDireccion.setSelected(false);


				this.jInternalFrameImportacionDireccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDireccion"));
				this.jInternalFrameImportacionDireccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDireccion"));
				this.jInternalFrameImportacionDireccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDireccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDireccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDireccion==null) {
				this.jInternalFrameReporteDinamicoDireccion=new ReporteDinamicoJInternalFrame(DireccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDireccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDireccion);
				this.jInternalFrameReporteDinamicoDireccion.setVisible(false);
				this.jInternalFrameReporteDinamicoDireccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDireccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDireccion"));
				this.jInternalFrameReporteDinamicoDireccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDireccion"));
				this.jInternalFrameReporteDinamicoDireccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDireccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDireccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDireccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDireccion);
			
	       	this.jInternalFrameDetalleFormDireccion.setVisible(false);
	        this.jInternalFrameDetalleFormDireccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormDireccion.dispose();
			//this.jInternalFrameDetalleFormDireccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDireccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDireccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoDireccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDireccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDireccion.setVisible(true);
	        this.jInternalFrameImportacionDireccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDireccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDireccion.setVisible(true);
	        this.jInternalFrameOrderByDireccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDireccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDireccion.setVisible(false);
	        this.jInternalFrameOrderByDireccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDireccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDireccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoDireccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDireccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDireccion.setVisible(false);
	        this.jInternalFrameImportacionDireccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDireccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDireccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDireccion(true);
			//this.isEsNuevoDireccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDireccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDireccion(false) ;
			
			if(direccionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DireccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDireccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDireccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDireccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDireccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDireccion(true);
			//this.isEsNuevoDireccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.direccion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDireccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDireccion(false) ;
			
			if(DireccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDireccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDireccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.direccionConstantesFunciones.cargarid_clienteDireccion) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDireccion(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDireccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDireccion(List<TipoDireccion> tipodireccionsForeignKey)throws Exception{
		TableColumn tableColumnTipoDireccion=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDTIPODIRECCION));
		TableCellEditor tableCellEditorTipoDireccion =tableColumnTipoDireccion.getCellEditor();

		TipoDireccionTableCell tipodireccionTableCellFk=(TipoDireccionTableCell)tableCellEditorTipoDireccion;

		if(tipodireccionTableCellFk!=null) {
			tipodireccionTableCellFk.settipodireccionsForeignKey(tipodireccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDireccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodireccionTableCellFk.setRowActual(intSelectedRow);
			//tipodireccionTableCellFk.settipodireccionsForeignKeyActual(tipodireccionsForeignKey);
		//}


		if(tipodireccionTableCellFk!=null) {
			tipodireccionTableCellFk.RecargarTipoDireccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoVivienda(List<TipoVivienda> tipoviviendasForeignKey)throws Exception{
		TableColumn tableColumnTipoVivienda=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA));
		TableCellEditor tableCellEditorTipoVivienda =tableColumnTipoVivienda.getCellEditor();

		TipoViviendaTableCell tipoviviendaTableCellFk=(TipoViviendaTableCell)tableCellEditorTipoVivienda;

		if(tipoviviendaTableCellFk!=null) {
			tipoviviendaTableCellFk.settipoviviendasForeignKey(tipoviviendasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDireccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoviviendaTableCellFk.setRowActual(intSelectedRow);
			//tipoviviendaTableCellFk.settipoviviendasForeignKeyActual(tipoviviendasForeignKey);
		//}


		if(tipoviviendaTableCellFk!=null) {
			tipoviviendaTableCellFk.RecargarTipoViviendasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDireccion(false);
			
			//if(!this.isEsNuevoDireccion) {								
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				
			}
			
			if(this.permiteMantenimiento(this.direccion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.direccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDireccion=true;
					this.inicializarActualizarBindingTablaDireccion(false);
					this.isEsNuevoDireccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDireccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDireccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDireccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDireccion(false);
				
				this.habilitarDeshabilitarControlesDireccion(false);
			
												
				
				if(DireccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDireccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDireccionActionPerformed(evt,direccionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDireccion(this.direccion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDireccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,direccionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.direccion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				this.direccion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				this.direccion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.direccion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.direccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DireccionModel) this.jTableDatosDireccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDireccion=true;
				this.inicializarActualizarBindingTablaDireccion(false);
				this.isEsNuevoDireccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDireccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDireccion(false);
				
				this.habilitarDeshabilitarControlesDireccion(false);
				
				
				
				if(DireccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDireccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDireccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDireccion.getRowCount()>=1) {
				jTableDatosDireccion.removeRowSelectionInterval(0, jTableDatosDireccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDireccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDireccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDireccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDireccion(false) ;
			
			this.isEsNuevoDireccion=false;
			
			if(DireccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDireccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDireccion(false);
				
				//SI ES MANUAL
				if(DireccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDireccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDireccion--;			
			//Direccion direccionAux= new Direccion();			
			//direccionAux.setId(this.iIdNuevoDireccion);
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDireccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
			
			this.direccion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.direccionLogic.getDireccions().add(this.direccionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.direccions.add(this.direccionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDireccion(false);
			
			this.jTableDatosDireccion.setRowSelectionInterval(this.getIndiceNuevoDireccion(), this.getIndiceNuevoDireccion());
			
			int iLastRow =  this.jTableDatosDireccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDireccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDireccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDireccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDireccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDireccion(false);
			
			//SI ES MANUAL
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDireccion();
			}
			
			//this.abrirFrameTreeDireccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDireccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE DireccionES ?", "MANTENIMIENTO DE Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDireccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDireccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.direccionReturnGeneral=direccionLogic.procesarImportacionDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.direccionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDireccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDireccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDireccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDireccion.setFileImportacion(this.jInternalFrameImportacionDireccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDireccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDireccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDireccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDireccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		

		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DireccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DireccionBaseDesign.jrxml";
			
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
			
			this.generarReporteDireccions("Todos",direccionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DireccionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_IDTIPODIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoVivienda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoVivienda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoVivienda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoVivienda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_SECTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ctor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ctor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ctor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ctor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_BARRIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rrio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rrio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rrio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rrio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_CALLES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lles_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lles_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lles_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lles_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_ASEGURADA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_egurada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_egurada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_egurada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_egurada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DireccionConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDireccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DireccionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DireccionConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPODIRECCION:
					sNombreCampoCategoria="id_tipo_direccion";
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA:
					sNombreCampoCategoria="id_tipo_vivienda";
					break;

				case DireccionConstantesFunciones.LABEL_SECTOR:
					sNombreCampoCategoria="sector";
					break;

				case DireccionConstantesFunciones.LABEL_BARRIO:
					sNombreCampoCategoria="barrio";
					break;

				case DireccionConstantesFunciones.LABEL_CALLES:
					sNombreCampoCategoria="calles";
					break;

				case DireccionConstantesFunciones.LABEL_ASEGURADA:
					sNombreCampoCategoria="asegurada";
					break;

				case DireccionConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case DireccionConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DireccionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DireccionConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPODIRECCION:
					sNombreCampoCategoriaValor="id_tipo_direccion";
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA:
					sNombreCampoCategoriaValor="id_tipo_vivienda";
					break;

				case DireccionConstantesFunciones.LABEL_SECTOR:
					sNombreCampoCategoriaValor="sector";
					break;

				case DireccionConstantesFunciones.LABEL_BARRIO:
					sNombreCampoCategoriaValor="barrio";
					break;

				case DireccionConstantesFunciones.LABEL_CALLES:
					sNombreCampoCategoriaValor="calles";
					break;

				case DireccionConstantesFunciones.LABEL_ASEGURADA:
					sNombreCampoCategoriaValor="asegurada";
					break;

				case DireccionConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case DireccionConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDireccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDireccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DireccionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DireccionConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPODIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_direccion");
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Vivienda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_vivienda");
					break;

				case DireccionConstantesFunciones.LABEL_SECTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sector",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sector");
					break;

				case DireccionConstantesFunciones.LABEL_BARRIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Barrio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"barrio");
					break;

				case DireccionConstantesFunciones.LABEL_CALLES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Calles",sNombreCampoCategoria,sNombreCampoCategoriaValor,"calles");
					break;

				case DireccionConstantesFunciones.LABEL_ASEGURADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asegurada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"asegurada");
					break;

				case DireccionConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case DireccionConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoDireccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Direccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DireccionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPODIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_IDTIPODIRECCION);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.gettipodireccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.gettipovivienda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_SECTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_SECTOR);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getsector());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_BARRIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_BARRIO);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getbarrio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_CALLES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_CALLES);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getcalles());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_ASEGURADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_ASEGURADA);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getasegurada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DireccionConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DireccionConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Direccion direccion:direccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(direccion.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelDireccion(row);				
			//	iRow++;
			//}				
			
			//for(Direccion direccionAux:direccionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDireccion(direccionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDireccion(false);
			
			//SI ES MANUAL
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDireccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDireccion(false);
			
			//SI ES MANUAL
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDireccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDireccion(false);
			
			//SI ES MANUAL
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDireccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDireccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDireccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDireccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDireccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDireccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDireccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosDireccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosDireccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDireccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDireccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDireccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDireccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDireccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDireccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDireccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDireccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DireccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DireccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDireccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDireccion();
		
		this.inicializarActualizarBindingBotonesManualDireccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDireccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDireccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDireccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDireccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDireccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDireccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDireccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDireccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDireccion.jCheckBoxPostAccionNuevoDireccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDireccion.jCheckBoxPostAccionSinCerrarDireccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDireccion.jCheckBoxPostAccionSinMensajeDireccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDireccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDireccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDireccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDireccion!=null) {
				this.jInternalFrameDetalleFormDireccion.jCheckBoxPostAccionNuevoDireccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDireccion.jCheckBoxPostAccionSinCerrarDireccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDireccion.jCheckBoxPostAccionSinMensajeDireccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDireccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDireccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDireccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDireccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDireccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDireccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDireccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDireccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDireccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDireccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDireccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDireccion(Boolean esInicializar) throws Exception {
		try	{	
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDireccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDireccion() throws Exception {
		try	{
			if(DireccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDireccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDireccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDireccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDireccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDireccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDireccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDireccion.addItem(reporte);
			}
			
			
			if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDireccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDireccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDireccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDireccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDireccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDireccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDireccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDireccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDireccion!=null) {
				this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDireccion!=null) {
				this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDireccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDireccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDireccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDireccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDireccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDireccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDireccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteDireccion.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteDireccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.getSelectedItem()!=null){this.id_tipo_viviendaFK_IdValorClienteVivienda=((TipoVivienda)this.jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.getSelectedItem()!=null){this.id_tipo_direccionFK_IdValorDireccion=((TipoDireccion)this.jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDireccion(Boolean esInicializar) throws Exception {				
		if(DireccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDireccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDireccion() throws Exception {
		this.inicializarActualizarBindingTablaDireccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDireccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDireccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDireccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=direccionLogic.getDireccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=direccions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDireccion.setModel(new DireccionModel(this.direccionLogic.getDireccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDireccion.setModel(new DireccionModel(this.direccions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDireccion!=null && this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDireccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DireccionConstantesFunciones.SCLASSWEBTITULO,direccionConstantesFunciones.resaltarSeleccionarDireccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DireccionConstantesFunciones.SCLASSWEBTITULO,direccionConstantesFunciones.resaltarSeleccionarDireccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_ID));

		if(this.direccionConstantesFunciones.mostraridDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.direccionConstantesFunciones.resaltaridDireccion,this.direccionConstantesFunciones.activaridDireccion,this,true,"idDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.direccionConstantesFunciones.resaltaridDireccion,this.direccionConstantesFunciones.activaridDireccion,this,true,"idDireccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.direccionConstantesFunciones.mostrarid_empresaDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.direccionConstantesFunciones.resaltarid_empresaDireccion,this,this.direccionConstantesFunciones.activarid_empresaDireccion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.direccionConstantesFunciones.resaltarid_empresaDireccion,this,this.direccionConstantesFunciones.activarid_empresaDireccion,false,"id_empresaDireccion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDCLIENTE));

		if(this.direccionConstantesFunciones.mostrarid_clienteDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.direccionConstantesFunciones.resaltarid_clienteDireccion,this,this.direccionConstantesFunciones.activarid_clienteDireccion));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.direccionConstantesFunciones.resaltarid_clienteDireccion,this,this.direccionConstantesFunciones.activarid_clienteDireccion,true,"id_clienteDireccion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDTIPODIRECCION));

		if(this.direccionConstantesFunciones.mostrarid_tipo_direccionDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_IDTIPODIRECCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDireccionTableCell(this.tipodireccionsForeignKey,this.direccionConstantesFunciones.resaltarid_tipo_direccionDireccion,this,this.direccionConstantesFunciones.activarid_tipo_direccionDireccion));
			tableColumn.setCellEditor(new TipoDireccionTableCell(this.tipodireccionsForeignKey,this.direccionConstantesFunciones.resaltarid_tipo_direccionDireccion,this,this.direccionConstantesFunciones.activarid_tipo_direccionDireccion,true,"id_tipo_direccionDireccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA));

		if(this.direccionConstantesFunciones.mostrarid_tipo_viviendaDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoViviendaTableCell(this.tipoviviendasForeignKey,this.direccionConstantesFunciones.resaltarid_tipo_viviendaDireccion,this,this.direccionConstantesFunciones.activarid_tipo_viviendaDireccion));
			tableColumn.setCellEditor(new TipoViviendaTableCell(this.tipoviviendasForeignKey,this.direccionConstantesFunciones.resaltarid_tipo_viviendaDireccion,this,this.direccionConstantesFunciones.activarid_tipo_viviendaDireccion,true,"id_tipo_viviendaDireccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_SECTOR));

		if(this.direccionConstantesFunciones.mostrarsectorDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_SECTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.direccionConstantesFunciones.resaltarsectorDireccion,this.direccionConstantesFunciones.activarsectorDireccion,this,true,"sectorDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.direccionConstantesFunciones.resaltarsectorDireccion,this.direccionConstantesFunciones.activarsectorDireccion,this,true,"sectorDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_BARRIO));

		if(this.direccionConstantesFunciones.mostrarbarrioDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_BARRIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.direccionConstantesFunciones.resaltarbarrioDireccion,this.direccionConstantesFunciones.activarbarrioDireccion,this,true,"barrioDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.direccionConstantesFunciones.resaltarbarrioDireccion,this.direccionConstantesFunciones.activarbarrioDireccion,this,true,"barrioDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_CALLES));

		if(this.direccionConstantesFunciones.mostrarcallesDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_CALLES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.direccionConstantesFunciones.resaltarcallesDireccion,this.direccionConstantesFunciones.activarcallesDireccion,this,true,"callesDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.direccionConstantesFunciones.resaltarcallesDireccion,this.direccionConstantesFunciones.activarcallesDireccion,this,true,"callesDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_ASEGURADA));

		if(this.direccionConstantesFunciones.mostraraseguradaDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_ASEGURADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.direccionConstantesFunciones.resaltaraseguradaDireccion,this.direccionConstantesFunciones.activaraseguradaDireccion,this,true,"aseguradaDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.direccionConstantesFunciones.resaltaraseguradaDireccion,this.direccionConstantesFunciones.activaraseguradaDireccion,this,true,"aseguradaDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_DIRECCION));

		if(this.direccionConstantesFunciones.mostrardireccionDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.direccionConstantesFunciones.resaltardireccionDireccion,this.direccionConstantesFunciones.activardireccionDireccion,this,true,"direccionDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.direccionConstantesFunciones.resaltardireccionDireccion,this.direccionConstantesFunciones.activardireccionDireccion,this,true,"direccionDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDireccion,DireccionConstantesFunciones.LABEL_ESACTIVO));

		if(this.direccionConstantesFunciones.mostraresactivoDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DireccionConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.direccionConstantesFunciones.resaltaresactivoDireccion,this.direccionConstantesFunciones.activaresactivoDireccion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.direccionConstantesFunciones.resaltaresactivoDireccion,this.direccionConstantesFunciones.activaresactivoDireccion,this,true,"esactivoDireccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.direccionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.direccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.direccionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDireccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.direccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.direccionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDireccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDireccion && this.isPermisoGuardarCambiosDireccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.direccionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.direccionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDireccion.addColumn(tableColumn);
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
			
			this.jTableDatosDireccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDireccion && this.isPermisoGuardarCambiosDireccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDireccion && this.isPermisoGuardarCambiosDireccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDireccion.moveColumn(this.jTableDatosDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDireccion.moveColumn(this.jTableDatosDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDireccion.moveColumn(this.jTableDatosDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDireccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDireccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDireccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDireccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDireccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDireccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDireccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDireccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=direccionLogic.getDireccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=direccions.size()-1;
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
		//this.jTableDatosDireccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDireccion();
			
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
				
				//this.isEsNuevoDireccion=false;
					
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
				if(this.direccionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDireccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDireccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDireccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.direccion.getsType().equals("DUPLICADO")
				   || this.direccion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDireccion=true;
				
				} else {
					this.isEsNuevoDireccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
					if(this.direccion.getId()>=0 && !this.direccion.getIsNew()) {						
						this.isEsNuevoDireccion=false;
						
					} else {
						this.isEsNuevoDireccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDireccion(esRelaciones);						
				
				this.seleccionarDireccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.direccion.getId()<0) {
					this.isEsNuevoDireccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDireccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDireccion(evt,rowIndex);
				}	
				
				if(this.direccionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Direccion: " + this.dDif); 
					}
				}								
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDireccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.direccion)) {
					if(this.direccion.getId()>0) {
						this.direccion.setIsDeleted(true);
						
						this.direccionsEliminados.add(this.direccion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.direccionLogic.getDireccions().remove(this.direccion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.direccions.remove(this.direccion);				
					}
					
					
					((DireccionModel) this.jTableDatosDireccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDireccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDireccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDireccion) {
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDireccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDireccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDireccion(this.direccion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.direccionConstantesFunciones.cargarid_empresaDireccion || this.direccionConstantesFunciones.event_dependid_empresaDireccion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.direccion.getid_empresa());
									//this.inicializarActualizarBindingDireccion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(direccion.getEmpresa()!=null) {
							this.empresasForeignKey.add(direccion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.direccion.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.direccionConstantesFunciones.cargarid_clienteDireccion || this.direccionConstantesFunciones.event_dependid_clienteDireccion) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.direccion.getid_cliente());
									//this.inicializarActualizarBindingDireccion(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(direccion.getCliente()!=null) {
							this.clientesForeignKey.add(direccion.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.direccion.getid_cliente(),false,"Formulario");

					//TipoDireccion
					if(!this.direccionConstantesFunciones.cargarid_tipo_direccionDireccion || this.direccionConstantesFunciones.event_dependid_tipo_direccionDireccion) {
						//this.cargarCombosTipoDireccionsForeignKeyLista(" where id="+this.direccion.getid_tipo_direccion());
									//this.inicializarActualizarBindingDireccion(false,false);
						this.tipodireccionsForeignKey=new ArrayList<TipoDireccion>();

						if(direccion.getTipoDireccion()!=null) {
							this.tipodireccionsForeignKey.add(direccion.getTipoDireccion());
						}

						this.addItemDefectoCombosForeignKeyTipoDireccion();
						this.cargarCombosFrameTipoDireccionsForeignKey("Todos");
					}
					this.setActualTipoDireccionForeignKey(this.direccion.getid_tipo_direccion(),false,"Formulario");

					//TipoVivienda
					if(!this.direccionConstantesFunciones.cargarid_tipo_viviendaDireccion || this.direccionConstantesFunciones.event_dependid_tipo_viviendaDireccion) {
						//this.cargarCombosTipoViviendasForeignKeyLista(" where id="+this.direccion.getid_tipo_vivienda());
									//this.inicializarActualizarBindingDireccion(false,false);
						this.tipoviviendasForeignKey=new ArrayList<TipoVivienda>();

						if(direccion.getTipoVivienda()!=null) {
							this.tipoviviendasForeignKey.add(direccion.getTipoVivienda());
						}

						this.addItemDefectoCombosForeignKeyTipoVivienda();
						this.cargarCombosFrameTipoViviendasForeignKey("Todos");
					}
					this.setActualTipoViviendaForeignKey(this.direccion.getid_tipo_vivienda(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDireccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDireccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDireccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDireccion(Direccion direccion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDireccion(direccion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDireccion(Direccion direccion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDireccion(direccion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDireccion(direccion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDireccion(direccion);
	}
	
	public void setVariablesObjetoActualToFormularioDireccion(Direccion direccion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setText(direccion.getId().toString());
			this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setText(direccion.getsector());
			this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setText(direccion.getbarrio());
			this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setText(direccion.getcalles());
			this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setText(direccion.getasegurada());
			this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setText(direccion.getdireccion());
			this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setSelected(direccion.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Direccion direccionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,direccionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Direccion direccionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				direccionLocal=this.direccion;
			} else {
				direccionLocal=this.direccionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(direccionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDireccion(direccionLocal,true);
					
					if(direccionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(direccionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.direccionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(direccionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDireccion(Direccion direccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDireccion(direccion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDireccion(direccion);
	}
	
	public void setVariablesFormularioToObjetoActualDireccion(Direccion direccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDireccion(direccion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDireccion(Direccion direccion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.getText()==null || this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.getText()=="" || this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.getText()=="Id") {
				this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setText("0");
			}

			if(conColumnasBase) {direccion.setId(Long.parseLong(this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelIdDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			direccion.setsector(this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_SECTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelsectorDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			direccion.setbarrio(this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_BARRIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelbarrioDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			direccion.setcalles(this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_CALLES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelcallesDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			direccion.setasegurada(this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_ASEGURADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelaseguradaDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			direccion.setdireccion(this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabeldireccionDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			direccion.setesactivo(this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DireccionConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDireccion.jLabelesactivoDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDireccion(Direccion direccionBean,Direccion direccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && direccionBean.getid_cliente()!=null && !direccionBean.getid_cliente().equals(-1L))) {direccion.setid_cliente(direccionBean.getid_cliente());}
			if(conDefault || (!conDefault && direccionBean.getid_tipo_direccion()!=null && !direccionBean.getid_tipo_direccion().equals(-1L))) {direccion.setid_tipo_direccion(direccionBean.getid_tipo_direccion());}
			if(conDefault || (!conDefault && direccionBean.getid_tipo_vivienda()!=null && !direccionBean.getid_tipo_vivienda().equals(-1L))) {direccion.setid_tipo_vivienda(direccionBean.getid_tipo_vivienda());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDireccion(Direccion direccionOrigen,Direccion direccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && direccionOrigen.getId()!=null && !direccionOrigen.getId().equals(0L))) {direccion.setId(direccionOrigen.getId());}}
			if(conDefault || (!conDefault && direccionOrigen.getid_cliente()!=null && !direccionOrigen.getid_cliente().equals(-1L))) {direccion.setid_cliente(direccionOrigen.getid_cliente());}
			if(conDefault || (!conDefault && direccionOrigen.getid_tipo_direccion()!=null && !direccionOrigen.getid_tipo_direccion().equals(-1L))) {direccion.setid_tipo_direccion(direccionOrigen.getid_tipo_direccion());}
			if(conDefault || (!conDefault && direccionOrigen.getid_tipo_vivienda()!=null && !direccionOrigen.getid_tipo_vivienda().equals(-1L))) {direccion.setid_tipo_vivienda(direccionOrigen.getid_tipo_vivienda());}
			if(conDefault || (!conDefault && direccionOrigen.getsector()!=null && !direccionOrigen.getsector().equals(""))) {direccion.setsector(direccionOrigen.getsector());}
			if(conDefault || (!conDefault && direccionOrigen.getbarrio()!=null && !direccionOrigen.getbarrio().equals(""))) {direccion.setbarrio(direccionOrigen.getbarrio());}
			if(conDefault || (!conDefault && direccionOrigen.getcalles()!=null && !direccionOrigen.getcalles().equals(""))) {direccion.setcalles(direccionOrigen.getcalles());}
			if(conDefault || (!conDefault && direccionOrigen.getasegurada()!=null && !direccionOrigen.getasegurada().equals(""))) {direccion.setasegurada(direccionOrigen.getasegurada());}
			if(conDefault || (!conDefault && direccionOrigen.getdireccion()!=null && !direccionOrigen.getdireccion().equals(""))) {direccion.setdireccion(direccionOrigen.getdireccion());}
			if(conDefault || (!conDefault && direccionOrigen.getesactivo()!=null && !direccionOrigen.getesactivo().equals(false))) {direccion.setesactivo(direccionOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDireccion(Direccion direccion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setText(direccion.getId().toString());
			this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setText(direccion.getsector());
			this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setText(direccion.getbarrio());
			this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setText(direccion.getcalles());
			this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setText(direccion.getasegurada());
			this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setText(direccion.getdireccion());
			this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setSelected(direccion.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDireccion(DireccionBean direccionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setText(direccionBean.getId().toString());
			this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setText(direccionBean.getsector());
			this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setText(direccionBean.getbarrio());
			this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setText(direccionBean.getcalles());
			this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setText(direccionBean.getasegurada());
			this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setText(direccionBean.getdireccion());
			this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setSelected(direccionBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDireccion(DireccionParameterReturnGeneral direccionReturnGeneral,DireccionBean direccionBean,Boolean conDefault) throws Exception { 
		try {
			Direccion direccionLocal=new Direccion();
			
			direccionLocal=direccionReturnGeneral.getDireccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && direccionLocal.getId()!=null && !direccionLocal.getId().equals(0L))) {direccionBean.setId(direccionLocal.getId());}}
			if(conDefault || (!conDefault && direccionLocal.getid_cliente()!=null && !direccionLocal.getid_cliente().equals(-1L))) {direccionBean.setid_cliente(direccionLocal.getid_cliente());}
			if(conDefault || (!conDefault && direccionLocal.getid_tipo_direccion()!=null && !direccionLocal.getid_tipo_direccion().equals(-1L))) {direccionBean.setid_tipo_direccion(direccionLocal.getid_tipo_direccion());}
			if(conDefault || (!conDefault && direccionLocal.getid_tipo_vivienda()!=null && !direccionLocal.getid_tipo_vivienda().equals(-1L))) {direccionBean.setid_tipo_vivienda(direccionLocal.getid_tipo_vivienda());}
			if(conDefault || (!conDefault && direccionLocal.getsector()!=null && !direccionLocal.getsector().equals(""))) {direccionBean.setsector(direccionLocal.getsector());}
			if(conDefault || (!conDefault && direccionLocal.getbarrio()!=null && !direccionLocal.getbarrio().equals(""))) {direccionBean.setbarrio(direccionLocal.getbarrio());}
			if(conDefault || (!conDefault && direccionLocal.getcalles()!=null && !direccionLocal.getcalles().equals(""))) {direccionBean.setcalles(direccionLocal.getcalles());}
			if(conDefault || (!conDefault && direccionLocal.getasegurada()!=null && !direccionLocal.getasegurada().equals(""))) {direccionBean.setasegurada(direccionLocal.getasegurada());}
			if(conDefault || (!conDefault && direccionLocal.getdireccion()!=null && !direccionLocal.getdireccion().equals(""))) {direccionBean.setdireccion(direccionLocal.getdireccion());}
			if(conDefault || (!conDefault && direccionLocal.getesactivo()!=null && !direccionLocal.getesactivo().equals(false))) {direccionBean.setesactivo(direccionLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDireccionGenerico(Long idDireccionSeleccionado,JComboBox jComboBoxDireccion,List<Direccion> direccionsLocal)throws Exception {
		try {
			Direccion  direccionTemp=null;

			for(Direccion direccionAux:direccionsLocal) {
				if(direccionAux.getId()!=null && direccionAux.getId().equals(idDireccionSeleccionado)) {
					direccionTemp=direccionAux;
					break;
				}
			}

			jComboBoxDireccion.setSelectedItem(direccionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDireccionGenerico(JComboBox jComboBoxDireccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDireccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDireccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDireccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDireccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			direccion=(Direccion) direccionLogic.getDireccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			direccion =(Direccion) direccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!direccion.getIsNew() && !direccion.getIsChanged() && !direccion.getIsDeleted()) {
				sDescripcion=direccion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=direccion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!direccion.getIsNew() && !direccion.getIsChanged() && !direccion.getIsDeleted()) {
				sDescripcion=direccion.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=direccion.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoDireccion")) {
			//sDescripcion=this.getActualTipoDireccionForeignKeyDescripcion((Long)value);
			if(!direccion.getIsNew() && !direccion.getIsChanged() && !direccion.getIsDeleted()) {
				sDescripcion=direccion.gettipodireccion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDireccionForeignKeyDescripcion((Long)value);
				sDescripcion=direccion.gettipodireccion_descripcion();
			}
		}

		if(sTipo.equals("TipoVivienda")) {
			//sDescripcion=this.getActualTipoViviendaForeignKeyDescripcion((Long)value);
			if(!direccion.getIsNew() && !direccion.getIsChanged() && !direccion.getIsDeleted()) {
				sDescripcion=direccion.gettipovivienda_descripcion();
			} else {
				//sDescripcion=this.getActualTipoViviendaForeignKeyDescripcion((Long)value);
				sDescripcion=direccion.gettipovivienda_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Direccion direccionRow=new Direccion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			direccionRow=(Direccion) direccionLogic.getDireccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			direccionRow=(Direccion) direccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDireccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDireccion.setVisible((this.isVisibilidadCeldaNuevoDireccion && this.isPermisoNuevoDireccion));			
			this.jButtonDuplicarDireccion.setVisible((this.isVisibilidadCeldaDuplicarDireccion && this.isPermisoDuplicarDireccion));			
			this.jButtonCopiarDireccion.setVisible((this.isVisibilidadCeldaCopiarDireccion && this.isPermisoCopiarDireccion));
			this.jButtonVerFormDireccion.setVisible((this.isVisibilidadCeldaVerFormDireccion && this.isPermisoVerFormDireccion));
			
			this.jButtonAbrirOrderByDireccion.setVisible((this.isVisibilidadCeldaOrdenDireccion && this.isPermisoOrdenDireccion));			
			
			this.jButtonNuevoRelacionesDireccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDireccion && this.isPermisoNuevoDireccion));			
			this.jButtonNuevoGuardarCambiosDireccion.setVisible((this.isVisibilidadCeldaNuevoDireccion && this.isPermisoNuevoDireccion && this.isPermisoGuardarCambiosDireccion));
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.jInternalFrameDetalleFormDireccion.jButtonModificarDireccion.setVisible((this.isVisibilidadCeldaModificarDireccion && this.isPermisoActualizarDireccion));	
			this.jInternalFrameDetalleFormDireccion.jButtonActualizarDireccion.setVisible((this.isVisibilidadCeldaActualizarDireccion && this.isPermisoActualizarDireccion));	
			this.jInternalFrameDetalleFormDireccion.jButtonEliminarDireccion.setVisible((this.isVisibilidadCeldaEliminarDireccion && this.isPermisoEliminarDireccion));
			this.jInternalFrameDetalleFormDireccion.jButtonCancelarDireccion.setVisible(this.isVisibilidadCeldaCancelarDireccion);							
			this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.setVisible((this.isVisibilidadCeldaGuardarDireccion && this.isPermisoGuardarCambiosDireccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaDireccion.setVisible((this.isVisibilidadCeldaGuardarCambiosDireccion && this.isPermisoGuardarCambiosDireccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDireccion.setVisible((this.isVisibilidadCeldaNuevoDireccion && this.isPermisoNuevoDireccion));						
			this.jButtonDuplicarToolBarDireccion.setVisible((this.isVisibilidadCeldaDuplicarDireccion && this.isPermisoDuplicarDireccion));						
			this.jButtonCopiarToolBarDireccion.setVisible((this.isVisibilidadCeldaCopiarDireccion && this.isPermisoCopiarDireccion));			
			this.jButtonVerFormToolBarDireccion.setVisible((this.isVisibilidadCeldaVerFormDireccion && this.isPermisoVerFormDireccion));			
			this.jButtonAbrirOrderByToolBarDireccion.setVisible((this.isVisibilidadCeldaOrdenDireccion && this.isPermisoOrdenDireccion));
			this.jButtonNuevoRelacionesToolBarDireccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDireccion && this.isPermisoNuevoDireccion));			
			this.jButtonNuevoGuardarCambiosToolBarDireccion.setVisible((this.isVisibilidadCeldaNuevoDireccion && this.isPermisoNuevoDireccion && this.isPermisoGuardarCambiosDireccion));			
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.jInternalFrameDetalleFormDireccion.jButtonModificarToolBarDireccion.setVisible((this.isVisibilidadCeldaModificarDireccion && this.isPermisoActualizarDireccion));	
			this.jInternalFrameDetalleFormDireccion.jButtonActualizarToolBarDireccion.setVisible((this.isVisibilidadCeldaActualizarDireccion  && this.isPermisoActualizarDireccion));	
			this.jInternalFrameDetalleFormDireccion.jButtonEliminarToolBarDireccion.setVisible((this.isVisibilidadCeldaEliminarDireccion && this.isPermisoEliminarDireccion));
			this.jInternalFrameDetalleFormDireccion.jButtonCancelarToolBarDireccion.setVisible(this.isVisibilidadCeldaCancelarDireccion);				
			this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosToolBarDireccion.setVisible((this.isVisibilidadCeldaGuardarDireccion && this.isPermisoGuardarCambiosDireccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDireccion.setVisible((this.isVisibilidadCeldaGuardarCambiosDireccion && this.isPermisoGuardarCambiosDireccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDireccion.setVisible((this.isVisibilidadCeldaNuevoDireccion && this.isPermisoNuevoDireccion));			
			this.jMenuItemDuplicarDireccion.setVisible((this.isVisibilidadCeldaDuplicarDireccion && this.isPermisoDuplicarDireccion));			
			this.jMenuItemCopiarDireccion.setVisible((this.isVisibilidadCeldaCopiarDireccion && this.isPermisoCopiarDireccion));			
			this.jMenuItemVerFormDireccion.setVisible((this.isVisibilidadCeldaVerFormDireccion && this.isPermisoVerFormDireccion));			
			this.jMenuItemAbrirOrderByDireccion.setVisible((this.isVisibilidadCeldaOrdenDireccion && this.isPermisoOrdenDireccion));			
			//this.jMenuItemMostrarOcultarDireccion.setVisible((this.isVisibilidadCeldaOrdenDireccion && this.isPermisoOrdenDireccion));
			this.jMenuItemDetalleAbrirOrderByDireccion.setVisible((this.isVisibilidadCeldaOrdenDireccion && this.isPermisoOrdenDireccion));			
			//this.jMenuItemDetalleMostrarOcultarDireccion.setVisible((this.isVisibilidadCeldaOrdenDireccion && this.isPermisoOrdenDireccion));			
			this.jMenuItemNuevoRelacionesDireccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDireccion && this.isPermisoNuevoDireccion));			
			this.jMenuItemNuevoGuardarCambiosDireccion.setVisible((this.isVisibilidadCeldaNuevoDireccion && this.isPermisoNuevoDireccion && this.isPermisoGuardarCambiosDireccion));									
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.jInternalFrameDetalleFormDireccion.jMenuItemModificarDireccion.setVisible((this.isVisibilidadCeldaModificarDireccion && this.isPermisoActualizarDireccion));	
			this.jInternalFrameDetalleFormDireccion.jMenuItemActualizarDireccion.setVisible((this.isVisibilidadCeldaActualizarDireccion && this.isPermisoActualizarDireccion));	
			this.jInternalFrameDetalleFormDireccion.jMenuItemEliminarDireccion.setVisible((this.isVisibilidadCeldaEliminarDireccion && this.isPermisoEliminarDireccion));
			this.jInternalFrameDetalleFormDireccion.jMenuItemCancelarDireccion.setVisible(this.isVisibilidadCeldaCancelarDireccion);				
			}
			
			this.jMenuItemGuardarCambiosDireccion.setVisible((this.isVisibilidadCeldaGuardarDireccion && this.isPermisoGuardarCambiosDireccion));						
			this.jMenuItemGuardarCambiosTablaDireccion.setVisible((this.isVisibilidadCeldaGuardarCambiosDireccion && this.isPermisoGuardarCambiosDireccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDireccion=this.jButtonNuevoDireccion.isVisible();
			this.isVisibilidadCeldaDuplicarDireccion=this.jButtonDuplicarDireccion.isVisible();
			this.isVisibilidadCeldaCopiarDireccion=this.jButtonCopiarDireccion.isVisible();
			this.isVisibilidadCeldaVerFormDireccion=this.jButtonVerFormDireccion.isVisible();
			
			this.isVisibilidadCeldaOrdenDireccion=this.jButtonAbrirOrderByDireccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDireccion=this.jButtonNuevoRelacionesDireccion.isVisible();
			this.isVisibilidadCeldaModificarDireccion=this.jButtonModificarDireccion.isVisible();
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.isVisibilidadCeldaActualizarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonActualizarDireccion.isVisible();
			this.isVisibilidadCeldaEliminarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonEliminarDireccion.isVisible();
			this.isVisibilidadCeldaCancelarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonCancelarDireccion.isVisible();
			this.isVisibilidadCeldaGuardarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDireccion=this.jButtonGuardarCambiosTablaDireccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDireccion=this.jButtonNuevoToolBarDireccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDireccion=this.jButtonNuevoRelacionesToolBarDireccion.isVisible();
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.isVisibilidadCeldaModificarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonModificarToolBarDireccion.isVisible();
			this.isVisibilidadCeldaActualizarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonActualizarToolBarDireccion.isVisible();
			this.isVisibilidadCeldaEliminarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonEliminarToolBarDireccion.isVisible();
			this.isVisibilidadCeldaCancelarDireccion=this.jInternalFrameDetalleFormDireccion.jButtonCancelarToolBarDireccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDireccion=this.jButtonGuardarCambiosToolBarDireccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDireccion=this.jButtonGuardarCambiosTablaToolBarDireccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDireccion=this.jMenuItemNuevoDireccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDireccion=this.jMenuItemNuevoRelacionesDireccion.isVisible();
			
			if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.isVisibilidadCeldaModificarDireccion=this.jInternalFrameDetalleFormDireccion.jMenuItemModificarDireccion.isVisible();
			this.isVisibilidadCeldaActualizarDireccion=this.jInternalFrameDetalleFormDireccion.jMenuItemActualizarDireccion.isVisible();
			this.isVisibilidadCeldaEliminarDireccion=this.jInternalFrameDetalleFormDireccion.jMenuItemEliminarDireccion.isVisible();
			this.isVisibilidadCeldaCancelarDireccion=this.jInternalFrameDetalleFormDireccion.jMenuItemCancelarDireccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDireccion=this.jMenuItemGuardarCambiosDireccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDireccion=this.jMenuItemGuardarCambiosTablaDireccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDireccion(Boolean esInicializar) {
		if(DireccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.direccionSessionBean.getConGuardarRelaciones()) {
				//if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDireccion();
			}
			
			this.inicializarActualizarBindingBotonesManualDireccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDireccion() {
		this.jButtonNuevoDireccion.setVisible(this.isPermisoNuevoDireccion);			
		this.jButtonDuplicarDireccion.setVisible(this.isPermisoDuplicarDireccion);			
		this.jButtonCopiarDireccion.setVisible(this.isPermisoCopiarDireccion);			
		this.jButtonVerFormDireccion.setVisible(this.isPermisoVerFormDireccion);			
		
		this.jButtonAbrirOrderByDireccion.setVisible(this.isPermisoOrdenDireccion);					
		
		this.jButtonNuevoRelacionesDireccion.setVisible(this.isPermisoNuevoDireccion);			
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonModificarDireccion.setVisible(this.isPermisoActualizarDireccion);	
			this.jInternalFrameDetalleFormDireccion.jButtonActualizarDireccion.setVisible(this.isPermisoActualizarDireccion);	
			this.jInternalFrameDetalleFormDireccion.jButtonEliminarDireccion.setVisible(this.isPermisoEliminarDireccion);
			this.jInternalFrameDetalleFormDireccion.jButtonCancelarDireccion.setVisible(this.isVisibilidadCeldaCancelarDireccion);						
			this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.setVisible(this.isPermisoGuardarCambiosDireccion);							
		}
		
		this.jButtonGuardarCambiosTablaDireccion.setVisible(this.isPermisoActualizarDireccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDireccion() {
		this.jInternalFrameDetalleFormDireccion.jButtonModificarDireccion.setVisible(this.isPermisoActualizarDireccion);	
		this.jInternalFrameDetalleFormDireccion.jButtonActualizarDireccion.setVisible(this.isPermisoActualizarDireccion);	
		this.jInternalFrameDetalleFormDireccion.jButtonEliminarDireccion.setVisible(this.isPermisoEliminarDireccion);
		this.jInternalFrameDetalleFormDireccion.jButtonCancelarDireccion.setVisible(this.isVisibilidadCeldaCancelarDireccion);							
		this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.setVisible((this.isVisibilidadCeldaGuardarDireccion && this.isPermisoGuardarCambiosDireccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDireccion() {
		if(DireccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDireccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDireccion() {
	}
	
	public void jTableDatosDireccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDireccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.direccion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDireccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDireccion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDireccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDireccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.direccionLogic.getConnexion());

				if(this.direccion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.direccion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDireccion=(TitledBorder)this.jScrollPanelDatosDireccion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDireccion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.direccion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteDireccionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDireccion=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosDireccion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDireccion=(TitledBorder)this.jScrollPanelDatosDireccion.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDireccion.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteDireccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebDireccion(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDireccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDireccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.direccionLogic.getConnexion());

				if(this.direccion.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.direccion.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDireccion=(TitledBorder)this.jScrollPanelDatosDireccion.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDireccion.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.direccion.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_direccionDireccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodireccion=true;

			idTienePermisotipodireccion=this.tienePermisosUsuarioEnPaginaWebDireccion(TipoDireccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodireccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDireccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDireccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);

				this.tipodireccionBeanSwingJInternalFrame=new TipoDireccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodireccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodireccionBeanSwingJInternalFrame.getTipoDireccionLogic().setConnexion(this.direccionLogic.getConnexion());

				if(this.direccion.getid_tipo_direccion()!=null) {
					this.tipodireccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodireccionBeanSwingJInternalFrame.setIdActual(this.direccion.getid_tipo_direccion());
					this.tipodireccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodireccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodireccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDireccion();
				}

				JInternalFrameBase jinternalFrame =this.tipodireccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDireccion=(TitledBorder)this.jScrollPanelDatosDireccion.getBorder();
				TitledBorder titledBordertipodireccion=(TitledBorder)this.tipodireccionBeanSwingJInternalFrame.jScrollPanelDatosTipoDireccion.getBorder();

				titledBordertipodireccion.setTitle(titledBorderDireccion.getTitle() + " -> Tipo Direccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_direccionDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getid_tipo_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_direccion = "+this.direccion.getid_tipo_direccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_viviendaDireccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovivienda=true;

			idTienePermisotipovivienda=this.tienePermisosUsuarioEnPaginaWebDireccion(TipoViviendaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovivienda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDireccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDireccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);

				this.tipoviviendaBeanSwingJInternalFrame=new TipoViviendaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoviviendaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoviviendaBeanSwingJInternalFrame.getTipoViviendaLogic().setConnexion(this.direccionLogic.getConnexion());

				if(this.direccion.getid_tipo_vivienda()!=null) {
					this.tipoviviendaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoviviendaBeanSwingJInternalFrame.setIdActual(this.direccion.getid_tipo_vivienda());
					this.tipoviviendaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoviviendaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoviviendaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoVivienda();
				}

				JInternalFrameBase jinternalFrame =this.tipoviviendaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDireccion=(TitledBorder)this.jScrollPanelDatosDireccion.getBorder();
				TitledBorder titledBordertipovivienda=(TitledBorder)this.tipoviviendaBeanSwingJInternalFrame.jScrollPanelDatosTipoVivienda.getBorder();

				titledBordertipovivienda.setTitle(titledBorderDireccion.getTitle() + " -> Tipo Vivienda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_viviendaDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getid_tipo_vivienda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_vivienda = "+this.direccion.getid_tipo_vivienda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsectorDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getsector()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sector like '%"+this.direccion.getsector()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbarrioDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getbarrio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where barrio like '%"+this.direccion.getbarrio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncallesDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getcalles()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where calles like '%"+this.direccion.getcalles()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaseguradaDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getasegurada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where asegurada like '%"+this.direccion.getasegurada()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.direccion.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDireccion(this.getdireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.direccion==null) {
						this.direccion = new Direccion();
					}

					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);
				}

				if(this.direccion.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.direccion.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteDireccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDireccion(false,false);

			this.getDireccionsFK_IdCliente();

			this.inicializarActualizarBindingDireccion(false);

			//if(DireccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDireccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDireccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDireccion(false,false);

			this.getDireccionsFK_IdEmpresa();

			this.inicializarActualizarBindingDireccion(false);

			//if(DireccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDireccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteViviendaDireccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDireccion(false,false);

			this.getDireccionsFK_IdValorClienteVivienda();

			this.inicializarActualizarBindingDireccion(false);

			//if(DireccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDireccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorDireccionDireccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDireccion(false,false);

			this.getDireccionsFK_IdValorDireccion();

			this.inicializarActualizarBindingDireccion(false);

			//if(DireccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDireccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.direccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDireccion() {
		if(this.jInternalFrameDetalleFormDireccion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
			this.jInternalFrameDetalleFormDireccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormDireccion.dispose();
			this.jInternalFrameDetalleFormDireccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDireccion!=null) {
			this.jInternalFrameReporteDinamicoDireccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDireccion.dispose();
			this.jInternalFrameReporteDinamicoDireccion=null;
		}
		
		if(this.jInternalFrameImportacionDireccion!=null) {
			this.jInternalFrameImportacionDireccion.setVisible(false);	    			
			this.jInternalFrameImportacionDireccion.dispose();
			this.jInternalFrameImportacionDireccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDireccion();
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			
			if(sTipo.equals("NuevoDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDireccion")) {
				jButtonDuplicarDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDireccion")) {
				jButtonCopiarDireccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormDireccion")) {
				jButtonVerFormDireccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDireccion")) {
				jButtonDuplicarDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDireccion")) {
				jButtonDuplicarDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDireccion")) {
				jButtonModificarDireccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDireccion")) {
				jButtonModificarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDireccion")) {
				jButtonModificarDireccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDireccion")) {
				jButtonActualizarDireccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDireccion")) {
				jButtonActualizarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDireccion")) {
				jButtonActualizarDireccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarDireccion")) {
				jButtonEliminarDireccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDireccion")) {
				jButtonEliminarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDireccion")) {
				jButtonEliminarDireccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarDireccion")) {
				jButtonCancelarDireccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDireccion")) {
				jButtonCancelarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDireccion")) {
				jButtonCancelarDireccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarDireccion")) {
				jButtonCerrarDireccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDireccion")) {
				jButtonCerrarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDireccion")) {
				jButtonCerrarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDireccion")) {
				jButtonMostrarOcultarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDireccion")) {
				jButtonCancelarDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDireccion")) {
				jButtonCopiarDireccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDireccion")) {
				jButtonVerFormDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDireccion")) {
				jButtonCopiarDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDireccion")) {
				jButtonVerFormDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDireccion")) {
				jButtonRecargarInformacionDireccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDireccion")) {
				jButtonRecargarInformacionDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDireccion")) {
				jButtonRecargarInformacionDireccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDireccion")) {
				jButtonAnterioresDireccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDireccion")) {
				jButtonAnterioresDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDireccion")) {
				jButtonAnterioresDireccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDireccion")) {
				jButtonSiguientesDireccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDireccion")) {
				jButtonSiguientesDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDireccion")) {
				jButtonSiguientesDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDireccion") || sTipo.equals("MenuItemDetalleAbrirOrderByDireccion")) {
				jButtonAbrirOrderByDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDireccion") || sTipo.equals("MenuItemDetalleMostrarOcultarDireccion")) {
				jButtonMostrarOcultarDireccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDireccion")) {
				jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDireccion")) {
				jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDireccion")) {
				jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDireccion")) {
				jButtonCerrarReporteDinamicoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDireccion")) {
				jButtonGenerarReporteDinamicoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDireccion")) {
				
				jButtonGenerarExcelReporteDinamicoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDireccion")) {
				jButtonCerrarImportacionDireccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDireccion")) {
				
				jButtonGenerarImportacionDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDireccion")) {
				
				jButtonAbrirImportacionDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDireccion")) {
				jComboBoxTiposAccionesDireccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDireccion")) {
				jComboBoxTiposRelacionesDireccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDireccion")) {
				jComboBoxTiposAccionesDireccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDireccion")) {
				
				jComboBoxTiposSeleccionarDireccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDireccion")) {
				jTextFieldValorCampoGeneralDireccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDireccion")) {
				jButtonAbrirOrderByDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDireccion")) {
				jButtonAbrirOrderByDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDireccion")) {
				jButtonCerrarOrderByDireccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDireccionBusqueda")) {
				this.jButtonidDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDireccionUpdate")) {
				this.jButtonid_empresaDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDireccionBusqueda")) {
				this.jButtonid_empresaDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteDireccion")) {
				this.jButtonid_clienteDireccionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteDireccionUpdate")) {
				this.jButtonid_clienteDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteDireccionBusqueda")) {
				this.jButtonid_clienteDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_direccionDireccionUpdate")) {
				this.jButtonid_tipo_direccionDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_direccionDireccionBusqueda")) {
				this.jButtonid_tipo_direccionDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_viviendaDireccionUpdate")) {
				this.jButtonid_tipo_viviendaDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_viviendaDireccionBusqueda")) {
				this.jButtonid_tipo_viviendaDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sectorDireccionBusqueda")) {
				this.jButtonsectorDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("barrioDireccionBusqueda")) {
				this.jButtonbarrioDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("callesDireccionBusqueda")) {
				this.jButtoncallesDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aseguradaDireccionBusqueda")) {
				this.jButtonaseguradaDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionDireccionBusqueda")) {
				this.jButtondireccionDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoDireccionBusqueda")) {
				this.jButtonesactivoDireccionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteDireccion")) {
				this.jButtonid_clienteDireccionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteDireccion")) {
				this.jButtonFK_IdClienteDireccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteViviendaDireccion")) {
				this.jButtonFK_IdValorClienteViviendaDireccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorDireccionDireccion")) {
				this.jButtonFK_IdValorDireccionDireccionActionPerformed(evt);
			}
			
			;
			
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDireccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Direccion direccionLocal=null;
			
			if(!this.getEsControlTabla()) {
				direccionLocal=this.direccion;
			} else {
				direccionLocal=this.direccionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
							
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
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
			
			


			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
								
						
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
								
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
							
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
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
			
			


			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
								
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDireccion")) {
					jCheckBoxSeleccionarTodosDireccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDireccion")) {
					jCheckBoxSeleccionadosDireccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDireccion")) {
					
				}
				
				


				
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
												
				
				


				
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
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
			
			


			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDireccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.direccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.direccion);
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
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
				
				


				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Direccion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Direccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.direccionAnterior =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.direccionAnterior =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDireccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDireccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDireccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.direccion =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.direccion =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.direccion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDireccion")) {
				
				}
				
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDireccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDireccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDireccion")) {
			
			}
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDireccion();
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			if(sTipo.equals("NuevoDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDireccion")) {
				jButtonDuplicarDireccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDireccion")) {
				jButtonCopiarDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDireccion")) {
				jButtonVerFormDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDireccion")) {
				jButtonNuevoDireccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDireccion")) {
				jButtonModificarDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDireccion")) {
				jButtonActualizarDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDireccion")) {
				jButtonEliminarDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDireccion")) {
				jButtonCancelarDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDireccion")) {
				jButtonCerrarDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDireccion")) {
				jButtonGuardarCambiosDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDireccion")) {
				jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDireccion")) {
				jButtonAbrirOrderByDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDireccion")) {
				jButtonRecargarInformacionDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDireccion")) {
				jButtonAnterioresDireccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDireccion")) {
				jButtonSiguientesDireccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDireccionBusqueda")) {
				this.jButtonidDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDireccionUpdate")) {
				this.jButtonid_empresaDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDireccionBusqueda")) {
				this.jButtonid_empresaDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteDireccion")) {
				this.jButtonid_clienteDireccionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteDireccionUpdate")) {
				this.jButtonid_clienteDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteDireccionBusqueda")) {
				this.jButtonid_clienteDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_direccionDireccionUpdate")) {
				this.jButtonid_tipo_direccionDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_direccionDireccionBusqueda")) {
				this.jButtonid_tipo_direccionDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_viviendaDireccionUpdate")) {
				this.jButtonid_tipo_viviendaDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_viviendaDireccionBusqueda")) {
				this.jButtonid_tipo_viviendaDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sectorDireccionBusqueda")) {
				this.jButtonsectorDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("barrioDireccionBusqueda")) {
				this.jButtonbarrioDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("callesDireccionBusqueda")) {
				this.jButtoncallesDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aseguradaDireccionBusqueda")) {
				this.jButtonaseguradaDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionDireccionBusqueda")) {
				this.jButtondireccionDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoDireccionBusqueda")) {
				this.jButtonesactivoDireccionBusquedaActionPerformed(evt);
			}
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDireccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDireccion")) {
				closingInternalFrameDireccion();
				
			} else if(sTipo.equals("jButtonCancelarDireccion")) {
				JInternalFrameBase jInternalFrameDetalleFormDireccion = (JInternalFrameBase)evt.getSource();
	            	
	            DireccionBeanSwingJInternalFrame jInternalFrameParent=(DireccionBeanSwingJInternalFrame)jInternalFrameDetalleFormDireccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDireccionActionPerformed(null);
			}
			
			DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.direccion,new Object(),this.direccionParameterGeneral,this.direccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDireccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDireccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDireccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.direccion)) {
			if(!esControlTabla) {
				if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);			
				}
				
				if(this.direccionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDireccion(this.direccion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.direccionReturnGeneral=direccionLogic.procesarEventosDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.direccionLogic.getDireccions(),this.direccion,this.direccionParameterGeneral,this.isEsNuevoDireccion,classes);//this.direccionLogic.getDireccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDireccion(this.direccionReturnGeneral,this.direccionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.direccionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDireccion(classes,this.direccionReturnGeneral,this.direccionBean,false);
					}
						
					if(this.direccionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDireccion(this.direccionReturnGeneral.getDireccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDireccion(this.direccionReturnGeneral.getDireccion());	
					}
						
					if(this.direccionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDireccion(this.direccionReturnGeneral.getDireccion(),classes);//this.direccionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDireccion(this.direccion,classes);//this.direccionBean);									
				}
			
				if(DireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDireccion(this.direccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDireccion(this.direccion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.direccionAnterior!=null) {
						this.direccion=this.direccionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.direccionReturnGeneral=direccionLogic.procesarEventosDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.direccionLogic.getDireccions(),this.direccion,this.direccionParameterGeneral,this.isEsNuevoDireccion,classes);//this.direccionLogic.getDireccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.direccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.direccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.direccionReturnGeneral.getDireccion(),direccionLogic.getDireccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.direccionReturnGeneral.getDireccion(),this.direccions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDireccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosDireccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDireccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosDireccion() throws Exception {
		
		DireccionModel direccionModel=(DireccionModel)this.jTableDatosDireccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			direccionModel.direccions=this.direccionLogic.getDireccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			direccionModel.direccions=this.direccions;
		}
		
		
		((DireccionModel) this.jTableDatosDireccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDireccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdireccionAnterior(),this.direccionLogic.getDireccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdireccionAnterior(),this.direccions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDireccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDireccion(Direccion direccion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
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
										
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.direccion,new Object(),generalEntityParameterGeneral,this.direccionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.direccionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DireccionConstantesFunciones.getClassesRelationshipsOfDireccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DireccionConstantesFunciones.getClassesRelationshipsFromStringsOfDireccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDireccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.direccion,new Object(),generalEntityParameterGeneral,this.direccionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDireccion(DireccionBean direccionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDireccion(ArrayList<Classe> classes,DireccionReturnGeneral direccionReturnGeneral,DireccionBean direccionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDireccion(Direccion direccion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.direccion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDireccion = new DireccionDetalleFormJInternalFrame(jDesktopPane,this.direccionSessionBean.getConGuardarRelaciones(),this.direccionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDireccion);
		this.jInternalFrameDetalleFormDireccion.setVisible(false);
		this.jInternalFrameDetalleFormDireccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormDireccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDireccion.direccionLogic=this.direccionLogic;
		
		this.cargarCombosFrameForeignKeyDireccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDireccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDireccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDireccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDireccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDireccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDireccion"));
		
		this.jInternalFrameDetalleFormDireccion.jButtonModificarDireccion.addActionListener(new ButtonActionListener(this,"ModificarDireccion"));

		
		this.jInternalFrameDetalleFormDireccion.jButtonModificarToolBarDireccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDireccion"));
					
		this.jInternalFrameDetalleFormDireccion.jMenuItemModificarDireccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonActualizarDireccion.addActionListener (new ButtonActionListener(this,"ActualizarDireccion"));
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonActualizarToolBarDireccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDireccion"));
						
		this.jInternalFrameDetalleFormDireccion.jMenuItemActualizarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonEliminarDireccion.addActionListener (new ButtonActionListener(this,"EliminarDireccion"));
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonEliminarToolBarDireccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDireccion"));
								
		this.jInternalFrameDetalleFormDireccion.jMenuItemEliminarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonCancelarDireccion.addActionListener (new ButtonActionListener(this,"CancelarDireccion"));
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonCancelarToolBarDireccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDireccion"));
					
		this.jInternalFrameDetalleFormDireccion.jMenuItemCancelarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDireccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDireccion.jMenuItemDetalleCerrarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosToolBarDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDireccion"));
		
		
		
		this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosToolBarDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDireccion"));
		
		
		
		this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDireccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonidDireccionBusqueda.addActionListener(new ButtonActionListener(this,"idDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_empresaDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_empresaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDireccionBusqueda"));
		//jButtonid_clienteDireccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDireccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccion.addActionListener(new ButtonActionListener(this,"id_clienteDireccion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_direccionDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_direccionDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_direccionDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_direccionDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_viviendaDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_viviendaDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_viviendaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_viviendaDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonsectorDireccionBusqueda.addActionListener(new ButtonActionListener(this,"sectorDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonbarrioDireccionBusqueda.addActionListener(new ButtonActionListener(this,"barrioDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtoncallesDireccionBusqueda.addActionListener(new ButtonActionListener(this,"callesDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonaseguradaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"aseguradaDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtondireccionDireccionBusqueda.addActionListener(new ButtonActionListener(this,"direccionDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonesactivoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"esactivoDireccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDireccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDireccion"));
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDireccion"));
		}
		
		this.jTableDatosDireccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDireccion"));
		
		this.jTableDatosDireccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDireccion"));
		
		this.jButtonNuevoDireccion.addActionListener(new ButtonActionListener(this,"NuevoDireccion"));
		
		this.jButtonDuplicarDireccion.addActionListener(new ButtonActionListener(this,"DuplicarDireccion"));
		
		this.jButtonCopiarDireccion.addActionListener(new ButtonActionListener(this,"CopiarDireccion"));
		
		this.jButtonVerFormDireccion.addActionListener(new ButtonActionListener(this,"VerFormDireccion"));
		
		
		this.jButtonNuevoToolBarDireccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarDireccion"));
			
		this.jButtonDuplicarToolBarDireccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDireccion"));
			
		this.jMenuItemNuevoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDireccion"));
			
		this.jMenuItemDuplicarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDireccion"));		
		
		
		this.jButtonNuevoRelacionesDireccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDireccion"));
		
		
		this.jButtonNuevoRelacionesToolBarDireccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDireccion"));
			
		this.jMenuItemNuevoRelacionesDireccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDireccion"));		
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonModificarDireccion.addActionListener(new ButtonActionListener(this,"ModificarDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonModificarToolBarDireccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDireccion"));
			
			this.jInternalFrameDetalleFormDireccion.jMenuItemModificarDireccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDireccion.jButtonActualizarDireccion.addActionListener (new ButtonActionListener(this,"ActualizarDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonActualizarToolBarDireccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDireccion"));
				
			this.jInternalFrameDetalleFormDireccion.jMenuItemActualizarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonEliminarDireccion.addActionListener (new ButtonActionListener(this,"EliminarDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonEliminarToolBarDireccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDireccion"));
						
			this.jInternalFrameDetalleFormDireccion.jMenuItemEliminarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonCancelarDireccion.addActionListener (new ButtonActionListener(this,"CancelarDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonCancelarToolBarDireccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDireccion"));
			
			this.jInternalFrameDetalleFormDireccion.jMenuItemCancelarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDireccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDireccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDireccion"));		
		
		
		this.jButtonCerrarDireccion.addActionListener (new ButtonActionListener(this,"CerrarDireccion"));
		
		
		this.jButtonCerrarToolBarDireccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarDireccion"));
			
		this.jMenuItemCerrarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDireccion"));
			
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jMenuItemDetalleCerrarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosToolBarDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDireccion"));
		}
		
		this.jButtonCopiarToolBarDireccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarDireccion"));
			
		this.jButtonVerFormToolBarDireccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarDireccion"));
		
		this.jMenuItemGuardarCambiosDireccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDireccion"));
			
		this.jMenuItemCopiarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDireccion"));		
		
		this.jMenuItemVerFormDireccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDireccion"));		
		
		
		this.jButtonGuardarCambiosTablaDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDireccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDireccion"));
			
		this.jMenuItemGuardarCambiosTablaDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDireccion"));		
		
		
		
		this.jButtonRecargarInformacionDireccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionDireccion"));
					
		this.jButtonRecargarInformacionToolBarDireccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDireccion"));
		
		this.jMenuItemRecargarInformacionDireccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDireccion"));		
		
		
		
		this.jButtonAnterioresDireccion.addActionListener (new ButtonActionListener(this,"AnterioresDireccion"));
		
		
		this.jButtonAnterioresToolBarDireccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDireccion"));
		
		this.jMenuItemAnterioresDireccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDireccion"));		
		
		
		this.jButtonSiguientesDireccion.addActionListener (new ButtonActionListener(this,"SiguientesDireccion"));
		
		
		this.jButtonSiguientesToolBarDireccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDireccion"));
			
		this.jMenuItemSiguientesDireccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDireccion"));
			
		this.jMenuItemAbrirOrderByDireccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDireccion"));
			
		this.jMenuItemMostrarOcultarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDireccion"));
			
		this.jMenuItemDetalleAbrirOrderByDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDireccion"));
			
		this.jMenuItemDetalleMostarOcultarDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDireccion"));		
		
		
		this.jButtonNuevoGuardarCambiosDireccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDireccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDireccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDireccion"));
			
		this.jMenuItemNuevoGuardarCambiosDireccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDireccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDireccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDireccion"));

		this.jCheckBoxSeleccionadosDireccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDireccion"));
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDireccion"));
		}
		
		
		this.jComboBoxTiposRelacionesDireccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesDireccion"));
			
		this.jComboBoxTiposAccionesDireccion.addActionListener (new ButtonActionListener(this,"TiposAccionesDireccion"));
					
		this.jComboBoxTiposSeleccionarDireccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDireccion"));
			
		this.jTextFieldValorCampoGeneralDireccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDireccion"));		
		
		
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonidDireccionBusqueda.addActionListener(new ButtonActionListener(this,"idDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_empresaDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_empresaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDireccionBusqueda"));
		//jButtonid_clienteDireccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDireccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccion.addActionListener(new ButtonActionListener(this,"id_clienteDireccion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_direccionDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_direccionDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_direccionDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_direccionDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_viviendaDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_viviendaDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_viviendaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_viviendaDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonsectorDireccionBusqueda.addActionListener(new ButtonActionListener(this,"sectorDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonbarrioDireccionBusqueda.addActionListener(new ButtonActionListener(this,"barrioDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtoncallesDireccionBusqueda.addActionListener(new ButtonActionListener(this,"callesDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonaseguradaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"aseguradaDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtondireccionDireccionBusqueda.addActionListener(new ButtonActionListener(this,"direccionDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonesactivoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"esactivoDireccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteDireccion.addActionListener(new ButtonActionListener(this,"FK_IdClienteDireccion"));

			this.jButtonBuscarFK_IdClienteid_clienteDireccion.addActionListener(new ButtonActionListener(this,"id_clienteDireccion"));

			this.jButtonFK_IdValorClienteViviendaDireccion.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteViviendaDireccion"));

			this.jButtonFK_IdValorDireccionDireccion.addActionListener(new ButtonActionListener(this,"FK_IdValorDireccionDireccion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDireccion!=null) {
				this.jInternalFrameReporteDinamicoDireccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDireccion"));
				this.jInternalFrameReporteDinamicoDireccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDireccion"));
				this.jInternalFrameReporteDinamicoDireccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDireccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoDireccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDireccion"));				
			//this.jButtonGenerarReporteDinamicoDireccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDireccion"));
			//this.jButtonGenerarExcelReporteDinamicoDireccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDireccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDireccion!=null) {
				this.jInternalFrameImportacionDireccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDireccion"));
				this.jInternalFrameImportacionDireccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDireccion"));
				this.jInternalFrameImportacionDireccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDireccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDireccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByDireccion"));
			
			this.jButtonAbrirOrderByToolBarDireccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDireccion"));			
			
			if(this.jInternalFrameOrderByDireccion!=null) {
				this.jInternalFrameOrderByDireccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDireccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDireccion.jTabbedPaneRelacionesDireccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDireccion"));
		
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
            		closingInternalFrameDireccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDireccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDireccion = (JInternalFrameBase)event.getSource();
	            	
	            DireccionBeanSwingJInternalFrame jInternalFrameParent=(DireccionBeanSwingJInternalFrame)jInternalFrameDetalleFormDireccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDireccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDireccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDireccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDireccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDireccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDireccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDireccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDireccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDireccion";
		inputMap = this.jButtonNuevoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDireccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDireccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDireccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDireccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDireccion";
		inputMap = this.jButtonNuevoRelacionesDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDireccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDireccion";
		inputMap = this.jButtonModificarDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDireccion";
		inputMap = this.jButtonActualizarDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDireccion";
		inputMap = this.jButtonEliminarDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDireccion";
		inputMap = this.jButtonCancelarDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDireccion";
		inputMap = this.jButtonCerrarDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDireccion";
		inputMap = this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDireccion.jButtonGuardarCambiosDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDireccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDireccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDireccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDireccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDireccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDireccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDireccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDireccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonidDireccionBusqueda.addActionListener(new ButtonActionListener(this,"idDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_empresaDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_empresaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDireccionBusqueda"));
		//jButtonid_clienteDireccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDireccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccion.addActionListener(new ButtonActionListener(this,"id_clienteDireccion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_direccionDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_direccionDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_direccionDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_direccionDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_viviendaDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_viviendaDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonid_tipo_viviendaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_viviendaDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonsectorDireccionBusqueda.addActionListener(new ButtonActionListener(this,"sectorDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonbarrioDireccionBusqueda.addActionListener(new ButtonActionListener(this,"barrioDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtoncallesDireccionBusqueda.addActionListener(new ButtonActionListener(this,"callesDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonaseguradaDireccionBusqueda.addActionListener(new ButtonActionListener(this,"aseguradaDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtondireccionDireccionBusqueda.addActionListener(new ButtonActionListener(this,"direccionDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDireccion.jButtonesactivoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"esactivoDireccionBusqueda"));
		
		
		this.jButtonFK_IdClienteDireccion.addActionListener(new ButtonActionListener(this,"FK_IdClienteDireccion"));

		this.jButtonBuscarFK_IdClienteid_clienteDireccion.addActionListener(new ButtonActionListener(this,"id_clienteDireccion"));

		this.jButtonFK_IdValorClienteViviendaDireccion.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteViviendaDireccion"));

		this.jButtonFK_IdValorDireccionDireccion.addActionListener(new ButtonActionListener(this,"FK_IdValorDireccionDireccion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDireccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDireccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDireccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
					direccionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Direccion direccionAux:direccions) {
					direccionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDireccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDireccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
						direccionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Direccion direccionAux:direccions) {
						direccionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
					
						if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							direccionAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Direccion direccionAux:direccions) {
						
						if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							direccionAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDireccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDireccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDireccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDireccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDireccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDireccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDireccion.getSelectedRows();
			
			Direccion direccionLocal=new Direccion();
			
			//this.seleccionarTodosDireccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					direccionLocal =(Direccion) this.direccionLogic.getDireccions().toArray()[this.jTableDatosDireccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					direccionLocal =(Direccion) this.direccions.toArray()[this.jTableDatosDireccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				direccionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
						direccionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Direccion direccionAux:direccions) {
						direccionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDireccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDireccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDireccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDireccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDireccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDireccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDireccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDireccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDireccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Direccion direccionAux:this.direccionLogic.getDireccions()) {
				
						if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_SECTOR)) {
							existe=true;
							direccionAux.setsector(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_BARRIO)) {
							existe=true;
							direccionAux.setbarrio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_CALLES)) {
							existe=true;
							direccionAux.setcalles(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_ASEGURADA)) {
							existe=true;
							direccionAux.setasegurada(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							direccionAux.setdireccion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Direccion direccionAux:direccions) {
					
						if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_SECTOR)) {
							existe=true;
							direccionAux.setsector(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_BARRIO)) {
							existe=true;
							direccionAux.setbarrio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_CALLES)) {
							existe=true;
							direccionAux.setcalles(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_ASEGURADA)) {
							existe=true;
							direccionAux.setasegurada(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							direccionAux.setdireccion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDireccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDireccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDireccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDireccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDireccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDireccion) {				
					conSplash=true;//false;										
					
					//this.startProcessDireccion(conSplash);
				
					this.generarReporteDireccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDireccionsSeleccionados();
				//this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDireccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDireccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDireccion();
				
				this.exportarDireccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDireccions();
				//this.importarDireccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDireccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDireccionsSeleccionados();
				//this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDireccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDireccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDireccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
				}	
			} 			
			else if(DireccionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDireccion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDireccion(conSplash);
					
						//this.actualizarParametrosGeneralDireccion();
						
						this.generarReporteProcesoAccionDireccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DireccionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO DireccionES SELECCIONADOS?", "MANTENIMIENTO DE Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDireccion();
				
						this.actualizarParametrosGeneralDireccion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.direccionReturnGeneral=direccionLogic.procesarAccionDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.direccionLogic.getDireccions(),this.direccionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDireccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDireccion();
					
					DireccionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDireccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDireccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDireccion.jComboBoxTiposAccionesFormularioDireccion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDireccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDireccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDireccion();
			
			if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
			Direccion direccion=new Direccion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDireccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDireccion.getSelectedItem();
			
			
			
			
			direccionsSeleccionados=this.getDireccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(direccionsSeleccionados.size()==1) {
				for(Direccion direccionAux:direccionsSeleccionados) {
					direccion=direccionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDireccion();
			
      		//this.finishProcessDireccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDireccionReturnGeneral() throws Exception {
		if(this.direccionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.direccionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.direccionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.direccionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.direccionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.direccionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDireccion(false);
		}
		
		if(this.direccionReturnGeneral.getConRetornoLista() || this.direccionReturnGeneral.getConRetornoObjeto()) {
			if(this.direccionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.direccionLogic.setDireccions(this.direccionReturnGeneral.getDireccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.direccionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.direccionLogic.setDireccion(this.direccionReturnGeneral.getDireccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDireccion(false);
		}
	}
	
	public void actualizarParametrosGeneralDireccion() throws Exception {
		
		
	}
	
	public ArrayList<Direccion> getDireccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDireccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Direccion direccionAux:direccionLogic.getDireccions()) {
					if(direccionAux.getIsSelected()) {
						direccionsSeleccionados.add(direccionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Direccion direccionAux:this.direccions) {
					if(direccionAux.getIsSelected()) {
						direccionsSeleccionados.add(direccionAux);				
					}
				}
			}
			
			if(direccionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						direccionsSeleccionados.addAll(this.direccionLogic.getDireccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						direccionsSeleccionados.addAll(this.direccions);				
					}
				}
			}
		} else {
			direccionsSeleccionados.add(this.direccion);
		}
		
		return direccionsSeleccionados;
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
	
	public void generarReporteDireccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDireccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDireccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDireccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDireccionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Direccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDireccionsSeleccionados() throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDireccions("Todos",direccionsSeleccionados);
		
	}	
	
	public void generarReporteNormalDireccionsSeleccionados() throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDireccions("Todos",direccionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDireccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDireccions("Todos",direccionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDireccionsSeleccionados() throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDireccion();
		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDireccion();
		
		
		//this.generarReporteDireccions("Todos",direccionsSeleccionados ,direccionImplementable,direccionImplementableHome);
	}
	
	public void mostrarImportacionDireccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDireccion();
		
		this.abrirFrameImportacionDireccion();		
		
			
		//this.generarReporteDireccions("Todos",direccionsSeleccionados ,direccionImplementable,direccionImplementableHome);
	}
	
	public void importarDireccions() throws Exception {		
	
	}
	
	public void exportarDireccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDireccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDireccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDireccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Direccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDireccionsSeleccionados() throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDireccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Direccion direccionAux:direccionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDireccion(direccionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//direccionAux.setsDetalleGeneralEntityReporte(direccionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDireccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_IDTIPODIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_SECTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_BARRIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_CALLES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_ASEGURADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DireccionConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDireccion(Direccion direccion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=direccion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.gettipodireccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.gettipovivienda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getsector();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getbarrio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getcalles();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getasegurada();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=direccion.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDireccionsSeleccionados() throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Direccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDireccion(row);				
				iRow++;
			}				
			
			for(Direccion direccionAux:direccionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDireccion(direccionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDireccionsSeleccionados() throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();		
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"direccion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("direccions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("direccion");
			//elementRoot.appendChild(element);
		
			for(Direccion direccionAux:direccionsSeleccionados) {
				element = document.createElement("direccion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDireccion(direccionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.direccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDireccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_IDTIPODIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_SECTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_BARRIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_CALLES);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_ASEGURADA);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DireccionConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDireccion(Direccion direccion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.gettipodireccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.gettipovivienda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getsector());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getbarrio());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getcalles());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getasegurada());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(direccion.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlDireccion(Direccion direccion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DireccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(direccion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DireccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(direccion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DireccionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(direccion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(DireccionConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(direccion.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipodireccion_descripcion = document.createElement(DireccionConstantesFunciones.IDTIPODIRECCION);
		elementtipodireccion_descripcion.appendChild(document.createTextNode(direccion.gettipodireccion_descripcion()));
		element.appendChild(elementtipodireccion_descripcion);

		Element elementtipovivienda_descripcion = document.createElement(DireccionConstantesFunciones.IDTIPOVIVIENDA);
		elementtipovivienda_descripcion.appendChild(document.createTextNode(direccion.gettipovivienda_descripcion()));
		element.appendChild(elementtipovivienda_descripcion);

		Element elementsector = document.createElement(DireccionConstantesFunciones.SECTOR);
		elementsector.appendChild(document.createTextNode(direccion.getsector().trim()));
		element.appendChild(elementsector);

		Element elementbarrio = document.createElement(DireccionConstantesFunciones.BARRIO);
		elementbarrio.appendChild(document.createTextNode(direccion.getbarrio().trim()));
		element.appendChild(elementbarrio);

		Element elementcalles = document.createElement(DireccionConstantesFunciones.CALLES);
		elementcalles.appendChild(document.createTextNode(direccion.getcalles().trim()));
		element.appendChild(elementcalles);

		Element elementasegurada = document.createElement(DireccionConstantesFunciones.ASEGURADA);
		elementasegurada.appendChild(document.createTextNode(direccion.getasegurada().trim()));
		element.appendChild(elementasegurada);

		Element elementdireccion = document.createElement(DireccionConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(direccion.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementesactivo = document.createElement(DireccionConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(direccion.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoDireccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Direccion> direccionsSeleccionados=new ArrayList<Direccion>();
		
		direccionsSeleccionados=this.getDireccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDireccion(direccionsSeleccionados);
		
		this.generarReporteDireccions("Todos",direccionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDireccion(ArrayList<Direccion> direccionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Direccion direccionAux:direccionsSeleccionados) {
				direccionAux.setsDetalleGeneralEntityReporte(direccionAux.toString());
			
				if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_IDTIPODIRECCION)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.gettipodireccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_IDTIPOVIVIENDA)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.gettipovivienda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_SECTOR)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getsector());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_BARRIO)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getbarrio());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_CALLES)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getcalles());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_ASEGURADA)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getasegurada());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(direccionAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(DireccionConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					direccionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(direccionAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDireccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDireccion=true;
				this.isVisibilidadCeldaNuevoRelacionesDireccion=true;
				this.isVisibilidadCeldaGuardarCambiosDireccion=true;
			}
			
			this.isVisibilidadCeldaModificarDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=false;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
			this.isVisibilidadCeldaModificarDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=true;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
			this.isVisibilidadCeldaModificarDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=true;
			this.isVisibilidadCeldaEliminarDireccion=true;
			this.isVisibilidadCeldaCancelarDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
			this.isVisibilidadCeldaModificarDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=true;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=false;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDireccion=true;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=true;
			this.isVisibilidadCeldaGuardarCambiosDireccion=true;
			this.isVisibilidadCeldaModificarDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=false;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
			this.isVisibilidadCeldaActualizarDireccion=false;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=false;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
			this.isVisibilidadCeldaModificarDireccion=true;
			this.isVisibilidadCeldaActualizarDireccion=false;
			this.isVisibilidadCeldaEliminarDireccion=false;
			this.isVisibilidadCeldaCancelarDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDireccion=false;
				} else {
					this.isVisibilidadCeldaGuardarDireccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DireccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDireccion=true;
			this.isVisibilidadCeldaNuevoRelacionesDireccion=true;
			this.isVisibilidadCeldaGuardarCambiosDireccion=true;
		} else {
			this.actualizarEstadoPanelsDireccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDireccion=false;
			//this.isVisibilidadCeldaVerFormDireccion=false;
			this.isVisibilidadCeldaDuplicarDireccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!direccionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
		} else {
			this.isVisibilidadCeldaNuevoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosDireccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(direccionSessionBean.getEsGuardarRelacionado()) {
			if(!direccionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDireccion=false;												
			}
			
			this.jButtonCerrarDireccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDireccion=false;
		}
		
		if(!this.permiteMantenimiento(this.direccion)) {
			this.isVisibilidadCeldaActualizarDireccion=false;
			this.isVisibilidadCeldaEliminarDireccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDireccion() {
	}
	
	public void actualizarEstadoPanelsDireccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDireccion!=null) {
				this.jScrollPanelDatosEdicionDireccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDireccion!=null) {
				this.jScrollPanelDatosDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDireccion!=null) {
				this.jPanelPaginacionDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.direccionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDireccion!=null) {
					this.jTabbedPaneBusquedasDireccion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.direccionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDireccion!=null) {
				this.jTabbedPaneBusquedasDireccion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDireccion!=null) {
				this.jPanelParametrosReportesDireccion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdClienteDireccion);}

			this.isVisibilidadFK_IdValorClienteVivienda=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteVivienda) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorClienteViviendaDireccion);}

			this.isVisibilidadFK_IdValorDireccion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorDireccion) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorDireccionDireccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdClienteDireccion);}

			this.isVisibilidadFK_IdValorClienteVivienda=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteVivienda) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorClienteViviendaDireccion);}

			this.isVisibilidadFK_IdValorDireccion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorDireccion) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorDireccionDireccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDireccion(Boolean isParaTipoDireccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDireccionNegation=!isParaTipoDireccion;

			this.isVisibilidadFK_IdCliente=isParaTipoDireccionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdClienteDireccion);}

			this.isVisibilidadFK_IdValorClienteVivienda=isParaTipoDireccionNegation;
			if(!this.isVisibilidadFK_IdValorClienteVivienda) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorClienteViviendaDireccion);}

			this.isVisibilidadFK_IdValorDireccion=isParaTipoDireccion;
			if(!this.isVisibilidadFK_IdValorDireccion) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorDireccionDireccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoVivienda(Boolean isParaTipoVivienda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoViviendaNegation=!isParaTipoVivienda;

			this.isVisibilidadFK_IdCliente=isParaTipoViviendaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdClienteDireccion);}

			this.isVisibilidadFK_IdValorClienteVivienda=isParaTipoVivienda;
			if(!this.isVisibilidadFK_IdValorClienteVivienda) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorClienteViviendaDireccion);}

			this.isVisibilidadFK_IdValorDireccion=isParaTipoViviendaNegation;
			if(!this.isVisibilidadFK_IdValorDireccion) {this.jTabbedPaneBusquedasDireccion.remove(jPanelFK_IdValorDireccionDireccion);}
		}
		
	}
	
	
	
	

	public String registrarSesionDireccionParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(direccionSessionBean==null) {
				direccionSessionBean=new DireccionSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(direccionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.direccionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(DireccionConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionDireccion(true);
			//clienteSessionBean.setlidDireccionActual(this.idDireccionActual);

			direccionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDireccion(true);
			direccionSessionBean.setlIdDireccionActualForeignKey(this.idDireccionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DireccionSessionBean direccionSessionBean=new DireccionSessionBean();
		
		if(this.direccionSessionBean==null) {
			this.direccionSessionBean=new DireccionSessionBean();
		}
		
		this.direccionSessionBean.setsUltimaBusquedaDireccion(this.getsAccionBusqueda());
		this.direccionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.direccionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			direccionSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			direccionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteVivienda")) {
			direccionSessionBean.setid_tipo_vivienda(this.getid_tipo_viviendaFK_IdValorClienteVivienda());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorDireccion")) {
			direccionSessionBean.setid_tipo_direccion(this.getid_tipo_direccionFK_IdValorDireccion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DireccionSessionBean direccionSessionBean=new DireccionSessionBean();
		
		if(this.direccionSessionBean==null) {
			this.direccionSessionBean=new DireccionSessionBean();
		}
		
		if(this.direccionSessionBean.getsUltimaBusquedaDireccion()!=null&&!this.direccionSessionBean.getsUltimaBusquedaDireccion().equals("")) {
			this.setsAccionBusqueda(direccionSessionBean.getsUltimaBusquedaDireccion());
			this.setiNumeroPaginacion(direccionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(direccionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(direccionSessionBean.getid_cliente());
				direccionSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(direccionSessionBean.getid_empresa());
				direccionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteVivienda")) {
				this.setid_tipo_viviendaFK_IdValorClienteVivienda(direccionSessionBean.getid_tipo_vivienda());
				direccionSessionBean.setid_tipo_vivienda(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorDireccion")) {
				this.setid_tipo_direccionFK_IdValorDireccion(direccionSessionBean.getid_tipo_direccion());
				direccionSessionBean.setid_tipo_direccion(-1L);
			}
		}
		
		this.direccionSessionBean.setsUltimaBusquedaDireccion("");
		this.direccionSessionBean.setiNumeroPaginacion(DireccionConstantesFunciones.INUMEROPAGINACION);
		this.direccionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDireccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDireccion() {
		this.updateBorderResaltarBusquedasFormularioDireccion();
		this.updateVisibilidadBusquedasFormularioDireccion();
		this.updateHabilitarBusquedasFormularioDireccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioDireccion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDireccion.getComponents().length>0) {
	

		if(this.direccionConstantesFunciones.resaltarFK_IdClienteDireccion!=null) {
			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdClienteDireccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
				jPanel.setBorder(this.direccionConstantesFunciones.resaltarFK_IdClienteDireccion);
			}
		}

		if(this.direccionConstantesFunciones.resaltarFK_IdValorClienteViviendaDireccion!=null) {
			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorClienteViviendaDireccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
				jPanel.setBorder(this.direccionConstantesFunciones.resaltarFK_IdValorClienteViviendaDireccion);
			}
		}

		if(this.direccionConstantesFunciones.resaltarFK_IdValorDireccionDireccion!=null) {
			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorDireccionDireccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
				jPanel.setBorder(this.direccionConstantesFunciones.resaltarFK_IdValorDireccionDireccion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDireccion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDireccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdClienteDireccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.direccionConstantesFunciones.mostrarFK_IdClienteDireccion);
			if(!this.direccionConstantesFunciones.mostrarFK_IdClienteDireccion && index>-1) {
				this.jTabbedPaneBusquedasDireccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorClienteViviendaDireccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.direccionConstantesFunciones.mostrarFK_IdValorClienteViviendaDireccion);
			if(!this.direccionConstantesFunciones.mostrarFK_IdValorClienteViviendaDireccion && index>-1) {
				this.jTabbedPaneBusquedasDireccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorDireccionDireccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.direccionConstantesFunciones.mostrarFK_IdValorDireccionDireccion);
			if(!this.direccionConstantesFunciones.mostrarFK_IdValorDireccionDireccion && index>-1) {
				this.jTabbedPaneBusquedasDireccion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDireccion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDireccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdClienteDireccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.direccionConstantesFunciones.activarFK_IdClienteDireccion);
				this.jTabbedPaneBusquedasDireccion.setEnabledAt(index,this.direccionConstantesFunciones.activarFK_IdClienteDireccion);
			}

			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorClienteViviendaDireccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.direccionConstantesFunciones.activarFK_IdValorClienteViviendaDireccion);
				this.jTabbedPaneBusquedasDireccion.setEnabledAt(index,this.direccionConstantesFunciones.activarFK_IdValorClienteViviendaDireccion);
			}

			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorDireccionDireccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.direccionConstantesFunciones.activarFK_IdValorDireccionDireccion);
				this.jTabbedPaneBusquedasDireccion.setEnabledAt(index,this.direccionConstantesFunciones.activarFK_IdValorDireccionDireccion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDireccion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdClienteDireccion);

			this.jTabbedPaneBusquedasDireccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);

			this.direccionConstantesFunciones.setResaltarFK_IdClienteDireccion(resaltar);

			jPanel.setBorder(this.direccionConstantesFunciones.resaltarFK_IdClienteDireccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteVivienda")) {
			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorClienteViviendaDireccion);

			this.jTabbedPaneBusquedasDireccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);

			this.direccionConstantesFunciones.setResaltarFK_IdValorClienteViviendaDireccion(resaltar);

			jPanel.setBorder(this.direccionConstantesFunciones.resaltarFK_IdValorClienteViviendaDireccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorDireccion")) {
			index= this.jTabbedPaneBusquedasDireccion.indexOfComponent(this.jPanelFK_IdValorDireccionDireccion);

			this.jTabbedPaneBusquedasDireccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDireccion.getComponent(index);

			this.direccionConstantesFunciones.setResaltarFK_IdValorDireccionDireccion(resaltar);

			jPanel.setBorder(this.direccionConstantesFunciones.resaltarFK_IdValorDireccionDireccion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDireccion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDireccion() throws Exception {

		if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDireccion();
		this.updateVisibilidadResaltarControlesFormularioDireccion();
		this.updateHabilitarResaltarControlesFormularioDireccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioDireccion() throws Exception {
		if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.direccionConstantesFunciones.resaltaridDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setBorder(this.direccionConstantesFunciones.resaltaridDireccion);}
		if(this.direccionConstantesFunciones.resaltarid_empresaDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setBorder(this.direccionConstantesFunciones.resaltarid_empresaDireccion);}
		if(this.direccionConstantesFunciones.resaltarid_clienteDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setBorder(this.direccionConstantesFunciones.resaltarid_clienteDireccion);}
		if(this.direccionConstantesFunciones.resaltarid_tipo_direccionDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setBorder(this.direccionConstantesFunciones.resaltarid_tipo_direccionDireccion);}
		if(this.direccionConstantesFunciones.resaltarid_tipo_viviendaDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setBorder(this.direccionConstantesFunciones.resaltarid_tipo_viviendaDireccion);}
		if(this.direccionConstantesFunciones.resaltarsectorDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setBorder(this.direccionConstantesFunciones.resaltarsectorDireccion);}
		if(this.direccionConstantesFunciones.resaltarbarrioDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setBorder(this.direccionConstantesFunciones.resaltarbarrioDireccion);}
		if(this.direccionConstantesFunciones.resaltarcallesDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setBorder(this.direccionConstantesFunciones.resaltarcallesDireccion);}
		if(this.direccionConstantesFunciones.resaltaraseguradaDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setBorder(this.direccionConstantesFunciones.resaltaraseguradaDireccion);}
		if(this.direccionConstantesFunciones.resaltardireccionDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setBorder(this.direccionConstantesFunciones.resaltardireccionDireccion);}
		if(this.direccionConstantesFunciones.resaltaresactivoDireccion!=null && this.jInternalFrameDetalleFormDireccion!=null) {this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setBorderPainted(true);this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setBorder(this.direccionConstantesFunciones.resaltaresactivoDireccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDireccion() throws Exception {		
		if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
	
		//this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setVisible(this.direccionConstantesFunciones.mostraridDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelidDireccion.setVisible(this.direccionConstantesFunciones.mostraridDireccion);
		//this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_empresaDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelid_empresaDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_empresaDireccion);
		//this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_clienteDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelid_clienteDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_clienteDireccion);
			this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_clienteDireccion);
		//this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_tipo_direccionDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelid_tipo_direccionDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_tipo_direccionDireccion);
		//this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_tipo_viviendaDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelid_tipo_viviendaDireccion.setVisible(this.direccionConstantesFunciones.mostrarid_tipo_viviendaDireccion);
		//this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setVisible(this.direccionConstantesFunciones.mostrarsectorDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelsectorDireccion.setVisible(this.direccionConstantesFunciones.mostrarsectorDireccion);
		//this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setVisible(this.direccionConstantesFunciones.mostrarbarrioDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelbarrioDireccion.setVisible(this.direccionConstantesFunciones.mostrarbarrioDireccion);
		//this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setVisible(this.direccionConstantesFunciones.mostrarcallesDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelcallesDireccion.setVisible(this.direccionConstantesFunciones.mostrarcallesDireccion);
		//this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setVisible(this.direccionConstantesFunciones.mostraraseguradaDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelaseguradaDireccion.setVisible(this.direccionConstantesFunciones.mostraraseguradaDireccion);
		//this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setVisible(this.direccionConstantesFunciones.mostrardireccionDireccion);
		this.jInternalFrameDetalleFormDireccion.jPaneldireccionDireccion.setVisible(this.direccionConstantesFunciones.mostrardireccionDireccion);
		//this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setVisible(this.direccionConstantesFunciones.mostraresactivoDireccion);
		this.jInternalFrameDetalleFormDireccion.jPanelesactivoDireccion.setVisible(this.direccionConstantesFunciones.mostraresactivoDireccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDireccion() throws Exception {
		if(this.jInternalFrameDetalleFormDireccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDireccion!=null) {
	
		this.jInternalFrameDetalleFormDireccion.jLabelidDireccion.setEnabled(this.direccionConstantesFunciones.activaridDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_empresaDireccion.setEnabled(this.direccionConstantesFunciones.activarid_empresaDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_clienteDireccion.setEnabled(this.direccionConstantesFunciones.activarid_clienteDireccion);
			this.jInternalFrameDetalleFormDireccion.jButtonid_clienteDireccion.setEnabled(this.direccionConstantesFunciones.activarid_clienteDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_direccionDireccion.setEnabled(this.direccionConstantesFunciones.activarid_tipo_direccionDireccion);
		this.jInternalFrameDetalleFormDireccion.jComboBoxid_tipo_viviendaDireccion.setEnabled(this.direccionConstantesFunciones.activarid_tipo_viviendaDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreasectorDireccion.setEnabled(this.direccionConstantesFunciones.activarsectorDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreabarrioDireccion.setEnabled(this.direccionConstantesFunciones.activarbarrioDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreacallesDireccion.setEnabled(this.direccionConstantesFunciones.activarcallesDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreaaseguradaDireccion.setEnabled(this.direccionConstantesFunciones.activaraseguradaDireccion);
		this.jInternalFrameDetalleFormDireccion.jTextAreadireccionDireccion.setEnabled(this.direccionConstantesFunciones.activardireccionDireccion);
		this.jInternalFrameDetalleFormDireccion.jCheckBoxesactivoDireccion.setEnabled(this.direccionConstantesFunciones.activaresactivoDireccion);
		}
	}
	
		
}