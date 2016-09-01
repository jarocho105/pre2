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

import com.bydan.erp.cartera.util.FirmaClienteConstantesFunciones;
import com.bydan.erp.cartera.util.FirmaClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.FirmaClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.FirmaClienteBean;
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
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

	
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("unused")
public class FirmaClienteBeanSwingJInternalFrame extends FirmaClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FirmaClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FirmaCliente> firmaclienteValidator = new ClassValidator<FirmaCliente>(FirmaCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FirmaCliente firmacliente;	
	public FirmaCliente firmaclienteAux;
	public FirmaCliente firmaclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FirmaCliente firmaclienteTotales;
	public Long idFirmaClienteActual;
	public Long iIdNuevoFirmaCliente=0L;
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

	public String sFinalQueryComboTipoImagen="";

	public List<TipoImagen> tipoimagensForeignKey;

	public List<TipoImagen> gettipoimagensForeignKey() {
		return tipoimagensForeignKey;
	}

	public void settipoimagensForeignKey(List<TipoImagen> tipoimagensForeignKey) {
		this.tipoimagensForeignKey = tipoimagensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoImagen tipoimagenForeignKey;

	public TipoImagen gettipoimagenForeignKey() {
		return tipoimagenForeignKey;
	}

	public void settipoimagenForeignKey(TipoImagen tipoimagenForeignKey) {
		this.tipoimagenForeignKey = tipoimagenForeignKey;
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
	
	public Boolean isPermisoTodoFirmaCliente;
	public Boolean isPermisoNuevoFirmaCliente;
	public Boolean isPermisoActualizarFirmaCliente;
	public Boolean isPermisoActualizarOriginalFirmaCliente;
	public Boolean isPermisoEliminarFirmaCliente;
	public Boolean isPermisoGuardarCambiosFirmaCliente;
	public Boolean isPermisoConsultaFirmaCliente;
	public Boolean isPermisoBusquedaFirmaCliente;
	public Boolean isPermisoReporteFirmaCliente;
	public Boolean isPermisoPaginacionMedioFirmaCliente;
	public Boolean isPermisoPaginacionAltoFirmaCliente;
	public Boolean isPermisoPaginacionTodoFirmaCliente;
	public Boolean isPermisoCopiarFirmaCliente;
	public Boolean isPermisoVerFormFirmaCliente;
	public Boolean isPermisoDuplicarFirmaCliente;
	public Boolean isPermisoOrdenFirmaCliente;
	
	
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
	
	public FirmaClienteParameterReturnGeneral firmaclienteReturnGeneral;
	public FirmaClienteParameterReturnGeneral firmaclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFirmaCliente=false;
	public Boolean esParaAccionDesdeFormularioFirmaCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FirmaClienteSessionBeanAdditional firmaclienteSessionBeanAdditional=null;
	
	public FirmaClienteSessionBeanAdditional getFirmaClienteSessionBeanAdditional() {
		return this.firmaclienteSessionBeanAdditional;
	}
	
	public void setFirmaClienteSessionBeanAdditional(FirmaClienteSessionBeanAdditional firmaclienteSessionBeanAdditional) {
		try {
			this.firmaclienteSessionBeanAdditional=firmaclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FirmaClienteBeanSwingJInternalFrameAdditional firmaclienteBeanSwingJInternalFrameAdditional=null;
	//public class FirmaClienteBeanSwingJInternalFrame
	
	public FirmaClienteBeanSwingJInternalFrameAdditional getFirmaClienteBeanSwingJInternalFrameAdditional() {
		return this.firmaclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setFirmaClienteBeanSwingJInternalFrameAdditional(FirmaClienteBeanSwingJInternalFrameAdditional firmaclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.firmaclienteBeanSwingJInternalFrameAdditional=firmaclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FirmaClienteLogic firmaclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FirmaCliente firmaclienteBean;
	public FirmaClienteConstantesFunciones firmaclienteConstantesFunciones;
	//public FirmaClienteParameterReturnGeneral firmaclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoImagenLogic tipoimagenLogic;
	
	//PARAMETROS
	
	
	//public List<FirmaCliente> firmaclientes;	
	//public List<FirmaCliente> firmaclientesEliminados;
	//public List<FirmaCliente> firmaclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFirmaCliente=false;
	public Boolean isVisibilidadCeldaDuplicarFirmaCliente=true;
	public Boolean isVisibilidadCeldaCopiarFirmaCliente=true;
	public Boolean isVisibilidadCeldaVerFormFirmaCliente=true;
	public Boolean isVisibilidadCeldaOrdenFirmaCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
	public Boolean isVisibilidadCeldaModificarFirmaCliente=false;
	public Boolean isVisibilidadCeldaActualizarFirmaCliente=false;
	public Boolean isVisibilidadCeldaEliminarFirmaCliente=false;
	public Boolean isVisibilidadCeldaCancelarFirmaCliente=false;
	public Boolean isVisibilidadCeldaGuardarFirmaCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFirmaCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoImagen=false;
	
	public Long getiIdNuevoFirmaCliente() {
		return this.iIdNuevoFirmaCliente;
	}

	public void setiIdNuevoFirmaCliente(Long iIdNuevoFirmaCliente) {
		this.iIdNuevoFirmaCliente = iIdNuevoFirmaCliente;
	}
	
	public Long getidFirmaClienteActual() {
		return this.idFirmaClienteActual;
	}

	public void setidFirmaClienteActual(Long idFirmaClienteActual) {
		this.idFirmaClienteActual = idFirmaClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FirmaCliente getfirmacliente() {
		return this.firmacliente;
	}

	public void setfirmacliente(FirmaCliente firmacliente) {
		this.firmacliente = firmacliente;
	}
	
	public FirmaCliente getfirmaclienteAux() {
		return this.firmaclienteAux;
	}

	public void setfirmaclienteAux(FirmaCliente firmaclienteAux) {
		this.firmaclienteAux = firmaclienteAux;
	}				
	
	public FirmaCliente getfirmaclienteAnterior() {
		return this.firmaclienteAnterior;
	}

	public void setfirmaclienteAnterior(FirmaCliente firmaclienteAnterior) {
		this.firmaclienteAnterior = firmaclienteAnterior;
	}	
	
	public FirmaCliente getfirmaclienteTotales() {
		return this.firmaclienteTotales;
	}

	public void setfirmaclienteTotales(FirmaCliente firmaclienteTotales) {
		this.firmaclienteTotales = firmaclienteTotales;
	}	
	
	public FirmaCliente getfirmaclienteBean() {
		return this.firmaclienteBean;
	}

	public void setfirmaclienteBean(FirmaCliente firmaclienteBean) {
		this.firmaclienteBean = firmaclienteBean;
	}	
	
	public FirmaClienteParameterReturnGeneral getfirmaclienteReturnGeneral() {
		return this.firmaclienteReturnGeneral;
	}

	public void setfirmaclienteReturnGeneral(FirmaClienteParameterReturnGeneral firmaclienteReturnGeneral) {
		this.firmaclienteReturnGeneral = firmaclienteReturnGeneral;
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

	public Long id_tipo_imagenFK_IdTipoImagen=-1L;

	public Long getid_tipo_imagenFK_IdTipoImagen() {
		return this.id_tipo_imagenFK_IdTipoImagen;
	}

	public void setid_tipo_imagenFK_IdTipoImagen(Long id_tipo_imagenFK_IdTipoImagen) {
		this.id_tipo_imagenFK_IdTipoImagen = id_tipo_imagenFK_IdTipoImagen;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FirmaClienteLogic getFirmaClienteLogic()	{		
		return firmaclienteLogic;
	}

	public void setFirmaClienteLogic(FirmaClienteLogic firmaclienteLogic) {
		this.firmaclienteLogic = firmaclienteLogic;
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
	
	public Boolean getIsEsNuevoFirmaCliente() {
		return isEsNuevoFirmaCliente;
	}

	public void setIsEsNuevoFirmaCliente(Boolean isEsNuevoFirmaCliente) {
		this.isEsNuevoFirmaCliente = isEsNuevoFirmaCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioFirmaCliente() {
		return esParaAccionDesdeFormularioFirmaCliente;
	}
	
	public void setEsParaAccionDesdeFormularioFirmaCliente(Boolean esParaAccionDesdeFormularioFirmaCliente) {
		this.esParaAccionDesdeFormularioFirmaCliente = esParaAccionDesdeFormularioFirmaCliente;
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

			if(this.firmaclienteSessionBean==null) {
				this.firmaclienteSessionBean=new FirmaClienteSessionBean();
			}

			if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(firmaclienteSessionBean.getlidEmpresaActual());
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

			if(this.firmaclienteSessionBean==null) {
				this.firmaclienteSessionBean=new FirmaClienteSessionBean();
			}

			if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(firmaclienteSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoImagensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoimagensForeignKey=new ArrayList<TipoImagen>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoImagenLogic tipoimagenLogic=new TipoImagenLogic();

			//tipoimagenLogic.getTipoImagenDataAccess().setIsForForeingKeyData(true);

			if(this.firmaclienteSessionBean==null) {
				this.firmaclienteSessionBean=new FirmaClienteSessionBean();
			}

			if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagen()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoimagenLogic.getTipoImagenDataAccess().setIsForForeingKeyData(true);

					tipoimagenLogic.getTodosTipoImagensWithConnection(sFinalQuery,new Pagination());

					this.tipoimagensForeignKey=tipoimagenLogic.getTipoImagens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoImagen(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenLogic.getEntityWithConnection(firmaclienteSessionBean.getlidTipoImagenActual());
					this.tipoimagensForeignKey.add(tipoimagenLogic.getTipoImagen());
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

					if(this.firmacliente!=null) {
						this.firmacliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
						this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFirmaCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
						if(this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFirmaClienteGenerico)throws Exception
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
				jComboBoxid_empresaFirmaClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFirmaClienteGenerico!=null && jComboBoxid_empresaFirmaClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaFirmaClienteGenerico.setSelectedIndex(0);
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

					if(this.firmacliente!=null) {
						this.firmacliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
						this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteFirmaCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
						if(this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteFirmaCliente!=null) {
						jComboBoxid_clienteFK_IdClienteFirmaCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteFirmaCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteFirmaCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteFirmaCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteFirmaCliente.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteFirmaClienteGenerico)throws Exception
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
				jComboBoxid_clienteFirmaClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteFirmaClienteGenerico!=null && jComboBoxid_clienteFirmaClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteFirmaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoImagenForeignKey(Long idTipoImagenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensForeignKey) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoimagenTemp!=null) {

					if(this.firmacliente!=null) {
						this.firmacliente.setTipoImagen(tipoimagenTemp);
					}

					if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
						this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setSelectedItem(tipoimagenTemp);
					}
				} else {
					//jComboBoxid_tipo_imagenFirmaCliente.setSelectedItem(tipoimagenTemp);
					if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
						if(this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoImagen") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoimagenTemp!=null && jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente!=null) {
						jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setSelectedItem(tipoimagenTemp);
					} else {
						if(jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente!=null) {
							//jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setSelectedItem(tipoimagenTemp);
							if(jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.getItemCount()>0) {
								jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setSelectedIndex(0);
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

	public String getActualTipoImagenForeignKeyDescripcion(Long idTipoImagenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensForeignKey) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}


			sDescripcion=TipoImagenConstantesFunciones.getTipoImagenDescripcion(tipoimagenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoImagenForeignKeyGenerico(Long idTipoImagenSeleccionado,JComboBox jComboBoxid_tipo_imagenFirmaClienteGenerico)throws Exception
	{
		try
		{
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensForeignKey) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}

			if(tipoimagenTemp!=null) {
				jComboBoxid_tipo_imagenFirmaClienteGenerico.setSelectedItem(tipoimagenTemp);
			} else {
				if(jComboBoxid_tipo_imagenFirmaClienteGenerico!=null && jComboBoxid_tipo_imagenFirmaClienteGenerico.getItemCount()>0) {
					jComboBoxid_tipo_imagenFirmaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FirmaCliente firmacliente,JComboBox jComboBoxid_empresaFirmaClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFirmaClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFirmaClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				firmacliente.setid_empresa(empresaAux.getId());
				firmacliente.setempresa_descripcion(FirmaClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				firmacliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(FirmaCliente firmacliente,JComboBox jComboBoxid_clienteFirmaClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteFirmaClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteFirmaClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				firmacliente.setid_cliente(clienteAux.getId());
				firmacliente.setcliente_descripcion(FirmaClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				firmacliente.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoImagenForeignKey(FirmaCliente firmacliente,JComboBox jComboBoxid_tipo_imagenFirmaClienteGenerico)throws Exception
	{
		try
		{
			TipoImagen  tipoimagenAux=new TipoImagen();

			if(jComboBoxid_tipo_imagenFirmaClienteGenerico==null) {
				tipoimagenAux=(TipoImagen)this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.getSelectedItem();
			} else {
				tipoimagenAux=(TipoImagen)jComboBoxid_tipo_imagenFirmaClienteGenerico.getSelectedItem();
			}

			if(tipoimagenAux!=null && tipoimagenAux.getId()!=null) {
				firmacliente.setid_tipo_imagen(tipoimagenAux.getId());
				firmacliente.settipoimagen_descripcion(FirmaClienteConstantesFunciones.getTipoImagenDescripcion(tipoimagenAux));
				firmacliente.setTipoImagen(tipoimagenAux);			}
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

					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) { 
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFirmaCliente!=null) { 
					}

					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) { 
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFirmaCliente!=null) { 
					}

					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteFirmaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteFirmaCliente.addItem(cliente);
							}
						}

						if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoImagensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoImagen=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) { 
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.removeAllItems();

							for(TipoImagen tipoimagen:this.tipoimagensForeignKey) {
								this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.addItem(tipoimagen);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFirmaCliente!=null) { 
					}

					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoImagen") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.removeAllItems();

							for(TipoImagen tipoimagen:this.tipoimagensForeignKey) {
								this.jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.addItem(tipoimagen);
							}
						}

						if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteFirmaCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteFirmaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoImagenForeignKey(TipoImagen tipoimagen,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setSelectedItem(tipoimagen);
						}
					} else {
						if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setSelectedItem(tipoimagen);
						} else {
							this.jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFirmaCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FirmaClienteConstantesFunciones.refrescarForeignKeysDescripcionesFirmaCliente(this.firmaclienteLogic.getFirmaClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FirmaClienteConstantesFunciones.refrescarForeignKeysDescripcionesFirmaCliente(this.firmaclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoImagen.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//firmaclienteLogic.setFirmaClientes(this.firmaclientes);
			firmaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FirmaClienteParameterReturnGeneral getFirmaClienteParameterGeneral() {
		return this.firmaclienteParameterGeneral;
	}
	
	public void setFirmaClienteParameterGeneral(FirmaClienteParameterReturnGeneral firmaclienteParameterGeneral) {
		this.firmaclienteParameterGeneral = firmaclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFirmaCliente() {
		return isPermisoTodoFirmaCliente;
	}

	public void setIsPermisoTodoFirmaCliente(Boolean isPermisoTodoFirmaCliente) {
		this.isPermisoTodoFirmaCliente = isPermisoTodoFirmaCliente;
	}

	public Boolean getIsPermisoNuevoFirmaCliente() {
		return isPermisoNuevoFirmaCliente;
	}

	public void setIsPermisoNuevoFirmaCliente(Boolean isPermisoNuevoFirmaCliente) {
		this.isPermisoNuevoFirmaCliente = isPermisoNuevoFirmaCliente;
	}

	public Boolean getIsPermisoActualizarFirmaCliente() {
		return isPermisoActualizarFirmaCliente;
	}

	public void setIsPermisoActualizarFirmaCliente(Boolean isPermisoActualizarFirmaCliente) {
		this.isPermisoActualizarFirmaCliente = isPermisoActualizarFirmaCliente;
	}

	public Boolean getIsPermisoEliminarFirmaCliente() {
		return isPermisoEliminarFirmaCliente;
	}

	public void setIsPermisoEliminarFirmaCliente(Boolean isPermisoEliminarFirmaCliente) {
		this.isPermisoEliminarFirmaCliente = isPermisoEliminarFirmaCliente;
	}

	public Boolean getIsPermisoGuardarCambiosFirmaCliente() {
		return isPermisoGuardarCambiosFirmaCliente;
	}

	public void setIsPermisoGuardarCambiosFirmaCliente(Boolean isPermisoGuardarCambiosFirmaCliente) {
		this.isPermisoGuardarCambiosFirmaCliente = isPermisoGuardarCambiosFirmaCliente;
	}
	
	public Boolean getIsPermisoConsultaFirmaCliente() {
		return isPermisoConsultaFirmaCliente;
	}

	public void setIsPermisoConsultaFirmaCliente(Boolean isPermisoConsultaFirmaCliente) {
		this.isPermisoConsultaFirmaCliente = isPermisoConsultaFirmaCliente;
	}

	public Boolean getIsPermisoBusquedaFirmaCliente() {
		return isPermisoBusquedaFirmaCliente;
	}

	public void setIsPermisoBusquedaFirmaCliente(Boolean isPermisoBusquedaFirmaCliente) {
		this.isPermisoBusquedaFirmaCliente = isPermisoBusquedaFirmaCliente;
	}

	public Boolean getIsPermisoReporteFirmaCliente() {
		return isPermisoReporteFirmaCliente;
	}

	public void setIsPermisoReporteFirmaCliente(Boolean isPermisoReporteFirmaCliente) {
		this.isPermisoReporteFirmaCliente = isPermisoReporteFirmaCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioFirmaCliente() {
		return isPermisoPaginacionMedioFirmaCliente;
	}

	public void setIsPermisoPaginacionMedioFirmaCliente(Boolean isPermisoPaginacionMedioFirmaCliente) {
		this.isPermisoPaginacionMedioFirmaCliente = isPermisoPaginacionMedioFirmaCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoFirmaCliente() {
		return isPermisoPaginacionTodoFirmaCliente;
	}

	public void setIsPermisoPaginacionTodoFirmaCliente(Boolean isPermisoPaginacionTodoFirmaCliente) {
		this.isPermisoPaginacionTodoFirmaCliente = isPermisoPaginacionTodoFirmaCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoFirmaCliente() {
		return isPermisoPaginacionAltoFirmaCliente;
	}

	public void setIsPermisoPaginacionAltoFirmaCliente(Boolean isPermisoPaginacionAltoFirmaCliente) {
		this.isPermisoPaginacionAltoFirmaCliente = isPermisoPaginacionAltoFirmaCliente;
	}
	
	public Boolean getIsPermisoCopiarFirmaCliente() {
		return isPermisoCopiarFirmaCliente;
	}

	public void setIsPermisoCopiarFirmaCliente(Boolean isPermisoCopiarFirmaCliente) {
		this.isPermisoCopiarFirmaCliente = isPermisoCopiarFirmaCliente;
	}
	
	public Boolean getIsPermisoVerFormFirmaCliente() {
		return isPermisoVerFormFirmaCliente;
	}

	public void setIsPermisoVerFormFirmaCliente(Boolean isPermisoVerFormFirmaCliente) {
		this.isPermisoVerFormFirmaCliente = isPermisoVerFormFirmaCliente;
	}
	
	public Boolean getIsPermisoDuplicarFirmaCliente() {
		return isPermisoDuplicarFirmaCliente;
	}

	public void setIsPermisoDuplicarFirmaCliente(Boolean isPermisoDuplicarFirmaCliente) {
		this.isPermisoDuplicarFirmaCliente = isPermisoDuplicarFirmaCliente;
	}
	
	public Boolean getIsPermisoOrdenFirmaCliente() {
		return isPermisoOrdenFirmaCliente;
	}

	public void setIsPermisoOrdenFirmaCliente(Boolean isPermisoOrdenFirmaCliente) {
		this.isPermisoOrdenFirmaCliente = isPermisoOrdenFirmaCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFirmaCliente() {
		return isVisibilidadCeldaNuevoFirmaCliente;
	}

	public void setIsVisibilidadCeldaNuevoFirmaCliente(Boolean isVisibilidadCeldaNuevoFirmaCliente) {
		this.isVisibilidadCeldaNuevoFirmaCliente = isVisibilidadCeldaNuevoFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFirmaCliente() {
		return isVisibilidadCeldaDuplicarFirmaCliente;
	}

	public void setIsVisibilidadCeldaDuplicarFirmaCliente(Boolean isVisibilidadCeldaDuplicarFirmaCliente) {
		this.isVisibilidadCeldaDuplicarFirmaCliente = isVisibilidadCeldaDuplicarFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFirmaCliente() {
		return isVisibilidadCeldaCopiarFirmaCliente;
	}

	public void setIsVisibilidadCeldaCopiarFirmaCliente(Boolean isVisibilidadCeldaCopiarFirmaCliente) {
		this.isVisibilidadCeldaCopiarFirmaCliente = isVisibilidadCeldaCopiarFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFirmaCliente() {
		return isVisibilidadCeldaVerFormFirmaCliente;
	}

	public void setIsVisibilidadCeldaVerFormFirmaCliente(Boolean isVisibilidadCeldaVerFormFirmaCliente) {
		this.isVisibilidadCeldaVerFormFirmaCliente = isVisibilidadCeldaVerFormFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFirmaCliente() {
		return isVisibilidadCeldaOrdenFirmaCliente;
	}

	public void setIsVisibilidadCeldaOrdenFirmaCliente(Boolean isVisibilidadCeldaOrdenFirmaCliente) {
		this.isVisibilidadCeldaOrdenFirmaCliente = isVisibilidadCeldaOrdenFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFirmaCliente() {
		return isVisibilidadCeldaNuevoRelacionesFirmaCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFirmaCliente(Boolean isVisibilidadCeldaNuevoRelacionesFirmaCliente) {
		this.isVisibilidadCeldaNuevoRelacionesFirmaCliente = isVisibilidadCeldaNuevoRelacionesFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFirmaCliente() {
		return isVisibilidadCeldaModificarFirmaCliente;
	}

	public void setIsVisibilidadCeldaModificarFirmaCliente(Boolean isVisibilidadCeldaModificarFirmaCliente) {
		this.isVisibilidadCeldaModificarFirmaCliente = isVisibilidadCeldaModificarFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFirmaCliente() {
		return isVisibilidadCeldaActualizarFirmaCliente;
	}

	public void setIsVisibilidadCeldaActualizarFirmaCliente(Boolean isVisibilidadCeldaActualizarFirmaCliente) {
		this.isVisibilidadCeldaActualizarFirmaCliente = isVisibilidadCeldaActualizarFirmaCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarFirmaCliente() {
		return isVisibilidadCeldaEliminarFirmaCliente;
	}

	public void setIsVisibilidadCeldaEliminarFirmaCliente(Boolean isVisibilidadCeldaEliminarFirmaCliente) {
		this.isVisibilidadCeldaEliminarFirmaCliente = isVisibilidadCeldaEliminarFirmaCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarFirmaCliente() {
		return isVisibilidadCeldaCancelarFirmaCliente;
	}

	public void setIsVisibilidadCeldaCancelarFirmaCliente(Boolean isVisibilidadCeldaCancelarFirmaCliente) {
		this.isVisibilidadCeldaCancelarFirmaCliente = isVisibilidadCeldaCancelarFirmaCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarFirmaCliente() {
		return isVisibilidadCeldaGuardarFirmaCliente;
	}

	public void setIsVisibilidadCeldaGuardarFirmaCliente(Boolean isVisibilidadCeldaGuardarFirmaCliente) {
		this.isVisibilidadCeldaGuardarFirmaCliente = isVisibilidadCeldaGuardarFirmaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFirmaCliente() {
		return isVisibilidadCeldaGuardarCambiosFirmaCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFirmaCliente(Boolean isVisibilidadCeldaGuardarCambiosFirmaCliente) {
		this.isVisibilidadCeldaGuardarCambiosFirmaCliente = isVisibilidadCeldaGuardarCambiosFirmaCliente;
	}
		
	public FirmaClienteSessionBean getfirmaclienteSessionBean() {
		return this.firmaclienteSessionBean;
	}
	
	public void setfirmaclienteSessionBean(FirmaClienteSessionBean firmaclienteSessionBean) {
		this.firmaclienteSessionBean=firmaclienteSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoImagen() {
		return this.isVisibilidadFK_IdTipoImagen;
	}

	public void setisVisibilidadFK_IdTipoImagen(Boolean isVisibilidadFK_IdTipoImagen) {
		this.isVisibilidadFK_IdTipoImagen=isVisibilidadFK_IdTipoImagen;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(FirmaCliente firmacliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(firmacliente,null);
				this.setActualParaGuardarClienteForeignKey(firmacliente,null);
				this.setActualParaGuardarTipoImagenForeignKey(firmacliente,null);
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
	
	public void bugActualizarReferenciaActual(FirmaCliente firmacliente,FirmaCliente firmaclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFirmaCliente(firmacliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		firmaclienteAux.setId(firmacliente.getId());
		firmaclienteAux.setVersionRow(firmacliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFirmaCliente();
		
			int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = firmaclienteValidator.getInvalidValues(this.firmacliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			firmaclienteLogic.setDatosCliente(datosCliente);
			firmaclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				firmaclienteAux=new  FirmaCliente();
				
				firmaclienteAux.setIsNew(true);
				firmaclienteAux.setIsChanged(true);
				
				firmaclienteAux.setFirmaClienteOriginal(this.firmacliente);
				
				firmaclienteAux.setId(this.firmacliente.getId());	
				firmaclienteAux.setVersionRow(this.firmacliente.getVersionRow());	
				firmaclienteAux.setid_empresa(this.firmacliente.getid_empresa());	
				firmaclienteAux.setid_cliente(this.firmacliente.getid_cliente());	
				firmaclienteAux.setid_tipo_imagen(this.firmacliente.getid_tipo_imagen());	
				firmaclienteAux.setfirma(this.firmacliente.getfirma());	
				firmaclienteAux.setpath_firma(this.firmacliente.getpath_firma());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(firmaclienteAux,firmaclienteLogic.getFirmaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(firmaclienteAux,firmaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteLogic.saveFirmaClientes();//WithConnection
						//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.firmacliente,firmaclienteAux);
					
					this.refrescarForeignKeysDescripcionesFirmaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								firmaclienteLogic.saveFirmaClienteRelaciones(firmaclienteAux);//WithConnection
								//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.firmacliente,firmaclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(firmaclienteAux,firmaclienteLogic.getFirmaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(firmaclienteAux,firmaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.firmacliente,firmaclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				firmaclienteAux=new  FirmaCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.firmaclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.firmaclienteSessionBean.getEsGuardarRelacionado() && this.firmacliente.getId()>=0)) {
						
					firmaclienteAux.setIsNew(false);
				}
				
				firmaclienteAux.setIsDeleted(false);
			
				firmaclienteAux.setId(this.firmacliente.getId());	
				firmaclienteAux.setVersionRow(this.firmacliente.getVersionRow());	
				firmaclienteAux.setid_empresa(this.firmacliente.getid_empresa());	
				firmaclienteAux.setid_cliente(this.firmacliente.getid_cliente());	
				firmaclienteAux.setid_tipo_imagen(this.firmacliente.getid_tipo_imagen());	
				firmaclienteAux.setfirma(this.firmacliente.getfirma());	
				firmaclienteAux.setpath_firma(this.firmacliente.getpath_firma());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(firmaclienteAux,firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(firmaclienteAux,firmaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteLogic.saveFirmaClientes();//WithConnection
						//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.firmacliente,firmaclienteAux);
					
					this.refrescarForeignKeysDescripcionesFirmaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								firmaclienteLogic.saveFirmaClienteRelaciones(firmaclienteAux);//WithConnection
								//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.firmacliente,firmaclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(firmaclienteAux,firmaclienteLogic.getFirmaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(firmaclienteAux,firmaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.firmacliente,firmaclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				firmaclienteAux=new  FirmaCliente();
				
				firmaclienteAux.setIsNew(false);
				firmaclienteAux.setIsChanged(false);
				
				firmaclienteAux.setIsDeleted(true);
				
				firmaclienteAux.setId(this.firmacliente.getId());	
				firmaclienteAux.setVersionRow(this.firmacliente.getVersionRow());	
				firmaclienteAux.setid_empresa(this.firmacliente.getid_empresa());	
				firmaclienteAux.setid_cliente(this.firmacliente.getid_cliente());	
				firmaclienteAux.setid_tipo_imagen(this.firmacliente.getid_tipo_imagen());	
				firmaclienteAux.setfirma(this.firmacliente.getfirma());	
				firmaclienteAux.setpath_firma(this.firmacliente.getpath_firma());	
				
				if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.firmaclienteAux.getId()>=0) {	
						this.firmaclientesEliminados.add(firmaclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(firmaclienteAux,firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(firmaclienteAux,firmaclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteLogic.saveFirmaClientes();//WithConnection
						//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								firmaclienteLogic.saveFirmaClienteRelaciones(firmaclienteAux);//WithConnection
								//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
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
							if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(firmaclienteAux,firmaclienteLogic.getFirmaClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(firmaclienteAux,firmaclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getFirmaClientes().addAll(this.firmaclientesEliminados);
					
					firmaclienteLogic.saveFirmaClientes();//WithConnection
					//firmaclienteLogic.getSetVersionRowFirmaClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFirmaCliente();
				
				this.firmaclientesEliminados= new ArrayList<FirmaCliente>();		
			}
			
			if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Firma Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.firmacliente=firmaclienteAux;
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
      		//this.finishProcessFirmaCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(FirmaCliente firmaclienteLocal) throws Exception {
		
		if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FirmaCliente firmaclienteLocal) throws Exception {	
		if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				firmaclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				firmaclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoImagenDetalleFormJInternalFrame.class)) {
				TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrameLocal=(TipoImagenBeanSwingJInternalFrame) ((TipoImagenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoimagenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoImagen(tipoimagenBeanSwingJInternalFrameLocal.gettipoimagen(),true);
				tipoimagenBeanSwingJInternalFrameLocal.actualizarLista(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen,this.tipoimagensForeignKey);

				tipoimagenBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen);

				firmaclienteLocal.setTipoImagen(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen);

				this.addItemDefectoCombosForeignKeyTipoImagen();
				this.cargarCombosFrameTipoImagensForeignKey("Formulario");
				this.setActualTipoImagenForeignKey(tipoimagenBeanSwingJInternalFrameLocal.tipoimagen.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFirmaClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = firmaclienteValidator.getInvalidValues(this.firmacliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FirmaCliente firmacliente,List<FirmaCliente> firmaclientes) throws Exception {
		try	{		
			FirmaClienteConstantesFunciones.actualizarLista(firmacliente,firmaclientes,this.firmaclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FirmaCliente firmacliente,List<FirmaCliente> firmaclientes) throws Exception {
		try	{			
			FirmaClienteConstantesFunciones.actualizarSelectedLista(firmacliente,firmaclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FirmaCliente> firmaclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				firmaclientesLocal=this.firmaclienteLogic.getFirmaClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				firmaclientesLocal=this.firmaclientes;
			}
			//ARCHITECTURE
		
			for(FirmaCliente firmaclienteLocal:firmaclientesLocal) {
				if(this.permiteMantenimiento(firmaclienteLocal) && firmaclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FirmaClienteConstantesFunciones.getFirmaClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FirmaClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelid_empresaFirmaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FirmaClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelid_clienteFirmaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FirmaClienteConstantesFunciones.IDTIPOIMAGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelid_tipo_imagenFirmaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FirmaClienteConstantesFunciones.FIRMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelfirmaFirmaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FirmaClienteConstantesFunciones.PATHFIRMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelpath_firmaFirmaCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFirmaCliente.jLabelid_empresaFirmaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFirmaCliente.jLabelid_clienteFirmaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFirmaCliente.jLabelid_tipo_imagenFirmaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFirmaCliente.jLabelfirmaFirmaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFirmaCliente.jLabelpath_firmaFirmaCliente,"");
		
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
		this.iIdNuevoFirmaCliente--;	
		
		
		this.firmaclienteAux=new FirmaCliente();
		
		this.firmaclienteAux.setId(this.iIdNuevoFirmaCliente);
		this.firmaclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.firmaclienteLogic.getFirmaClientes().add(this.firmaclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.firmaclientes.add(this.firmaclienteAux);
		}
		//ARCHITECTURE
		
		this.firmacliente=this.firmaclienteAux;
		
		if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFirmaCliente(this.firmacliente);
			this.setVariablesObjetoActualToFormularioForeignKeyFirmaCliente(this.firmacliente);
		}
				
		//this.setDefaultControlesFirmaCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFirmaCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFirmaCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFirmaCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFirmaCliente(this.firmaclienteBean,this.firmacliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FirmaClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
			classes=FirmaClienteConstantesFunciones.getClassesRelationshipsOfFirmaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.firmaclienteReturnGeneral=firmaclienteLogic.procesarEventosFirmaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.firmaclienteLogic.getFirmaClientes(),this.firmacliente,this.firmaclienteParameterGeneral,this.isEsNuevoFirmaCliente,classes);//this.firmaclienteLogic.getFirmaCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFirmaCliente(this.firmaclienteReturnGeneral,this.firmaclienteBean,false);
		
		if(this.firmaclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente());
		}
		
		if(this.firmaclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente(),classes);//this.firmaclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFirmaCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFirmaCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FirmaClienteBeanSwingJInternalFrameAdditional.RecargarFormFirmaCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFirmaCliente(false);
						
			if(firmaclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFirmaCliente();
			}
			
			this.actualizarVisualTableDatosFirmaCliente();
			
			this.jTableDatosFirmaCliente.setRowSelectionInterval(this.getIndiceNuevoFirmaCliente(), this.getIndiceNuevoFirmaCliente());
			
			this.seleccionarFilaTablaFirmaClienteActual();
						
			this.actualizarEstadoCeldasBotonesFirmaCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFirmaCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setEnabled(isHabilitar && this.firmaclienteConstantesFunciones.activarpath_firmaFirmaCliente);	
		//
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setEnabled(isHabilitar && this.firmaclienteConstantesFunciones.activarid_empresaFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setEnabled(isHabilitar && this.firmaclienteConstantesFunciones.activarid_clienteFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setEnabled(isHabilitar && this.firmaclienteConstantesFunciones.activarid_tipo_imagenFirmaCliente);
	};
	
	public void setDefaultControlesFirmaCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFirmaCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.firmaclienteSessionBean.setConGuardarRelaciones(true);			
			this.firmaclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.setVisible(true);
			
					
		} else {
			//this.firmaclienteSessionBean.setConGuardarRelaciones(false);			
			this.firmaclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFirmaCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
				if(firmaclienteAux.getId().equals(this.iIdNuevoFirmaCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FirmaCliente firmaclienteAux:this.firmaclientes) {
				if(firmaclienteAux.getId().equals(this.iIdNuevoFirmaCliente)) {
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
	
	public int getIndiceActualFirmaCliente(FirmaCliente firmacliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
				if(firmaclienteAux.getId().equals(firmacliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FirmaCliente firmaclienteAux:this.firmaclientes) {
				if(firmaclienteAux.getId().equals(firmacliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFirmaCliente(FirmaCliente firmaclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
				if(firmaclienteAux.getFirmaClienteOriginal().getId().equals(firmaclienteOriginal.getId())) {
					existe=true;
					firmaclienteOriginal.setId(firmaclienteAux.getId());
					firmaclienteOriginal.setVersionRow(firmaclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FirmaCliente firmaclienteAux:this.firmaclientes) {
				if(firmaclienteAux.getFirmaClienteOriginal().getId().equals(firmaclienteOriginal.getId())) {
					existe=true;
					firmaclienteOriginal.setId(firmaclienteAux.getId());
					firmaclienteOriginal.setVersionRow(firmaclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFirmaCliente(Boolean esParaCancelar) throws Exception {
		firmaclientesAux=new ArrayList<FirmaCliente>();
		firmaclienteAux=new FirmaCliente();
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
					if(firmaclienteAux.getId()<0) {
						firmaclientesAux.add(firmaclienteAux);
					}		
				}
				this.iIdNuevoFirmaCliente=0L;
				this.firmaclienteLogic.getFirmaClientes().removeAll(firmaclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FirmaCliente firmaclienteAux:this.firmaclientes) {
					if(firmaclienteAux.getId()<0) {
						firmaclientesAux.add(firmaclienteAux);
					}		
				}
				this.iIdNuevoFirmaCliente=0L;
				this.firmaclientes.removeAll(firmaclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFirmaCliente 
					&& this.firmaclienteLogic.getFirmaClientes().size()>0
					) {
					firmaclienteAux=this.firmaclienteLogic.getFirmaClientes().get(this.firmaclienteLogic.getFirmaClientes().size() - 1);
				
					if(firmaclienteAux.getId()<0) {
						this.firmaclienteLogic.getFirmaClientes().remove(firmaclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFirmaCliente && this.firmaclientes.size()>0) {
					firmaclienteAux=this.firmaclientes.get(this.firmaclientes.size() - 1);
				
					if(firmaclienteAux.getId()<0) {
						this.firmaclientes.remove(firmaclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFirmaCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(firmacliente.getId()<0) {
				this.firmaclienteLogic.getFirmaClientes().remove(this.firmacliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(firmacliente.getId()<0) {
				this.firmaclientes.remove(this.firmacliente);
			}
		}			
	}
	
	public void setEstadosInicialesFirmaCliente(List<FirmaCliente> firmaclientesAux) throws Exception {
		FirmaClienteConstantesFunciones.setEstadosInicialesFirmaCliente(firmaclientesAux);
	}
	
	public void setEstadosInicialesFirmaCliente(FirmaCliente firmaclienteAux) throws Exception {
		FirmaClienteConstantesFunciones.setEstadosInicialesFirmaCliente(firmaclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFirmaClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFirmaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFirmaClienteActual()) {
				if(!this.isEsNuevoFirmaCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFirmaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFirmaCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFirmaClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Firma Cliente ?", "MANTENIMIENTO DE Firma Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFirmaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FirmaCliente firmacliente) throws Exception {
		FirmaClienteConstantesFunciones.seleccionarAsignar(this.firmacliente,firmacliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFirmaCliente=this.isPermisoActualizarOriginalFirmaCliente;
			
			
			this.seleccionarAsignar(firmacliente);
			
			

			idClienteActual=firmacliente.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FirmaClienteConstantesFunciones.quitarEspaciosFirmaCliente(this.firmacliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFirmaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.firmaclienteSessionBean.setsFuncionBusquedaRapida(this.firmaclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoFirmaCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFirmaCliente(esParaCancelar);				
				this.cancelarNuevoFirmaCliente(esParaCancelar);								
			}
			
			this.firmacliente=new FirmaCliente();
			
			this.inicializarFirmaCliente();
			
			this.actualizarEstadoCeldasBotonesFirmaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFirmaCliente() throws Exception {
		try {
			FirmaClienteConstantesFunciones.inicializarFirmaCliente(this.firmacliente);
			
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
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.firmaclienteLogic.getFirmaClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFirmaClientes(String sAccionBusqueda,List<FirmaCliente> firmaclientesParaReportes) throws Exception {
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
					sPathReporteFinal="FirmaCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FirmaClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FirmaClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FirmaCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Firma Clientes");		
		parameters.put("busquedapor", FirmaClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFirmaCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FirmaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FirmaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFirmaCliente=new JRBeanArrayDataSource(FirmaClienteJInternalFrame.TraerFirmaClienteBeans(firmaclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFirmaCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FirmaClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FirmaClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FirmaClienteBean.TraerFirmaClienteBeans(firmaclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteFirmaClientes(sAccionBusqueda,sTipoArchivoReporte,firmaclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFirmaClientes(sAccionBusqueda,sTipoArchivoReporte,firmaclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFirmaClienteActionPerformed(null);
					//this.generarExcelReporteFirmaClientes(sAccionBusqueda,sTipoArchivoReporte,firmaclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFirmaClientes(sAccionBusqueda,sTipoArchivoReporte,firmaclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFirmaClientes(sAccionBusqueda,sTipoArchivoReporte,firmaclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFirmaClientes(sAccionBusqueda,sTipoArchivoReporte,firmaclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFirmaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<FirmaCliente> firmaclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FirmaClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFirmaCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FirmaCliente firmacliente : firmaclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FirmaClienteConstantesFunciones.generarExcelReporteDataFirmaCliente("NORMAL",row,workbook,firmacliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFirmaCliente(String sTipo,Row row,Workbook workbook) {
		
		FirmaClienteConstantesFunciones.generarExcelReporteHeaderFirmaCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFirmaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<FirmaCliente> firmaclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FirmaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FirmaCliente firmacliente : firmaclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FirmaClienteConstantesFunciones.getFirmaClienteDescripcion(firmacliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FirmaClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(firmacliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FirmaClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(firmacliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(firmacliente.gettipoimagen_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(firmacliente.getpath_firma());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFirmaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<FirmaCliente> firmaclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FirmaCliente> firmaclientesRespaldo=null;
		
		classes=FirmaClienteConstantesFunciones.getClassesRelationshipsOfFirmaCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.firmaclienteLogic.setDatosCliente(this.datosCliente);
		this.firmaclienteLogic.setDatosDeep(this.datosDeep);
		this.firmaclienteLogic.setIsConDeep(true);
		
		firmaclientesRespaldo=this.firmaclienteLogic.getFirmaClientes();
		
		this.firmaclienteLogic.setFirmaClientes(firmaclientesParaReportes);	
		this.firmaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		firmaclientesParaReportes=this.firmaclienteLogic.getFirmaClientes();
		this.firmaclienteLogic.setFirmaClientes(firmaclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FirmaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFirmaCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FirmaCliente firmacliente : firmaclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFirmaCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FirmaClienteConstantesFunciones.generarExcelReporteDataFirmaCliente("NORMAL",row,workbook,firmacliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FirmaClienteConstantesFunciones.getFirmaClienteDescripcion(firmacliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFirmaCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFirmaCliente() throws Exception {		
		this.startProcessFirmaCliente(true);
	}
	
	public void startProcessFirmaCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFirmaCliente ,this.jPanelParametrosReportesFirmaCliente, this.jScrollPanelDatosFirmaCliente,this.jPanelPaginacionFirmaCliente, this.jScrollPanelDatosEdicionFirmaCliente, this.jPanelAccionesFirmaCliente,this.jPanelAccionesFormularioFirmaCliente,this.jmenuBarFirmaCliente,this.jmenuBarDetalleFirmaCliente,this.jTtoolBarFirmaCliente,this.jTtoolBarDetalleFirmaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasFirmaCliente=this.jTabbedPaneBusquedasFirmaCliente; 
		
		final JPanel jPanelParametrosReportesFirmaCliente=this.jPanelParametrosReportesFirmaCliente;
		//final JScrollPane jScrollPanelDatosFirmaCliente=this.jScrollPanelDatosFirmaCliente;
		final JTable jTableDatosFirmaCliente=this.jTableDatosFirmaCliente;		
		final JPanel jPanelPaginacionFirmaCliente=this.jPanelPaginacionFirmaCliente;
		//final JScrollPane jScrollPanelDatosEdicionFirmaCliente=this.jScrollPanelDatosEdicionFirmaCliente;
		final JPanel jPanelAccionesFirmaCliente=this.jPanelAccionesFirmaCliente;
		
		JPanel jPanelCamposAuxiliarFirmaCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFirmaCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			jPanelCamposAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jPanelCamposFirmaCliente;
			jPanelAccionesFormularioAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jPanelAccionesFormularioFirmaCliente;
		}
		
		final JPanel jPanelCamposFirmaCliente=jPanelCamposAuxiliarFirmaCliente;
		final JPanel jPanelAccionesFormularioFirmaCliente=jPanelAccionesFormularioAuxiliarFirmaCliente;
		
		
		final JMenuBar jmenuBarFirmaCliente=this.jmenuBarFirmaCliente;
		final JToolBar jTtoolBarFirmaCliente=this.jTtoolBarFirmaCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFirmaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFirmaCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			jmenuBarDetalleAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jmenuBarDetalleFirmaCliente;
			jTtoolBarDetalleAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jTtoolBarDetalleFirmaCliente;
		}
		
		final JMenuBar jmenuBarDetalleFirmaCliente=jmenuBarDetalleAuxiliarFirmaCliente;
		final JToolBar jTtoolBarDetalleFirmaCliente=jTtoolBarDetalleAuxiliarFirmaCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFirmaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFirmaCliente;
			processRunnable.jTableDatos=jTableDatosFirmaCliente;
			processRunnable.jPanelCampos=jPanelCamposFirmaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionFirmaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesFirmaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFirmaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarFirmaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFirmaCliente;
			processRunnable.jTtoolBar=jTtoolBarFirmaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFirmaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFirmaCliente ,jPanelParametrosReportesFirmaCliente,jTableDatosFirmaCliente, /*jScrollPanelDatosFirmaCliente,*/jPanelCamposFirmaCliente,jPanelPaginacionFirmaCliente, /*jScrollPanelDatosEdicionFirmaCliente,*/ jPanelAccionesFirmaCliente,jPanelAccionesFormularioFirmaCliente,jmenuBarFirmaCliente,jmenuBarDetalleFirmaCliente,jTtoolBarFirmaCliente,jTtoolBarDetalleFirmaCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFirmaCliente ,jPanelParametrosReportesFirmaCliente, jScrollPanelDatosFirmaCliente,jPanelPaginacionFirmaCliente, jScrollPanelDatosEdicionFirmaCliente, jPanelAccionesFirmaCliente,jPanelAccionesFormularioFirmaCliente,jmenuBarFirmaCliente,jmenuBarDetalleFirmaCliente,jTtoolBarFirmaCliente,jTtoolBarDetalleFirmaCliente);
						
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
	
	public void finishProcessFirmaCliente() {// throws Exception 
		this.finishProcessFirmaCliente(true);
	}
	
	public void finishProcessFirmaCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFirmaCliente ,this.jPanelParametrosReportesFirmaCliente, this.jScrollPanelDatosFirmaCliente,this.jPanelPaginacionFirmaCliente, this.jScrollPanelDatosEdicionFirmaCliente, this.jPanelAccionesFirmaCliente,this.jPanelAccionesFormularioFirmaCliente,this.jmenuBarFirmaCliente,this.jmenuBarDetalleFirmaCliente,this.jTtoolBarFirmaCliente,this.jTtoolBarDetalleFirmaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasFirmaCliente=this.jTabbedPaneBusquedasFirmaCliente; 
		
		final JPanel jPanelParametrosReportesFirmaCliente=this.jPanelParametrosReportesFirmaCliente;
		//final JScrollPane jScrollPanelDatosFirmaCliente=this.jScrollPanelDatosFirmaCliente;
		final JTable jTableDatosFirmaCliente=this.jTableDatosFirmaCliente;		
		final JPanel jPanelPaginacionFirmaCliente=this.jPanelPaginacionFirmaCliente;
		//final JScrollPane jScrollPanelDatosEdicionFirmaCliente=this.jScrollPanelDatosEdicionFirmaCliente;
		final JPanel jPanelAccionesFirmaCliente=this.jPanelAccionesFirmaCliente;
		
		JPanel jPanelCamposAuxiliarFirmaCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFirmaCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			jPanelCamposAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jPanelCamposFirmaCliente;
			jPanelAccionesFormularioAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jPanelAccionesFormularioFirmaCliente;
		}
		
		final JPanel jPanelCamposFirmaCliente=jPanelCamposAuxiliarFirmaCliente;
		final JPanel jPanelAccionesFormularioFirmaCliente=jPanelAccionesFormularioAuxiliarFirmaCliente;
		
		
		final JMenuBar jmenuBarFirmaCliente=this.jmenuBarFirmaCliente;		
		final JToolBar jTtoolBarFirmaCliente=this.jTtoolBarFirmaCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarFirmaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFirmaCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			jmenuBarDetalleAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jmenuBarDetalleFirmaCliente;
			jTtoolBarDetalleAuxiliarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jTtoolBarDetalleFirmaCliente;		
		}
		
		final JMenuBar jmenuBarDetalleFirmaCliente=jmenuBarDetalleAuxiliarFirmaCliente;
		final JToolBar jTtoolBarDetalleFirmaCliente=jTtoolBarDetalleAuxiliarFirmaCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFirmaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFirmaCliente;
			processRunnable.jTableDatos=jTableDatosFirmaCliente;
			processRunnable.jPanelCampos=jPanelCamposFirmaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionFirmaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesFirmaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFirmaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarFirmaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFirmaCliente;
			processRunnable.jTtoolBar=jTtoolBarFirmaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFirmaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFirmaCliente ,jPanelParametrosReportesFirmaCliente, jTableDatosFirmaCliente,/*jScrollPanelDatosFirmaCliente,*/jPanelCamposFirmaCliente,jPanelPaginacionFirmaCliente, /*jScrollPanelDatosEdicionFirmaCliente,*/ jPanelAccionesFirmaCliente,jPanelAccionesFormularioFirmaCliente,jmenuBarFirmaCliente,jmenuBarDetalleFirmaCliente,jTtoolBarFirmaCliente,jTtoolBarDetalleFirmaCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFirmaCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFirmaCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFirmaCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFirmaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFirmaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFirmaCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFirmaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFirmaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFirmaCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.firmaclienteConstantesFunciones.getsFinalQueryFirmaCliente();
		String  finalQueryPaginacionTodos=this.firmaclienteConstantesFunciones.getsFinalQueryFirmaCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FirmaClienteConstantesFunciones.getArrayColumnasGlobalesNoFirmaCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FirmaClienteConstantesFunciones.getArrayColumnasGlobalesFirmaCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FirmaClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.firmaclientesEliminados= new ArrayList<FirmaCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFirmaCliente();
		
				///*FirmaClienteSessionBean*/this.firmaclienteSessionBean=new FirmaClienteSessionBean();
			
			if(this.firmaclienteSessionBean==null) {
				this.firmaclienteSessionBean=new FirmaClienteSessionBean();
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
					this.iNumeroPaginacion=FirmaClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FirmaClienteConstantesFunciones.getClassesForeignKeysOfFirmaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/firmacliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			firmaclientesAux= new ArrayList<FirmaCliente>();
			
				
			firmaclienteLogic.setDatosCliente(this.datosCliente);
			firmaclienteLogic.setDatosDeep(this.datosDeep);
			firmaclienteLogic.setIsConDeep(true);
			
			
			firmaclienteLogic.getFirmaClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					firmaclienteLogic.getTodosFirmaClientes(finalQueryGlobal,pagination);
					
					//firmaclienteLogic.getTodosFirmaClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(firmaclienteLogic.getFirmaClientes()==null|| firmaclienteLogic.getFirmaClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							firmaclientesAux= new ArrayList<FirmaCliente>();
							firmaclientesAux.addAll(firmaclienteLogic.getFirmaClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientesAux= new ArrayList<FirmaCliente>();
							firmaclientesAux.addAll(firmaclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							firmaclienteLogic.getTodosFirmaClientes(finalQueryGlobal+"",this.pagination);												
							
							//firmaclienteLogic.getTodosFirmaClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFirmaClientes("Todos",firmaclienteLogic.getFirmaClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							firmaclienteLogic.setFirmaClientes(new ArrayList<FirmaCliente>());					
							firmaclienteLogic.getFirmaClientes().addAll(firmaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientes=new ArrayList<FirmaCliente>();
							firmaclientes.addAll(firmaclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFirmaCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFirmaCliente=this.idActual;
				
				} else if(this.idFirmaClienteActual!=null && this.idFirmaClienteActual!=0L) {
					idFirmaCliente=idFirmaClienteActual;
				}
				
					
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndicePorId(idFirmaCliente);
				
				this.firmaclientes=new ArrayList<FirmaCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					firmaclienteLogic.getEntity(idFirmaCliente);
					
					//firmaclienteLogic.getEntityWithConnection(idFirmaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					firmaclienteLogic.setFirmaClientes(new ArrayList<FirmaCliente>());
					firmaclienteLogic.getFirmaClientes().add(firmaclienteLogic.getFirmaCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.firmaclientes=new ArrayList<FirmaCliente>();
					this.firmaclientes.add(firmacliente);
				}
				
				if(firmaclienteLogic.getFirmaCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					firmaclienteLogic.getFirmaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=firmaclienteLogic.getFirmaClientes()==null||firmaclienteLogic.getFirmaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=firmaclientes==null|| firmaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclientesAux=new ArrayList<FirmaCliente>();
						firmaclientesAux.addAll(firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientesAux=new ArrayList<FirmaCliente>();
							firmaclientesAux.addAll(firmaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							firmaclienteLogic.getFirmaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFirmaClientes("FK_IdCliente",firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFirmaClientes("FK_IdCliente",firmaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteLogic.setFirmaClientes(new ArrayList<FirmaCliente>());
						firmaclienteLogic.getFirmaClientes().addAll(firmaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientes=new ArrayList<FirmaCliente>();
							firmaclientes.addAll(firmaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					firmaclienteLogic.getFirmaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=firmaclienteLogic.getFirmaClientes()==null||firmaclienteLogic.getFirmaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=firmaclientes==null|| firmaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclientesAux=new ArrayList<FirmaCliente>();
						firmaclientesAux.addAll(firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientesAux=new ArrayList<FirmaCliente>();
							firmaclientesAux.addAll(firmaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							firmaclienteLogic.getFirmaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFirmaClientes("FK_IdEmpresa",firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFirmaClientes("FK_IdEmpresa",firmaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteLogic.setFirmaClientes(new ArrayList<FirmaCliente>());
						firmaclienteLogic.getFirmaClientes().addAll(firmaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientes=new ArrayList<FirmaCliente>();
							firmaclientes.addAll(firmaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoImagen")) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					firmaclienteLogic.getFirmaClientesFK_IdTipoImagen(finalQueryGlobal,pagination,id_tipo_imagenFK_IdTipoImagen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=firmaclienteLogic.getFirmaClientes()==null||firmaclienteLogic.getFirmaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=firmaclientes==null|| firmaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclientesAux=new ArrayList<FirmaCliente>();
						firmaclientesAux.addAll(firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientesAux=new ArrayList<FirmaCliente>();
							firmaclientesAux.addAll(firmaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							firmaclienteLogic.getFirmaClientesFK_IdTipoImagen(finalQueryGlobal,pagination,id_tipo_imagenFK_IdTipoImagen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FirmaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoImagen(id_tipo_imagenFK_IdTipoImagen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFirmaClientes("FK_IdTipoImagen",firmaclienteLogic.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFirmaClientes("FK_IdTipoImagen",firmaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteLogic.setFirmaClientes(new ArrayList<FirmaCliente>());
						firmaclienteLogic.getFirmaClientes().addAll(firmaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclientes=new ArrayList<FirmaCliente>();
							firmaclientes.addAll(firmaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFirmaCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFirmaCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=firmaclienteLogic.getFirmaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=firmaclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=firmaclienteLogic.getFirmaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=firmaclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FirmaCliente firmacliente) {
		Boolean permite=true;
		
		if(this.firmacliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FirmaClienteConstantesFunciones.getOrderByListaFirmaCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FirmaClienteConstantesFunciones.getOrderByListaFirmaCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FirmaCliente firmacliente:firmaclienteLogic.getFirmaClientes()) {
				if(firmacliente.getsType().equals(Constantes2.S_TOTALES)) {
					firmaclienteTotales=firmacliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FirmaCliente firmacliente:this.firmaclientes) {
				if(firmacliente.getsType().equals(Constantes2.S_TOTALES)) {
					firmaclienteTotales=firmacliente;
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
			this.firmaclienteAux=new FirmaCliente();
			this.firmaclienteAux.setsType(Constantes2.S_TOTALES);
			this.firmaclienteAux.setIsNew(false);
			this.firmaclienteAux.setIsChanged(false);
			this.firmaclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FirmaClienteConstantesFunciones.TotalizarValoresFilaFirmaCliente(this.firmaclienteLogic.getFirmaClientes(),this.firmaclienteAux);
				
				this.firmaclienteLogic.getFirmaClientes().add(this.firmaclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FirmaClienteConstantesFunciones.TotalizarValoresFilaFirmaCliente(this.firmaclientes,this.firmaclienteAux);
				
				this.firmaclientes.add(this.firmaclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		firmaclienteTotales=new FirmaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.firmaclienteLogic.getFirmaClientes().remove(firmaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.firmaclientes.remove(firmaclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		firmaclienteTotales=new FirmaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FirmaCliente firmacliente:firmaclienteLogic.getFirmaClientes()) {
				if(firmacliente.getsType().equals(Constantes2.S_TOTALES)) {
					firmaclienteTotales=firmacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FirmaClienteConstantesFunciones.TotalizarValoresFilaFirmaCliente(this.firmaclienteLogic.getFirmaClientes(),firmaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FirmaCliente firmacliente:this.firmaclientes) {
				if(firmacliente.getsType().equals(Constantes2.S_TOTALES)) {
					firmaclienteTotales=firmacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FirmaClienteConstantesFunciones.TotalizarValoresFilaFirmaCliente(this.firmaclientes,firmaclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFirmaClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFirmaClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFirmaClientesFK_IdTipoImagen()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoImagen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFirmaClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					firmaclienteLogic.getFirmaClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFirmaClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					firmaclienteLogic.getFirmaClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFirmaClientesFK_IdTipoImagen(String sFinalQuery,Long id_tipo_imagen)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					firmaclienteLogic.getFirmaClientesFK_IdTipoImagen(sFinalQuery,this.pagination,id_tipo_imagen);
				
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
	
	public void inicializarPermisosFirmaCliente() {
		this.isPermisoTodoFirmaCliente=false;
		this.isPermisoNuevoFirmaCliente=false;
		this.isPermisoActualizarFirmaCliente=false;
		this.isPermisoActualizarOriginalFirmaCliente=false;
		this.isPermisoEliminarFirmaCliente=false;
		this.isPermisoGuardarCambiosFirmaCliente=false;
		this.isPermisoConsultaFirmaCliente=false;
		this.isPermisoBusquedaFirmaCliente=false;
		this.isPermisoReporteFirmaCliente=false;		
		this.isPermisoOrdenFirmaCliente=false;		
		this.isPermisoPaginacionMedioFirmaCliente=false;		
		this.isPermisoPaginacionAltoFirmaCliente=false;
		this.isPermisoPaginacionTodoFirmaCliente=false;
		this.isPermisoCopiarFirmaCliente=false;		
		this.isPermisoVerFormFirmaCliente=false;		
		this.isPermisoDuplicarFirmaCliente=false;		
		this.isPermisoOrdenFirmaCliente=false;		
	}
	
	public void setPermisosUsuarioFirmaCliente(Boolean isPermiso) {
		this.isPermisoTodoFirmaCliente=isPermiso;
		this.isPermisoNuevoFirmaCliente=isPermiso;
		this.isPermisoActualizarFirmaCliente=isPermiso;
		this.isPermisoActualizarOriginalFirmaCliente=isPermiso;
		this.isPermisoEliminarFirmaCliente=isPermiso;
		this.isPermisoGuardarCambiosFirmaCliente=isPermiso;
		this.isPermisoConsultaFirmaCliente=isPermiso;
		this.isPermisoBusquedaFirmaCliente=isPermiso;
		this.isPermisoReporteFirmaCliente=isPermiso;
		this.isPermisoOrdenFirmaCliente=isPermiso;		
		this.isPermisoPaginacionMedioFirmaCliente=isPermiso;		
		this.isPermisoPaginacionAltoFirmaCliente=isPermiso;		
		this.isPermisoPaginacionTodoFirmaCliente=isPermiso;		
		this.isPermisoCopiarFirmaCliente=isPermiso;		
		this.isPermisoVerFormFirmaCliente=isPermiso;		
		this.isPermisoDuplicarFirmaCliente=isPermiso;
		this.isPermisoOrdenFirmaCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFirmaCliente(Boolean isPermiso) {
		//this.isPermisoTodoFirmaCliente=isPermiso;
		this.isPermisoNuevoFirmaCliente=isPermiso;
		this.isPermisoActualizarFirmaCliente=isPermiso;
		this.isPermisoActualizarOriginalFirmaCliente=isPermiso;
		this.isPermisoEliminarFirmaCliente=isPermiso;
		this.isPermisoGuardarCambiosFirmaCliente=isPermiso;
		//this.isPermisoConsultaFirmaCliente=isPermiso;
		//this.isPermisoBusquedaFirmaCliente=isPermiso;
		//this.isPermisoReporteFirmaCliente=isPermiso;
		//this.isPermisoOrdenFirmaCliente=isPermiso;		
		//this.isPermisoPaginacionMedioFirmaCliente=isPermiso;		
		//this.isPermisoPaginacionAltoFirmaCliente=isPermiso;		
		//this.isPermisoPaginacionTodoFirmaCliente=isPermiso;		
		//this.isPermisoCopiarFirmaCliente=isPermiso;		
		//this.isPermisoDuplicarFirmaCliente=isPermiso;
		//this.isPermisoOrdenFirmaCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFirmaClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FirmaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFirmaCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFirmaClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFirmaClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFirmaClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFirmaClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFirmaCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FirmaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FirmaClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFirmaCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFirmaCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFirmaCliente=this.isPermisoActualizarFirmaCliente;
			this.isPermisoEliminarFirmaCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFirmaCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFirmaCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFirmaCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFirmaCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFirmaCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFirmaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFirmaCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFirmaCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFirmaCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFirmaCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFirmaCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFirmaCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFirmaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFirmaCliente.setToolTipText(this.jTableDatosFirmaCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFirmaCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFirmaCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FirmaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FirmaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFirmaCliente() throws Exception {
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
	public void inicializarCombosForeignKeyFirmaClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipoimagensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFirmaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FirmaClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFirmaClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoImagenListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoImagenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoimagensForeignKey==null||this.tipoimagensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoImagenConstantesFunciones.getArrayColumnasGlobalesTipoImagen(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoImagenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoImagenConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoImagensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFirmaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FirmaClienteParameterReturnGeneral firmaclienteReturnGeneral=new FirmaClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.firmaclienteConstantesFunciones.cargarid_empresaFirmaCliente)
					 || (this.esRecargarFks && this.firmaclienteConstantesFunciones.cargarid_empresaFirmaCliente)) {

					if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+firmaclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.firmaclienteConstantesFunciones.cargarid_clienteFirmaCliente)
					 || (this.esRecargarFks && this.firmaclienteConstantesFunciones.cargarid_clienteFirmaCliente)) {

					if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+firmaclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoImagen="";

				if(((this.tipoimagensForeignKey==null||this.tipoimagensForeignKey.size()<=0) && this.firmaclienteConstantesFunciones.cargarid_tipo_imagenFirmaCliente)
					 || (this.esRecargarFks && this.firmaclienteConstantesFunciones.cargarid_tipo_imagenFirmaCliente)) {

					if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagen()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoImagenConstantesFunciones.getArrayColumnasGlobalesTipoImagen(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoImagen=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoImagenConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoImagen=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoImagen, "");
						finalQueryGlobalTipoImagen+=TipoImagenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoImagensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoImagen=" WHERE " + ConstantesSql.ID + "="+firmaclienteSessionBean.getlidTipoImagenActual();
					}
				} else {
					finalQueryGlobalTipoImagen="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				firmaclienteReturnGeneral=firmaclienteLogic.cargarCombosLoteForeignKeyFirmaCliente(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoImagen);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=firmaclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=firmaclienteReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoImagen.equals("NONE")) {
				this.tipoimagensForeignKey=firmaclienteReturnGeneral.gettipoimagensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFirmaCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoImagen();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.firmaclienteSessionBean==null) {
				this.firmaclienteSessionBean=new FirmaClienteSessionBean();
			}

			if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoImagen()throws Exception {
		try {

			if(!this.firmaclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoImagen()) {
				TipoImagen tipoimagen=new TipoImagen();
				TipoImagenConstantesFunciones.setTipoImagenDescripcion(tipoimagen,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoimagen.setId(null);

				if(!TipoImagenConstantesFunciones.ExisteEnLista(this.tipoimagensForeignKey,tipoimagen,true)) {

					this.tipoimagensForeignKey.add(0,tipoimagen);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFirmaCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFirmaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFirmaCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFirmaCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFirmaCliente(FirmaCliente firmacliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(firmacliente.getid_cliente(),false,"Formulario");
			this.setActualTipoImagenForeignKey(firmacliente.getid_tipo_imagen(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFirmaCliente(FirmaCliente firmacliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(firmacliente.getCliente()!=null && !sTipoEvento.equals("id_clienteFirmaCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(firmacliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFirmaCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.firmaclienteConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoImagenForeignKey(this.firmaclienteConstantesFunciones.getid_tipo_imagen(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFirmaCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFirmaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFirmaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFirmaCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFirmaCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoImagensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFirmaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoImagensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFirmaCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public FirmaClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FirmaClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FirmaClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.firmaclienteSessionBean=new FirmaClienteSessionBean(); 
		this.firmaclienteConstantesFunciones=new FirmaClienteConstantesFunciones(); 
		this.firmaclienteBean=new FirmaCliente();//(this.firmaclienteConstantesFunciones); 		
		this.firmaclienteReturnGeneral=new FirmaClienteParameterReturnGeneral(); 
		
		this.firmaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.firmaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FirmaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FirmaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FirmaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFirmaCliente(true);
			
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
			
			this.firmaclienteConstantesFunciones=new FirmaClienteConstantesFunciones(); 
			this.firmaclienteBean=new FirmaCliente();//this.firmaclienteConstantesFunciones); 			
			this.firmaclienteReturnGeneral=new FirmaClienteParameterReturnGeneral(); 
		
			FirmaClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Firma Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.firmacliente=new FirmaCliente();
			this.firmaclientes = new ArrayList<FirmaCliente>();
			this.firmaclientesAux = new ArrayList<FirmaCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic=new FirmaClienteLogic();
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.firmaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.firmaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFirmaCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFirmaCliente);	
					}
					
					if(this.jInternalFrameImportacionFirmaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFirmaCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFirmaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFirmaCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFirmaCliente);
				this.jInternalFrameDetalleFormFirmaCliente.setVisible(false);
				this.jInternalFrameDetalleFormFirmaCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFirmaCliente);
					this.jInternalFrameReporteDinamicoFirmaCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoFirmaCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFirmaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFirmaCliente);
					this.jInternalFrameImportacionFirmaCliente.setVisible(false);
					this.jInternalFrameImportacionFirmaCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFirmaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFirmaCliente);
					this.jInternalFrameOrderByFirmaCliente.setVisible(false);
					this.jInternalFrameOrderByFirmaCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFirmaClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FirmaClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.firmaclienteReturnGeneral=new FirmaClienteParameterReturnGeneral();
			
			this.firmaclienteParameterGeneral=new FirmaClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.firmaclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FirmaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FirmaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.firmaclienteSessionBean.getEsGuardarRelacionado(),this.firmaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FirmaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.firmaclienteSessionBean.getEsGuardarRelacionado(),this.firmaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaDuplicarFirmaCliente=true;
			this.isVisibilidadCeldaCopiarFirmaCliente=true;
			this.isVisibilidadCeldaVerFormFirmaCliente=true;
			this.isVisibilidadCeldaOrdenFirmaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
			this.isVisibilidadCeldaModificarFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=false;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=false;
			this.isVisibilidadCeldaGuardarFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoImagen=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFirmaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFirmaCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFirmaCliente(false);
			
			this.setPermisosUsuarioFirmaCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.firmaclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.firmaclienteSessionBean.getEsGuardarRelacionado() && this.firmaclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFirmaClienteClasesRelacionadas();
			}
			
			if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFirmaClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFirmaCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFirmaCliente();
			}
			
			if(!this.isPermisoBusquedaFirmaCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFirmaCliente,this.isPermisoPaginacionMedioFirmaCliente,this.isPermisoPaginacionTodoFirmaCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FirmaClienteConstantesFunciones.getTiposSeleccionarFirmaCliente());
				
				this.tiposColumnasSelect=FirmaClienteConstantesFunciones.getTiposSeleccionarFirmaCliente(true);
				
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
			//if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFirmaCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFirmaCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFirmaCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFirmaCliente() ;
			
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
			this.tipoimagenLogic=new TipoImagenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				firmaclienteImplementable= (FirmaClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FirmaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				firmaclienteImplementableHome= (FirmaClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FirmaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.firmaclientes= new ArrayList<FirmaCliente>();
			this.firmaclientesEliminados= new ArrayList<FirmaCliente>();
						
			this.isEsNuevoFirmaCliente=false;
			this.esParaAccionDesdeFormularioFirmaCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoimagensForeignKey=new ArrayList<TipoImagen>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFirmaCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFirmaCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FirmaClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FirmaClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFirmaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFirmaCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFirmaCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFirmaCliente();
			}
			
			FirmaClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFirmaCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFirmaCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFirmaCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFirmaCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FirmaCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFirmaCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFirmaCliente")) {
				iIndex=this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFirmaCliente();	
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
	
	public void cargarCombosForeignKeyFirmaCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFirmaCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFirmaCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFirmaClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFirmaCliente();
		
		this.cargarCombosFrameForeignKeyFirmaCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFirmaCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFirmaCliente();
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

	public void cargarCombosForeignKeyTipoImagen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoImagenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoImagen();
				this.cargarCombosFrameTipoImagensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoImagen(this.tipoimagensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFirmaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			
			if(jTableDatosFirmaCliente.getRowCount()>=1) {
				jTableDatosFirmaCliente.removeRowSelectionInterval(0, jTableDatosFirmaCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoFirmaCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFirmaCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFirmaCliente(true);			
			//this.firmacliente=new FirmaCliente();
			//this.firmacliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFirmaCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFirmaCliente() ;
			
			if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFirmaCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.firmacliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);				
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FirmaCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFirmaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFirmaCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFirmaCliente.getSelectedRows().length;			
			}
			
			firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFirmaCliente--;			
				//FirmaCliente firmaclienteAux= new FirmaCliente();			
				//firmaclienteAux.setId(this.iIdNuevoFirmaCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FirmaCliente firmaclienteOrigen=new FirmaCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FirmaCliente firmaclienteOrigen : firmaclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							firmaclienteOrigen =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							firmaclienteOrigen =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFirmaCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.firmacliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFirmaCliente(firmaclienteOrigen,this.firmacliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.firmaclienteLogic.getFirmaClientes().add(this.firmaclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.firmaclientes.add(this.firmaclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFirmaCliente(false);
				
				this.jTableDatosFirmaCliente.setRowSelectionInterval(this.getIndiceNuevoFirmaCliente(), this.getIndiceNuevoFirmaCliente());
				
				int iLastRow =  this.jTableDatosFirmaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFirmaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFirmaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFirmaCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();									
		
			FirmaCliente firmaclienteOrigen=new FirmaCliente();
			FirmaCliente firmaclienteDestino=new FirmaCliente();
				
			firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFirmaCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || firmaclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFirmaCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteOrigen =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						firmaclienteOrigen =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						firmaclienteDestino =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						firmaclienteDestino =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				firmaclienteOrigen =firmaclientesSeleccionados.get(0);
				firmaclienteDestino =firmaclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFirmaCliente(firmaclienteOrigen,firmaclienteDestino,true,false);
				
				firmaclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(firmaclienteDestino,firmaclienteLogic.getFirmaClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(firmaclienteDestino,firmaclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFirmaCliente(false);
				
				//this.jTableDatosFirmaCliente.setRowSelectionInterval(this.getIndiceNuevoFirmaCliente(), this.getIndiceNuevoFirmaCliente());
				
				int iLastRow =  this.jTableDatosFirmaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFirmaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFirmaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFirmaCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFirmaCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFirmaCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFirmaCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFirmaCliente.setVisible(!isVisible);
			this.jPanelPaginacionFirmaCliente.setVisible(!isVisible);
			this.jPanelAccionesFirmaCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFirmaCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFirmaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFirmaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFirmaCliente();
			
			this.abrirFrameOrderByFirmaCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFirmaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFirmaCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFirmaCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFirmaCliente.isMaximum()) {
					this.jInternalFrameDetalleFormFirmaCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFirmaCliente.setSize(this.jInternalFrameDetalleFormFirmaCliente.iWidthFormulario,this.jInternalFrameDetalleFormFirmaCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFirmaCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFirmaCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFirmaCliente.isMaximum()) {
						this.jInternalFrameDetalleFormFirmaCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFirmaCliente.jContentPaneDetalleFirmaCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFirmaCliente.jContentPaneDetalleFirmaCliente.getWidth(),FirmaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFirmaCliente.jContentPaneDetalleFirmaCliente.getWidth(),FirmaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFirmaCliente.jContentPaneDetalleFirmaCliente.getWidth(),FirmaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFirmaCliente.setVisible(true);
	        this.jInternalFrameDetalleFormFirmaCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFirmaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFirmaCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFirmaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFirmaCliente,false,this);
				} else {
					this.jInternalFrameOrderByFirmaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFirmaCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFirmaCliente);
				this.jInternalFrameOrderByFirmaCliente.setVisible(false);
				this.jInternalFrameOrderByFirmaCliente.setSelected(false);
				
				this.jInternalFrameOrderByFirmaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFirmaCliente"));
				
				this.inicializarActualizarBindingTablaOrderByFirmaCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFirmaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFirmaCliente==null) {
				
				this.jInternalFrameImportacionFirmaCliente=new ImportacionJInternalFrame(FirmaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFirmaCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFirmaCliente);
				this.jInternalFrameImportacionFirmaCliente.setVisible(false);
				this.jInternalFrameImportacionFirmaCliente.setSelected(false);


				this.jInternalFrameImportacionFirmaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFirmaCliente"));
				this.jInternalFrameImportacionFirmaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFirmaCliente"));
				this.jInternalFrameImportacionFirmaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFirmaCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFirmaCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFirmaCliente==null) {
				this.jInternalFrameReporteDinamicoFirmaCliente=new ReporteDinamicoJInternalFrame(FirmaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFirmaCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFirmaCliente);
				this.jInternalFrameReporteDinamicoFirmaCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoFirmaCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFirmaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFirmaCliente"));
				this.jInternalFrameReporteDinamicoFirmaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFirmaCliente"));
				this.jInternalFrameReporteDinamicoFirmaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFirmaCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFirmaCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFirmaCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFirmaCliente);
			
	       	this.jInternalFrameDetalleFormFirmaCliente.setVisible(false);
	        this.jInternalFrameDetalleFormFirmaCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormFirmaCliente.dispose();
			//this.jInternalFrameDetalleFormFirmaCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFirmaCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFirmaCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoFirmaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFirmaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFirmaCliente.setVisible(true);
	        this.jInternalFrameImportacionFirmaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFirmaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFirmaCliente.setVisible(true);
	        this.jInternalFrameOrderByFirmaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFirmaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFirmaCliente.setVisible(false);
	        this.jInternalFrameOrderByFirmaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFirmaCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFirmaCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoFirmaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFirmaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFirmaCliente.setVisible(false);
	        this.jInternalFrameImportacionFirmaCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFirmaCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFirmaCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFirmaCliente(true);
			//this.isEsNuevoFirmaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFirmaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFirmaCliente(false) ;
			
			if(firmaclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFirmaCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFirmaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFirmaClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFirmaCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFirmaCliente(true);
			//this.isEsNuevoFirmaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.firmacliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFirmaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFirmaCliente(false) ;
			
			if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFirmaCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFirmaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.firmaclienteConstantesFunciones.cargarid_clienteFirmaCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingFirmaCliente(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFirmaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoImagen(List<TipoImagen> tipoimagensForeignKey)throws Exception{
		TableColumn tableColumnTipoImagen=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN));
		TableCellEditor tableCellEditorTipoImagen =tableColumnTipoImagen.getCellEditor();

		TipoImagenTableCell tipoimagenTableCellFk=(TipoImagenTableCell)tableCellEditorTipoImagen;

		if(tipoimagenTableCellFk!=null) {
			tipoimagenTableCellFk.settipoimagensForeignKey(tipoimagensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFirmaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoimagenTableCellFk.setRowActual(intSelectedRow);
			//tipoimagenTableCellFk.settipoimagensForeignKeyActual(tipoimagensForeignKey);
		//}


		if(tipoimagenTableCellFk!=null) {
			tipoimagenTableCellFk.RecargarTipoImagensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFirmaCliente(false);
			
			//if(!this.isEsNuevoFirmaCliente) {								
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				
			}
			
			if(this.permiteMantenimiento(this.firmacliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFirmaCliente=true;
					this.inicializarActualizarBindingTablaFirmaCliente(false);
					this.isEsNuevoFirmaCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFirmaCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFirmaCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFirmaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFirmaCliente(false);
				
				this.habilitarDeshabilitarControlesFirmaCliente(false);
			
												
				
				if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFirmaCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFirmaClienteActionPerformed(evt,firmaclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFirmaCliente(this.firmacliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFirmaCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,firmaclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.firmacliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				this.firmacliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				this.firmacliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.firmacliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FirmaClienteModel) this.jTableDatosFirmaCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFirmaCliente=true;
				this.inicializarActualizarBindingTablaFirmaCliente(false);
				this.isEsNuevoFirmaCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFirmaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFirmaCliente(false);
				
				this.habilitarDeshabilitarControlesFirmaCliente(false);
				
				
				
				if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFirmaCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFirmaClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFirmaCliente.getRowCount()>=1) {
				jTableDatosFirmaCliente.removeRowSelectionInterval(0, jTableDatosFirmaCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFirmaCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFirmaCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFirmaCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFirmaCliente(false) ;
			
			this.isEsNuevoFirmaCliente=false;
			
			if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFirmaCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFirmaCliente(false);
				
				//SI ES MANUAL
				if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFirmaCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFirmaCliente--;			
			//FirmaCliente firmaclienteAux= new FirmaCliente();			
			//firmaclienteAux.setId(this.iIdNuevoFirmaCliente);
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFirmaCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
			
			this.firmacliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.firmaclienteLogic.getFirmaClientes().add(this.firmaclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.firmaclientes.add(this.firmaclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFirmaCliente(false);
			
			this.jTableDatosFirmaCliente.setRowSelectionInterval(this.getIndiceNuevoFirmaCliente(), this.getIndiceNuevoFirmaCliente());
			
			int iLastRow =  this.jTableDatosFirmaCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFirmaCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFirmaCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFirmaCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFirmaCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFirmaCliente(false);
			
			//SI ES MANUAL
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFirmaCliente();
			}
			
			//this.abrirFrameTreeFirmaCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Firma ClienteS ?", "MANTENIMIENTO DE Firma Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFirmaCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFirmaCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.firmaclienteReturnGeneral=firmaclienteLogic.procesarImportacionFirmaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.firmaclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFirmaClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFirmaCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFirmaCliente.setFileImportacion(this.jInternalFrameImportacionFirmaCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFirmaCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFirmaCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFirmaCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFirmaCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		

		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FirmaClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FirmaClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FirmaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FirmaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoImagen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoImagen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoImagen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoImagen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FirmaClienteConstantesFunciones.LABEL_FIRMA:
					iAnchoColumna=0;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rma_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FirmaClienteConstantesFunciones.LABEL_PATHFIRMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_thFirma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_thFirma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_thFirma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_thFirma_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFirmaCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FirmaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN:
					sNombreCampoCategoria="id_tipo_imagen";
					break;

				case FirmaClienteConstantesFunciones.LABEL_FIRMA:
					sNombreCampoCategoria="firma";
					break;

				case FirmaClienteConstantesFunciones.LABEL_PATHFIRMA:
					sNombreCampoCategoria="path_firma";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FirmaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN:
					sNombreCampoCategoriaValor="id_tipo_imagen";
					break;

				case FirmaClienteConstantesFunciones.LABEL_FIRMA:
					sNombreCampoCategoriaValor="firma";
					break;

				case FirmaClienteConstantesFunciones.LABEL_PATHFIRMA:
					sNombreCampoCategoriaValor="path_firma";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FirmaClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idtipo Imagen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_imagen");
					break;

				case FirmaClienteConstantesFunciones.LABEL_FIRMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Firma",sNombreCampoCategoria,sNombreCampoCategoriaValor,"firma");
					break;

				case FirmaClienteConstantesFunciones.LABEL_PATHFIRMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Path Firma",sNombreCampoCategoria,sNombreCampoCategoriaValor,"path_firma");
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
	
	public void jButtonGenerarExcelReporteDinamicoFirmaClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FirmaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FirmaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FirmaCliente firmacliente:firmaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(firmacliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(FirmaCliente firmacliente:firmaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(firmacliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN);
					iRow++;

					for(FirmaCliente firmacliente:firmaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(firmacliente.gettipoimagen_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FirmaClienteConstantesFunciones.LABEL_PATHFIRMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA);
					iRow++;

					for(FirmaCliente firmacliente:firmaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(firmacliente.getpath_firma());
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
			//	this.getFilaCabeceraExportarExcelFirmaCliente(row);				
			//	iRow++;
			//}				
			
			//for(FirmaCliente firmaclienteAux:firmaclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFirmaCliente(firmaclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFirmaCliente(false);
			
			//SI ES MANUAL
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFirmaCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFirmaCliente(false);
			
			//SI ES MANUAL
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFirmaCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFirmaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFirmaCliente(false);
			
			//SI ES MANUAL
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFirmaCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFirmaCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFirmaCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFirmaCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFirmaCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFirmaCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFirmaCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosFirmaCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosFirmaCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFirmaCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFirmaCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFirmaCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFirmaCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFirmaCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFirmaCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFirmaCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFirmaCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFirmaCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFirmaCliente();
		
		this.inicializarActualizarBindingBotonesManualFirmaCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFirmaCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFirmaCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFirmaCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFirmaCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFirmaCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFirmaCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFirmaCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFirmaCliente.jCheckBoxPostAccionNuevoFirmaCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFirmaCliente.jCheckBoxPostAccionSinCerrarFirmaCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFirmaCliente.jCheckBoxPostAccionSinMensajeFirmaCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFirmaCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFirmaCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFirmaCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
				this.jInternalFrameDetalleFormFirmaCliente.jCheckBoxPostAccionNuevoFirmaCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFirmaCliente.jCheckBoxPostAccionSinCerrarFirmaCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFirmaCliente.jCheckBoxPostAccionSinMensajeFirmaCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFirmaCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFirmaCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFirmaCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFirmaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFirmaCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFirmaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFirmaCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFirmaCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFirmaCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFirmaCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFirmaCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFirmaCliente() throws Exception {
		try	{
			if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFirmaCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFirmaCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFirmaCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFirmaCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFirmaCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFirmaCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFirmaCliente.addItem(reporte);
			}
			
			
			if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFirmaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFirmaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFirmaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFirmaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFirmaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFirmaCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFirmaCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFirmaCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFirmaCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
				this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
				this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFirmaCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFirmaCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFirmaCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFirmaCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFirmaCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFirmaCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteFirmaCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteFirmaCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.getSelectedItem()!=null){this.id_tipo_imagenFK_IdTipoImagen=((TipoImagen)this.jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFirmaCliente(Boolean esInicializar) throws Exception {				
		if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFirmaCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFirmaCliente() throws Exception {
		this.inicializarActualizarBindingTablaFirmaCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFirmaCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFirmaClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFirmaCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=firmaclienteLogic.getFirmaClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=firmaclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFirmaCliente.setModel(new FirmaClienteModel(this.firmaclienteLogic.getFirmaClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFirmaCliente.setModel(new FirmaClienteModel(this.firmaclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFirmaCliente!=null && this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFirmaCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO,firmaclienteConstantesFunciones.resaltarSeleccionarFirmaCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO,firmaclienteConstantesFunciones.resaltarSeleccionarFirmaCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_ID));

		if(this.firmaclienteConstantesFunciones.mostraridFirmaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FirmaClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.firmaclienteConstantesFunciones.resaltaridFirmaCliente,this.firmaclienteConstantesFunciones.activaridFirmaCliente,this,true,"idFirmaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.firmaclienteConstantesFunciones.resaltaridFirmaCliente,this.firmaclienteConstantesFunciones.activaridFirmaCliente,this,true,"idFirmaCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.firmaclienteConstantesFunciones.mostrarid_empresaFirmaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FirmaClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.firmaclienteConstantesFunciones.resaltarid_empresaFirmaCliente,this,this.firmaclienteConstantesFunciones.activarid_empresaFirmaCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.firmaclienteConstantesFunciones.resaltarid_empresaFirmaCliente,this,this.firmaclienteConstantesFunciones.activarid_empresaFirmaCliente,false,"id_empresaFirmaCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.firmaclienteConstantesFunciones.mostrarid_clienteFirmaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FirmaClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.firmaclienteConstantesFunciones.resaltarid_clienteFirmaCliente,this,this.firmaclienteConstantesFunciones.activarid_clienteFirmaCliente));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.firmaclienteConstantesFunciones.resaltarid_clienteFirmaCliente,this,this.firmaclienteConstantesFunciones.activarid_clienteFirmaCliente,true,"id_clienteFirmaCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN));

		if(this.firmaclienteConstantesFunciones.mostrarid_tipo_imagenFirmaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoImagenTableCell(this.tipoimagensForeignKey,this.firmaclienteConstantesFunciones.resaltarid_tipo_imagenFirmaCliente,this,this.firmaclienteConstantesFunciones.activarid_tipo_imagenFirmaCliente));
			tableColumn.setCellEditor(new TipoImagenTableCell(this.tipoimagensForeignKey,this.firmaclienteConstantesFunciones.resaltarid_tipo_imagenFirmaCliente,this,this.firmaclienteConstantesFunciones.activarid_tipo_imagenFirmaCliente,true,"id_tipo_imagenFirmaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_FIRMA));

		if(this.firmaclienteConstantesFunciones.mostrarfirmaFirmaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FirmaClienteConstantesFunciones.LABEL_FIRMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelImageRenderer(this.firmaclienteConstantesFunciones.resaltarfirmaFirmaCliente,this.firmaclienteConstantesFunciones.activarfirmaFirmaCliente));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.firmaclienteConstantesFunciones.resaltarfirmaFirmaCliente,this.firmaclienteConstantesFunciones.activarfirmaFirmaCliente,this,true,"firmaFirmaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,FirmaClienteConstantesFunciones.LABEL_PATHFIRMA));

		if(this.firmaclienteConstantesFunciones.mostrarpath_firmaFirmaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FirmaClienteConstantesFunciones.LABEL_PATHFIRMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.firmaclienteConstantesFunciones.resaltarpath_firmaFirmaCliente,this.firmaclienteConstantesFunciones.activarpath_firmaFirmaCliente,this,true,"path_firmaFirmaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.firmaclienteConstantesFunciones.resaltarpath_firmaFirmaCliente,this.firmaclienteConstantesFunciones.activarpath_firmaFirmaCliente,this,true,"path_firmaFirmaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FirmaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.firmaclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.firmaclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFirmaCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.firmaclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.firmaclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFirmaCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.firmaclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.firmaclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFirmaCliente.addColumn(tableColumn);
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
			
			this.jTableDatosFirmaCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFirmaCliente.moveColumn(this.jTableDatosFirmaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFirmaCliente.moveColumn(this.jTableDatosFirmaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFirmaCliente.moveColumn(this.jTableDatosFirmaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFirmaCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFirmaCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFirmaCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFirmaCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFirmaCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFirmaCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFirmaCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFirmaCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=firmaclienteLogic.getFirmaClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=firmaclientes.size()-1;
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
		//this.jTableDatosFirmaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFirmaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFirmaCliente();
			
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
				
				//this.isEsNuevoFirmaCliente=false;
					
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
				if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFirmaCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFirmaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFirmaCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.firmacliente.getsType().equals("DUPLICADO")
				   || this.firmacliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFirmaCliente=true;
				
				} else {
					this.isEsNuevoFirmaCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.firmacliente.getId()>=0 && !this.firmacliente.getIsNew()) {						
						this.isEsNuevoFirmaCliente=false;
						
					} else {
						this.isEsNuevoFirmaCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFirmaCliente(esRelaciones);						
				
				this.seleccionarFirmaCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.firmacliente.getId()<0) {
					this.isEsNuevoFirmaCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFirmaCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFirmaCliente(evt,rowIndex);
				}	
				
				if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FirmaCliente: " + this.dDif); 
					}
				}								
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFirmaCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.firmacliente)) {
					if(this.firmacliente.getId()>0) {
						this.firmacliente.setIsDeleted(true);
						
						this.firmaclientesEliminados.add(this.firmacliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.firmaclienteLogic.getFirmaClientes().remove(this.firmacliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.firmaclientes.remove(this.firmacliente);				
					}
					
					
					((FirmaClienteModel) this.jTableDatosFirmaCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFirmaCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFirmaCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFirmaCliente) {
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFirmaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFirmaCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFirmaCliente(this.firmacliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.firmaclienteConstantesFunciones.cargarid_empresaFirmaCliente || this.firmaclienteConstantesFunciones.event_dependid_empresaFirmaCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.firmacliente.getid_empresa());
									//this.inicializarActualizarBindingFirmaCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(firmacliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(firmacliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.firmacliente.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.firmaclienteConstantesFunciones.cargarid_clienteFirmaCliente || this.firmaclienteConstantesFunciones.event_dependid_clienteFirmaCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.firmacliente.getid_cliente());
									//this.inicializarActualizarBindingFirmaCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(firmacliente.getCliente()!=null) {
							this.clientesForeignKey.add(firmacliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.firmacliente.getid_cliente(),false,"Formulario");

					//TipoImagen
					if(!this.firmaclienteConstantesFunciones.cargarid_tipo_imagenFirmaCliente || this.firmaclienteConstantesFunciones.event_dependid_tipo_imagenFirmaCliente) {
						//this.cargarCombosTipoImagensForeignKeyLista(" where id="+this.firmacliente.getid_tipo_imagen());
									//this.inicializarActualizarBindingFirmaCliente(false,false);
						this.tipoimagensForeignKey=new ArrayList<TipoImagen>();

						if(firmacliente.getTipoImagen()!=null) {
							this.tipoimagensForeignKey.add(firmacliente.getTipoImagen());
						}

						this.addItemDefectoCombosForeignKeyTipoImagen();
						this.cargarCombosFrameTipoImagensForeignKey("Todos");
					}
					this.setActualTipoImagenForeignKey(this.firmacliente.getid_tipo_imagen(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFirmaCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFirmaCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFirmaCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFirmaCliente(FirmaCliente firmacliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFirmaCliente(firmacliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFirmaCliente(FirmaCliente firmacliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFirmaCliente(firmacliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFirmaCliente(firmacliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFirmaCliente(firmacliente);
	}
	
	public void setVariablesObjetoActualToFormularioFirmaCliente(FirmaCliente firmacliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setText(firmacliente.getId().toString());


			this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText("Imagen");

			if(firmacliente.getfirma()!=null) {
				this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));

				imageActual=FuncionesSwing.getImageFromBytes((byte[])firmacliente.getfirma());

				if(imageActual!=null) {
					imageIcon=new ImageIcon(imageActual);

					if (imageIcon != null) {
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setIcon(imageIcon);
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText(null);
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.updateUI();
					} else {
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText("Imagen no Encontrada");
					}
				}
			}

			this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setText(firmacliente.getpath_firma());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FirmaCliente firmaclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,firmaclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FirmaCliente firmaclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				firmaclienteLocal=this.firmacliente;
			} else {
				firmaclienteLocal=this.firmaclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(firmaclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFirmaCliente(firmaclienteLocal,true);
					
					if(firmaclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(firmaclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(firmaclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFirmaCliente(FirmaCliente firmacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFirmaCliente(firmacliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(firmacliente);
	}
	
	public void setVariablesFormularioToObjetoActualFirmaCliente(FirmaCliente firmacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFirmaCliente(firmacliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFirmaCliente(FirmaCliente firmacliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.getText()==null || this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.getText()=="" || this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setText("0");
			}

			if(conColumnasBase) {firmacliente.setId(Long.parseLong(this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FirmaClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelIdFirmaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			if(this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.getSelectedFile()!=null){firmacliente.setfirma(FuncionesSwing.getBytesFromFile(this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.getSelectedFile()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FirmaClienteConstantesFunciones.LABEL_FIRMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelfirmaFirmaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			firmacliente.setpath_firma(this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FirmaClienteConstantesFunciones.LABEL_PATHFIRMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFirmaCliente.jLabelpath_firmaFirmaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFirmaCliente(FirmaCliente firmaclienteBean,FirmaCliente firmacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && firmaclienteBean.getid_cliente()!=null && !firmaclienteBean.getid_cliente().equals(-1L))) {firmacliente.setid_cliente(firmaclienteBean.getid_cliente());}
			if(conDefault || (!conDefault && firmaclienteBean.getid_tipo_imagen()!=null && !firmaclienteBean.getid_tipo_imagen().equals(-1L))) {firmacliente.setid_tipo_imagen(firmaclienteBean.getid_tipo_imagen());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFirmaCliente(FirmaCliente firmaclienteOrigen,FirmaCliente firmacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && firmaclienteOrigen.getId()!=null && !firmaclienteOrigen.getId().equals(0L))) {firmacliente.setId(firmaclienteOrigen.getId());}}
			if(conDefault || (!conDefault && firmaclienteOrigen.getid_cliente()!=null && !firmaclienteOrigen.getid_cliente().equals(-1L))) {firmacliente.setid_cliente(firmaclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && firmaclienteOrigen.getid_tipo_imagen()!=null && !firmaclienteOrigen.getid_tipo_imagen().equals(-1L))) {firmacliente.setid_tipo_imagen(firmaclienteOrigen.getid_tipo_imagen());}
			if(conDefault || (!conDefault && firmaclienteOrigen.getfirma()!=null && !firmaclienteOrigen.getfirma().equals(null))) {firmacliente.setfirma(firmaclienteOrigen.getfirma());}
			if(conDefault || (!conDefault && firmaclienteOrigen.getpath_firma()!=null && !firmaclienteOrigen.getpath_firma().equals(""))) {firmacliente.setpath_firma(firmaclienteOrigen.getpath_firma());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFirmaCliente(FirmaCliente firmacliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setText(firmacliente.getId().toString());


			this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText("Imagen");

			if(firmacliente.getfirma()!=null) {
				this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
				this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));

				imageActual=FuncionesSwing.getImageFromBytes((byte[])firmacliente.getfirma());

				if(imageActual!=null) {
					imageIcon=new ImageIcon(imageActual);

					if (imageIcon != null) {
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setIcon(imageIcon);
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText(null);
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.updateUI();
					} else {
						this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText("Imagen no Encontrada");
					}
				}
			}

			this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setText(firmacliente.getpath_firma());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFirmaCliente(FirmaClienteBean firmaclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setText(firmaclienteBean.getId().toString());
			this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setText(firmaclienteBean.getpath_firma());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFirmaCliente(FirmaClienteParameterReturnGeneral firmaclienteReturnGeneral,FirmaClienteBean firmaclienteBean,Boolean conDefault) throws Exception { 
		try {
			FirmaCliente firmaclienteLocal=new FirmaCliente();
			
			firmaclienteLocal=firmaclienteReturnGeneral.getFirmaCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && firmaclienteLocal.getId()!=null && !firmaclienteLocal.getId().equals(0L))) {firmaclienteBean.setId(firmaclienteLocal.getId());}}
			if(conDefault || (!conDefault && firmaclienteLocal.getid_cliente()!=null && !firmaclienteLocal.getid_cliente().equals(-1L))) {firmaclienteBean.setid_cliente(firmaclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && firmaclienteLocal.getid_tipo_imagen()!=null && !firmaclienteLocal.getid_tipo_imagen().equals(-1L))) {firmaclienteBean.setid_tipo_imagen(firmaclienteLocal.getid_tipo_imagen());}
			if(conDefault || (!conDefault && firmaclienteLocal.getpath_firma()!=null && !firmaclienteLocal.getpath_firma().equals(""))) {firmaclienteBean.setpath_firma(firmaclienteLocal.getpath_firma());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFirmaClienteGenerico(Long idFirmaClienteSeleccionado,JComboBox jComboBoxFirmaCliente,List<FirmaCliente> firmaclientesLocal)throws Exception {
		try {
			FirmaCliente  firmaclienteTemp=null;

			for(FirmaCliente firmaclienteAux:firmaclientesLocal) {
				if(firmaclienteAux.getId()!=null && firmaclienteAux.getId().equals(idFirmaClienteSeleccionado)) {
					firmaclienteTemp=firmaclienteAux;
					break;
				}
			}

			jComboBoxFirmaCliente.setSelectedItem(firmaclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFirmaClienteGenerico(JComboBox jComboBoxFirmaCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFirmaCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFirmaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFirmaCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFirmaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFirmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFirmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			firmacliente=(FirmaCliente) firmaclienteLogic.getFirmaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			firmacliente =(FirmaCliente) firmaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!firmacliente.getIsNew() && !firmacliente.getIsChanged() && !firmacliente.getIsDeleted()) {
				sDescripcion=firmacliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=firmacliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!firmacliente.getIsNew() && !firmacliente.getIsChanged() && !firmacliente.getIsDeleted()) {
				sDescripcion=firmacliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=firmacliente.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoImagen")) {
			//sDescripcion=this.getActualTipoImagenForeignKeyDescripcion((Long)value);
			if(!firmacliente.getIsNew() && !firmacliente.getIsChanged() && !firmacliente.getIsDeleted()) {
				sDescripcion=firmacliente.gettipoimagen_descripcion();
			} else {
				//sDescripcion=this.getActualTipoImagenForeignKeyDescripcion((Long)value);
				sDescripcion=firmacliente.gettipoimagen_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FirmaCliente firmaclienteRow=new FirmaCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			firmaclienteRow=(FirmaCliente) firmaclienteLogic.getFirmaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			firmaclienteRow=(FirmaCliente) firmaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFirmaCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoFirmaCliente && this.isPermisoNuevoFirmaCliente));			
			this.jButtonDuplicarFirmaCliente.setVisible((this.isVisibilidadCeldaDuplicarFirmaCliente && this.isPermisoDuplicarFirmaCliente));			
			this.jButtonCopiarFirmaCliente.setVisible((this.isVisibilidadCeldaCopiarFirmaCliente && this.isPermisoCopiarFirmaCliente));
			this.jButtonVerFormFirmaCliente.setVisible((this.isVisibilidadCeldaVerFormFirmaCliente && this.isPermisoVerFormFirmaCliente));
			
			this.jButtonAbrirOrderByFirmaCliente.setVisible((this.isVisibilidadCeldaOrdenFirmaCliente && this.isPermisoOrdenFirmaCliente));			
			
			this.jButtonNuevoRelacionesFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesFirmaCliente && this.isPermisoNuevoFirmaCliente));			
			this.jButtonNuevoGuardarCambiosFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoFirmaCliente && this.isPermisoNuevoFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarFirmaCliente.setVisible((this.isVisibilidadCeldaModificarFirmaCliente && this.isPermisoActualizarFirmaCliente));	
			this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarFirmaCliente.setVisible((this.isVisibilidadCeldaActualizarFirmaCliente && this.isPermisoActualizarFirmaCliente));	
			this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarFirmaCliente.setVisible((this.isVisibilidadCeldaEliminarFirmaCliente && this.isPermisoEliminarFirmaCliente));
			this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarFirmaCliente.setVisible(this.isVisibilidadCeldaCancelarFirmaCliente);							
			this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoFirmaCliente && this.isPermisoNuevoFirmaCliente));						
			this.jButtonDuplicarToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaDuplicarFirmaCliente && this.isPermisoDuplicarFirmaCliente));						
			this.jButtonCopiarToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaCopiarFirmaCliente && this.isPermisoCopiarFirmaCliente));			
			this.jButtonVerFormToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaVerFormFirmaCliente && this.isPermisoVerFormFirmaCliente));			
			this.jButtonAbrirOrderByToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaOrdenFirmaCliente && this.isPermisoOrdenFirmaCliente));
			this.jButtonNuevoRelacionesToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesFirmaCliente && this.isPermisoNuevoFirmaCliente));			
			this.jButtonNuevoGuardarCambiosToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoFirmaCliente && this.isPermisoNuevoFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));			
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaModificarFirmaCliente && this.isPermisoActualizarFirmaCliente));	
			this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaActualizarFirmaCliente  && this.isPermisoActualizarFirmaCliente));	
			this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaEliminarFirmaCliente && this.isPermisoEliminarFirmaCliente));
			this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarToolBarFirmaCliente.setVisible(this.isVisibilidadCeldaCancelarFirmaCliente);				
			this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoFirmaCliente && this.isPermisoNuevoFirmaCliente));			
			this.jMenuItemDuplicarFirmaCliente.setVisible((this.isVisibilidadCeldaDuplicarFirmaCliente && this.isPermisoDuplicarFirmaCliente));			
			this.jMenuItemCopiarFirmaCliente.setVisible((this.isVisibilidadCeldaCopiarFirmaCliente && this.isPermisoCopiarFirmaCliente));			
			this.jMenuItemVerFormFirmaCliente.setVisible((this.isVisibilidadCeldaVerFormFirmaCliente && this.isPermisoVerFormFirmaCliente));			
			this.jMenuItemAbrirOrderByFirmaCliente.setVisible((this.isVisibilidadCeldaOrdenFirmaCliente && this.isPermisoOrdenFirmaCliente));			
			//this.jMenuItemMostrarOcultarFirmaCliente.setVisible((this.isVisibilidadCeldaOrdenFirmaCliente && this.isPermisoOrdenFirmaCliente));
			this.jMenuItemDetalleAbrirOrderByFirmaCliente.setVisible((this.isVisibilidadCeldaOrdenFirmaCliente && this.isPermisoOrdenFirmaCliente));			
			//this.jMenuItemDetalleMostrarOcultarFirmaCliente.setVisible((this.isVisibilidadCeldaOrdenFirmaCliente && this.isPermisoOrdenFirmaCliente));			
			this.jMenuItemNuevoRelacionesFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesFirmaCliente && this.isPermisoNuevoFirmaCliente));			
			this.jMenuItemNuevoGuardarCambiosFirmaCliente.setVisible((this.isVisibilidadCeldaNuevoFirmaCliente && this.isPermisoNuevoFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));									
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemModificarFirmaCliente.setVisible((this.isVisibilidadCeldaModificarFirmaCliente && this.isPermisoActualizarFirmaCliente));	
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemActualizarFirmaCliente.setVisible((this.isVisibilidadCeldaActualizarFirmaCliente && this.isPermisoActualizarFirmaCliente));	
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemEliminarFirmaCliente.setVisible((this.isVisibilidadCeldaEliminarFirmaCliente && this.isPermisoEliminarFirmaCliente));
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemCancelarFirmaCliente.setVisible(this.isVisibilidadCeldaCancelarFirmaCliente);				
			}
			
			this.jMenuItemGuardarCambiosFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));						
			this.jMenuItemGuardarCambiosTablaFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFirmaCliente=this.jButtonNuevoFirmaCliente.isVisible();
			this.isVisibilidadCeldaDuplicarFirmaCliente=this.jButtonDuplicarFirmaCliente.isVisible();
			this.isVisibilidadCeldaCopiarFirmaCliente=this.jButtonCopiarFirmaCliente.isVisible();
			this.isVisibilidadCeldaVerFormFirmaCliente=this.jButtonVerFormFirmaCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenFirmaCliente=this.jButtonAbrirOrderByFirmaCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=this.jButtonNuevoRelacionesFirmaCliente.isVisible();
			this.isVisibilidadCeldaModificarFirmaCliente=this.jButtonModificarFirmaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.isVisibilidadCeldaActualizarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarFirmaCliente.isVisible();
			this.isVisibilidadCeldaEliminarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarFirmaCliente.isVisible();
			this.isVisibilidadCeldaCancelarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarFirmaCliente.isVisible();
			this.isVisibilidadCeldaGuardarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=this.jButtonGuardarCambiosTablaFirmaCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFirmaCliente=this.jButtonNuevoToolBarFirmaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=this.jButtonNuevoRelacionesToolBarFirmaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.isVisibilidadCeldaModificarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarToolBarFirmaCliente.isVisible();
			this.isVisibilidadCeldaActualizarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarToolBarFirmaCliente.isVisible();
			this.isVisibilidadCeldaEliminarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarToolBarFirmaCliente.isVisible();
			this.isVisibilidadCeldaCancelarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarToolBarFirmaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFirmaCliente=this.jButtonGuardarCambiosToolBarFirmaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=this.jButtonGuardarCambiosTablaToolBarFirmaCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFirmaCliente=this.jMenuItemNuevoFirmaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=this.jMenuItemNuevoRelacionesFirmaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.isVisibilidadCeldaModificarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jMenuItemModificarFirmaCliente.isVisible();
			this.isVisibilidadCeldaActualizarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jMenuItemActualizarFirmaCliente.isVisible();
			this.isVisibilidadCeldaEliminarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jMenuItemEliminarFirmaCliente.isVisible();
			this.isVisibilidadCeldaCancelarFirmaCliente=this.jInternalFrameDetalleFormFirmaCliente.jMenuItemCancelarFirmaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFirmaCliente=this.jMenuItemGuardarCambiosFirmaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=this.jMenuItemGuardarCambiosTablaFirmaCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFirmaCliente(Boolean esInicializar) {
		if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFirmaCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualFirmaCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFirmaCliente() {
		this.jButtonNuevoFirmaCliente.setVisible(this.isPermisoNuevoFirmaCliente);			
		this.jButtonDuplicarFirmaCliente.setVisible(this.isPermisoDuplicarFirmaCliente);			
		this.jButtonCopiarFirmaCliente.setVisible(this.isPermisoCopiarFirmaCliente);			
		this.jButtonVerFormFirmaCliente.setVisible(this.isPermisoVerFormFirmaCliente);			
		
		this.jButtonAbrirOrderByFirmaCliente.setVisible(this.isPermisoOrdenFirmaCliente);					
		
		this.jButtonNuevoRelacionesFirmaCliente.setVisible(this.isPermisoNuevoFirmaCliente);			
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarFirmaCliente.setVisible(this.isPermisoActualizarFirmaCliente);	
			this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarFirmaCliente.setVisible(this.isPermisoActualizarFirmaCliente);	
			this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarFirmaCliente.setVisible(this.isPermisoEliminarFirmaCliente);
			this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarFirmaCliente.setVisible(this.isVisibilidadCeldaCancelarFirmaCliente);						
			this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.setVisible(this.isPermisoGuardarCambiosFirmaCliente);							
		}
		
		this.jButtonGuardarCambiosTablaFirmaCliente.setVisible(this.isPermisoActualizarFirmaCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFirmaCliente() {
		this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarFirmaCliente.setVisible(this.isPermisoActualizarFirmaCliente);	
		this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarFirmaCliente.setVisible(this.isPermisoActualizarFirmaCliente);	
		this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarFirmaCliente.setVisible(this.isPermisoEliminarFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarFirmaCliente.setVisible(this.isVisibilidadCeldaCancelarFirmaCliente);							
		this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.setVisible((this.isVisibilidadCeldaGuardarFirmaCliente && this.isPermisoGuardarCambiosFirmaCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFirmaCliente() {
		if(FirmaClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFirmaCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFirmaCliente() {
	}
	
	public void jTableDatosFirmaClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFirmaCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFirmaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.firmacliente==null) {
						this.firmacliente = new FirmaCliente();
					}

					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				}

				if(this.firmacliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.firmacliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFirmaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFirmaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFirmaCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFirmaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFirmaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.firmaclienteLogic.getConnexion());

				if(this.firmacliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.firmacliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFirmaCliente=(TitledBorder)this.jScrollPanelDatosFirmaCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFirmaCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFirmaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.firmacliente==null) {
						this.firmacliente = new FirmaCliente();
					}

					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				}

				if(this.firmacliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.firmacliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFirmaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteFirmaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderFirmaCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosFirmaCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderFirmaCliente=(TitledBorder)this.jScrollPanelDatosFirmaCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderFirmaCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteFirmaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebFirmaCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFirmaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFirmaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.firmaclienteLogic.getConnexion());

				if(this.firmacliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.firmacliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFirmaCliente=(TitledBorder)this.jScrollPanelDatosFirmaCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderFirmaCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteFirmaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.firmacliente==null) {
						this.firmacliente = new FirmaCliente();
					}

					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				}

				if(this.firmacliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.firmacliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFirmaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_imagenFirmaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoimagen=true;

			idTienePermisotipoimagen=this.tienePermisosUsuarioEnPaginaWebFirmaCliente(TipoImagenConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoimagen) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFirmaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFirmaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);

				this.tipoimagenBeanSwingJInternalFrame=new TipoImagenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoimagenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoimagenBeanSwingJInternalFrame.getTipoImagenLogic().setConnexion(this.firmaclienteLogic.getConnexion());

				if(this.firmacliente.getid_tipo_imagen()!=null) {
					this.tipoimagenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoimagenBeanSwingJInternalFrame.setIdActual(this.firmacliente.getid_tipo_imagen());
					this.tipoimagenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoimagenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoimagenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoImagen();
				}

				JInternalFrameBase jinternalFrame =this.tipoimagenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFirmaCliente=(TitledBorder)this.jScrollPanelDatosFirmaCliente.getBorder();
				TitledBorder titledBordertipoimagen=(TitledBorder)this.tipoimagenBeanSwingJInternalFrame.jScrollPanelDatosTipoImagen.getBorder();

				titledBordertipoimagen.setTitle(titledBorderFirmaCliente.getTitle() + " -> Tipo Imagen");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_imagenFirmaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.firmacliente==null) {
						this.firmacliente = new FirmaCliente();
					}

					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				}

				if(this.firmacliente.getid_tipo_imagen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_imagen = "+this.firmacliente.getid_tipo_imagen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFirmaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfirmaFirmaClienteActionPerformed(java.awt.event.ActionEvent evt) {
		try {


			this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
			this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));
			this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*2,Constantes2.ISWING_ALTO_CONTROL_LABEL*8));

			Image imageActual=null;
			int iReturnArchivo = this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.showOpenDialog(this);

			if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
				imageActual=ImageIO.read(this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.getSelectedFile()).getScaledInstance(this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.getWidth(), this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.getHeight(), Image.SCALE_DEFAULT);

				if (imageActual != null) {
					this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setIcon(new ImageIcon(imageActual));
					this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.setText(null);
					this.jInternalFrameDetalleFormFirmaCliente.jLabelImagenfirmaFirmaCliente.updateUI();
				}
			}
		} catch(Exception e) {
			;
		}
	}

	public void jButtonDescargarfirmaFirmaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception  {
		try {


			String sPathDir=this.parametroGeneralUsuario.getpath_exportar()+FirmaClienteConstantesFunciones.CLASSNAME;
			String sPathFile=sPathDir+"/"+this.firmacliente.getId()+"."+Funciones2.getExtensionTipoImagen(this.firmacliente.getid_tipo_imagen());
			File dir = new File(sPathDir);

			if (!dir.exists()) {
				dir.mkdirs();
			}

			FileOutputStream fileOuputStream =  new FileOutputStream(sPathFile);
			fileOuputStream.write(this.firmacliente.getfirma());
			fileOuputStream.close();

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO &&
				JOptionPane.showMessageDialog(this,"DESCARGADO CORRECTAMENTE:"+sPathFile,"MANTENIMIENTO DE FirmaCliente",JOptionPane.INFORMATION_MESSAGE);
			}

	} catch(Exception e) {
			throw e;
		}
	}

	public void jButtonfirmaFirmaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.firmacliente==null) {
						this.firmacliente = new FirmaCliente();
					}

					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				}

				if(this.firmacliente.getfirma()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where firma = "+this.firmacliente.getfirma().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFirmaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpath_firmaFirmaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.getfirmacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.firmacliente==null) {
						this.firmacliente = new FirmaCliente();
					}

					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);
				}

				if(this.firmacliente.getpath_firma()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where path_firma like '%"+this.firmacliente.getpath_firma()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFirmaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteFirmaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFirmaCliente(false,false);

			this.getFirmaClientesFK_IdCliente();

			this.inicializarActualizarBindingFirmaCliente(false);

			//if(FirmaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFirmaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFirmaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFirmaCliente(false,false);

			this.getFirmaClientesFK_IdEmpresa();

			this.inicializarActualizarBindingFirmaCliente(false);

			//if(FirmaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFirmaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoImagenFirmaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFirmaCliente(false,false);

			this.getFirmaClientesFK_IdTipoImagen();

			this.inicializarActualizarBindingFirmaCliente(false);

			//if(FirmaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFirmaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.firmaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFirmaCliente() {
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
			this.jInternalFrameDetalleFormFirmaCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormFirmaCliente.dispose();
			this.jInternalFrameDetalleFormFirmaCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
			this.jInternalFrameReporteDinamicoFirmaCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFirmaCliente.dispose();
			this.jInternalFrameReporteDinamicoFirmaCliente=null;
		}
		
		if(this.jInternalFrameImportacionFirmaCliente!=null) {
			this.jInternalFrameImportacionFirmaCliente.setVisible(false);	    			
			this.jInternalFrameImportacionFirmaCliente.dispose();
			this.jInternalFrameImportacionFirmaCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFirmaCliente();
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFirmaCliente")) {
				jButtonDuplicarFirmaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFirmaCliente")) {
				jButtonCopiarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormFirmaCliente")) {
				jButtonVerFormFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFirmaCliente")) {
				jButtonDuplicarFirmaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFirmaCliente")) {
				jButtonDuplicarFirmaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFirmaCliente")) {
				jButtonModificarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFirmaCliente")) {
				jButtonModificarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFirmaCliente")) {
				jButtonModificarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFirmaCliente")) {
				jButtonActualizarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFirmaCliente")) {
				jButtonActualizarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFirmaCliente")) {
				jButtonActualizarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarFirmaCliente")) {
				jButtonEliminarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFirmaCliente")) {
				jButtonEliminarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFirmaCliente")) {
				jButtonEliminarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarFirmaCliente")) {
				jButtonCancelarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFirmaCliente")) {
				jButtonCancelarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFirmaCliente")) {
				jButtonCancelarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarFirmaCliente")) {
				jButtonCerrarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFirmaCliente")) {
				jButtonCerrarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFirmaCliente")) {
				jButtonCerrarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFirmaCliente")) {
				jButtonMostrarOcultarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFirmaCliente")) {
				jButtonCancelarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFirmaCliente")) {
				jButtonCopiarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFirmaCliente")) {
				jButtonVerFormFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFirmaCliente")) {
				jButtonCopiarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFirmaCliente")) {
				jButtonVerFormFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFirmaCliente")) {
				jButtonRecargarInformacionFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFirmaCliente")) {
				jButtonRecargarInformacionFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFirmaCliente")) {
				jButtonRecargarInformacionFirmaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFirmaCliente")) {
				jButtonAnterioresFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFirmaCliente")) {
				jButtonAnterioresFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFirmaCliente")) {
				jButtonAnterioresFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFirmaCliente")) {
				jButtonSiguientesFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFirmaCliente")) {
				jButtonSiguientesFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFirmaCliente")) {
				jButtonSiguientesFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFirmaCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByFirmaCliente")) {
				jButtonAbrirOrderByFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFirmaCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarFirmaCliente")) {
				jButtonMostrarOcultarFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFirmaCliente")) {
				jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFirmaCliente")) {
				jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFirmaCliente")) {
				jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFirmaCliente")) {
				jButtonCerrarReporteDinamicoFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFirmaCliente")) {
				jButtonGenerarReporteDinamicoFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFirmaCliente")) {
				
				jButtonGenerarExcelReporteDinamicoFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFirmaCliente")) {
				jButtonCerrarImportacionFirmaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFirmaCliente")) {
				
				jButtonGenerarImportacionFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFirmaCliente")) {
				
				jButtonAbrirImportacionFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFirmaCliente")) {
				jComboBoxTiposAccionesFirmaClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFirmaCliente")) {
				jComboBoxTiposRelacionesFirmaClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFirmaCliente")) {
				jComboBoxTiposAccionesFirmaClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFirmaCliente")) {
				
				jComboBoxTiposSeleccionarFirmaClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFirmaCliente")) {
				jTextFieldValorCampoGeneralFirmaClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFirmaCliente")) {
				jButtonAbrirOrderByFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFirmaCliente")) {
				jButtonAbrirOrderByFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFirmaCliente")) {
				jButtonCerrarOrderByFirmaClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFirmaClienteBusqueda")) {
				this.jButtonidFirmaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFirmaClienteUpdate")) {
				this.jButtonid_empresaFirmaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFirmaClienteBusqueda")) {
				this.jButtonid_empresaFirmaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteFirmaCliente")) {
				this.jButtonid_clienteFirmaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFirmaClienteUpdate")) {
				this.jButtonid_clienteFirmaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFirmaClienteBusqueda")) {
				this.jButtonid_clienteFirmaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_imagenFirmaClienteUpdate")) {
				this.jButtonid_tipo_imagenFirmaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_imagenFirmaClienteBusqueda")) {
				this.jButtonid_tipo_imagenFirmaClienteBusquedaActionPerformed(evt);
			}
			//ABRIR BUSQUEDA ARCHIVO CAMPO
			
			else if(sTipo.equals("firmaFirmaCliente")) {
				this.jButtonfirmaFirmaClienteActionPerformed(evt);
			}
			
			//DESCARGAR ARCHIVO CAMPO
			else if(sTipo.equals("DescargarfirmaFirmaCliente")) {
				this.jButtonDescargarfirmaFirmaClienteActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("firmaFirmaClienteBusqueda")) {
				this.jButtonfirmaFirmaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("path_firmaFirmaClienteBusqueda")) {
				this.jButtonpath_firmaFirmaClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteFirmaCliente")) {
				this.jButtonid_clienteFirmaClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteFirmaCliente")) {
				this.jButtonFK_IdClienteFirmaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoImagenFirmaCliente")) {
				this.jButtonFK_IdTipoImagenFirmaClienteActionPerformed(evt);
			}
			
			;
			
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFirmaCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FirmaCliente firmaclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				firmaclienteLocal=this.firmacliente;
			} else {
				firmaclienteLocal=this.firmaclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
							
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
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
			
			


			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
								
						
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
								
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
							
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
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
			
			


			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
								
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFirmaCliente")) {
					jCheckBoxSeleccionarTodosFirmaClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFirmaCliente")) {
					jCheckBoxSeleccionadosFirmaClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFirmaCliente")) {
					
				}
				
				


				
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
												
				
				


				
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
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
			
			


			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFirmaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.firmacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.firmacliente);
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
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
				
				


				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FirmaCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FirmaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFirmaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.firmaclienteAnterior =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFirmaCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFirmaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFirmaCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.firmacliente =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.firmacliente =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.firmacliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFirmaCliente")) {
				
				}
				
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFirmaCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFirmaCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFirmaCliente")) {
			
			}
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFirmaCliente();
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			if(sTipo.equals("NuevoFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFirmaCliente")) {
				jButtonDuplicarFirmaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFirmaCliente")) {
				jButtonCopiarFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFirmaCliente")) {
				jButtonVerFormFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFirmaCliente")) {
				jButtonNuevoFirmaClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFirmaCliente")) {
				jButtonModificarFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFirmaCliente")) {
				jButtonActualizarFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFirmaCliente")) {
				jButtonEliminarFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFirmaCliente")) {
				jButtonCancelarFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFirmaCliente")) {
				jButtonCerrarFirmaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFirmaCliente")) {
				jButtonGuardarCambiosFirmaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFirmaCliente")) {
				jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFirmaCliente")) {
				jButtonAbrirOrderByFirmaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFirmaCliente")) {
				jButtonRecargarInformacionFirmaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFirmaCliente")) {
				jButtonAnterioresFirmaClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFirmaCliente")) {
				jButtonSiguientesFirmaClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFirmaClienteBusqueda")) {
				this.jButtonidFirmaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFirmaClienteUpdate")) {
				this.jButtonid_empresaFirmaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFirmaClienteBusqueda")) {
				this.jButtonid_empresaFirmaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteFirmaCliente")) {
				this.jButtonid_clienteFirmaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFirmaClienteUpdate")) {
				this.jButtonid_clienteFirmaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFirmaClienteBusqueda")) {
				this.jButtonid_clienteFirmaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_imagenFirmaClienteUpdate")) {
				this.jButtonid_tipo_imagenFirmaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_imagenFirmaClienteBusqueda")) {
				this.jButtonid_tipo_imagenFirmaClienteBusquedaActionPerformed(evt);
			}
			//ABRIR BUSQUEDA ARCHIVO CAMPO
			
			else if(sTipo.equals("firmaFirmaCliente")) {
				this.jButtonfirmaFirmaClienteActionPerformed(evt);
			}
			
			//DESCARGAR ARCHIVO CAMPO
			else if(sTipo.equals("DescargarfirmaFirmaCliente")) {
				this.jButtonDescargarfirmaFirmaClienteActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("firmaFirmaClienteBusqueda")) {
				this.jButtonfirmaFirmaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("path_firmaFirmaClienteBusqueda")) {
				this.jButtonpath_firmaFirmaClienteBusquedaActionPerformed(evt);
			}
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFirmaCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFirmaCliente")) {
				closingInternalFrameFirmaCliente();
				
			} else if(sTipo.equals("jButtonCancelarFirmaCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormFirmaCliente = (JInternalFrameBase)evt.getSource();
	            	
	            FirmaClienteBeanSwingJInternalFrame jInternalFrameParent=(FirmaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormFirmaCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFirmaClienteActionPerformed(null);
			}
			
			FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.firmacliente,new Object(),this.firmaclienteParameterGeneral,this.firmaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFirmaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFirmaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFirmaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.firmacliente)) {
			if(!esControlTabla) {
				if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);			
				}
				
				if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFirmaCliente(this.firmacliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.firmaclienteReturnGeneral=firmaclienteLogic.procesarEventosFirmaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.firmaclienteLogic.getFirmaClientes(),this.firmacliente,this.firmaclienteParameterGeneral,this.isEsNuevoFirmaCliente,classes);//this.firmaclienteLogic.getFirmaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFirmaCliente(this.firmaclienteReturnGeneral,this.firmaclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFirmaCliente(classes,this.firmaclienteReturnGeneral,this.firmaclienteBean,false);
					}
						
					if(this.firmaclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente());	
					}
						
					if(this.firmaclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente(),classes);//this.firmaclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFirmaCliente(this.firmacliente,classes);//this.firmaclienteBean);									
				}
			
				if(FirmaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFirmaCliente(this.firmacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFirmaCliente(this.firmacliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.firmaclienteAnterior!=null) {
						this.firmacliente=this.firmaclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.firmaclienteReturnGeneral=firmaclienteLogic.procesarEventosFirmaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.firmaclienteLogic.getFirmaClientes(),this.firmacliente,this.firmaclienteParameterGeneral,this.isEsNuevoFirmaCliente,classes);//this.firmaclienteLogic.getFirmaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.firmaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.firmaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.firmaclienteReturnGeneral.getFirmaCliente(),firmaclienteLogic.getFirmaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.firmaclienteReturnGeneral.getFirmaCliente(),this.firmaclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFirmaCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosFirmaCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFirmaCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosFirmaCliente() throws Exception {
		
		FirmaClienteModel firmaclienteModel=(FirmaClienteModel)this.jTableDatosFirmaCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			firmaclienteModel.firmaclientes=this.firmaclienteLogic.getFirmaClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			firmaclienteModel.firmaclientes=this.firmaclientes;
		}
		
		
		((FirmaClienteModel) this.jTableDatosFirmaCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFirmaCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfirmaclienteAnterior(),this.firmaclienteLogic.getFirmaClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfirmaclienteAnterior(),this.firmaclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFirmaCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFirmaCliente(FirmaCliente firmacliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
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
										
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.firmacliente,new Object(),generalEntityParameterGeneral,this.firmaclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.firmaclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FirmaClienteConstantesFunciones.getClassesRelationshipsOfFirmaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FirmaClienteConstantesFunciones.getClassesRelationshipsFromStringsOfFirmaCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFirmaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FirmaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.firmacliente,new Object(),generalEntityParameterGeneral,this.firmaclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFirmaCliente(FirmaClienteBean firmaclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFirmaCliente(ArrayList<Classe> classes,FirmaClienteReturnGeneral firmaclienteReturnGeneral,FirmaClienteBean firmaclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFirmaCliente(FirmaCliente firmacliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.firmacliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFirmaCliente = new FirmaClienteDetalleFormJInternalFrame(jDesktopPane,this.firmaclienteSessionBean.getConGuardarRelaciones(),this.firmaclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.setVisible(false);
		this.jInternalFrameDetalleFormFirmaCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormFirmaCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFirmaCliente.firmaclienteLogic=this.firmaclienteLogic;
		
		this.cargarCombosFrameForeignKeyFirmaCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFirmaCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFirmaCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFirmaCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFirmaCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFirmaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFirmaCliente"));
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarFirmaCliente.addActionListener(new ButtonActionListener(this,"ModificarFirmaCliente"));

		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarFirmaCliente"));
					
		this.jInternalFrameDetalleFormFirmaCliente.jMenuItemModificarFirmaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarFirmaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarFirmaCliente.addActionListener (new ButtonActionListener(this,"ActualizarFirmaCliente"));
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFirmaCliente"));
						
		this.jInternalFrameDetalleFormFirmaCliente.jMenuItemActualizarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFirmaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarFirmaCliente.addActionListener (new ButtonActionListener(this,"EliminarFirmaCliente"));
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarFirmaCliente"));
								
		this.jInternalFrameDetalleFormFirmaCliente.jMenuItemEliminarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFirmaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarFirmaCliente.addActionListener (new ButtonActionListener(this,"CancelarFirmaCliente"));
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarFirmaCliente"));
					
		this.jInternalFrameDetalleFormFirmaCliente.jMenuItemCancelarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFirmaCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jMenuItemDetalleCerrarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFirmaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFirmaCliente"));
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFirmaCliente"));
		
		
		
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFirmaCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonidFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idFirmaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_empresaFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_empresaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFirmaClienteBusqueda"));
		//jButtonid_clienteFirmaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteFirmaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaCliente.addActionListener(new ButtonActionListener(this,"id_clienteFirmaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFirmaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_tipo_imagenFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagenFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_tipo_imagenFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagenFirmaClienteBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormFirmaCliente.jButtonfirmaFirmaCliente.addActionListener(new ButtonActionListener(this,"firmaFirmaCliente"));
		this.jInternalFrameDetalleFormFirmaCliente.jButtonDescargarfirmaFirmaCliente.addActionListener(new ButtonActionListener(this,"DescargarfirmaFirmaCliente"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonfirmaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"firmaFirmaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonpath_firmaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"path_firmaFirmaClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFirmaCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFirmaCliente"));
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFirmaCliente"));
		}
		
		this.jTableDatosFirmaCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFirmaCliente"));
		
		this.jTableDatosFirmaCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFirmaCliente"));
		
		this.jButtonNuevoFirmaCliente.addActionListener(new ButtonActionListener(this,"NuevoFirmaCliente"));
		
		this.jButtonDuplicarFirmaCliente.addActionListener(new ButtonActionListener(this,"DuplicarFirmaCliente"));
		
		this.jButtonCopiarFirmaCliente.addActionListener(new ButtonActionListener(this,"CopiarFirmaCliente"));
		
		this.jButtonVerFormFirmaCliente.addActionListener(new ButtonActionListener(this,"VerFormFirmaCliente"));
		
		
		this.jButtonNuevoToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarFirmaCliente"));
			
		this.jButtonDuplicarToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFirmaCliente"));
			
		this.jMenuItemNuevoFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFirmaCliente"));
			
		this.jMenuItemDuplicarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFirmaCliente"));		
		
		
		this.jButtonNuevoRelacionesFirmaCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFirmaCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFirmaCliente"));
			
		this.jMenuItemNuevoRelacionesFirmaCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFirmaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarFirmaCliente.addActionListener(new ButtonActionListener(this,"ModificarFirmaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonModificarToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarFirmaCliente"));
			
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemModificarFirmaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarFirmaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarFirmaCliente.addActionListener (new ButtonActionListener(this,"ActualizarFirmaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonActualizarToolBarFirmaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFirmaCliente"));
				
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemActualizarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFirmaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarFirmaCliente.addActionListener (new ButtonActionListener(this,"EliminarFirmaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonEliminarToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarFirmaCliente"));
						
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemEliminarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFirmaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarFirmaCliente.addActionListener (new ButtonActionListener(this,"CancelarFirmaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonCancelarToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarFirmaCliente"));
			
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemCancelarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFirmaCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFirmaCliente"));		
		
		
		this.jButtonCerrarFirmaCliente.addActionListener (new ButtonActionListener(this,"CerrarFirmaCliente"));
		
		
		this.jButtonCerrarToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarFirmaCliente"));
			
		this.jMenuItemCerrarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFirmaCliente"));
			
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jMenuItemDetalleCerrarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFirmaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosFirmaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFirmaCliente"));
		}
		
		this.jButtonCopiarToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarFirmaCliente"));
			
		this.jButtonVerFormToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarFirmaCliente"));
		
		this.jMenuItemGuardarCambiosFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFirmaCliente"));
			
		this.jMenuItemCopiarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFirmaCliente"));		
		
		this.jMenuItemVerFormFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFirmaCliente"));		
		
		
		this.jButtonGuardarCambiosTablaFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFirmaCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFirmaCliente"));
			
		this.jMenuItemGuardarCambiosTablaFirmaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFirmaCliente"));		
		
		
		
		this.jButtonRecargarInformacionFirmaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionFirmaCliente"));
					
		this.jButtonRecargarInformacionToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFirmaCliente"));
		
		this.jMenuItemRecargarInformacionFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFirmaCliente"));		
		
		
		
		this.jButtonAnterioresFirmaCliente.addActionListener (new ButtonActionListener(this,"AnterioresFirmaCliente"));
		
		
		this.jButtonAnterioresToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFirmaCliente"));
		
		this.jMenuItemAnterioresFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFirmaCliente"));		
		
		
		this.jButtonSiguientesFirmaCliente.addActionListener (new ButtonActionListener(this,"SiguientesFirmaCliente"));
		
		
		this.jButtonSiguientesToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFirmaCliente"));
			
		this.jMenuItemSiguientesFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFirmaCliente"));
			
		this.jMenuItemAbrirOrderByFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFirmaCliente"));
			
		this.jMenuItemMostrarOcultarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFirmaCliente"));
			
		this.jMenuItemDetalleAbrirOrderByFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFirmaCliente"));
			
		this.jMenuItemDetalleMostarOcultarFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFirmaCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosFirmaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFirmaCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFirmaCliente"));
			
		this.jMenuItemNuevoGuardarCambiosFirmaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFirmaCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFirmaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFirmaCliente"));

		this.jCheckBoxSeleccionadosFirmaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFirmaCliente"));
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFirmaCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesFirmaCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesFirmaCliente"));
			
		this.jComboBoxTiposAccionesFirmaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFirmaCliente"));
					
		this.jComboBoxTiposSeleccionarFirmaCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFirmaCliente"));
			
		this.jTextFieldValorCampoGeneralFirmaCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFirmaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonidFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idFirmaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_empresaFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_empresaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFirmaClienteBusqueda"));
		//jButtonid_clienteFirmaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteFirmaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaCliente.addActionListener(new ButtonActionListener(this,"id_clienteFirmaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFirmaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_tipo_imagenFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagenFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_tipo_imagenFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagenFirmaClienteBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormFirmaCliente.jButtonfirmaFirmaCliente.addActionListener(new ButtonActionListener(this,"firmaFirmaCliente"));
		this.jInternalFrameDetalleFormFirmaCliente.jButtonDescargarfirmaFirmaCliente.addActionListener(new ButtonActionListener(this,"DescargarfirmaFirmaCliente"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonfirmaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"firmaFirmaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonpath_firmaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"path_firmaFirmaClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteFirmaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteFirmaCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.addActionListener(new ButtonActionListener(this,"id_clienteFirmaCliente"));

			this.jButtonFK_IdTipoImagenFirmaCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoImagenFirmaCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFirmaCliente!=null) {
				this.jInternalFrameReporteDinamicoFirmaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFirmaCliente"));
				this.jInternalFrameReporteDinamicoFirmaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFirmaCliente"));
				this.jInternalFrameReporteDinamicoFirmaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFirmaCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoFirmaCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFirmaCliente"));				
			//this.jButtonGenerarReporteDinamicoFirmaCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFirmaCliente"));
			//this.jButtonGenerarExcelReporteDinamicoFirmaCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFirmaCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFirmaCliente!=null) {
				this.jInternalFrameImportacionFirmaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFirmaCliente"));
				this.jInternalFrameImportacionFirmaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFirmaCliente"));
				this.jInternalFrameImportacionFirmaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFirmaCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFirmaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByFirmaCliente"));
			
			this.jButtonAbrirOrderByToolBarFirmaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFirmaCliente"));			
			
			if(this.jInternalFrameOrderByFirmaCliente!=null) {
				this.jInternalFrameOrderByFirmaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFirmaCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFirmaCliente.jTabbedPaneRelacionesFirmaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFirmaCliente"));
		
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
            		closingInternalFrameFirmaCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFirmaCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFirmaCliente = (JInternalFrameBase)event.getSource();
	            	
	            FirmaClienteBeanSwingJInternalFrame jInternalFrameParent=(FirmaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormFirmaCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFirmaClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFirmaCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFirmaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFirmaCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFirmaCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFirmaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFirmaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFirmaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFirmaCliente";
		inputMap = this.jButtonNuevoFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFirmaClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFirmaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFirmaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFirmaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFirmaCliente";
		inputMap = this.jButtonNuevoRelacionesFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFirmaClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFirmaCliente";
		inputMap = this.jButtonModificarFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFirmaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFirmaCliente";
		inputMap = this.jButtonActualizarFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFirmaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFirmaCliente";
		inputMap = this.jButtonEliminarFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFirmaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFirmaCliente";
		inputMap = this.jButtonCancelarFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFirmaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFirmaCliente";
		inputMap = this.jButtonCerrarFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFirmaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFirmaCliente";
		inputMap = this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFirmaCliente.jButtonGuardarCambiosFirmaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFirmaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFirmaCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFirmaClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFirmaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFirmaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFirmaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFirmaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFirmaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFirmaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonidFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idFirmaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_empresaFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_empresaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFirmaClienteBusqueda"));
		//jButtonid_clienteFirmaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteFirmaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaCliente.addActionListener(new ButtonActionListener(this,"id_clienteFirmaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFirmaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_tipo_imagenFirmaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_imagenFirmaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonid_tipo_imagenFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_imagenFirmaClienteBusqueda"));
		//ABRIR BUSQUEDA ARCHIVO CAMPO
		this.jInternalFrameDetalleFormFirmaCliente.jButtonfirmaFirmaCliente.addActionListener(new ButtonActionListener(this,"firmaFirmaCliente"));
		this.jInternalFrameDetalleFormFirmaCliente.jButtonDescargarfirmaFirmaCliente.addActionListener(new ButtonActionListener(this,"DescargarfirmaFirmaCliente"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonfirmaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"firmaFirmaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFirmaCliente.jButtonpath_firmaFirmaClienteBusqueda.addActionListener(new ButtonActionListener(this,"path_firmaFirmaClienteBusqueda"));
		
		
		this.jButtonFK_IdClienteFirmaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteFirmaCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.addActionListener(new ButtonActionListener(this,"id_clienteFirmaCliente"));

		this.jButtonFK_IdTipoImagenFirmaCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoImagenFirmaCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFirmaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFirmaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFirmaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFirmaCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFirmaCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
					firmaclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FirmaCliente firmaclienteAux:firmaclientes) {
					firmaclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFirmaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFirmaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
						firmaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FirmaCliente firmaclienteAux:firmaclientes) {
						firmaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FirmaCliente firmaclienteAux:firmaclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFirmaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFirmaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFirmaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFirmaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFirmaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFirmaCliente.getSelectedRows();
			
			FirmaCliente firmaclienteLocal=new FirmaCliente();
			
			//this.seleccionarTodosFirmaCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					firmaclienteLocal =(FirmaCliente) this.firmaclienteLogic.getFirmaClientes().toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					firmaclienteLocal =(FirmaCliente) this.firmaclientes.toArray()[this.jTableDatosFirmaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				firmaclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
						firmaclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FirmaCliente firmaclienteAux:firmaclientes) {
						firmaclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFirmaCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFirmaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFirmaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFirmaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFirmaClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFirmaClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFirmaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFirmaCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFirmaCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FirmaCliente firmaclienteAux:this.firmaclienteLogic.getFirmaClientes()) {
				
						if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_FIRMA)) {
							existe=true;
							firmaclienteAux.setfirma(null);
						}
						 else if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA)) {
							existe=true;
							firmaclienteAux.setpath_firma(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FirmaCliente firmaclienteAux:firmaclientes) {
					
						if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_FIRMA)) {
							existe=true;
							firmaclienteAux.setfirma(null);
						}
						 else if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA)) {
							existe=true;
							firmaclienteAux.setpath_firma(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFirmaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFirmaClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFirmaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFirmaCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFirmaCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFirmaCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessFirmaCliente(conSplash);
				
					this.generarReporteFirmaClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFirmaClientesSeleccionados();
				//this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFirmaClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFirmaClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFirmaCliente();
				
				this.exportarFirmaClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFirmaClientes();
				//this.importarFirmaClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFirmaCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFirmaClientesSeleccionados();
				//this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Firma Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFirmaCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFirmaCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFirmaCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(FirmaClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFirmaCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFirmaCliente(conSplash);
					
						//this.actualizarParametrosGeneralFirmaCliente();
						
						this.generarReporteProcesoAccionFirmaClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FirmaClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Firma ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Firma Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFirmaCliente();
				
						this.actualizarParametrosGeneralFirmaCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.firmaclienteReturnGeneral=firmaclienteLogic.procesarAccionFirmaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.firmaclienteLogic.getFirmaClientes(),this.firmaclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFirmaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFirmaCliente();
					
					FirmaClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFirmaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFirmaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFirmaCliente.jComboBoxTiposAccionesFormularioFirmaCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFirmaCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFirmaClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFirmaCliente();
			
			if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
			FirmaCliente firmacliente=new FirmaCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFirmaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFirmaCliente.getSelectedItem();
			
			
			
			
			firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(firmaclientesSeleccionados.size()==1) {
				for(FirmaCliente firmaclienteAux:firmaclientesSeleccionados) {
					firmacliente=firmaclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFirmaCliente();
			
      		//this.finishProcessFirmaCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFirmaClienteReturnGeneral() throws Exception {
		if(this.firmaclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.firmaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.firmaclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.firmaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.firmaclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.firmaclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFirmaCliente(false);
		}
		
		if(this.firmaclienteReturnGeneral.getConRetornoLista() || this.firmaclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.firmaclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.firmaclienteLogic.setFirmaClientes(this.firmaclienteReturnGeneral.getFirmaClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.firmaclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.firmaclienteLogic.setFirmaCliente(this.firmaclienteReturnGeneral.getFirmaCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFirmaCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralFirmaCliente() throws Exception {
		
		
	}
	
	public ArrayList<FirmaCliente> getFirmaClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFirmaCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FirmaCliente firmaclienteAux:firmaclienteLogic.getFirmaClientes()) {
					if(firmaclienteAux.getIsSelected()) {
						firmaclientesSeleccionados.add(firmaclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FirmaCliente firmaclienteAux:this.firmaclientes) {
					if(firmaclienteAux.getIsSelected()) {
						firmaclientesSeleccionados.add(firmaclienteAux);				
					}
				}
			}
			
			if(firmaclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						firmaclientesSeleccionados.addAll(this.firmaclienteLogic.getFirmaClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						firmaclientesSeleccionados.addAll(this.firmaclientes);				
					}
				}
			}
		} else {
			firmaclientesSeleccionados.add(this.firmacliente);
		}
		
		return firmaclientesSeleccionados;
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
	
	public void generarReporteFirmaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFirmaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFirmaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFirmaClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFirmaClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Firma Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFirmaClientesSeleccionados() throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalFirmaClientesSeleccionados() throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFirmaClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFirmaClientesSeleccionados() throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFirmaCliente();
		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFirmaCliente();
		
		
		//this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados ,firmaclienteImplementable,firmaclienteImplementableHome);
	}
	
	public void mostrarImportacionFirmaClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFirmaCliente();
		
		this.abrirFrameImportacionFirmaCliente();		
		
			
		//this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados ,firmaclienteImplementable,firmaclienteImplementableHome);
	}
	
	public void importarFirmaClientes() throws Exception {		
	
	}
	
	public void exportarFirmaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFirmaClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFirmaClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFirmaClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Firma Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFirmaClientesSeleccionados() throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFirmaCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FirmaCliente firmaclienteAux:firmaclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFirmaCliente(firmaclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//firmaclienteAux.setsDetalleGeneralEntityReporte(firmaclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFirmaCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_FIRMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FirmaClienteConstantesFunciones.LABEL_PATHFIRMA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFirmaCliente(FirmaCliente firmacliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=firmacliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=firmacliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=firmacliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=firmacliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=firmacliente.gettipoimagen_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=firmacliente.getfirma().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=firmacliente.getpath_firma();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFirmaClientesSeleccionados() throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FirmaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFirmaCliente(row);				
				iRow++;
			}				
			
			for(FirmaCliente firmaclienteAux:firmaclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFirmaCliente(firmaclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFirmaClientesSeleccionados() throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();		
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"firmacliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("firmaclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("firmacliente");
			//elementRoot.appendChild(element);
		
			for(FirmaCliente firmaclienteAux:firmaclientesSeleccionados) {
				element = document.createElement("firmacliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFirmaCliente(firmaclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Firma Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFirmaCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_FIRMA);
		cell = row.createCell(iColumn++);cell.setCellValue(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFirmaCliente(FirmaCliente firmacliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(firmacliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(firmacliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(firmacliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(firmacliente.gettipoimagen_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(firmacliente.getpath_firma());				
	}
	
	public void setFilaDatosExportarXmlFirmaCliente(FirmaCliente firmacliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FirmaClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(firmacliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FirmaClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(firmacliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FirmaClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(firmacliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(FirmaClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(firmacliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipoimagen_descripcion = document.createElement(FirmaClienteConstantesFunciones.IDTIPOIMAGEN);
		elementtipoimagen_descripcion.appendChild(document.createTextNode(firmacliente.gettipoimagen_descripcion()));
		element.appendChild(elementtipoimagen_descripcion);

		Element elementfirma = document.createElement(FirmaClienteConstantesFunciones.FIRMA);
		elementfirma.appendChild(document.createTextNode(firmacliente.getfirma().toString().trim()));
		element.appendChild(elementfirma);

		Element elementpath_firma = document.createElement(FirmaClienteConstantesFunciones.PATHFIRMA);
		elementpath_firma.appendChild(document.createTextNode(firmacliente.getpath_firma().trim()));
		element.appendChild(elementpath_firma);
	}
	
	public void generarReporteGroupGenericoFirmaClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FirmaCliente> firmaclientesSeleccionados=new ArrayList<FirmaCliente>();
		
		firmaclientesSeleccionados=this.getFirmaClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFirmaCliente(firmaclientesSeleccionados);
		
		this.generarReporteFirmaClientes("Todos",firmaclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFirmaCliente(ArrayList<FirmaCliente> firmaclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FirmaCliente firmaclienteAux:firmaclientesSeleccionados) {
				firmaclienteAux.setsDetalleGeneralEntityReporte(firmaclienteAux.toString());
			
				if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					firmaclienteAux.setsDescripcionGeneralEntityReporte1(firmaclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					firmaclienteAux.setsDescripcionGeneralEntityReporte1(firmaclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_IDTIPOIMAGEN)) {
					existe=true;
					firmaclienteAux.setsDescripcionGeneralEntityReporte1(firmaclienteAux.gettipoimagen_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_FIRMA)) {
					existe=true;
					firmaclienteAux.setsDescripcionGeneralEntityReporte1(firmaclienteAux.getfirma().toString());
				}
				 else if(sTipoSeleccionar.equals(FirmaClienteConstantesFunciones.LABEL_PATHFIRMA)) {
					existe=true;
					firmaclienteAux.setsDescripcionGeneralEntityReporte1(firmaclienteAux.getpath_firma());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FirmaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFirmaCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFirmaCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=true;
				this.isVisibilidadCeldaGuardarCambiosFirmaCliente=true;
			}
			
			this.isVisibilidadCeldaModificarFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=false;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
			this.isVisibilidadCeldaModificarFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=true;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
			this.isVisibilidadCeldaModificarFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=true;
			this.isVisibilidadCeldaEliminarFirmaCliente=true;
			this.isVisibilidadCeldaCancelarFirmaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
			this.isVisibilidadCeldaModificarFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=true;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFirmaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=true;
			this.isVisibilidadCeldaModificarFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=false;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
			this.isVisibilidadCeldaActualizarFirmaCliente=false;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
			this.isVisibilidadCeldaModificarFirmaCliente=true;
			this.isVisibilidadCeldaActualizarFirmaCliente=false;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
			this.isVisibilidadCeldaCancelarFirmaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarFirmaCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FirmaClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFirmaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=true;
		} else {
			this.actualizarEstadoPanelsFirmaCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFirmaCliente=false;
			//this.isVisibilidadCeldaVerFormFirmaCliente=false;
			this.isVisibilidadCeldaDuplicarFirmaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!firmaclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoFirmaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosFirmaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(firmaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!firmaclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;												
			}
			
			this.jButtonCerrarFirmaCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFirmaCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.firmacliente)) {
			this.isVisibilidadCeldaActualizarFirmaCliente=false;
			this.isVisibilidadCeldaEliminarFirmaCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFirmaCliente() {
	}
	
	public void actualizarEstadoPanelsFirmaCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFirmaCliente!=null) {
				this.jScrollPanelDatosEdicionFirmaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFirmaCliente!=null) {
				this.jScrollPanelDatosFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionFirmaCliente!=null) {
				this.jPanelPaginacionFirmaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
					this.jTabbedPaneBusquedasFirmaCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFirmaCliente!=null) {
				this.jTabbedPaneBusquedasFirmaCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFirmaCliente!=null) {
				this.jPanelParametrosReportesFirmaCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFirmaCliente.remove(jPanelFK_IdClienteFirmaCliente);}

			this.isVisibilidadFK_IdTipoImagen=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoImagen) {this.jTabbedPaneBusquedasFirmaCliente.remove(jPanelFK_IdTipoImagenFirmaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFirmaCliente.remove(jPanelFK_IdClienteFirmaCliente);}

			this.isVisibilidadFK_IdTipoImagen=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoImagen) {this.jTabbedPaneBusquedasFirmaCliente.remove(jPanelFK_IdTipoImagenFirmaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoImagen(Boolean isParaTipoImagen){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoImagenNegation=!isParaTipoImagen;

			this.isVisibilidadFK_IdCliente=isParaTipoImagenNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFirmaCliente.remove(jPanelFK_IdClienteFirmaCliente);}

			this.isVisibilidadFK_IdTipoImagen=isParaTipoImagen;
			if(!this.isVisibilidadFK_IdTipoImagen) {this.jTabbedPaneBusquedasFirmaCliente.remove(jPanelFK_IdTipoImagenFirmaCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionFirmaClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(firmaclienteSessionBean==null) {
				firmaclienteSessionBean=new FirmaClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(firmaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.firmaclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(FirmaClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionFirmaCliente(true);
			//clienteSessionBean.setlidFirmaClienteActual(this.idFirmaClienteActual);

			firmaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFirmaCliente(true);
			firmaclienteSessionBean.setlIdFirmaClienteActualForeignKey(this.idFirmaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FirmaClienteSessionBean firmaclienteSessionBean=new FirmaClienteSessionBean();
		
		if(this.firmaclienteSessionBean==null) {
			this.firmaclienteSessionBean=new FirmaClienteSessionBean();
		}
		
		this.firmaclienteSessionBean.setsUltimaBusquedaFirmaCliente(this.getsAccionBusqueda());
		this.firmaclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.firmaclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			firmaclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			firmaclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoImagen")) {
			firmaclienteSessionBean.setid_tipo_imagen(this.getid_tipo_imagenFK_IdTipoImagen());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FirmaClienteSessionBean firmaclienteSessionBean=new FirmaClienteSessionBean();
		
		if(this.firmaclienteSessionBean==null) {
			this.firmaclienteSessionBean=new FirmaClienteSessionBean();
		}
		
		if(this.firmaclienteSessionBean.getsUltimaBusquedaFirmaCliente()!=null&&!this.firmaclienteSessionBean.getsUltimaBusquedaFirmaCliente().equals("")) {
			this.setsAccionBusqueda(firmaclienteSessionBean.getsUltimaBusquedaFirmaCliente());
			this.setiNumeroPaginacion(firmaclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(firmaclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(firmaclienteSessionBean.getid_cliente());
				firmaclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(firmaclienteSessionBean.getid_empresa());
				firmaclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoImagen")) {
				this.setid_tipo_imagenFK_IdTipoImagen(firmaclienteSessionBean.getid_tipo_imagen());
				firmaclienteSessionBean.setid_tipo_imagen(-1L);
			}
		}
		
		this.firmaclienteSessionBean.setsUltimaBusquedaFirmaCliente("");
		this.firmaclienteSessionBean.setiNumeroPaginacion(FirmaClienteConstantesFunciones.INUMEROPAGINACION);
		this.firmaclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFirmaCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFirmaCliente() {
		this.updateBorderResaltarBusquedasFormularioFirmaCliente();
		this.updateVisibilidadBusquedasFormularioFirmaCliente();
		this.updateHabilitarBusquedasFormularioFirmaCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioFirmaCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFirmaCliente.getComponents().length>0) {
	

		if(this.firmaclienteConstantesFunciones.resaltarFK_IdClienteFirmaCliente!=null) {
			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdClienteFirmaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);
				jPanel.setBorder(this.firmaclienteConstantesFunciones.resaltarFK_IdClienteFirmaCliente);
			}
		}

		if(this.firmaclienteConstantesFunciones.resaltarFK_IdTipoImagenFirmaCliente!=null) {
			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdTipoImagenFirmaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);
				jPanel.setBorder(this.firmaclienteConstantesFunciones.resaltarFK_IdTipoImagenFirmaCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFirmaCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFirmaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdClienteFirmaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.firmaclienteConstantesFunciones.mostrarFK_IdClienteFirmaCliente);
			if(!this.firmaclienteConstantesFunciones.mostrarFK_IdClienteFirmaCliente && index>-1) {
				this.jTabbedPaneBusquedasFirmaCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdTipoImagenFirmaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.firmaclienteConstantesFunciones.mostrarFK_IdTipoImagenFirmaCliente);
			if(!this.firmaclienteConstantesFunciones.mostrarFK_IdTipoImagenFirmaCliente && index>-1) {
				this.jTabbedPaneBusquedasFirmaCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFirmaCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFirmaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdClienteFirmaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.firmaclienteConstantesFunciones.activarFK_IdClienteFirmaCliente);
				this.jTabbedPaneBusquedasFirmaCliente.setEnabledAt(index,this.firmaclienteConstantesFunciones.activarFK_IdClienteFirmaCliente);
			}

			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdTipoImagenFirmaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.firmaclienteConstantesFunciones.activarFK_IdTipoImagenFirmaCliente);
				this.jTabbedPaneBusquedasFirmaCliente.setEnabledAt(index,this.firmaclienteConstantesFunciones.activarFK_IdTipoImagenFirmaCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFirmaCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdClienteFirmaCliente);

			this.jTabbedPaneBusquedasFirmaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);

			this.firmaclienteConstantesFunciones.setResaltarFK_IdClienteFirmaCliente(resaltar);

			jPanel.setBorder(this.firmaclienteConstantesFunciones.resaltarFK_IdClienteFirmaCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoImagen")) {
			index= this.jTabbedPaneBusquedasFirmaCliente.indexOfComponent(this.jPanelFK_IdTipoImagenFirmaCliente);

			this.jTabbedPaneBusquedasFirmaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFirmaCliente.getComponent(index);

			this.firmaclienteConstantesFunciones.setResaltarFK_IdTipoImagenFirmaCliente(resaltar);

			jPanel.setBorder(this.firmaclienteConstantesFunciones.resaltarFK_IdTipoImagenFirmaCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFirmaCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFirmaCliente() throws Exception {

		if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFirmaCliente();
		this.updateVisibilidadResaltarControlesFormularioFirmaCliente();
		this.updateHabilitarResaltarControlesFormularioFirmaCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioFirmaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.firmaclienteConstantesFunciones.resaltaridFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente!=null) {this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setBorder(this.firmaclienteConstantesFunciones.resaltaridFirmaCliente);}
		if(this.firmaclienteConstantesFunciones.resaltarid_empresaFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente!=null) {this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setBorder(this.firmaclienteConstantesFunciones.resaltarid_empresaFirmaCliente);}
		if(this.firmaclienteConstantesFunciones.resaltarid_clienteFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente!=null) {this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setBorder(this.firmaclienteConstantesFunciones.resaltarid_clienteFirmaCliente);}
		if(this.firmaclienteConstantesFunciones.resaltarid_tipo_imagenFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente!=null) {this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setBorder(this.firmaclienteConstantesFunciones.resaltarid_tipo_imagenFirmaCliente);}
		if(this.firmaclienteConstantesFunciones.resaltarfirmaFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente!=null) {this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.setBorder(this.firmaclienteConstantesFunciones.resaltarfirmaFirmaCliente);}
		if(this.firmaclienteConstantesFunciones.resaltarpath_firmaFirmaCliente!=null && this.jInternalFrameDetalleFormFirmaCliente!=null) {this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setBorder(this.firmaclienteConstantesFunciones.resaltarpath_firmaFirmaCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFirmaCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
	
		//this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostraridFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jPanelidFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostraridFirmaCliente);
		//this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_empresaFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jPanelid_empresaFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_empresaFirmaCliente);
		//this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_clienteFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jPanelid_clienteFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_clienteFirmaCliente);
			this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_clienteFirmaCliente);
		//this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_tipo_imagenFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jPanelid_tipo_imagenFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarid_tipo_imagenFirmaCliente);
		//this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarfirmaFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jPanelfirmaFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarfirmaFirmaCliente);
		//this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarpath_firmaFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jPanelpath_firmaFirmaCliente.setVisible(this.firmaclienteConstantesFunciones.mostrarpath_firmaFirmaCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFirmaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormFirmaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFirmaCliente!=null) {
	
		this.jInternalFrameDetalleFormFirmaCliente.jLabelidFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activaridFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_empresaFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activarid_empresaFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_clienteFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activarid_clienteFirmaCliente);
			this.jInternalFrameDetalleFormFirmaCliente.jButtonid_clienteFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activarid_clienteFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jComboBoxid_tipo_imagenFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activarid_tipo_imagenFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jFileChooserfirmaFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activarfirmaFirmaCliente);
		this.jInternalFrameDetalleFormFirmaCliente.jTextAreapath_firmaFirmaCliente.setEnabled(this.firmaclienteConstantesFunciones.activarpath_firmaFirmaCliente);
		}
	}
	
		
}