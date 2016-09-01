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

import com.bydan.erp.cartera.util.RepresentanteLegalConstantesFunciones;
import com.bydan.erp.cartera.util.RepresentanteLegalParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RepresentanteLegalParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.RepresentanteLegalBean;
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
public class RepresentanteLegalBeanSwingJInternalFrame extends RepresentanteLegalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RepresentanteLegalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RepresentanteLegal> representantelegalValidator = new ClassValidator<RepresentanteLegal>(RepresentanteLegal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RepresentanteLegal representantelegal;	
	public RepresentanteLegal representantelegalAux;
	public RepresentanteLegal representantelegalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RepresentanteLegal representantelegalTotales;
	public Long idRepresentanteLegalActual;
	public Long iIdNuevoRepresentanteLegal=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboTipoIdentificacion="";

	public List<TipoIdentificacion> tipoidentificacionsForeignKey;

	public List<TipoIdentificacion> gettipoidentificacionsForeignKey() {
		return tipoidentificacionsForeignKey;
	}

	public void settipoidentificacionsForeignKey(List<TipoIdentificacion> tipoidentificacionsForeignKey) {
		this.tipoidentificacionsForeignKey = tipoidentificacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIdentificacion tipoidentificacionForeignKey;

	public TipoIdentificacion gettipoidentificacionForeignKey() {
		return tipoidentificacionForeignKey;
	}

	public void settipoidentificacionForeignKey(TipoIdentificacion tipoidentificacionForeignKey) {
		this.tipoidentificacionForeignKey = tipoidentificacionForeignKey;
	}

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
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
	
	public Boolean isPermisoTodoRepresentanteLegal;
	public Boolean isPermisoNuevoRepresentanteLegal;
	public Boolean isPermisoActualizarRepresentanteLegal;
	public Boolean isPermisoActualizarOriginalRepresentanteLegal;
	public Boolean isPermisoEliminarRepresentanteLegal;
	public Boolean isPermisoGuardarCambiosRepresentanteLegal;
	public Boolean isPermisoConsultaRepresentanteLegal;
	public Boolean isPermisoBusquedaRepresentanteLegal;
	public Boolean isPermisoReporteRepresentanteLegal;
	public Boolean isPermisoPaginacionMedioRepresentanteLegal;
	public Boolean isPermisoPaginacionAltoRepresentanteLegal;
	public Boolean isPermisoPaginacionTodoRepresentanteLegal;
	public Boolean isPermisoCopiarRepresentanteLegal;
	public Boolean isPermisoVerFormRepresentanteLegal;
	public Boolean isPermisoDuplicarRepresentanteLegal;
	public Boolean isPermisoOrdenRepresentanteLegal;
	
	
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
	
	public RepresentanteLegalParameterReturnGeneral representantelegalReturnGeneral;
	public RepresentanteLegalParameterReturnGeneral representantelegalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRepresentanteLegal=false;
	public Boolean esParaAccionDesdeFormularioRepresentanteLegal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RepresentanteLegalSessionBeanAdditional representantelegalSessionBeanAdditional=null;
	
	public RepresentanteLegalSessionBeanAdditional getRepresentanteLegalSessionBeanAdditional() {
		return this.representantelegalSessionBeanAdditional;
	}
	
	public void setRepresentanteLegalSessionBeanAdditional(RepresentanteLegalSessionBeanAdditional representantelegalSessionBeanAdditional) {
		try {
			this.representantelegalSessionBeanAdditional=representantelegalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RepresentanteLegalBeanSwingJInternalFrameAdditional representantelegalBeanSwingJInternalFrameAdditional=null;
	//public class RepresentanteLegalBeanSwingJInternalFrame
	
	public RepresentanteLegalBeanSwingJInternalFrameAdditional getRepresentanteLegalBeanSwingJInternalFrameAdditional() {
		return this.representantelegalBeanSwingJInternalFrameAdditional;
	}
	
	public void setRepresentanteLegalBeanSwingJInternalFrameAdditional(RepresentanteLegalBeanSwingJInternalFrameAdditional representantelegalBeanSwingJInternalFrameAdditional) {
		try {
			this.representantelegalBeanSwingJInternalFrameAdditional=representantelegalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RepresentanteLegalLogic representantelegalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RepresentanteLegal representantelegalBean;
	public RepresentanteLegalConstantesFunciones representantelegalConstantesFunciones;
	//public RepresentanteLegalParameterReturnGeneral representantelegalReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoIdentificacionLogic tipoidentificacionLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<RepresentanteLegal> representantelegals;	
	//public List<RepresentanteLegal> representantelegalsEliminados;
	//public List<RepresentanteLegal> representantelegalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRepresentanteLegal=false;
	public Boolean isVisibilidadCeldaDuplicarRepresentanteLegal=true;
	public Boolean isVisibilidadCeldaCopiarRepresentanteLegal=true;
	public Boolean isVisibilidadCeldaVerFormRepresentanteLegal=true;
	public Boolean isVisibilidadCeldaOrdenRepresentanteLegal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
	public Boolean isVisibilidadCeldaModificarRepresentanteLegal=false;
	public Boolean isVisibilidadCeldaActualizarRepresentanteLegal=false;
	public Boolean isVisibilidadCeldaEliminarRepresentanteLegal=false;
	public Boolean isVisibilidadCeldaCancelarRepresentanteLegal=false;
	public Boolean isVisibilidadCeldaGuardarRepresentanteLegal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdValorClienteDocumento=false;
	
	public Long getiIdNuevoRepresentanteLegal() {
		return this.iIdNuevoRepresentanteLegal;
	}

	public void setiIdNuevoRepresentanteLegal(Long iIdNuevoRepresentanteLegal) {
		this.iIdNuevoRepresentanteLegal = iIdNuevoRepresentanteLegal;
	}
	
	public Long getidRepresentanteLegalActual() {
		return this.idRepresentanteLegalActual;
	}

	public void setidRepresentanteLegalActual(Long idRepresentanteLegalActual) {
		this.idRepresentanteLegalActual = idRepresentanteLegalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RepresentanteLegal getrepresentantelegal() {
		return this.representantelegal;
	}

	public void setrepresentantelegal(RepresentanteLegal representantelegal) {
		this.representantelegal = representantelegal;
	}
	
	public RepresentanteLegal getrepresentantelegalAux() {
		return this.representantelegalAux;
	}

	public void setrepresentantelegalAux(RepresentanteLegal representantelegalAux) {
		this.representantelegalAux = representantelegalAux;
	}				
	
	public RepresentanteLegal getrepresentantelegalAnterior() {
		return this.representantelegalAnterior;
	}

	public void setrepresentantelegalAnterior(RepresentanteLegal representantelegalAnterior) {
		this.representantelegalAnterior = representantelegalAnterior;
	}	
	
	public RepresentanteLegal getrepresentantelegalTotales() {
		return this.representantelegalTotales;
	}

	public void setrepresentantelegalTotales(RepresentanteLegal representantelegalTotales) {
		this.representantelegalTotales = representantelegalTotales;
	}	
	
	public RepresentanteLegal getrepresentantelegalBean() {
		return this.representantelegalBean;
	}

	public void setrepresentantelegalBean(RepresentanteLegal representantelegalBean) {
		this.representantelegalBean = representantelegalBean;
	}	
	
	public RepresentanteLegalParameterReturnGeneral getrepresentantelegalReturnGeneral() {
		return this.representantelegalReturnGeneral;
	}

	public void setrepresentantelegalReturnGeneral(RepresentanteLegalParameterReturnGeneral representantelegalReturnGeneral) {
		this.representantelegalReturnGeneral = representantelegalReturnGeneral;
	}	
	
	
	public Long idciudadFK_IdCiudad=-1L;

	public Long getidciudadFK_IdCiudad() {
		return this.idciudadFK_IdCiudad;
	}

	public void setidciudadFK_IdCiudad(Long idciudadFK_IdCiudad) {
		this.idciudadFK_IdCiudad = idciudadFK_IdCiudad;
	}

	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long idvalorclientedocumentoFK_IdValorClienteDocumento=-1L;

	public Long getidvalorclientedocumentoFK_IdValorClienteDocumento() {
		return this.idvalorclientedocumentoFK_IdValorClienteDocumento;
	}

	public void setidvalorclientedocumentoFK_IdValorClienteDocumento(Long idvalorclientedocumentoFK_IdValorClienteDocumento) {
		this.idvalorclientedocumentoFK_IdValorClienteDocumento = idvalorclientedocumentoFK_IdValorClienteDocumento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RepresentanteLegalLogic getRepresentanteLegalLogic()	{		
		return representantelegalLogic;
	}

	public void setRepresentanteLegalLogic(RepresentanteLegalLogic representantelegalLogic) {
		this.representantelegalLogic = representantelegalLogic;
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
	
	public Boolean getIsEsNuevoRepresentanteLegal() {
		return isEsNuevoRepresentanteLegal;
	}

	public void setIsEsNuevoRepresentanteLegal(Boolean isEsNuevoRepresentanteLegal) {
		this.isEsNuevoRepresentanteLegal = isEsNuevoRepresentanteLegal;
	}

	public Boolean getEsParaAccionDesdeFormularioRepresentanteLegal() {
		return esParaAccionDesdeFormularioRepresentanteLegal;
	}
	
	public void setEsParaAccionDesdeFormularioRepresentanteLegal(Boolean esParaAccionDesdeFormularioRepresentanteLegal) {
		this.esParaAccionDesdeFormularioRepresentanteLegal = esParaAccionDesdeFormularioRepresentanteLegal;
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

			clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.representantelegalSessionBean==null) {
				this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

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
					clienteLogic.getEntityWithConnection(representantelegalSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoIdentificacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIdentificacionLogic tipoidentificacionLogic=new TipoIdentificacionLogic();

			tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

			if(this.representantelegalSessionBean==null) {
				this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

					tipoidentificacionLogic.getTodosTipoIdentificacionsWithConnection(sFinalQuery,new Pagination());

					this.tipoidentificacionsForeignKey=tipoidentificacionLogic.getTipoIdentificacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIdentificacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getEntityWithConnection(representantelegalSessionBean.getlidTipoIdentificacionActual());
					this.tipoidentificacionsForeignKey.add(tipoidentificacionLogic.getTipoIdentificacion());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.representantelegalSessionBean==null) {
				this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(representantelegalSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.representantelegalSessionBean==null) {
				this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(representantelegalSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.representantelegal!=null) {
						this.representantelegal.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteRepresentanteLegal.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteRepresentanteLegal!=null) {
						jComboBoxidclienteFK_IdClienteRepresentanteLegal.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteRepresentanteLegal!=null) {
							//jComboBoxidclienteFK_IdClienteRepresentanteLegal.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteRepresentanteLegal.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteRepresentanteLegal.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteRepresentanteLegalGenerico)throws Exception
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
				jComboBoxidclienteRepresentanteLegalGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteRepresentanteLegalGenerico!=null && jComboBoxidclienteRepresentanteLegalGenerico.getItemCount()>0) {
					jComboBoxidclienteRepresentanteLegalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIdentificacionForeignKey(Long idTipoIdentificacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoidentificacionTemp!=null) {

					if(this.representantelegal!=null) {
						this.representantelegal.setTipoIdentificacion(tipoidentificacionTemp);
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setSelectedItem(tipoidentificacionTemp);
					}
				} else {
					//jComboBoxidvalorclientedocumentoRepresentanteLegal.setSelectedItem(tipoidentificacionTemp);
					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteDocumento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoidentificacionTemp!=null && jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal!=null) {
						jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setSelectedItem(tipoidentificacionTemp);
					} else {
						if(jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal!=null) {
							//jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setSelectedItem(tipoidentificacionTemp);
							if(jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.getItemCount()>0) {
								jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setSelectedIndex(0);
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

	public String getActualTipoIdentificacionForeignKeyDescripcion(Long idTipoIdentificacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}


			sDescripcion=TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIdentificacionForeignKeyGenerico(Long idTipoIdentificacionSeleccionado,JComboBox jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(tipoidentificacionTemp!=null) {
				jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico.setSelectedItem(tipoidentificacionTemp);
			} else {
				if(jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico!=null && jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico.getItemCount()>0) {
					jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.representantelegal!=null) {
						this.representantelegal.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisRepresentanteLegal.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisRepresentanteLegal!=null) {
						jComboBoxid_paisFK_IdPaisRepresentanteLegal.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisRepresentanteLegal!=null) {
							//jComboBoxid_paisFK_IdPaisRepresentanteLegal.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisRepresentanteLegal.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisRepresentanteLegal.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisRepresentanteLegalGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisRepresentanteLegalGenerico!=null && jComboBoxid_paisRepresentanteLegalGenerico.getItemCount()>0) {
					jComboBoxid_paisRepresentanteLegalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.representantelegal!=null) {
						this.representantelegal.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxidciudadRepresentanteLegal.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxidciudadFK_IdCiudadRepresentanteLegal!=null) {
						jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxidciudadFK_IdCiudadRepresentanteLegal!=null) {
							//jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setSelectedItem(ciudadTemp);
							if(jComboBoxidciudadFK_IdCiudadRepresentanteLegal.getItemCount()>0) {
								jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxidciudadRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxidciudadRepresentanteLegalGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxidciudadRepresentanteLegalGenerico!=null && jComboBoxidciudadRepresentanteLegalGenerico.getItemCount()>0) {
					jComboBoxidciudadRepresentanteLegalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(RepresentanteLegal representantelegal,JComboBox jComboBoxidclienteRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteRepresentanteLegalGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteRepresentanteLegalGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				representantelegal.setidcliente(clienteAux.getId());
				representantelegal.setcliente_descripcion(RepresentanteLegalConstantesFunciones.getClienteDescripcion(clienteAux));
				representantelegal.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIdentificacionForeignKey(RepresentanteLegal representantelegal,JComboBox jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionAux=new TipoIdentificacion();

			if(jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico==null) {
				tipoidentificacionAux=(TipoIdentificacion)this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.getSelectedItem();
			} else {
				tipoidentificacionAux=(TipoIdentificacion)jComboBoxidvalorclientedocumentoRepresentanteLegalGenerico.getSelectedItem();
			}

			if(tipoidentificacionAux!=null && tipoidentificacionAux.getId()!=null) {
				representantelegal.setidvalorclientedocumento(tipoidentificacionAux.getId());
				representantelegal.settipoidentificacion_descripcion(RepresentanteLegalConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionAux));
				representantelegal.setTipoIdentificacion(tipoidentificacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(RepresentanteLegal representantelegal,JComboBox jComboBoxid_paisRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisRepresentanteLegalGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisRepresentanteLegalGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				representantelegal.setid_pais(paisAux.getId());
				representantelegal.setpais_descripcion(RepresentanteLegalConstantesFunciones.getPaisDescripcion(paisAux));
				representantelegal.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(RepresentanteLegal representantelegal,JComboBox jComboBoxidciudadRepresentanteLegalGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxidciudadRepresentanteLegalGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxidciudadRepresentanteLegalGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				representantelegal.setidciudad(ciudadAux.getId());
				representantelegal.setciudad_descripcion(RepresentanteLegalConstantesFunciones.getCiudadDescripcion(ciudadAux));
				representantelegal.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
					}

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteRepresentanteLegal.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteRepresentanteLegal.addItem(cliente);
							}
						}

						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIdentificacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIdentificacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.addItem(tipoidentificacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
					}

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteDocumento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.addItem(tipoidentificacion);
							}
						}

						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
					}

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.addItem(pais);
							}
						}

						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { 
					}

					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidciudadFK_IdCiudadRepresentanteLegal.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxidciudadFK_IdCiudadRepresentanteLegal.addItem(ciudad);
							}
						}

						if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteRepresentanteLegal.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIdentificacionForeignKey(TipoIdentificacion tipoidentificacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setSelectedItem(tipoidentificacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setSelectedItem(tipoidentificacion);
						} else {
							this.jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setSelectedItem(ciudad);
						} else {
							this.jComboBoxidciudadFK_IdCiudadRepresentanteLegal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRepresentanteLegal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RepresentanteLegalConstantesFunciones.refrescarForeignKeysDescripcionesRepresentanteLegal(this.representantelegalLogic.getRepresentanteLegals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RepresentanteLegalConstantesFunciones.refrescarForeignKeysDescripcionesRepresentanteLegal(this.representantelegals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoIdentificacion.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//representantelegalLogic.setRepresentanteLegals(this.representantelegals);
			representantelegalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RepresentanteLegalParameterReturnGeneral getRepresentanteLegalParameterGeneral() {
		return this.representantelegalParameterGeneral;
	}
	
	public void setRepresentanteLegalParameterGeneral(RepresentanteLegalParameterReturnGeneral representantelegalParameterGeneral) {
		this.representantelegalParameterGeneral = representantelegalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRepresentanteLegal() {
		return isPermisoTodoRepresentanteLegal;
	}

	public void setIsPermisoTodoRepresentanteLegal(Boolean isPermisoTodoRepresentanteLegal) {
		this.isPermisoTodoRepresentanteLegal = isPermisoTodoRepresentanteLegal;
	}

	public Boolean getIsPermisoNuevoRepresentanteLegal() {
		return isPermisoNuevoRepresentanteLegal;
	}

	public void setIsPermisoNuevoRepresentanteLegal(Boolean isPermisoNuevoRepresentanteLegal) {
		this.isPermisoNuevoRepresentanteLegal = isPermisoNuevoRepresentanteLegal;
	}

	public Boolean getIsPermisoActualizarRepresentanteLegal() {
		return isPermisoActualizarRepresentanteLegal;
	}

	public void setIsPermisoActualizarRepresentanteLegal(Boolean isPermisoActualizarRepresentanteLegal) {
		this.isPermisoActualizarRepresentanteLegal = isPermisoActualizarRepresentanteLegal;
	}

	public Boolean getIsPermisoEliminarRepresentanteLegal() {
		return isPermisoEliminarRepresentanteLegal;
	}

	public void setIsPermisoEliminarRepresentanteLegal(Boolean isPermisoEliminarRepresentanteLegal) {
		this.isPermisoEliminarRepresentanteLegal = isPermisoEliminarRepresentanteLegal;
	}

	public Boolean getIsPermisoGuardarCambiosRepresentanteLegal() {
		return isPermisoGuardarCambiosRepresentanteLegal;
	}

	public void setIsPermisoGuardarCambiosRepresentanteLegal(Boolean isPermisoGuardarCambiosRepresentanteLegal) {
		this.isPermisoGuardarCambiosRepresentanteLegal = isPermisoGuardarCambiosRepresentanteLegal;
	}
	
	public Boolean getIsPermisoConsultaRepresentanteLegal() {
		return isPermisoConsultaRepresentanteLegal;
	}

	public void setIsPermisoConsultaRepresentanteLegal(Boolean isPermisoConsultaRepresentanteLegal) {
		this.isPermisoConsultaRepresentanteLegal = isPermisoConsultaRepresentanteLegal;
	}

	public Boolean getIsPermisoBusquedaRepresentanteLegal() {
		return isPermisoBusquedaRepresentanteLegal;
	}

	public void setIsPermisoBusquedaRepresentanteLegal(Boolean isPermisoBusquedaRepresentanteLegal) {
		this.isPermisoBusquedaRepresentanteLegal = isPermisoBusquedaRepresentanteLegal;
	}

	public Boolean getIsPermisoReporteRepresentanteLegal() {
		return isPermisoReporteRepresentanteLegal;
	}

	public void setIsPermisoReporteRepresentanteLegal(Boolean isPermisoReporteRepresentanteLegal) {
		this.isPermisoReporteRepresentanteLegal = isPermisoReporteRepresentanteLegal;
	}
	
	public Boolean getIsPermisoPaginacionMedioRepresentanteLegal() {
		return isPermisoPaginacionMedioRepresentanteLegal;
	}

	public void setIsPermisoPaginacionMedioRepresentanteLegal(Boolean isPermisoPaginacionMedioRepresentanteLegal) {
		this.isPermisoPaginacionMedioRepresentanteLegal = isPermisoPaginacionMedioRepresentanteLegal;
	}
	
	public Boolean getIsPermisoPaginacionTodoRepresentanteLegal() {
		return isPermisoPaginacionTodoRepresentanteLegal;
	}

	public void setIsPermisoPaginacionTodoRepresentanteLegal(Boolean isPermisoPaginacionTodoRepresentanteLegal) {
		this.isPermisoPaginacionTodoRepresentanteLegal = isPermisoPaginacionTodoRepresentanteLegal;
	}
	
	public Boolean getIsPermisoPaginacionAltoRepresentanteLegal() {
		return isPermisoPaginacionAltoRepresentanteLegal;
	}

	public void setIsPermisoPaginacionAltoRepresentanteLegal(Boolean isPermisoPaginacionAltoRepresentanteLegal) {
		this.isPermisoPaginacionAltoRepresentanteLegal = isPermisoPaginacionAltoRepresentanteLegal;
	}
	
	public Boolean getIsPermisoCopiarRepresentanteLegal() {
		return isPermisoCopiarRepresentanteLegal;
	}

	public void setIsPermisoCopiarRepresentanteLegal(Boolean isPermisoCopiarRepresentanteLegal) {
		this.isPermisoCopiarRepresentanteLegal = isPermisoCopiarRepresentanteLegal;
	}
	
	public Boolean getIsPermisoVerFormRepresentanteLegal() {
		return isPermisoVerFormRepresentanteLegal;
	}

	public void setIsPermisoVerFormRepresentanteLegal(Boolean isPermisoVerFormRepresentanteLegal) {
		this.isPermisoVerFormRepresentanteLegal = isPermisoVerFormRepresentanteLegal;
	}
	
	public Boolean getIsPermisoDuplicarRepresentanteLegal() {
		return isPermisoDuplicarRepresentanteLegal;
	}

	public void setIsPermisoDuplicarRepresentanteLegal(Boolean isPermisoDuplicarRepresentanteLegal) {
		this.isPermisoDuplicarRepresentanteLegal = isPermisoDuplicarRepresentanteLegal;
	}
	
	public Boolean getIsPermisoOrdenRepresentanteLegal() {
		return isPermisoOrdenRepresentanteLegal;
	}

	public void setIsPermisoOrdenRepresentanteLegal(Boolean isPermisoOrdenRepresentanteLegal) {
		this.isPermisoOrdenRepresentanteLegal = isPermisoOrdenRepresentanteLegal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRepresentanteLegal() {
		return isVisibilidadCeldaNuevoRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaNuevoRepresentanteLegal(Boolean isVisibilidadCeldaNuevoRepresentanteLegal) {
		this.isVisibilidadCeldaNuevoRepresentanteLegal = isVisibilidadCeldaNuevoRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRepresentanteLegal() {
		return isVisibilidadCeldaDuplicarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaDuplicarRepresentanteLegal(Boolean isVisibilidadCeldaDuplicarRepresentanteLegal) {
		this.isVisibilidadCeldaDuplicarRepresentanteLegal = isVisibilidadCeldaDuplicarRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRepresentanteLegal() {
		return isVisibilidadCeldaCopiarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaCopiarRepresentanteLegal(Boolean isVisibilidadCeldaCopiarRepresentanteLegal) {
		this.isVisibilidadCeldaCopiarRepresentanteLegal = isVisibilidadCeldaCopiarRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRepresentanteLegal() {
		return isVisibilidadCeldaVerFormRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaVerFormRepresentanteLegal(Boolean isVisibilidadCeldaVerFormRepresentanteLegal) {
		this.isVisibilidadCeldaVerFormRepresentanteLegal = isVisibilidadCeldaVerFormRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRepresentanteLegal() {
		return isVisibilidadCeldaOrdenRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaOrdenRepresentanteLegal(Boolean isVisibilidadCeldaOrdenRepresentanteLegal) {
		this.isVisibilidadCeldaOrdenRepresentanteLegal = isVisibilidadCeldaOrdenRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRepresentanteLegal() {
		return isVisibilidadCeldaNuevoRelacionesRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRepresentanteLegal(Boolean isVisibilidadCeldaNuevoRelacionesRepresentanteLegal) {
		this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal = isVisibilidadCeldaNuevoRelacionesRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRepresentanteLegal() {
		return isVisibilidadCeldaModificarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaModificarRepresentanteLegal(Boolean isVisibilidadCeldaModificarRepresentanteLegal) {
		this.isVisibilidadCeldaModificarRepresentanteLegal = isVisibilidadCeldaModificarRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRepresentanteLegal() {
		return isVisibilidadCeldaActualizarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaActualizarRepresentanteLegal(Boolean isVisibilidadCeldaActualizarRepresentanteLegal) {
		this.isVisibilidadCeldaActualizarRepresentanteLegal = isVisibilidadCeldaActualizarRepresentanteLegal;
	}

	public Boolean getIsVisibilidadCeldaEliminarRepresentanteLegal() {
		return isVisibilidadCeldaEliminarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaEliminarRepresentanteLegal(Boolean isVisibilidadCeldaEliminarRepresentanteLegal) {
		this.isVisibilidadCeldaEliminarRepresentanteLegal = isVisibilidadCeldaEliminarRepresentanteLegal;
	}

	public Boolean getIsVisibilidadCeldaCancelarRepresentanteLegal() {
		return isVisibilidadCeldaCancelarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaCancelarRepresentanteLegal(Boolean isVisibilidadCeldaCancelarRepresentanteLegal) {
		this.isVisibilidadCeldaCancelarRepresentanteLegal = isVisibilidadCeldaCancelarRepresentanteLegal;
	}

	public Boolean getIsVisibilidadCeldaGuardarRepresentanteLegal() {
		return isVisibilidadCeldaGuardarRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaGuardarRepresentanteLegal(Boolean isVisibilidadCeldaGuardarRepresentanteLegal) {
		this.isVisibilidadCeldaGuardarRepresentanteLegal = isVisibilidadCeldaGuardarRepresentanteLegal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRepresentanteLegal() {
		return isVisibilidadCeldaGuardarCambiosRepresentanteLegal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRepresentanteLegal(Boolean isVisibilidadCeldaGuardarCambiosRepresentanteLegal) {
		this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal = isVisibilidadCeldaGuardarCambiosRepresentanteLegal;
	}
		
	public RepresentanteLegalSessionBean getrepresentantelegalSessionBean() {
		return this.representantelegalSessionBean;
	}
	
	public void setrepresentantelegalSessionBean(RepresentanteLegalSessionBean representantelegalSessionBean) {
		this.representantelegalSessionBean=representantelegalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdValorClienteDocumento() {
		return this.isVisibilidadFK_IdValorClienteDocumento;
	}

	public void setisVisibilidadFK_IdValorClienteDocumento(Boolean isVisibilidadFK_IdValorClienteDocumento) {
		this.isVisibilidadFK_IdValorClienteDocumento=isVisibilidadFK_IdValorClienteDocumento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(RepresentanteLegal representantelegal)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(representantelegal,null);
				this.setActualParaGuardarTipoIdentificacionForeignKey(representantelegal,null);
				this.setActualParaGuardarPaisForeignKey(representantelegal,null);
				this.setActualParaGuardarCiudadForeignKey(representantelegal,null);
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
	
	public void bugActualizarReferenciaActual(RepresentanteLegal representantelegal,RepresentanteLegal representantelegalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRepresentanteLegal(representantelegal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		representantelegalAux.setId(representantelegal.getId());
		representantelegalAux.setVersionRow(representantelegal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRepresentanteLegal();
		
			int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = representantelegalValidator.getInvalidValues(this.representantelegal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			representantelegalLogic.setDatosCliente(datosCliente);
			representantelegalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				representantelegalAux=new  RepresentanteLegal();
				
				representantelegalAux.setIsNew(true);
				representantelegalAux.setIsChanged(true);
				
				representantelegalAux.setRepresentanteLegalOriginal(this.representantelegal);
				
				representantelegalAux.setId(this.representantelegal.getId());	
				representantelegalAux.setVersionRow(this.representantelegal.getVersionRow());	
				representantelegalAux.setidcliente(this.representantelegal.getidcliente());	
				representantelegalAux.setidvalorclientedocumento(this.representantelegal.getidvalorclientedocumento());	
				representantelegalAux.setid_pais(this.representantelegal.getid_pais());	
				representantelegalAux.setidciudad(this.representantelegal.getidciudad());	
				representantelegalAux.setidentificacion(this.representantelegal.getidentificacion());	
				representantelegalAux.setapellidopaterno(this.representantelegal.getapellidopaterno());	
				representantelegalAux.setapellidomaterno(this.representantelegal.getapellidomaterno());	
				representantelegalAux.setprimernombre(this.representantelegal.getprimernombre());	
				representantelegalAux.setsegundonombre(this.representantelegal.getsegundonombre());	
				representantelegalAux.setdireccion(this.representantelegal.getdireccion());	
				representantelegalAux.settelefono(this.representantelegal.gettelefono());	
				representantelegalAux.settelefonocodigoarea(this.representantelegal.gettelefonocodigoarea());	
				representantelegalAux.setextension(this.representantelegal.getextension());	
				representantelegalAux.settelefonomovil(this.representantelegal.gettelefonomovil());	
				representantelegalAux.setmontoaurorizado(this.representantelegal.getmontoaurorizado());	
				representantelegalAux.setemail(this.representantelegal.getemail());	
				representantelegalAux.setestaactivo(this.representantelegal.getestaactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.representantelegalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(representantelegalAux,representantelegalLogic.getRepresentanteLegals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(representantelegalAux,representantelegals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.representantelegalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.saveRepresentanteLegals();//WithConnection
						//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.representantelegal,representantelegalAux);
					
					this.refrescarForeignKeysDescripcionesRepresentanteLegal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								representantelegalLogic.saveRepresentanteLegalRelaciones(representantelegalAux);//WithConnection
								//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.representantelegal,representantelegalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.representantelegalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(representantelegalAux,representantelegalLogic.getRepresentanteLegals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(representantelegalAux,representantelegals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.representantelegal,representantelegalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				representantelegalAux=new  RepresentanteLegal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.representantelegalSessionBean.getEsGuardarRelacionado() 
					|| (this.representantelegalSessionBean.getEsGuardarRelacionado() && this.representantelegal.getId()>=0)) {
						
					representantelegalAux.setIsNew(false);
				}
				
				representantelegalAux.setIsDeleted(false);
			
				representantelegalAux.setId(this.representantelegal.getId());	
				representantelegalAux.setVersionRow(this.representantelegal.getVersionRow());	
				representantelegalAux.setidcliente(this.representantelegal.getidcliente());	
				representantelegalAux.setidvalorclientedocumento(this.representantelegal.getidvalorclientedocumento());	
				representantelegalAux.setid_pais(this.representantelegal.getid_pais());	
				representantelegalAux.setidciudad(this.representantelegal.getidciudad());	
				representantelegalAux.setidentificacion(this.representantelegal.getidentificacion());	
				representantelegalAux.setapellidopaterno(this.representantelegal.getapellidopaterno());	
				representantelegalAux.setapellidomaterno(this.representantelegal.getapellidomaterno());	
				representantelegalAux.setprimernombre(this.representantelegal.getprimernombre());	
				representantelegalAux.setsegundonombre(this.representantelegal.getsegundonombre());	
				representantelegalAux.setdireccion(this.representantelegal.getdireccion());	
				representantelegalAux.settelefono(this.representantelegal.gettelefono());	
				representantelegalAux.settelefonocodigoarea(this.representantelegal.gettelefonocodigoarea());	
				representantelegalAux.setextension(this.representantelegal.getextension());	
				representantelegalAux.settelefonomovil(this.representantelegal.gettelefonomovil());	
				representantelegalAux.setmontoaurorizado(this.representantelegal.getmontoaurorizado());	
				representantelegalAux.setemail(this.representantelegal.getemail());	
				representantelegalAux.setestaactivo(this.representantelegal.getestaactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(representantelegalAux,representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(representantelegalAux,representantelegals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.representantelegalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.saveRepresentanteLegals();//WithConnection
						//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.representantelegal,representantelegalAux);
					
					this.refrescarForeignKeysDescripcionesRepresentanteLegal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								representantelegalLogic.saveRepresentanteLegalRelaciones(representantelegalAux);//WithConnection
								//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.representantelegal,representantelegalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.representantelegalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(representantelegalAux,representantelegalLogic.getRepresentanteLegals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(representantelegalAux,representantelegals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.representantelegal,representantelegalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				representantelegalAux=new  RepresentanteLegal();
				
				representantelegalAux.setIsNew(false);
				representantelegalAux.setIsChanged(false);
				
				representantelegalAux.setIsDeleted(true);
				
				representantelegalAux.setId(this.representantelegal.getId());	
				representantelegalAux.setVersionRow(this.representantelegal.getVersionRow());	
				representantelegalAux.setidcliente(this.representantelegal.getidcliente());	
				representantelegalAux.setidvalorclientedocumento(this.representantelegal.getidvalorclientedocumento());	
				representantelegalAux.setid_pais(this.representantelegal.getid_pais());	
				representantelegalAux.setidciudad(this.representantelegal.getidciudad());	
				representantelegalAux.setidentificacion(this.representantelegal.getidentificacion());	
				representantelegalAux.setapellidopaterno(this.representantelegal.getapellidopaterno());	
				representantelegalAux.setapellidomaterno(this.representantelegal.getapellidomaterno());	
				representantelegalAux.setprimernombre(this.representantelegal.getprimernombre());	
				representantelegalAux.setsegundonombre(this.representantelegal.getsegundonombre());	
				representantelegalAux.setdireccion(this.representantelegal.getdireccion());	
				representantelegalAux.settelefono(this.representantelegal.gettelefono());	
				representantelegalAux.settelefonocodigoarea(this.representantelegal.gettelefonocodigoarea());	
				representantelegalAux.setextension(this.representantelegal.getextension());	
				representantelegalAux.settelefonomovil(this.representantelegal.gettelefonomovil());	
				representantelegalAux.setmontoaurorizado(this.representantelegal.getmontoaurorizado());	
				representantelegalAux.setemail(this.representantelegal.getemail());	
				representantelegalAux.setestaactivo(this.representantelegal.getestaactivo());	
				
				if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.representantelegalAux.getId()>=0) {	
						this.representantelegalsEliminados.add(representantelegalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(representantelegalAux,representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(representantelegalAux,representantelegals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.representantelegalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.saveRepresentanteLegals();//WithConnection
						//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								representantelegalLogic.saveRepresentanteLegalRelaciones(representantelegalAux);//WithConnection
								//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
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
							if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.representantelegalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(representantelegalAux,representantelegalLogic.getRepresentanteLegals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(representantelegalAux,representantelegals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getRepresentanteLegals().addAll(this.representantelegalsEliminados);
					
					representantelegalLogic.saveRepresentanteLegals();//WithConnection
					//representantelegalLogic.getSetVersionRowRepresentanteLegals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRepresentanteLegal();
				
				this.representantelegalsEliminados= new ArrayList<RepresentanteLegal>();		
			}
			
			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Representante Legal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.representantelegal=representantelegalAux;
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
      		//this.finishProcessRepresentanteLegal();
      	}
		
	}	
	
	public void actualizarRelaciones(RepresentanteLegal representantelegalLocal) throws Exception {
		
		if(this.representantelegalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RepresentanteLegal representantelegalLocal) throws Exception {	
		if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				representantelegalLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIdentificacionDetalleFormJInternalFrame.class)) {
				TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrameLocal=(TipoIdentificacionBeanSwingJInternalFrame) ((TipoIdentificacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoidentificacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.gettipoidentificacion(),true);
				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarLista(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion,this.tipoidentificacionsForeignKey);

				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				representantelegalLocal.setTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey("Formulario");
				this.setActualTipoIdentificacionForeignKey(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				representantelegalLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				representantelegalLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRepresentanteLegalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = representantelegalValidator.getInvalidValues(this.representantelegal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RepresentanteLegal representantelegal,List<RepresentanteLegal> representantelegals) throws Exception {
		try	{		
			RepresentanteLegalConstantesFunciones.actualizarLista(representantelegal,representantelegals,this.representantelegalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RepresentanteLegal representantelegal,List<RepresentanteLegal> representantelegals) throws Exception {
		try	{			
			RepresentanteLegalConstantesFunciones.actualizarSelectedLista(representantelegal,representantelegals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RepresentanteLegal> representantelegalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				representantelegalsLocal=this.representantelegalLogic.getRepresentanteLegals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				representantelegalsLocal=this.representantelegals;
			}
			//ARCHITECTURE
		
			for(RepresentanteLegal representantelegalLocal:representantelegalsLocal) {
				if(this.permiteMantenimiento(representantelegalLocal) && representantelegalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RepresentanteLegalConstantesFunciones.getRepresentanteLegalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidclienteRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.IDTIPOIDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidvalorclientedocumentoRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelid_paisRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidciudadRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidentificacionRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.APELLIDOPATERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelapellidopaternoRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.APELLIDOMATERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelapellidomaternoRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.PRIMERNOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelprimernombreRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.SEGUNDONOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelsegundonombreRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeldireccionRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonoRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.TELEFONOCODIGOAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonocodigoareaRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.EXTENSION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelextensionRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.TELEFONOMOVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonomovilRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.MONTOAURORIZADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelmontoaurorizadoRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelemailRepresentanteLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RepresentanteLegalConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelestaactivoRepresentanteLegal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidclienteRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidvalorclientedocumentoRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelid_paisRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidciudadRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidentificacionRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelapellidopaternoRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelapellidomaternoRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelprimernombreRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelsegundonombreRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeldireccionRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonoRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonocodigoareaRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelextensionRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonomovilRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelmontoaurorizadoRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelemailRepresentanteLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelestaactivoRepresentanteLegal,"");
		
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
		this.iIdNuevoRepresentanteLegal--;	
		
		
		this.representantelegalAux=new RepresentanteLegal();
		
		this.representantelegalAux.setId(this.iIdNuevoRepresentanteLegal);
		this.representantelegalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.representantelegalLogic.getRepresentanteLegals().add(this.representantelegalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.representantelegals.add(this.representantelegalAux);
		}
		//ARCHITECTURE
		
		this.representantelegal=this.representantelegalAux;
		
		if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRepresentanteLegal(this.representantelegal);
			this.setVariablesObjetoActualToFormularioForeignKeyRepresentanteLegal(this.representantelegal);
		}
				
		//this.setDefaultControlesRepresentanteLegal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRepresentanteLegal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRepresentanteLegal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRepresentanteLegal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRepresentanteLegal(this.representantelegalBean,this.representantelegal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RepresentanteLegalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
			classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.representantelegalReturnGeneral=representantelegalLogic.procesarEventosRepresentanteLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.representantelegalLogic.getRepresentanteLegals(),this.representantelegal,this.representantelegalParameterGeneral,this.isEsNuevoRepresentanteLegal,classes);//this.representantelegalLogic.getRepresentanteLegal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRepresentanteLegal(this.representantelegalReturnGeneral,this.representantelegalBean,false);
		
		if(this.representantelegalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal());
		}
		
		if(this.representantelegalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal(),classes);//this.representantelegalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRepresentanteLegal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRepresentanteLegal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.RecargarFormRepresentanteLegal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRepresentanteLegal(false);
						
			if(representantelegalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRepresentanteLegal();
			}
			
			this.actualizarVisualTableDatosRepresentanteLegal();
			
			this.jTableDatosRepresentanteLegal.setRowSelectionInterval(this.getIndiceNuevoRepresentanteLegal(), this.getIndiceNuevoRepresentanteLegal());
			
			this.seleccionarFilaTablaRepresentanteLegalActual();
						
			this.actualizarEstadoCeldasBotonesRepresentanteLegal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRepresentanteLegal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activaridentificacionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarapellidopaternoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarapellidomaternoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarprimernombreRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarsegundonombreRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activardireccionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activartelefonoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activartelefonocodigoareaRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarextensionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activartelefonomovilRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarmontoaurorizadoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activaremailRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarestaactivoRepresentanteLegal);	
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activaridclienteRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activaridvalorclientedocumentoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activarid_paisRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setEnabled(isHabilitar && this.representantelegalConstantesFunciones.activaridciudadRepresentanteLegal);
	};
	
	public void setDefaultControlesRepresentanteLegal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRepresentanteLegal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.representantelegalSessionBean.setConGuardarRelaciones(true);			
			this.representantelegalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.setVisible(true);
			
					
		} else {
			//this.representantelegalSessionBean.setConGuardarRelaciones(false);			
			this.representantelegalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRepresentanteLegal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
				if(representantelegalAux.getId().equals(this.iIdNuevoRepresentanteLegal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RepresentanteLegal representantelegalAux:this.representantelegals) {
				if(representantelegalAux.getId().equals(this.iIdNuevoRepresentanteLegal)) {
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
	
	public int getIndiceActualRepresentanteLegal(RepresentanteLegal representantelegal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
				if(representantelegalAux.getId().equals(representantelegal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RepresentanteLegal representantelegalAux:this.representantelegals) {
				if(representantelegalAux.getId().equals(representantelegal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRepresentanteLegal(RepresentanteLegal representantelegalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
				if(representantelegalAux.getRepresentanteLegalOriginal().getId().equals(representantelegalOriginal.getId())) {
					existe=true;
					representantelegalOriginal.setId(representantelegalAux.getId());
					representantelegalOriginal.setVersionRow(representantelegalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RepresentanteLegal representantelegalAux:this.representantelegals) {
				if(representantelegalAux.getRepresentanteLegalOriginal().getId().equals(representantelegalOriginal.getId())) {
					existe=true;
					representantelegalOriginal.setId(representantelegalAux.getId());
					representantelegalOriginal.setVersionRow(representantelegalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRepresentanteLegal(Boolean esParaCancelar) throws Exception {
		representantelegalsAux=new ArrayList<RepresentanteLegal>();
		representantelegalAux=new RepresentanteLegal();
		
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
					if(representantelegalAux.getId()<0) {
						representantelegalsAux.add(representantelegalAux);
					}		
				}
				this.iIdNuevoRepresentanteLegal=0L;
				this.representantelegalLogic.getRepresentanteLegals().removeAll(representantelegalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RepresentanteLegal representantelegalAux:this.representantelegals) {
					if(representantelegalAux.getId()<0) {
						representantelegalsAux.add(representantelegalAux);
					}		
				}
				this.iIdNuevoRepresentanteLegal=0L;
				this.representantelegals.removeAll(representantelegalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRepresentanteLegal 
					&& this.representantelegalLogic.getRepresentanteLegals().size()>0
					) {
					representantelegalAux=this.representantelegalLogic.getRepresentanteLegals().get(this.representantelegalLogic.getRepresentanteLegals().size() - 1);
				
					if(representantelegalAux.getId()<0) {
						this.representantelegalLogic.getRepresentanteLegals().remove(representantelegalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRepresentanteLegal && this.representantelegals.size()>0) {
					representantelegalAux=this.representantelegals.get(this.representantelegals.size() - 1);
				
					if(representantelegalAux.getId()<0) {
						this.representantelegals.remove(representantelegalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRepresentanteLegal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(representantelegal.getId()<0) {
				this.representantelegalLogic.getRepresentanteLegals().remove(this.representantelegal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(representantelegal.getId()<0) {
				this.representantelegals.remove(this.representantelegal);
			}
		}			
	}
	
	public void setEstadosInicialesRepresentanteLegal(List<RepresentanteLegal> representantelegalsAux) throws Exception {
		RepresentanteLegalConstantesFunciones.setEstadosInicialesRepresentanteLegal(representantelegalsAux);
	}
	
	public void setEstadosInicialesRepresentanteLegal(RepresentanteLegal representantelegalAux) throws Exception {
		RepresentanteLegalConstantesFunciones.setEstadosInicialesRepresentanteLegal(representantelegalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRepresentanteLegalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRepresentanteLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRepresentanteLegalActual()) {
				if(!this.isEsNuevoRepresentanteLegal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRepresentanteLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRepresentanteLegal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRepresentanteLegalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Representante Legal ?", "MANTENIMIENTO DE Representante Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRepresentanteLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RepresentanteLegal representantelegal) throws Exception {
		RepresentanteLegalConstantesFunciones.seleccionarAsignar(this.representantelegal,representantelegal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRepresentanteLegal=this.isPermisoActualizarOriginalRepresentanteLegal;
			
			
			this.seleccionarAsignar(representantelegal);
			
			

			idClienteActual=representantelegal.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RepresentanteLegalConstantesFunciones.quitarEspaciosRepresentanteLegal(this.representantelegal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRepresentanteLegal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.representantelegalSessionBean.setsFuncionBusquedaRapida(this.representantelegalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoRepresentanteLegal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRepresentanteLegal(esParaCancelar);				
				this.cancelarNuevoRepresentanteLegal(esParaCancelar);								
			}
			
			this.representantelegal=new RepresentanteLegal();
			
			this.inicializarRepresentanteLegal();
			
			this.actualizarEstadoCeldasBotonesRepresentanteLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRepresentanteLegal() throws Exception {
		try {
			RepresentanteLegalConstantesFunciones.inicializarRepresentanteLegal(this.representantelegal);
			
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
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.representantelegalLogic.getRepresentanteLegals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRepresentanteLegals(String sAccionBusqueda,List<RepresentanteLegal> representantelegalsParaReportes) throws Exception {
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
					sPathReporteFinal="RepresentanteLegal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RepresentanteLegalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RepresentanteLegalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RepresentanteLegal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Representante Legales");		
		parameters.put("busquedapor", RepresentanteLegalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRepresentanteLegal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RepresentanteLegalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RepresentanteLegalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRepresentanteLegal=new JRBeanArrayDataSource(RepresentanteLegalJInternalFrame.TraerRepresentanteLegalBeans(representantelegalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRepresentanteLegal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RepresentanteLegalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RepresentanteLegalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RepresentanteLegalBean.TraerRepresentanteLegalBeans(representantelegalsParaReportes).toArray()));
							
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
				this.generarExcelReporteRepresentanteLegals(sAccionBusqueda,sTipoArchivoReporte,representantelegalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRepresentanteLegals(sAccionBusqueda,sTipoArchivoReporte,representantelegalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRepresentanteLegalActionPerformed(null);
					//this.generarExcelReporteRepresentanteLegals(sAccionBusqueda,sTipoArchivoReporte,representantelegalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRepresentanteLegals(sAccionBusqueda,sTipoArchivoReporte,representantelegalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRepresentanteLegals(sAccionBusqueda,sTipoArchivoReporte,representantelegalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRepresentanteLegals(sAccionBusqueda,sTipoArchivoReporte,representantelegalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRepresentanteLegals(String sAccionBusqueda,String sTipoArchivoReporte,List<RepresentanteLegal> representantelegalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RepresentanteLegals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRepresentanteLegal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RepresentanteLegal representantelegal : representantelegalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RepresentanteLegalConstantesFunciones.generarExcelReporteDataRepresentanteLegal("NORMAL",row,workbook,representantelegal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRepresentanteLegal(String sTipo,Row row,Workbook workbook) {
		
		RepresentanteLegalConstantesFunciones.generarExcelReporteHeaderRepresentanteLegal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRepresentanteLegals(String sAccionBusqueda,String sTipoArchivoReporte,List<RepresentanteLegal> representantelegalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RepresentanteLegals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RepresentanteLegal representantelegal : representantelegalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RepresentanteLegalConstantesFunciones.getRepresentanteLegalDescripcion(representantelegal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.gettipoidentificacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getapellidopaterno());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getapellidomaterno());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getprimernombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getsegundonombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.gettelefonocodigoarea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getextension());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.gettelefonomovil());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getmontoaurorizado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(representantelegal.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(representantelegal.getestaactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRepresentanteLegals(String sAccionBusqueda,String sTipoArchivoReporte,List<RepresentanteLegal> representantelegalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RepresentanteLegal> representantelegalsRespaldo=null;
		
		classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.representantelegalLogic.setDatosCliente(this.datosCliente);
		this.representantelegalLogic.setDatosDeep(this.datosDeep);
		this.representantelegalLogic.setIsConDeep(true);
		
		representantelegalsRespaldo=this.representantelegalLogic.getRepresentanteLegals();
		
		this.representantelegalLogic.setRepresentanteLegals(representantelegalsParaReportes);	
		this.representantelegalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		representantelegalsParaReportes=this.representantelegalLogic.getRepresentanteLegals();
		this.representantelegalLogic.setRepresentanteLegals(representantelegalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RepresentanteLegals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRepresentanteLegal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RepresentanteLegal representantelegal : representantelegalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRepresentanteLegal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RepresentanteLegalConstantesFunciones.generarExcelReporteDataRepresentanteLegal("NORMAL",row,workbook,representantelegal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RepresentanteLegalConstantesFunciones.getRepresentanteLegalDescripcion(representantelegal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRepresentanteLegal() throws Exception {		
		this.startProcessRepresentanteLegal(true);
	}
	
	public void startProcessRepresentanteLegal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRepresentanteLegal ,this.jPanelParametrosReportesRepresentanteLegal, this.jScrollPanelDatosRepresentanteLegal,this.jPanelPaginacionRepresentanteLegal, this.jScrollPanelDatosEdicionRepresentanteLegal, this.jPanelAccionesRepresentanteLegal,this.jPanelAccionesFormularioRepresentanteLegal,this.jmenuBarRepresentanteLegal,this.jmenuBarDetalleRepresentanteLegal,this.jTtoolBarRepresentanteLegal,this.jTtoolBarDetalleRepresentanteLegal);		
		
		final JTabbedPane jTabbedPaneBusquedasRepresentanteLegal=this.jTabbedPaneBusquedasRepresentanteLegal; 
		
		final JPanel jPanelParametrosReportesRepresentanteLegal=this.jPanelParametrosReportesRepresentanteLegal;
		//final JScrollPane jScrollPanelDatosRepresentanteLegal=this.jScrollPanelDatosRepresentanteLegal;
		final JTable jTableDatosRepresentanteLegal=this.jTableDatosRepresentanteLegal;		
		final JPanel jPanelPaginacionRepresentanteLegal=this.jPanelPaginacionRepresentanteLegal;
		//final JScrollPane jScrollPanelDatosEdicionRepresentanteLegal=this.jScrollPanelDatosEdicionRepresentanteLegal;
		final JPanel jPanelAccionesRepresentanteLegal=this.jPanelAccionesRepresentanteLegal;
		
		JPanel jPanelCamposAuxiliarRepresentanteLegal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRepresentanteLegal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			jPanelCamposAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jPanelCamposRepresentanteLegal;
			jPanelAccionesFormularioAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jPanelAccionesFormularioRepresentanteLegal;
		}
		
		final JPanel jPanelCamposRepresentanteLegal=jPanelCamposAuxiliarRepresentanteLegal;
		final JPanel jPanelAccionesFormularioRepresentanteLegal=jPanelAccionesFormularioAuxiliarRepresentanteLegal;
		
		
		final JMenuBar jmenuBarRepresentanteLegal=this.jmenuBarRepresentanteLegal;
		final JToolBar jTtoolBarRepresentanteLegal=this.jTtoolBarRepresentanteLegal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRepresentanteLegal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRepresentanteLegal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			jmenuBarDetalleAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jmenuBarDetalleRepresentanteLegal;
			jTtoolBarDetalleAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jTtoolBarDetalleRepresentanteLegal;
		}
		
		final JMenuBar jmenuBarDetalleRepresentanteLegal=jmenuBarDetalleAuxiliarRepresentanteLegal;
		final JToolBar jTtoolBarDetalleRepresentanteLegal=jTtoolBarDetalleAuxiliarRepresentanteLegal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRepresentanteLegal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRepresentanteLegal;
			processRunnable.jTableDatos=jTableDatosRepresentanteLegal;
			processRunnable.jPanelCampos=jPanelCamposRepresentanteLegal;
			processRunnable.jPanelPaginacion=jPanelPaginacionRepresentanteLegal;
			processRunnable.jPanelAcciones=jPanelAccionesRepresentanteLegal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRepresentanteLegal;
			
			
			processRunnable.jmenuBar=jmenuBarRepresentanteLegal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRepresentanteLegal;
			processRunnable.jTtoolBar=jTtoolBarRepresentanteLegal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRepresentanteLegal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRepresentanteLegal ,jPanelParametrosReportesRepresentanteLegal,jTableDatosRepresentanteLegal, /*jScrollPanelDatosRepresentanteLegal,*/jPanelCamposRepresentanteLegal,jPanelPaginacionRepresentanteLegal, /*jScrollPanelDatosEdicionRepresentanteLegal,*/ jPanelAccionesRepresentanteLegal,jPanelAccionesFormularioRepresentanteLegal,jmenuBarRepresentanteLegal,jmenuBarDetalleRepresentanteLegal,jTtoolBarRepresentanteLegal,jTtoolBarDetalleRepresentanteLegal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRepresentanteLegal ,jPanelParametrosReportesRepresentanteLegal, jScrollPanelDatosRepresentanteLegal,jPanelPaginacionRepresentanteLegal, jScrollPanelDatosEdicionRepresentanteLegal, jPanelAccionesRepresentanteLegal,jPanelAccionesFormularioRepresentanteLegal,jmenuBarRepresentanteLegal,jmenuBarDetalleRepresentanteLegal,jTtoolBarRepresentanteLegal,jTtoolBarDetalleRepresentanteLegal);
						
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
	
	public void finishProcessRepresentanteLegal() {// throws Exception 
		this.finishProcessRepresentanteLegal(true);
	}
	
	public void finishProcessRepresentanteLegal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRepresentanteLegal ,this.jPanelParametrosReportesRepresentanteLegal, this.jScrollPanelDatosRepresentanteLegal,this.jPanelPaginacionRepresentanteLegal, this.jScrollPanelDatosEdicionRepresentanteLegal, this.jPanelAccionesRepresentanteLegal,this.jPanelAccionesFormularioRepresentanteLegal,this.jmenuBarRepresentanteLegal,this.jmenuBarDetalleRepresentanteLegal,this.jTtoolBarRepresentanteLegal,this.jTtoolBarDetalleRepresentanteLegal);		
		
		final JTabbedPane jTabbedPaneBusquedasRepresentanteLegal=this.jTabbedPaneBusquedasRepresentanteLegal; 
		
		final JPanel jPanelParametrosReportesRepresentanteLegal=this.jPanelParametrosReportesRepresentanteLegal;
		//final JScrollPane jScrollPanelDatosRepresentanteLegal=this.jScrollPanelDatosRepresentanteLegal;
		final JTable jTableDatosRepresentanteLegal=this.jTableDatosRepresentanteLegal;		
		final JPanel jPanelPaginacionRepresentanteLegal=this.jPanelPaginacionRepresentanteLegal;
		//final JScrollPane jScrollPanelDatosEdicionRepresentanteLegal=this.jScrollPanelDatosEdicionRepresentanteLegal;
		final JPanel jPanelAccionesRepresentanteLegal=this.jPanelAccionesRepresentanteLegal;
		
		JPanel jPanelCamposAuxiliarRepresentanteLegal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRepresentanteLegal=new JPanel();
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			jPanelCamposAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jPanelCamposRepresentanteLegal;
			jPanelAccionesFormularioAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jPanelAccionesFormularioRepresentanteLegal;
		}
		
		final JPanel jPanelCamposRepresentanteLegal=jPanelCamposAuxiliarRepresentanteLegal;
		final JPanel jPanelAccionesFormularioRepresentanteLegal=jPanelAccionesFormularioAuxiliarRepresentanteLegal;
		
		
		final JMenuBar jmenuBarRepresentanteLegal=this.jmenuBarRepresentanteLegal;		
		final JToolBar jTtoolBarRepresentanteLegal=this.jTtoolBarRepresentanteLegal;
				
		JMenuBar jmenuBarDetalleAuxiliarRepresentanteLegal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRepresentanteLegal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			jmenuBarDetalleAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jmenuBarDetalleRepresentanteLegal;
			jTtoolBarDetalleAuxiliarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jTtoolBarDetalleRepresentanteLegal;		
		}
		
		final JMenuBar jmenuBarDetalleRepresentanteLegal=jmenuBarDetalleAuxiliarRepresentanteLegal;
		final JToolBar jTtoolBarDetalleRepresentanteLegal=jTtoolBarDetalleAuxiliarRepresentanteLegal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRepresentanteLegal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRepresentanteLegal;
			processRunnable.jTableDatos=jTableDatosRepresentanteLegal;
			processRunnable.jPanelCampos=jPanelCamposRepresentanteLegal;
			processRunnable.jPanelPaginacion=jPanelPaginacionRepresentanteLegal;
			processRunnable.jPanelAcciones=jPanelAccionesRepresentanteLegal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRepresentanteLegal;
			
			
			processRunnable.jmenuBar=jmenuBarRepresentanteLegal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRepresentanteLegal;
			processRunnable.jTtoolBar=jTtoolBarRepresentanteLegal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRepresentanteLegal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRepresentanteLegal ,jPanelParametrosReportesRepresentanteLegal, jTableDatosRepresentanteLegal,/*jScrollPanelDatosRepresentanteLegal,*/jPanelCamposRepresentanteLegal,jPanelPaginacionRepresentanteLegal, /*jScrollPanelDatosEdicionRepresentanteLegal,*/ jPanelAccionesRepresentanteLegal,jPanelAccionesFormularioRepresentanteLegal,jmenuBarRepresentanteLegal,jmenuBarDetalleRepresentanteLegal,jTtoolBarRepresentanteLegal,jTtoolBarDetalleRepresentanteLegal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRepresentanteLegal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRepresentanteLegal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRepresentanteLegal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRepresentanteLegal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRepresentanteLegal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRepresentanteLegal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRepresentanteLegal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRepresentanteLegal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRepresentanteLegal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.representantelegalConstantesFunciones.getsFinalQueryRepresentanteLegal();
		String  finalQueryPaginacionTodos=this.representantelegalConstantesFunciones.getsFinalQueryRepresentanteLegal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RepresentanteLegalConstantesFunciones.getArrayColumnasGlobalesNoRepresentanteLegal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RepresentanteLegalConstantesFunciones.getArrayColumnasGlobalesRepresentanteLegal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RepresentanteLegalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.representantelegalsEliminados= new ArrayList<RepresentanteLegal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRepresentanteLegal();
		
				///*RepresentanteLegalSessionBean*/this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			
			if(this.representantelegalSessionBean==null) {
				this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
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
					this.iNumeroPaginacion=RepresentanteLegalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RepresentanteLegalConstantesFunciones.getClassesForeignKeysOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/representantelegal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			representantelegalsAux= new ArrayList<RepresentanteLegal>();
			
				
			representantelegalLogic.setDatosCliente(this.datosCliente);
			representantelegalLogic.setDatosDeep(this.datosDeep);
			representantelegalLogic.setIsConDeep(true);
			
			
			representantelegalLogic.getRepresentanteLegalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					representantelegalLogic.getTodosRepresentanteLegals(finalQueryGlobal,pagination);
					
					//representantelegalLogic.getTodosRepresentanteLegalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(representantelegalLogic.getRepresentanteLegals()==null|| representantelegalLogic.getRepresentanteLegals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							representantelegalsAux= new ArrayList<RepresentanteLegal>();
							representantelegalsAux.addAll(representantelegalLogic.getRepresentanteLegals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegalsAux= new ArrayList<RepresentanteLegal>();
							representantelegalsAux.addAll(representantelegals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							representantelegalLogic.getTodosRepresentanteLegals(finalQueryGlobal+"",this.pagination);												
							
							//representantelegalLogic.getTodosRepresentanteLegalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRepresentanteLegals("Todos",representantelegalLogic.getRepresentanteLegals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());					
							representantelegalLogic.getRepresentanteLegals().addAll(representantelegalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegals=new ArrayList<RepresentanteLegal>();
							representantelegals.addAll(representantelegalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRepresentanteLegal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRepresentanteLegal=this.idActual;
				
				} else if(this.idRepresentanteLegalActual!=null && this.idRepresentanteLegalActual!=0L) {
					idRepresentanteLegal=idRepresentanteLegalActual;
				}
				
					
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndicePorId(idRepresentanteLegal);
				
				this.representantelegals=new ArrayList<RepresentanteLegal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					representantelegalLogic.getEntity(idRepresentanteLegal);
					
					//representantelegalLogic.getEntityWithConnection(idRepresentanteLegal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
					representantelegalLogic.getRepresentanteLegals().add(representantelegalLogic.getRepresentanteLegal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.representantelegals=new ArrayList<RepresentanteLegal>();
					this.representantelegals.add(representantelegal);
				}
				
				if(representantelegalLogic.getRepresentanteLegal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					representantelegalLogic.getRepresentanteLegalsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=representantelegalLogic.getRepresentanteLegals()==null||representantelegalLogic.getRepresentanteLegals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=representantelegals==null|| representantelegals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalsAux=new ArrayList<RepresentanteLegal>();
						representantelegalsAux.addAll(representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegalsAux=new ArrayList<RepresentanteLegal>();
							representantelegalsAux.addAll(representantelegals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							representantelegalLogic.getRepresentanteLegalsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRepresentanteLegals("FK_IdCiudad",representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRepresentanteLegals("FK_IdCiudad",representantelegals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
						representantelegalLogic.getRepresentanteLegals().addAll(representantelegalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegals=new ArrayList<RepresentanteLegal>();
							representantelegals.addAll(representantelegalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					representantelegalLogic.getRepresentanteLegalsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=representantelegalLogic.getRepresentanteLegals()==null||representantelegalLogic.getRepresentanteLegals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=representantelegals==null|| representantelegals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalsAux=new ArrayList<RepresentanteLegal>();
						representantelegalsAux.addAll(representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegalsAux=new ArrayList<RepresentanteLegal>();
							representantelegalsAux.addAll(representantelegals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							representantelegalLogic.getRepresentanteLegalsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRepresentanteLegals("FK_IdCliente",representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRepresentanteLegals("FK_IdCliente",representantelegals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
						representantelegalLogic.getRepresentanteLegals().addAll(representantelegalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegals=new ArrayList<RepresentanteLegal>();
							representantelegals.addAll(representantelegalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					representantelegalLogic.getRepresentanteLegalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=representantelegalLogic.getRepresentanteLegals()==null||representantelegalLogic.getRepresentanteLegals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=representantelegals==null|| representantelegals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalsAux=new ArrayList<RepresentanteLegal>();
						representantelegalsAux.addAll(representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegalsAux=new ArrayList<RepresentanteLegal>();
							representantelegalsAux.addAll(representantelegals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							representantelegalLogic.getRepresentanteLegalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRepresentanteLegals("FK_IdPais",representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRepresentanteLegals("FK_IdPais",representantelegals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
						representantelegalLogic.getRepresentanteLegals().addAll(representantelegalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegals=new ArrayList<RepresentanteLegal>();
							representantelegals.addAll(representantelegalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteDocumento")) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdValorClienteDocumento(idvalorclientedocumentoFK_IdValorClienteDocumento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					representantelegalLogic.getRepresentanteLegalsFK_IdValorClienteDocumento(finalQueryGlobal,pagination,idvalorclientedocumentoFK_IdValorClienteDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdValorClienteDocumento(idvalorclientedocumentoFK_IdValorClienteDocumento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdValorClienteDocumento(idvalorclientedocumentoFK_IdValorClienteDocumento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=representantelegalLogic.getRepresentanteLegals()==null||representantelegalLogic.getRepresentanteLegals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=representantelegals==null|| representantelegals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalsAux=new ArrayList<RepresentanteLegal>();
						representantelegalsAux.addAll(representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegalsAux=new ArrayList<RepresentanteLegal>();
							representantelegalsAux.addAll(representantelegals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							representantelegalLogic.getRepresentanteLegalsFK_IdValorClienteDocumento(finalQueryGlobal,pagination,idvalorclientedocumentoFK_IdValorClienteDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdValorClienteDocumento(idvalorclientedocumentoFK_IdValorClienteDocumento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RepresentanteLegalConstantesFunciones.getDetalleIndiceFK_IdValorClienteDocumento(idvalorclientedocumentoFK_IdValorClienteDocumento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRepresentanteLegals("FK_IdValorClienteDocumento",representantelegalLogic.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRepresentanteLegals("FK_IdValorClienteDocumento",representantelegals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
						representantelegalLogic.getRepresentanteLegals().addAll(representantelegalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegals=new ArrayList<RepresentanteLegal>();
							representantelegals.addAll(representantelegalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRepresentanteLegal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRepresentanteLegal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=representantelegalLogic.getRepresentanteLegals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=representantelegals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=representantelegalLogic.getRepresentanteLegals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=representantelegals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RepresentanteLegal representantelegal) {
		Boolean permite=true;
		
		if(this.representantelegal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RepresentanteLegalConstantesFunciones.getOrderByListaRepresentanteLegal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RepresentanteLegalConstantesFunciones.getOrderByListaRepresentanteLegal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RepresentanteLegal representantelegal:representantelegalLogic.getRepresentanteLegals()) {
				if(representantelegal.getsType().equals(Constantes2.S_TOTALES)) {
					representantelegalTotales=representantelegal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RepresentanteLegal representantelegal:this.representantelegals) {
				if(representantelegal.getsType().equals(Constantes2.S_TOTALES)) {
					representantelegalTotales=representantelegal;
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
			this.representantelegalAux=new RepresentanteLegal();
			this.representantelegalAux.setsType(Constantes2.S_TOTALES);
			this.representantelegalAux.setIsNew(false);
			this.representantelegalAux.setIsChanged(false);
			this.representantelegalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RepresentanteLegalConstantesFunciones.TotalizarValoresFilaRepresentanteLegal(this.representantelegalLogic.getRepresentanteLegals(),this.representantelegalAux);
				
				this.representantelegalLogic.getRepresentanteLegals().add(this.representantelegalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RepresentanteLegalConstantesFunciones.TotalizarValoresFilaRepresentanteLegal(this.representantelegals,this.representantelegalAux);
				
				this.representantelegals.add(this.representantelegalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		representantelegalTotales=new RepresentanteLegal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.representantelegalLogic.getRepresentanteLegals().remove(representantelegalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.representantelegals.remove(representantelegalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		representantelegalTotales=new RepresentanteLegal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RepresentanteLegal representantelegal:representantelegalLogic.getRepresentanteLegals()) {
				if(representantelegal.getsType().equals(Constantes2.S_TOTALES)) {
					representantelegalTotales=representantelegal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RepresentanteLegalConstantesFunciones.TotalizarValoresFilaRepresentanteLegal(this.representantelegalLogic.getRepresentanteLegals(),representantelegalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RepresentanteLegal representantelegal:this.representantelegals) {
				if(representantelegal.getsType().equals(Constantes2.S_TOTALES)) {
					representantelegalTotales=representantelegal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RepresentanteLegalConstantesFunciones.TotalizarValoresFilaRepresentanteLegal(this.representantelegals,representantelegalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRepresentanteLegalsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRepresentanteLegalsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRepresentanteLegalsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRepresentanteLegalsFK_IdValorClienteDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRepresentanteLegalsFK_IdCiudad(String sFinalQuery,Long idciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					representantelegalLogic.getRepresentanteLegalsFK_IdCiudad(sFinalQuery,this.pagination,idciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRepresentanteLegalsFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					representantelegalLogic.getRepresentanteLegalsFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRepresentanteLegalsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					representantelegalLogic.getRepresentanteLegalsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRepresentanteLegalsFK_IdValorClienteDocumento(String sFinalQuery,Long idvalorclientedocumento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					representantelegalLogic.getRepresentanteLegalsFK_IdValorClienteDocumento(sFinalQuery,this.pagination,idvalorclientedocumento);
				
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
	
	public void inicializarPermisosRepresentanteLegal() {
		this.isPermisoTodoRepresentanteLegal=false;
		this.isPermisoNuevoRepresentanteLegal=false;
		this.isPermisoActualizarRepresentanteLegal=false;
		this.isPermisoActualizarOriginalRepresentanteLegal=false;
		this.isPermisoEliminarRepresentanteLegal=false;
		this.isPermisoGuardarCambiosRepresentanteLegal=false;
		this.isPermisoConsultaRepresentanteLegal=false;
		this.isPermisoBusquedaRepresentanteLegal=false;
		this.isPermisoReporteRepresentanteLegal=false;		
		this.isPermisoOrdenRepresentanteLegal=false;		
		this.isPermisoPaginacionMedioRepresentanteLegal=false;		
		this.isPermisoPaginacionAltoRepresentanteLegal=false;
		this.isPermisoPaginacionTodoRepresentanteLegal=false;
		this.isPermisoCopiarRepresentanteLegal=false;		
		this.isPermisoVerFormRepresentanteLegal=false;		
		this.isPermisoDuplicarRepresentanteLegal=false;		
		this.isPermisoOrdenRepresentanteLegal=false;		
	}
	
	public void setPermisosUsuarioRepresentanteLegal(Boolean isPermiso) {
		this.isPermisoTodoRepresentanteLegal=isPermiso;
		this.isPermisoNuevoRepresentanteLegal=isPermiso;
		this.isPermisoActualizarRepresentanteLegal=isPermiso;
		this.isPermisoActualizarOriginalRepresentanteLegal=isPermiso;
		this.isPermisoEliminarRepresentanteLegal=isPermiso;
		this.isPermisoGuardarCambiosRepresentanteLegal=isPermiso;
		this.isPermisoConsultaRepresentanteLegal=isPermiso;
		this.isPermisoBusquedaRepresentanteLegal=isPermiso;
		this.isPermisoReporteRepresentanteLegal=isPermiso;
		this.isPermisoOrdenRepresentanteLegal=isPermiso;		
		this.isPermisoPaginacionMedioRepresentanteLegal=isPermiso;		
		this.isPermisoPaginacionAltoRepresentanteLegal=isPermiso;		
		this.isPermisoPaginacionTodoRepresentanteLegal=isPermiso;		
		this.isPermisoCopiarRepresentanteLegal=isPermiso;		
		this.isPermisoVerFormRepresentanteLegal=isPermiso;		
		this.isPermisoDuplicarRepresentanteLegal=isPermiso;
		this.isPermisoOrdenRepresentanteLegal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRepresentanteLegal(Boolean isPermiso) {
		//this.isPermisoTodoRepresentanteLegal=isPermiso;
		this.isPermisoNuevoRepresentanteLegal=isPermiso;
		this.isPermisoActualizarRepresentanteLegal=isPermiso;
		this.isPermisoActualizarOriginalRepresentanteLegal=isPermiso;
		this.isPermisoEliminarRepresentanteLegal=isPermiso;
		this.isPermisoGuardarCambiosRepresentanteLegal=isPermiso;
		//this.isPermisoConsultaRepresentanteLegal=isPermiso;
		//this.isPermisoBusquedaRepresentanteLegal=isPermiso;
		//this.isPermisoReporteRepresentanteLegal=isPermiso;
		//this.isPermisoOrdenRepresentanteLegal=isPermiso;		
		//this.isPermisoPaginacionMedioRepresentanteLegal=isPermiso;		
		//this.isPermisoPaginacionAltoRepresentanteLegal=isPermiso;		
		//this.isPermisoPaginacionTodoRepresentanteLegal=isPermiso;		
		//this.isPermisoCopiarRepresentanteLegal=isPermiso;		
		//this.isPermisoDuplicarRepresentanteLegal=isPermiso;
		//this.isPermisoOrdenRepresentanteLegal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRepresentanteLegalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RepresentanteLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRepresentanteLegal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRepresentanteLegalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRepresentanteLegalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRepresentanteLegalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRepresentanteLegalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRepresentanteLegal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RepresentanteLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RepresentanteLegalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRepresentanteLegal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRepresentanteLegal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRepresentanteLegal=this.isPermisoActualizarRepresentanteLegal;
			this.isPermisoEliminarRepresentanteLegal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRepresentanteLegal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRepresentanteLegal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRepresentanteLegal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRepresentanteLegal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRepresentanteLegal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRepresentanteLegal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRepresentanteLegal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRepresentanteLegal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRepresentanteLegal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRepresentanteLegal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRepresentanteLegal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRepresentanteLegal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRepresentanteLegal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRepresentanteLegal.setToolTipText(this.jTableDatosRepresentanteLegal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRepresentanteLegal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRepresentanteLegal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RepresentanteLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RepresentanteLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRepresentanteLegal() throws Exception {
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
	public void inicializarCombosForeignKeyRepresentanteLegalListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipoidentificacionsForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRepresentanteLegalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RepresentanteLegalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRepresentanteLegalListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoIdentificacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRepresentanteLegalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RepresentanteLegalParameterReturnGeneral representantelegalReturnGeneral=new RepresentanteLegalParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.representantelegalConstantesFunciones.cargaridclienteRepresentanteLegal)
					 || (this.esRecargarFks && this.representantelegalConstantesFunciones.cargaridclienteRepresentanteLegal)) {

					if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+representantelegalSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoIdentificacion="";

				if(((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0) && this.representantelegalConstantesFunciones.cargaridvalorclientedocumentoRepresentanteLegal)
					 || (this.esRecargarFks && this.representantelegalConstantesFunciones.cargaridvalorclientedocumentoRepresentanteLegal)) {

					if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIdentificacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIdentificacion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIdentificacion, "");
						finalQueryGlobalTipoIdentificacion+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIdentificacion=" WHERE " + ConstantesSql.ID + "="+representantelegalSessionBean.getlidTipoIdentificacionActual();
					}
				} else {
					finalQueryGlobalTipoIdentificacion="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.representantelegalConstantesFunciones.cargarid_paisRepresentanteLegal)
					 || (this.esRecargarFks && this.representantelegalConstantesFunciones.cargarid_paisRepresentanteLegal)) {

					if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+representantelegalSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.representantelegalConstantesFunciones.cargaridciudadRepresentanteLegal)
					 || (this.esRecargarFks && this.representantelegalConstantesFunciones.cargaridciudadRepresentanteLegal)) {

					if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+representantelegalSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				representantelegalReturnGeneral=representantelegalLogic.cargarCombosLoteForeignKeyRepresentanteLegal(finalQueryGlobalCliente,finalQueryGlobalTipoIdentificacion,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=representantelegalReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoIdentificacion.equals("NONE")) {
				this.tipoidentificacionsForeignKey=representantelegalReturnGeneral.gettipoidentificacionsForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=representantelegalReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=representantelegalReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRepresentanteLegal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoIdentificacion();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.representantelegalSessionBean==null) {
				this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoIdentificacion()throws Exception {
		try {

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				TipoIdentificacion tipoidentificacion=new TipoIdentificacion();
				TipoIdentificacionConstantesFunciones.setTipoIdentificacionDescripcion(tipoidentificacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoidentificacion.setId(null);

				if(!TipoIdentificacionConstantesFunciones.ExisteEnLista(this.tipoidentificacionsForeignKey,tipoidentificacion,true)) {

					this.tipoidentificacionsForeignKey.add(0,tipoidentificacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.representantelegalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRepresentanteLegal()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRepresentanteLegal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboCiudad=sFinalQueryCombo;

			this.ciudadsForeignKey=new ArrayList<Ciudad>();
			this.cargarCombosForeignKeyCiudad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.addItemListener(new ComboBoxItemListener(this,"id_paisRepresentanteLegal"));
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.addFocusListener(new ComboBoxFocusListener(this,"id_paisRepresentanteLegal"));
					}
				} else {
					if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.addActionListener(new ComboBoxActionListener(this,"id_paisRepresentanteLegal"));
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.addFocusListener(new ComboBoxFocusListener(this,"id_paisRepresentanteLegal"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisRepresentanteLegal"));

						this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisRepresentanteLegal"));

					} else {
						this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisRepresentanteLegal"));

						this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisRepresentanteLegal"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyRepresentanteLegal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRepresentanteLegal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRepresentanteLegal(RepresentanteLegal representantelegal)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(representantelegal.getidcliente(),false,"Formulario");
			this.setActualTipoIdentificacionForeignKey(representantelegal.getidvalorclientedocumento(),false,"Formulario");
			this.setActualPaisForeignKey(representantelegal.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(representantelegal.getidciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRepresentanteLegal(RepresentanteLegal representantelegal,String sTipoEvento)throws Exception {	
		try {
			
			

				if(representantelegal.getCliente()!=null && !sTipoEvento.equals("idclienteRepresentanteLegal")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(representantelegal.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRepresentanteLegal()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.representantelegalConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoIdentificacionForeignKey(this.representantelegalConstantesFunciones.getidvalorclientedocumento(),false,"Formulario");
			this.setActualPaisForeignKey(this.representantelegalConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.representantelegalConstantesFunciones.getidciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRepresentanteLegal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRepresentanteLegal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRepresentanteLegal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRepresentanteLegal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRepresentanteLegal()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRepresentanteLegal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRepresentanteLegal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormRepresentanteLegalPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormRepresentanteLegalidciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormRepresentanteLegalidciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.representantelegal,jComboBoxGenericoCiudad);
			}

			if(this.representantelegal.getid_pais()!=null && this.representantelegal.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.representantelegal.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.representantelegal.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public RepresentanteLegalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RepresentanteLegalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RepresentanteLegalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.representantelegalSessionBean=new RepresentanteLegalSessionBean(); 
		this.representantelegalConstantesFunciones=new RepresentanteLegalConstantesFunciones(); 
		this.representantelegalBean=new RepresentanteLegal();//(this.representantelegalConstantesFunciones); 		
		this.representantelegalReturnGeneral=new RepresentanteLegalParameterReturnGeneral(); 
		
		this.representantelegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.representantelegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RepresentanteLegalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RepresentanteLegalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RepresentanteLegalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRepresentanteLegal(true);
			
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
			
			this.representantelegalConstantesFunciones=new RepresentanteLegalConstantesFunciones(); 
			this.representantelegalBean=new RepresentanteLegal();//this.representantelegalConstantesFunciones); 			
			this.representantelegalReturnGeneral=new RepresentanteLegalParameterReturnGeneral(); 
		
			RepresentanteLegalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Representante Legal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.representantelegal=new RepresentanteLegal();
			this.representantelegals = new ArrayList<RepresentanteLegal>();
			this.representantelegalsAux = new ArrayList<RepresentanteLegal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic=new RepresentanteLegalLogic();
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			//this.representantelegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.representantelegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRepresentanteLegal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRepresentanteLegal);	
					}
					
					if(this.jInternalFrameImportacionRepresentanteLegal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRepresentanteLegal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRepresentanteLegal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRepresentanteLegal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRepresentanteLegal);
				this.jInternalFrameDetalleFormRepresentanteLegal.setVisible(false);
				this.jInternalFrameDetalleFormRepresentanteLegal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRepresentanteLegal);
					this.jInternalFrameReporteDinamicoRepresentanteLegal.setVisible(false);
					this.jInternalFrameReporteDinamicoRepresentanteLegal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRepresentanteLegal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRepresentanteLegal);
					this.jInternalFrameImportacionRepresentanteLegal.setVisible(false);
					this.jInternalFrameImportacionRepresentanteLegal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRepresentanteLegal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRepresentanteLegal);
					this.jInternalFrameOrderByRepresentanteLegal.setVisible(false);
					this.jInternalFrameOrderByRepresentanteLegal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRepresentanteLegalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RepresentanteLegalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.representantelegalReturnGeneral=new RepresentanteLegalParameterReturnGeneral();
			
			this.representantelegalParameterGeneral=new RepresentanteLegalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.representantelegalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RepresentanteLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RepresentanteLegalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.representantelegalSessionBean.getEsGuardarRelacionado(),this.representantelegalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RepresentanteLegalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.representantelegalSessionBean.getEsGuardarRelacionado(),this.representantelegalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaDuplicarRepresentanteLegal=true;
			this.isVisibilidadCeldaCopiarRepresentanteLegal=true;
			this.isVisibilidadCeldaVerFormRepresentanteLegal=true;
			this.isVisibilidadCeldaOrdenRepresentanteLegal=true;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
			this.isVisibilidadCeldaModificarRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=false;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdValorClienteDocumento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRepresentanteLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRepresentanteLegal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRepresentanteLegal(false);
			
			this.setPermisosUsuarioRepresentanteLegal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.representantelegalSessionBean.getEsGuardarRelacionado() 
				|| (this.representantelegalSessionBean.getEsGuardarRelacionado() && this.representantelegalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRepresentanteLegalClasesRelacionadas();
			}
			
			if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRepresentanteLegalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRepresentanteLegal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRepresentanteLegal();
			}
			
			if(!this.isPermisoBusquedaRepresentanteLegal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRepresentanteLegal,this.isPermisoPaginacionMedioRepresentanteLegal,this.isPermisoPaginacionTodoRepresentanteLegal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RepresentanteLegalConstantesFunciones.getTiposSeleccionarRepresentanteLegal());
				
				this.tiposColumnasSelect=RepresentanteLegalConstantesFunciones.getTiposSeleccionarRepresentanteLegal(true);
				
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
			//if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRepresentanteLegal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRepresentanteLegal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRepresentanteLegal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRepresentanteLegal() ;
			
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
			
			this.clienteLogic=new ClienteLogic();
			this.tipoidentificacionLogic=new TipoIdentificacionLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				representantelegalImplementable= (RepresentanteLegalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RepresentanteLegalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				representantelegalImplementableHome= (RepresentanteLegalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RepresentanteLegalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.representantelegals= new ArrayList<RepresentanteLegal>();
			this.representantelegalsEliminados= new ArrayList<RepresentanteLegal>();
						
			this.isEsNuevoRepresentanteLegal=false;
			this.esParaAccionDesdeFormularioRepresentanteLegal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRepresentanteLegal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRepresentanteLegal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RepresentanteLegalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RepresentanteLegalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRepresentanteLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRepresentanteLegal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRepresentanteLegal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRepresentanteLegal();
			}
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRepresentanteLegal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRepresentanteLegal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRepresentanteLegal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRepresentanteLegal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RepresentanteLegal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRepresentanteLegal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRepresentanteLegal")) {
				iIndex=this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRepresentanteLegal();	
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
	
	public void cargarCombosForeignKeyRepresentanteLegal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRepresentanteLegal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRepresentanteLegal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRepresentanteLegalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRepresentanteLegal();
		
		this.cargarCombosFrameForeignKeyRepresentanteLegal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRepresentanteLegal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRepresentanteLegal();
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

	public void cargarCombosForeignKeyTipoIdentificacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIdentificacion(this.tipoidentificacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRepresentanteLegalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			
			if(jTableDatosRepresentanteLegal.getRowCount()>=1) {
				jTableDatosRepresentanteLegal.removeRowSelectionInterval(0, jTableDatosRepresentanteLegal.getRowCount()-1);						
			}
			
			this.isEsNuevoRepresentanteLegal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRepresentanteLegal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRepresentanteLegal(true);			
			//this.representantelegal=new RepresentanteLegal();
			//this.representantelegal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRepresentanteLegal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRepresentanteLegal() ;
			
			if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRepresentanteLegal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.representantelegal);	
			this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);				
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RepresentanteLegal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRepresentanteLegalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRepresentanteLegal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRepresentanteLegal.getSelectedRows().length;			
			}
			
			representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRepresentanteLegal--;			
				//RepresentanteLegal representantelegalAux= new RepresentanteLegal();			
				//representantelegalAux.setId(this.iIdNuevoRepresentanteLegal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RepresentanteLegal representantelegalOrigen=new RepresentanteLegal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RepresentanteLegal representantelegalOrigen : representantelegalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							representantelegalOrigen =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							representantelegalOrigen =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRepresentanteLegal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.representantelegal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRepresentanteLegal(representantelegalOrigen,this.representantelegal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.representantelegalLogic.getRepresentanteLegals().add(this.representantelegalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.representantelegals.add(this.representantelegalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
				
				this.jTableDatosRepresentanteLegal.setRowSelectionInterval(this.getIndiceNuevoRepresentanteLegal(), this.getIndiceNuevoRepresentanteLegal());
				
				int iLastRow =  this.jTableDatosRepresentanteLegal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRepresentanteLegal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRepresentanteLegal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRepresentanteLegal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();									
		
			RepresentanteLegal representantelegalOrigen=new RepresentanteLegal();
			RepresentanteLegal representantelegalDestino=new RepresentanteLegal();
				
			representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRepresentanteLegal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || representantelegalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRepresentanteLegal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalOrigen =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						representantelegalOrigen =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						representantelegalDestino =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						representantelegalDestino =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				representantelegalOrigen =representantelegalsSeleccionados.get(0);
				representantelegalDestino =representantelegalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRepresentanteLegal(representantelegalOrigen,representantelegalDestino,true,false);
				
				representantelegalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(representantelegalDestino,representantelegalLogic.getRepresentanteLegals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(representantelegalDestino,representantelegals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
				
				//this.jTableDatosRepresentanteLegal.setRowSelectionInterval(this.getIndiceNuevoRepresentanteLegal(), this.getIndiceNuevoRepresentanteLegal());
				
				int iLastRow =  this.jTableDatosRepresentanteLegal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRepresentanteLegal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRepresentanteLegal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRepresentanteLegal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRepresentanteLegal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRepresentanteLegal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRepresentanteLegal.setVisible(!isVisible);
			this.jPanelPaginacionRepresentanteLegal.setVisible(!isVisible);
			this.jPanelAccionesRepresentanteLegal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRepresentanteLegal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRepresentanteLegal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRepresentanteLegal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRepresentanteLegal();
			
			this.abrirFrameOrderByRepresentanteLegal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRepresentanteLegal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRepresentanteLegal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRepresentanteLegal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRepresentanteLegal.isMaximum()) {
					this.jInternalFrameDetalleFormRepresentanteLegal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRepresentanteLegal.setSize(this.jInternalFrameDetalleFormRepresentanteLegal.iWidthFormulario,this.jInternalFrameDetalleFormRepresentanteLegal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRepresentanteLegal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRepresentanteLegal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRepresentanteLegal.isMaximum()) {
						this.jInternalFrameDetalleFormRepresentanteLegal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRepresentanteLegal.jContentPaneDetalleRepresentanteLegal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRepresentanteLegal.jContentPaneDetalleRepresentanteLegal.getWidth(),RepresentanteLegalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRepresentanteLegal.jContentPaneDetalleRepresentanteLegal.getWidth(),RepresentanteLegalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRepresentanteLegal.jContentPaneDetalleRepresentanteLegal.getWidth(),RepresentanteLegalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRepresentanteLegal.setVisible(true);
	        this.jInternalFrameDetalleFormRepresentanteLegal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRepresentanteLegal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRepresentanteLegal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRepresentanteLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRepresentanteLegal,false,this);
				} else {
					this.jInternalFrameOrderByRepresentanteLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRepresentanteLegal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRepresentanteLegal);
				this.jInternalFrameOrderByRepresentanteLegal.setVisible(false);
				this.jInternalFrameOrderByRepresentanteLegal.setSelected(false);
				
				this.jInternalFrameOrderByRepresentanteLegal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRepresentanteLegal"));
				
				this.inicializarActualizarBindingTablaOrderByRepresentanteLegal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRepresentanteLegal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRepresentanteLegal==null) {
				
				this.jInternalFrameImportacionRepresentanteLegal=new ImportacionJInternalFrame(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRepresentanteLegal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRepresentanteLegal);
				this.jInternalFrameImportacionRepresentanteLegal.setVisible(false);
				this.jInternalFrameImportacionRepresentanteLegal.setSelected(false);


				this.jInternalFrameImportacionRepresentanteLegal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRepresentanteLegal"));
				this.jInternalFrameImportacionRepresentanteLegal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRepresentanteLegal"));
				this.jInternalFrameImportacionRepresentanteLegal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRepresentanteLegal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRepresentanteLegal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRepresentanteLegal==null) {
				this.jInternalFrameReporteDinamicoRepresentanteLegal=new ReporteDinamicoJInternalFrame(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRepresentanteLegal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRepresentanteLegal);
				this.jInternalFrameReporteDinamicoRepresentanteLegal.setVisible(false);
				this.jInternalFrameReporteDinamicoRepresentanteLegal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRepresentanteLegal"));
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRepresentanteLegal"));
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRepresentanteLegal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRepresentanteLegal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRepresentanteLegal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRepresentanteLegal);
			
	       	this.jInternalFrameDetalleFormRepresentanteLegal.setVisible(false);
	        this.jInternalFrameDetalleFormRepresentanteLegal.setSelected(false);
			
			//this.jInternalFrameDetalleFormRepresentanteLegal.dispose();
			//this.jInternalFrameDetalleFormRepresentanteLegal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRepresentanteLegal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRepresentanteLegal.setVisible(true);
	        this.jInternalFrameReporteDinamicoRepresentanteLegal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRepresentanteLegal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRepresentanteLegal.setVisible(true);
	        this.jInternalFrameImportacionRepresentanteLegal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRepresentanteLegal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRepresentanteLegal.setVisible(true);
	        this.jInternalFrameOrderByRepresentanteLegal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRepresentanteLegal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRepresentanteLegal.setVisible(false);
	        this.jInternalFrameOrderByRepresentanteLegal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRepresentanteLegal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRepresentanteLegal.setVisible(false);
	        this.jInternalFrameReporteDinamicoRepresentanteLegal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRepresentanteLegal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRepresentanteLegal.setVisible(false);
	        this.jInternalFrameImportacionRepresentanteLegal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRepresentanteLegal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRepresentanteLegal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRepresentanteLegal(true);
			//this.isEsNuevoRepresentanteLegal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRepresentanteLegal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRepresentanteLegal(false) ;
			
			if(representantelegalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRepresentanteLegal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRepresentanteLegal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRepresentanteLegalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRepresentanteLegal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRepresentanteLegal(true);
			//this.isEsNuevoRepresentanteLegal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.representantelegal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRepresentanteLegal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRepresentanteLegal(false) ;
			
			if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRepresentanteLegal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRepresentanteLegal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.representantelegalConstantesFunciones.cargaridclienteRepresentanteLegal) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingRepresentanteLegal(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaidcliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRepresentanteLegal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIdentificacion(List<TipoIdentificacion> tipoidentificacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoIdentificacion=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));
		TableCellEditor tableCellEditorTipoIdentificacion =tableColumnTipoIdentificacion.getCellEditor();

		TipoIdentificacionTableCell tipoidentificacionTableCellFk=(TipoIdentificacionTableCell)tableCellEditorTipoIdentificacion;

		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.settipoidentificacionsForeignKey(tipoidentificacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRepresentanteLegal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoidentificacionTableCellFk.setRowActual(intSelectedRow);
			//tipoidentificacionTableCellFk.settipoidentificacionsForeignKeyActual(tipoidentificacionsForeignKey);
		//}


		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.RecargarTipoIdentificacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRepresentanteLegal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRepresentanteLegal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRepresentanteLegal(false);
			
			//if(!this.isEsNuevoRepresentanteLegal) {								
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				
			}
			
			if(this.permiteMantenimiento(this.representantelegal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRepresentanteLegal=true;
					this.inicializarActualizarBindingTablaRepresentanteLegal(false);
					this.isEsNuevoRepresentanteLegal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRepresentanteLegal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRepresentanteLegal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRepresentanteLegal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRepresentanteLegal(false);
				
				this.habilitarDeshabilitarControlesRepresentanteLegal(false);
			
												
				
				if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRepresentanteLegal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRepresentanteLegalActionPerformed(evt,representantelegalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRepresentanteLegal(this.representantelegal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRepresentanteLegal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,representantelegalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.representantelegal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				this.representantelegal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				this.representantelegal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.representantelegal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RepresentanteLegalModel) this.jTableDatosRepresentanteLegal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRepresentanteLegal=true;
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
				this.isEsNuevoRepresentanteLegal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRepresentanteLegal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRepresentanteLegal(false);
				
				this.habilitarDeshabilitarControlesRepresentanteLegal(false);
				
				
				
				if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRepresentanteLegal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRepresentanteLegal.getRowCount()>=1) {
				jTableDatosRepresentanteLegal.removeRowSelectionInterval(0, jTableDatosRepresentanteLegal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRepresentanteLegal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRepresentanteLegal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRepresentanteLegal(false) ;
			
			this.isEsNuevoRepresentanteLegal=false;
			
			if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRepresentanteLegal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRepresentanteLegal(false);
				
				//SI ES MANUAL
				if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRepresentanteLegal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRepresentanteLegal--;			
			//RepresentanteLegal representantelegalAux= new RepresentanteLegal();			
			//representantelegalAux.setId(this.iIdNuevoRepresentanteLegal);
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRepresentanteLegal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
			
			this.representantelegal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.representantelegalLogic.getRepresentanteLegals().add(this.representantelegalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.representantelegals.add(this.representantelegalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			
			this.jTableDatosRepresentanteLegal.setRowSelectionInterval(this.getIndiceNuevoRepresentanteLegal(), this.getIndiceNuevoRepresentanteLegal());
			
			int iLastRow =  this.jTableDatosRepresentanteLegal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRepresentanteLegal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRepresentanteLegal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRepresentanteLegal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRepresentanteLegal(false);
			
			//SI ES MANUAL
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRepresentanteLegal();
			}
			
			//this.abrirFrameTreeRepresentanteLegal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Representante LegalES ?", "MANTENIMIENTO DE Representante Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRepresentanteLegal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRepresentanteLegal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.representantelegalReturnGeneral=representantelegalLogic.procesarImportacionRepresentanteLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.representantelegalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRepresentanteLegalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRepresentanteLegal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRepresentanteLegal.setFileImportacion(this.jInternalFrameImportacionRepresentanteLegal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRepresentanteLegal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRepresentanteLegal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRepresentanteLegal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRepresentanteLegal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		

		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RepresentanteLegalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RepresentanteLegalBaseDesign.jrxml";
			
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
			
			this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIdentificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIdentificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIdentificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIdentificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoPaterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoPaterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoPaterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoPaterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoMaterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoMaterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoMaterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoMaterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_imerNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_imerNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_imerNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_imerNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gundoNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gundoNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gundoNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gundoNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCodigoArea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCodigoArea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCodigoArea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCodigoArea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EXTENSION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tension_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tension_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tension_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tension_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoMovil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoMovil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoMovil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoMovil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoAurorizado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoAurorizado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoAurorizado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoAurorizado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoria="idvalorclientedocumento";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="idciudad";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO:
					sNombreCampoCategoria="apellidopaterno";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO:
					sNombreCampoCategoria="apellidomaterno";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE:
					sNombreCampoCategoria="primernombre";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE:
					sNombreCampoCategoria="segundonombre";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoria="telefonocodigoarea";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EXTENSION:
					sNombreCampoCategoria="extension";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoria="telefonomovil";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO:
					sNombreCampoCategoria="montoaurorizado";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="estaactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoriaValor="idvalorclientedocumento";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="idciudad";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO:
					sNombreCampoCategoriaValor="apellidopaterno";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO:
					sNombreCampoCategoriaValor="apellidomaterno";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE:
					sNombreCampoCategoriaValor="primernombre";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE:
					sNombreCampoCategoriaValor="segundonombre";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoriaValor="telefonocodigoarea";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EXTENSION:
					sNombreCampoCategoriaValor="extension";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoriaValor="telefonomovil";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO:
					sNombreCampoCategoriaValor="montoaurorizado";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="estaactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientedocumento");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idciudad");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido Paterno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidopaterno");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido Materno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidomaterno");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Primer Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"primernombre");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Segundo Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"segundonombre");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Codigo Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonocodigoarea");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EXTENSION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Extension",sNombreCampoCategoria,sNombreCampoCategoriaValor,"extension");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Movil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonomovil");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Aurorizado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"montoaurorizado");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estaactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RepresentanteLegals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.gettipoidentificacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getapellidopaterno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getapellidomaterno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getprimernombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getsegundonombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.gettelefonocodigoarea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EXTENSION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getextension());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.gettelefonomovil());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getmontoaurorizado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(RepresentanteLegal representantelegal:representantelegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(representantelegal.getestaactivo());
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
			//	this.getFilaCabeceraExportarExcelRepresentanteLegal(row);				
			//	iRow++;
			//}				
			
			//for(RepresentanteLegal representantelegalAux:representantelegalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRepresentanteLegal(representantelegalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
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
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRepresentanteLegal(false);
			
			//SI ES MANUAL
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRepresentanteLegal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRepresentanteLegal(false);
			
			//SI ES MANUAL
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRepresentanteLegal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRepresentanteLegal(false);
			
			//SI ES MANUAL
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRepresentanteLegal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRepresentanteLegal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRepresentanteLegal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRepresentanteLegal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRepresentanteLegal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRepresentanteLegal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRepresentanteLegal.setMinimumSize(dimensionMinimum);
		this.jTableDatosRepresentanteLegal.setMaximumSize(dimensionMaximum);
		this.jTableDatosRepresentanteLegal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRepresentanteLegal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRepresentanteLegal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRepresentanteLegal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRepresentanteLegal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRepresentanteLegal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRepresentanteLegal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRepresentanteLegal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRepresentanteLegal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRepresentanteLegal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRepresentanteLegal();
		
		this.inicializarActualizarBindingBotonesManualRepresentanteLegal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRepresentanteLegal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRepresentanteLegal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRepresentanteLegal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRepresentanteLegal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRepresentanteLegal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRepresentanteLegal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRepresentanteLegal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxPostAccionNuevoRepresentanteLegal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxPostAccionSinCerrarRepresentanteLegal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxPostAccionSinMensajeRepresentanteLegal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRepresentanteLegal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRepresentanteLegal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRepresentanteLegal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
				this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxPostAccionNuevoRepresentanteLegal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxPostAccionSinCerrarRepresentanteLegal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxPostAccionSinMensajeRepresentanteLegal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRepresentanteLegal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRepresentanteLegal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRepresentanteLegal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRepresentanteLegal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRepresentanteLegal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRepresentanteLegal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRepresentanteLegal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRepresentanteLegal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRepresentanteLegal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRepresentanteLegal(Boolean esInicializar) throws Exception {
		try	{	
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRepresentanteLegal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRepresentanteLegal() throws Exception {
		try	{
			if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRepresentanteLegal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRepresentanteLegal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRepresentanteLegal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRepresentanteLegal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRepresentanteLegal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRepresentanteLegal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRepresentanteLegal.addItem(reporte);
			}
			
			
			if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRepresentanteLegal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRepresentanteLegal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRepresentanteLegal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRepresentanteLegal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRepresentanteLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRepresentanteLegal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRepresentanteLegal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRepresentanteLegal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRepresentanteLegal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
				
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RepresentanteLegalConstantesFunciones.getTiposSeleccionarRepresentanteLegal(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RepresentanteLegalConstantesFunciones.getTiposSeleccionarRepresentanteLegal(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RepresentanteLegalConstantesFunciones.getTiposSeleccionarRepresentanteLegal(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRepresentanteLegal.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRepresentanteLegal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidciudadFK_IdCiudadRepresentanteLegal.getSelectedItem()!=null){this.idciudadFK_IdCiudad=((Ciudad)this.jComboBoxidciudadFK_IdCiudadRepresentanteLegal.getSelectedItem()).getId();}
		if(this.jComboBoxidclienteFK_IdClienteRepresentanteLegal.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteRepresentanteLegal.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisRepresentanteLegal.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.getSelectedItem()!=null){this.idvalorclientedocumentoFK_IdValorClienteDocumento=((TipoIdentificacion)this.jComboBoxidvalorclientedocumentoFK_IdValorClienteDocumentoRepresentanteLegal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRepresentanteLegal(Boolean esInicializar) throws Exception {				
		if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRepresentanteLegal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRepresentanteLegal() throws Exception {
		this.inicializarActualizarBindingTablaRepresentanteLegal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRepresentanteLegal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRepresentanteLegalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRepresentanteLegal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=representantelegalLogic.getRepresentanteLegals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=representantelegals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRepresentanteLegal.setModel(new RepresentanteLegalModel(this.representantelegalLogic.getRepresentanteLegals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRepresentanteLegal.setModel(new RepresentanteLegalModel(this.representantelegals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRepresentanteLegal!=null && this.jInternalFrameOrderByRepresentanteLegal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRepresentanteLegal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO,representantelegalConstantesFunciones.resaltarSeleccionarRepresentanteLegal,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO,representantelegalConstantesFunciones.resaltarSeleccionarRepresentanteLegal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_ID));

		if(this.representantelegalConstantesFunciones.mostraridRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.representantelegalConstantesFunciones.resaltaridRepresentanteLegal,this.representantelegalConstantesFunciones.activaridRepresentanteLegal,iSizeTabla,this,true,"idRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltaridRepresentanteLegal,this.representantelegalConstantesFunciones.activaridRepresentanteLegal,this,true,"idRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE));

		if(this.representantelegalConstantesFunciones.mostraridclienteRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.representantelegalConstantesFunciones.resaltaridclienteRepresentanteLegal,this,this.representantelegalConstantesFunciones.activaridclienteRepresentanteLegal,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.representantelegalConstantesFunciones.resaltaridclienteRepresentanteLegal,this,this.representantelegalConstantesFunciones.activaridclienteRepresentanteLegal,true,"idclienteRepresentanteLegal","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));

		if(this.representantelegalConstantesFunciones.mostraridvalorclientedocumentoRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.representantelegalConstantesFunciones.resaltaridvalorclientedocumentoRepresentanteLegal,this,this.representantelegalConstantesFunciones.activaridvalorclientedocumentoRepresentanteLegal,iSizeTabla));
			tableColumn.setCellEditor(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.representantelegalConstantesFunciones.resaltaridvalorclientedocumentoRepresentanteLegal,this,this.representantelegalConstantesFunciones.activaridvalorclientedocumentoRepresentanteLegal,true,"idvalorclientedocumentoRepresentanteLegal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDPAIS));

		if(this.representantelegalConstantesFunciones.mostrarid_paisRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.representantelegalConstantesFunciones.resaltarid_paisRepresentanteLegal,this,this.representantelegalConstantesFunciones.activarid_paisRepresentanteLegal,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.representantelegalConstantesFunciones.resaltarid_paisRepresentanteLegal,this,this.representantelegalConstantesFunciones.activarid_paisRepresentanteLegal,true,"id_paisRepresentanteLegal","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD));

		if(this.representantelegalConstantesFunciones.mostraridciudadRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.representantelegalConstantesFunciones.resaltaridciudadRepresentanteLegal,this,this.representantelegalConstantesFunciones.activaridciudadRepresentanteLegal,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.representantelegalConstantesFunciones.resaltaridciudadRepresentanteLegal,this,this.representantelegalConstantesFunciones.activaridciudadRepresentanteLegal,true,"idciudadRepresentanteLegal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.representantelegalConstantesFunciones.mostraridentificacionRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltaridentificacionRepresentanteLegal,this.representantelegalConstantesFunciones.activaridentificacionRepresentanteLegal,iSizeTabla,this,true,"identificacionRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltaridentificacionRepresentanteLegal,this.representantelegalConstantesFunciones.activaridentificacionRepresentanteLegal,this,true,"identificacionRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO));

		if(this.representantelegalConstantesFunciones.mostrarapellidopaternoRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltarapellidopaternoRepresentanteLegal,this.representantelegalConstantesFunciones.activarapellidopaternoRepresentanteLegal,iSizeTabla,this,true,"apellidopaternoRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltarapellidopaternoRepresentanteLegal,this.representantelegalConstantesFunciones.activarapellidopaternoRepresentanteLegal,this,true,"apellidopaternoRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO));

		if(this.representantelegalConstantesFunciones.mostrarapellidomaternoRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltarapellidomaternoRepresentanteLegal,this.representantelegalConstantesFunciones.activarapellidomaternoRepresentanteLegal,iSizeTabla,this,true,"apellidomaternoRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltarapellidomaternoRepresentanteLegal,this.representantelegalConstantesFunciones.activarapellidomaternoRepresentanteLegal,this,true,"apellidomaternoRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE));

		if(this.representantelegalConstantesFunciones.mostrarprimernombreRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltarprimernombreRepresentanteLegal,this.representantelegalConstantesFunciones.activarprimernombreRepresentanteLegal,iSizeTabla,this,true,"primernombreRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltarprimernombreRepresentanteLegal,this.representantelegalConstantesFunciones.activarprimernombreRepresentanteLegal,this,true,"primernombreRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE));

		if(this.representantelegalConstantesFunciones.mostrarsegundonombreRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltarsegundonombreRepresentanteLegal,this.representantelegalConstantesFunciones.activarsegundonombreRepresentanteLegal,iSizeTabla,this,true,"segundonombreRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltarsegundonombreRepresentanteLegal,this.representantelegalConstantesFunciones.activarsegundonombreRepresentanteLegal,this,true,"segundonombreRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_DIRECCION));

		if(this.representantelegalConstantesFunciones.mostrardireccionRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltardireccionRepresentanteLegal,this.representantelegalConstantesFunciones.activardireccionRepresentanteLegal,iSizeTabla,this,true,"direccionRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltardireccionRepresentanteLegal,this.representantelegalConstantesFunciones.activardireccionRepresentanteLegal,this,true,"direccionRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_TELEFONO));

		if(this.representantelegalConstantesFunciones.mostrartelefonoRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltartelefonoRepresentanteLegal,this.representantelegalConstantesFunciones.activartelefonoRepresentanteLegal,iSizeTabla,this,true,"telefonoRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltartelefonoRepresentanteLegal,this.representantelegalConstantesFunciones.activartelefonoRepresentanteLegal,this,true,"telefonoRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA));

		if(this.representantelegalConstantesFunciones.mostrartelefonocodigoareaRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltartelefonocodigoareaRepresentanteLegal,this.representantelegalConstantesFunciones.activartelefonocodigoareaRepresentanteLegal,iSizeTabla,this,true,"telefonocodigoareaRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltartelefonocodigoareaRepresentanteLegal,this.representantelegalConstantesFunciones.activartelefonocodigoareaRepresentanteLegal,this,true,"telefonocodigoareaRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_EXTENSION));

		if(this.representantelegalConstantesFunciones.mostrarextensionRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_EXTENSION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltarextensionRepresentanteLegal,this.representantelegalConstantesFunciones.activarextensionRepresentanteLegal,iSizeTabla,this,true,"extensionRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltarextensionRepresentanteLegal,this.representantelegalConstantesFunciones.activarextensionRepresentanteLegal,this,true,"extensionRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL));

		if(this.representantelegalConstantesFunciones.mostrartelefonomovilRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltartelefonomovilRepresentanteLegal,this.representantelegalConstantesFunciones.activartelefonomovilRepresentanteLegal,iSizeTabla,this,true,"telefonomovilRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltartelefonomovilRepresentanteLegal,this.representantelegalConstantesFunciones.activartelefonomovilRepresentanteLegal,this,true,"telefonomovilRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO));

		if(this.representantelegalConstantesFunciones.mostrarmontoaurorizadoRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.representantelegalConstantesFunciones.resaltarmontoaurorizadoRepresentanteLegal,this.representantelegalConstantesFunciones.activarmontoaurorizadoRepresentanteLegal,iSizeTabla,this,true,"montoaurorizadoRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltarmontoaurorizadoRepresentanteLegal,this.representantelegalConstantesFunciones.activarmontoaurorizadoRepresentanteLegal,this,true,"montoaurorizadoRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_EMAIL));

		if(this.representantelegalConstantesFunciones.mostraremailRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.representantelegalConstantesFunciones.resaltaremailRepresentanteLegal,this.representantelegalConstantesFunciones.activaremailRepresentanteLegal,iSizeTabla,this,true,"emailRepresentanteLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.representantelegalConstantesFunciones.resaltaremailRepresentanteLegal,this.representantelegalConstantesFunciones.activaremailRepresentanteLegal,this,true,"emailRepresentanteLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.representantelegalConstantesFunciones.mostrarestaactivoRepresentanteLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.representantelegalConstantesFunciones.resaltarestaactivoRepresentanteLegal,this.representantelegalConstantesFunciones.activarestaactivoRepresentanteLegal,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.representantelegalConstantesFunciones.resaltarestaactivoRepresentanteLegal,this.representantelegalConstantesFunciones.activarestaactivoRepresentanteLegal,this,true,"estaactivoRepresentanteLegal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RepresentanteLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.representantelegalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.representantelegalSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.representantelegalSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRepresentanteLegal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.representantelegalSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.representantelegalSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRepresentanteLegal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.representantelegalSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.representantelegalSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRepresentanteLegal.addColumn(tableColumn);
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
			
			this.jTableDatosRepresentanteLegal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRepresentanteLegal.moveColumn(this.jTableDatosRepresentanteLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRepresentanteLegal.moveColumn(this.jTableDatosRepresentanteLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRepresentanteLegal.moveColumn(this.jTableDatosRepresentanteLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRepresentanteLegal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRepresentanteLegal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRepresentanteLegal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRepresentanteLegal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRepresentanteLegal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRepresentanteLegal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRepresentanteLegal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=representantelegalLogic.getRepresentanteLegals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=representantelegals.size()-1;
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
		//this.jTableDatosRepresentanteLegal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRepresentanteLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRepresentanteLegal();
			
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
				
				//this.isEsNuevoRepresentanteLegal=false;
					
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
				if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRepresentanteLegal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRepresentanteLegal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRepresentanteLegal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.representantelegal.getsType().equals("DUPLICADO")
				   || this.representantelegal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRepresentanteLegal=true;
				
				} else {
					this.isEsNuevoRepresentanteLegal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.representantelegalSessionBean.getEsGuardarRelacionado()) {
					if(this.representantelegal.getId()>=0 && !this.representantelegal.getIsNew()) {						
						this.isEsNuevoRepresentanteLegal=false;
						
					} else {
						this.isEsNuevoRepresentanteLegal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRepresentanteLegal(esRelaciones);						
				
				this.seleccionarRepresentanteLegal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.representantelegal.getId()<0) {
					this.isEsNuevoRepresentanteLegal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRepresentanteLegal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRepresentanteLegal(evt,rowIndex);
				}	
				
				if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RepresentanteLegal: " + this.dDif); 
					}
				}								
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRepresentanteLegal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.representantelegal)) {
					if(this.representantelegal.getId()>0) {
						this.representantelegal.setIsDeleted(true);
						
						this.representantelegalsEliminados.add(this.representantelegal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.representantelegalLogic.getRepresentanteLegals().remove(this.representantelegal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.representantelegals.remove(this.representantelegal);				
					}
					
					
					((RepresentanteLegalModel) this.jTableDatosRepresentanteLegal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRepresentanteLegal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRepresentanteLegal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRepresentanteLegal) {
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRepresentanteLegal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRepresentanteLegal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRepresentanteLegal(this.representantelegal);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.representantelegalConstantesFunciones.cargaridclienteRepresentanteLegal || this.representantelegalConstantesFunciones.event_dependidclienteRepresentanteLegal) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.representantelegal.getidcliente());
									//this.inicializarActualizarBindingRepresentanteLegal(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(representantelegal.getCliente()!=null) {
							this.clientesForeignKey.add(representantelegal.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.representantelegal.getidcliente(),false,"Formulario");

					//TipoIdentificacion
					if(!this.representantelegalConstantesFunciones.cargaridvalorclientedocumentoRepresentanteLegal || this.representantelegalConstantesFunciones.event_dependidvalorclientedocumentoRepresentanteLegal) {
						//this.cargarCombosTipoIdentificacionsForeignKeyLista(" where id="+this.representantelegal.getidvalorclientedocumento());
									//this.inicializarActualizarBindingRepresentanteLegal(false,false);
						this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

						if(representantelegal.getTipoIdentificacion()!=null) {
							this.tipoidentificacionsForeignKey.add(representantelegal.getTipoIdentificacion());
						}

						this.addItemDefectoCombosForeignKeyTipoIdentificacion();
						this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");
					}
					this.setActualTipoIdentificacionForeignKey(this.representantelegal.getidvalorclientedocumento(),false,"Formulario");

					//Pais
					if(!this.representantelegalConstantesFunciones.cargarid_paisRepresentanteLegal || this.representantelegalConstantesFunciones.event_dependid_paisRepresentanteLegal) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.representantelegal.getid_pais());
									//this.inicializarActualizarBindingRepresentanteLegal(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(representantelegal.getPais()!=null) {
							this.paissForeignKey.add(representantelegal.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.representantelegal.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.representantelegalConstantesFunciones.cargaridciudadRepresentanteLegal || this.representantelegalConstantesFunciones.event_dependidciudadRepresentanteLegal) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.representantelegal.getidciudad());
									//this.inicializarActualizarBindingRepresentanteLegal(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(representantelegal.getCiudad()!=null) {
							this.ciudadsForeignKey.add(representantelegal.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.representantelegal.getidciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRepresentanteLegal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRepresentanteLegal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRepresentanteLegal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRepresentanteLegal(RepresentanteLegal representantelegal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRepresentanteLegal(representantelegal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRepresentanteLegal(RepresentanteLegal representantelegal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRepresentanteLegal(representantelegal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRepresentanteLegal(representantelegal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRepresentanteLegal(representantelegal);
	}
	
	public void setVariablesObjetoActualToFormularioRepresentanteLegal(RepresentanteLegal representantelegal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setText(representantelegal.getId().toString());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setText(representantelegal.getidentificacion());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setText(representantelegal.getapellidopaterno());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setText(representantelegal.getapellidomaterno());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setText(representantelegal.getprimernombre());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setText(representantelegal.getsegundonombre());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setText(representantelegal.getdireccion());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setText(representantelegal.gettelefono());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setText(representantelegal.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setText(representantelegal.getextension());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setText(representantelegal.gettelefonomovil());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setText(representantelegal.getmontoaurorizado().toString());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setText(representantelegal.getemail());
			this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setSelected(representantelegal.getestaactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RepresentanteLegal representantelegalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,representantelegalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RepresentanteLegal representantelegalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				representantelegalLocal=this.representantelegal;
			} else {
				representantelegalLocal=this.representantelegalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(representantelegalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRepresentanteLegal(representantelegalLocal,true);
					
					if(representantelegalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(representantelegalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(representantelegalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRepresentanteLegal(RepresentanteLegal representantelegal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRepresentanteLegal(representantelegal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(representantelegal);
	}
	
	public void setVariablesFormularioToObjetoActualRepresentanteLegal(RepresentanteLegal representantelegal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRepresentanteLegal(representantelegal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRepresentanteLegal(RepresentanteLegal representantelegal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.getText()==null || this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.getText()=="" || this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.getText()=="Id") {
				this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setText("0");
			}

			if(conColumnasBase) {representantelegal.setId(Long.parseLong(this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelIdRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setidentificacion(this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidentificacionRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setapellidopaterno(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelapellidopaternoRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setapellidomaterno(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelapellidomaternoRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setprimernombre(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelprimernombreRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setsegundonombre(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelsegundonombreRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setdireccion(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeldireccionRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.settelefono(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonoRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.settelefonocodigoarea(this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonocodigoareaRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setextension(this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_EXTENSION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelextensionRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.settelefonomovil(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabeltelefonomovilRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setmontoaurorizado(Double.parseDouble(this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelmontoaurorizadoRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setemail(this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelemailRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			representantelegal.setestaactivo(this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRepresentanteLegal.jLabelestaactivoRepresentanteLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRepresentanteLegal(RepresentanteLegal representantelegalBean,RepresentanteLegal representantelegal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && representantelegalBean.getidcliente()!=null && !representantelegalBean.getidcliente().equals(-1L))) {representantelegal.setidcliente(representantelegalBean.getidcliente());}
			if(conDefault || (!conDefault && representantelegalBean.getidvalorclientedocumento()!=null && !representantelegalBean.getidvalorclientedocumento().equals(-1L))) {representantelegal.setidvalorclientedocumento(representantelegalBean.getidvalorclientedocumento());}
			if(conDefault || (!conDefault && representantelegalBean.getid_pais()!=null && !representantelegalBean.getid_pais().equals(-1L))) {representantelegal.setid_pais(representantelegalBean.getid_pais());}
			if(conDefault || (!conDefault && representantelegalBean.getidciudad()!=null && !representantelegalBean.getidciudad().equals(-1L))) {representantelegal.setidciudad(representantelegalBean.getidciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRepresentanteLegal(RepresentanteLegal representantelegalOrigen,RepresentanteLegal representantelegal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && representantelegalOrigen.getId()!=null && !representantelegalOrigen.getId().equals(0L))) {representantelegal.setId(representantelegalOrigen.getId());}}
			if(conDefault || (!conDefault && representantelegalOrigen.getidcliente()!=null && !representantelegalOrigen.getidcliente().equals(-1L))) {representantelegal.setidcliente(representantelegalOrigen.getidcliente());}
			if(conDefault || (!conDefault && representantelegalOrigen.getidvalorclientedocumento()!=null && !representantelegalOrigen.getidvalorclientedocumento().equals(-1L))) {representantelegal.setidvalorclientedocumento(representantelegalOrigen.getidvalorclientedocumento());}
			if(conDefault || (!conDefault && representantelegalOrigen.getid_pais()!=null && !representantelegalOrigen.getid_pais().equals(-1L))) {representantelegal.setid_pais(representantelegalOrigen.getid_pais());}
			if(conDefault || (!conDefault && representantelegalOrigen.getidciudad()!=null && !representantelegalOrigen.getidciudad().equals(-1L))) {representantelegal.setidciudad(representantelegalOrigen.getidciudad());}
			if(conDefault || (!conDefault && representantelegalOrigen.getidentificacion()!=null && !representantelegalOrigen.getidentificacion().equals(""))) {representantelegal.setidentificacion(representantelegalOrigen.getidentificacion());}
			if(conDefault || (!conDefault && representantelegalOrigen.getapellidopaterno()!=null && !representantelegalOrigen.getapellidopaterno().equals(""))) {representantelegal.setapellidopaterno(representantelegalOrigen.getapellidopaterno());}
			if(conDefault || (!conDefault && representantelegalOrigen.getapellidomaterno()!=null && !representantelegalOrigen.getapellidomaterno().equals(""))) {representantelegal.setapellidomaterno(representantelegalOrigen.getapellidomaterno());}
			if(conDefault || (!conDefault && representantelegalOrigen.getprimernombre()!=null && !representantelegalOrigen.getprimernombre().equals(""))) {representantelegal.setprimernombre(representantelegalOrigen.getprimernombre());}
			if(conDefault || (!conDefault && representantelegalOrigen.getsegundonombre()!=null && !representantelegalOrigen.getsegundonombre().equals(""))) {representantelegal.setsegundonombre(representantelegalOrigen.getsegundonombre());}
			if(conDefault || (!conDefault && representantelegalOrigen.getdireccion()!=null && !representantelegalOrigen.getdireccion().equals(""))) {representantelegal.setdireccion(representantelegalOrigen.getdireccion());}
			if(conDefault || (!conDefault && representantelegalOrigen.gettelefono()!=null && !representantelegalOrigen.gettelefono().equals(""))) {representantelegal.settelefono(representantelegalOrigen.gettelefono());}
			if(conDefault || (!conDefault && representantelegalOrigen.gettelefonocodigoarea()!=null && !representantelegalOrigen.gettelefonocodigoarea().equals(""))) {representantelegal.settelefonocodigoarea(representantelegalOrigen.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && representantelegalOrigen.getextension()!=null && !representantelegalOrigen.getextension().equals(""))) {representantelegal.setextension(representantelegalOrigen.getextension());}
			if(conDefault || (!conDefault && representantelegalOrigen.gettelefonomovil()!=null && !representantelegalOrigen.gettelefonomovil().equals(""))) {representantelegal.settelefonomovil(representantelegalOrigen.gettelefonomovil());}
			if(conDefault || (!conDefault && representantelegalOrigen.getmontoaurorizado()!=null && !representantelegalOrigen.getmontoaurorizado().equals(0.0))) {representantelegal.setmontoaurorizado(representantelegalOrigen.getmontoaurorizado());}
			if(conDefault || (!conDefault && representantelegalOrigen.getemail()!=null && !representantelegalOrigen.getemail().equals(""))) {representantelegal.setemail(representantelegalOrigen.getemail());}
			if(conDefault || (!conDefault && representantelegalOrigen.getestaactivo()!=null && !representantelegalOrigen.getestaactivo().equals(false))) {representantelegal.setestaactivo(representantelegalOrigen.getestaactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRepresentanteLegal(RepresentanteLegal representantelegal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setText(representantelegal.getId().toString());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setText(representantelegal.getidentificacion());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setText(representantelegal.getapellidopaterno());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setText(representantelegal.getapellidomaterno());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setText(representantelegal.getprimernombre());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setText(representantelegal.getsegundonombre());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setText(representantelegal.getdireccion());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setText(representantelegal.gettelefono());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setText(representantelegal.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setText(representantelegal.getextension());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setText(representantelegal.gettelefonomovil());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setText(representantelegal.getmontoaurorizado().toString());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setText(representantelegal.getemail());
			this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setSelected(representantelegal.getestaactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRepresentanteLegal(RepresentanteLegalBean representantelegalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setText(representantelegalBean.getId().toString());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setText(representantelegalBean.getidentificacion());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setText(representantelegalBean.getapellidopaterno());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setText(representantelegalBean.getapellidomaterno());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setText(representantelegalBean.getprimernombre());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setText(representantelegalBean.getsegundonombre());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setText(representantelegalBean.getdireccion());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setText(representantelegalBean.gettelefono());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setText(representantelegalBean.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setText(representantelegalBean.getextension());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setText(representantelegalBean.gettelefonomovil());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setText(representantelegalBean.getmontoaurorizado().toString());
			this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setText(representantelegalBean.getemail());
			this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setSelected(representantelegalBean.getestaactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRepresentanteLegal(RepresentanteLegalParameterReturnGeneral representantelegalReturnGeneral,RepresentanteLegalBean representantelegalBean,Boolean conDefault) throws Exception { 
		try {
			RepresentanteLegal representantelegalLocal=new RepresentanteLegal();
			
			representantelegalLocal=representantelegalReturnGeneral.getRepresentanteLegal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && representantelegalLocal.getId()!=null && !representantelegalLocal.getId().equals(0L))) {representantelegalBean.setId(representantelegalLocal.getId());}}
			if(conDefault || (!conDefault && representantelegalLocal.getidcliente()!=null && !representantelegalLocal.getidcliente().equals(-1L))) {representantelegalBean.setidcliente(representantelegalLocal.getidcliente());}
			if(conDefault || (!conDefault && representantelegalLocal.getidvalorclientedocumento()!=null && !representantelegalLocal.getidvalorclientedocumento().equals(-1L))) {representantelegalBean.setidvalorclientedocumento(representantelegalLocal.getidvalorclientedocumento());}
			if(conDefault || (!conDefault && representantelegalLocal.getid_pais()!=null && !representantelegalLocal.getid_pais().equals(-1L))) {representantelegalBean.setid_pais(representantelegalLocal.getid_pais());}
			if(conDefault || (!conDefault && representantelegalLocal.getidciudad()!=null && !representantelegalLocal.getidciudad().equals(-1L))) {representantelegalBean.setidciudad(representantelegalLocal.getidciudad());}
			if(conDefault || (!conDefault && representantelegalLocal.getidentificacion()!=null && !representantelegalLocal.getidentificacion().equals(""))) {representantelegalBean.setidentificacion(representantelegalLocal.getidentificacion());}
			if(conDefault || (!conDefault && representantelegalLocal.getapellidopaterno()!=null && !representantelegalLocal.getapellidopaterno().equals(""))) {representantelegalBean.setapellidopaterno(representantelegalLocal.getapellidopaterno());}
			if(conDefault || (!conDefault && representantelegalLocal.getapellidomaterno()!=null && !representantelegalLocal.getapellidomaterno().equals(""))) {representantelegalBean.setapellidomaterno(representantelegalLocal.getapellidomaterno());}
			if(conDefault || (!conDefault && representantelegalLocal.getprimernombre()!=null && !representantelegalLocal.getprimernombre().equals(""))) {representantelegalBean.setprimernombre(representantelegalLocal.getprimernombre());}
			if(conDefault || (!conDefault && representantelegalLocal.getsegundonombre()!=null && !representantelegalLocal.getsegundonombre().equals(""))) {representantelegalBean.setsegundonombre(representantelegalLocal.getsegundonombre());}
			if(conDefault || (!conDefault && representantelegalLocal.getdireccion()!=null && !representantelegalLocal.getdireccion().equals(""))) {representantelegalBean.setdireccion(representantelegalLocal.getdireccion());}
			if(conDefault || (!conDefault && representantelegalLocal.gettelefono()!=null && !representantelegalLocal.gettelefono().equals(""))) {representantelegalBean.settelefono(representantelegalLocal.gettelefono());}
			if(conDefault || (!conDefault && representantelegalLocal.gettelefonocodigoarea()!=null && !representantelegalLocal.gettelefonocodigoarea().equals(""))) {representantelegalBean.settelefonocodigoarea(representantelegalLocal.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && representantelegalLocal.getextension()!=null && !representantelegalLocal.getextension().equals(""))) {representantelegalBean.setextension(representantelegalLocal.getextension());}
			if(conDefault || (!conDefault && representantelegalLocal.gettelefonomovil()!=null && !representantelegalLocal.gettelefonomovil().equals(""))) {representantelegalBean.settelefonomovil(representantelegalLocal.gettelefonomovil());}
			if(conDefault || (!conDefault && representantelegalLocal.getmontoaurorizado()!=null && !representantelegalLocal.getmontoaurorizado().equals(0.0))) {representantelegalBean.setmontoaurorizado(representantelegalLocal.getmontoaurorizado());}
			if(conDefault || (!conDefault && representantelegalLocal.getemail()!=null && !representantelegalLocal.getemail().equals(""))) {representantelegalBean.setemail(representantelegalLocal.getemail());}
			if(conDefault || (!conDefault && representantelegalLocal.getestaactivo()!=null && !representantelegalLocal.getestaactivo().equals(false))) {representantelegalBean.setestaactivo(representantelegalLocal.getestaactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRepresentanteLegalGenerico(Long idRepresentanteLegalSeleccionado,JComboBox jComboBoxRepresentanteLegal,List<RepresentanteLegal> representantelegalsLocal)throws Exception {
		try {
			RepresentanteLegal  representantelegalTemp=null;

			for(RepresentanteLegal representantelegalAux:representantelegalsLocal) {
				if(representantelegalAux.getId()!=null && representantelegalAux.getId().equals(idRepresentanteLegalSeleccionado)) {
					representantelegalTemp=representantelegalAux;
					break;
				}
			}

			jComboBoxRepresentanteLegal.setSelectedItem(representantelegalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRepresentanteLegalGenerico(JComboBox jComboBoxRepresentanteLegal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRepresentanteLegal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRepresentanteLegal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRepresentanteLegal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRepresentanteLegal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRepresentanteLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRepresentanteLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			representantelegal=(RepresentanteLegal) representantelegalLogic.getRepresentanteLegals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			representantelegal =(RepresentanteLegal) representantelegals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!representantelegal.getIsNew() && !representantelegal.getIsChanged() && !representantelegal.getIsDeleted()) {
				sDescripcion=representantelegal.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=representantelegal.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoIdentificacion")) {
			//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
			if(!representantelegal.getIsNew() && !representantelegal.getIsChanged() && !representantelegal.getIsDeleted()) {
				sDescripcion=representantelegal.gettipoidentificacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
				sDescripcion=representantelegal.gettipoidentificacion_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!representantelegal.getIsNew() && !representantelegal.getIsChanged() && !representantelegal.getIsDeleted()) {
				sDescripcion=representantelegal.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=representantelegal.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!representantelegal.getIsNew() && !representantelegal.getIsChanged() && !representantelegal.getIsDeleted()) {
				sDescripcion=representantelegal.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=representantelegal.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RepresentanteLegal representantelegalRow=new RepresentanteLegal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			representantelegalRow=(RepresentanteLegal) representantelegalLogic.getRepresentanteLegals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			representantelegalRow=(RepresentanteLegal) representantelegals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRepresentanteLegal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal));			
			this.jButtonDuplicarRepresentanteLegal.setVisible((this.isVisibilidadCeldaDuplicarRepresentanteLegal && this.isPermisoDuplicarRepresentanteLegal));			
			this.jButtonCopiarRepresentanteLegal.setVisible((this.isVisibilidadCeldaCopiarRepresentanteLegal && this.isPermisoCopiarRepresentanteLegal));
			this.jButtonVerFormRepresentanteLegal.setVisible((this.isVisibilidadCeldaVerFormRepresentanteLegal && this.isPermisoVerFormRepresentanteLegal));
			
			this.jButtonAbrirOrderByRepresentanteLegal.setVisible((this.isVisibilidadCeldaOrdenRepresentanteLegal && this.isPermisoOrdenRepresentanteLegal));			
			
			this.jButtonNuevoRelacionesRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal));			
			this.jButtonNuevoGuardarCambiosRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarRepresentanteLegal.setVisible((this.isVisibilidadCeldaModificarRepresentanteLegal && this.isPermisoActualizarRepresentanteLegal));	
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarRepresentanteLegal.setVisible((this.isVisibilidadCeldaActualizarRepresentanteLegal && this.isPermisoActualizarRepresentanteLegal));	
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarRepresentanteLegal.setVisible((this.isVisibilidadCeldaEliminarRepresentanteLegal && this.isPermisoEliminarRepresentanteLegal));
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarRepresentanteLegal.setVisible(this.isVisibilidadCeldaCancelarRepresentanteLegal);							
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));			
			
			}
						
			this.jButtonGuardarCambiosTablaRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal));						
			this.jButtonDuplicarToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaDuplicarRepresentanteLegal && this.isPermisoDuplicarRepresentanteLegal));						
			this.jButtonCopiarToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaCopiarRepresentanteLegal && this.isPermisoCopiarRepresentanteLegal));			
			this.jButtonVerFormToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaVerFormRepresentanteLegal && this.isPermisoVerFormRepresentanteLegal));			
			this.jButtonAbrirOrderByToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaOrdenRepresentanteLegal && this.isPermisoOrdenRepresentanteLegal));
			this.jButtonNuevoRelacionesToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal));			
			this.jButtonNuevoGuardarCambiosToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));			
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaModificarRepresentanteLegal && this.isPermisoActualizarRepresentanteLegal));	
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaActualizarRepresentanteLegal  && this.isPermisoActualizarRepresentanteLegal));	
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaEliminarRepresentanteLegal && this.isPermisoEliminarRepresentanteLegal));
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarToolBarRepresentanteLegal.setVisible(this.isVisibilidadCeldaCancelarRepresentanteLegal);				
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal));			
			this.jMenuItemDuplicarRepresentanteLegal.setVisible((this.isVisibilidadCeldaDuplicarRepresentanteLegal && this.isPermisoDuplicarRepresentanteLegal));			
			this.jMenuItemCopiarRepresentanteLegal.setVisible((this.isVisibilidadCeldaCopiarRepresentanteLegal && this.isPermisoCopiarRepresentanteLegal));			
			this.jMenuItemVerFormRepresentanteLegal.setVisible((this.isVisibilidadCeldaVerFormRepresentanteLegal && this.isPermisoVerFormRepresentanteLegal));			
			this.jMenuItemAbrirOrderByRepresentanteLegal.setVisible((this.isVisibilidadCeldaOrdenRepresentanteLegal && this.isPermisoOrdenRepresentanteLegal));			
			//this.jMenuItemMostrarOcultarRepresentanteLegal.setVisible((this.isVisibilidadCeldaOrdenRepresentanteLegal && this.isPermisoOrdenRepresentanteLegal));
			this.jMenuItemDetalleAbrirOrderByRepresentanteLegal.setVisible((this.isVisibilidadCeldaOrdenRepresentanteLegal && this.isPermisoOrdenRepresentanteLegal));			
			//this.jMenuItemDetalleMostrarOcultarRepresentanteLegal.setVisible((this.isVisibilidadCeldaOrdenRepresentanteLegal && this.isPermisoOrdenRepresentanteLegal));			
			this.jMenuItemNuevoRelacionesRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal));			
			this.jMenuItemNuevoGuardarCambiosRepresentanteLegal.setVisible((this.isVisibilidadCeldaNuevoRepresentanteLegal && this.isPermisoNuevoRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));									
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemModificarRepresentanteLegal.setVisible((this.isVisibilidadCeldaModificarRepresentanteLegal && this.isPermisoActualizarRepresentanteLegal));	
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemActualizarRepresentanteLegal.setVisible((this.isVisibilidadCeldaActualizarRepresentanteLegal && this.isPermisoActualizarRepresentanteLegal));	
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemEliminarRepresentanteLegal.setVisible((this.isVisibilidadCeldaEliminarRepresentanteLegal && this.isPermisoEliminarRepresentanteLegal));
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemCancelarRepresentanteLegal.setVisible(this.isVisibilidadCeldaCancelarRepresentanteLegal);				
			}
			
			this.jMenuItemGuardarCambiosRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));						
			this.jMenuItemGuardarCambiosTablaRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=this.jButtonNuevoRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaDuplicarRepresentanteLegal=this.jButtonDuplicarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaCopiarRepresentanteLegal=this.jButtonCopiarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaVerFormRepresentanteLegal=this.jButtonVerFormRepresentanteLegal.isVisible();
			
			this.isVisibilidadCeldaOrdenRepresentanteLegal=this.jButtonAbrirOrderByRepresentanteLegal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=this.jButtonNuevoRelacionesRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaModificarRepresentanteLegal=this.jButtonModificarRepresentanteLegal.isVisible();
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.isVisibilidadCeldaActualizarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaEliminarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaCancelarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaGuardarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=this.jButtonGuardarCambiosTablaRepresentanteLegal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRepresentanteLegal=this.jButtonNuevoToolBarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=this.jButtonNuevoRelacionesToolBarRepresentanteLegal.isVisible();
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.isVisibilidadCeldaModificarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarToolBarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaActualizarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarToolBarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaEliminarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarToolBarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaCancelarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarToolBarRepresentanteLegal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRepresentanteLegal=this.jButtonGuardarCambiosToolBarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=this.jButtonGuardarCambiosTablaToolBarRepresentanteLegal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRepresentanteLegal=this.jMenuItemNuevoRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=this.jMenuItemNuevoRelacionesRepresentanteLegal.isVisible();
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.isVisibilidadCeldaModificarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemModificarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaActualizarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemActualizarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaEliminarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemEliminarRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaCancelarRepresentanteLegal=this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemCancelarRepresentanteLegal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRepresentanteLegal=this.jMenuItemGuardarCambiosRepresentanteLegal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=this.jMenuItemGuardarCambiosTablaRepresentanteLegal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRepresentanteLegal(Boolean esInicializar) {
		if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
				//if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRepresentanteLegal();
			}
			
			this.inicializarActualizarBindingBotonesManualRepresentanteLegal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRepresentanteLegal() {
		this.jButtonNuevoRepresentanteLegal.setVisible(this.isPermisoNuevoRepresentanteLegal);			
		this.jButtonDuplicarRepresentanteLegal.setVisible(this.isPermisoDuplicarRepresentanteLegal);			
		this.jButtonCopiarRepresentanteLegal.setVisible(this.isPermisoCopiarRepresentanteLegal);			
		this.jButtonVerFormRepresentanteLegal.setVisible(this.isPermisoVerFormRepresentanteLegal);			
		
		this.jButtonAbrirOrderByRepresentanteLegal.setVisible(this.isPermisoOrdenRepresentanteLegal);					
		
		this.jButtonNuevoRelacionesRepresentanteLegal.setVisible(this.isPermisoNuevoRepresentanteLegal);			
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarRepresentanteLegal.setVisible(this.isPermisoActualizarRepresentanteLegal);	
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarRepresentanteLegal.setVisible(this.isPermisoActualizarRepresentanteLegal);	
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarRepresentanteLegal.setVisible(this.isPermisoEliminarRepresentanteLegal);
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarRepresentanteLegal.setVisible(this.isVisibilidadCeldaCancelarRepresentanteLegal);						
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.setVisible(this.isPermisoGuardarCambiosRepresentanteLegal);							
		}
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.setVisible(this.isPermisoActualizarRepresentanteLegal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRepresentanteLegal() {
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarRepresentanteLegal.setVisible(this.isPermisoActualizarRepresentanteLegal);	
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarRepresentanteLegal.setVisible(this.isPermisoActualizarRepresentanteLegal);	
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarRepresentanteLegal.setVisible(this.isPermisoEliminarRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarRepresentanteLegal.setVisible(this.isVisibilidadCeldaCancelarRepresentanteLegal);							
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.setVisible((this.isVisibilidadCeldaGuardarRepresentanteLegal && this.isPermisoGuardarCambiosRepresentanteLegal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRepresentanteLegal() {
		if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRepresentanteLegal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRepresentanteLegal() {
	}
	
	public void jTableDatosRepresentanteLegalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRepresentanteLegal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.representantelegal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteRepresentanteLegalActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderRepresentanteLegal=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosRepresentanteLegal.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderRepresentanteLegal=(TitledBorder)this.jScrollPanelDatosRepresentanteLegal.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderRepresentanteLegal.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteRepresentanteLegalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebRepresentanteLegal(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRepresentanteLegal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRepresentanteLegal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.representantelegalLogic.getConnexion());

				if(this.representantelegal.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.representantelegal.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRepresentanteLegal=(TitledBorder)this.jScrollPanelDatosRepresentanteLegal.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderRepresentanteLegal.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.representantelegal.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientedocumentoRepresentanteLegalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoidentificacion=true;

			idTienePermisotipoidentificacion=this.tienePermisosUsuarioEnPaginaWebRepresentanteLegal(TipoIdentificacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoidentificacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRepresentanteLegal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRepresentanteLegal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);

				this.tipoidentificacionBeanSwingJInternalFrame=new TipoIdentificacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoidentificacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoidentificacionBeanSwingJInternalFrame.getTipoIdentificacionLogic().setConnexion(this.representantelegalLogic.getConnexion());

				if(this.representantelegal.getidvalorclientedocumento()!=null) {
					this.tipoidentificacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoidentificacionBeanSwingJInternalFrame.setIdActual(this.representantelegal.getidvalorclientedocumento());
					this.tipoidentificacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIdentificacion();
				}

				JInternalFrameBase jinternalFrame =this.tipoidentificacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRepresentanteLegal=(TitledBorder)this.jScrollPanelDatosRepresentanteLegal.getBorder();
				TitledBorder titledBordertipoidentificacion=(TitledBorder)this.tipoidentificacionBeanSwingJInternalFrame.jScrollPanelDatosTipoIdentificacion.getBorder();

				titledBordertipoidentificacion.setTitle(titledBorderRepresentanteLegal.getTitle() + " -> Tipo Identificacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientedocumentoRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getidvalorclientedocumento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientedocumento = "+this.representantelegal.getidvalorclientedocumento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisRepresentanteLegalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebRepresentanteLegal(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRepresentanteLegal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRepresentanteLegal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.representantelegalLogic.getConnexion());

				if(this.representantelegal.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.representantelegal.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRepresentanteLegal=(TitledBorder)this.jScrollPanelDatosRepresentanteLegal.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderRepresentanteLegal.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.representantelegal.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidciudadRepresentanteLegalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebRepresentanteLegal(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRepresentanteLegal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRepresentanteLegal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.representantelegalLogic.getConnexion());

				if(this.representantelegal.getidciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.representantelegal.getidciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRepresentanteLegal=(TitledBorder)this.jScrollPanelDatosRepresentanteLegal.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderRepresentanteLegal.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidciudadRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getidciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idciudad = "+this.representantelegal.getidciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.representantelegal.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidopaternoRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getapellidopaterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidopaterno like '%"+this.representantelegal.getapellidopaterno()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidomaternoRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getapellidomaterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidomaterno like '%"+this.representantelegal.getapellidomaterno()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprimernombreRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getprimernombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where primernombre like '%"+this.representantelegal.getprimernombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsegundonombreRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getsegundonombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where segundonombre like '%"+this.representantelegal.getsegundonombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.representantelegal.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.representantelegal.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonocodigoareaRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.gettelefonocodigoarea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonocodigoarea like '%"+this.representantelegal.gettelefonocodigoarea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonextensionRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getextension()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where extension like '%"+this.representantelegal.getextension()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonomovilRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.gettelefonomovil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonomovil like '%"+this.representantelegal.gettelefonomovil()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoaurorizadoRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getmontoaurorizado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where montoaurorizado = "+this.representantelegal.getmontoaurorizado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.representantelegal.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestaactivoRepresentanteLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.getrepresentantelegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.representantelegal==null) {
						this.representantelegal = new RepresentanteLegal();
					}

					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);
				}

				if(this.representantelegal.getestaactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estaactivo = "+this.representantelegal.getestaactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRepresentanteLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRepresentanteLegal(false,false);

			this.getRepresentanteLegalsFK_IdCiudad();

			this.inicializarActualizarBindingRepresentanteLegal(false);

			//if(RepresentanteLegalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRepresentanteLegal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRepresentanteLegal(false,false);

			this.getRepresentanteLegalsFK_IdCliente();

			this.inicializarActualizarBindingRepresentanteLegal(false);

			//if(RepresentanteLegalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRepresentanteLegal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRepresentanteLegal(false,false);

			this.getRepresentanteLegalsFK_IdPais();

			this.inicializarActualizarBindingRepresentanteLegal(false);

			//if(RepresentanteLegalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRepresentanteLegal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteDocumentoRepresentanteLegalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRepresentanteLegal(false,false);

			this.getRepresentanteLegalsFK_IdValorClienteDocumento();

			this.inicializarActualizarBindingRepresentanteLegal(false);

			//if(RepresentanteLegalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRepresentanteLegal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.representantelegalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRepresentanteLegal() {
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
			this.jInternalFrameDetalleFormRepresentanteLegal.setVisible(false);	    			
			this.jInternalFrameDetalleFormRepresentanteLegal.dispose();
			this.jInternalFrameDetalleFormRepresentanteLegal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
			this.jInternalFrameReporteDinamicoRepresentanteLegal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRepresentanteLegal.dispose();
			this.jInternalFrameReporteDinamicoRepresentanteLegal=null;
		}
		
		if(this.jInternalFrameImportacionRepresentanteLegal!=null) {
			this.jInternalFrameImportacionRepresentanteLegal.setVisible(false);	    			
			this.jInternalFrameImportacionRepresentanteLegal.dispose();
			this.jInternalFrameImportacionRepresentanteLegal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRepresentanteLegal();
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			
			if(sTipo.equals("NuevoRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRepresentanteLegal")) {
				jButtonDuplicarRepresentanteLegalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRepresentanteLegal")) {
				jButtonCopiarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("VerFormRepresentanteLegal")) {
				jButtonVerFormRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRepresentanteLegal")) {
				jButtonDuplicarRepresentanteLegalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRepresentanteLegal")) {
				jButtonDuplicarRepresentanteLegalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRepresentanteLegal")) {
				jButtonModificarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRepresentanteLegal")) {
				jButtonModificarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRepresentanteLegal")) {
				jButtonModificarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRepresentanteLegal")) {
				jButtonActualizarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRepresentanteLegal")) {
				jButtonActualizarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRepresentanteLegal")) {
				jButtonActualizarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("EliminarRepresentanteLegal")) {
				jButtonEliminarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRepresentanteLegal")) {
				jButtonEliminarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRepresentanteLegal")) {
				jButtonEliminarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("CancelarRepresentanteLegal")) {
				jButtonCancelarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRepresentanteLegal")) {
				jButtonCancelarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRepresentanteLegal")) {
				jButtonCancelarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("CerrarRepresentanteLegal")) {
				jButtonCerrarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRepresentanteLegal")) {
				jButtonCerrarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRepresentanteLegal")) {
				jButtonCerrarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRepresentanteLegal")) {
				jButtonMostrarOcultarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRepresentanteLegal")) {
				jButtonCancelarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRepresentanteLegal")) {
				jButtonCopiarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRepresentanteLegal")) {
				jButtonVerFormRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRepresentanteLegal")) {
				jButtonCopiarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRepresentanteLegal")) {
				jButtonVerFormRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRepresentanteLegal")) {
				jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRepresentanteLegal")) {
				jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRepresentanteLegal")) {
				jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRepresentanteLegal")) {
				jButtonAnterioresRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRepresentanteLegal")) {
				jButtonAnterioresRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRepresentanteLegal")) {
				jButtonAnterioresRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRepresentanteLegal")) {
				jButtonSiguientesRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRepresentanteLegal")) {
				jButtonSiguientesRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRepresentanteLegal")) {
				jButtonSiguientesRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRepresentanteLegal") || sTipo.equals("MenuItemDetalleAbrirOrderByRepresentanteLegal")) {
				jButtonAbrirOrderByRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRepresentanteLegal") || sTipo.equals("MenuItemDetalleMostrarOcultarRepresentanteLegal")) {
				jButtonMostrarOcultarRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRepresentanteLegal")) {
				jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRepresentanteLegal")) {
				jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRepresentanteLegal")) {
				jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRepresentanteLegal")) {
				jButtonCerrarReporteDinamicoRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRepresentanteLegal")) {
				jButtonGenerarReporteDinamicoRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRepresentanteLegal")) {
				
				jButtonGenerarExcelReporteDinamicoRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRepresentanteLegal")) {
				jButtonCerrarImportacionRepresentanteLegalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRepresentanteLegal")) {
				
				jButtonGenerarImportacionRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRepresentanteLegal")) {
				
				jButtonAbrirImportacionRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRepresentanteLegal")) {
				jComboBoxTiposAccionesRepresentanteLegalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRepresentanteLegal")) {
				jComboBoxTiposRelacionesRepresentanteLegalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRepresentanteLegal")) {
				jComboBoxTiposAccionesRepresentanteLegalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRepresentanteLegal")) {
				
				jComboBoxTiposSeleccionarRepresentanteLegalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRepresentanteLegal")) {
				jTextFieldValorCampoGeneralRepresentanteLegalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRepresentanteLegal")) {
				jButtonAbrirOrderByRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRepresentanteLegal")) {
				jButtonAbrirOrderByRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRepresentanteLegal")) {
				jButtonCerrarOrderByRepresentanteLegalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRepresentanteLegalBusqueda")) {
				this.jButtonidRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteRepresentanteLegal")) {
				this.jButtonidclienteRepresentanteLegalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteRepresentanteLegalUpdate")) {
				this.jButtonidclienteRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteRepresentanteLegalBusqueda")) {
				this.jButtonidclienteRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientedocumentoRepresentanteLegalUpdate")) {
				this.jButtonidvalorclientedocumentoRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientedocumentoRepresentanteLegalBusqueda")) {
				this.jButtonidvalorclientedocumentoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisRepresentanteLegalUpdate")) {
				this.jButtonid_paisRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisRepresentanteLegalBusqueda")) {
				this.jButtonid_paisRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadRepresentanteLegalUpdate")) {
				this.jButtonidciudadRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadRepresentanteLegalBusqueda")) {
				this.jButtonidciudadRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionRepresentanteLegalBusqueda")) {
				this.jButtonidentificacionRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidopaternoRepresentanteLegalBusqueda")) {
				this.jButtonapellidopaternoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidomaternoRepresentanteLegalBusqueda")) {
				this.jButtonapellidomaternoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("primernombreRepresentanteLegalBusqueda")) {
				this.jButtonprimernombreRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("segundonombreRepresentanteLegalBusqueda")) {
				this.jButtonsegundonombreRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionRepresentanteLegalBusqueda")) {
				this.jButtondireccionRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoRepresentanteLegalBusqueda")) {
				this.jButtontelefonoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaRepresentanteLegalBusqueda")) {
				this.jButtontelefonocodigoareaRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("extensionRepresentanteLegalBusqueda")) {
				this.jButtonextensionRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilRepresentanteLegalBusqueda")) {
				this.jButtontelefonomovilRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoaurorizadoRepresentanteLegalBusqueda")) {
				this.jButtonmontoaurorizadoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailRepresentanteLegalBusqueda")) {
				this.jButtonemailRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estaactivoRepresentanteLegalBusqueda")) {
				this.jButtonestaactivoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteRepresentanteLegal")) {
				this.jButtonidclienteRepresentanteLegalActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadRepresentanteLegal")) {
				this.jButtonFK_IdCiudadRepresentanteLegalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteRepresentanteLegal")) {
				this.jButtonFK_IdClienteRepresentanteLegalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisRepresentanteLegal")) {
				this.jButtonFK_IdPaisRepresentanteLegalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteDocumentoRepresentanteLegal")) {
				this.jButtonFK_IdValorClienteDocumentoRepresentanteLegalActionPerformed(evt);
			}
			
			;
			
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRepresentanteLegal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				


				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RepresentanteLegal representantelegalLocal=null;
			
			if(!this.getEsControlTabla()) {
				representantelegalLocal=this.representantelegal;
			} else {
				representantelegalLocal=this.representantelegalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
							
				
				


				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
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
			
			


			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
								
						
				


				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
								
				
				


				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
							
				
				


				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
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
			
			


			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
								
				
				


				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRepresentanteLegal")) {
					jCheckBoxSeleccionarTodosRepresentanteLegalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRepresentanteLegal")) {
					jCheckBoxSeleccionadosRepresentanteLegalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRepresentanteLegal")) {
					
				}
				
				


				
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
												
				
				


				
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisRepresentanteLegal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal;
				}

				if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
					//classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormRepresentanteLegal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisRepresentanteLegal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisRepresentanteLegal,"FK_IdPais");
				//recargarFormRepresentanteLegalPais(jComboBoxid_paisFK_IdPaisRepresentanteLegal,"FK_IdPais");
			}
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRepresentanteLegalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisRepresentanteLegal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal;
				}

				if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
					//classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormRepresentanteLegal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisRepresentanteLegal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisRepresentanteLegal,"FK_IdPais");
				//recargarFormRepresentanteLegalPais(jComboBoxid_paisFK_IdPaisRepresentanteLegal,"FK_IdPais");
			}
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.representantelegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.representantelegal);
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisRepresentanteLegal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal;
				}

				if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
					//classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormRepresentanteLegal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisRepresentanteLegal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisRepresentanteLegal,"FK_IdPais");
				//recargarFormRepresentanteLegalPais(jComboBoxid_paisFK_IdPaisRepresentanteLegal,"FK_IdPais");
			}
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RepresentanteLegal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RepresentanteLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRepresentanteLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.representantelegalAnterior =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRepresentanteLegal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRepresentanteLegalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRepresentanteLegal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.representantelegal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.representantelegal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.representantelegal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRepresentanteLegal")) {
				
				}
				
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRepresentanteLegal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRepresentanteLegal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRepresentanteLegal")) {
			
			}
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRepresentanteLegal();
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			if(sTipo.equals("NuevoRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRepresentanteLegal")) {
				jButtonDuplicarRepresentanteLegalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRepresentanteLegal")) {
				jButtonCopiarRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRepresentanteLegal")) {
				jButtonVerFormRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRepresentanteLegal")) {
				jButtonNuevoRepresentanteLegalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRepresentanteLegal")) {
				jButtonModificarRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRepresentanteLegal")) {
				jButtonActualizarRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRepresentanteLegal")) {
				jButtonEliminarRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRepresentanteLegal")) {
				jButtonCancelarRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRepresentanteLegal")) {
				jButtonCerrarRepresentanteLegalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRepresentanteLegal")) {
				jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRepresentanteLegal")) {
				jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRepresentanteLegal")) {
				jButtonAbrirOrderByRepresentanteLegalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRepresentanteLegal")) {
				jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRepresentanteLegal")) {
				jButtonAnterioresRepresentanteLegalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRepresentanteLegal")) {
				jButtonSiguientesRepresentanteLegalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRepresentanteLegalBusqueda")) {
				this.jButtonidRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteRepresentanteLegal")) {
				this.jButtonidclienteRepresentanteLegalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteRepresentanteLegalUpdate")) {
				this.jButtonidclienteRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteRepresentanteLegalBusqueda")) {
				this.jButtonidclienteRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientedocumentoRepresentanteLegalUpdate")) {
				this.jButtonidvalorclientedocumentoRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientedocumentoRepresentanteLegalBusqueda")) {
				this.jButtonidvalorclientedocumentoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisRepresentanteLegalUpdate")) {
				this.jButtonid_paisRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisRepresentanteLegalBusqueda")) {
				this.jButtonid_paisRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadRepresentanteLegalUpdate")) {
				this.jButtonidciudadRepresentanteLegalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadRepresentanteLegalBusqueda")) {
				this.jButtonidciudadRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionRepresentanteLegalBusqueda")) {
				this.jButtonidentificacionRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidopaternoRepresentanteLegalBusqueda")) {
				this.jButtonapellidopaternoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidomaternoRepresentanteLegalBusqueda")) {
				this.jButtonapellidomaternoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("primernombreRepresentanteLegalBusqueda")) {
				this.jButtonprimernombreRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("segundonombreRepresentanteLegalBusqueda")) {
				this.jButtonsegundonombreRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionRepresentanteLegalBusqueda")) {
				this.jButtondireccionRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoRepresentanteLegalBusqueda")) {
				this.jButtontelefonoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaRepresentanteLegalBusqueda")) {
				this.jButtontelefonocodigoareaRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("extensionRepresentanteLegalBusqueda")) {
				this.jButtonextensionRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilRepresentanteLegalBusqueda")) {
				this.jButtontelefonomovilRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoaurorizadoRepresentanteLegalBusqueda")) {
				this.jButtonmontoaurorizadoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailRepresentanteLegalBusqueda")) {
				this.jButtonemailRepresentanteLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estaactivoRepresentanteLegalBusqueda")) {
				this.jButtonestaactivoRepresentanteLegalBusquedaActionPerformed(evt);
			}
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRepresentanteLegal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRepresentanteLegal")) {
				closingInternalFrameRepresentanteLegal();
				
			} else if(sTipo.equals("jButtonCancelarRepresentanteLegal")) {
				JInternalFrameBase jInternalFrameDetalleFormRepresentanteLegal = (JInternalFrameBase)evt.getSource();
	            	
	            RepresentanteLegalBeanSwingJInternalFrame jInternalFrameParent=(RepresentanteLegalBeanSwingJInternalFrame)jInternalFrameDetalleFormRepresentanteLegal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRepresentanteLegalActionPerformed(null);
			}
			
			RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.representantelegal,new Object(),this.representantelegalParameterGeneral,this.representantelegalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRepresentanteLegal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRepresentanteLegal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRepresentanteLegal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.representantelegal)) {
			if(!esControlTabla) {
				if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);			
				}
				
				if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRepresentanteLegal(this.representantelegal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.representantelegalReturnGeneral=representantelegalLogic.procesarEventosRepresentanteLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.representantelegalLogic.getRepresentanteLegals(),this.representantelegal,this.representantelegalParameterGeneral,this.isEsNuevoRepresentanteLegal,classes);//this.representantelegalLogic.getRepresentanteLegal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRepresentanteLegal(this.representantelegalReturnGeneral,this.representantelegalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRepresentanteLegal(classes,this.representantelegalReturnGeneral,this.representantelegalBean,false);
					}
						
					if(this.representantelegalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal());	
					}
						
					if(this.representantelegalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal(),classes);//this.representantelegalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRepresentanteLegal(this.representantelegal,classes);//this.representantelegalBean);									
				}
			
				if(RepresentanteLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRepresentanteLegal(this.representantelegal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRepresentanteLegal(this.representantelegal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.representantelegalAnterior!=null) {
						this.representantelegal=this.representantelegalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.representantelegalReturnGeneral=representantelegalLogic.procesarEventosRepresentanteLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.representantelegalLogic.getRepresentanteLegals(),this.representantelegal,this.representantelegalParameterGeneral,this.isEsNuevoRepresentanteLegal,classes);//this.representantelegalLogic.getRepresentanteLegal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.representantelegalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.representantelegalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.representantelegalReturnGeneral.getRepresentanteLegal(),representantelegalLogic.getRepresentanteLegals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.representantelegalReturnGeneral.getRepresentanteLegal(),this.representantelegals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRepresentanteLegal.repaint();
				
				//((AbstractTableModel) this.jTableDatosRepresentanteLegal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRepresentanteLegal();
			}
		}
	}
	
	public void actualizarVisualTableDatosRepresentanteLegal() throws Exception {
		
		RepresentanteLegalModel representantelegalModel=(RepresentanteLegalModel)this.jTableDatosRepresentanteLegal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			representantelegalModel.representantelegals=this.representantelegalLogic.getRepresentanteLegals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			representantelegalModel.representantelegals=this.representantelegals;
		}
		
		
		((RepresentanteLegalModel) this.jTableDatosRepresentanteLegal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRepresentanteLegal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrepresentantelegalAnterior(),this.representantelegalLogic.getRepresentanteLegals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrepresentantelegalAnterior(),this.representantelegals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRepresentanteLegal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRepresentanteLegal(RepresentanteLegal representantelegal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
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
										
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.representantelegal,new Object(),generalEntityParameterGeneral,this.representantelegalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.representantelegalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsOfRepresentanteLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RepresentanteLegalConstantesFunciones.getClassesRelationshipsFromStringsOfRepresentanteLegal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRepresentanteLegal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RepresentanteLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.representantelegal,new Object(),generalEntityParameterGeneral,this.representantelegalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRepresentanteLegal(RepresentanteLegalBean representantelegalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRepresentanteLegal(ArrayList<Classe> classes,RepresentanteLegalReturnGeneral representantelegalReturnGeneral,RepresentanteLegalBean representantelegalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRepresentanteLegal(RepresentanteLegal representantelegal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.representantelegal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRepresentanteLegal = new RepresentanteLegalDetalleFormJInternalFrame(jDesktopPane,this.representantelegalSessionBean.getConGuardarRelaciones(),this.representantelegalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.setVisible(false);
		this.jInternalFrameDetalleFormRepresentanteLegal.setSelected(false);						
		
		this.jInternalFrameDetalleFormRepresentanteLegal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRepresentanteLegal.representantelegalLogic=this.representantelegalLogic;
		
		this.cargarCombosFrameForeignKeyRepresentanteLegal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRepresentanteLegal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRepresentanteLegal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRepresentanteLegal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRepresentanteLegal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRepresentanteLegal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRepresentanteLegal"));
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"ModificarRepresentanteLegal"));

		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"ModificarToolBarRepresentanteLegal"));
					
		this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemModificarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"MenuItemModificarRepresentanteLegal"));		
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"ActualizarRepresentanteLegal"));
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRepresentanteLegal"));
						
		this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemActualizarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRepresentanteLegal"));		
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"EliminarRepresentanteLegal"));
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"EliminarToolBarRepresentanteLegal"));
								
		this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemEliminarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRepresentanteLegal"));		
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CancelarRepresentanteLegal"));
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CancelarToolBarRepresentanteLegal"));
					
		this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemCancelarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRepresentanteLegal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemDetalleCerrarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRepresentanteLegal"));		
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRepresentanteLegal"));
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRepresentanteLegal"));
		
		
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRepresentanteLegal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idRepresentanteLegalBusqueda"));
		//jButtonidclienteRepresentanteLegal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteRepresentanteLegalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientedocumentoRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientedocumentoRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonid_paisRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"id_paisRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonid_paisRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidciudadRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idciudadRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidciudadRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idciudadRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidentificacionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"identificacionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonapellidopaternoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonapellidomaternoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonprimernombreRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"primernombreRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonsegundonombreRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtondireccionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"direccionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonocodigoareaRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonextensionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"extensionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonomovilRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonmontoaurorizadoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"montoaurorizadoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonemailRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"emailRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonestaactivoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"estaactivoRepresentanteLegalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRepresentanteLegal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRepresentanteLegal"));
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRepresentanteLegal"));
		}
		
		this.jTableDatosRepresentanteLegal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRepresentanteLegal"));
		
		this.jTableDatosRepresentanteLegal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRepresentanteLegal"));
		
		this.jButtonNuevoRepresentanteLegal.addActionListener(new ButtonActionListener(this,"NuevoRepresentanteLegal"));
		
		this.jButtonDuplicarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"DuplicarRepresentanteLegal"));
		
		this.jButtonCopiarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"CopiarRepresentanteLegal"));
		
		this.jButtonVerFormRepresentanteLegal.addActionListener(new ButtonActionListener(this,"VerFormRepresentanteLegal"));
		
		
		this.jButtonNuevoToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"NuevoToolBarRepresentanteLegal"));
			
		this.jButtonDuplicarToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRepresentanteLegal"));
			
		this.jMenuItemNuevoRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRepresentanteLegal"));
			
		this.jMenuItemDuplicarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRepresentanteLegal"));		
		
		
		this.jButtonNuevoRelacionesRepresentanteLegal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRepresentanteLegal"));
		
		
		this.jButtonNuevoRelacionesToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRepresentanteLegal"));
			
		this.jMenuItemNuevoRelacionesRepresentanteLegal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRepresentanteLegal"));		
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"ModificarRepresentanteLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonModificarToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"ModificarToolBarRepresentanteLegal"));
			
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemModificarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"MenuItemModificarRepresentanteLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"ActualizarRepresentanteLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonActualizarToolBarRepresentanteLegal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRepresentanteLegal"));
				
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemActualizarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRepresentanteLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"EliminarRepresentanteLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonEliminarToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"EliminarToolBarRepresentanteLegal"));
						
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemEliminarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRepresentanteLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CancelarRepresentanteLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonCancelarToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CancelarToolBarRepresentanteLegal"));
			
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemCancelarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRepresentanteLegal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRepresentanteLegal"));		
		
		
		this.jButtonCerrarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CerrarRepresentanteLegal"));
		
		
		this.jButtonCerrarToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CerrarToolBarRepresentanteLegal"));
			
		this.jMenuItemCerrarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRepresentanteLegal"));
			
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jMenuItemDetalleCerrarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRepresentanteLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosRepresentanteLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRepresentanteLegal"));
		}
		
		this.jButtonCopiarToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CopiarToolBarRepresentanteLegal"));
			
		this.jButtonVerFormToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"VerFormToolBarRepresentanteLegal"));
		
		this.jMenuItemGuardarCambiosRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRepresentanteLegal"));
			
		this.jMenuItemCopiarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRepresentanteLegal"));		
		
		this.jMenuItemVerFormRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRepresentanteLegal"));		
		
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRepresentanteLegal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRepresentanteLegal"));
			
		this.jMenuItemGuardarCambiosTablaRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRepresentanteLegal"));		
		
		
		
		this.jButtonRecargarInformacionRepresentanteLegal.addActionListener (new ButtonActionListener(this,"RecargarInformacionRepresentanteLegal"));
					
		this.jButtonRecargarInformacionToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRepresentanteLegal"));
		
		this.jMenuItemRecargarInformacionRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRepresentanteLegal"));		
		
		
		
		this.jButtonAnterioresRepresentanteLegal.addActionListener (new ButtonActionListener(this,"AnterioresRepresentanteLegal"));
		
		
		this.jButtonAnterioresToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRepresentanteLegal"));
		
		this.jMenuItemAnterioresRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRepresentanteLegal"));		
		
		
		this.jButtonSiguientesRepresentanteLegal.addActionListener (new ButtonActionListener(this,"SiguientesRepresentanteLegal"));
		
		
		this.jButtonSiguientesToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRepresentanteLegal"));
			
		this.jMenuItemSiguientesRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRepresentanteLegal"));
			
		this.jMenuItemAbrirOrderByRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRepresentanteLegal"));
			
		this.jMenuItemMostrarOcultarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRepresentanteLegal"));
			
		this.jMenuItemDetalleAbrirOrderByRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRepresentanteLegal"));
			
		this.jMenuItemDetalleMostarOcultarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRepresentanteLegal"));		
		
		
		this.jButtonNuevoGuardarCambiosRepresentanteLegal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRepresentanteLegal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRepresentanteLegal"));
			
		this.jMenuItemNuevoGuardarCambiosRepresentanteLegal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRepresentanteLegal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRepresentanteLegal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRepresentanteLegal"));

		this.jCheckBoxSeleccionadosRepresentanteLegal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRepresentanteLegal"));
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRepresentanteLegal"));
		}
		
		
		this.jComboBoxTiposRelacionesRepresentanteLegal.addActionListener (new ButtonActionListener(this,"TiposRelacionesRepresentanteLegal"));
			
		this.jComboBoxTiposAccionesRepresentanteLegal.addActionListener (new ButtonActionListener(this,"TiposAccionesRepresentanteLegal"));
					
		this.jComboBoxTiposSeleccionarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRepresentanteLegal"));
			
		this.jTextFieldValorCampoGeneralRepresentanteLegal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRepresentanteLegal"));		
		
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idRepresentanteLegalBusqueda"));
		//jButtonidclienteRepresentanteLegal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteRepresentanteLegalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientedocumentoRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientedocumentoRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonid_paisRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"id_paisRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonid_paisRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidciudadRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idciudadRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidciudadRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idciudadRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidentificacionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"identificacionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonapellidopaternoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonapellidomaternoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonprimernombreRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"primernombreRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonsegundonombreRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtondireccionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"direccionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonocodigoareaRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonextensionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"extensionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonomovilRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonmontoaurorizadoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"montoaurorizadoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonemailRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"emailRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonestaactivoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"estaactivoRepresentanteLegalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdCiudadRepresentanteLegal"));

			this.jButtonFK_IdClienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdClienteRepresentanteLegal"));

			this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegal"));

			this.jButtonFK_IdPaisRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdPaisRepresentanteLegal"));

			this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteDocumentoRepresentanteLegal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRepresentanteLegal!=null) {
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRepresentanteLegal"));
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRepresentanteLegal"));
				this.jInternalFrameReporteDinamicoRepresentanteLegal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRepresentanteLegal"));
			}
			
			//this.jButtonCerrarReporteDinamicoRepresentanteLegal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRepresentanteLegal"));				
			//this.jButtonGenerarReporteDinamicoRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRepresentanteLegal"));
			//this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRepresentanteLegal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRepresentanteLegal!=null) {
				this.jInternalFrameImportacionRepresentanteLegal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRepresentanteLegal"));
				this.jInternalFrameImportacionRepresentanteLegal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRepresentanteLegal"));
				this.jInternalFrameImportacionRepresentanteLegal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRepresentanteLegal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRepresentanteLegal.addActionListener (new ButtonActionListener(this,"AbrirOrderByRepresentanteLegal"));
			
			this.jButtonAbrirOrderByToolBarRepresentanteLegal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRepresentanteLegal"));			
			
			if(this.jInternalFrameOrderByRepresentanteLegal!=null) {
				this.jInternalFrameOrderByRepresentanteLegal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRepresentanteLegal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRepresentanteLegal.jTabbedPaneRelacionesRepresentanteLegal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRepresentanteLegal"));
		
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
            		closingInternalFrameRepresentanteLegal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRepresentanteLegal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRepresentanteLegal = (JInternalFrameBase)event.getSource();
	            	
	            RepresentanteLegalBeanSwingJInternalFrame jInternalFrameParent=(RepresentanteLegalBeanSwingJInternalFrame)jInternalFrameDetalleFormRepresentanteLegal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRepresentanteLegalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRepresentanteLegal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRepresentanteLegalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRepresentanteLegal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRepresentanteLegal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRepresentanteLegalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRepresentanteLegalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRepresentanteLegalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRepresentanteLegal";
		inputMap = this.jButtonNuevoRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRepresentanteLegalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRepresentanteLegalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRepresentanteLegalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRepresentanteLegalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRepresentanteLegal";
		inputMap = this.jButtonNuevoRelacionesRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRepresentanteLegalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRepresentanteLegal";
		inputMap = this.jButtonModificarRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRepresentanteLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRepresentanteLegal";
		inputMap = this.jButtonActualizarRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRepresentanteLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRepresentanteLegal";
		inputMap = this.jButtonEliminarRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRepresentanteLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRepresentanteLegal";
		inputMap = this.jButtonCancelarRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRepresentanteLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRepresentanteLegal";
		inputMap = this.jButtonCerrarRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRepresentanteLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRepresentanteLegal";
		inputMap = this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonGuardarCambiosRepresentanteLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRepresentanteLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRepresentanteLegal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRepresentanteLegalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRepresentanteLegal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRepresentanteLegalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRepresentanteLegal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRepresentanteLegalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRepresentanteLegal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRepresentanteLegalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idRepresentanteLegalBusqueda"));
		//jButtonidclienteRepresentanteLegal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteRepresentanteLegalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidvalorclientedocumentoRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientedocumentoRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidvalorclientedocumentoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientedocumentoRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonid_paisRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"id_paisRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonid_paisRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRepresentanteLegalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidciudadRepresentanteLegalUpdate.addActionListener(new ButtonActionListener(this,"idciudadRepresentanteLegalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidciudadRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"idciudadRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidentificacionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"identificacionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonapellidopaternoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonapellidomaternoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonprimernombreRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"primernombreRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonsegundonombreRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtondireccionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"direccionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonocodigoareaRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonextensionRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"extensionRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtontelefonomovilRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonmontoaurorizadoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"montoaurorizadoRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonemailRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"emailRepresentanteLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRepresentanteLegal.jButtonestaactivoRepresentanteLegalBusqueda.addActionListener(new ButtonActionListener(this,"estaactivoRepresentanteLegalBusqueda"));
		
		
		this.jButtonFK_IdCiudadRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdCiudadRepresentanteLegal"));

		this.jButtonFK_IdClienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdClienteRepresentanteLegal"));

		this.jButtonBuscarFK_IdClienteidclienteRepresentanteLegal.addActionListener(new ButtonActionListener(this,"idclienteRepresentanteLegal"));

		this.jButtonFK_IdPaisRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdPaisRepresentanteLegal"));

		this.jButtonFK_IdValorClienteDocumentoRepresentanteLegal.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteDocumentoRepresentanteLegal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRepresentanteLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRepresentanteLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRepresentanteLegalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRepresentanteLegal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRepresentanteLegal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
					representantelegalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RepresentanteLegal representantelegalAux:representantelegals) {
					representantelegalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRepresentanteLegalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRepresentanteLegal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
						representantelegalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RepresentanteLegal representantelegalAux:representantelegals) {
						representantelegalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
					
						if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							representantelegalAux.setestaactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RepresentanteLegal representantelegalAux:representantelegals) {
						
						if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							representantelegalAux.setestaactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRepresentanteLegal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRepresentanteLegal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRepresentanteLegalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRepresentanteLegal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRepresentanteLegal.getSelectedRows();
			
			RepresentanteLegal representantelegalLocal=new RepresentanteLegal();
			
			//this.seleccionarTodosRepresentanteLegal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					representantelegalLocal =(RepresentanteLegal) this.representantelegalLogic.getRepresentanteLegals().toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					representantelegalLocal =(RepresentanteLegal) this.representantelegals.toArray()[this.jTableDatosRepresentanteLegal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				representantelegalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
						representantelegalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RepresentanteLegal representantelegalAux:representantelegals) {
						representantelegalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRepresentanteLegal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRepresentanteLegal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRepresentanteLegal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRepresentanteLegalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRepresentanteLegalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRepresentanteLegalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRepresentanteLegal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRepresentanteLegal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RepresentanteLegal representantelegalAux:this.representantelegalLogic.getRepresentanteLegals()) {
				
						if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							representantelegalAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO)) {
							existe=true;
							representantelegalAux.setapellidopaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO)) {
							existe=true;
							representantelegalAux.setapellidomaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE)) {
							existe=true;
							representantelegalAux.setprimernombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
							existe=true;
							representantelegalAux.setsegundonombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							representantelegalAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							representantelegalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							representantelegalAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION)) {
							existe=true;
							representantelegalAux.setextension(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							representantelegalAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO)) {
							existe=true;
							representantelegalAux.setmontoaurorizado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							representantelegalAux.setemail(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RepresentanteLegal representantelegalAux:representantelegals) {
					
						if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							representantelegalAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO)) {
							existe=true;
							representantelegalAux.setapellidopaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO)) {
							existe=true;
							representantelegalAux.setapellidomaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE)) {
							existe=true;
							representantelegalAux.setprimernombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
							existe=true;
							representantelegalAux.setsegundonombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							representantelegalAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							representantelegalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							representantelegalAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION)) {
							existe=true;
							representantelegalAux.setextension(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							representantelegalAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO)) {
							existe=true;
							representantelegalAux.setmontoaurorizado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							representantelegalAux.setemail(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRepresentanteLegalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRepresentanteLegal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRepresentanteLegal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRepresentanteLegal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRepresentanteLegal) {				
					conSplash=true;//false;										
					
					//this.startProcessRepresentanteLegal(conSplash);
				
					this.generarReporteRepresentanteLegalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRepresentanteLegalsSeleccionados();
				//this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRepresentanteLegalsSeleccionados(false);
				//this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRepresentanteLegalsSeleccionados(true);
				//this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRepresentanteLegal();
				
				this.exportarRepresentanteLegalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRepresentanteLegals();
				//this.importarRepresentanteLegals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRepresentanteLegal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRepresentanteLegalsSeleccionados();
				//this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Representante Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRepresentanteLegal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRepresentanteLegal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRepresentanteLegal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
				}	
			} 			
			else if(RepresentanteLegalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRepresentanteLegal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRepresentanteLegal(conSplash);
					
						//this.actualizarParametrosGeneralRepresentanteLegal();
						
						this.generarReporteProcesoAccionRepresentanteLegalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RepresentanteLegalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Representante LegalES SELECCIONADOS?", "MANTENIMIENTO DE Representante Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRepresentanteLegal();
				
						this.actualizarParametrosGeneralRepresentanteLegal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.representantelegalReturnGeneral=representantelegalLogic.procesarAccionRepresentanteLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.representantelegalLogic.getRepresentanteLegals(),this.representantelegalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRepresentanteLegalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRepresentanteLegal();
					
					RepresentanteLegalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRepresentanteLegalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRepresentanteLegal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxTiposAccionesFormularioRepresentanteLegal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRepresentanteLegal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRepresentanteLegalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRepresentanteLegal();
			
			if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
			RepresentanteLegal representantelegal=new RepresentanteLegal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRepresentanteLegal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRepresentanteLegal.getSelectedItem();
			
			
			
			
			representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(representantelegalsSeleccionados.size()==1) {
				for(RepresentanteLegal representantelegalAux:representantelegalsSeleccionados) {
					representantelegal=representantelegalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRepresentanteLegal();
			
      		//this.finishProcessRepresentanteLegal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRepresentanteLegalReturnGeneral() throws Exception {
		if(this.representantelegalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.representantelegalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.representantelegalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.representantelegalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.representantelegalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.representantelegalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRepresentanteLegal(false);
		}
		
		if(this.representantelegalReturnGeneral.getConRetornoLista() || this.representantelegalReturnGeneral.getConRetornoObjeto()) {
			if(this.representantelegalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.representantelegalLogic.setRepresentanteLegals(this.representantelegalReturnGeneral.getRepresentanteLegals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.representantelegalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.representantelegalLogic.setRepresentanteLegal(this.representantelegalReturnGeneral.getRepresentanteLegal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRepresentanteLegal(false);
		}
	}
	
	public void actualizarParametrosGeneralRepresentanteLegal() throws Exception {
		
		
	}
	
	public ArrayList<RepresentanteLegal> getRepresentanteLegalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRepresentanteLegal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RepresentanteLegal representantelegalAux:representantelegalLogic.getRepresentanteLegals()) {
					if(representantelegalAux.getIsSelected()) {
						representantelegalsSeleccionados.add(representantelegalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RepresentanteLegal representantelegalAux:this.representantelegals) {
					if(representantelegalAux.getIsSelected()) {
						representantelegalsSeleccionados.add(representantelegalAux);				
					}
				}
			}
			
			if(representantelegalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						representantelegalsSeleccionados.addAll(this.representantelegalLogic.getRepresentanteLegals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						representantelegalsSeleccionados.addAll(this.representantelegals);				
					}
				}
			}
		} else {
			representantelegalsSeleccionados.add(this.representantelegal);
		}
		
		return representantelegalsSeleccionados;
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
	
	public void generarReporteRepresentanteLegalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRepresentanteLegalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRepresentanteLegalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRepresentanteLegalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRepresentanteLegalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Representante Legal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRepresentanteLegalsSeleccionados() throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados);
		
	}	
	
	public void generarReporteNormalRepresentanteLegalsSeleccionados() throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRepresentanteLegalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRepresentanteLegalsSeleccionados() throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRepresentanteLegal();
		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRepresentanteLegal();
		
		
		//this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados ,representantelegalImplementable,representantelegalImplementableHome);
	}
	
	public void mostrarImportacionRepresentanteLegals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRepresentanteLegal();
		
		this.abrirFrameImportacionRepresentanteLegal();		
		
			
		//this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados ,representantelegalImplementable,representantelegalImplementableHome);
	}
	
	public void importarRepresentanteLegals() throws Exception {		
	
	}
	
	public void exportarRepresentanteLegalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRepresentanteLegalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRepresentanteLegalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRepresentanteLegalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Representante Legal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRepresentanteLegalsSeleccionados() throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRepresentanteLegal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RepresentanteLegal representantelegalAux:representantelegalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRepresentanteLegal(representantelegalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//representantelegalAux.setsDetalleGeneralEntityReporte(representantelegalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRepresentanteLegal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_EXTENSION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRepresentanteLegal(RepresentanteLegal representantelegal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=representantelegal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.gettipoidentificacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getapellidopaterno();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getapellidomaterno();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getprimernombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getsegundonombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.gettelefonocodigoarea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getextension();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.gettelefonomovil();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getmontoaurorizado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=representantelegal.getestaactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRepresentanteLegalsSeleccionados() throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RepresentanteLegals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRepresentanteLegal(row);				
				iRow++;
			}				
			
			for(RepresentanteLegal representantelegalAux:representantelegalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRepresentanteLegal(representantelegalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRepresentanteLegalsSeleccionados() throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();		
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"representantelegal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("representantelegals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("representantelegal");
			//elementRoot.appendChild(element);
		
			for(RepresentanteLegal representantelegalAux:representantelegalsSeleccionados) {
				element = document.createElement("representantelegal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRepresentanteLegal(representantelegalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Representante Legal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRepresentanteLegal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRepresentanteLegal(RepresentanteLegal representantelegal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.gettipoidentificacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getapellidopaterno());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getapellidomaterno());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getprimernombre());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getsegundonombre());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.gettelefonocodigoarea());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getextension());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.gettelefonomovil());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getmontoaurorizado());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(representantelegal.getestaactivo());				
	}
	
	public void setFilaDatosExportarXmlRepresentanteLegal(RepresentanteLegal representantelegal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RepresentanteLegalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(representantelegal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RepresentanteLegalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(representantelegal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(RepresentanteLegalConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(representantelegal.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipoidentificacion_descripcion = document.createElement(RepresentanteLegalConstantesFunciones.IDTIPOIDENTIFICACION);
		elementtipoidentificacion_descripcion.appendChild(document.createTextNode(representantelegal.gettipoidentificacion_descripcion()));
		element.appendChild(elementtipoidentificacion_descripcion);

		Element elementpais_descripcion = document.createElement(RepresentanteLegalConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(representantelegal.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(RepresentanteLegalConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(representantelegal.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementidentificacion = document.createElement(RepresentanteLegalConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(representantelegal.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementapellidopaterno = document.createElement(RepresentanteLegalConstantesFunciones.APELLIDOPATERNO);
		elementapellidopaterno.appendChild(document.createTextNode(representantelegal.getapellidopaterno().trim()));
		element.appendChild(elementapellidopaterno);

		Element elementapellidomaterno = document.createElement(RepresentanteLegalConstantesFunciones.APELLIDOMATERNO);
		elementapellidomaterno.appendChild(document.createTextNode(representantelegal.getapellidomaterno().trim()));
		element.appendChild(elementapellidomaterno);

		Element elementprimernombre = document.createElement(RepresentanteLegalConstantesFunciones.PRIMERNOMBRE);
		elementprimernombre.appendChild(document.createTextNode(representantelegal.getprimernombre().trim()));
		element.appendChild(elementprimernombre);

		Element elementsegundonombre = document.createElement(RepresentanteLegalConstantesFunciones.SEGUNDONOMBRE);
		elementsegundonombre.appendChild(document.createTextNode(representantelegal.getsegundonombre().trim()));
		element.appendChild(elementsegundonombre);

		Element elementdireccion = document.createElement(RepresentanteLegalConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(representantelegal.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(RepresentanteLegalConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(representantelegal.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefonocodigoarea = document.createElement(RepresentanteLegalConstantesFunciones.TELEFONOCODIGOAREA);
		elementtelefonocodigoarea.appendChild(document.createTextNode(representantelegal.gettelefonocodigoarea().trim()));
		element.appendChild(elementtelefonocodigoarea);

		Element elementextension = document.createElement(RepresentanteLegalConstantesFunciones.EXTENSION);
		elementextension.appendChild(document.createTextNode(representantelegal.getextension().trim()));
		element.appendChild(elementextension);

		Element elementtelefonomovil = document.createElement(RepresentanteLegalConstantesFunciones.TELEFONOMOVIL);
		elementtelefonomovil.appendChild(document.createTextNode(representantelegal.gettelefonomovil().trim()));
		element.appendChild(elementtelefonomovil);

		Element elementmontoaurorizado = document.createElement(RepresentanteLegalConstantesFunciones.MONTOAURORIZADO);
		elementmontoaurorizado.appendChild(document.createTextNode(representantelegal.getmontoaurorizado().toString().trim()));
		element.appendChild(elementmontoaurorizado);

		Element elementemail = document.createElement(RepresentanteLegalConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(representantelegal.getemail().trim()));
		element.appendChild(elementemail);

		Element elementestaactivo = document.createElement(RepresentanteLegalConstantesFunciones.ESTAACTIVO);
		elementestaactivo.appendChild(document.createTextNode(representantelegal.getestaactivo().toString().trim()));
		element.appendChild(elementestaactivo);
	}
	
	public void generarReporteGroupGenericoRepresentanteLegalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RepresentanteLegal> representantelegalsSeleccionados=new ArrayList<RepresentanteLegal>();
		
		representantelegalsSeleccionados=this.getRepresentanteLegalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRepresentanteLegal(representantelegalsSeleccionados);
		
		this.generarReporteRepresentanteLegals("Todos",representantelegalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRepresentanteLegal(ArrayList<RepresentanteLegal> representantelegalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RepresentanteLegal representantelegalAux:representantelegalsSeleccionados) {
				representantelegalAux.setsDetalleGeneralEntityReporte(representantelegalAux.toString());
			
				if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.gettipoidentificacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getapellidopaterno());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getapellidomaterno());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getprimernombre());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getsegundonombre());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.gettelefonocodigoarea());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_EXTENSION)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getextension());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.gettelefonomovil());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(representantelegalAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					representantelegalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(representantelegalAux.getestaactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RepresentanteLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRepresentanteLegal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRepresentanteLegal=true;
				this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=true;
				this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=true;
			}
			
			this.isVisibilidadCeldaModificarRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=false;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
			this.isVisibilidadCeldaModificarRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=true;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
			this.isVisibilidadCeldaModificarRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=true;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=true;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
			this.isVisibilidadCeldaModificarRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=true;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=true;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=true;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=true;
			this.isVisibilidadCeldaModificarRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=false;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=false;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
			this.isVisibilidadCeldaModificarRepresentanteLegal=true;
			this.isVisibilidadCeldaActualizarRepresentanteLegal=false;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
			this.isVisibilidadCeldaCancelarRepresentanteLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				} else {
					this.isVisibilidadCeldaGuardarRepresentanteLegal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RepresentanteLegalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRepresentanteLegal=true;
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=true;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=true;
		} else {
			this.actualizarEstadoPanelsRepresentanteLegal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRepresentanteLegal=false;
			//this.isVisibilidadCeldaVerFormRepresentanteLegal=false;
			this.isVisibilidadCeldaDuplicarRepresentanteLegal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!representantelegalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
		} else {
			this.isVisibilidadCeldaNuevoRepresentanteLegal=false;
			this.isVisibilidadCeldaGuardarCambiosRepresentanteLegal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(representantelegalSessionBean.getEsGuardarRelacionado()) {
			if(!representantelegalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;												
			}
			
			this.jButtonCerrarRepresentanteLegal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRepresentanteLegal=false;
		}
		
		if(!this.permiteMantenimiento(this.representantelegal)) {
			this.isVisibilidadCeldaActualizarRepresentanteLegal=false;
			this.isVisibilidadCeldaEliminarRepresentanteLegal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRepresentanteLegal() {
	}
	
	public void actualizarEstadoPanelsRepresentanteLegal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(false);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(false);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(false);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRepresentanteLegal!=null) {
				this.jScrollPanelDatosEdicionRepresentanteLegal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRepresentanteLegal!=null) {
				this.jScrollPanelDatosRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRepresentanteLegal!=null) {
				this.jPanelPaginacionRepresentanteLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
					this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.representantelegalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRepresentanteLegal!=null) {
				this.jTabbedPaneBusquedasRepresentanteLegal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRepresentanteLegal!=null) {
				this.jPanelParametrosReportesRepresentanteLegal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCiudad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdCiudadRepresentanteLegal);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdClienteRepresentanteLegal);}

			this.isVisibilidadFK_IdPais=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdPaisRepresentanteLegal);}

			this.isVisibilidadFK_IdValorClienteDocumento=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteDocumento) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdValorClienteDocumentoRepresentanteLegal);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIdentificacion(Boolean isParaTipoIdentificacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIdentificacionNegation=!isParaTipoIdentificacion;

			this.isVisibilidadFK_IdCiudad=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdCiudadRepresentanteLegal);}

			this.isVisibilidadFK_IdCliente=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdClienteRepresentanteLegal);}

			this.isVisibilidadFK_IdPais=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdPaisRepresentanteLegal);}

			this.isVisibilidadFK_IdValorClienteDocumento=isParaTipoIdentificacion;
			if(!this.isVisibilidadFK_IdValorClienteDocumento) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdValorClienteDocumentoRepresentanteLegal);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdCiudadRepresentanteLegal);}

			this.isVisibilidadFK_IdCliente=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdClienteRepresentanteLegal);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdPaisRepresentanteLegal);}

			this.isVisibilidadFK_IdValorClienteDocumento=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdValorClienteDocumento) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdValorClienteDocumentoRepresentanteLegal);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdCiudadRepresentanteLegal);}

			this.isVisibilidadFK_IdCliente=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdClienteRepresentanteLegal);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdPaisRepresentanteLegal);}

			this.isVisibilidadFK_IdValorClienteDocumento=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdValorClienteDocumento) {this.jTabbedPaneBusquedasRepresentanteLegal.remove(jPanelFK_IdValorClienteDocumentoRepresentanteLegal);}
		}
		
	}
	
	
	
	

	public String registrarSesionRepresentanteLegalParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(representantelegalSessionBean==null) {
				representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(representantelegalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.representantelegalFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(RepresentanteLegalConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionRepresentanteLegal(true);
			//clienteSessionBean.setlidRepresentanteLegalActual(this.idRepresentanteLegalActual);

			representantelegalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRepresentanteLegal(true);
			representantelegalSessionBean.setlIdRepresentanteLegalActualForeignKey(this.idRepresentanteLegalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RepresentanteLegalSessionBean representantelegalSessionBean=new RepresentanteLegalSessionBean();
		
		if(this.representantelegalSessionBean==null) {
			this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		}
		
		this.representantelegalSessionBean.setsUltimaBusquedaRepresentanteLegal(this.getsAccionBusqueda());
		this.representantelegalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.representantelegalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			representantelegalSessionBean.setidciudad(this.getidciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			representantelegalSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			representantelegalSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteDocumento")) {
			representantelegalSessionBean.setidvalorclientedocumento(this.getidvalorclientedocumentoFK_IdValorClienteDocumento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RepresentanteLegalSessionBean representantelegalSessionBean=new RepresentanteLegalSessionBean();
		
		if(this.representantelegalSessionBean==null) {
			this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		}
		
		if(this.representantelegalSessionBean.getsUltimaBusquedaRepresentanteLegal()!=null&&!this.representantelegalSessionBean.getsUltimaBusquedaRepresentanteLegal().equals("")) {
			this.setsAccionBusqueda(representantelegalSessionBean.getsUltimaBusquedaRepresentanteLegal());
			this.setiNumeroPaginacion(representantelegalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(representantelegalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setidciudadFK_IdCiudad(representantelegalSessionBean.getidciudad());
				representantelegalSessionBean.setidciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(representantelegalSessionBean.getidcliente());
				representantelegalSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(representantelegalSessionBean.getid_pais());
				representantelegalSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteDocumento")) {
				this.setidvalorclientedocumentoFK_IdValorClienteDocumento(representantelegalSessionBean.getidvalorclientedocumento());
				representantelegalSessionBean.setidvalorclientedocumento(-1L);
			}
		}
		
		this.representantelegalSessionBean.setsUltimaBusquedaRepresentanteLegal("");
		this.representantelegalSessionBean.setiNumeroPaginacion(RepresentanteLegalConstantesFunciones.INUMEROPAGINACION);
		this.representantelegalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRepresentanteLegal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRepresentanteLegal() {
		this.updateBorderResaltarBusquedasFormularioRepresentanteLegal();
		this.updateVisibilidadBusquedasFormularioRepresentanteLegal();
		this.updateHabilitarBusquedasFormularioRepresentanteLegal();
	}
	
	public void updateBorderResaltarBusquedasFormularioRepresentanteLegal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRepresentanteLegal.getComponents().length>0) {
	

		if(this.representantelegalConstantesFunciones.resaltarFK_IdCiudadRepresentanteLegal!=null) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdCiudadRepresentanteLegal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdCiudadRepresentanteLegal);
			}
		}

		if(this.representantelegalConstantesFunciones.resaltarFK_IdClienteRepresentanteLegal!=null) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdClienteRepresentanteLegal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdClienteRepresentanteLegal);
			}
		}

		if(this.representantelegalConstantesFunciones.resaltarFK_IdPaisRepresentanteLegal!=null) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdPaisRepresentanteLegal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdPaisRepresentanteLegal);
			}
		}

		if(this.representantelegalConstantesFunciones.resaltarFK_IdValorClienteDocumentoRepresentanteLegal!=null) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdValorClienteDocumentoRepresentanteLegal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdValorClienteDocumentoRepresentanteLegal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRepresentanteLegal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRepresentanteLegal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdCiudadRepresentanteLegal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.representantelegalConstantesFunciones.mostrarFK_IdCiudadRepresentanteLegal);
			if(!this.representantelegalConstantesFunciones.mostrarFK_IdCiudadRepresentanteLegal && index>-1) {
				this.jTabbedPaneBusquedasRepresentanteLegal.remove(index);
			}

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdClienteRepresentanteLegal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.representantelegalConstantesFunciones.mostrarFK_IdClienteRepresentanteLegal);
			if(!this.representantelegalConstantesFunciones.mostrarFK_IdClienteRepresentanteLegal && index>-1) {
				this.jTabbedPaneBusquedasRepresentanteLegal.remove(index);
			}

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdPaisRepresentanteLegal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.representantelegalConstantesFunciones.mostrarFK_IdPaisRepresentanteLegal);
			if(!this.representantelegalConstantesFunciones.mostrarFK_IdPaisRepresentanteLegal && index>-1) {
				this.jTabbedPaneBusquedasRepresentanteLegal.remove(index);
			}

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdValorClienteDocumentoRepresentanteLegal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.representantelegalConstantesFunciones.mostrarFK_IdValorClienteDocumentoRepresentanteLegal);
			if(!this.representantelegalConstantesFunciones.mostrarFK_IdValorClienteDocumentoRepresentanteLegal && index>-1) {
				this.jTabbedPaneBusquedasRepresentanteLegal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRepresentanteLegal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRepresentanteLegal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdCiudadRepresentanteLegal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.representantelegalConstantesFunciones.activarFK_IdCiudadRepresentanteLegal);
				this.jTabbedPaneBusquedasRepresentanteLegal.setEnabledAt(index,this.representantelegalConstantesFunciones.activarFK_IdCiudadRepresentanteLegal);
			}

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdClienteRepresentanteLegal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.representantelegalConstantesFunciones.activarFK_IdClienteRepresentanteLegal);
				this.jTabbedPaneBusquedasRepresentanteLegal.setEnabledAt(index,this.representantelegalConstantesFunciones.activarFK_IdClienteRepresentanteLegal);
			}

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdPaisRepresentanteLegal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.representantelegalConstantesFunciones.activarFK_IdPaisRepresentanteLegal);
				this.jTabbedPaneBusquedasRepresentanteLegal.setEnabledAt(index,this.representantelegalConstantesFunciones.activarFK_IdPaisRepresentanteLegal);
			}

			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdValorClienteDocumentoRepresentanteLegal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.representantelegalConstantesFunciones.activarFK_IdValorClienteDocumentoRepresentanteLegal);
				this.jTabbedPaneBusquedasRepresentanteLegal.setEnabledAt(index,this.representantelegalConstantesFunciones.activarFK_IdValorClienteDocumentoRepresentanteLegal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRepresentanteLegal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdCiudadRepresentanteLegal);

			this.jTabbedPaneBusquedasRepresentanteLegal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);

			this.representantelegalConstantesFunciones.setResaltarFK_IdCiudadRepresentanteLegal(resaltar);

			jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdCiudadRepresentanteLegal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdClienteRepresentanteLegal);

			this.jTabbedPaneBusquedasRepresentanteLegal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);

			this.representantelegalConstantesFunciones.setResaltarFK_IdClienteRepresentanteLegal(resaltar);

			jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdClienteRepresentanteLegal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdPaisRepresentanteLegal);

			this.jTabbedPaneBusquedasRepresentanteLegal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);

			this.representantelegalConstantesFunciones.setResaltarFK_IdPaisRepresentanteLegal(resaltar);

			jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdPaisRepresentanteLegal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteDocumento")) {
			index= this.jTabbedPaneBusquedasRepresentanteLegal.indexOfComponent(this.jPanelFK_IdValorClienteDocumentoRepresentanteLegal);

			this.jTabbedPaneBusquedasRepresentanteLegal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRepresentanteLegal.getComponent(index);

			this.representantelegalConstantesFunciones.setResaltarFK_IdValorClienteDocumentoRepresentanteLegal(resaltar);

			jPanel.setBorder(this.representantelegalConstantesFunciones.resaltarFK_IdValorClienteDocumentoRepresentanteLegal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRepresentanteLegal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRepresentanteLegal() throws Exception {

		if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRepresentanteLegal();
		this.updateVisibilidadResaltarControlesFormularioRepresentanteLegal();
		this.updateHabilitarResaltarControlesFormularioRepresentanteLegal();
		
	}
	
	public void updateBorderResaltarControlesFormularioRepresentanteLegal() throws Exception {
		if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.representantelegalConstantesFunciones.resaltaridRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltaridRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltaridclienteRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltaridclienteRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltaridvalorclientedocumentoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltaridvalorclientedocumentoRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarid_paisRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarid_paisRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltaridciudadRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltaridciudadRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltaridentificacionRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltaridentificacionRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarapellidopaternoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarapellidopaternoRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarapellidomaternoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarapellidomaternoRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarprimernombreRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarprimernombreRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarsegundonombreRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarsegundonombreRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltardireccionRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltardireccionRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltartelefonoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltartelefonoRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltartelefonocodigoareaRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltartelefonocodigoareaRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarextensionRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarextensionRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltartelefonomovilRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltartelefonomovilRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarmontoaurorizadoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarmontoaurorizadoRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltaremailRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltaremailRepresentanteLegal);}
		if(this.representantelegalConstantesFunciones.resaltarestaactivoRepresentanteLegal!=null && this.jInternalFrameDetalleFormRepresentanteLegal!=null) {this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setBorderPainted(true);this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setBorder(this.representantelegalConstantesFunciones.resaltarestaactivoRepresentanteLegal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRepresentanteLegal() throws Exception {		
		if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
	
		//this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelidRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridclienteRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelidclienteRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridclienteRepresentanteLegal);
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridclienteRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridvalorclientedocumentoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelidvalorclientedocumentoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridvalorclientedocumentoRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarid_paisRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelid_paisRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarid_paisRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridciudadRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelidciudadRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridciudadRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridentificacionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelidentificacionRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraridentificacionRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarapellidopaternoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelapellidopaternoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarapellidopaternoRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarapellidomaternoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelapellidomaternoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarapellidomaternoRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarprimernombreRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelprimernombreRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarprimernombreRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarsegundonombreRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelsegundonombreRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarsegundonombreRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrardireccionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPaneldireccionRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrardireccionRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrartelefonoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPaneltelefonoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrartelefonoRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrartelefonocodigoareaRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPaneltelefonocodigoareaRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrartelefonocodigoareaRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarextensionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelextensionRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarextensionRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrartelefonomovilRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPaneltelefonomovilRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrartelefonomovilRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarmontoaurorizadoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelmontoaurorizadoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarmontoaurorizadoRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraremailRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelemailRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostraremailRepresentanteLegal);
		//this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarestaactivoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jPanelestaactivoRepresentanteLegal.setVisible(this.representantelegalConstantesFunciones.mostrarestaactivoRepresentanteLegal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRepresentanteLegal() throws Exception {
		if(this.jInternalFrameDetalleFormRepresentanteLegal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRepresentanteLegal!=null) {
	
		this.jInternalFrameDetalleFormRepresentanteLegal.jLabelidRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaridRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidclienteRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaridclienteRepresentanteLegal);
			this.jInternalFrameDetalleFormRepresentanteLegal.jButtonidclienteRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaridclienteRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidvalorclientedocumentoRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaridvalorclientedocumentoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxid_paisRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarid_paisRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jComboBoxidciudadRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaridciudadRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldidentificacionRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaridentificacionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidopaternoRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarapellidopaternoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaapellidomaternoRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarapellidomaternoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaprimernombreRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarprimernombreRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreasegundonombreRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarsegundonombreRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreadireccionRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activardireccionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonoRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activartelefonoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldtelefonocodigoareaRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activartelefonocodigoareaRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldextensionRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarextensionRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreatelefonomovilRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activartelefonomovilRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextFieldmontoaurorizadoRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarmontoaurorizadoRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jTextAreaemailRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activaremailRepresentanteLegal);
		this.jInternalFrameDetalleFormRepresentanteLegal.jCheckBoxestaactivoRepresentanteLegal.setEnabled(this.representantelegalConstantesFunciones.activarestaactivoRepresentanteLegal);
		}
	}
	
		
}