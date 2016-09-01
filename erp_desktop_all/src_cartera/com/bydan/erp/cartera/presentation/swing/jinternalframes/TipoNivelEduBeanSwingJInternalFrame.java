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

import com.bydan.erp.cartera.util.TipoNivelEduConstantesFunciones;
import com.bydan.erp.cartera.util.TipoNivelEduParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoNivelEduParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoNivelEduBean;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoNivelEduBeanSwingJInternalFrame extends TipoNivelEduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoNivelEduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoNivelEdu> tiponiveleduValidator = new ClassValidator<TipoNivelEdu>(TipoNivelEdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoNivelEdu tiponiveledu;	
	public TipoNivelEdu tiponiveleduAux;
	public TipoNivelEdu tiponiveleduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoNivelEdu tiponiveleduTotales;
	public Long idTipoNivelEduActual;
	public Long iIdNuevoTipoNivelEdu=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosSubCliente=false;

	public Boolean getIsTienePermisosSubCliente() {
		return isTienePermisosSubCliente;
	}

	public void setIsTienePermisosSubCliente(Boolean isTienePermisosSubCliente) {
		this.isTienePermisosSubCliente= isTienePermisosSubCliente;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
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
	
	public Boolean isPermisoTodoTipoNivelEdu;
	public Boolean isPermisoNuevoTipoNivelEdu;
	public Boolean isPermisoActualizarTipoNivelEdu;
	public Boolean isPermisoActualizarOriginalTipoNivelEdu;
	public Boolean isPermisoEliminarTipoNivelEdu;
	public Boolean isPermisoGuardarCambiosTipoNivelEdu;
	public Boolean isPermisoConsultaTipoNivelEdu;
	public Boolean isPermisoBusquedaTipoNivelEdu;
	public Boolean isPermisoReporteTipoNivelEdu;
	public Boolean isPermisoPaginacionMedioTipoNivelEdu;
	public Boolean isPermisoPaginacionAltoTipoNivelEdu;
	public Boolean isPermisoPaginacionTodoTipoNivelEdu;
	public Boolean isPermisoCopiarTipoNivelEdu;
	public Boolean isPermisoVerFormTipoNivelEdu;
	public Boolean isPermisoDuplicarTipoNivelEdu;
	public Boolean isPermisoOrdenTipoNivelEdu;
	
	
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
	
	public TipoNivelEduParameterReturnGeneral tiponiveleduReturnGeneral;
	public TipoNivelEduParameterReturnGeneral tiponiveleduParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public SubClienteLogic subclienteLogic=null;

	public SubClienteLogic getSubClienteLogic() {
		return subclienteLogic;
	}

	public void setSubClienteLogic(SubClienteLogic subclienteLogic) {
		this.subclienteLogic = subclienteLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoNivelEdu=false;
	public Boolean esParaAccionDesdeFormularioTipoNivelEdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoNivelEduSessionBeanAdditional tiponiveleduSessionBeanAdditional=null;
	
	public TipoNivelEduSessionBeanAdditional getTipoNivelEduSessionBeanAdditional() {
		return this.tiponiveleduSessionBeanAdditional;
	}
	
	public void setTipoNivelEduSessionBeanAdditional(TipoNivelEduSessionBeanAdditional tiponiveleduSessionBeanAdditional) {
		try {
			this.tiponiveleduSessionBeanAdditional=tiponiveleduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoNivelEduBeanSwingJInternalFrameAdditional tiponiveleduBeanSwingJInternalFrameAdditional=null;
	//public class TipoNivelEduBeanSwingJInternalFrame
	
	public TipoNivelEduBeanSwingJInternalFrameAdditional getTipoNivelEduBeanSwingJInternalFrameAdditional() {
		return this.tiponiveleduBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoNivelEduBeanSwingJInternalFrameAdditional(TipoNivelEduBeanSwingJInternalFrameAdditional tiponiveleduBeanSwingJInternalFrameAdditional) {
		try {
			this.tiponiveleduBeanSwingJInternalFrameAdditional=tiponiveleduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoNivelEduLogic tiponiveleduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoNivelEdu tiponiveleduBean;
	public TipoNivelEduConstantesFunciones tiponiveleduConstantesFunciones;
	//public TipoNivelEduParameterReturnGeneral tiponiveleduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoNivelEdu> tiponiveledus;	
	//public List<TipoNivelEdu> tiponiveledusEliminados;
	//public List<TipoNivelEdu> tiponiveledusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoNivelEdu=false;
	public Boolean isVisibilidadCeldaDuplicarTipoNivelEdu=true;
	public Boolean isVisibilidadCeldaCopiarTipoNivelEdu=true;
	public Boolean isVisibilidadCeldaVerFormTipoNivelEdu=true;
	public Boolean isVisibilidadCeldaOrdenTipoNivelEdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
	public Boolean isVisibilidadCeldaModificarTipoNivelEdu=false;
	public Boolean isVisibilidadCeldaActualizarTipoNivelEdu=false;
	public Boolean isVisibilidadCeldaEliminarTipoNivelEdu=false;
	public Boolean isVisibilidadCeldaCancelarTipoNivelEdu=false;
	public Boolean isVisibilidadCeldaGuardarTipoNivelEdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoNivelEdu() {
		return this.iIdNuevoTipoNivelEdu;
	}

	public void setiIdNuevoTipoNivelEdu(Long iIdNuevoTipoNivelEdu) {
		this.iIdNuevoTipoNivelEdu = iIdNuevoTipoNivelEdu;
	}
	
	public Long getidTipoNivelEduActual() {
		return this.idTipoNivelEduActual;
	}

	public void setidTipoNivelEduActual(Long idTipoNivelEduActual) {
		this.idTipoNivelEduActual = idTipoNivelEduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoNivelEdu gettiponiveledu() {
		return this.tiponiveledu;
	}

	public void settiponiveledu(TipoNivelEdu tiponiveledu) {
		this.tiponiveledu = tiponiveledu;
	}
	
	public TipoNivelEdu gettiponiveleduAux() {
		return this.tiponiveleduAux;
	}

	public void settiponiveleduAux(TipoNivelEdu tiponiveleduAux) {
		this.tiponiveleduAux = tiponiveleduAux;
	}				
	
	public TipoNivelEdu gettiponiveleduAnterior() {
		return this.tiponiveleduAnterior;
	}

	public void settiponiveleduAnterior(TipoNivelEdu tiponiveleduAnterior) {
		this.tiponiveleduAnterior = tiponiveleduAnterior;
	}	
	
	public TipoNivelEdu gettiponiveleduTotales() {
		return this.tiponiveleduTotales;
	}

	public void settiponiveleduTotales(TipoNivelEdu tiponiveleduTotales) {
		this.tiponiveleduTotales = tiponiveleduTotales;
	}	
	
	public TipoNivelEdu gettiponiveleduBean() {
		return this.tiponiveleduBean;
	}

	public void settiponiveleduBean(TipoNivelEdu tiponiveleduBean) {
		this.tiponiveleduBean = tiponiveleduBean;
	}	
	
	public TipoNivelEduParameterReturnGeneral gettiponiveleduReturnGeneral() {
		return this.tiponiveleduReturnGeneral;
	}

	public void settiponiveleduReturnGeneral(TipoNivelEduParameterReturnGeneral tiponiveleduReturnGeneral) {
		this.tiponiveleduReturnGeneral = tiponiveleduReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoNivelEduLogic getTipoNivelEduLogic()	{		
		return tiponiveleduLogic;
	}

	public void setTipoNivelEduLogic(TipoNivelEduLogic tiponiveleduLogic) {
		this.tiponiveleduLogic = tiponiveleduLogic;
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
	
	public Boolean getIsEsNuevoTipoNivelEdu() {
		return isEsNuevoTipoNivelEdu;
	}

	public void setIsEsNuevoTipoNivelEdu(Boolean isEsNuevoTipoNivelEdu) {
		this.isEsNuevoTipoNivelEdu = isEsNuevoTipoNivelEdu;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoNivelEdu() {
		return esParaAccionDesdeFormularioTipoNivelEdu;
	}
	
	public void setEsParaAccionDesdeFormularioTipoNivelEdu(Boolean esParaAccionDesdeFormularioTipoNivelEdu) {
		this.esParaAccionDesdeFormularioTipoNivelEdu = esParaAccionDesdeFormularioTipoNivelEdu;
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

			if(this.tiponiveleduSessionBean==null) {
				this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
			}

			if(!this.tiponiveleduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiponiveleduSessionBean.getlidEmpresaActual());
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

					if(this.tiponiveledu!=null) {
						this.tiponiveledu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
						this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoNivelEdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
						if(this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoNivelEduGenerico)throws Exception
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
				jComboBoxid_empresaTipoNivelEduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoNivelEduGenerico!=null && jComboBoxid_empresaTipoNivelEduGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoNivelEduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoNivelEdu tiponiveledu,JComboBox jComboBoxid_empresaTipoNivelEduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoNivelEduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoNivelEduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiponiveledu.setid_empresa(empresaAux.getId());
				tiponiveledu.setempresa_descripcion(TipoNivelEduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiponiveledu.setEmpresa(empresaAux);			}
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

					if(!TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { 
							this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { 
					}

					if(!TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
							this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
							this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoNivelEdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoNivelEduConstantesFunciones.refrescarForeignKeysDescripcionesTipoNivelEdu(this.tiponiveleduLogic.getTipoNivelEdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoNivelEduConstantesFunciones.refrescarForeignKeysDescripcionesTipoNivelEdu(this.tiponiveledus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiponiveleduLogic.setTipoNivelEdus(this.tiponiveledus);
			tiponiveleduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoNivelEduParameterReturnGeneral getTipoNivelEduParameterGeneral() {
		return this.tiponiveleduParameterGeneral;
	}
	
	public void setTipoNivelEduParameterGeneral(TipoNivelEduParameterReturnGeneral tiponiveleduParameterGeneral) {
		this.tiponiveleduParameterGeneral = tiponiveleduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoNivelEdu() {
		return isPermisoTodoTipoNivelEdu;
	}

	public void setIsPermisoTodoTipoNivelEdu(Boolean isPermisoTodoTipoNivelEdu) {
		this.isPermisoTodoTipoNivelEdu = isPermisoTodoTipoNivelEdu;
	}

	public Boolean getIsPermisoNuevoTipoNivelEdu() {
		return isPermisoNuevoTipoNivelEdu;
	}

	public void setIsPermisoNuevoTipoNivelEdu(Boolean isPermisoNuevoTipoNivelEdu) {
		this.isPermisoNuevoTipoNivelEdu = isPermisoNuevoTipoNivelEdu;
	}

	public Boolean getIsPermisoActualizarTipoNivelEdu() {
		return isPermisoActualizarTipoNivelEdu;
	}

	public void setIsPermisoActualizarTipoNivelEdu(Boolean isPermisoActualizarTipoNivelEdu) {
		this.isPermisoActualizarTipoNivelEdu = isPermisoActualizarTipoNivelEdu;
	}

	public Boolean getIsPermisoEliminarTipoNivelEdu() {
		return isPermisoEliminarTipoNivelEdu;
	}

	public void setIsPermisoEliminarTipoNivelEdu(Boolean isPermisoEliminarTipoNivelEdu) {
		this.isPermisoEliminarTipoNivelEdu = isPermisoEliminarTipoNivelEdu;
	}

	public Boolean getIsPermisoGuardarCambiosTipoNivelEdu() {
		return isPermisoGuardarCambiosTipoNivelEdu;
	}

	public void setIsPermisoGuardarCambiosTipoNivelEdu(Boolean isPermisoGuardarCambiosTipoNivelEdu) {
		this.isPermisoGuardarCambiosTipoNivelEdu = isPermisoGuardarCambiosTipoNivelEdu;
	}
	
	public Boolean getIsPermisoConsultaTipoNivelEdu() {
		return isPermisoConsultaTipoNivelEdu;
	}

	public void setIsPermisoConsultaTipoNivelEdu(Boolean isPermisoConsultaTipoNivelEdu) {
		this.isPermisoConsultaTipoNivelEdu = isPermisoConsultaTipoNivelEdu;
	}

	public Boolean getIsPermisoBusquedaTipoNivelEdu() {
		return isPermisoBusquedaTipoNivelEdu;
	}

	public void setIsPermisoBusquedaTipoNivelEdu(Boolean isPermisoBusquedaTipoNivelEdu) {
		this.isPermisoBusquedaTipoNivelEdu = isPermisoBusquedaTipoNivelEdu;
	}

	public Boolean getIsPermisoReporteTipoNivelEdu() {
		return isPermisoReporteTipoNivelEdu;
	}

	public void setIsPermisoReporteTipoNivelEdu(Boolean isPermisoReporteTipoNivelEdu) {
		this.isPermisoReporteTipoNivelEdu = isPermisoReporteTipoNivelEdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoNivelEdu() {
		return isPermisoPaginacionMedioTipoNivelEdu;
	}

	public void setIsPermisoPaginacionMedioTipoNivelEdu(Boolean isPermisoPaginacionMedioTipoNivelEdu) {
		this.isPermisoPaginacionMedioTipoNivelEdu = isPermisoPaginacionMedioTipoNivelEdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoNivelEdu() {
		return isPermisoPaginacionTodoTipoNivelEdu;
	}

	public void setIsPermisoPaginacionTodoTipoNivelEdu(Boolean isPermisoPaginacionTodoTipoNivelEdu) {
		this.isPermisoPaginacionTodoTipoNivelEdu = isPermisoPaginacionTodoTipoNivelEdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoNivelEdu() {
		return isPermisoPaginacionAltoTipoNivelEdu;
	}

	public void setIsPermisoPaginacionAltoTipoNivelEdu(Boolean isPermisoPaginacionAltoTipoNivelEdu) {
		this.isPermisoPaginacionAltoTipoNivelEdu = isPermisoPaginacionAltoTipoNivelEdu;
	}
	
	public Boolean getIsPermisoCopiarTipoNivelEdu() {
		return isPermisoCopiarTipoNivelEdu;
	}

	public void setIsPermisoCopiarTipoNivelEdu(Boolean isPermisoCopiarTipoNivelEdu) {
		this.isPermisoCopiarTipoNivelEdu = isPermisoCopiarTipoNivelEdu;
	}
	
	public Boolean getIsPermisoVerFormTipoNivelEdu() {
		return isPermisoVerFormTipoNivelEdu;
	}

	public void setIsPermisoVerFormTipoNivelEdu(Boolean isPermisoVerFormTipoNivelEdu) {
		this.isPermisoVerFormTipoNivelEdu = isPermisoVerFormTipoNivelEdu;
	}
	
	public Boolean getIsPermisoDuplicarTipoNivelEdu() {
		return isPermisoDuplicarTipoNivelEdu;
	}

	public void setIsPermisoDuplicarTipoNivelEdu(Boolean isPermisoDuplicarTipoNivelEdu) {
		this.isPermisoDuplicarTipoNivelEdu = isPermisoDuplicarTipoNivelEdu;
	}
	
	public Boolean getIsPermisoOrdenTipoNivelEdu() {
		return isPermisoOrdenTipoNivelEdu;
	}

	public void setIsPermisoOrdenTipoNivelEdu(Boolean isPermisoOrdenTipoNivelEdu) {
		this.isPermisoOrdenTipoNivelEdu = isPermisoOrdenTipoNivelEdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoNivelEdu() {
		return isVisibilidadCeldaNuevoTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaNuevoTipoNivelEdu(Boolean isVisibilidadCeldaNuevoTipoNivelEdu) {
		this.isVisibilidadCeldaNuevoTipoNivelEdu = isVisibilidadCeldaNuevoTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoNivelEdu() {
		return isVisibilidadCeldaDuplicarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaDuplicarTipoNivelEdu(Boolean isVisibilidadCeldaDuplicarTipoNivelEdu) {
		this.isVisibilidadCeldaDuplicarTipoNivelEdu = isVisibilidadCeldaDuplicarTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoNivelEdu() {
		return isVisibilidadCeldaCopiarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaCopiarTipoNivelEdu(Boolean isVisibilidadCeldaCopiarTipoNivelEdu) {
		this.isVisibilidadCeldaCopiarTipoNivelEdu = isVisibilidadCeldaCopiarTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoNivelEdu() {
		return isVisibilidadCeldaVerFormTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaVerFormTipoNivelEdu(Boolean isVisibilidadCeldaVerFormTipoNivelEdu) {
		this.isVisibilidadCeldaVerFormTipoNivelEdu = isVisibilidadCeldaVerFormTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoNivelEdu() {
		return isVisibilidadCeldaOrdenTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaOrdenTipoNivelEdu(Boolean isVisibilidadCeldaOrdenTipoNivelEdu) {
		this.isVisibilidadCeldaOrdenTipoNivelEdu = isVisibilidadCeldaOrdenTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoNivelEdu() {
		return isVisibilidadCeldaNuevoRelacionesTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoNivelEdu(Boolean isVisibilidadCeldaNuevoRelacionesTipoNivelEdu) {
		this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu = isVisibilidadCeldaNuevoRelacionesTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoNivelEdu() {
		return isVisibilidadCeldaModificarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaModificarTipoNivelEdu(Boolean isVisibilidadCeldaModificarTipoNivelEdu) {
		this.isVisibilidadCeldaModificarTipoNivelEdu = isVisibilidadCeldaModificarTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoNivelEdu() {
		return isVisibilidadCeldaActualizarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaActualizarTipoNivelEdu(Boolean isVisibilidadCeldaActualizarTipoNivelEdu) {
		this.isVisibilidadCeldaActualizarTipoNivelEdu = isVisibilidadCeldaActualizarTipoNivelEdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoNivelEdu() {
		return isVisibilidadCeldaEliminarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaEliminarTipoNivelEdu(Boolean isVisibilidadCeldaEliminarTipoNivelEdu) {
		this.isVisibilidadCeldaEliminarTipoNivelEdu = isVisibilidadCeldaEliminarTipoNivelEdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoNivelEdu() {
		return isVisibilidadCeldaCancelarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaCancelarTipoNivelEdu(Boolean isVisibilidadCeldaCancelarTipoNivelEdu) {
		this.isVisibilidadCeldaCancelarTipoNivelEdu = isVisibilidadCeldaCancelarTipoNivelEdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoNivelEdu() {
		return isVisibilidadCeldaGuardarTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaGuardarTipoNivelEdu(Boolean isVisibilidadCeldaGuardarTipoNivelEdu) {
		this.isVisibilidadCeldaGuardarTipoNivelEdu = isVisibilidadCeldaGuardarTipoNivelEdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoNivelEdu() {
		return isVisibilidadCeldaGuardarCambiosTipoNivelEdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoNivelEdu(Boolean isVisibilidadCeldaGuardarCambiosTipoNivelEdu) {
		this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu = isVisibilidadCeldaGuardarCambiosTipoNivelEdu;
	}
		
	public TipoNivelEduSessionBean gettiponiveleduSessionBean() {
		return this.tiponiveleduSessionBean;
	}
	
	public void settiponiveleduSessionBean(TipoNivelEduSessionBean tiponiveleduSessionBean) {
		this.tiponiveleduSessionBean=tiponiveleduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(TipoNivelEdu tiponiveledu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiponiveledu,null);
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
	
	public void bugActualizarReferenciaActual(TipoNivelEdu tiponiveledu,TipoNivelEdu tiponiveleduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoNivelEdu(tiponiveledu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiponiveleduAux.setId(tiponiveledu.getId());
		tiponiveleduAux.setVersionRow(tiponiveledu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoNivelEdu();
		
			int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiponiveleduValidator.getInvalidValues(this.tiponiveledu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiponiveleduLogic.setDatosCliente(datosCliente);
			tiponiveleduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiponiveleduAux=new  TipoNivelEdu();
				
				tiponiveleduAux.setIsNew(true);
				tiponiveleduAux.setIsChanged(true);
				
				tiponiveleduAux.setTipoNivelEduOriginal(this.tiponiveledu);
				
				tiponiveleduAux.setId(this.tiponiveledu.getId());	
				tiponiveleduAux.setVersionRow(this.tiponiveledu.getVersionRow());	
				tiponiveleduAux.setid_empresa(this.tiponiveledu.getid_empresa());	
				tiponiveleduAux.setcodigo(this.tiponiveledu.getcodigo());	
				tiponiveleduAux.setnombre(this.tiponiveledu.getnombre());	
				tiponiveleduAux.setes_defecto(this.tiponiveledu.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiponiveleduAux,tiponiveleduLogic.getTipoNivelEdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponiveleduAux,tiponiveledus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveleduLogic.saveTipoNivelEdus();//WithConnection
						//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponiveledu,tiponiveleduAux);
					
					this.refrescarForeignKeysDescripcionesTipoNivelEdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponiveleduLogic.saveTipoNivelEduRelaciones(tiponiveleduAux,this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponiveledu,tiponiveleduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setClientes(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setSubClientes(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponiveleduAux,tiponiveleduLogic.getTipoNivelEdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponiveleduAux,tiponiveledus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponiveledu,tiponiveleduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiponiveleduAux=new  TipoNivelEdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado() 
					|| (this.tiponiveleduSessionBean.getEsGuardarRelacionado() && this.tiponiveledu.getId()>=0)) {
						
					tiponiveleduAux.setIsNew(false);
				}
				
				tiponiveleduAux.setIsDeleted(false);
			
				tiponiveleduAux.setId(this.tiponiveledu.getId());	
				tiponiveleduAux.setVersionRow(this.tiponiveledu.getVersionRow());	
				tiponiveleduAux.setid_empresa(this.tiponiveledu.getid_empresa());	
				tiponiveleduAux.setcodigo(this.tiponiveledu.getcodigo());	
				tiponiveleduAux.setnombre(this.tiponiveledu.getnombre());	
				tiponiveleduAux.setes_defecto(this.tiponiveledu.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponiveleduAux,tiponiveleduLogic.getTipoNivelEdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponiveleduAux,tiponiveledus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveleduLogic.saveTipoNivelEdus();//WithConnection
						//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponiveledu,tiponiveleduAux);
					
					this.refrescarForeignKeysDescripcionesTipoNivelEdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponiveleduLogic.saveTipoNivelEduRelaciones(tiponiveleduAux,this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponiveledu,tiponiveleduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setClientes(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setSubClientes(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponiveleduAux,tiponiveleduLogic.getTipoNivelEdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponiveleduAux,tiponiveledus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponiveledu,tiponiveleduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiponiveleduAux=new  TipoNivelEdu();
				
				tiponiveleduAux.setIsNew(false);
				tiponiveleduAux.setIsChanged(false);
				
				tiponiveleduAux.setIsDeleted(true);
				
				tiponiveleduAux.setId(this.tiponiveledu.getId());	
				tiponiveleduAux.setVersionRow(this.tiponiveledu.getVersionRow());	
				tiponiveleduAux.setid_empresa(this.tiponiveledu.getid_empresa());	
				tiponiveleduAux.setcodigo(this.tiponiveledu.getcodigo());	
				tiponiveleduAux.setnombre(this.tiponiveledu.getnombre());	
				tiponiveleduAux.setes_defecto(this.tiponiveledu.getes_defecto());	
				
				if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiponiveleduAux.getId()>=0) {	
						this.tiponiveledusEliminados.add(tiponiveleduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiponiveleduAux,tiponiveleduLogic.getTipoNivelEdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponiveleduAux,tiponiveledus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveleduLogic.saveTipoNivelEdus();//WithConnection
						//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponiveleduLogic.saveTipoNivelEduRelaciones(tiponiveleduAux,this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setClientes(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setSubClientes(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponiveleduAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiponiveleduAux,tiponiveleduLogic.getTipoNivelEdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiponiveleduAux,tiponiveledus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getTipoNivelEdus().addAll(this.tiponiveledusEliminados);
					
					tiponiveleduLogic.saveTipoNivelEdus();//WithConnection
					//tiponiveleduLogic.getSetVersionRowTipoNivelEdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoNivelEdu();
				
				this.tiponiveledusEliminados= new ArrayList<TipoNivelEdu>();		
			}
			
			if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Nivel Edu GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiponiveledu=tiponiveleduAux;
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
      		//this.finishProcessTipoNivelEdu();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoNivelEdu tiponiveleduLocal) throws Exception {
		
		if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiponiveleduLocal.setClientes(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				tiponiveleduLocal.setSubClientes(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
				tiponiveleduLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				tiponiveleduLocal.setClientes(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clientes);
				tiponiveleduLocal.setSubClientes(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclientes);
				tiponiveleduLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoNivelEdu tiponiveleduLocal) throws Exception {	
		if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiponiveleduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoNivelEduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiponiveleduValidator.getInvalidValues(this.tiponiveledu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoNivelEdu tiponiveledu,List<TipoNivelEdu> tiponiveledus) throws Exception {
		try	{		
			TipoNivelEduConstantesFunciones.actualizarLista(tiponiveledu,tiponiveledus,this.tiponiveleduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoNivelEdu tiponiveledu,List<TipoNivelEdu> tiponiveledus) throws Exception {
		try	{			
			TipoNivelEduConstantesFunciones.actualizarSelectedLista(tiponiveledu,tiponiveledus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoNivelEdu> tiponiveledusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiponiveledusLocal=this.tiponiveleduLogic.getTipoNivelEdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiponiveledusLocal=this.tiponiveledus;
			}
			//ARCHITECTURE
		
			for(TipoNivelEdu tiponiveleduLocal:tiponiveledusLocal) {
				if(this.permiteMantenimiento(tiponiveleduLocal) && tiponiveleduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoNivelEduConstantesFunciones.getTipoNivelEduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoNivelEduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelid_empresaTipoNivelEdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNivelEduConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelcodigoTipoNivelEdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNivelEduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelnombreTipoNivelEdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNivelEduConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabeles_defectoTipoNivelEdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelid_empresaTipoNivelEdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelcodigoTipoNivelEdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelnombreTipoNivelEdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNivelEdu.jLabeles_defectoTipoNivelEdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.tiponiveledu==null) {
				this.tiponiveledu= new TipoNivelEdu();
			}

			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoNivelEdu
				this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);

				this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.getcliente().setTipoNivelEdu(this.tiponiveledu);
			}

			return;
		}
		 else  if(sTipo.equals("SubCliente")) {
			if(this.tiponiveledu==null) {
				this.tiponiveledu= new TipoNivelEdu();
			}

			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoNivelEdu
				this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);

				this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.getsubcliente().setTipoNivelEdu(this.tiponiveledu);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.tiponiveledu==null) {
				this.tiponiveledu= new TipoNivelEdu();
			}

			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoNivelEdu
				this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);

				this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setTipoNivelEdu(this.tiponiveledu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoNivelEdu--;	
		
		
		this.tiponiveleduAux=new TipoNivelEdu();
		
		this.tiponiveleduAux.setId(this.iIdNuevoTipoNivelEdu);
		this.tiponiveleduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponiveleduLogic.getTipoNivelEdus().add(this.tiponiveleduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiponiveledus.add(this.tiponiveleduAux);
		}
		//ARCHITECTURE
		
		this.tiponiveledu=this.tiponiveleduAux;
		
		if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoNivelEdu(this.tiponiveledu);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNivelEdu(this.tiponiveledu);
		}
				
		//this.setDefaultControlesTipoNivelEdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoNivelEdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoNivelEdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNivelEdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNivelEdu(this.tiponiveleduBean,this.tiponiveledu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoNivelEduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
			classes=TipoNivelEduConstantesFunciones.getClassesRelationshipsOfTipoNivelEdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiponiveleduReturnGeneral=tiponiveleduLogic.procesarEventosTipoNivelEdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponiveleduLogic.getTipoNivelEdus(),this.tiponiveledu,this.tiponiveleduParameterGeneral,this.isEsNuevoTipoNivelEdu,classes);//this.tiponiveleduLogic.getTipoNivelEdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoNivelEdu(this.tiponiveleduReturnGeneral,this.tiponiveleduBean,false);
		
		if(this.tiponiveleduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu());
		}
		
		if(this.tiponiveleduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu(),classes);//this.tiponiveleduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoNivelEdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoNivelEdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.RecargarFormTipoNivelEdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoNivelEdu(false);
						
			if(tiponiveleduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNivelEdu();
			}
			
			this.actualizarVisualTableDatosTipoNivelEdu();
			
			this.jTableDatosTipoNivelEdu.setRowSelectionInterval(this.getIndiceNuevoTipoNivelEdu(), this.getIndiceNuevoTipoNivelEdu());
			
			this.seleccionarFilaTablaTipoNivelEduActual();
						
			this.actualizarEstadoCeldasBotonesTipoNivelEdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoNivelEdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setEnabled(isHabilitar && this.tiponiveleduConstantesFunciones.activarcodigoTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setEnabled(isHabilitar && this.tiponiveleduConstantesFunciones.activarnombreTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setEnabled(isHabilitar && this.tiponiveleduConstantesFunciones.activares_defectoTipoNivelEdu);	
		//
		this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setEnabled(isHabilitar && this.tiponiveleduConstantesFunciones.activarid_empresaTipoNivelEdu);
	};
	
	public void setDefaultControlesTipoNivelEdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoNivelEdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiponiveleduSessionBean.setConGuardarRelaciones(true);			
			this.tiponiveleduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiponiveleduSessionBean.setConGuardarRelaciones(false);			
			this.tiponiveleduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoNivelEdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
				if(tiponiveleduAux.getId().equals(this.iIdNuevoTipoNivelEdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNivelEdu tiponiveleduAux:this.tiponiveledus) {
				if(tiponiveleduAux.getId().equals(this.iIdNuevoTipoNivelEdu)) {
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
	
	public int getIndiceActualTipoNivelEdu(TipoNivelEdu tiponiveledu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
				if(tiponiveleduAux.getId().equals(tiponiveledu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNivelEdu tiponiveleduAux:this.tiponiveledus) {
				if(tiponiveleduAux.getId().equals(tiponiveledu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoNivelEdu(TipoNivelEdu tiponiveleduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
				if(tiponiveleduAux.getTipoNivelEduOriginal().getId().equals(tiponiveleduOriginal.getId())) {
					existe=true;
					tiponiveleduOriginal.setId(tiponiveleduAux.getId());
					tiponiveleduOriginal.setVersionRow(tiponiveleduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNivelEdu tiponiveleduAux:this.tiponiveledus) {
				if(tiponiveleduAux.getTipoNivelEduOriginal().getId().equals(tiponiveleduOriginal.getId())) {
					existe=true;
					tiponiveleduOriginal.setId(tiponiveleduAux.getId());
					tiponiveleduOriginal.setVersionRow(tiponiveleduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoNivelEdu(Boolean esParaCancelar) throws Exception {
		tiponiveledusAux=new ArrayList<TipoNivelEdu>();
		tiponiveleduAux=new TipoNivelEdu();
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
					if(tiponiveleduAux.getId()<0) {
						tiponiveledusAux.add(tiponiveleduAux);
					}		
				}
				this.iIdNuevoTipoNivelEdu=0L;
				this.tiponiveleduLogic.getTipoNivelEdus().removeAll(tiponiveledusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNivelEdu tiponiveleduAux:this.tiponiveledus) {
					if(tiponiveleduAux.getId()<0) {
						tiponiveledusAux.add(tiponiveleduAux);
					}		
				}
				this.iIdNuevoTipoNivelEdu=0L;
				this.tiponiveledus.removeAll(tiponiveledusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoNivelEdu 
					&& this.tiponiveleduLogic.getTipoNivelEdus().size()>0
					) {
					tiponiveleduAux=this.tiponiveleduLogic.getTipoNivelEdus().get(this.tiponiveleduLogic.getTipoNivelEdus().size() - 1);
				
					if(tiponiveleduAux.getId()<0) {
						this.tiponiveleduLogic.getTipoNivelEdus().remove(tiponiveleduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoNivelEdu && this.tiponiveledus.size()>0) {
					tiponiveleduAux=this.tiponiveledus.get(this.tiponiveledus.size() - 1);
				
					if(tiponiveleduAux.getId()<0) {
						this.tiponiveledus.remove(tiponiveleduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoNivelEdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiponiveledu.getId()<0) {
				this.tiponiveleduLogic.getTipoNivelEdus().remove(this.tiponiveledu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiponiveledu.getId()<0) {
				this.tiponiveledus.remove(this.tiponiveledu);
			}
		}			
	}
	
	public void setEstadosInicialesTipoNivelEdu(List<TipoNivelEdu> tiponiveledusAux) throws Exception {
		TipoNivelEduConstantesFunciones.setEstadosInicialesTipoNivelEdu(tiponiveledusAux);
	}
	
	public void setEstadosInicialesTipoNivelEdu(TipoNivelEdu tiponiveleduAux) throws Exception {
		TipoNivelEduConstantesFunciones.setEstadosInicialesTipoNivelEdu(tiponiveleduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoNivelEduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoNivelEdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoNivelEduActual()) {
				if(!this.isEsNuevoTipoNivelEdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoNivelEdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoNivelEdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoNivelEduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Nivel Edu ?", "MANTENIMIENTO DE Tipo Nivel Edu", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoNivelEdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoNivelEdu tiponiveledu) throws Exception {
		TipoNivelEduConstantesFunciones.seleccionarAsignar(this.tiponiveledu,tiponiveledu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoNivelEdu=this.isPermisoActualizarOriginalTipoNivelEdu;
			
			
			this.seleccionarAsignar(tiponiveledu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNivelEduConstantesFunciones.quitarEspaciosTipoNivelEdu(this.tiponiveledu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoNivelEdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiponiveleduSessionBean.setsFuncionBusquedaRapida(this.tiponiveleduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoNivelEdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoNivelEdu(esParaCancelar);				
				this.cancelarNuevoTipoNivelEdu(esParaCancelar);								
			}
			
			this.tiponiveledu=new TipoNivelEdu();
			
			this.inicializarTipoNivelEdu();
			
			this.actualizarEstadoCeldasBotonesTipoNivelEdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoNivelEdu() throws Exception {
		try {
			TipoNivelEduConstantesFunciones.inicializarTipoNivelEdu(this.tiponiveledu);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiponiveleduLogic.getTipoNivelEdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoNivelEdus(String sAccionBusqueda,List<TipoNivelEdu> tiponiveledusParaReportes) throws Exception {
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
					sPathReporteFinal="TipoNivelEdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoNivelEduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoNivelEduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoNivelEdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Nivel Edus");		
		parameters.put("busquedapor", TipoNivelEduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(SubCliente.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoNivelEduLogic tiponiveleduLogicAuxiliar=new TipoNivelEduLogic();
					tiponiveleduLogicAuxiliar.setDatosCliente(tiponiveleduLogic.getDatosCliente());				
					tiponiveleduLogicAuxiliar.setTipoNivelEdus(tiponiveledusParaReportes);
					
					tiponiveleduLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoNivelEduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiponiveledusParaReportes=tiponiveleduLogicAuxiliar.getTipoNivelEdus();
					
					//tiponiveleduLogic.getNewConnexionToDeep();
					
					//for (TipoNivelEdu tiponiveledu:tiponiveledusParaReportes) {
					//	tiponiveleduLogic.deepLoad(tiponiveledu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiponiveleduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiponiveleduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileSubCliente = AuxiliarReportes.class.getResourceAsStream("SubClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subcliente", reportFileSubCliente);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoNivelEdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoNivelEduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoNivelEduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoNivelEdu=new JRBeanArrayDataSource(TipoNivelEduJInternalFrame.TraerTipoNivelEduBeans(tiponiveledusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoNivelEdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoNivelEduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoNivelEduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoNivelEduBean.TraerTipoNivelEduBeans(tiponiveledusParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoNivelEdus(sAccionBusqueda,sTipoArchivoReporte,tiponiveledusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoNivelEdus(sAccionBusqueda,sTipoArchivoReporte,tiponiveledusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoNivelEduActionPerformed(null);
					//this.generarExcelReporteTipoNivelEdus(sAccionBusqueda,sTipoArchivoReporte,tiponiveledusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoNivelEdus(sAccionBusqueda,sTipoArchivoReporte,tiponiveledusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoNivelEdus(sAccionBusqueda,sTipoArchivoReporte,tiponiveledusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoNivelEdus(sAccionBusqueda,sTipoArchivoReporte,tiponiveledusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoNivelEdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNivelEdu> tiponiveledusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNivelEdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNivelEdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoNivelEdu tiponiveledu : tiponiveledusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoNivelEduConstantesFunciones.generarExcelReporteDataTipoNivelEdu("NORMAL",row,workbook,tiponiveledu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoNivelEdu(String sTipo,Row row,Workbook workbook) {
		
		TipoNivelEduConstantesFunciones.generarExcelReporteHeaderTipoNivelEdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoNivelEdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNivelEdu> tiponiveledusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNivelEdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoNivelEdu tiponiveledu : tiponiveledusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoNivelEduConstantesFunciones.getTipoNivelEduDescripcion(tiponiveledu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponiveledu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNivelEduConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponiveledu.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNivelEduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponiveledu.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiponiveledu.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoNivelEdus(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNivelEdu> tiponiveledusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoNivelEdu> tiponiveledusRespaldo=null;
		
		classes=TipoNivelEduConstantesFunciones.getClassesRelationshipsOfTipoNivelEdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiponiveleduLogic.setDatosCliente(this.datosCliente);
		this.tiponiveleduLogic.setDatosDeep(this.datosDeep);
		this.tiponiveleduLogic.setIsConDeep(true);
		
		tiponiveledusRespaldo=this.tiponiveleduLogic.getTipoNivelEdus();
		
		this.tiponiveleduLogic.setTipoNivelEdus(tiponiveledusParaReportes);	
		this.tiponiveleduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiponiveledusParaReportes=this.tiponiveleduLogic.getTipoNivelEdus();
		this.tiponiveleduLogic.setTipoNivelEdus(tiponiveledusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNivelEdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNivelEdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoNivelEdu tiponiveledu : tiponiveledusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoNivelEdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoNivelEduConstantesFunciones.generarExcelReporteDataTipoNivelEdu("NORMAL",row,workbook,tiponiveledu,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiponiveledu.getClientes()!=null && tiponiveledu.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(tiponiveledu.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : tiponiveledu.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiponiveledu.getSubClientes()!=null && tiponiveledu.getSubClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubClienteConstantesFunciones.generarExcelReporteHeaderSubCliente("RELACIONADO",row,workbook);
				}

				if(tiponiveledu.getSubClientes()!=null) {
					i2=0;
					for(SubCliente subcliente : tiponiveledu.getSubClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubClienteConstantesFunciones.generarExcelReporteDataSubCliente("RELACIONADO",row,workbook,subcliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiponiveledu.getParametroCarteraDefectos()!=null && tiponiveledu.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(tiponiveledu.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : tiponiveledu.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoNivelEduConstantesFunciones.getTipoNivelEduDescripcion(tiponiveledu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoNivelEdu() throws Exception {		
		this.startProcessTipoNivelEdu(true);
	}
	
	public void startProcessTipoNivelEdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoNivelEdu ,this.jPanelParametrosReportesTipoNivelEdu, this.jScrollPanelDatosTipoNivelEdu,this.jPanelPaginacionTipoNivelEdu, this.jScrollPanelDatosEdicionTipoNivelEdu, this.jPanelAccionesTipoNivelEdu,this.jPanelAccionesFormularioTipoNivelEdu,this.jmenuBarTipoNivelEdu,this.jmenuBarDetalleTipoNivelEdu,this.jTtoolBarTipoNivelEdu,this.jTtoolBarDetalleTipoNivelEdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNivelEdu=this.jTabbedPaneBusquedasTipoNivelEdu; 
		
		final JPanel jPanelParametrosReportesTipoNivelEdu=this.jPanelParametrosReportesTipoNivelEdu;
		//final JScrollPane jScrollPanelDatosTipoNivelEdu=this.jScrollPanelDatosTipoNivelEdu;
		final JTable jTableDatosTipoNivelEdu=this.jTableDatosTipoNivelEdu;		
		final JPanel jPanelPaginacionTipoNivelEdu=this.jPanelPaginacionTipoNivelEdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoNivelEdu=this.jScrollPanelDatosEdicionTipoNivelEdu;
		final JPanel jPanelAccionesTipoNivelEdu=this.jPanelAccionesTipoNivelEdu;
		
		JPanel jPanelCamposAuxiliarTipoNivelEdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoNivelEdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			jPanelCamposAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jPanelCamposTipoNivelEdu;
			jPanelAccionesFormularioAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jPanelAccionesFormularioTipoNivelEdu;
		}
		
		final JPanel jPanelCamposTipoNivelEdu=jPanelCamposAuxiliarTipoNivelEdu;
		final JPanel jPanelAccionesFormularioTipoNivelEdu=jPanelAccionesFormularioAuxiliarTipoNivelEdu;
		
		
		final JMenuBar jmenuBarTipoNivelEdu=this.jmenuBarTipoNivelEdu;
		final JToolBar jTtoolBarTipoNivelEdu=this.jTtoolBarTipoNivelEdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoNivelEdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNivelEdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			jmenuBarDetalleAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jmenuBarDetalleTipoNivelEdu;
			jTtoolBarDetalleAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jTtoolBarDetalleTipoNivelEdu;
		}
		
		final JMenuBar jmenuBarDetalleTipoNivelEdu=jmenuBarDetalleAuxiliarTipoNivelEdu;
		final JToolBar jTtoolBarDetalleTipoNivelEdu=jTtoolBarDetalleAuxiliarTipoNivelEdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNivelEdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNivelEdu;
			processRunnable.jTableDatos=jTableDatosTipoNivelEdu;
			processRunnable.jPanelCampos=jPanelCamposTipoNivelEdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNivelEdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNivelEdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNivelEdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNivelEdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNivelEdu;
			processRunnable.jTtoolBar=jTtoolBarTipoNivelEdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNivelEdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoNivelEdu ,jPanelParametrosReportesTipoNivelEdu,jTableDatosTipoNivelEdu, /*jScrollPanelDatosTipoNivelEdu,*/jPanelCamposTipoNivelEdu,jPanelPaginacionTipoNivelEdu, /*jScrollPanelDatosEdicionTipoNivelEdu,*/ jPanelAccionesTipoNivelEdu,jPanelAccionesFormularioTipoNivelEdu,jmenuBarTipoNivelEdu,jmenuBarDetalleTipoNivelEdu,jTtoolBarTipoNivelEdu,jTtoolBarDetalleTipoNivelEdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoNivelEdu ,jPanelParametrosReportesTipoNivelEdu, jScrollPanelDatosTipoNivelEdu,jPanelPaginacionTipoNivelEdu, jScrollPanelDatosEdicionTipoNivelEdu, jPanelAccionesTipoNivelEdu,jPanelAccionesFormularioTipoNivelEdu,jmenuBarTipoNivelEdu,jmenuBarDetalleTipoNivelEdu,jTtoolBarTipoNivelEdu,jTtoolBarDetalleTipoNivelEdu);
						
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
	
	public void finishProcessTipoNivelEdu() {// throws Exception 
		this.finishProcessTipoNivelEdu(true);
	}
	
	public void finishProcessTipoNivelEdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoNivelEdu ,this.jPanelParametrosReportesTipoNivelEdu, this.jScrollPanelDatosTipoNivelEdu,this.jPanelPaginacionTipoNivelEdu, this.jScrollPanelDatosEdicionTipoNivelEdu, this.jPanelAccionesTipoNivelEdu,this.jPanelAccionesFormularioTipoNivelEdu,this.jmenuBarTipoNivelEdu,this.jmenuBarDetalleTipoNivelEdu,this.jTtoolBarTipoNivelEdu,this.jTtoolBarDetalleTipoNivelEdu);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNivelEdu=this.jTabbedPaneBusquedasTipoNivelEdu; 
		
		final JPanel jPanelParametrosReportesTipoNivelEdu=this.jPanelParametrosReportesTipoNivelEdu;
		//final JScrollPane jScrollPanelDatosTipoNivelEdu=this.jScrollPanelDatosTipoNivelEdu;
		final JTable jTableDatosTipoNivelEdu=this.jTableDatosTipoNivelEdu;		
		final JPanel jPanelPaginacionTipoNivelEdu=this.jPanelPaginacionTipoNivelEdu;
		//final JScrollPane jScrollPanelDatosEdicionTipoNivelEdu=this.jScrollPanelDatosEdicionTipoNivelEdu;
		final JPanel jPanelAccionesTipoNivelEdu=this.jPanelAccionesTipoNivelEdu;
		
		JPanel jPanelCamposAuxiliarTipoNivelEdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoNivelEdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			jPanelCamposAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jPanelCamposTipoNivelEdu;
			jPanelAccionesFormularioAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jPanelAccionesFormularioTipoNivelEdu;
		}
		
		final JPanel jPanelCamposTipoNivelEdu=jPanelCamposAuxiliarTipoNivelEdu;
		final JPanel jPanelAccionesFormularioTipoNivelEdu=jPanelAccionesFormularioAuxiliarTipoNivelEdu;
		
		
		final JMenuBar jmenuBarTipoNivelEdu=this.jmenuBarTipoNivelEdu;		
		final JToolBar jTtoolBarTipoNivelEdu=this.jTtoolBarTipoNivelEdu;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoNivelEdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNivelEdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			jmenuBarDetalleAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jmenuBarDetalleTipoNivelEdu;
			jTtoolBarDetalleAuxiliarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jTtoolBarDetalleTipoNivelEdu;		
		}
		
		final JMenuBar jmenuBarDetalleTipoNivelEdu=jmenuBarDetalleAuxiliarTipoNivelEdu;
		final JToolBar jTtoolBarDetalleTipoNivelEdu=jTtoolBarDetalleAuxiliarTipoNivelEdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNivelEdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNivelEdu;
			processRunnable.jTableDatos=jTableDatosTipoNivelEdu;
			processRunnable.jPanelCampos=jPanelCamposTipoNivelEdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNivelEdu;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNivelEdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNivelEdu;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNivelEdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNivelEdu;
			processRunnable.jTtoolBar=jTtoolBarTipoNivelEdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNivelEdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoNivelEdu ,jPanelParametrosReportesTipoNivelEdu, jTableDatosTipoNivelEdu,/*jScrollPanelDatosTipoNivelEdu,*/jPanelCamposTipoNivelEdu,jPanelPaginacionTipoNivelEdu, /*jScrollPanelDatosEdicionTipoNivelEdu,*/ jPanelAccionesTipoNivelEdu,jPanelAccionesFormularioTipoNivelEdu,jmenuBarTipoNivelEdu,jmenuBarDetalleTipoNivelEdu,jTtoolBarTipoNivelEdu,jTtoolBarDetalleTipoNivelEdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoNivelEdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoNivelEdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoNivelEdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoNivelEdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoNivelEdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoNivelEdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoNivelEdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoNivelEdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoNivelEdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiponiveleduConstantesFunciones.getsFinalQueryTipoNivelEdu();
		String  finalQueryPaginacionTodos=this.tiponiveleduConstantesFunciones.getsFinalQueryTipoNivelEdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoNivelEduConstantesFunciones.getArrayColumnasGlobalesNoTipoNivelEdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoNivelEduConstantesFunciones.getArrayColumnasGlobalesTipoNivelEdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoNivelEduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiponiveledusEliminados= new ArrayList<TipoNivelEdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoNivelEdu();
		
				///*TipoNivelEduSessionBean*/this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
			
			if(this.tiponiveleduSessionBean==null) {
				this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
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
					this.iNumeroPaginacion=TipoNivelEduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoNivelEduConstantesFunciones.getClassesForeignKeysOfTipoNivelEdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiponiveledu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiponiveledusAux= new ArrayList<TipoNivelEdu>();
			
				
			tiponiveleduLogic.setDatosCliente(this.datosCliente);
			tiponiveleduLogic.setDatosDeep(this.datosDeep);
			tiponiveleduLogic.setIsConDeep(true);
			
			
			tiponiveleduLogic.getTipoNivelEduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiponiveleduLogic.getTodosTipoNivelEdus(finalQueryGlobal,pagination);
					
					//tiponiveleduLogic.getTodosTipoNivelEdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiponiveleduLogic.getTipoNivelEdus()==null|| tiponiveleduLogic.getTipoNivelEdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponiveledusAux= new ArrayList<TipoNivelEdu>();
							tiponiveledusAux.addAll(tiponiveleduLogic.getTipoNivelEdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponiveledusAux= new ArrayList<TipoNivelEdu>();
							tiponiveledusAux.addAll(tiponiveledus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponiveleduLogic.getTodosTipoNivelEdus(finalQueryGlobal+"",this.pagination);												
							
							//tiponiveleduLogic.getTodosTipoNivelEdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoNivelEdus("Todos",tiponiveleduLogic.getTipoNivelEdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponiveleduLogic.setTipoNivelEdus(new ArrayList<TipoNivelEdu>());					
							tiponiveleduLogic.getTipoNivelEdus().addAll(tiponiveledusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponiveledus=new ArrayList<TipoNivelEdu>();
							tiponiveledus.addAll(tiponiveledusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoNivelEdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoNivelEdu=this.idActual;
				
				} else if(this.idTipoNivelEduActual!=null && this.idTipoNivelEduActual!=0L) {
					idTipoNivelEdu=idTipoNivelEduActual;
				}
				
					
				this.sDetalleReporte=TipoNivelEduConstantesFunciones.getDetalleIndicePorId(idTipoNivelEdu);
				
				this.tiponiveledus=new ArrayList<TipoNivelEdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiponiveleduLogic.getEntity(idTipoNivelEdu);
					
					//tiponiveleduLogic.getEntityWithConnection(idTipoNivelEdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponiveleduLogic.setTipoNivelEdus(new ArrayList<TipoNivelEdu>());
					tiponiveleduLogic.getTipoNivelEdus().add(tiponiveleduLogic.getTipoNivelEdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponiveledus=new ArrayList<TipoNivelEdu>();
					this.tiponiveledus.add(tiponiveledu);
				}
				
				if(tiponiveleduLogic.getTipoNivelEdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoNivelEduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiponiveleduLogic.getTipoNivelEdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoNivelEduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoNivelEduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiponiveleduLogic.getTipoNivelEdus()==null||tiponiveleduLogic.getTipoNivelEdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiponiveledus==null|| tiponiveledus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveledusAux=new ArrayList<TipoNivelEdu>();
						tiponiveledusAux.addAll(tiponiveleduLogic.getTipoNivelEdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponiveledusAux=new ArrayList<TipoNivelEdu>();
							tiponiveledusAux.addAll(tiponiveledus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiponiveleduLogic.getTipoNivelEdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoNivelEduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoNivelEduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoNivelEdus("FK_IdEmpresa",tiponiveleduLogic.getTipoNivelEdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoNivelEdus("FK_IdEmpresa",tiponiveledus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveleduLogic.setTipoNivelEdus(new ArrayList<TipoNivelEdu>());
						tiponiveleduLogic.getTipoNivelEdus().addAll(tiponiveledusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponiveledus=new ArrayList<TipoNivelEdu>();
							tiponiveledus.addAll(tiponiveledusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoNivelEdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoNivelEdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponiveleduLogic.getTipoNivelEdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponiveledus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponiveleduLogic.getTipoNivelEdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponiveledus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoNivelEdu tiponiveledu) {
		Boolean permite=true;
		
		if(this.tiponiveledu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoNivelEduConstantesFunciones.getOrderByListaTipoNivelEdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoNivelEduConstantesFunciones.getOrderByListaTipoNivelEdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNivelEdu tiponiveledu:tiponiveleduLogic.getTipoNivelEdus()) {
				if(tiponiveledu.getsType().equals(Constantes2.S_TOTALES)) {
					tiponiveleduTotales=tiponiveledu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNivelEdu tiponiveledu:this.tiponiveledus) {
				if(tiponiveledu.getsType().equals(Constantes2.S_TOTALES)) {
					tiponiveleduTotales=tiponiveledu;
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
			this.tiponiveleduAux=new TipoNivelEdu();
			this.tiponiveleduAux.setsType(Constantes2.S_TOTALES);
			this.tiponiveleduAux.setIsNew(false);
			this.tiponiveleduAux.setIsChanged(false);
			this.tiponiveleduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoNivelEduConstantesFunciones.TotalizarValoresFilaTipoNivelEdu(this.tiponiveleduLogic.getTipoNivelEdus(),this.tiponiveleduAux);
				
				this.tiponiveleduLogic.getTipoNivelEdus().add(this.tiponiveleduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoNivelEduConstantesFunciones.TotalizarValoresFilaTipoNivelEdu(this.tiponiveledus,this.tiponiveleduAux);
				
				this.tiponiveledus.add(this.tiponiveleduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiponiveleduTotales=new TipoNivelEdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponiveleduLogic.getTipoNivelEdus().remove(tiponiveleduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponiveledus.remove(tiponiveleduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiponiveleduTotales=new TipoNivelEdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNivelEdu tiponiveledu:tiponiveleduLogic.getTipoNivelEdus()) {
				if(tiponiveledu.getsType().equals(Constantes2.S_TOTALES)) {
					tiponiveleduTotales=tiponiveledu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNivelEduConstantesFunciones.TotalizarValoresFilaTipoNivelEdu(this.tiponiveleduLogic.getTipoNivelEdus(),tiponiveleduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNivelEdu tiponiveledu:this.tiponiveledus) {
				if(tiponiveledu.getsType().equals(Constantes2.S_TOTALES)) {
					tiponiveleduTotales=tiponiveledu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNivelEduConstantesFunciones.TotalizarValoresFilaTipoNivelEdu(this.tiponiveledus,tiponiveleduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoNivelEdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoNivelEdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponiveleduLogic.getTipoNivelEdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoNivelEdu() {
		this.isPermisoTodoTipoNivelEdu=false;
		this.isPermisoNuevoTipoNivelEdu=false;
		this.isPermisoActualizarTipoNivelEdu=false;
		this.isPermisoActualizarOriginalTipoNivelEdu=false;
		this.isPermisoEliminarTipoNivelEdu=false;
		this.isPermisoGuardarCambiosTipoNivelEdu=false;
		this.isPermisoConsultaTipoNivelEdu=false;
		this.isPermisoBusquedaTipoNivelEdu=false;
		this.isPermisoReporteTipoNivelEdu=false;		
		this.isPermisoOrdenTipoNivelEdu=false;		
		this.isPermisoPaginacionMedioTipoNivelEdu=false;		
		this.isPermisoPaginacionAltoTipoNivelEdu=false;
		this.isPermisoPaginacionTodoTipoNivelEdu=false;
		this.isPermisoCopiarTipoNivelEdu=false;		
		this.isPermisoVerFormTipoNivelEdu=false;		
		this.isPermisoDuplicarTipoNivelEdu=false;		
		this.isPermisoOrdenTipoNivelEdu=false;		
	}
	
	public void setPermisosUsuarioTipoNivelEdu(Boolean isPermiso) {
		this.isPermisoTodoTipoNivelEdu=isPermiso;
		this.isPermisoNuevoTipoNivelEdu=isPermiso;
		this.isPermisoActualizarTipoNivelEdu=isPermiso;
		this.isPermisoActualizarOriginalTipoNivelEdu=isPermiso;
		this.isPermisoEliminarTipoNivelEdu=isPermiso;
		this.isPermisoGuardarCambiosTipoNivelEdu=isPermiso;
		this.isPermisoConsultaTipoNivelEdu=isPermiso;
		this.isPermisoBusquedaTipoNivelEdu=isPermiso;
		this.isPermisoReporteTipoNivelEdu=isPermiso;
		this.isPermisoOrdenTipoNivelEdu=isPermiso;		
		this.isPermisoPaginacionMedioTipoNivelEdu=isPermiso;		
		this.isPermisoPaginacionAltoTipoNivelEdu=isPermiso;		
		this.isPermisoPaginacionTodoTipoNivelEdu=isPermiso;		
		this.isPermisoCopiarTipoNivelEdu=isPermiso;		
		this.isPermisoVerFormTipoNivelEdu=isPermiso;		
		this.isPermisoDuplicarTipoNivelEdu=isPermiso;
		this.isPermisoOrdenTipoNivelEdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoNivelEdu(Boolean isPermiso) {
		//this.isPermisoTodoTipoNivelEdu=isPermiso;
		this.isPermisoNuevoTipoNivelEdu=isPermiso;
		this.isPermisoActualizarTipoNivelEdu=isPermiso;
		this.isPermisoActualizarOriginalTipoNivelEdu=isPermiso;
		this.isPermisoEliminarTipoNivelEdu=isPermiso;
		this.isPermisoGuardarCambiosTipoNivelEdu=isPermiso;
		//this.isPermisoConsultaTipoNivelEdu=isPermiso;
		//this.isPermisoBusquedaTipoNivelEdu=isPermiso;
		//this.isPermisoReporteTipoNivelEdu=isPermiso;
		//this.isPermisoOrdenTipoNivelEdu=isPermiso;		
		//this.isPermisoPaginacionMedioTipoNivelEdu=isPermiso;		
		//this.isPermisoPaginacionAltoTipoNivelEdu=isPermiso;		
		//this.isPermisoPaginacionTodoTipoNivelEdu=isPermiso;		
		//this.isPermisoCopiarTipoNivelEdu=isPermiso;		
		//this.isPermisoDuplicarTipoNivelEdu=isPermiso;
		//this.isPermisoOrdenTipoNivelEdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoNivelEduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoNivelEduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTipoNivelEduClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubCliente=false;
		this.isTienePermisosSubCliente=this.verificarGetPermisosUsuarioOpcionTipoNivelEduClaseRelacionada(this.opcionsRelacionadas,SubClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionTipoNivelEduClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoNivelEdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoNivelEduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosSubCliente=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoNivelEduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoNivelEduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoNivelEduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.remove(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubCliente && this.jInternalFrameDetalleFormTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.remove(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.remove(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoNivelEdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoNivelEduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoNivelEduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoNivelEdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoNivelEdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoNivelEdu=this.isPermisoActualizarTipoNivelEdu;
			this.isPermisoEliminarTipoNivelEdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoNivelEdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoNivelEdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoNivelEdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoNivelEdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoNivelEdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNivelEdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoNivelEdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoNivelEdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoNivelEdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoNivelEdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoNivelEdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoNivelEdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNivelEdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoNivelEdu.setToolTipText(this.jTableDatosTipoNivelEdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoNivelEdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoNivelEdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoNivelEduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoNivelEduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoNivelEdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.tiponiveleduConstantesFunciones.mostrarClienteTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubCliente && this.tiponiveleduConstantesFunciones.mostrarSubClienteTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Cliente");
			reporte.setsDescripcion("Sub Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.tiponiveleduConstantesFunciones.mostrarParametroCarteraDefectoTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
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
	public void inicializarCombosForeignKeyTipoNivelEduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoNivelEduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoNivelEduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoNivelEduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoNivelEduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoNivelEduParameterReturnGeneral tiponiveleduReturnGeneral=new TipoNivelEduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiponiveleduConstantesFunciones.cargarid_empresaTipoNivelEdu)
					 || (this.esRecargarFks && this.tiponiveleduConstantesFunciones.cargarid_empresaTipoNivelEdu)) {

					if(!this.tiponiveleduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiponiveleduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiponiveleduReturnGeneral=tiponiveleduLogic.cargarCombosLoteForeignKeyTipoNivelEdu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiponiveleduReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoNivelEdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiponiveleduSessionBean==null) {
				this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
			}

			if(!this.tiponiveleduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoNivelEdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoNivelEdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoNivelEdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNivelEdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoNivelEdu(TipoNivelEdu tiponiveledu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoNivelEdu(TipoNivelEdu tiponiveledu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoNivelEdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNivelEdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoNivelEdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoNivelEdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoNivelEdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoNivelEdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoNivelEdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoNivelEdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoNivelEduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoNivelEduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoNivelEduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiponiveleduSessionBean=new TipoNivelEduSessionBean(); 
		this.tiponiveleduConstantesFunciones=new TipoNivelEduConstantesFunciones(); 
		this.tiponiveleduBean=new TipoNivelEdu();//(this.tiponiveleduConstantesFunciones); 		
		this.tiponiveleduReturnGeneral=new TipoNivelEduParameterReturnGeneral(); 
		
		this.tiponiveleduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponiveleduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoNivelEduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoNivelEduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoNivelEduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoNivelEdu(true);
			
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
			
			this.tiponiveleduConstantesFunciones=new TipoNivelEduConstantesFunciones(); 
			this.tiponiveleduBean=new TipoNivelEdu();//this.tiponiveleduConstantesFunciones); 			
			this.tiponiveleduReturnGeneral=new TipoNivelEduParameterReturnGeneral(); 
		
			TipoNivelEduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Nivel Edu Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiponiveledu=new TipoNivelEdu();
			this.tiponiveledus = new ArrayList<TipoNivelEdu>();
			this.tiponiveledusAux = new ArrayList<TipoNivelEdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic=new TipoNivelEduLogic();
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			//this.tiponiveleduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiponiveleduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoNivelEdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNivelEdu);	
					}
					
					if(this.jInternalFrameImportacionTipoNivelEdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNivelEdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoNivelEdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoNivelEdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNivelEdu);
				this.jInternalFrameDetalleFormTipoNivelEdu.setVisible(false);
				this.jInternalFrameDetalleFormTipoNivelEdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNivelEdu);
					this.jInternalFrameReporteDinamicoTipoNivelEdu.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoNivelEdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoNivelEdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoNivelEdu);
					this.jInternalFrameImportacionTipoNivelEdu.setVisible(false);
					this.jInternalFrameImportacionTipoNivelEdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoNivelEdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoNivelEdu);
					this.jInternalFrameOrderByTipoNivelEdu.setVisible(false);
					this.jInternalFrameOrderByTipoNivelEdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoNivelEduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoNivelEduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiponiveleduReturnGeneral=new TipoNivelEduParameterReturnGeneral();
			
			this.tiponiveleduParameterGeneral=new TipoNivelEduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiponiveleduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoNivelEduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNivelEduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponiveleduSessionBean.getEsGuardarRelacionado(),this.tiponiveleduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNivelEduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponiveleduSessionBean.getEsGuardarRelacionado(),this.tiponiveleduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaDuplicarTipoNivelEdu=true;
			this.isVisibilidadCeldaCopiarTipoNivelEdu=true;
			this.isVisibilidadCeldaVerFormTipoNivelEdu=true;
			this.isVisibilidadCeldaOrdenTipoNivelEdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
			this.isVisibilidadCeldaModificarTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=false;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoNivelEdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoNivelEdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoNivelEdu(false);
			
			this.setPermisosUsuarioTipoNivelEdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado() 
				|| (this.tiponiveleduSessionBean.getEsGuardarRelacionado() && this.tiponiveleduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoNivelEduClasesRelacionadas();
			}
			
			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoNivelEduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoNivelEdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoNivelEdu();
			}
			
			if(!this.isPermisoBusquedaTipoNivelEdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoNivelEdu,this.isPermisoPaginacionMedioTipoNivelEdu,this.isPermisoPaginacionTodoTipoNivelEdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoNivelEduConstantesFunciones.getTiposSeleccionarTipoNivelEdu());
				
				this.tiposColumnasSelect=TipoNivelEduConstantesFunciones.getTiposSeleccionarTipoNivelEdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoNivelEdu();				
				//this.tiposRelacionesSelect=TipoNivelEduConstantesFunciones.getTiposRelacionesTipoNivelEdu(true);
				
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
			//if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoNivelEdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoNivelEdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoNivelEdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNivelEdu() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.subclienteLogic=new SubClienteLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tiponiveleduImplementable= (TipoNivelEduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNivelEduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiponiveleduImplementableHome= (TipoNivelEduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNivelEduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiponiveledus= new ArrayList<TipoNivelEdu>();
			this.tiponiveledusEliminados= new ArrayList<TipoNivelEdu>();
						
			this.isEsNuevoTipoNivelEdu=false;
			this.esParaAccionDesdeFormularioTipoNivelEdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoNivelEdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoNivelEdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoNivelEduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoNivelEduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoNivelEdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoNivelEdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoNivelEdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoNivelEdu();
			}
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoNivelEdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoNivelEdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoNivelEdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoNivelEdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoNivelEdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoNivelEdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoNivelEdu")) {
				iIndex=this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoNivelEdu();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoNivelEdu();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Clientes")) {
					if(!SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoNivelEdu();

						this.cargarParteTabPanelRelacionadaSubCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoNivelEdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoNivelEdu.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTipoNivelEdu.updateUI();
		//this.jTabbedPaneRelacionesTipoNivelEdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoNivelEdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoNivelEdu.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesTipoNivelEdu.updateUI();
		//this.jTabbedPaneRelacionesTipoNivelEdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoNivelEdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoNivelEdu.cargarSessionConBeanSwingJInternalFrameSubCliente(false,true,iIndex);
		this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubCliente();

		//this.jTabbedPaneRelacionesTipoNivelEdu.updateUI();
		//this.jTabbedPaneRelacionesTipoNivelEdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoNivelEdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTipoNivelEdu.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubCliente")) {
				int row=this.jTableDatosTipoNivelEdu.getSelectedRow();
				jButtonSubClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosTipoNivelEdu.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tiponiveleduConstantesFunciones.mostrarClienteTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tiponiveleduConstantesFunciones.resaltarClienteTipoNivelEdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiponiveleduConstantesFunciones.resaltarClienteTipoNivelEdu);
						}

						jmenuItem.setEnabled(this.tiponiveleduConstantesFunciones.activarClienteTipoNivelEdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTipoNivelEdu.jmenuDetalleTipoNivelEdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Cliente")) {

					if(this.isTienePermisosSubCliente && this.tiponiveleduConstantesFunciones.mostrarSubClienteTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Clientes"+"("+SubClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Clientes");

						if(tiponiveleduConstantesFunciones.resaltarSubClienteTipoNivelEdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiponiveleduConstantesFunciones.resaltarSubClienteTipoNivelEdu);
						}

						jmenuItem.setEnabled(this.tiponiveleduConstantesFunciones.activarSubClienteTipoNivelEdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubCliente"));

						

						this.jInternalFrameDetalleFormTipoNivelEdu.jmenuDetalleTipoNivelEdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.tiponiveleduConstantesFunciones.mostrarParametroCarteraDefectoTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(tiponiveleduConstantesFunciones.resaltarParametroCarteraDefectoTipoNivelEdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiponiveleduConstantesFunciones.resaltarParametroCarteraDefectoTipoNivelEdu);
						}

						jmenuItem.setEnabled(this.tiponiveleduConstantesFunciones.activarParametroCarteraDefectoTipoNivelEdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormTipoNivelEdu.jmenuDetalleTipoNivelEdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoNivelEdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoNivelEdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoNivelEdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoNivelEduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoNivelEdu();
		
		this.cargarCombosFrameForeignKeyTipoNivelEdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoNivelEdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoNivelEdu();
		}
	}
	
	
	
	public void jButtonNuevoTipoNivelEduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			
			if(jTableDatosTipoNivelEdu.getRowCount()>=1) {
				jTableDatosTipoNivelEdu.removeRowSelectionInterval(0, jTableDatosTipoNivelEdu.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoNivelEdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoNivelEdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoNivelEdu(true);			
			//this.tiponiveledu=new TipoNivelEdu();
			//this.tiponiveledu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNivelEdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNivelEdu() ;
			
			if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNivelEdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiponiveledu);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);				
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoNivelEdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoNivelEduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoNivelEdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoNivelEdu.getSelectedRows().length;			
			}
			
			tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoNivelEdu--;			
				//TipoNivelEdu tiponiveleduAux= new TipoNivelEdu();			
				//tiponiveleduAux.setId(this.iIdNuevoTipoNivelEdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoNivelEdu tiponiveleduOrigen=new TipoNivelEdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoNivelEdu tiponiveleduOrigen : tiponiveledusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiponiveleduOrigen =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponiveleduOrigen =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoNivelEdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiponiveledu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoNivelEdu(tiponiveleduOrigen,this.tiponiveledu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponiveleduLogic.getTipoNivelEdus().add(this.tiponiveleduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponiveledus.add(this.tiponiveleduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
				
				this.jTableDatosTipoNivelEdu.setRowSelectionInterval(this.getIndiceNuevoTipoNivelEdu(), this.getIndiceNuevoTipoNivelEdu());
				
				int iLastRow =  this.jTableDatosTipoNivelEdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNivelEdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNivelEdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNivelEdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();									
		
			TipoNivelEdu tiponiveleduOrigen=new TipoNivelEdu();
			TipoNivelEdu tiponiveleduDestino=new TipoNivelEdu();
				
			tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoNivelEdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiponiveledusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoNivelEdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveleduOrigen =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponiveleduOrigen =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponiveleduDestino =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponiveleduDestino =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiponiveleduOrigen =tiponiveledusSeleccionados.get(0);
				tiponiveleduDestino =tiponiveledusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoNivelEdu(tiponiveleduOrigen,tiponiveleduDestino,true,false);
				
				tiponiveleduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponiveleduDestino,tiponiveleduLogic.getTipoNivelEdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponiveleduDestino,tiponiveledus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
				
				//this.jTableDatosTipoNivelEdu.setRowSelectionInterval(this.getIndiceNuevoTipoNivelEdu(), this.getIndiceNuevoTipoNivelEdu());
				
				int iLastRow =  this.jTableDatosTipoNivelEdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNivelEdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNivelEdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNivelEdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoNivelEdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoNivelEdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoNivelEdu.setVisible(!isVisible);
			this.jPanelPaginacionTipoNivelEdu.setVisible(!isVisible);
			this.jPanelAccionesTipoNivelEdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoNivelEdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoNivelEdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoNivelEdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoNivelEdu();
			
			this.abrirFrameOrderByTipoNivelEdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoNivelEdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoNivelEdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNivelEdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoNivelEdu.isMaximum()) {
					this.jInternalFrameDetalleFormTipoNivelEdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoNivelEdu.setSize(this.jInternalFrameDetalleFormTipoNivelEdu.iWidthFormulario,this.jInternalFrameDetalleFormTipoNivelEdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoNivelEdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoNivelEdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoNivelEdu.isMaximum()) {
						this.jInternalFrameDetalleFormTipoNivelEdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth(),TipoNivelEduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth(),TipoNivelEduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth(),TipoNivelEduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}

					if(SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoNivelEdu.setVisible(true);
	        this.jInternalFrameDetalleFormTipoNivelEdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoNivelEdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoNivelEdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoNivelEdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNivelEdu,false,this);
				} else {
					this.jInternalFrameOrderByTipoNivelEdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNivelEdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoNivelEdu);
				this.jInternalFrameOrderByTipoNivelEdu.setVisible(false);
				this.jInternalFrameOrderByTipoNivelEdu.setSelected(false);
				
				this.jInternalFrameOrderByTipoNivelEdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNivelEdu"));
				
				this.inicializarActualizarBindingTablaOrderByTipoNivelEdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoNivelEdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoNivelEdu==null) {
				
				this.jInternalFrameImportacionTipoNivelEdu=new ImportacionJInternalFrame(TipoNivelEduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNivelEdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoNivelEdu);
				this.jInternalFrameImportacionTipoNivelEdu.setVisible(false);
				this.jInternalFrameImportacionTipoNivelEdu.setSelected(false);


				this.jInternalFrameImportacionTipoNivelEdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNivelEdu"));
				this.jInternalFrameImportacionTipoNivelEdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNivelEdu"));
				this.jInternalFrameImportacionTipoNivelEdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNivelEdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoNivelEdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoNivelEdu==null) {
				this.jInternalFrameReporteDinamicoTipoNivelEdu=new ReporteDinamicoJInternalFrame(TipoNivelEduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNivelEdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNivelEdu);
				this.jInternalFrameReporteDinamicoTipoNivelEdu.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoNivelEdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNivelEdu"));
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNivelEdu"));
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNivelEdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNivelEdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoNivelEdu.jContentPaneDetalleTipoNivelEdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoNivelEdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNivelEdu);
			
	       	this.jInternalFrameDetalleFormTipoNivelEdu.setVisible(false);
	        this.jInternalFrameDetalleFormTipoNivelEdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoNivelEdu.dispose();
			//this.jInternalFrameDetalleFormTipoNivelEdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoNivelEdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoNivelEdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoNivelEdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoNivelEdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoNivelEdu.setVisible(true);
	        this.jInternalFrameImportacionTipoNivelEdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoNivelEdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoNivelEdu.setVisible(true);
	        this.jInternalFrameOrderByTipoNivelEdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoNivelEdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoNivelEdu.setVisible(false);
	        this.jInternalFrameOrderByTipoNivelEdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoNivelEdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoNivelEdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoNivelEdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoNivelEdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoNivelEdu.setVisible(false);
	        this.jInternalFrameImportacionTipoNivelEdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoNivelEdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoNivelEdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoNivelEdu(true);
			//this.isEsNuevoTipoNivelEdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoNivelEdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNivelEdu(false) ;
			
			if(tiponiveleduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNivelEdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNivelEdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoNivelEduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoNivelEdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoNivelEdu(true);
			//this.isEsNuevoTipoNivelEdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiponiveledu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoNivelEdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoNivelEdu(false) ;
			
			if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNivelEdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNivelEdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoNivelEdu(false);
			
			//if(!this.isEsNuevoTipoNivelEdu) {								
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				
			}
			
			if(this.permiteMantenimiento(this.tiponiveledu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoNivelEdu=true;
					this.inicializarActualizarBindingTablaTipoNivelEdu(false);
					this.isEsNuevoTipoNivelEdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoNivelEdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoNivelEdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNivelEdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNivelEdu(false);
				
				this.habilitarDeshabilitarControlesTipoNivelEdu(false);
			
												
				
				if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoNivelEdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoNivelEduActionPerformed(evt,tiponiveleduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoNivelEdu(this.tiponiveledu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoNivelEdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiponiveleduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiponiveledu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				this.tiponiveledu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				this.tiponiveledu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiponiveledu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoNivelEduModel) this.jTableDatosTipoNivelEdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoNivelEdu=true;
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
				this.isEsNuevoTipoNivelEdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNivelEdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNivelEdu(false);
				
				this.habilitarDeshabilitarControlesTipoNivelEdu(false);
				
				
				
				if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoNivelEdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoNivelEdu.getRowCount()>=1) {
				jTableDatosTipoNivelEdu.removeRowSelectionInterval(0, jTableDatosTipoNivelEdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoNivelEdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNivelEdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNivelEdu(false) ;
			
			this.isEsNuevoTipoNivelEdu=false;
			
			if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoNivelEdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoNivelEdu(false);
				
				//SI ES MANUAL
				if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoNivelEdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoNivelEdu--;			
			//TipoNivelEdu tiponiveleduAux= new TipoNivelEdu();			
			//tiponiveleduAux.setId(this.iIdNuevoTipoNivelEdu);
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoNivelEdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
			
			this.tiponiveledu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiponiveleduLogic.getTipoNivelEdus().add(this.tiponiveleduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiponiveledus.add(this.tiponiveleduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			
			this.jTableDatosTipoNivelEdu.setRowSelectionInterval(this.getIndiceNuevoTipoNivelEdu(), this.getIndiceNuevoTipoNivelEdu());
			
			int iLastRow =  this.jTableDatosTipoNivelEdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoNivelEdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoNivelEdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoNivelEdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNivelEdu(false);
			
			//SI ES MANUAL
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNivelEdu();
			}
			
			//this.abrirFrameTreeTipoNivelEdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Nivel EduS ?", "MANTENIMIENTO DE Tipo Nivel Edu", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoNivelEdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoNivelEdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiponiveleduReturnGeneral=tiponiveleduLogic.procesarImportacionTipoNivelEdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiponiveleduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoNivelEduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoNivelEdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoNivelEdu.setFileImportacion(this.jInternalFrameImportacionTipoNivelEdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoNivelEdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoNivelEdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoNivelEdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoNivelEdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		

		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoNivelEduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoNivelEduBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNivelEduConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNivelEduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoNivelEdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoNivelEduConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoNivelEduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoNivelEduConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoNivelEduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoNivelEduConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoNivelEduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoNivelEdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoNivelEdu tiponiveledu:tiponiveledusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponiveledu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNivelEduConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoNivelEdu tiponiveledu:tiponiveledusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponiveledu.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNivelEduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoNivelEdu tiponiveledu:tiponiveledusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponiveledu.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(TipoNivelEdu tiponiveledu:tiponiveledusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponiveledu.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelTipoNivelEdu(row);				
			//	iRow++;
			//}				
			
			//for(TipoNivelEdu tiponiveleduAux:tiponiveledusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoNivelEdu(tiponiveleduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNivelEdu(false);
			
			//SI ES MANUAL
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNivelEdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNivelEdu(false);
			
			//SI ES MANUAL
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNivelEdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNivelEdu(false);
			
			//SI ES MANUAL
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNivelEdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoNivelEdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoNivelEdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoNivelEdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoNivelEdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoNivelEdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoNivelEdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoNivelEdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoNivelEdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoNivelEdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoNivelEdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoNivelEdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoNivelEdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoNivelEdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoNivelEdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNivelEdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoNivelEdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoNivelEdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoNivelEdu();
		
		this.inicializarActualizarBindingBotonesManualTipoNivelEdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNivelEdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNivelEdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNivelEdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNivelEdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoNivelEdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoNivelEdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoNivelEdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxPostAccionNuevoTipoNivelEdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxPostAccionSinCerrarTipoNivelEdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxPostAccionSinMensajeTipoNivelEdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoNivelEdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoNivelEdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoNivelEdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxPostAccionNuevoTipoNivelEdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxPostAccionSinCerrarTipoNivelEdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxPostAccionSinMensajeTipoNivelEdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoNivelEdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoNivelEdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoNivelEdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoNivelEdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoNivelEdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoNivelEdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoNivelEdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoNivelEdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoNivelEdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoNivelEdu(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNivelEdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoNivelEdu() throws Exception {
		try	{
			if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNivelEdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNivelEdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNivelEdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoNivelEdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoNivelEdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoNivelEdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoNivelEdu.addItem(reporte);
			}
			
			
			if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoNivelEdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoNivelEdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoNivelEdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoNivelEdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoNivelEdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoNivelEdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoNivelEdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNivelEdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNivelEdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNivelEdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNivelEdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoNivelEdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoNivelEdu(Boolean esInicializar) throws Exception {				
		if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNivelEdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoNivelEdu() throws Exception {
		this.inicializarActualizarBindingTablaTipoNivelEdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoNivelEdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoNivelEduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoNivelEdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiponiveleduLogic.getTipoNivelEdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiponiveledus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoNivelEdu.setModel(new TipoNivelEduModel(this.tiponiveleduLogic.getTipoNivelEdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoNivelEdu.setModel(new TipoNivelEduModel(this.tiponiveledus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoNivelEdu!=null && this.jInternalFrameOrderByTipoNivelEdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoNivelEdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO,tiponiveleduConstantesFunciones.resaltarSeleccionarTipoNivelEdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO,tiponiveleduConstantesFunciones.resaltarSeleccionarTipoNivelEdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,TipoNivelEduConstantesFunciones.LABEL_ID));

		if(this.tiponiveleduConstantesFunciones.mostraridTipoNivelEdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNivelEduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiponiveleduConstantesFunciones.resaltaridTipoNivelEdu,this.tiponiveleduConstantesFunciones.activaridTipoNivelEdu,this,true,"idTipoNivelEdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponiveleduConstantesFunciones.resaltaridTipoNivelEdu,this.tiponiveleduConstantesFunciones.activaridTipoNivelEdu,this,true,"idTipoNivelEdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiponiveleduConstantesFunciones.mostrarid_empresaTipoNivelEdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiponiveleduConstantesFunciones.resaltarid_empresaTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarid_empresaTipoNivelEdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiponiveleduConstantesFunciones.resaltarid_empresaTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarid_empresaTipoNivelEdu,false,"id_empresaTipoNivelEdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,TipoNivelEduConstantesFunciones.LABEL_CODIGO));

		if(this.tiponiveleduConstantesFunciones.mostrarcodigoTipoNivelEdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNivelEduConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponiveleduConstantesFunciones.resaltarcodigoTipoNivelEdu,this.tiponiveleduConstantesFunciones.activarcodigoTipoNivelEdu,this,true,"codigoTipoNivelEdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponiveleduConstantesFunciones.resaltarcodigoTipoNivelEdu,this.tiponiveleduConstantesFunciones.activarcodigoTipoNivelEdu,this,true,"codigoTipoNivelEdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,TipoNivelEduConstantesFunciones.LABEL_NOMBRE));

		if(this.tiponiveleduConstantesFunciones.mostrarnombreTipoNivelEdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNivelEduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponiveleduConstantesFunciones.resaltarnombreTipoNivelEdu,this.tiponiveleduConstantesFunciones.activarnombreTipoNivelEdu,this,true,"nombreTipoNivelEdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponiveleduConstantesFunciones.resaltarnombreTipoNivelEdu,this.tiponiveleduConstantesFunciones.activarnombreTipoNivelEdu,this,true,"nombreTipoNivelEdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO));

		if(this.tiponiveleduConstantesFunciones.mostrares_defectoTipoNivelEdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiponiveleduConstantesFunciones.resaltares_defectoTipoNivelEdu,this.tiponiveleduConstantesFunciones.activares_defectoTipoNivelEdu));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiponiveleduConstantesFunciones.resaltares_defectoTipoNivelEdu,this.tiponiveleduConstantesFunciones.activares_defectoTipoNivelEdu,this,true,"es_defectoTipoNivelEdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoNivelEduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.tiponiveleduConstantesFunciones.mostrarClienteTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tiponiveleduConstantesFunciones.resaltarClienteTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarClienteTipoNivelEdu));
				tableColumn.setCellEditor(new ClienteTableCell(tiponiveleduConstantesFunciones.resaltarClienteTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarClienteTipoNivelEdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubCliente && this.tiponiveleduConstantesFunciones.mostrarSubClienteTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Clientes");
				tableColumn.setHeaderValue("Sub Clientes");
				tableColumn.setCellRenderer(new SubClienteTableCell(tiponiveleduConstantesFunciones.resaltarSubClienteTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarSubClienteTipoNivelEdu));
				tableColumn.setCellEditor(new SubClienteTableCell(tiponiveleduConstantesFunciones.resaltarSubClienteTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarSubClienteTipoNivelEdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.tiponiveleduConstantesFunciones.mostrarParametroCarteraDefectoTipoNivelEdu && !TipoNivelEduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(tiponiveleduConstantesFunciones.resaltarParametroCarteraDefectoTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarParametroCarteraDefectoTipoNivelEdu));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(tiponiveleduConstantesFunciones.resaltarParametroCarteraDefectoTipoNivelEdu,this,this.tiponiveleduConstantesFunciones.activarParametroCarteraDefectoTipoNivelEdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponiveleduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponiveleduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponiveleduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponiveleduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNivelEdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiponiveleduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiponiveleduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
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
			
			this.jTableDatosTipoNivelEdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiponiveleduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoNivelEdu.moveColumn(this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoNivelEdu.moveColumn(this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiponiveleduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoNivelEdu.moveColumn(this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoNivelEdu.moveColumn(this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoNivelEdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoNivelEdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoNivelEdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoNivelEdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoNivelEdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoNivelEdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoNivelEdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiponiveleduLogic.getTipoNivelEdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiponiveledus.size()-1;
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
		//this.jTableDatosTipoNivelEdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoNivelEdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoNivelEdu();
			
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
				
				//this.isEsNuevoTipoNivelEdu=false;
					
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
				if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoNivelEdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNivelEdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNivelEdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiponiveledu.getsType().equals("DUPLICADO")
				   || this.tiponiveledu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoNivelEdu=true;
				
				} else {
					this.isEsNuevoTipoNivelEdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
					if(this.tiponiveledu.getId()>=0 && !this.tiponiveledu.getIsNew()) {						
						this.isEsNuevoTipoNivelEdu=false;
						
					} else {
						this.isEsNuevoTipoNivelEdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoNivelEdu(esRelaciones);						
				
				this.seleccionarTipoNivelEdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiponiveledu.getId()<0) {
					this.isEsNuevoTipoNivelEdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoNivelEdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoNivelEdu(evt,rowIndex);
				}	
				
				if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoNivelEdu: " + this.dDif); 
					}
				}								
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoNivelEdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiponiveledu)) {
					if(this.tiponiveledu.getId()>0) {
						this.tiponiveledu.setIsDeleted(true);
						
						this.tiponiveledusEliminados.add(this.tiponiveledu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponiveleduLogic.getTipoNivelEdus().remove(this.tiponiveledu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponiveledus.remove(this.tiponiveledu);				
					}
					
					
					((TipoNivelEduModel) this.jTableDatosTipoNivelEdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNivelEdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoNivelEdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoNivelEdu) {
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNivelEdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNivelEdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoNivelEdu(this.tiponiveledu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiponiveleduConstantesFunciones.cargarid_empresaTipoNivelEdu || this.tiponiveleduConstantesFunciones.event_dependid_empresaTipoNivelEdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiponiveledu.getid_empresa());
									//this.inicializarActualizarBindingTipoNivelEdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiponiveledu.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiponiveledu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiponiveledu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoNivelEdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoNivelEdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNivelEdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNivelEdu(TipoNivelEdu tiponiveledu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoNivelEdu(tiponiveledu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNivelEdu(TipoNivelEdu tiponiveledu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoNivelEdu(tiponiveledu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoNivelEdu(tiponiveledu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoNivelEdu(tiponiveledu);
	}
	
	public void setVariablesObjetoActualToFormularioTipoNivelEdu(TipoNivelEdu tiponiveledu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setText(tiponiveledu.getId().toString());
			this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setText(tiponiveledu.getcodigo());
			this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setText(tiponiveledu.getnombre());
			this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setSelected(tiponiveledu.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoNivelEdu tiponiveleduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiponiveleduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoNivelEdu tiponiveleduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiponiveleduLocal=this.tiponiveledu;
			} else {
				tiponiveleduLocal=this.tiponiveleduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiponiveleduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoNivelEdu(tiponiveleduLocal,true);
					
					if(tiponiveleduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiponiveleduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiponiveleduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoNivelEdu(TipoNivelEdu tiponiveledu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNivelEdu(tiponiveledu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(tiponiveledu);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNivelEdu(TipoNivelEdu tiponiveledu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNivelEdu(tiponiveledu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNivelEdu(TipoNivelEdu tiponiveledu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.getText()==null || this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.getText()=="" || this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setText("0");
			}

			if(conColumnasBase) {tiponiveledu.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNivelEduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelIdTipoNivelEdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponiveledu.setcodigo(this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNivelEduConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelcodigoTipoNivelEdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponiveledu.setnombre(this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNivelEduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabelnombreTipoNivelEdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponiveledu.setes_defecto(this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNivelEdu.jLabeles_defectoTipoNivelEdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNivelEdu(TipoNivelEdu tiponiveleduBean,TipoNivelEdu tiponiveledu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoNivelEdu(TipoNivelEdu tiponiveleduOrigen,TipoNivelEdu tiponiveledu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponiveleduOrigen.getId()!=null && !tiponiveleduOrigen.getId().equals(0L))) {tiponiveledu.setId(tiponiveleduOrigen.getId());}}
			if(conDefault || (!conDefault && tiponiveleduOrigen.getcodigo()!=null && !tiponiveleduOrigen.getcodigo().equals(""))) {tiponiveledu.setcodigo(tiponiveleduOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiponiveleduOrigen.getnombre()!=null && !tiponiveleduOrigen.getnombre().equals(""))) {tiponiveledu.setnombre(tiponiveleduOrigen.getnombre());}
			if(conDefault || (!conDefault && tiponiveleduOrigen.getes_defecto()!=null && !tiponiveleduOrigen.getes_defecto().equals(false))) {tiponiveledu.setes_defecto(tiponiveleduOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNivelEdu(TipoNivelEdu tiponiveledu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setText(tiponiveledu.getId().toString());
			this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setText(tiponiveledu.getcodigo());
			this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setText(tiponiveledu.getnombre());
			this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setSelected(tiponiveledu.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNivelEdu(TipoNivelEduBean tiponiveleduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setText(tiponiveleduBean.getId().toString());
			this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setText(tiponiveleduBean.getcodigo());
			this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setText(tiponiveleduBean.getnombre());
			this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setSelected(tiponiveleduBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoNivelEdu(TipoNivelEduParameterReturnGeneral tiponiveleduReturnGeneral,TipoNivelEduBean tiponiveleduBean,Boolean conDefault) throws Exception { 
		try {
			TipoNivelEdu tiponiveleduLocal=new TipoNivelEdu();
			
			tiponiveleduLocal=tiponiveleduReturnGeneral.getTipoNivelEdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponiveleduLocal.getId()!=null && !tiponiveleduLocal.getId().equals(0L))) {tiponiveleduBean.setId(tiponiveleduLocal.getId());}}
			if(conDefault || (!conDefault && tiponiveleduLocal.getcodigo()!=null && !tiponiveleduLocal.getcodigo().equals(""))) {tiponiveleduBean.setcodigo(tiponiveleduLocal.getcodigo());}
			if(conDefault || (!conDefault && tiponiveleduLocal.getnombre()!=null && !tiponiveleduLocal.getnombre().equals(""))) {tiponiveleduBean.setnombre(tiponiveleduLocal.getnombre());}
			if(conDefault || (!conDefault && tiponiveleduLocal.getes_defecto()!=null && !tiponiveleduLocal.getes_defecto().equals(false))) {tiponiveleduBean.setes_defecto(tiponiveleduLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoNivelEduGenerico(Long idTipoNivelEduSeleccionado,JComboBox jComboBoxTipoNivelEdu,List<TipoNivelEdu> tiponiveledusLocal)throws Exception {
		try {
			TipoNivelEdu  tiponiveleduTemp=null;

			for(TipoNivelEdu tiponiveleduAux:tiponiveledusLocal) {
				if(tiponiveleduAux.getId()!=null && tiponiveleduAux.getId().equals(idTipoNivelEduSeleccionado)) {
					tiponiveleduTemp=tiponiveleduAux;
					break;
				}
			}

			jComboBoxTipoNivelEdu.setSelectedItem(tiponiveleduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoNivelEduGenerico(JComboBox jComboBoxTipoNivelEdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNivelEdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoNivelEdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNivelEdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoNivelEdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubCliente")) {
			jButtonSubClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponiveledu=(TipoNivelEdu) tiponiveleduLogic.getTipoNivelEdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponiveledu =(TipoNivelEdu) tiponiveledus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiponiveledu.getIsNew() && !tiponiveledu.getIsChanged() && !tiponiveledu.getIsDeleted()) {
				sDescripcion=tiponiveledu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiponiveledu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoNivelEdu tiponiveleduRow=new TipoNivelEdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponiveleduRow=(TipoNivelEdu) tiponiveleduLogic.getTipoNivelEdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponiveleduRow=(TipoNivelEdu) tiponiveledus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoNivelEdu tiponiveledu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoNivelEdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu = (TipoNivelEdu)this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiponiveledu = (TipoNivelEdu)this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiponiveledu!=null) {
						this.tiponiveledu = tiponiveledu;
					} else {
						this.tiponiveledu = new TipoNivelEdu();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.tiponiveledu)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame;
					}

					List<TipoNivelEdu> tiponiveledus=new ArrayList<TipoNivelEdu>();
					tiponiveledus.add(this.tiponiveledu);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoNivelEdu.cargarClienteBeanSwingJInternalFrame(tiponiveledus,this.tiponiveledu,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoNivelEdu=(TitledBorder)this.jScrollPanelDatosTipoNivelEdu.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTipoNivelEdu.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoNivelEdu tiponiveledu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoNivelEdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu = (TipoNivelEdu)this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiponiveledu = (TipoNivelEdu)this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiponiveledu!=null) {
						this.tiponiveledu = tiponiveledu;
					} else {
						this.tiponiveledu = new TipoNivelEdu();
					}
				}

				if(this.isTienePermisosSubCliente && this.permiteMantenimiento(this.tiponiveledu)) {
					SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup;
					} else {
						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame;
					}

					List<TipoNivelEdu> tiponiveledus=new ArrayList<TipoNivelEdu>();
					tiponiveledus.add(this.tiponiveledu);
					if(!esRelacionado) {
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setConGuardarRelaciones(false);
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoNivelEdu.cargarSubClienteBeanSwingJInternalFrame(tiponiveledus,this.tiponiveledu,subclienteBeanSwingJInternalFrame,/*conInicializar,*/subclienteBeanSwingJInternalFrame.subclienteSessionBean.getConGuardarRelaciones(),subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado());
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");

						subclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubClienteConstantesFunciones.ITAMANIOFILATABLA + (SubClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						subclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoNivelEdu=(TitledBorder)this.jScrollPanelDatosTipoNivelEdu.getBorder();
						TitledBorder titledBorderSubCliente=(TitledBorder)subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getBorder();

						titledBorderSubCliente.setTitle(titledBorderTipoNivelEdu.getTitle() + " -> Sub Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subclienteBeanSwingJInternalFrame);
						}

						subclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subclienteBeanSwingJInternalFrame);

						subclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoNivelEdu tiponiveledu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoNivelEdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu = (TipoNivelEdu)this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiponiveledu = (TipoNivelEdu)this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiponiveledu!=null) {
						this.tiponiveledu = tiponiveledu;
					} else {
						this.tiponiveledu = new TipoNivelEdu();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.tiponiveledu)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<TipoNivelEdu> tiponiveledus=new ArrayList<TipoNivelEdu>();
					tiponiveledus.add(this.tiponiveledu);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoNivelEdu.cargarParametroCarteraDefectoBeanSwingJInternalFrame(tiponiveledus,this.tiponiveledu,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoNivelEdu=(TitledBorder)this.jScrollPanelDatosTipoNivelEdu.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderTipoNivelEdu.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoNivelEdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu));			
			this.jButtonDuplicarTipoNivelEdu.setVisible((this.isVisibilidadCeldaDuplicarTipoNivelEdu && this.isPermisoDuplicarTipoNivelEdu));			
			this.jButtonCopiarTipoNivelEdu.setVisible((this.isVisibilidadCeldaCopiarTipoNivelEdu && this.isPermisoCopiarTipoNivelEdu));
			this.jButtonVerFormTipoNivelEdu.setVisible((this.isVisibilidadCeldaVerFormTipoNivelEdu && this.isPermisoVerFormTipoNivelEdu));
			
			this.jButtonAbrirOrderByTipoNivelEdu.setVisible((this.isVisibilidadCeldaOrdenTipoNivelEdu && this.isPermisoOrdenTipoNivelEdu));			
			
			this.jButtonNuevoRelacionesTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu));			
			this.jButtonNuevoGuardarCambiosTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarTipoNivelEdu.setVisible((this.isVisibilidadCeldaModificarTipoNivelEdu && this.isPermisoActualizarTipoNivelEdu));	
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarTipoNivelEdu.setVisible((this.isVisibilidadCeldaActualizarTipoNivelEdu && this.isPermisoActualizarTipoNivelEdu));	
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarTipoNivelEdu.setVisible((this.isVisibilidadCeldaEliminarTipoNivelEdu && this.isPermisoEliminarTipoNivelEdu));
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarTipoNivelEdu.setVisible(this.isVisibilidadCeldaCancelarTipoNivelEdu);							
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu));						
			this.jButtonDuplicarToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaDuplicarTipoNivelEdu && this.isPermisoDuplicarTipoNivelEdu));						
			this.jButtonCopiarToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaCopiarTipoNivelEdu && this.isPermisoCopiarTipoNivelEdu));			
			this.jButtonVerFormToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaVerFormTipoNivelEdu && this.isPermisoVerFormTipoNivelEdu));			
			this.jButtonAbrirOrderByToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaOrdenTipoNivelEdu && this.isPermisoOrdenTipoNivelEdu));
			this.jButtonNuevoRelacionesToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu));			
			this.jButtonNuevoGuardarCambiosToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));			
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaModificarTipoNivelEdu && this.isPermisoActualizarTipoNivelEdu));	
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaActualizarTipoNivelEdu  && this.isPermisoActualizarTipoNivelEdu));	
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaEliminarTipoNivelEdu && this.isPermisoEliminarTipoNivelEdu));
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarToolBarTipoNivelEdu.setVisible(this.isVisibilidadCeldaCancelarTipoNivelEdu);				
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu));			
			this.jMenuItemDuplicarTipoNivelEdu.setVisible((this.isVisibilidadCeldaDuplicarTipoNivelEdu && this.isPermisoDuplicarTipoNivelEdu));			
			this.jMenuItemCopiarTipoNivelEdu.setVisible((this.isVisibilidadCeldaCopiarTipoNivelEdu && this.isPermisoCopiarTipoNivelEdu));			
			this.jMenuItemVerFormTipoNivelEdu.setVisible((this.isVisibilidadCeldaVerFormTipoNivelEdu && this.isPermisoVerFormTipoNivelEdu));			
			this.jMenuItemAbrirOrderByTipoNivelEdu.setVisible((this.isVisibilidadCeldaOrdenTipoNivelEdu && this.isPermisoOrdenTipoNivelEdu));			
			//this.jMenuItemMostrarOcultarTipoNivelEdu.setVisible((this.isVisibilidadCeldaOrdenTipoNivelEdu && this.isPermisoOrdenTipoNivelEdu));
			this.jMenuItemDetalleAbrirOrderByTipoNivelEdu.setVisible((this.isVisibilidadCeldaOrdenTipoNivelEdu && this.isPermisoOrdenTipoNivelEdu));			
			//this.jMenuItemDetalleMostrarOcultarTipoNivelEdu.setVisible((this.isVisibilidadCeldaOrdenTipoNivelEdu && this.isPermisoOrdenTipoNivelEdu));			
			this.jMenuItemNuevoRelacionesTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu));			
			this.jMenuItemNuevoGuardarCambiosTipoNivelEdu.setVisible((this.isVisibilidadCeldaNuevoTipoNivelEdu && this.isPermisoNuevoTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));									
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemModificarTipoNivelEdu.setVisible((this.isVisibilidadCeldaModificarTipoNivelEdu && this.isPermisoActualizarTipoNivelEdu));	
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemActualizarTipoNivelEdu.setVisible((this.isVisibilidadCeldaActualizarTipoNivelEdu && this.isPermisoActualizarTipoNivelEdu));	
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemEliminarTipoNivelEdu.setVisible((this.isVisibilidadCeldaEliminarTipoNivelEdu && this.isPermisoEliminarTipoNivelEdu));
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemCancelarTipoNivelEdu.setVisible(this.isVisibilidadCeldaCancelarTipoNivelEdu);				
			}
			
			this.jMenuItemGuardarCambiosTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));						
			this.jMenuItemGuardarCambiosTablaTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=this.jButtonNuevoTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaDuplicarTipoNivelEdu=this.jButtonDuplicarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaCopiarTipoNivelEdu=this.jButtonCopiarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaVerFormTipoNivelEdu=this.jButtonVerFormTipoNivelEdu.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoNivelEdu=this.jButtonAbrirOrderByTipoNivelEdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=this.jButtonNuevoRelacionesTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaModificarTipoNivelEdu=this.jButtonModificarTipoNivelEdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.isVisibilidadCeldaActualizarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaGuardarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=this.jButtonGuardarCambiosTablaTipoNivelEdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoNivelEdu=this.jButtonNuevoToolBarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=this.jButtonNuevoRelacionesToolBarTipoNivelEdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.isVisibilidadCeldaModificarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarToolBarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarToolBarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarToolBarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarToolBarTipoNivelEdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNivelEdu=this.jButtonGuardarCambiosToolBarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=this.jButtonGuardarCambiosTablaToolBarTipoNivelEdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoNivelEdu=this.jMenuItemNuevoTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=this.jMenuItemNuevoRelacionesTipoNivelEdu.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.isVisibilidadCeldaModificarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemModificarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaActualizarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemActualizarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaEliminarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemEliminarTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaCancelarTipoNivelEdu=this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemCancelarTipoNivelEdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNivelEdu=this.jMenuItemGuardarCambiosTipoNivelEdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=this.jMenuItemGuardarCambiosTablaTipoNivelEdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoNivelEdu(Boolean esInicializar) {
		if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
				//if(this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNivelEdu();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoNivelEdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoNivelEdu() {
		this.jButtonNuevoTipoNivelEdu.setVisible(this.isPermisoNuevoTipoNivelEdu);			
		this.jButtonDuplicarTipoNivelEdu.setVisible(this.isPermisoDuplicarTipoNivelEdu);			
		this.jButtonCopiarTipoNivelEdu.setVisible(this.isPermisoCopiarTipoNivelEdu);			
		this.jButtonVerFormTipoNivelEdu.setVisible(this.isPermisoVerFormTipoNivelEdu);			
		
		this.jButtonAbrirOrderByTipoNivelEdu.setVisible(this.isPermisoOrdenTipoNivelEdu);					
		
		this.jButtonNuevoRelacionesTipoNivelEdu.setVisible(this.isPermisoNuevoTipoNivelEdu);			
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarTipoNivelEdu.setVisible(this.isPermisoActualizarTipoNivelEdu);	
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarTipoNivelEdu.setVisible(this.isPermisoActualizarTipoNivelEdu);	
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarTipoNivelEdu.setVisible(this.isPermisoEliminarTipoNivelEdu);
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarTipoNivelEdu.setVisible(this.isVisibilidadCeldaCancelarTipoNivelEdu);						
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.setVisible(this.isPermisoGuardarCambiosTipoNivelEdu);							
		}
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.setVisible(this.isPermisoActualizarTipoNivelEdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNivelEdu() {
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarTipoNivelEdu.setVisible(this.isPermisoActualizarTipoNivelEdu);	
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarTipoNivelEdu.setVisible(this.isPermisoActualizarTipoNivelEdu);	
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarTipoNivelEdu.setVisible(this.isPermisoEliminarTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarTipoNivelEdu.setVisible(this.isVisibilidadCeldaCancelarTipoNivelEdu);							
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.setVisible((this.isVisibilidadCeldaGuardarTipoNivelEdu && this.isPermisoGuardarCambiosTipoNivelEdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoNivelEdu() {
		if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoNivelEdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoNivelEdu() {
	}
	
	public void jTableDatosTipoNivelEduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoNivelEdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoNivelEduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.gettiponiveledu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponiveledu==null) {
						this.tiponiveledu = new TipoNivelEdu();
					}

					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				}

				if(this.tiponiveledu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiponiveledu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNivelEdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoNivelEduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoNivelEdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoNivelEdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoNivelEdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.gettiponiveledu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiponiveleduLogic.getConnexion());

				if(this.tiponiveledu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiponiveledu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoNivelEdu=(TitledBorder)this.jScrollPanelDatosTipoNivelEdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoNivelEdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoNivelEduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.gettiponiveledu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponiveledu==null) {
						this.tiponiveledu = new TipoNivelEdu();
					}

					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				}

				if(this.tiponiveledu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiponiveledu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNivelEdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoNivelEduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.gettiponiveledu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponiveledu==null) {
						this.tiponiveledu = new TipoNivelEdu();
					}

					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				}

				if(this.tiponiveledu.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiponiveledu.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNivelEdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoNivelEduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.gettiponiveledu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponiveledu==null) {
						this.tiponiveledu = new TipoNivelEdu();
					}

					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				}

				if(this.tiponiveledu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiponiveledu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNivelEdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoTipoNivelEduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.gettiponiveledu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponiveledu==null) {
						this.tiponiveledu = new TipoNivelEdu();
					}

					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);
				}

				if(this.tiponiveledu.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.tiponiveledu.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNivelEdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoNivelEduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoNivelEdu(false,false);

			this.getTipoNivelEdusFK_IdEmpresa();

			this.inicializarActualizarBindingTipoNivelEdu(false);

			//if(TipoNivelEduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoNivelEdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponiveleduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoNivelEdu() {
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
		

		if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
			this.jInternalFrameDetalleFormTipoNivelEdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoNivelEdu.dispose();
			this.jInternalFrameDetalleFormTipoNivelEdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
			this.jInternalFrameReporteDinamicoTipoNivelEdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoNivelEdu.dispose();
			this.jInternalFrameReporteDinamicoTipoNivelEdu=null;
		}
		
		if(this.jInternalFrameImportacionTipoNivelEdu!=null) {
			this.jInternalFrameImportacionTipoNivelEdu.setVisible(false);	    			
			this.jInternalFrameImportacionTipoNivelEdu.dispose();
			this.jInternalFrameImportacionTipoNivelEdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoNivelEdu();
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoNivelEdu")) {
				jButtonDuplicarTipoNivelEduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoNivelEdu")) {
				jButtonCopiarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoNivelEdu")) {
				jButtonVerFormTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoNivelEdu")) {
				jButtonDuplicarTipoNivelEduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoNivelEdu")) {
				jButtonDuplicarTipoNivelEduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoNivelEdu")) {
				jButtonModificarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoNivelEdu")) {
				jButtonModificarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoNivelEdu")) {
				jButtonModificarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoNivelEdu")) {
				jButtonActualizarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoNivelEdu")) {
				jButtonActualizarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoNivelEdu")) {
				jButtonActualizarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoNivelEdu")) {
				jButtonEliminarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoNivelEdu")) {
				jButtonEliminarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoNivelEdu")) {
				jButtonEliminarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoNivelEdu")) {
				jButtonCancelarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoNivelEdu")) {
				jButtonCancelarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoNivelEdu")) {
				jButtonCancelarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoNivelEdu")) {
				jButtonCerrarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoNivelEdu")) {
				jButtonCerrarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoNivelEdu")) {
				jButtonCerrarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoNivelEdu")) {
				jButtonMostrarOcultarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoNivelEdu")) {
				jButtonCancelarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoNivelEdu")) {
				jButtonCopiarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoNivelEdu")) {
				jButtonVerFormTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoNivelEdu")) {
				jButtonCopiarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoNivelEdu")) {
				jButtonVerFormTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoNivelEdu")) {
				jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoNivelEdu")) {
				jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoNivelEdu")) {
				jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoNivelEdu")) {
				jButtonAnterioresTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoNivelEdu")) {
				jButtonAnterioresTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoNivelEdu")) {
				jButtonAnterioresTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoNivelEdu")) {
				jButtonSiguientesTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoNivelEdu")) {
				jButtonSiguientesTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoNivelEdu")) {
				jButtonSiguientesTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoNivelEdu") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoNivelEdu")) {
				jButtonAbrirOrderByTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoNivelEdu") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoNivelEdu")) {
				jButtonMostrarOcultarTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNivelEdu")) {
				jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoNivelEdu")) {
				jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoNivelEdu")) {
				jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoNivelEdu")) {
				jButtonCerrarReporteDinamicoTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoNivelEdu")) {
				jButtonGenerarReporteDinamicoTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoNivelEdu")) {
				
				jButtonGenerarExcelReporteDinamicoTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoNivelEdu")) {
				jButtonCerrarImportacionTipoNivelEduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoNivelEdu")) {
				
				jButtonGenerarImportacionTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoNivelEdu")) {
				
				jButtonAbrirImportacionTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoNivelEdu")) {
				jComboBoxTiposAccionesTipoNivelEduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoNivelEdu")) {
				jComboBoxTiposRelacionesTipoNivelEduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoNivelEdu")) {
				jComboBoxTiposAccionesTipoNivelEduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoNivelEdu")) {
				
				jComboBoxTiposSeleccionarTipoNivelEduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoNivelEdu")) {
				jTextFieldValorCampoGeneralTipoNivelEduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoNivelEdu")) {
				jButtonAbrirOrderByTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoNivelEdu")) {
				jButtonAbrirOrderByTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoNivelEdu")) {
				jButtonCerrarOrderByTipoNivelEduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNivelEduBusqueda")) {
				this.jButtonidTipoNivelEduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoNivelEduUpdate")) {
				this.jButtonid_empresaTipoNivelEduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoNivelEduBusqueda")) {
				this.jButtonid_empresaTipoNivelEduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNivelEduBusqueda")) {
				this.jButtoncodigoTipoNivelEduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNivelEduBusqueda")) {
				this.jButtonnombreTipoNivelEduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoNivelEduBusqueda")) {
				this.jButtones_defectoTipoNivelEduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoNivelEdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoNivelEdu tiponiveleduLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiponiveleduLocal=this.tiponiveledu;
			} else {
				tiponiveleduLocal=this.tiponiveleduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
							
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
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
			
			


			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
								
						
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
								
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
							
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
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
			
			


			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
								
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoNivelEdu")) {
					jCheckBoxSeleccionarTodosTipoNivelEduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoNivelEdu")) {
					jCheckBoxSeleccionadosTipoNivelEduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoNivelEdu")) {
					
				}
				
				


				
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
												
				
				


				
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
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
			
			


			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNivelEduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponiveledu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponiveledu);
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
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
				
				


				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNivelEdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNivelEdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNivelEduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponiveleduAnterior =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoNivelEdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoNivelEduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoNivelEdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiponiveledu =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiponiveledu =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiponiveledu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoNivelEdu")) {
				
				}
				
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoNivelEdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoNivelEdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoNivelEdu")) {
			
			}
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoNivelEdu();
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			if(sTipo.equals("NuevoTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoNivelEdu")) {
				jButtonDuplicarTipoNivelEduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoNivelEdu")) {
				jButtonCopiarTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoNivelEdu")) {
				jButtonVerFormTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoNivelEdu")) {
				jButtonNuevoTipoNivelEduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoNivelEdu")) {
				jButtonModificarTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoNivelEdu")) {
				jButtonActualizarTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoNivelEdu")) {
				jButtonEliminarTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoNivelEdu")) {
				jButtonCancelarTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoNivelEdu")) {
				jButtonCerrarTipoNivelEduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoNivelEdu")) {
				jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNivelEdu")) {
				jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoNivelEdu")) {
				jButtonAbrirOrderByTipoNivelEduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoNivelEdu")) {
				jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoNivelEdu")) {
				jButtonAnterioresTipoNivelEduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoNivelEdu")) {
				jButtonSiguientesTipoNivelEduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNivelEduBusqueda")) {
				this.jButtonidTipoNivelEduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoNivelEduUpdate")) {
				this.jButtonid_empresaTipoNivelEduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoNivelEduBusqueda")) {
				this.jButtonid_empresaTipoNivelEduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNivelEduBusqueda")) {
				this.jButtoncodigoTipoNivelEduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNivelEduBusqueda")) {
				this.jButtonnombreTipoNivelEduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoNivelEduBusqueda")) {
				this.jButtones_defectoTipoNivelEduBusquedaActionPerformed(evt);
			}
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoNivelEdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoNivelEdu")) {
				closingInternalFrameTipoNivelEdu();
				
			} else if(sTipo.equals("jButtonCancelarTipoNivelEdu")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoNivelEdu = (JInternalFrameBase)evt.getSource();
	            	
	            TipoNivelEduBeanSwingJInternalFrame jInternalFrameParent=(TipoNivelEduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNivelEdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoNivelEduActionPerformed(null);
			}
			
			TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponiveledu,new Object(),this.tiponiveleduParameterGeneral,this.tiponiveleduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoNivelEdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoNivelEdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoNivelEdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiponiveledu)) {
			if(!esControlTabla) {
				if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);			
				}
				
				if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoNivelEdu(this.tiponiveledu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponiveleduReturnGeneral=tiponiveleduLogic.procesarEventosTipoNivelEdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponiveleduLogic.getTipoNivelEdus(),this.tiponiveledu,this.tiponiveleduParameterGeneral,this.isEsNuevoTipoNivelEdu,classes);//this.tiponiveleduLogic.getTipoNivelEdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoNivelEdu(this.tiponiveleduReturnGeneral,this.tiponiveleduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoNivelEdu(classes,this.tiponiveleduReturnGeneral,this.tiponiveleduBean,false);
					}
						
					if(this.tiponiveleduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu());	
					}
						
					if(this.tiponiveleduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu(),classes);//this.tiponiveleduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoNivelEdu(this.tiponiveledu,classes);//this.tiponiveleduBean);									
				}
			
				if(TipoNivelEduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoNivelEdu(this.tiponiveledu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNivelEdu(this.tiponiveledu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiponiveleduAnterior!=null) {
						this.tiponiveledu=this.tiponiveleduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponiveleduReturnGeneral=tiponiveleduLogic.procesarEventosTipoNivelEdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponiveleduLogic.getTipoNivelEdus(),this.tiponiveledu,this.tiponiveleduParameterGeneral,this.isEsNuevoTipoNivelEdu,classes);//this.tiponiveleduLogic.getTipoNivelEdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponiveleduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiponiveleduReturnGeneral.getTipoNivelEdu(),tiponiveleduLogic.getTipoNivelEdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiponiveleduReturnGeneral.getTipoNivelEdu(),this.tiponiveledus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoNivelEdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoNivelEdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoNivelEdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoNivelEdu() throws Exception {
		
		TipoNivelEduModel tiponiveleduModel=(TipoNivelEduModel)this.jTableDatosTipoNivelEdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponiveleduModel.tiponiveledus=this.tiponiveleduLogic.getTipoNivelEdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiponiveleduModel.tiponiveledus=this.tiponiveledus;
		}
		
		
		((TipoNivelEduModel) this.jTableDatosTipoNivelEdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoNivelEdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiponiveleduAnterior(),this.tiponiveleduLogic.getTipoNivelEdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiponiveleduAnterior(),this.tiponiveledus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoNivelEdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoNivelEdu(TipoNivelEdu tiponiveledu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tiponiveledu.getClientes());
					this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(tiponiveledu.getSubClientes());
					this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tiponiveledu.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
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
										
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponiveledu,new Object(),generalEntityParameterGeneral,this.tiponiveleduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoNivelEduConstantesFunciones.getClassesRelationshipsOfTipoNivelEdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoNivelEduConstantesFunciones.getClassesRelationshipsFromStringsOfTipoNivelEdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoNivelEdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoNivelEduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponiveledu,new Object(),generalEntityParameterGeneral,this.tiponiveleduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoNivelEdu(TipoNivelEduBean tiponiveleduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tiponiveledu.getClientes());
					this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(tiponiveledu.getSubClientes());
					this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tiponiveledu.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoNivelEdu(ArrayList<Classe> classes,TipoNivelEduReturnGeneral tiponiveleduReturnGeneral,TipoNivelEduBean tiponiveleduBean,Boolean conDefault) throws Exception {
		
			this.tiponiveleduBean.setClientes(tiponiveleduReturnGeneral.getTipoNivelEdu().getClientes());
			this.tiponiveleduBean.setSubClientes(tiponiveleduReturnGeneral.getTipoNivelEdu().getSubClientes());
			this.tiponiveleduBean.setParametroCarteraDefectos(tiponiveleduReturnGeneral.getTipoNivelEdu().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoNivelEdu(TipoNivelEdu tiponiveledu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					tiponiveledu.setClientes(this.jInternalFrameDetalleFormTipoNivelEdu.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					tiponiveledu.setSubClientes(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					tiponiveledu.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiponiveledu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoNivelEdu = new TipoNivelEduDetalleFormJInternalFrame(jDesktopPane,this.tiponiveleduSessionBean.getConGuardarRelaciones(),this.tiponiveleduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.setVisible(false);
		this.jInternalFrameDetalleFormTipoNivelEdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoNivelEdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoNivelEdu.tiponiveleduLogic=this.tiponiveleduLogic;
		
		this.cargarCombosFrameForeignKeyTipoNivelEdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNivelEdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNivelEdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoNivelEdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoNivelEdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoNivelEdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNivelEdu"));
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"ModificarTipoNivelEdu"));

		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNivelEdu"));
					
		this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemModificarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNivelEdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoNivelEdu"));
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNivelEdu"));
						
		this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemActualizarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNivelEdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"EliminarTipoNivelEdu"));
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNivelEdu"));
								
		this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemEliminarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNivelEdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CancelarTipoNivelEdu"));
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNivelEdu"));
					
		this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemCancelarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNivelEdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemDetalleCerrarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNivelEdu"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNivelEdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNivelEdu"));
		
		
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNivelEdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonidTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNivelEduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonid_empresaTipoNivelEduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoNivelEduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonid_empresaTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtoncodigoTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonnombreTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtones_defectoTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoNivelEduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNivelEdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoNivelEdu"));
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNivelEdu"));
		}
		
		this.jTableDatosTipoNivelEdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoNivelEdu"));
		
		this.jTableDatosTipoNivelEdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoNivelEdu"));
		
		this.jButtonNuevoTipoNivelEdu.addActionListener(new ButtonActionListener(this,"NuevoTipoNivelEdu"));
		
		this.jButtonDuplicarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"DuplicarTipoNivelEdu"));
		
		this.jButtonCopiarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"CopiarTipoNivelEdu"));
		
		this.jButtonVerFormTipoNivelEdu.addActionListener(new ButtonActionListener(this,"VerFormTipoNivelEdu"));
		
		
		this.jButtonNuevoToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoNivelEdu"));
			
		this.jButtonDuplicarToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoNivelEdu"));
			
		this.jMenuItemNuevoTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoNivelEdu"));
			
		this.jMenuItemDuplicarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoNivelEdu"));		
		
		
		this.jButtonNuevoRelacionesTipoNivelEdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoNivelEdu"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoNivelEdu"));
			
		this.jMenuItemNuevoRelacionesTipoNivelEdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoNivelEdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"ModificarTipoNivelEdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonModificarToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNivelEdu"));
			
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemModificarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNivelEdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"ActualizarTipoNivelEdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonActualizarToolBarTipoNivelEdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNivelEdu"));
				
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemActualizarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNivelEdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"EliminarTipoNivelEdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonEliminarToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNivelEdu"));
						
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemEliminarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNivelEdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CancelarTipoNivelEdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonCancelarToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNivelEdu"));
			
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemCancelarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNivelEdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoNivelEdu"));		
		
		
		this.jButtonCerrarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CerrarTipoNivelEdu"));
		
		
		this.jButtonCerrarToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoNivelEdu"));
			
		this.jMenuItemCerrarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoNivelEdu"));
			
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jMenuItemDetalleCerrarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNivelEdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoNivelEdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNivelEdu"));
		}
		
		this.jButtonCopiarToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoNivelEdu"));
			
		this.jButtonVerFormToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoNivelEdu"));
		
		this.jMenuItemGuardarCambiosTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoNivelEdu"));
			
		this.jMenuItemCopiarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoNivelEdu"));		
		
		this.jMenuItemVerFormTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoNivelEdu"));		
		
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNivelEdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoNivelEdu"));
			
		this.jMenuItemGuardarCambiosTablaTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNivelEdu"));		
		
		
		
		this.jButtonRecargarInformacionTipoNivelEdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoNivelEdu"));
					
		this.jButtonRecargarInformacionToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoNivelEdu"));
		
		this.jMenuItemRecargarInformacionTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoNivelEdu"));		
		
		
		
		this.jButtonAnterioresTipoNivelEdu.addActionListener (new ButtonActionListener(this,"AnterioresTipoNivelEdu"));
		
		
		this.jButtonAnterioresToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoNivelEdu"));
		
		this.jMenuItemAnterioresTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoNivelEdu"));		
		
		
		this.jButtonSiguientesTipoNivelEdu.addActionListener (new ButtonActionListener(this,"SiguientesTipoNivelEdu"));
		
		
		this.jButtonSiguientesToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoNivelEdu"));
			
		this.jMenuItemSiguientesTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoNivelEdu"));
			
		this.jMenuItemAbrirOrderByTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoNivelEdu"));
			
		this.jMenuItemMostrarOcultarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoNivelEdu"));
			
		this.jMenuItemDetalleAbrirOrderByTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoNivelEdu"));
			
		this.jMenuItemDetalleMostarOcultarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoNivelEdu"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoNivelEdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoNivelEdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoNivelEdu"));
			
		this.jMenuItemNuevoGuardarCambiosTipoNivelEdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoNivelEdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoNivelEdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoNivelEdu"));

		this.jCheckBoxSeleccionadosTipoNivelEdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoNivelEdu"));
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNivelEdu"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoNivelEdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoNivelEdu"));
			
		this.jComboBoxTiposAccionesTipoNivelEdu.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoNivelEdu"));
					
		this.jComboBoxTiposSeleccionarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoNivelEdu"));
			
		this.jTextFieldValorCampoGeneralTipoNivelEdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoNivelEdu"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonidTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNivelEduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonid_empresaTipoNivelEduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoNivelEduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonid_empresaTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtoncodigoTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonnombreTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtones_defectoTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoNivelEduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoNivelEdu!=null) {
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNivelEdu"));
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNivelEdu"));
				this.jInternalFrameReporteDinamicoTipoNivelEdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNivelEdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoNivelEdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNivelEdu"));				
			//this.jButtonGenerarReporteDinamicoTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNivelEdu"));
			//this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNivelEdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoNivelEdu!=null) {
				this.jInternalFrameImportacionTipoNivelEdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNivelEdu"));
				this.jInternalFrameImportacionTipoNivelEdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNivelEdu"));
				this.jInternalFrameImportacionTipoNivelEdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNivelEdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoNivelEdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoNivelEdu"));
			
			this.jButtonAbrirOrderByToolBarTipoNivelEdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoNivelEdu"));			
			
			if(this.jInternalFrameOrderByTipoNivelEdu!=null) {
				this.jInternalFrameOrderByTipoNivelEdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNivelEdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNivelEdu.jTabbedPaneRelacionesTipoNivelEdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNivelEdu"));
		
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
            		closingInternalFrameTipoNivelEdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoNivelEdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoNivelEdu = (JInternalFrameBase)event.getSource();
	            	
	            TipoNivelEduBeanSwingJInternalFrame jInternalFrameParent=(TipoNivelEduBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNivelEdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoNivelEduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoNivelEdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoNivelEduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoNivelEdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoNivelEdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNivelEduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNivelEduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNivelEduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoNivelEdu";
		inputMap = this.jButtonNuevoTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNivelEduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNivelEduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNivelEduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNivelEduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoNivelEdu";
		inputMap = this.jButtonNuevoRelacionesTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNivelEduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoNivelEdu";
		inputMap = this.jButtonModificarTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoNivelEduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoNivelEdu";
		inputMap = this.jButtonActualizarTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoNivelEduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoNivelEdu";
		inputMap = this.jButtonEliminarTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoNivelEduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoNivelEdu";
		inputMap = this.jButtonCancelarTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoNivelEduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoNivelEdu";
		inputMap = this.jButtonCerrarTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoNivelEduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoNivelEdu";
		inputMap = this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonGuardarCambiosTipoNivelEdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoNivelEduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoNivelEdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoNivelEduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoNivelEdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoNivelEduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoNivelEdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoNivelEduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoNivelEdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoNivelEduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonidTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNivelEduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonid_empresaTipoNivelEduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoNivelEduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonid_empresaTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtoncodigoTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtonnombreTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNivelEduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNivelEdu.jButtones_defectoTipoNivelEduBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoNivelEduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoNivelEdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoNivelEduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoNivelEduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoNivelEdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoNivelEdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
					tiponiveleduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNivelEdu tiponiveleduAux:tiponiveledus) {
					tiponiveleduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoNivelEduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNivelEdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
						tiponiveleduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNivelEdu tiponiveleduAux:tiponiveledus) {
						tiponiveleduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
					
						if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tiponiveleduAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNivelEdu tiponiveleduAux:tiponiveledus) {
						
						if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tiponiveleduAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNivelEdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNivelEdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoNivelEduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNivelEdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoNivelEdu.getSelectedRows();
			
			TipoNivelEdu tiponiveleduLocal=new TipoNivelEdu();
			
			//this.seleccionarTodosTipoNivelEdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponiveleduLocal =(TipoNivelEdu) this.tiponiveleduLogic.getTipoNivelEdus().toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiponiveleduLocal =(TipoNivelEdu) this.tiponiveledus.toArray()[this.jTableDatosTipoNivelEdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiponiveleduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
						tiponiveleduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNivelEdu tiponiveleduAux:tiponiveledus) {
						tiponiveleduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNivelEdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNivelEdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNivelEdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoNivelEduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoNivelEduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoNivelEduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoNivelEdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoNivelEdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNivelEdu tiponiveleduAux:this.tiponiveleduLogic.getTipoNivelEdus()) {
				
						if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponiveleduAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponiveleduAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNivelEdu tiponiveleduAux:tiponiveledus) {
					
						if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponiveleduAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponiveleduAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoNivelEduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoNivelEdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoNivelEdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoNivelEdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoNivelEdu) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoNivelEdu(conSplash);
				
					this.generarReporteTipoNivelEdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoNivelEdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNivelEdusSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNivelEdusSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNivelEdu();
				
				this.exportarTipoNivelEdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoNivelEdus();
				//this.importarTipoNivelEdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNivelEdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoNivelEdusSeleccionados();
				//this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Nivel Edu", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoNivelEdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoNivelEdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoNivelEdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoNivelEduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoNivelEdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoNivelEdu(conSplash);
					
						//this.actualizarParametrosGeneralTipoNivelEdu();
						
						this.generarReporteProcesoAccionTipoNivelEdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoNivelEduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Nivel EduS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Nivel Edu", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoNivelEdu();
				
						this.actualizarParametrosGeneralTipoNivelEdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiponiveleduReturnGeneral=tiponiveleduLogic.procesarAccionTipoNivelEdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiponiveleduLogic.getTipoNivelEdus(),this.tiponiveleduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoNivelEduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoNivelEdu();
					
					TipoNivelEduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoNivelEduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNivelEdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxTiposAccionesFormularioTipoNivelEdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoNivelEdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoNivelEduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoNivelEdu();
			
			if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
			TipoNivelEdu tiponiveledu=new TipoNivelEdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoNivelEdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoNivelEdu.getSelectedItem();
			
			
			
			
			tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiponiveledusSeleccionados.size()==1) {
				for(TipoNivelEdu tiponiveleduAux:tiponiveledusSeleccionados) {
					tiponiveledu=tiponiveleduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,tiponiveledu);
				}
				else if(this.sTipoRelacion.equals("Sub Cliente")) {
					jButtonSubClienteActionPerformed(null,rowIndex,true,false,tiponiveledu);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,tiponiveledu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoNivelEdu();
			
      		//this.finishProcessTipoNivelEdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoNivelEduReturnGeneral() throws Exception {
		if(this.tiponiveleduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiponiveleduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiponiveleduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiponiveleduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiponiveleduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiponiveleduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoNivelEdu(false);
		}
		
		if(this.tiponiveleduReturnGeneral.getConRetornoLista() || this.tiponiveleduReturnGeneral.getConRetornoObjeto()) {
			if(this.tiponiveleduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponiveleduLogic.setTipoNivelEdus(this.tiponiveleduReturnGeneral.getTipoNivelEdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiponiveleduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponiveleduLogic.setTipoNivelEdu(this.tiponiveleduReturnGeneral.getTipoNivelEdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoNivelEdu(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoNivelEdu() throws Exception {
		
		
	}
	
	public ArrayList<TipoNivelEdu> getTipoNivelEdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoNivelEdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoNivelEdu tiponiveleduAux:tiponiveleduLogic.getTipoNivelEdus()) {
					if(tiponiveleduAux.getIsSelected()) {
						tiponiveledusSeleccionados.add(tiponiveleduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNivelEdu tiponiveleduAux:this.tiponiveledus) {
					if(tiponiveleduAux.getIsSelected()) {
						tiponiveledusSeleccionados.add(tiponiveleduAux);				
					}
				}
			}
			
			if(tiponiveledusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiponiveledusSeleccionados.addAll(this.tiponiveleduLogic.getTipoNivelEdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiponiveledusSeleccionados.addAll(this.tiponiveledus);				
					}
				}
			}
		} else {
			tiponiveledusSeleccionados.add(this.tiponiveledu);
		}
		
		return tiponiveledusSeleccionados;
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
	
	public void generarReporteTipoNivelEdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoNivelEdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoNivelEdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNivelEdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNivelEdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoNivelEdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Nivel Edu",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoNivelEdusSeleccionados() throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoNivelEdusSeleccionados() throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoNivelEdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoNivelEdusSeleccionados() throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoNivelEdu();
		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoNivelEdu();
		
		
		//this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados ,tiponiveleduImplementable,tiponiveleduImplementableHome);
	}
	
	public void mostrarImportacionTipoNivelEdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoNivelEdu();
		
		this.abrirFrameImportacionTipoNivelEdu();		
		
			
		//this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados ,tiponiveleduImplementable,tiponiveleduImplementableHome);
	}
	
	public void importarTipoNivelEdus() throws Exception {		
	
	}
	
	public void exportarTipoNivelEdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoNivelEdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoNivelEdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoNivelEdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Nivel Edu",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoNivelEdusSeleccionados() throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoNivelEdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoNivelEdu tiponiveleduAux:tiponiveledusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoNivelEdu(tiponiveleduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiponiveleduAux.setsDetalleGeneralEntityReporte(tiponiveleduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoNivelEdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoNivelEduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNivelEduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNivelEduConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNivelEduConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoNivelEdu(TipoNivelEdu tiponiveledu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiponiveledu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponiveledu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponiveledu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponiveledu.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponiveledu.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponiveledu.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoNivelEdusSeleccionados() throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoNivelEdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoNivelEdu(row);				
				iRow++;
			}				
			
			for(TipoNivelEdu tiponiveleduAux:tiponiveledusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoNivelEdu(tiponiveleduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoNivelEdusSeleccionados() throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();		
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponiveledu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiponiveledus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiponiveledu");
			//elementRoot.appendChild(element);
		
			for(TipoNivelEdu tiponiveleduAux:tiponiveledusSeleccionados) {
				element = document.createElement("tiponiveledu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoNivelEdu(tiponiveleduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nivel Edu",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoNivelEdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoNivelEdu(TipoNivelEdu tiponiveledu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiponiveledu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponiveledu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponiveledu.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponiveledu.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponiveledu.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlTipoNivelEdu(TipoNivelEdu tiponiveledu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoNivelEduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiponiveledu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoNivelEduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiponiveledu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoNivelEduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiponiveledu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoNivelEduConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiponiveledu.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoNivelEduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiponiveledu.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(TipoNivelEduConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(tiponiveledu.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoTipoNivelEdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoNivelEdu> tiponiveledusSeleccionados=new ArrayList<TipoNivelEdu>();
		
		tiponiveledusSeleccionados=this.getTipoNivelEdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoNivelEdu(tiponiveledusSeleccionados);
		
		this.generarReporteTipoNivelEdus("Todos",tiponiveledusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoNivelEdu(ArrayList<TipoNivelEdu> tiponiveledusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoNivelEdu tiponiveleduAux:tiponiveledusSeleccionados) {
				tiponiveleduAux.setsDetalleGeneralEntityReporte(tiponiveleduAux.toString());
			
				if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiponiveleduAux.setsDescripcionGeneralEntityReporte1(tiponiveleduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiponiveleduAux.setsDescripcionGeneralEntityReporte1(tiponiveleduAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiponiveleduAux.setsDescripcionGeneralEntityReporte1(tiponiveleduAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					tiponiveleduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiponiveleduAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNivelEduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoNivelEdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoNivelEdu=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=true;
				this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=true;
			}
			
			this.isVisibilidadCeldaModificarTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=false;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
			this.isVisibilidadCeldaModificarTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=true;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
			this.isVisibilidadCeldaModificarTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=true;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=true;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
			this.isVisibilidadCeldaModificarTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=true;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=true;
			this.isVisibilidadCeldaModificarTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=false;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=false;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
			this.isVisibilidadCeldaModificarTipoNivelEdu=true;
			this.isVisibilidadCeldaActualizarTipoNivelEdu=false;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
			this.isVisibilidadCeldaCancelarTipoNivelEdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNivelEdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoNivelEdu=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=true;
		} else {
			this.actualizarEstadoPanelsTipoNivelEdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoNivelEdu=false;
			//this.isVisibilidadCeldaVerFormTipoNivelEdu=false;
			this.isVisibilidadCeldaDuplicarTipoNivelEdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiponiveleduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			if(!tiponiveleduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;												
			}
			
			this.jButtonCerrarTipoNivelEdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNivelEdu=false;
		}
		
		if(!this.permiteMantenimiento(this.tiponiveledu)) {
			this.isVisibilidadCeldaActualizarTipoNivelEdu=false;
			this.isVisibilidadCeldaEliminarTipoNivelEdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNivelEdu() {
		this.isVisibilidadCeldaNuevoTipoNivelEdu=false;
		this.isVisibilidadCeldaGuardarCambiosTipoNivelEdu=false;
	}
	
	public void actualizarEstadoPanelsTipoNivelEdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoNivelEdu!=null) {
				this.jScrollPanelDatosEdicionTipoNivelEdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNivelEdu!=null) {
				this.jScrollPanelDatosTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNivelEdu!=null) {
				this.jPanelPaginacionTipoNivelEdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
					this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNivelEdu!=null) {
				this.jTabbedPaneBusquedasTipoNivelEdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoNivelEdu!=null) {
				this.jPanelParametrosReportesTipoNivelEdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoNivelEduParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tiponiveleduSessionBean==null) {
				this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.setsPathNavegacionActual(tiponiveleduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TipoNivelEduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoNivelEdu(true);
			this.jInternalFrameDetalleFormTipoNivelEdu.clienteSessionBean.setlidTipoNivelEduActual(this.idTipoNivelEduActual);

			tiponiveleduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoNivelEdu(true);
			tiponiveleduSessionBean.setlIdTipoNivelEduActualForeignKey(this.idTipoNivelEduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoNivelEduParaSubClientes() throws Exception {
		Boolean isPaginaPopupSubCliente=false;

		try {

			if(this.tiponiveleduSessionBean==null) {
				this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean=new SubClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.setsPathNavegacionActual(tiponiveleduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubCliente=this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(true);
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(TipoNivelEduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoNivelEdu(true);
			this.jInternalFrameDetalleFormTipoNivelEdu.subclienteSessionBean.setlidTipoNivelEduActual(this.idTipoNivelEduActual);

			tiponiveleduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoNivelEdu(true);
			tiponiveleduSessionBean.setlIdTipoNivelEduActualForeignKey(this.idTipoNivelEduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoNivelEduParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.tiponiveleduSessionBean==null) {
				this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.setsPathNavegacionActual(tiponiveleduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(TipoNivelEduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoNivelEdu(true);
			this.jInternalFrameDetalleFormTipoNivelEdu.parametrocarteradefectoSessionBean.setlidTipoNivelEduActual(this.idTipoNivelEduActual);

			tiponiveleduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoNivelEdu(true);
			tiponiveleduSessionBean.setlIdTipoNivelEduActualForeignKey(this.idTipoNivelEduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoNivelEduSessionBean tiponiveleduSessionBean=new TipoNivelEduSessionBean();
		
		if(this.tiponiveleduSessionBean==null) {
			this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
		}
		
		this.tiponiveleduSessionBean.setsUltimaBusquedaTipoNivelEdu(this.getsAccionBusqueda());
		this.tiponiveleduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiponiveleduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiponiveleduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoNivelEduSessionBean tiponiveleduSessionBean=new TipoNivelEduSessionBean();
		
		if(this.tiponiveleduSessionBean==null) {
			this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
		}
		
		if(this.tiponiveleduSessionBean.getsUltimaBusquedaTipoNivelEdu()!=null&&!this.tiponiveleduSessionBean.getsUltimaBusquedaTipoNivelEdu().equals("")) {
			this.setsAccionBusqueda(tiponiveleduSessionBean.getsUltimaBusquedaTipoNivelEdu());
			this.setiNumeroPaginacion(tiponiveleduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiponiveleduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiponiveleduSessionBean.getid_empresa());
				tiponiveleduSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiponiveleduSessionBean.setsUltimaBusquedaTipoNivelEdu("");
		this.tiponiveleduSessionBean.setiNumeroPaginacion(TipoNivelEduConstantesFunciones.INUMEROPAGINACION);
		this.tiponiveleduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoNivelEdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoNivelEdu() {
		this.updateBorderResaltarBusquedasFormularioTipoNivelEdu();
		this.updateVisibilidadBusquedasFormularioTipoNivelEdu();
		this.updateHabilitarBusquedasFormularioTipoNivelEdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoNivelEdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoNivelEdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoNivelEdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoNivelEdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoNivelEdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoNivelEdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoNivelEdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoNivelEdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoNivelEdu() throws Exception {

		if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoNivelEdu();
		this.updateVisibilidadResaltarControlesFormularioTipoNivelEdu();
		this.updateHabilitarResaltarControlesFormularioTipoNivelEdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoNivelEdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiponiveleduConstantesFunciones.resaltaridTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu!=null) {this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setBorder(this.tiponiveleduConstantesFunciones.resaltaridTipoNivelEdu);}
		if(this.tiponiveleduConstantesFunciones.resaltarid_empresaTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu!=null) {this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setBorder(this.tiponiveleduConstantesFunciones.resaltarid_empresaTipoNivelEdu);}
		if(this.tiponiveleduConstantesFunciones.resaltarcodigoTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu!=null) {this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setBorder(this.tiponiveleduConstantesFunciones.resaltarcodigoTipoNivelEdu);}
		if(this.tiponiveleduConstantesFunciones.resaltarnombreTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu!=null) {this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setBorder(this.tiponiveleduConstantesFunciones.resaltarnombreTipoNivelEdu);}
		if(this.tiponiveleduConstantesFunciones.resaltares_defectoTipoNivelEdu!=null && this.jInternalFrameDetalleFormTipoNivelEdu!=null) {this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setBorderPainted(true);this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setBorder(this.tiponiveleduConstantesFunciones.resaltares_defectoTipoNivelEdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoNivelEdu() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
	
		//this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostraridTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jPanelidTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostraridTipoNivelEdu);
		//this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrarid_empresaTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jPanelid_empresaTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrarid_empresaTipoNivelEdu);
		//this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrarcodigoTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jPanelcodigoTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrarcodigoTipoNivelEdu);
		//this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrarnombreTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jPanelnombreTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrarnombreTipoNivelEdu);
		//this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrares_defectoTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jPaneles_defectoTipoNivelEdu.setVisible(this.tiponiveleduConstantesFunciones.mostrares_defectoTipoNivelEdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoNivelEdu() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNivelEdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNivelEdu!=null) {
	
		this.jInternalFrameDetalleFormTipoNivelEdu.jLabelidTipoNivelEdu.setEnabled(this.tiponiveleduConstantesFunciones.activaridTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jComboBoxid_empresaTipoNivelEdu.setEnabled(this.tiponiveleduConstantesFunciones.activarid_empresaTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jTextFieldcodigoTipoNivelEdu.setEnabled(this.tiponiveleduConstantesFunciones.activarcodigoTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jTextAreanombreTipoNivelEdu.setEnabled(this.tiponiveleduConstantesFunciones.activarnombreTipoNivelEdu);
		this.jInternalFrameDetalleFormTipoNivelEdu.jCheckBoxes_defectoTipoNivelEdu.setEnabled(this.tiponiveleduConstantesFunciones.activares_defectoTipoNivelEdu);
		}
	}
	
		
}