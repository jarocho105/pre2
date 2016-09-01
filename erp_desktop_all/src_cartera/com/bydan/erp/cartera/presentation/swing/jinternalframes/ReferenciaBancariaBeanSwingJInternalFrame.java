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

import com.bydan.erp.cartera.util.ReferenciaBancariaConstantesFunciones;
import com.bydan.erp.cartera.util.ReferenciaBancariaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ReferenciaBancariaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ReferenciaBancariaBean;
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
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ReferenciaBancariaBeanSwingJInternalFrame extends ReferenciaBancariaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReferenciaBancariaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ReferenciaBancaria> referenciabancariaValidator = new ClassValidator<ReferenciaBancaria>(ReferenciaBancaria.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ReferenciaBancaria referenciabancaria;	
	public ReferenciaBancaria referenciabancariaAux;
	public ReferenciaBancaria referenciabancariaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ReferenciaBancaria referenciabancariaTotales;
	public Long idReferenciaBancariaActual;
	public Long iIdNuevoReferenciaBancaria=0L;
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

	public String sFinalQueryComboBanco="";

	public List<Banco> bancosForeignKey;

	public List<Banco> getbancosForeignKey() {
		return bancosForeignKey;
	}

	public void setbancosForeignKey(List<Banco> bancosForeignKey) {
		this.bancosForeignKey = bancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Banco bancoForeignKey;

	public Banco getbancoForeignKey() {
		return bancoForeignKey;
	}

	public void setbancoForeignKey(Banco bancoForeignKey) {
		this.bancoForeignKey = bancoForeignKey;
	}

	public String sFinalQueryComboTipoProduBanco="";

	public List<TipoProduBanco> tipoprodubancosForeignKey;

	public List<TipoProduBanco> gettipoprodubancosForeignKey() {
		return tipoprodubancosForeignKey;
	}

	public void settipoprodubancosForeignKey(List<TipoProduBanco> tipoprodubancosForeignKey) {
		this.tipoprodubancosForeignKey = tipoprodubancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProduBanco tipoprodubancoForeignKey;

	public TipoProduBanco gettipoprodubancoForeignKey() {
		return tipoprodubancoForeignKey;
	}

	public void settipoprodubancoForeignKey(TipoProduBanco tipoprodubancoForeignKey) {
		this.tipoprodubancoForeignKey = tipoprodubancoForeignKey;
	}

	public String sFinalQueryComboTipoCuentaBanco="";

	public List<TipoCuentaBanco> tipocuentabancosForeignKey;

	public List<TipoCuentaBanco> gettipocuentabancosForeignKey() {
		return tipocuentabancosForeignKey;
	}

	public void settipocuentabancosForeignKey(List<TipoCuentaBanco> tipocuentabancosForeignKey) {
		this.tipocuentabancosForeignKey = tipocuentabancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCuentaBanco tipocuentabancoForeignKey;

	public TipoCuentaBanco gettipocuentabancoForeignKey() {
		return tipocuentabancoForeignKey;
	}

	public void settipocuentabancoForeignKey(TipoCuentaBanco tipocuentabancoForeignKey) {
		this.tipocuentabancoForeignKey = tipocuentabancoForeignKey;
	}

	public String sFinalQueryComboTipoValoracion="";

	public List<TipoValoracion> tipovaloracionsForeignKey;

	public List<TipoValoracion> gettipovaloracionsForeignKey() {
		return tipovaloracionsForeignKey;
	}

	public void settipovaloracionsForeignKey(List<TipoValoracion> tipovaloracionsForeignKey) {
		this.tipovaloracionsForeignKey = tipovaloracionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoValoracion tipovaloracionForeignKey;

	public TipoValoracion gettipovaloracionForeignKey() {
		return tipovaloracionForeignKey;
	}

	public void settipovaloracionForeignKey(TipoValoracion tipovaloracionForeignKey) {
		this.tipovaloracionForeignKey = tipovaloracionForeignKey;
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
	
	public Boolean isPermisoTodoReferenciaBancaria;
	public Boolean isPermisoNuevoReferenciaBancaria;
	public Boolean isPermisoActualizarReferenciaBancaria;
	public Boolean isPermisoActualizarOriginalReferenciaBancaria;
	public Boolean isPermisoEliminarReferenciaBancaria;
	public Boolean isPermisoGuardarCambiosReferenciaBancaria;
	public Boolean isPermisoConsultaReferenciaBancaria;
	public Boolean isPermisoBusquedaReferenciaBancaria;
	public Boolean isPermisoReporteReferenciaBancaria;
	public Boolean isPermisoPaginacionMedioReferenciaBancaria;
	public Boolean isPermisoPaginacionAltoReferenciaBancaria;
	public Boolean isPermisoPaginacionTodoReferenciaBancaria;
	public Boolean isPermisoCopiarReferenciaBancaria;
	public Boolean isPermisoVerFormReferenciaBancaria;
	public Boolean isPermisoDuplicarReferenciaBancaria;
	public Boolean isPermisoOrdenReferenciaBancaria;
	
	
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
	
	public ReferenciaBancariaParameterReturnGeneral referenciabancariaReturnGeneral;
	public ReferenciaBancariaParameterReturnGeneral referenciabancariaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReferenciaBancaria=false;
	public Boolean esParaAccionDesdeFormularioReferenciaBancaria=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReferenciaBancariaSessionBeanAdditional referenciabancariaSessionBeanAdditional=null;
	
	public ReferenciaBancariaSessionBeanAdditional getReferenciaBancariaSessionBeanAdditional() {
		return this.referenciabancariaSessionBeanAdditional;
	}
	
	public void setReferenciaBancariaSessionBeanAdditional(ReferenciaBancariaSessionBeanAdditional referenciabancariaSessionBeanAdditional) {
		try {
			this.referenciabancariaSessionBeanAdditional=referenciabancariaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReferenciaBancariaBeanSwingJInternalFrameAdditional referenciabancariaBeanSwingJInternalFrameAdditional=null;
	//public class ReferenciaBancariaBeanSwingJInternalFrame
	
	public ReferenciaBancariaBeanSwingJInternalFrameAdditional getReferenciaBancariaBeanSwingJInternalFrameAdditional() {
		return this.referenciabancariaBeanSwingJInternalFrameAdditional;
	}
	
	public void setReferenciaBancariaBeanSwingJInternalFrameAdditional(ReferenciaBancariaBeanSwingJInternalFrameAdditional referenciabancariaBeanSwingJInternalFrameAdditional) {
		try {
			this.referenciabancariaBeanSwingJInternalFrameAdditional=referenciabancariaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReferenciaBancariaLogic referenciabancariaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ReferenciaBancaria referenciabancariaBean;
	public ReferenciaBancariaConstantesFunciones referenciabancariaConstantesFunciones;
	//public ReferenciaBancariaParameterReturnGeneral referenciabancariaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public BancoLogic bancoLogic;
	public TipoProduBancoLogic tipoprodubancoLogic;
	public TipoCuentaBancoLogic tipocuentabancoLogic;
	public TipoValoracionLogic tipovaloracionLogic;
	
	//PARAMETROS
	
	
	//public List<ReferenciaBancaria> referenciabancarias;	
	//public List<ReferenciaBancaria> referenciabancariasEliminados;
	//public List<ReferenciaBancaria> referenciabancariasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReferenciaBancaria=false;
	public Boolean isVisibilidadCeldaDuplicarReferenciaBancaria=true;
	public Boolean isVisibilidadCeldaCopiarReferenciaBancaria=true;
	public Boolean isVisibilidadCeldaVerFormReferenciaBancaria=true;
	public Boolean isVisibilidadCeldaOrdenReferenciaBancaria=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
	public Boolean isVisibilidadCeldaModificarReferenciaBancaria=false;
	public Boolean isVisibilidadCeldaActualizarReferenciaBancaria=false;
	public Boolean isVisibilidadCeldaEliminarReferenciaBancaria=false;
	public Boolean isVisibilidadCeldaCancelarReferenciaBancaria=false;
	public Boolean isVisibilidadCeldaGuardarReferenciaBancaria=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoBanco=false;
	public Boolean isVisibilidadFK_IdTipoCuentaBanco=false;
	public Boolean isVisibilidadFK_IdTipoProductoBanco=false;
	public Boolean isVisibilidadFK_IdTipoValoracion=false;
	
	public Long getiIdNuevoReferenciaBancaria() {
		return this.iIdNuevoReferenciaBancaria;
	}

	public void setiIdNuevoReferenciaBancaria(Long iIdNuevoReferenciaBancaria) {
		this.iIdNuevoReferenciaBancaria = iIdNuevoReferenciaBancaria;
	}
	
	public Long getidReferenciaBancariaActual() {
		return this.idReferenciaBancariaActual;
	}

	public void setidReferenciaBancariaActual(Long idReferenciaBancariaActual) {
		this.idReferenciaBancariaActual = idReferenciaBancariaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ReferenciaBancaria getreferenciabancaria() {
		return this.referenciabancaria;
	}

	public void setreferenciabancaria(ReferenciaBancaria referenciabancaria) {
		this.referenciabancaria = referenciabancaria;
	}
	
	public ReferenciaBancaria getreferenciabancariaAux() {
		return this.referenciabancariaAux;
	}

	public void setreferenciabancariaAux(ReferenciaBancaria referenciabancariaAux) {
		this.referenciabancariaAux = referenciabancariaAux;
	}				
	
	public ReferenciaBancaria getreferenciabancariaAnterior() {
		return this.referenciabancariaAnterior;
	}

	public void setreferenciabancariaAnterior(ReferenciaBancaria referenciabancariaAnterior) {
		this.referenciabancariaAnterior = referenciabancariaAnterior;
	}	
	
	public ReferenciaBancaria getreferenciabancariaTotales() {
		return this.referenciabancariaTotales;
	}

	public void setreferenciabancariaTotales(ReferenciaBancaria referenciabancariaTotales) {
		this.referenciabancariaTotales = referenciabancariaTotales;
	}	
	
	public ReferenciaBancaria getreferenciabancariaBean() {
		return this.referenciabancariaBean;
	}

	public void setreferenciabancariaBean(ReferenciaBancaria referenciabancariaBean) {
		this.referenciabancariaBean = referenciabancariaBean;
	}	
	
	public ReferenciaBancariaParameterReturnGeneral getreferenciabancariaReturnGeneral() {
		return this.referenciabancariaReturnGeneral;
	}

	public void setreferenciabancariaReturnGeneral(ReferenciaBancariaParameterReturnGeneral referenciabancariaReturnGeneral) {
		this.referenciabancariaReturnGeneral = referenciabancariaReturnGeneral;
	}	
	
	
	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long idvalorclientebancoFK_IdTipoBanco=-1L;

	public Long getidvalorclientebancoFK_IdTipoBanco() {
		return this.idvalorclientebancoFK_IdTipoBanco;
	}

	public void setidvalorclientebancoFK_IdTipoBanco(Long idvalorclientebancoFK_IdTipoBanco) {
		this.idvalorclientebancoFK_IdTipoBanco = idvalorclientebancoFK_IdTipoBanco;
	}

	public Long idvalorclientecuentabancoFK_IdTipoCuentaBanco=-1L;

	public Long getidvalorclientecuentabancoFK_IdTipoCuentaBanco() {
		return this.idvalorclientecuentabancoFK_IdTipoCuentaBanco;
	}

	public void setidvalorclientecuentabancoFK_IdTipoCuentaBanco(Long idvalorclientecuentabancoFK_IdTipoCuentaBanco) {
		this.idvalorclientecuentabancoFK_IdTipoCuentaBanco = idvalorclientecuentabancoFK_IdTipoCuentaBanco;
	}

	public Long idvalorclienteproductobancoFK_IdTipoProductoBanco=-1L;

	public Long getidvalorclienteproductobancoFK_IdTipoProductoBanco() {
		return this.idvalorclienteproductobancoFK_IdTipoProductoBanco;
	}

	public void setidvalorclienteproductobancoFK_IdTipoProductoBanco(Long idvalorclienteproductobancoFK_IdTipoProductoBanco) {
		this.idvalorclienteproductobancoFK_IdTipoProductoBanco = idvalorclienteproductobancoFK_IdTipoProductoBanco;
	}

	public Long id_tipo_valoracionFK_IdTipoValoracion=-1L;

	public Long getid_tipo_valoracionFK_IdTipoValoracion() {
		return this.id_tipo_valoracionFK_IdTipoValoracion;
	}

	public void setid_tipo_valoracionFK_IdTipoValoracion(Long id_tipo_valoracionFK_IdTipoValoracion) {
		this.id_tipo_valoracionFK_IdTipoValoracion = id_tipo_valoracionFK_IdTipoValoracion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReferenciaBancariaLogic getReferenciaBancariaLogic()	{		
		return referenciabancariaLogic;
	}

	public void setReferenciaBancariaLogic(ReferenciaBancariaLogic referenciabancariaLogic) {
		this.referenciabancariaLogic = referenciabancariaLogic;
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
	
	public Boolean getIsEsNuevoReferenciaBancaria() {
		return isEsNuevoReferenciaBancaria;
	}

	public void setIsEsNuevoReferenciaBancaria(Boolean isEsNuevoReferenciaBancaria) {
		this.isEsNuevoReferenciaBancaria = isEsNuevoReferenciaBancaria;
	}

	public Boolean getEsParaAccionDesdeFormularioReferenciaBancaria() {
		return esParaAccionDesdeFormularioReferenciaBancaria;
	}
	
	public void setEsParaAccionDesdeFormularioReferenciaBancaria(Boolean esParaAccionDesdeFormularioReferenciaBancaria) {
		this.esParaAccionDesdeFormularioReferenciaBancaria = esParaAccionDesdeFormularioReferenciaBancaria;
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

			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(referenciabancariaSessionBean.getlidEmpresaActual());
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

			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(referenciabancariaSessionBean.getlidClienteActual());
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

	public void cargarCombosBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bancosForeignKey=new ArrayList<Banco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BancoLogic bancoLogic=new BancoLogic();

			//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

					bancoLogic.getTodosBancosWithConnection(sFinalQuery,new Pagination());

					this.bancosForeignKey=bancoLogic.getBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getEntityWithConnection(referenciabancariaSessionBean.getlidBancoActual());
					this.bancosForeignKey.add(bancoLogic.getBanco());
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

	public void cargarCombosTipoProduBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprodubancosForeignKey=new ArrayList<TipoProduBanco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProduBancoLogic tipoprodubancoLogic=new TipoProduBancoLogic();

			//tipoprodubancoLogic.getTipoProduBancoDataAccess().setIsForForeingKeyData(true);

			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProduBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprodubancoLogic.getTipoProduBancoDataAccess().setIsForForeingKeyData(true);

					tipoprodubancoLogic.getTodosTipoProduBancosWithConnection(sFinalQuery,new Pagination());

					this.tipoprodubancosForeignKey=tipoprodubancoLogic.getTipoProduBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProduBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprodubancoLogic.getEntityWithConnection(referenciabancariaSessionBean.getlidTipoProduBancoActual());
					this.tipoprodubancosForeignKey.add(tipoprodubancoLogic.getTipoProduBanco());
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

	public void cargarCombosTipoCuentaBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocuentabancosForeignKey=new ArrayList<TipoCuentaBanco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCuentaBancoLogic tipocuentabancoLogic=new TipoCuentaBancoLogic();

			//tipocuentabancoLogic.getTipoCuentaBancoDataAccess().setIsForForeingKeyData(true);

			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocuentabancoLogic.getTipoCuentaBancoDataAccess().setIsForForeingKeyData(true);

					tipocuentabancoLogic.getTodosTipoCuentaBancosWithConnection(sFinalQuery,new Pagination());

					this.tipocuentabancosForeignKey=tipocuentabancoLogic.getTipoCuentaBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCuentaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoLogic.getEntityWithConnection(referenciabancariaSessionBean.getlidTipoCuentaBancoActual());
					this.tipocuentabancosForeignKey.add(tipocuentabancoLogic.getTipoCuentaBanco());
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

	public void cargarCombosTipoValoracionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoValoracionLogic tipovaloracionLogic=new TipoValoracionLogic();

			//tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingKeyData(true);

			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingKeyData(true);

					tipovaloracionLogic.getTodosTipoValoracionsWithConnection(sFinalQuery,new Pagination());

					this.tipovaloracionsForeignKey=tipovaloracionLogic.getTipoValoracions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoValoracion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovaloracionLogic.getEntityWithConnection(referenciabancariaSessionBean.getlidTipoValoracionActual());
					this.tipovaloracionsForeignKey.add(tipovaloracionLogic.getTipoValoracion());
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

					if(this.referenciabancaria!=null) {
						this.referenciabancaria.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaReferenciaBancaria.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaReferenciaBancariaGenerico)throws Exception
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
				jComboBoxid_empresaReferenciaBancariaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaReferenciaBancariaGenerico!=null && jComboBoxid_empresaReferenciaBancariaGenerico.getItemCount()>0) {
					jComboBoxid_empresaReferenciaBancariaGenerico.setSelectedIndex(0);
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

					if(this.referenciabancaria!=null) {
						this.referenciabancaria.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteReferenciaBancaria.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteReferenciaBancaria!=null) {
						jComboBoxidclienteFK_IdClienteReferenciaBancaria.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteReferenciaBancaria!=null) {
							//jComboBoxidclienteFK_IdClienteReferenciaBancaria.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteReferenciaBancaria.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteReferenciaBancaria.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteReferenciaBancariaGenerico)throws Exception
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
				jComboBoxidclienteReferenciaBancariaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteReferenciaBancariaGenerico!=null && jComboBoxidclienteReferenciaBancariaGenerico.getItemCount()>0) {
					jComboBoxidclienteReferenciaBancariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBancoForeignKey(Long idBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bancoTemp!=null) {

					if(this.referenciabancaria!=null) {
						this.referenciabancaria.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxidvalorclientebancoReferenciaBancaria.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria!=null) {
						jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria!=null) {
							//jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setSelectedItem(bancoTemp);
							if(jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.getItemCount()>0) {
								jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setSelectedIndex(0);
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

	public String getActualBancoForeignKeyDescripcion(Long idBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}


			sDescripcion=BancoConstantesFunciones.getBancoDescripcion(bancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxidvalorclientebancoReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(bancoTemp!=null) {
				jComboBoxidvalorclientebancoReferenciaBancariaGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxidvalorclientebancoReferenciaBancariaGenerico!=null && jComboBoxidvalorclientebancoReferenciaBancariaGenerico.getItemCount()>0) {
					jComboBoxidvalorclientebancoReferenciaBancariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProduBancoForeignKey(Long idTipoProduBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProduBanco  tipoprodubancoTemp=null;

			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosForeignKey) {
				if(tipoprodubancoAux.getId()!=null && tipoprodubancoAux.getId().equals(idTipoProduBancoSeleccionado)) {
					tipoprodubancoTemp=tipoprodubancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprodubancoTemp!=null) {

					if(this.referenciabancaria!=null) {
						this.referenciabancaria.setTipoProduBanco(tipoprodubancoTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setSelectedItem(tipoprodubancoTemp);
					}
				} else {
					//jComboBoxidvalorclienteproductobancoReferenciaBancaria.setSelectedItem(tipoprodubancoTemp);
					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProductoBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprodubancoTemp!=null && jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria!=null) {
						jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setSelectedItem(tipoprodubancoTemp);
					} else {
						if(jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria!=null) {
							//jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setSelectedItem(tipoprodubancoTemp);
							if(jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.getItemCount()>0) {
								jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setSelectedIndex(0);
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

	public String getActualTipoProduBancoForeignKeyDescripcion(Long idTipoProduBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProduBanco  tipoprodubancoTemp=null;

			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosForeignKey) {
				if(tipoprodubancoAux.getId()!=null && tipoprodubancoAux.getId().equals(idTipoProduBancoSeleccionado)) {
					tipoprodubancoTemp=tipoprodubancoAux;
					break;
				}
			}


			sDescripcion=TipoProduBancoConstantesFunciones.getTipoProduBancoDescripcion(tipoprodubancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProduBancoForeignKeyGenerico(Long idTipoProduBancoSeleccionado,JComboBox jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			TipoProduBanco  tipoprodubancoTemp=null;

			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosForeignKey) {
				if(tipoprodubancoAux.getId()!=null && tipoprodubancoAux.getId().equals(idTipoProduBancoSeleccionado)) {
					tipoprodubancoTemp=tipoprodubancoAux;
					break;
				}
			}

			if(tipoprodubancoTemp!=null) {
				jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico.setSelectedItem(tipoprodubancoTemp);
			} else {
				if(jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico!=null && jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico.getItemCount()>0) {
					jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCuentaBancoForeignKey(Long idTipoCuentaBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosForeignKey) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocuentabancoTemp!=null) {

					if(this.referenciabancaria!=null) {
						this.referenciabancaria.setTipoCuentaBanco(tipocuentabancoTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setSelectedItem(tipocuentabancoTemp);
					}
				} else {
					//jComboBoxidvalorclientecuentabancoReferenciaBancaria.setSelectedItem(tipocuentabancoTemp);
					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocuentabancoTemp!=null && jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria!=null) {
						jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setSelectedItem(tipocuentabancoTemp);
					} else {
						if(jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria!=null) {
							//jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setSelectedItem(tipocuentabancoTemp);
							if(jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.getItemCount()>0) {
								jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setSelectedIndex(0);
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

	public String getActualTipoCuentaBancoForeignKeyDescripcion(Long idTipoCuentaBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosForeignKey) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}


			sDescripcion=TipoCuentaBancoConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCuentaBancoForeignKeyGenerico(Long idTipoCuentaBancoSeleccionado,JComboBox jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosForeignKey) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}

			if(tipocuentabancoTemp!=null) {
				jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico.setSelectedItem(tipocuentabancoTemp);
			} else {
				if(jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico!=null && jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico.getItemCount()>0) {
					jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoValoracionForeignKey(Long idTipoValoracionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovaloracionTemp!=null) {

					if(this.referenciabancaria!=null) {
						this.referenciabancaria.setTipoValoracion(tipovaloracionTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setSelectedItem(tipovaloracionTemp);
					}
				} else {
					//jComboBoxid_tipo_valoracionReferenciaBancaria.setSelectedItem(tipovaloracionTemp);
					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovaloracionTemp!=null && jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria!=null) {
						jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setSelectedItem(tipovaloracionTemp);
					} else {
						if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria!=null) {
							//jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setSelectedItem(tipovaloracionTemp);
							if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.getItemCount()>0) {
								jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setSelectedIndex(0);
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

	public String getActualTipoValoracionForeignKeyDescripcion(Long idTipoValoracionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}


			sDescripcion=TipoValoracionConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoValoracionForeignKeyGenerico(Long idTipoValoracionSeleccionado,JComboBox jComboBoxid_tipo_valoracionReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			if(tipovaloracionTemp!=null) {
				jComboBoxid_tipo_valoracionReferenciaBancariaGenerico.setSelectedItem(tipovaloracionTemp);
			} else {
				if(jComboBoxid_tipo_valoracionReferenciaBancariaGenerico!=null && jComboBoxid_tipo_valoracionReferenciaBancariaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_valoracionReferenciaBancariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ReferenciaBancaria referenciabancaria,JComboBox jComboBoxid_empresaReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaReferenciaBancariaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaReferenciaBancariaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				referenciabancaria.setid_empresa(empresaAux.getId());
				referenciabancaria.setempresa_descripcion(ReferenciaBancariaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				referenciabancaria.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ReferenciaBancaria referenciabancaria,JComboBox jComboBoxidclienteReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteReferenciaBancariaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteReferenciaBancariaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				referenciabancaria.setidcliente(clienteAux.getId());
				referenciabancaria.setcliente_descripcion(ReferenciaBancariaConstantesFunciones.getClienteDescripcion(clienteAux));
				referenciabancaria.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(ReferenciaBancaria referenciabancaria,JComboBox jComboBoxidvalorclientebancoReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxidvalorclientebancoReferenciaBancariaGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxidvalorclientebancoReferenciaBancariaGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				referenciabancaria.setidvalorclientebanco(bancoAux.getId());
				referenciabancaria.setbanco_descripcion(ReferenciaBancariaConstantesFunciones.getBancoDescripcion(bancoAux));
				referenciabancaria.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProduBancoForeignKey(ReferenciaBancaria referenciabancaria,JComboBox jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			TipoProduBanco  tipoprodubancoAux=new TipoProduBanco();

			if(jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico==null) {
				tipoprodubancoAux=(TipoProduBanco)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.getSelectedItem();
			} else {
				tipoprodubancoAux=(TipoProduBanco)jComboBoxidvalorclienteproductobancoReferenciaBancariaGenerico.getSelectedItem();
			}

			if(tipoprodubancoAux!=null && tipoprodubancoAux.getId()!=null) {
				referenciabancaria.setidvalorclienteproductobanco(tipoprodubancoAux.getId());
				referenciabancaria.settipoprodubanco_descripcion(ReferenciaBancariaConstantesFunciones.getTipoProduBancoDescripcion(tipoprodubancoAux));
				referenciabancaria.setTipoProduBanco(tipoprodubancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCuentaBancoForeignKey(ReferenciaBancaria referenciabancaria,JComboBox jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			TipoCuentaBanco  tipocuentabancoAux=new TipoCuentaBanco();

			if(jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico==null) {
				tipocuentabancoAux=(TipoCuentaBanco)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.getSelectedItem();
			} else {
				tipocuentabancoAux=(TipoCuentaBanco)jComboBoxidvalorclientecuentabancoReferenciaBancariaGenerico.getSelectedItem();
			}

			if(tipocuentabancoAux!=null && tipocuentabancoAux.getId()!=null) {
				referenciabancaria.setidvalorclientecuentabanco(tipocuentabancoAux.getId());
				referenciabancaria.settipocuentabanco_descripcion(ReferenciaBancariaConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabancoAux));
				referenciabancaria.setTipoCuentaBanco(tipocuentabancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoValoracionForeignKey(ReferenciaBancaria referenciabancaria,JComboBox jComboBoxid_tipo_valoracionReferenciaBancariaGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionAux=new TipoValoracion();

			if(jComboBoxid_tipo_valoracionReferenciaBancariaGenerico==null) {
				tipovaloracionAux=(TipoValoracion)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.getSelectedItem();
			} else {
				tipovaloracionAux=(TipoValoracion)jComboBoxid_tipo_valoracionReferenciaBancariaGenerico.getSelectedItem();
			}

			if(tipovaloracionAux!=null && tipovaloracionAux.getId()!=null) {
				referenciabancaria.setid_tipo_valoracion(tipovaloracionAux.getId());
				referenciabancaria.settipovaloracion_descripcion(ReferenciaBancariaConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionAux));
				referenciabancaria.setTipoValoracion(tipovaloracionAux);			}
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

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
					}

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
					}

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteReferenciaBancaria.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteReferenciaBancaria.addItem(cliente);
							}
						}

						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
					}

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.addItem(banco);
							}
						}

						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProduBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProduBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.removeAllItems();

							for(TipoProduBanco tipoprodubanco:this.tipoprodubancosForeignKey) {
								this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.addItem(tipoprodubanco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
					}

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProductoBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.removeAllItems();

							for(TipoProduBanco tipoprodubanco:this.tipoprodubancosForeignKey) {
								this.jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.addItem(tipoprodubanco);
							}
						}

						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCuentaBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCuentaBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.removeAllItems();

							for(TipoCuentaBanco tipocuentabanco:this.tipocuentabancosForeignKey) {
								this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.addItem(tipocuentabanco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
					}

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.removeAllItems();

							for(TipoCuentaBanco tipocuentabanco:this.tipocuentabancosForeignKey) {
								this.jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.addItem(tipocuentabanco);
							}
						}

						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoValoracionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoValoracion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.addItem(tipovaloracion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { 
					}

					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.addItem(tipovaloracion);
							}
						}

						if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteReferenciaBancaria.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBancoForeignKey(Banco banco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setSelectedItem(banco);
						} else {
							this.jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProduBancoForeignKey(TipoProduBanco tipoprodubanco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setSelectedItem(tipoprodubanco);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setSelectedItem(tipoprodubanco);
						} else {
							this.jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCuentaBancoForeignKey(TipoCuentaBanco tipocuentabanco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setSelectedItem(tipocuentabanco);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setSelectedItem(tipocuentabanco);
						} else {
							this.jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoValoracionForeignKey(TipoValoracion tipovaloracion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setSelectedItem(tipovaloracion);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setSelectedItem(tipovaloracion);
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesReferenciaBancaria() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ReferenciaBancariaConstantesFunciones.refrescarForeignKeysDescripcionesReferenciaBancaria(this.referenciabancariaLogic.getReferenciaBancarias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ReferenciaBancariaConstantesFunciones.refrescarForeignKeysDescripcionesReferenciaBancaria(this.referenciabancarias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Banco.class));
		classes.add(new Classe(TipoProduBanco.class));
		classes.add(new Classe(TipoCuentaBanco.class));
		classes.add(new Classe(TipoValoracion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//referenciabancariaLogic.setReferenciaBancarias(this.referenciabancarias);
			referenciabancariaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ReferenciaBancariaParameterReturnGeneral getReferenciaBancariaParameterGeneral() {
		return this.referenciabancariaParameterGeneral;
	}
	
	public void setReferenciaBancariaParameterGeneral(ReferenciaBancariaParameterReturnGeneral referenciabancariaParameterGeneral) {
		this.referenciabancariaParameterGeneral = referenciabancariaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReferenciaBancaria() {
		return isPermisoTodoReferenciaBancaria;
	}

	public void setIsPermisoTodoReferenciaBancaria(Boolean isPermisoTodoReferenciaBancaria) {
		this.isPermisoTodoReferenciaBancaria = isPermisoTodoReferenciaBancaria;
	}

	public Boolean getIsPermisoNuevoReferenciaBancaria() {
		return isPermisoNuevoReferenciaBancaria;
	}

	public void setIsPermisoNuevoReferenciaBancaria(Boolean isPermisoNuevoReferenciaBancaria) {
		this.isPermisoNuevoReferenciaBancaria = isPermisoNuevoReferenciaBancaria;
	}

	public Boolean getIsPermisoActualizarReferenciaBancaria() {
		return isPermisoActualizarReferenciaBancaria;
	}

	public void setIsPermisoActualizarReferenciaBancaria(Boolean isPermisoActualizarReferenciaBancaria) {
		this.isPermisoActualizarReferenciaBancaria = isPermisoActualizarReferenciaBancaria;
	}

	public Boolean getIsPermisoEliminarReferenciaBancaria() {
		return isPermisoEliminarReferenciaBancaria;
	}

	public void setIsPermisoEliminarReferenciaBancaria(Boolean isPermisoEliminarReferenciaBancaria) {
		this.isPermisoEliminarReferenciaBancaria = isPermisoEliminarReferenciaBancaria;
	}

	public Boolean getIsPermisoGuardarCambiosReferenciaBancaria() {
		return isPermisoGuardarCambiosReferenciaBancaria;
	}

	public void setIsPermisoGuardarCambiosReferenciaBancaria(Boolean isPermisoGuardarCambiosReferenciaBancaria) {
		this.isPermisoGuardarCambiosReferenciaBancaria = isPermisoGuardarCambiosReferenciaBancaria;
	}
	
	public Boolean getIsPermisoConsultaReferenciaBancaria() {
		return isPermisoConsultaReferenciaBancaria;
	}

	public void setIsPermisoConsultaReferenciaBancaria(Boolean isPermisoConsultaReferenciaBancaria) {
		this.isPermisoConsultaReferenciaBancaria = isPermisoConsultaReferenciaBancaria;
	}

	public Boolean getIsPermisoBusquedaReferenciaBancaria() {
		return isPermisoBusquedaReferenciaBancaria;
	}

	public void setIsPermisoBusquedaReferenciaBancaria(Boolean isPermisoBusquedaReferenciaBancaria) {
		this.isPermisoBusquedaReferenciaBancaria = isPermisoBusquedaReferenciaBancaria;
	}

	public Boolean getIsPermisoReporteReferenciaBancaria() {
		return isPermisoReporteReferenciaBancaria;
	}

	public void setIsPermisoReporteReferenciaBancaria(Boolean isPermisoReporteReferenciaBancaria) {
		this.isPermisoReporteReferenciaBancaria = isPermisoReporteReferenciaBancaria;
	}
	
	public Boolean getIsPermisoPaginacionMedioReferenciaBancaria() {
		return isPermisoPaginacionMedioReferenciaBancaria;
	}

	public void setIsPermisoPaginacionMedioReferenciaBancaria(Boolean isPermisoPaginacionMedioReferenciaBancaria) {
		this.isPermisoPaginacionMedioReferenciaBancaria = isPermisoPaginacionMedioReferenciaBancaria;
	}
	
	public Boolean getIsPermisoPaginacionTodoReferenciaBancaria() {
		return isPermisoPaginacionTodoReferenciaBancaria;
	}

	public void setIsPermisoPaginacionTodoReferenciaBancaria(Boolean isPermisoPaginacionTodoReferenciaBancaria) {
		this.isPermisoPaginacionTodoReferenciaBancaria = isPermisoPaginacionTodoReferenciaBancaria;
	}
	
	public Boolean getIsPermisoPaginacionAltoReferenciaBancaria() {
		return isPermisoPaginacionAltoReferenciaBancaria;
	}

	public void setIsPermisoPaginacionAltoReferenciaBancaria(Boolean isPermisoPaginacionAltoReferenciaBancaria) {
		this.isPermisoPaginacionAltoReferenciaBancaria = isPermisoPaginacionAltoReferenciaBancaria;
	}
	
	public Boolean getIsPermisoCopiarReferenciaBancaria() {
		return isPermisoCopiarReferenciaBancaria;
	}

	public void setIsPermisoCopiarReferenciaBancaria(Boolean isPermisoCopiarReferenciaBancaria) {
		this.isPermisoCopiarReferenciaBancaria = isPermisoCopiarReferenciaBancaria;
	}
	
	public Boolean getIsPermisoVerFormReferenciaBancaria() {
		return isPermisoVerFormReferenciaBancaria;
	}

	public void setIsPermisoVerFormReferenciaBancaria(Boolean isPermisoVerFormReferenciaBancaria) {
		this.isPermisoVerFormReferenciaBancaria = isPermisoVerFormReferenciaBancaria;
	}
	
	public Boolean getIsPermisoDuplicarReferenciaBancaria() {
		return isPermisoDuplicarReferenciaBancaria;
	}

	public void setIsPermisoDuplicarReferenciaBancaria(Boolean isPermisoDuplicarReferenciaBancaria) {
		this.isPermisoDuplicarReferenciaBancaria = isPermisoDuplicarReferenciaBancaria;
	}
	
	public Boolean getIsPermisoOrdenReferenciaBancaria() {
		return isPermisoOrdenReferenciaBancaria;
	}

	public void setIsPermisoOrdenReferenciaBancaria(Boolean isPermisoOrdenReferenciaBancaria) {
		this.isPermisoOrdenReferenciaBancaria = isPermisoOrdenReferenciaBancaria;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReferenciaBancaria() {
		return isVisibilidadCeldaNuevoReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaNuevoReferenciaBancaria(Boolean isVisibilidadCeldaNuevoReferenciaBancaria) {
		this.isVisibilidadCeldaNuevoReferenciaBancaria = isVisibilidadCeldaNuevoReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReferenciaBancaria() {
		return isVisibilidadCeldaDuplicarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaDuplicarReferenciaBancaria(Boolean isVisibilidadCeldaDuplicarReferenciaBancaria) {
		this.isVisibilidadCeldaDuplicarReferenciaBancaria = isVisibilidadCeldaDuplicarReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReferenciaBancaria() {
		return isVisibilidadCeldaCopiarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaCopiarReferenciaBancaria(Boolean isVisibilidadCeldaCopiarReferenciaBancaria) {
		this.isVisibilidadCeldaCopiarReferenciaBancaria = isVisibilidadCeldaCopiarReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReferenciaBancaria() {
		return isVisibilidadCeldaVerFormReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaVerFormReferenciaBancaria(Boolean isVisibilidadCeldaVerFormReferenciaBancaria) {
		this.isVisibilidadCeldaVerFormReferenciaBancaria = isVisibilidadCeldaVerFormReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReferenciaBancaria() {
		return isVisibilidadCeldaOrdenReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaOrdenReferenciaBancaria(Boolean isVisibilidadCeldaOrdenReferenciaBancaria) {
		this.isVisibilidadCeldaOrdenReferenciaBancaria = isVisibilidadCeldaOrdenReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReferenciaBancaria() {
		return isVisibilidadCeldaNuevoRelacionesReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReferenciaBancaria(Boolean isVisibilidadCeldaNuevoRelacionesReferenciaBancaria) {
		this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria = isVisibilidadCeldaNuevoRelacionesReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReferenciaBancaria() {
		return isVisibilidadCeldaModificarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaModificarReferenciaBancaria(Boolean isVisibilidadCeldaModificarReferenciaBancaria) {
		this.isVisibilidadCeldaModificarReferenciaBancaria = isVisibilidadCeldaModificarReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReferenciaBancaria() {
		return isVisibilidadCeldaActualizarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaActualizarReferenciaBancaria(Boolean isVisibilidadCeldaActualizarReferenciaBancaria) {
		this.isVisibilidadCeldaActualizarReferenciaBancaria = isVisibilidadCeldaActualizarReferenciaBancaria;
	}

	public Boolean getIsVisibilidadCeldaEliminarReferenciaBancaria() {
		return isVisibilidadCeldaEliminarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaEliminarReferenciaBancaria(Boolean isVisibilidadCeldaEliminarReferenciaBancaria) {
		this.isVisibilidadCeldaEliminarReferenciaBancaria = isVisibilidadCeldaEliminarReferenciaBancaria;
	}

	public Boolean getIsVisibilidadCeldaCancelarReferenciaBancaria() {
		return isVisibilidadCeldaCancelarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaCancelarReferenciaBancaria(Boolean isVisibilidadCeldaCancelarReferenciaBancaria) {
		this.isVisibilidadCeldaCancelarReferenciaBancaria = isVisibilidadCeldaCancelarReferenciaBancaria;
	}

	public Boolean getIsVisibilidadCeldaGuardarReferenciaBancaria() {
		return isVisibilidadCeldaGuardarReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaGuardarReferenciaBancaria(Boolean isVisibilidadCeldaGuardarReferenciaBancaria) {
		this.isVisibilidadCeldaGuardarReferenciaBancaria = isVisibilidadCeldaGuardarReferenciaBancaria;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReferenciaBancaria() {
		return isVisibilidadCeldaGuardarCambiosReferenciaBancaria;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReferenciaBancaria(Boolean isVisibilidadCeldaGuardarCambiosReferenciaBancaria) {
		this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria = isVisibilidadCeldaGuardarCambiosReferenciaBancaria;
	}
		
	public ReferenciaBancariaSessionBean getreferenciabancariaSessionBean() {
		return this.referenciabancariaSessionBean;
	}
	
	public void setreferenciabancariaSessionBean(ReferenciaBancariaSessionBean referenciabancariaSessionBean) {
		this.referenciabancariaSessionBean=referenciabancariaSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoBanco() {
		return this.isVisibilidadFK_IdTipoBanco;
	}

	public void setisVisibilidadFK_IdTipoBanco(Boolean isVisibilidadFK_IdTipoBanco) {
		this.isVisibilidadFK_IdTipoBanco=isVisibilidadFK_IdTipoBanco;
	}

	public Boolean getisVisibilidadFK_IdTipoCuentaBanco() {
		return this.isVisibilidadFK_IdTipoCuentaBanco;
	}

	public void setisVisibilidadFK_IdTipoCuentaBanco(Boolean isVisibilidadFK_IdTipoCuentaBanco) {
		this.isVisibilidadFK_IdTipoCuentaBanco=isVisibilidadFK_IdTipoCuentaBanco;
	}

	public Boolean getisVisibilidadFK_IdTipoProductoBanco() {
		return this.isVisibilidadFK_IdTipoProductoBanco;
	}

	public void setisVisibilidadFK_IdTipoProductoBanco(Boolean isVisibilidadFK_IdTipoProductoBanco) {
		this.isVisibilidadFK_IdTipoProductoBanco=isVisibilidadFK_IdTipoProductoBanco;
	}

	public Boolean getisVisibilidadFK_IdTipoValoracion() {
		return this.isVisibilidadFK_IdTipoValoracion;
	}

	public void setisVisibilidadFK_IdTipoValoracion(Boolean isVisibilidadFK_IdTipoValoracion) {
		this.isVisibilidadFK_IdTipoValoracion=isVisibilidadFK_IdTipoValoracion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(ReferenciaBancaria referenciabancaria)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(referenciabancaria,null);
				this.setActualParaGuardarClienteForeignKey(referenciabancaria,null);
				this.setActualParaGuardarBancoForeignKey(referenciabancaria,null);
				this.setActualParaGuardarTipoProduBancoForeignKey(referenciabancaria,null);
				this.setActualParaGuardarTipoCuentaBancoForeignKey(referenciabancaria,null);
				this.setActualParaGuardarTipoValoracionForeignKey(referenciabancaria,null);
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
	
	public void bugActualizarReferenciaActual(ReferenciaBancaria referenciabancaria,ReferenciaBancaria referenciabancariaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReferenciaBancaria(referenciabancaria);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		referenciabancariaAux.setId(referenciabancaria.getId());
		referenciabancariaAux.setVersionRow(referenciabancaria.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessReferenciaBancaria();
		
			int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = referenciabancariaValidator.getInvalidValues(this.referenciabancaria);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			referenciabancariaLogic.setDatosCliente(datosCliente);
			referenciabancariaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				referenciabancariaAux=new  ReferenciaBancaria();
				
				referenciabancariaAux.setIsNew(true);
				referenciabancariaAux.setIsChanged(true);
				
				referenciabancariaAux.setReferenciaBancariaOriginal(this.referenciabancaria);
				
				referenciabancariaAux.setId(this.referenciabancaria.getId());	
				referenciabancariaAux.setVersionRow(this.referenciabancaria.getVersionRow());	
				referenciabancariaAux.setid_empresa(this.referenciabancaria.getid_empresa());	
				referenciabancariaAux.setidcliente(this.referenciabancaria.getidcliente());	
				referenciabancariaAux.setidvalorclientebanco(this.referenciabancaria.getidvalorclientebanco());	
				referenciabancariaAux.setidvalorclienteproductobanco(this.referenciabancaria.getidvalorclienteproductobanco());	
				referenciabancariaAux.setidvalorclientecuentabanco(this.referenciabancaria.getidvalorclientecuentabanco());	
				referenciabancariaAux.setnumero_cuenta_tarjeta(this.referenciabancaria.getnumero_cuenta_tarjeta());	
				referenciabancariaAux.setfecha_emision(this.referenciabancaria.getfecha_emision());	
				referenciabancariaAux.setfecha_vencimiento(this.referenciabancaria.getfecha_vencimiento());	
				referenciabancariaAux.setcupo(this.referenciabancaria.getcupo());	
				referenciabancariaAux.settiene_credito(this.referenciabancaria.gettiene_credito());	
				referenciabancariaAux.setnumero_creditos(this.referenciabancaria.getnumero_creditos());	
				referenciabancariaAux.settiene_protestos(this.referenciabancaria.gettiene_protestos());	
				referenciabancariaAux.setnumero_protestos(this.referenciabancaria.getnumero_protestos());	
				referenciabancariaAux.setsaldos_promedios(this.referenciabancaria.getsaldos_promedios());	
				referenciabancariaAux.setpropietario_cuenta(this.referenciabancaria.getpropietario_cuenta());	
				referenciabancariaAux.setid_tipo_valoracion(this.referenciabancaria.getid_tipo_valoracion());	
				referenciabancariaAux.setesactivo(this.referenciabancaria.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(referenciabancariaAux,referenciabancariaLogic.getReferenciaBancarias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciabancariaAux,referenciabancarias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.saveReferenciaBancarias();//WithConnection
						//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referenciabancaria,referenciabancariaAux);
					
					this.refrescarForeignKeysDescripcionesReferenciaBancaria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciabancariaLogic.saveReferenciaBancariaRelaciones(referenciabancariaAux);//WithConnection
								//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referenciabancaria,referenciabancariaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciabancariaAux,referenciabancariaLogic.getReferenciaBancarias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciabancariaAux,referenciabancarias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referenciabancaria,referenciabancariaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				referenciabancariaAux=new  ReferenciaBancaria();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado() 
					|| (this.referenciabancariaSessionBean.getEsGuardarRelacionado() && this.referenciabancaria.getId()>=0)) {
						
					referenciabancariaAux.setIsNew(false);
				}
				
				referenciabancariaAux.setIsDeleted(false);
			
				referenciabancariaAux.setId(this.referenciabancaria.getId());	
				referenciabancariaAux.setVersionRow(this.referenciabancaria.getVersionRow());	
				referenciabancariaAux.setid_empresa(this.referenciabancaria.getid_empresa());	
				referenciabancariaAux.setidcliente(this.referenciabancaria.getidcliente());	
				referenciabancariaAux.setidvalorclientebanco(this.referenciabancaria.getidvalorclientebanco());	
				referenciabancariaAux.setidvalorclienteproductobanco(this.referenciabancaria.getidvalorclienteproductobanco());	
				referenciabancariaAux.setidvalorclientecuentabanco(this.referenciabancaria.getidvalorclientecuentabanco());	
				referenciabancariaAux.setnumero_cuenta_tarjeta(this.referenciabancaria.getnumero_cuenta_tarjeta());	
				referenciabancariaAux.setfecha_emision(this.referenciabancaria.getfecha_emision());	
				referenciabancariaAux.setfecha_vencimiento(this.referenciabancaria.getfecha_vencimiento());	
				referenciabancariaAux.setcupo(this.referenciabancaria.getcupo());	
				referenciabancariaAux.settiene_credito(this.referenciabancaria.gettiene_credito());	
				referenciabancariaAux.setnumero_creditos(this.referenciabancaria.getnumero_creditos());	
				referenciabancariaAux.settiene_protestos(this.referenciabancaria.gettiene_protestos());	
				referenciabancariaAux.setnumero_protestos(this.referenciabancaria.getnumero_protestos());	
				referenciabancariaAux.setsaldos_promedios(this.referenciabancaria.getsaldos_promedios());	
				referenciabancariaAux.setpropietario_cuenta(this.referenciabancaria.getpropietario_cuenta());	
				referenciabancariaAux.setid_tipo_valoracion(this.referenciabancaria.getid_tipo_valoracion());	
				referenciabancariaAux.setesactivo(this.referenciabancaria.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciabancariaAux,referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciabancariaAux,referenciabancarias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.saveReferenciaBancarias();//WithConnection
						//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referenciabancaria,referenciabancariaAux);
					
					this.refrescarForeignKeysDescripcionesReferenciaBancaria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciabancariaLogic.saveReferenciaBancariaRelaciones(referenciabancariaAux);//WithConnection
								//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referenciabancaria,referenciabancariaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciabancariaAux,referenciabancariaLogic.getReferenciaBancarias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciabancariaAux,referenciabancarias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referenciabancaria,referenciabancariaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				referenciabancariaAux=new  ReferenciaBancaria();
				
				referenciabancariaAux.setIsNew(false);
				referenciabancariaAux.setIsChanged(false);
				
				referenciabancariaAux.setIsDeleted(true);
				
				referenciabancariaAux.setId(this.referenciabancaria.getId());	
				referenciabancariaAux.setVersionRow(this.referenciabancaria.getVersionRow());	
				referenciabancariaAux.setid_empresa(this.referenciabancaria.getid_empresa());	
				referenciabancariaAux.setidcliente(this.referenciabancaria.getidcliente());	
				referenciabancariaAux.setidvalorclientebanco(this.referenciabancaria.getidvalorclientebanco());	
				referenciabancariaAux.setidvalorclienteproductobanco(this.referenciabancaria.getidvalorclienteproductobanco());	
				referenciabancariaAux.setidvalorclientecuentabanco(this.referenciabancaria.getidvalorclientecuentabanco());	
				referenciabancariaAux.setnumero_cuenta_tarjeta(this.referenciabancaria.getnumero_cuenta_tarjeta());	
				referenciabancariaAux.setfecha_emision(this.referenciabancaria.getfecha_emision());	
				referenciabancariaAux.setfecha_vencimiento(this.referenciabancaria.getfecha_vencimiento());	
				referenciabancariaAux.setcupo(this.referenciabancaria.getcupo());	
				referenciabancariaAux.settiene_credito(this.referenciabancaria.gettiene_credito());	
				referenciabancariaAux.setnumero_creditos(this.referenciabancaria.getnumero_creditos());	
				referenciabancariaAux.settiene_protestos(this.referenciabancaria.gettiene_protestos());	
				referenciabancariaAux.setnumero_protestos(this.referenciabancaria.getnumero_protestos());	
				referenciabancariaAux.setsaldos_promedios(this.referenciabancaria.getsaldos_promedios());	
				referenciabancariaAux.setpropietario_cuenta(this.referenciabancaria.getpropietario_cuenta());	
				referenciabancariaAux.setid_tipo_valoracion(this.referenciabancaria.getid_tipo_valoracion());	
				referenciabancariaAux.setesactivo(this.referenciabancaria.getesactivo());	
				
				if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.referenciabancariaAux.getId()>=0) {	
						this.referenciabancariasEliminados.add(referenciabancariaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(referenciabancariaAux,referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciabancariaAux,referenciabancarias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.saveReferenciaBancarias();//WithConnection
						//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciabancariaLogic.saveReferenciaBancariaRelaciones(referenciabancariaAux);//WithConnection
								//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
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
							if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(referenciabancariaAux,referenciabancariaLogic.getReferenciaBancarias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(referenciabancariaAux,referenciabancarias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getReferenciaBancarias().addAll(this.referenciabancariasEliminados);
					
					referenciabancariaLogic.saveReferenciaBancarias();//WithConnection
					//referenciabancariaLogic.getSetVersionRowReferenciaBancarias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesReferenciaBancaria();
				
				this.referenciabancariasEliminados= new ArrayList<ReferenciaBancaria>();		
			}
			
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Referencia Bancaria GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.referenciabancaria=referenciabancariaAux;
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
      		//this.finishProcessReferenciaBancaria();
      	}
		
	}	
	
	public void actualizarRelaciones(ReferenciaBancaria referenciabancariaLocal) throws Exception {
		
		if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ReferenciaBancaria referenciabancariaLocal) throws Exception {	
		if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				referenciabancariaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				referenciabancariaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				referenciabancariaLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProduBancoDetalleFormJInternalFrame.class)) {
				TipoProduBancoBeanSwingJInternalFrame tipoprodubancoBeanSwingJInternalFrameLocal=(TipoProduBancoBeanSwingJInternalFrame) ((TipoProduBancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprodubancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProduBanco(tipoprodubancoBeanSwingJInternalFrameLocal.gettipoprodubanco(),true);
				tipoprodubancoBeanSwingJInternalFrameLocal.actualizarLista(tipoprodubancoBeanSwingJInternalFrameLocal.tipoprodubanco,this.tipoprodubancosForeignKey);

				tipoprodubancoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprodubancoBeanSwingJInternalFrameLocal.tipoprodubanco);

				referenciabancariaLocal.setTipoProduBanco(tipoprodubancoBeanSwingJInternalFrameLocal.tipoprodubanco);

				this.addItemDefectoCombosForeignKeyTipoProduBanco();
				this.cargarCombosFrameTipoProduBancosForeignKey("Formulario");
				this.setActualTipoProduBancoForeignKey(tipoprodubancoBeanSwingJInternalFrameLocal.tipoprodubanco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCuentaBancoDetalleFormJInternalFrame.class)) {
				TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrameLocal=(TipoCuentaBancoBeanSwingJInternalFrame) ((TipoCuentaBancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocuentabancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCuentaBanco(tipocuentabancoBeanSwingJInternalFrameLocal.gettipocuentabanco(),true);
				tipocuentabancoBeanSwingJInternalFrameLocal.actualizarLista(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco,this.tipocuentabancosForeignKey);

				tipocuentabancoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco);

				referenciabancariaLocal.setTipoCuentaBanco(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco);

				this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
				this.cargarCombosFrameTipoCuentaBancosForeignKey("Formulario");
				this.setActualTipoCuentaBancoForeignKey(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoValoracionDetalleFormJInternalFrame.class)) {
				TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrameLocal=(TipoValoracionBeanSwingJInternalFrame) ((TipoValoracionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovaloracionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.gettipovaloracion(),true);
				tipovaloracionBeanSwingJInternalFrameLocal.actualizarLista(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion,this.tipovaloracionsForeignKey);

				tipovaloracionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				referenciabancariaLocal.setTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey("Formulario");
				this.setActualTipoValoracionForeignKey(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarReferenciaBancariaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = referenciabancariaValidator.getInvalidValues(this.referenciabancaria);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ReferenciaBancaria referenciabancaria,List<ReferenciaBancaria> referenciabancarias) throws Exception {
		try	{		
			ReferenciaBancariaConstantesFunciones.actualizarLista(referenciabancaria,referenciabancarias,this.referenciabancariaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ReferenciaBancaria referenciabancaria,List<ReferenciaBancaria> referenciabancarias) throws Exception {
		try	{			
			ReferenciaBancariaConstantesFunciones.actualizarSelectedLista(referenciabancaria,referenciabancarias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ReferenciaBancaria> referenciabancariasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				referenciabancariasLocal=this.referenciabancariaLogic.getReferenciaBancarias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				referenciabancariasLocal=this.referenciabancarias;
			}
			//ARCHITECTURE
		
			for(ReferenciaBancaria referenciabancariaLocal:referenciabancariasLocal) {
				if(this.permiteMantenimiento(referenciabancariaLocal) && referenciabancariaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReferenciaBancariaConstantesFunciones.getReferenciaBancariaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelid_empresaReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidclienteReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidvalorclientebancoReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.IDTIPOPRODUBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidvalorclienteproductobancoReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.IDTIPOCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidvalorclientecuentabancoReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.NUMEROCUENTATARJETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_cuenta_tarjetaReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelfecha_emisionReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelfecha_vencimientoReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.CUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelcupoReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.TIENECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabeltiene_creditoReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.NUMEROCREDITOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_creditosReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.TIENEPROTESTOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabeltiene_protestosReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.NUMEROPROTESTOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_protestosReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.SALDOSPROMEDIOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelsaldos_promediosReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.PROPIETARIOCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelpropietario_cuentaReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.IDTIPOVALORACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelid_tipo_valoracionReferenciaBancaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaBancariaConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelesactivoReferenciaBancaria,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelid_empresaReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidclienteReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidvalorclientebancoReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidvalorclienteproductobancoReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidvalorclientecuentabancoReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_cuenta_tarjetaReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelfecha_emisionReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelfecha_vencimientoReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelcupoReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabeltiene_creditoReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_creditosReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabeltiene_protestosReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_protestosReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelsaldos_promediosReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelpropietario_cuentaReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelid_tipo_valoracionReferenciaBancaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelesactivoReferenciaBancaria,"");
		
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
		this.iIdNuevoReferenciaBancaria--;	
		
		
		this.referenciabancariaAux=new ReferenciaBancaria();
		
		this.referenciabancariaAux.setId(this.iIdNuevoReferenciaBancaria);
		this.referenciabancariaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciabancariaLogic.getReferenciaBancarias().add(this.referenciabancariaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.referenciabancarias.add(this.referenciabancariaAux);
		}
		//ARCHITECTURE
		
		this.referenciabancaria=this.referenciabancariaAux;
		
		if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReferenciaBancaria(this.referenciabancaria);
			this.setVariablesObjetoActualToFormularioForeignKeyReferenciaBancaria(this.referenciabancaria);
		}
				
		//this.setDefaultControlesReferenciaBancaria();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReferenciaBancaria();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReferenciaBancaria();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaBancaria();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferenciaBancaria(this.referenciabancariaBean,this.referenciabancaria,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
			classes=ReferenciaBancariaConstantesFunciones.getClassesRelationshipsOfReferenciaBancaria(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.referenciabancariaReturnGeneral=referenciabancariaLogic.procesarEventosReferenciaBancariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciabancariaLogic.getReferenciaBancarias(),this.referenciabancaria,this.referenciabancariaParameterGeneral,this.isEsNuevoReferenciaBancaria,classes);//this.referenciabancariaLogic.getReferenciaBancaria()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReferenciaBancaria(this.referenciabancariaReturnGeneral,this.referenciabancariaBean,false);
		
		if(this.referenciabancariaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria());
		}
		
		if(this.referenciabancariaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria(),classes);//this.referenciabancariaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReferenciaBancaria();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReferenciaBancaria();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.RecargarFormReferenciaBancaria(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReferenciaBancaria(false);
						
			if(referenciabancariaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaBancaria();
			}
			
			this.actualizarVisualTableDatosReferenciaBancaria();
			
			this.jTableDatosReferenciaBancaria.setRowSelectionInterval(this.getIndiceNuevoReferenciaBancaria(), this.getIndiceNuevoReferenciaBancaria());
			
			this.seleccionarFilaTablaReferenciaBancariaActual();
						
			this.actualizarEstadoCeldasBotonesReferenciaBancaria("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReferenciaBancaria(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarnumero_cuenta_tarjetaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarfecha_emisionReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarfecha_vencimientoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarcupoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activartiene_creditoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarnumero_creditosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activartiene_protestosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarnumero_protestosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarsaldos_promediosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarpropietario_cuentaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activaresactivoReferenciaBancaria);	
		//
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarid_empresaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activaridclienteReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activaridvalorclientebancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activaridvalorclienteproductobancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activaridvalorclientecuentabancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setEnabled(isHabilitar && this.referenciabancariaConstantesFunciones.activarid_tipo_valoracionReferenciaBancaria);
	};
	
	public void setDefaultControlesReferenciaBancaria() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReferenciaBancaria(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.referenciabancariaSessionBean.setConGuardarRelaciones(true);			
			this.referenciabancariaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.setVisible(true);
			
					
		} else {
			//this.referenciabancariaSessionBean.setConGuardarRelaciones(false);			
			this.referenciabancariaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoReferenciaBancaria() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
				if(referenciabancariaAux.getId().equals(this.iIdNuevoReferenciaBancaria)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaBancaria referenciabancariaAux:this.referenciabancarias) {
				if(referenciabancariaAux.getId().equals(this.iIdNuevoReferenciaBancaria)) {
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
	
	public int getIndiceActualReferenciaBancaria(ReferenciaBancaria referenciabancaria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
				if(referenciabancariaAux.getId().equals(referenciabancaria.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaBancaria referenciabancariaAux:this.referenciabancarias) {
				if(referenciabancariaAux.getId().equals(referenciabancaria.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReferenciaBancaria(ReferenciaBancaria referenciabancariaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
				if(referenciabancariaAux.getReferenciaBancariaOriginal().getId().equals(referenciabancariaOriginal.getId())) {
					existe=true;
					referenciabancariaOriginal.setId(referenciabancariaAux.getId());
					referenciabancariaOriginal.setVersionRow(referenciabancariaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaBancaria referenciabancariaAux:this.referenciabancarias) {
				if(referenciabancariaAux.getReferenciaBancariaOriginal().getId().equals(referenciabancariaOriginal.getId())) {
					existe=true;
					referenciabancariaOriginal.setId(referenciabancariaAux.getId());
					referenciabancariaOriginal.setVersionRow(referenciabancariaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReferenciaBancaria(Boolean esParaCancelar) throws Exception {
		referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
		referenciabancariaAux=new ReferenciaBancaria();
		
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
					if(referenciabancariaAux.getId()<0) {
						referenciabancariasAux.add(referenciabancariaAux);
					}		
				}
				this.iIdNuevoReferenciaBancaria=0L;
				this.referenciabancariaLogic.getReferenciaBancarias().removeAll(referenciabancariasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaBancaria referenciabancariaAux:this.referenciabancarias) {
					if(referenciabancariaAux.getId()<0) {
						referenciabancariasAux.add(referenciabancariaAux);
					}		
				}
				this.iIdNuevoReferenciaBancaria=0L;
				this.referenciabancarias.removeAll(referenciabancariasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReferenciaBancaria 
					&& this.referenciabancariaLogic.getReferenciaBancarias().size()>0
					) {
					referenciabancariaAux=this.referenciabancariaLogic.getReferenciaBancarias().get(this.referenciabancariaLogic.getReferenciaBancarias().size() - 1);
				
					if(referenciabancariaAux.getId()<0) {
						this.referenciabancariaLogic.getReferenciaBancarias().remove(referenciabancariaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReferenciaBancaria && this.referenciabancarias.size()>0) {
					referenciabancariaAux=this.referenciabancarias.get(this.referenciabancarias.size() - 1);
				
					if(referenciabancariaAux.getId()<0) {
						this.referenciabancarias.remove(referenciabancariaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReferenciaBancaria(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(referenciabancaria.getId()<0) {
				this.referenciabancariaLogic.getReferenciaBancarias().remove(this.referenciabancaria);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(referenciabancaria.getId()<0) {
				this.referenciabancarias.remove(this.referenciabancaria);
			}
		}			
	}
	
	public void setEstadosInicialesReferenciaBancaria(List<ReferenciaBancaria> referenciabancariasAux) throws Exception {
		ReferenciaBancariaConstantesFunciones.setEstadosInicialesReferenciaBancaria(referenciabancariasAux);
	}
	
	public void setEstadosInicialesReferenciaBancaria(ReferenciaBancaria referenciabancariaAux) throws Exception {
		ReferenciaBancariaConstantesFunciones.setEstadosInicialesReferenciaBancaria(referenciabancariaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReferenciaBancariaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReferenciaBancaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReferenciaBancariaActual()) {
				if(!this.isEsNuevoReferenciaBancaria) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReferenciaBancaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReferenciaBancaria=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReferenciaBancariaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Referencia Bancaria ?", "MANTENIMIENTO DE Referencia Bancaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReferenciaBancaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ReferenciaBancaria referenciabancaria) throws Exception {
		ReferenciaBancariaConstantesFunciones.seleccionarAsignar(this.referenciabancaria,referenciabancaria);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReferenciaBancaria=this.isPermisoActualizarOriginalReferenciaBancaria;
			
			
			this.seleccionarAsignar(referenciabancaria);
			
			

			idClienteActual=referenciabancaria.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaBancariaConstantesFunciones.quitarEspaciosReferenciaBancaria(this.referenciabancaria,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesReferenciaBancaria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.referenciabancariaSessionBean.setsFuncionBusquedaRapida(this.referenciabancariaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoReferenciaBancaria) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReferenciaBancaria(esParaCancelar);				
				this.cancelarNuevoReferenciaBancaria(esParaCancelar);								
			}
			
			this.referenciabancaria=new ReferenciaBancaria();
			
			this.inicializarReferenciaBancaria();
			
			this.actualizarEstadoCeldasBotonesReferenciaBancaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReferenciaBancaria() throws Exception {
		try {
			ReferenciaBancariaConstantesFunciones.inicializarReferenciaBancaria(this.referenciabancaria);
			
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
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.referenciabancariaLogic.getReferenciaBancarias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReferenciaBancarias(String sAccionBusqueda,List<ReferenciaBancaria> referenciabancariasParaReportes) throws Exception {
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
					sPathReporteFinal="ReferenciaBancaria"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReferenciaBancariaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReferenciaBancariaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ReferenciaBancaria"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Referencia Bancarias");		
		parameters.put("busquedapor", ReferenciaBancariaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReferenciaBancaria=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReferenciaBancariaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReferenciaBancariaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReferenciaBancaria=new JRBeanArrayDataSource(ReferenciaBancariaJInternalFrame.TraerReferenciaBancariaBeans(referenciabancariasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReferenciaBancaria);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReferenciaBancariaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReferenciaBancariaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReferenciaBancariaBean.TraerReferenciaBancariaBeans(referenciabancariasParaReportes).toArray()));
							
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
				this.generarExcelReporteReferenciaBancarias(sAccionBusqueda,sTipoArchivoReporte,referenciabancariasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReferenciaBancarias(sAccionBusqueda,sTipoArchivoReporte,referenciabancariasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReferenciaBancariaActionPerformed(null);
					//this.generarExcelReporteReferenciaBancarias(sAccionBusqueda,sTipoArchivoReporte,referenciabancariasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReferenciaBancarias(sAccionBusqueda,sTipoArchivoReporte,referenciabancariasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReferenciaBancarias(sAccionBusqueda,sTipoArchivoReporte,referenciabancariasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReferenciaBancarias(sAccionBusqueda,sTipoArchivoReporte,referenciabancariasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReferenciaBancarias(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaBancaria> referenciabancariasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaBancarias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferenciaBancaria("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ReferenciaBancaria referenciabancaria : referenciabancariasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReferenciaBancariaConstantesFunciones.generarExcelReporteDataReferenciaBancaria("NORMAL",row,workbook,referenciabancaria,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReferenciaBancaria(String sTipo,Row row,Workbook workbook) {
		
		ReferenciaBancariaConstantesFunciones.generarExcelReporteHeaderReferenciaBancaria(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReferenciaBancarias(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaBancaria> referenciabancariasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaBancarias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ReferenciaBancaria referenciabancaria : referenciabancariasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReferenciaBancariaConstantesFunciones.getReferenciaBancariaDescripcion(referenciabancaria));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.gettipoprodubanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.gettipocuentabanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getnumero_cuenta_tarjeta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_CUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_CUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getcupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(referenciabancaria.gettiene_credito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getnumero_creditos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(referenciabancaria.gettiene_protestos()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getnumero_protestos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getsaldos_promedios());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.getpropietario_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciabancaria.gettipovaloracion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(referenciabancaria.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReferenciaBancarias(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaBancaria> referenciabancariasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ReferenciaBancaria> referenciabancariasRespaldo=null;
		
		classes=ReferenciaBancariaConstantesFunciones.getClassesRelationshipsOfReferenciaBancaria(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.referenciabancariaLogic.setDatosCliente(this.datosCliente);
		this.referenciabancariaLogic.setDatosDeep(this.datosDeep);
		this.referenciabancariaLogic.setIsConDeep(true);
		
		referenciabancariasRespaldo=this.referenciabancariaLogic.getReferenciaBancarias();
		
		this.referenciabancariaLogic.setReferenciaBancarias(referenciabancariasParaReportes);	
		this.referenciabancariaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		referenciabancariasParaReportes=this.referenciabancariaLogic.getReferenciaBancarias();
		this.referenciabancariaLogic.setReferenciaBancarias(referenciabancariasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaBancarias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferenciaBancaria("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ReferenciaBancaria referenciabancaria : referenciabancariasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReferenciaBancaria("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReferenciaBancariaConstantesFunciones.generarExcelReporteDataReferenciaBancaria("NORMAL",row,workbook,referenciabancaria,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ReferenciaBancariaConstantesFunciones.getReferenciaBancariaDescripcion(referenciabancaria));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReferenciaBancaria() throws Exception {		
		this.startProcessReferenciaBancaria(true);
	}
	
	public void startProcessReferenciaBancaria(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasReferenciaBancaria ,this.jPanelParametrosReportesReferenciaBancaria, this.jScrollPanelDatosReferenciaBancaria,this.jPanelPaginacionReferenciaBancaria, this.jScrollPanelDatosEdicionReferenciaBancaria, this.jPanelAccionesReferenciaBancaria,this.jPanelAccionesFormularioReferenciaBancaria,this.jmenuBarReferenciaBancaria,this.jmenuBarDetalleReferenciaBancaria,this.jTtoolBarReferenciaBancaria,this.jTtoolBarDetalleReferenciaBancaria);		
		
		final JTabbedPane jTabbedPaneBusquedasReferenciaBancaria=this.jTabbedPaneBusquedasReferenciaBancaria; 
		
		final JPanel jPanelParametrosReportesReferenciaBancaria=this.jPanelParametrosReportesReferenciaBancaria;
		//final JScrollPane jScrollPanelDatosReferenciaBancaria=this.jScrollPanelDatosReferenciaBancaria;
		final JTable jTableDatosReferenciaBancaria=this.jTableDatosReferenciaBancaria;		
		final JPanel jPanelPaginacionReferenciaBancaria=this.jPanelPaginacionReferenciaBancaria;
		//final JScrollPane jScrollPanelDatosEdicionReferenciaBancaria=this.jScrollPanelDatosEdicionReferenciaBancaria;
		final JPanel jPanelAccionesReferenciaBancaria=this.jPanelAccionesReferenciaBancaria;
		
		JPanel jPanelCamposAuxiliarReferenciaBancaria=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReferenciaBancaria=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			jPanelCamposAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jPanelCamposReferenciaBancaria;
			jPanelAccionesFormularioAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jPanelAccionesFormularioReferenciaBancaria;
		}
		
		final JPanel jPanelCamposReferenciaBancaria=jPanelCamposAuxiliarReferenciaBancaria;
		final JPanel jPanelAccionesFormularioReferenciaBancaria=jPanelAccionesFormularioAuxiliarReferenciaBancaria;
		
		
		final JMenuBar jmenuBarReferenciaBancaria=this.jmenuBarReferenciaBancaria;
		final JToolBar jTtoolBarReferenciaBancaria=this.jTtoolBarReferenciaBancaria;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReferenciaBancaria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferenciaBancaria=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			jmenuBarDetalleAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jmenuBarDetalleReferenciaBancaria;
			jTtoolBarDetalleAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jTtoolBarDetalleReferenciaBancaria;
		}
		
		final JMenuBar jmenuBarDetalleReferenciaBancaria=jmenuBarDetalleAuxiliarReferenciaBancaria;
		final JToolBar jTtoolBarDetalleReferenciaBancaria=jTtoolBarDetalleAuxiliarReferenciaBancaria;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferenciaBancaria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferenciaBancaria;
			processRunnable.jTableDatos=jTableDatosReferenciaBancaria;
			processRunnable.jPanelCampos=jPanelCamposReferenciaBancaria;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferenciaBancaria;
			processRunnable.jPanelAcciones=jPanelAccionesReferenciaBancaria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferenciaBancaria;
			
			
			processRunnable.jmenuBar=jmenuBarReferenciaBancaria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferenciaBancaria;
			processRunnable.jTtoolBar=jTtoolBarReferenciaBancaria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferenciaBancaria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferenciaBancaria ,jPanelParametrosReportesReferenciaBancaria,jTableDatosReferenciaBancaria, /*jScrollPanelDatosReferenciaBancaria,*/jPanelCamposReferenciaBancaria,jPanelPaginacionReferenciaBancaria, /*jScrollPanelDatosEdicionReferenciaBancaria,*/ jPanelAccionesReferenciaBancaria,jPanelAccionesFormularioReferenciaBancaria,jmenuBarReferenciaBancaria,jmenuBarDetalleReferenciaBancaria,jTtoolBarReferenciaBancaria,jTtoolBarDetalleReferenciaBancaria);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferenciaBancaria ,jPanelParametrosReportesReferenciaBancaria, jScrollPanelDatosReferenciaBancaria,jPanelPaginacionReferenciaBancaria, jScrollPanelDatosEdicionReferenciaBancaria, jPanelAccionesReferenciaBancaria,jPanelAccionesFormularioReferenciaBancaria,jmenuBarReferenciaBancaria,jmenuBarDetalleReferenciaBancaria,jTtoolBarReferenciaBancaria,jTtoolBarDetalleReferenciaBancaria);
						
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
	
	public void finishProcessReferenciaBancaria() {// throws Exception 
		this.finishProcessReferenciaBancaria(true);
	}
	
	public void finishProcessReferenciaBancaria(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasReferenciaBancaria ,this.jPanelParametrosReportesReferenciaBancaria, this.jScrollPanelDatosReferenciaBancaria,this.jPanelPaginacionReferenciaBancaria, this.jScrollPanelDatosEdicionReferenciaBancaria, this.jPanelAccionesReferenciaBancaria,this.jPanelAccionesFormularioReferenciaBancaria,this.jmenuBarReferenciaBancaria,this.jmenuBarDetalleReferenciaBancaria,this.jTtoolBarReferenciaBancaria,this.jTtoolBarDetalleReferenciaBancaria);		
		
		final JTabbedPane jTabbedPaneBusquedasReferenciaBancaria=this.jTabbedPaneBusquedasReferenciaBancaria; 
		
		final JPanel jPanelParametrosReportesReferenciaBancaria=this.jPanelParametrosReportesReferenciaBancaria;
		//final JScrollPane jScrollPanelDatosReferenciaBancaria=this.jScrollPanelDatosReferenciaBancaria;
		final JTable jTableDatosReferenciaBancaria=this.jTableDatosReferenciaBancaria;		
		final JPanel jPanelPaginacionReferenciaBancaria=this.jPanelPaginacionReferenciaBancaria;
		//final JScrollPane jScrollPanelDatosEdicionReferenciaBancaria=this.jScrollPanelDatosEdicionReferenciaBancaria;
		final JPanel jPanelAccionesReferenciaBancaria=this.jPanelAccionesReferenciaBancaria;
		
		JPanel jPanelCamposAuxiliarReferenciaBancaria=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReferenciaBancaria=new JPanel();
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			jPanelCamposAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jPanelCamposReferenciaBancaria;
			jPanelAccionesFormularioAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jPanelAccionesFormularioReferenciaBancaria;
		}
		
		final JPanel jPanelCamposReferenciaBancaria=jPanelCamposAuxiliarReferenciaBancaria;
		final JPanel jPanelAccionesFormularioReferenciaBancaria=jPanelAccionesFormularioAuxiliarReferenciaBancaria;
		
		
		final JMenuBar jmenuBarReferenciaBancaria=this.jmenuBarReferenciaBancaria;		
		final JToolBar jTtoolBarReferenciaBancaria=this.jTtoolBarReferenciaBancaria;
				
		JMenuBar jmenuBarDetalleAuxiliarReferenciaBancaria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferenciaBancaria=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			jmenuBarDetalleAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jmenuBarDetalleReferenciaBancaria;
			jTtoolBarDetalleAuxiliarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jTtoolBarDetalleReferenciaBancaria;		
		}
		
		final JMenuBar jmenuBarDetalleReferenciaBancaria=jmenuBarDetalleAuxiliarReferenciaBancaria;
		final JToolBar jTtoolBarDetalleReferenciaBancaria=jTtoolBarDetalleAuxiliarReferenciaBancaria;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferenciaBancaria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferenciaBancaria;
			processRunnable.jTableDatos=jTableDatosReferenciaBancaria;
			processRunnable.jPanelCampos=jPanelCamposReferenciaBancaria;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferenciaBancaria;
			processRunnable.jPanelAcciones=jPanelAccionesReferenciaBancaria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferenciaBancaria;
			
			
			processRunnable.jmenuBar=jmenuBarReferenciaBancaria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferenciaBancaria;
			processRunnable.jTtoolBar=jTtoolBarReferenciaBancaria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferenciaBancaria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReferenciaBancaria ,jPanelParametrosReportesReferenciaBancaria, jTableDatosReferenciaBancaria,/*jScrollPanelDatosReferenciaBancaria,*/jPanelCamposReferenciaBancaria,jPanelPaginacionReferenciaBancaria, /*jScrollPanelDatosEdicionReferenciaBancaria,*/ jPanelAccionesReferenciaBancaria,jPanelAccionesFormularioReferenciaBancaria,jmenuBarReferenciaBancaria,jmenuBarDetalleReferenciaBancaria,jTtoolBarReferenciaBancaria,jTtoolBarDetalleReferenciaBancaria));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReferenciaBancaria(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReferenciaBancaria(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReferenciaBancaria(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReferenciaBancaria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReferenciaBancaria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReferenciaBancaria,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReferenciaBancaria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReferenciaBancaria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReferenciaBancaria,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.referenciabancariaConstantesFunciones.getsFinalQueryReferenciaBancaria();
		String  finalQueryPaginacionTodos=this.referenciabancariaConstantesFunciones.getsFinalQueryReferenciaBancaria();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReferenciaBancariaConstantesFunciones.getArrayColumnasGlobalesNoReferenciaBancaria(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReferenciaBancariaConstantesFunciones.getArrayColumnasGlobalesReferenciaBancaria(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReferenciaBancariaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.referenciabancariasEliminados= new ArrayList<ReferenciaBancaria>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReferenciaBancaria();
		
				///*ReferenciaBancariaSessionBean*/this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			
			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
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
					this.iNumeroPaginacion=ReferenciaBancariaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReferenciaBancariaConstantesFunciones.getClassesForeignKeysOfReferenciaBancaria(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/referenciabancaria."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			referenciabancariasAux= new ArrayList<ReferenciaBancaria>();
			
				
			referenciabancariaLogic.setDatosCliente(this.datosCliente);
			referenciabancariaLogic.setDatosDeep(this.datosDeep);
			referenciabancariaLogic.setIsConDeep(true);
			
			
			referenciabancariaLogic.getReferenciaBancariaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					referenciabancariaLogic.getTodosReferenciaBancarias(finalQueryGlobal,pagination);
					
					//referenciabancariaLogic.getTodosReferenciaBancariasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(referenciabancariaLogic.getReferenciaBancarias()==null|| referenciabancariaLogic.getReferenciaBancarias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciabancariasAux= new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux= new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciabancariaLogic.getTodosReferenciaBancarias(finalQueryGlobal+"",this.pagination);												
							
							//referenciabancariaLogic.getTodosReferenciaBancariasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteReferenciaBancarias("Todos",referenciabancariaLogic.getReferenciaBancarias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());					
							referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idReferenciaBancaria=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idReferenciaBancaria=this.idActual;
				
				} else if(this.idReferenciaBancariaActual!=null && this.idReferenciaBancariaActual!=0L) {
					idReferenciaBancaria=idReferenciaBancariaActual;
				}
				
					
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndicePorId(idReferenciaBancaria);
				
				this.referenciabancarias=new ArrayList<ReferenciaBancaria>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					referenciabancariaLogic.getEntity(idReferenciaBancaria);
					
					//referenciabancariaLogic.getEntityWithConnection(idReferenciaBancaria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
					referenciabancariaLogic.getReferenciaBancarias().add(referenciabancariaLogic.getReferenciaBancaria());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancarias=new ArrayList<ReferenciaBancaria>();
					this.referenciabancarias.add(referenciabancaria);
				}
				
				if(referenciabancariaLogic.getReferenciaBancaria()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciabancariaLogic.getReferenciaBancariasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciabancariaLogic.getReferenciaBancarias()==null||referenciabancariaLogic.getReferenciaBancarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciabancarias==null|| referenciabancarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
						referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciabancariaLogic.getReferenciaBancariasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaBancarias("FK_IdCliente",referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaBancarias("FK_IdCliente",referenciabancarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
						referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciabancariaLogic.getReferenciaBancariasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciabancariaLogic.getReferenciaBancarias()==null||referenciabancariaLogic.getReferenciaBancarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciabancarias==null|| referenciabancarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
						referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciabancariaLogic.getReferenciaBancariasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaBancarias("FK_IdEmpresa",referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaBancarias("FK_IdEmpresa",referenciabancarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
						referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoBanco")) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(idvalorclientebancoFK_IdTipoBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoBanco(finalQueryGlobal,pagination,idvalorclientebancoFK_IdTipoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(idvalorclientebancoFK_IdTipoBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(idvalorclientebancoFK_IdTipoBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciabancariaLogic.getReferenciaBancarias()==null||referenciabancariaLogic.getReferenciaBancarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciabancarias==null|| referenciabancarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
						referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciabancariaLogic.getReferenciaBancariasFK_IdTipoBanco(finalQueryGlobal,pagination,idvalorclientebancoFK_IdTipoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(idvalorclientebancoFK_IdTipoBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoBanco(idvalorclientebancoFK_IdTipoBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaBancarias("FK_IdTipoBanco",referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaBancarias("FK_IdTipoBanco",referenciabancarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
						referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCuentaBanco")) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(idvalorclientecuentabancoFK_IdTipoCuentaBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoCuentaBanco(finalQueryGlobal,pagination,idvalorclientecuentabancoFK_IdTipoCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(idvalorclientecuentabancoFK_IdTipoCuentaBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(idvalorclientecuentabancoFK_IdTipoCuentaBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciabancariaLogic.getReferenciaBancarias()==null||referenciabancariaLogic.getReferenciaBancarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciabancarias==null|| referenciabancarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
						referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciabancariaLogic.getReferenciaBancariasFK_IdTipoCuentaBanco(finalQueryGlobal,pagination,idvalorclientecuentabancoFK_IdTipoCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(idvalorclientecuentabancoFK_IdTipoCuentaBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(idvalorclientecuentabancoFK_IdTipoCuentaBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaBancarias("FK_IdTipoCuentaBanco",referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaBancarias("FK_IdTipoCuentaBanco",referenciabancarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
						referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProductoBanco")) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoProductoBanco(idvalorclienteproductobancoFK_IdTipoProductoBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoProductoBanco(finalQueryGlobal,pagination,idvalorclienteproductobancoFK_IdTipoProductoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoProductoBanco(idvalorclienteproductobancoFK_IdTipoProductoBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoProductoBanco(idvalorclienteproductobancoFK_IdTipoProductoBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciabancariaLogic.getReferenciaBancarias()==null||referenciabancariaLogic.getReferenciaBancarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciabancarias==null|| referenciabancarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
						referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciabancariaLogic.getReferenciaBancariasFK_IdTipoProductoBanco(finalQueryGlobal,pagination,idvalorclienteproductobancoFK_IdTipoProductoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoProductoBanco(idvalorclienteproductobancoFK_IdTipoProductoBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoProductoBanco(idvalorclienteproductobancoFK_IdTipoProductoBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaBancarias("FK_IdTipoProductoBanco",referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaBancarias("FK_IdTipoProductoBanco",referenciabancarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
						referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoValoracion")) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciabancariaLogic.getReferenciaBancarias()==null||referenciabancariaLogic.getReferenciaBancarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciabancarias==null|| referenciabancarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
						referenciabancariasAux.addAll(referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariasAux=new ArrayList<ReferenciaBancaria>();
							referenciabancariasAux.addAll(referenciabancarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciabancariaLogic.getReferenciaBancariasFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaBancariaConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaBancarias("FK_IdTipoValoracion",referenciabancariaLogic.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaBancarias("FK_IdTipoValoracion",referenciabancarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
						referenciabancariaLogic.getReferenciaBancarias().addAll(referenciabancariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancarias=new ArrayList<ReferenciaBancaria>();
							referenciabancarias.addAll(referenciabancariasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReferenciaBancaria();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReferenciaBancaria();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciabancariaLogic.getReferenciaBancarias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciabancarias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciabancariaLogic.getReferenciaBancarias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciabancarias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ReferenciaBancaria referenciabancaria) {
		Boolean permite=true;
		
		if(this.referenciabancaria.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReferenciaBancariaConstantesFunciones.getOrderByListaReferenciaBancaria();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReferenciaBancariaConstantesFunciones.getOrderByListaReferenciaBancaria();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaBancaria referenciabancaria:referenciabancariaLogic.getReferenciaBancarias()) {
				if(referenciabancaria.getsType().equals(Constantes2.S_TOTALES)) {
					referenciabancariaTotales=referenciabancaria;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaBancaria referenciabancaria:this.referenciabancarias) {
				if(referenciabancaria.getsType().equals(Constantes2.S_TOTALES)) {
					referenciabancariaTotales=referenciabancaria;
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
			this.referenciabancariaAux=new ReferenciaBancaria();
			this.referenciabancariaAux.setsType(Constantes2.S_TOTALES);
			this.referenciabancariaAux.setIsNew(false);
			this.referenciabancariaAux.setIsChanged(false);
			this.referenciabancariaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ReferenciaBancariaConstantesFunciones.TotalizarValoresFilaReferenciaBancaria(this.referenciabancariaLogic.getReferenciaBancarias(),this.referenciabancariaAux);
				
				this.referenciabancariaLogic.getReferenciaBancarias().add(this.referenciabancariaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReferenciaBancariaConstantesFunciones.TotalizarValoresFilaReferenciaBancaria(this.referenciabancarias,this.referenciabancariaAux);
				
				this.referenciabancarias.add(this.referenciabancariaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		referenciabancariaTotales=new ReferenciaBancaria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciabancariaLogic.getReferenciaBancarias().remove(referenciabancariaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciabancarias.remove(referenciabancariaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		referenciabancariaTotales=new ReferenciaBancaria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaBancaria referenciabancaria:referenciabancariaLogic.getReferenciaBancarias()) {
				if(referenciabancaria.getsType().equals(Constantes2.S_TOTALES)) {
					referenciabancariaTotales=referenciabancaria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaBancariaConstantesFunciones.TotalizarValoresFilaReferenciaBancaria(this.referenciabancariaLogic.getReferenciaBancarias(),referenciabancariaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaBancaria referenciabancaria:this.referenciabancarias) {
				if(referenciabancaria.getsType().equals(Constantes2.S_TOTALES)) {
					referenciabancariaTotales=referenciabancaria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaBancariaConstantesFunciones.TotalizarValoresFilaReferenciaBancaria(this.referenciabancarias,referenciabancariaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getReferenciaBancariasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaBancariasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaBancariasFK_IdTipoBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaBancariasFK_IdTipoCuentaBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCuentaBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaBancariasFK_IdTipoProductoBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProductoBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaBancariasFK_IdTipoValoracion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoValoracion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getReferenciaBancariasFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.getReferenciaBancariasFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaBancariasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.getReferenciaBancariasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaBancariasFK_IdTipoBanco(String sFinalQuery,Long idvalorclientebanco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoBanco(sFinalQuery,this.pagination,idvalorclientebanco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaBancariasFK_IdTipoCuentaBanco(String sFinalQuery,Long idvalorclientecuentabanco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoCuentaBanco(sFinalQuery,this.pagination,idvalorclientecuentabanco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaBancariasFK_IdTipoProductoBanco(String sFinalQuery,Long idvalorclienteproductobanco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoProductoBanco(sFinalQuery,this.pagination,idvalorclienteproductobanco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaBancariasFK_IdTipoValoracion(String sFinalQuery,Long id_tipo_valoracion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLogic.getReferenciaBancariasFK_IdTipoValoracion(sFinalQuery,this.pagination,id_tipo_valoracion);
				
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
	
	public void inicializarPermisosReferenciaBancaria() {
		this.isPermisoTodoReferenciaBancaria=false;
		this.isPermisoNuevoReferenciaBancaria=false;
		this.isPermisoActualizarReferenciaBancaria=false;
		this.isPermisoActualizarOriginalReferenciaBancaria=false;
		this.isPermisoEliminarReferenciaBancaria=false;
		this.isPermisoGuardarCambiosReferenciaBancaria=false;
		this.isPermisoConsultaReferenciaBancaria=false;
		this.isPermisoBusquedaReferenciaBancaria=false;
		this.isPermisoReporteReferenciaBancaria=false;		
		this.isPermisoOrdenReferenciaBancaria=false;		
		this.isPermisoPaginacionMedioReferenciaBancaria=false;		
		this.isPermisoPaginacionAltoReferenciaBancaria=false;
		this.isPermisoPaginacionTodoReferenciaBancaria=false;
		this.isPermisoCopiarReferenciaBancaria=false;		
		this.isPermisoVerFormReferenciaBancaria=false;		
		this.isPermisoDuplicarReferenciaBancaria=false;		
		this.isPermisoOrdenReferenciaBancaria=false;		
	}
	
	public void setPermisosUsuarioReferenciaBancaria(Boolean isPermiso) {
		this.isPermisoTodoReferenciaBancaria=isPermiso;
		this.isPermisoNuevoReferenciaBancaria=isPermiso;
		this.isPermisoActualizarReferenciaBancaria=isPermiso;
		this.isPermisoActualizarOriginalReferenciaBancaria=isPermiso;
		this.isPermisoEliminarReferenciaBancaria=isPermiso;
		this.isPermisoGuardarCambiosReferenciaBancaria=isPermiso;
		this.isPermisoConsultaReferenciaBancaria=isPermiso;
		this.isPermisoBusquedaReferenciaBancaria=isPermiso;
		this.isPermisoReporteReferenciaBancaria=isPermiso;
		this.isPermisoOrdenReferenciaBancaria=isPermiso;		
		this.isPermisoPaginacionMedioReferenciaBancaria=isPermiso;		
		this.isPermisoPaginacionAltoReferenciaBancaria=isPermiso;		
		this.isPermisoPaginacionTodoReferenciaBancaria=isPermiso;		
		this.isPermisoCopiarReferenciaBancaria=isPermiso;		
		this.isPermisoVerFormReferenciaBancaria=isPermiso;		
		this.isPermisoDuplicarReferenciaBancaria=isPermiso;
		this.isPermisoOrdenReferenciaBancaria=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReferenciaBancaria(Boolean isPermiso) {
		//this.isPermisoTodoReferenciaBancaria=isPermiso;
		this.isPermisoNuevoReferenciaBancaria=isPermiso;
		this.isPermisoActualizarReferenciaBancaria=isPermiso;
		this.isPermisoActualizarOriginalReferenciaBancaria=isPermiso;
		this.isPermisoEliminarReferenciaBancaria=isPermiso;
		this.isPermisoGuardarCambiosReferenciaBancaria=isPermiso;
		//this.isPermisoConsultaReferenciaBancaria=isPermiso;
		//this.isPermisoBusquedaReferenciaBancaria=isPermiso;
		//this.isPermisoReporteReferenciaBancaria=isPermiso;
		//this.isPermisoOrdenReferenciaBancaria=isPermiso;		
		//this.isPermisoPaginacionMedioReferenciaBancaria=isPermiso;		
		//this.isPermisoPaginacionAltoReferenciaBancaria=isPermiso;		
		//this.isPermisoPaginacionTodoReferenciaBancaria=isPermiso;		
		//this.isPermisoCopiarReferenciaBancaria=isPermiso;		
		//this.isPermisoDuplicarReferenciaBancaria=isPermiso;
		//this.isPermisoOrdenReferenciaBancaria=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaBancariaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ReferenciaBancariaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebReferenciaBancaria(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaBancariaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioReferenciaBancariaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReferenciaBancariaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReferenciaBancariaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioReferenciaBancaria() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReferenciaBancariaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReferenciaBancariaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReferenciaBancaria=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReferenciaBancaria=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReferenciaBancaria=this.isPermisoActualizarReferenciaBancaria;
			this.isPermisoEliminarReferenciaBancaria=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReferenciaBancaria=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReferenciaBancaria=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReferenciaBancaria=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReferenciaBancaria=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReferenciaBancaria=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferenciaBancaria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReferenciaBancaria=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReferenciaBancaria=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReferenciaBancaria=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReferenciaBancaria=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReferenciaBancaria=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReferenciaBancaria=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferenciaBancaria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReferenciaBancaria.setToolTipText(this.jTableDatosReferenciaBancaria.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReferenciaBancaria(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReferenciaBancaria(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReferenciaBancariaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReferenciaBancariaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReferenciaBancaria() throws Exception {
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
	public void inicializarCombosForeignKeyReferenciaBancariaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.bancosForeignKey=new ArrayList();
				this.tipoprodubancosForeignKey=new ArrayList();
				this.tipocuentabancosForeignKey=new ArrayList();
				this.tipovaloracionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReferenciaBancariaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReferenciaBancariaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyReferenciaBancariaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProduBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoValoracionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProduBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprodubancosForeignKey==null||this.tipoprodubancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProduBancoConstantesFunciones.getArrayColumnasGlobalesTipoProduBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProduBancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProduBancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProduBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCuentaBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocuentabancosForeignKey==null||this.tipocuentabancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCuentaBancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCuentaBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoValoracionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoValoracionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyReferenciaBancariaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ReferenciaBancariaParameterReturnGeneral referenciabancariaReturnGeneral=new ReferenciaBancariaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.referenciabancariaConstantesFunciones.cargarid_empresaReferenciaBancaria)
					 || (this.esRecargarFks && this.referenciabancariaConstantesFunciones.cargarid_empresaReferenciaBancaria)) {

					if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+referenciabancariaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.referenciabancariaConstantesFunciones.cargaridclienteReferenciaBancaria)
					 || (this.esRecargarFks && this.referenciabancariaConstantesFunciones.cargaridclienteReferenciaBancaria)) {

					if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+referenciabancariaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalBanco="";

				if(((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0) && this.referenciabancariaConstantesFunciones.cargaridvalorclientebancoReferenciaBancaria)
					 || (this.esRecargarFks && this.referenciabancariaConstantesFunciones.cargaridvalorclientebancoReferenciaBancaria)) {

					if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

						finalQueryGlobalBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalBanco, "");
						finalQueryGlobalBanco+=BancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBanco=" WHERE " + ConstantesSql.ID + "="+referenciabancariaSessionBean.getlidBancoActual();
					}
				} else {
					finalQueryGlobalBanco="NONE";
				}


				String finalQueryGlobalTipoProduBanco="";

				if(((this.tipoprodubancosForeignKey==null||this.tipoprodubancosForeignKey.size()<=0) && this.referenciabancariaConstantesFunciones.cargaridvalorclienteproductobancoReferenciaBancaria)
					 || (this.esRecargarFks && this.referenciabancariaConstantesFunciones.cargaridvalorclienteproductobancoReferenciaBancaria)) {

					if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProduBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProduBancoConstantesFunciones.getArrayColumnasGlobalesTipoProduBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProduBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProduBancoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProduBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProduBanco, "");
						finalQueryGlobalTipoProduBanco+=TipoProduBancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProduBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProduBanco=" WHERE " + ConstantesSql.ID + "="+referenciabancariaSessionBean.getlidTipoProduBancoActual();
					}
				} else {
					finalQueryGlobalTipoProduBanco="NONE";
				}


				String finalQueryGlobalTipoCuentaBanco="";

				if(((this.tipocuentabancosForeignKey==null||this.tipocuentabancosForeignKey.size()<=0) && this.referenciabancariaConstantesFunciones.cargaridvalorclientecuentabancoReferenciaBancaria)
					 || (this.esRecargarFks && this.referenciabancariaConstantesFunciones.cargaridvalorclientecuentabancoReferenciaBancaria)) {

					if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCuentaBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCuentaBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCuentaBanco, "");
						finalQueryGlobalTipoCuentaBanco+=TipoCuentaBancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCuentaBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCuentaBanco=" WHERE " + ConstantesSql.ID + "="+referenciabancariaSessionBean.getlidTipoCuentaBancoActual();
					}
				} else {
					finalQueryGlobalTipoCuentaBanco="NONE";
				}


				String finalQueryGlobalTipoValoracion="";

				if(((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0) && this.referenciabancariaConstantesFunciones.cargarid_tipo_valoracionReferenciaBancaria)
					 || (this.esRecargarFks && this.referenciabancariaConstantesFunciones.cargarid_tipo_valoracionReferenciaBancaria)) {

					if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoValoracion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoValoracion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoValoracion, "");
						finalQueryGlobalTipoValoracion+=TipoValoracionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoValoracion=" WHERE " + ConstantesSql.ID + "="+referenciabancariaSessionBean.getlidTipoValoracionActual();
					}
				} else {
					finalQueryGlobalTipoValoracion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				referenciabancariaReturnGeneral=referenciabancariaLogic.cargarCombosLoteForeignKeyReferenciaBancaria(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalBanco,finalQueryGlobalTipoProduBanco,finalQueryGlobalTipoCuentaBanco,finalQueryGlobalTipoValoracion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=referenciabancariaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=referenciabancariaReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalBanco.equals("NONE")) {
				this.bancosForeignKey=referenciabancariaReturnGeneral.getbancosForeignKey();
			}

			if(!finalQueryGlobalTipoProduBanco.equals("NONE")) {
				this.tipoprodubancosForeignKey=referenciabancariaReturnGeneral.gettipoprodubancosForeignKey();
			}

			if(!finalQueryGlobalTipoCuentaBanco.equals("NONE")) {
				this.tipocuentabancosForeignKey=referenciabancariaReturnGeneral.gettipocuentabancosForeignKey();
			}

			if(!finalQueryGlobalTipoValoracion.equals("NONE")) {
				this.tipovaloracionsForeignKey=referenciabancariaReturnGeneral.gettipovaloracionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyReferenciaBancaria()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyBanco();
			this.addItemDefectoCombosForeignKeyTipoProduBanco();
			this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
			this.addItemDefectoCombosForeignKeyTipoValoracion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.referenciabancariaSessionBean==null) {
				this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				Banco banco=new Banco();
				BancoConstantesFunciones.setBancoDescripcion(banco,Constantes.SMENSAJE_ESCOJA_OPCION);
				banco.setId(null);

				if(!BancoConstantesFunciones.ExisteEnLista(this.bancosForeignKey,banco,true)) {

					this.bancosForeignKey.add(0,banco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProduBanco()throws Exception {
		try {

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProduBanco()) {
				TipoProduBanco tipoprodubanco=new TipoProduBanco();
				TipoProduBancoConstantesFunciones.setTipoProduBancoDescripcion(tipoprodubanco,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprodubanco.setId(null);

				if(!TipoProduBancoConstantesFunciones.ExisteEnLista(this.tipoprodubancosForeignKey,tipoprodubanco,true)) {

					this.tipoprodubancosForeignKey.add(0,tipoprodubanco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCuentaBanco()throws Exception {
		try {

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBanco()) {
				TipoCuentaBanco tipocuentabanco=new TipoCuentaBanco();
				TipoCuentaBancoConstantesFunciones.setTipoCuentaBancoDescripcion(tipocuentabanco,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocuentabanco.setId(null);

				if(!TipoCuentaBancoConstantesFunciones.ExisteEnLista(this.tipocuentabancosForeignKey,tipocuentabanco,true)) {

					this.tipocuentabancosForeignKey.add(0,tipocuentabanco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoValoracion()throws Exception {
		try {

			if(!this.referenciabancariaSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
				TipoValoracion tipovaloracion=new TipoValoracion();
				TipoValoracionConstantesFunciones.setTipoValoracionDescripcion(tipovaloracion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovaloracion.setId(null);

				if(!TipoValoracionConstantesFunciones.ExisteEnLista(this.tipovaloracionsForeignKey,tipovaloracion,true)) {

					this.tipovaloracionsForeignKey.add(0,tipovaloracion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyReferenciaBancaria()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReferenciaBancaria(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyReferenciaBancaria()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.referenciabancaria.setfecha_emision(this.parametroGeneralUsuario.getfecha_sistema());
				this.referenciabancaria.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaBancaria();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReferenciaBancaria(ReferenciaBancaria referenciabancaria)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(referenciabancaria.getidcliente(),false,"Formulario");
			this.setActualBancoForeignKey(referenciabancaria.getidvalorclientebanco(),false,"Formulario");
			this.setActualTipoProduBancoForeignKey(referenciabancaria.getidvalorclienteproductobanco(),false,"Formulario");
			this.setActualTipoCuentaBancoForeignKey(referenciabancaria.getidvalorclientecuentabanco(),false,"Formulario");
			this.setActualTipoValoracionForeignKey(referenciabancaria.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReferenciaBancaria(ReferenciaBancaria referenciabancaria,String sTipoEvento)throws Exception {	
		try {
			
			

				if(referenciabancaria.getCliente()!=null && !sTipoEvento.equals("idclienteReferenciaBancaria")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(referenciabancaria.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReferenciaBancaria()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.referenciabancariaConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualBancoForeignKey(this.referenciabancariaConstantesFunciones.getidvalorclientebanco(),false,"Formulario");
			this.setActualTipoProduBancoForeignKey(this.referenciabancariaConstantesFunciones.getidvalorclienteproductobanco(),false,"Formulario");
			this.setActualTipoCuentaBancoForeignKey(this.referenciabancariaConstantesFunciones.getidvalorclientecuentabanco(),false,"Formulario");
			this.setActualTipoValoracionForeignKey(this.referenciabancariaConstantesFunciones.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaBancaria()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReferenciaBancaria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReferenciaBancaria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReferenciaBancaria()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReferenciaBancaria()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameBancosForeignKey("Todos");
			this.cargarCombosFrameTipoProduBancosForeignKey("Todos");
			this.cargarCombosFrameTipoCuentaBancosForeignKey("Todos");
			this.cargarCombosFrameTipoValoracionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReferenciaBancaria(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProduBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCuentaBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReferenciaBancaria()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public ReferenciaBancariaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReferenciaBancariaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReferenciaBancariaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean(); 
		this.referenciabancariaConstantesFunciones=new ReferenciaBancariaConstantesFunciones(); 
		this.referenciabancariaBean=new ReferenciaBancaria();//(this.referenciabancariaConstantesFunciones); 		
		this.referenciabancariaReturnGeneral=new ReferenciaBancariaParameterReturnGeneral(); 
		
		this.referenciabancariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReferenciaBancariaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReferenciaBancariaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReferenciaBancariaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReferenciaBancaria(true);
			
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
			
			this.referenciabancariaConstantesFunciones=new ReferenciaBancariaConstantesFunciones(); 
			this.referenciabancariaBean=new ReferenciaBancaria();//this.referenciabancariaConstantesFunciones); 			
			this.referenciabancariaReturnGeneral=new ReferenciaBancariaParameterReturnGeneral(); 
		
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Bancaria Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.referenciabancaria=new ReferenciaBancaria();
			this.referenciabancarias = new ArrayList<ReferenciaBancaria>();
			this.referenciabancariasAux = new ArrayList<ReferenciaBancaria>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic=new ReferenciaBancariaLogic();
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			//this.referenciabancariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.referenciabancariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReferenciaBancaria);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferenciaBancaria);	
					}
					
					if(this.jInternalFrameImportacionReferenciaBancaria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferenciaBancaria);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReferenciaBancaria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReferenciaBancaria);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReferenciaBancaria);
				this.jInternalFrameDetalleFormReferenciaBancaria.setVisible(false);
				this.jInternalFrameDetalleFormReferenciaBancaria.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferenciaBancaria);
					this.jInternalFrameReporteDinamicoReferenciaBancaria.setVisible(false);
					this.jInternalFrameReporteDinamicoReferenciaBancaria.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReferenciaBancaria!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReferenciaBancaria);
					this.jInternalFrameImportacionReferenciaBancaria.setVisible(false);
					this.jInternalFrameImportacionReferenciaBancaria.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReferenciaBancaria!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReferenciaBancaria);
					this.jInternalFrameOrderByReferenciaBancaria.setVisible(false);
					this.jInternalFrameOrderByReferenciaBancaria.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReferenciaBancariaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReferenciaBancariaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.referenciabancariaReturnGeneral=new ReferenciaBancariaParameterReturnGeneral();
			
			this.referenciabancariaParameterGeneral=new ReferenciaBancariaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.referenciabancariaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReferenciaBancariaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaBancariaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),this.referenciabancariaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaBancariaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),this.referenciabancariaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaDuplicarReferenciaBancaria=true;
			this.isVisibilidadCeldaCopiarReferenciaBancaria=true;
			this.isVisibilidadCeldaVerFormReferenciaBancaria=true;
			this.isVisibilidadCeldaOrdenReferenciaBancaria=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
			this.isVisibilidadCeldaModificarReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=false;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoBanco=true;
			this.isVisibilidadFK_IdTipoCuentaBanco=true;
			this.isVisibilidadFK_IdTipoProductoBanco=true;
			this.isVisibilidadFK_IdTipoValoracion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReferenciaBancaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReferenciaBancaria();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReferenciaBancaria(false);
			
			this.setPermisosUsuarioReferenciaBancaria();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado() 
				|| (this.referenciabancariaSessionBean.getEsGuardarRelacionado() && this.referenciabancariaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReferenciaBancariaClasesRelacionadas();
			}
			
			if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReferenciaBancariaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReferenciaBancaria();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReferenciaBancaria();
			}
			
			if(!this.isPermisoBusquedaReferenciaBancaria) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioReferenciaBancaria,this.isPermisoPaginacionMedioReferenciaBancaria,this.isPermisoPaginacionTodoReferenciaBancaria);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReferenciaBancariaConstantesFunciones.getTiposSeleccionarReferenciaBancaria());
				
				this.tiposColumnasSelect=ReferenciaBancariaConstantesFunciones.getTiposSeleccionarReferenciaBancaria(true);
				
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
			//if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReferenciaBancaria();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioReferenciaBancaria(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioReferenciaBancaria(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaBancaria() ;
			
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
			this.bancoLogic=new BancoLogic();
			this.tipoprodubancoLogic=new TipoProduBancoLogic();
			this.tipocuentabancoLogic=new TipoCuentaBancoLogic();
			this.tipovaloracionLogic=new TipoValoracionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				referenciabancariaImplementable= (ReferenciaBancariaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaBancariaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				referenciabancariaImplementableHome= (ReferenciaBancariaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaBancariaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.referenciabancarias= new ArrayList<ReferenciaBancaria>();
			this.referenciabancariasEliminados= new ArrayList<ReferenciaBancaria>();
						
			this.isEsNuevoReferenciaBancaria=false;
			this.esParaAccionDesdeFormularioReferenciaBancaria=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.bancosForeignKey=new ArrayList<Banco>() ;
			this.tipoprodubancosForeignKey=new ArrayList<TipoProduBanco>() ;
			this.tipocuentabancosForeignKey=new ArrayList<TipoCuentaBanco>() ;
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReferenciaBancaria(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReferenciaBancaria();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReferenciaBancariaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReferenciaBancaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReferenciaBancaria(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReferenciaBancaria();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReferenciaBancaria();
			}
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasReferenciaBancaria.getTabCount(); i++) {
					this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReferenciaBancaria(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ReferenciaBancaria: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReferenciaBancaria() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReferenciaBancaria")) {
				iIndex=this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReferenciaBancaria();	
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
	
	public void cargarCombosForeignKeyReferenciaBancaria(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReferenciaBancaria(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReferenciaBancaria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReferenciaBancariaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReferenciaBancaria();
		
		this.cargarCombosFrameForeignKeyReferenciaBancaria();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReferenciaBancaria();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReferenciaBancaria();
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

	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBanco(this.bancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProduBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProduBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProduBanco();
				this.cargarCombosFrameTipoProduBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProduBanco(this.tipoprodubancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCuentaBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
				this.cargarCombosFrameTipoCuentaBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCuentaBanco(this.tipocuentabancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoValoracion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoValoracionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoValoracion(this.tipovaloracionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoReferenciaBancariaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			
			if(jTableDatosReferenciaBancaria.getRowCount()>=1) {
				jTableDatosReferenciaBancaria.removeRowSelectionInterval(0, jTableDatosReferenciaBancaria.getRowCount()-1);						
			}
			
			this.isEsNuevoReferenciaBancaria=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReferenciaBancaria(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReferenciaBancaria(true);			
			//this.referenciabancaria=new ReferenciaBancaria();
			//this.referenciabancaria.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaBancaria(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaBancaria() ;
			
			if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaBancaria(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.referenciabancaria);	
			this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);				
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ReferenciaBancaria: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReferenciaBancariaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReferenciaBancaria.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReferenciaBancaria.getSelectedRows().length;			
			}
			
			referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReferenciaBancaria--;			
				//ReferenciaBancaria referenciabancariaAux= new ReferenciaBancaria();			
				//referenciabancariaAux.setId(this.iIdNuevoReferenciaBancaria);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ReferenciaBancaria referenciabancariaOrigen=new ReferenciaBancaria();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ReferenciaBancaria referenciabancariaOrigen : referenciabancariasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							referenciabancariaOrigen =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciabancariaOrigen =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReferenciaBancaria();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.referenciabancaria.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReferenciaBancaria(referenciabancariaOrigen,this.referenciabancaria,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciabancariaLogic.getReferenciaBancarias().add(this.referenciabancariaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referenciabancarias.add(this.referenciabancariaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
				
				this.jTableDatosReferenciaBancaria.setRowSelectionInterval(this.getIndiceNuevoReferenciaBancaria(), this.getIndiceNuevoReferenciaBancaria());
				
				int iLastRow =  this.jTableDatosReferenciaBancaria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferenciaBancaria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferenciaBancaria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaBancaria(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();									
		
			ReferenciaBancaria referenciabancariaOrigen=new ReferenciaBancaria();
			ReferenciaBancaria referenciabancariaDestino=new ReferenciaBancaria();
				
			referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReferenciaBancaria.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || referenciabancariasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReferenciaBancaria.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaOrigen =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciabancariaOrigen =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciabancariaDestino =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciabancariaDestino =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				referenciabancariaOrigen =referenciabancariasSeleccionados.get(0);
				referenciabancariaDestino =referenciabancariasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReferenciaBancaria(referenciabancariaOrigen,referenciabancariaDestino,true,false);
				
				referenciabancariaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciabancariaDestino,referenciabancariaLogic.getReferenciaBancarias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciabancariaDestino,referenciabancarias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
				
				//this.jTableDatosReferenciaBancaria.setRowSelectionInterval(this.getIndiceNuevoReferenciaBancaria(), this.getIndiceNuevoReferenciaBancaria());
				
				int iLastRow =  this.jTableDatosReferenciaBancaria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferenciaBancaria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferenciaBancaria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaBancaria(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReferenciaBancaria.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReferenciaBancaria.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesReferenciaBancaria.setVisible(!isVisible);
			this.jPanelPaginacionReferenciaBancaria.setVisible(!isVisible);
			this.jPanelAccionesReferenciaBancaria.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReferenciaBancaria();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReferenciaBancaria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReferenciaBancaria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReferenciaBancaria();
			
			this.abrirFrameOrderByReferenciaBancaria();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReferenciaBancaria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReferenciaBancaria(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferenciaBancaria);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReferenciaBancaria.isMaximum()) {
					this.jInternalFrameDetalleFormReferenciaBancaria.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReferenciaBancaria.setSize(this.jInternalFrameDetalleFormReferenciaBancaria.iWidthFormulario,this.jInternalFrameDetalleFormReferenciaBancaria.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReferenciaBancaria.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReferenciaBancaria.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReferenciaBancaria.isMaximum()) {
						this.jInternalFrameDetalleFormReferenciaBancaria.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReferenciaBancaria.jContentPaneDetalleReferenciaBancaria.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReferenciaBancaria.jContentPaneDetalleReferenciaBancaria.getWidth(),ReferenciaBancariaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReferenciaBancaria.jContentPaneDetalleReferenciaBancaria.getWidth(),ReferenciaBancariaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReferenciaBancaria.jContentPaneDetalleReferenciaBancaria.getWidth(),ReferenciaBancariaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReferenciaBancaria.setVisible(true);
	        this.jInternalFrameDetalleFormReferenciaBancaria.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReferenciaBancaria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReferenciaBancaria==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReferenciaBancaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaBancaria,false,this);
				} else {
					this.jInternalFrameOrderByReferenciaBancaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaBancaria,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReferenciaBancaria);
				this.jInternalFrameOrderByReferenciaBancaria.setVisible(false);
				this.jInternalFrameOrderByReferenciaBancaria.setSelected(false);
				
				this.jInternalFrameOrderByReferenciaBancaria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferenciaBancaria"));
				
				this.inicializarActualizarBindingTablaOrderByReferenciaBancaria();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReferenciaBancaria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReferenciaBancaria==null) {
				
				this.jInternalFrameImportacionReferenciaBancaria=new ImportacionJInternalFrame(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferenciaBancaria);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReferenciaBancaria);
				this.jInternalFrameImportacionReferenciaBancaria.setVisible(false);
				this.jInternalFrameImportacionReferenciaBancaria.setSelected(false);


				this.jInternalFrameImportacionReferenciaBancaria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferenciaBancaria"));
				this.jInternalFrameImportacionReferenciaBancaria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferenciaBancaria"));
				this.jInternalFrameImportacionReferenciaBancaria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferenciaBancaria"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReferenciaBancaria() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReferenciaBancaria==null) {
				this.jInternalFrameReporteDinamicoReferenciaBancaria=new ReporteDinamicoJInternalFrame(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferenciaBancaria);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferenciaBancaria);
				this.jInternalFrameReporteDinamicoReferenciaBancaria.setVisible(false);
				this.jInternalFrameReporteDinamicoReferenciaBancaria.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaBancaria"));
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaBancaria"));
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaBancaria"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaBancaria();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleReferenciaBancaria() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferenciaBancaria);
			
	       	this.jInternalFrameDetalleFormReferenciaBancaria.setVisible(false);
	        this.jInternalFrameDetalleFormReferenciaBancaria.setSelected(false);
			
			//this.jInternalFrameDetalleFormReferenciaBancaria.dispose();
			//this.jInternalFrameDetalleFormReferenciaBancaria=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReferenciaBancaria() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReferenciaBancaria.setVisible(true);
	        this.jInternalFrameReporteDinamicoReferenciaBancaria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReferenciaBancaria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReferenciaBancaria.setVisible(true);
	        this.jInternalFrameImportacionReferenciaBancaria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReferenciaBancaria() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReferenciaBancaria.setVisible(true);
	        this.jInternalFrameOrderByReferenciaBancaria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReferenciaBancaria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReferenciaBancaria.setVisible(false);
	        this.jInternalFrameOrderByReferenciaBancaria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReferenciaBancaria() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReferenciaBancaria.setVisible(false);
	        this.jInternalFrameReporteDinamicoReferenciaBancaria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReferenciaBancaria() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReferenciaBancaria.setVisible(false);
	        this.jInternalFrameImportacionReferenciaBancaria.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReferenciaBancaria(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReferenciaBancaria(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReferenciaBancaria(true);
			//this.isEsNuevoReferenciaBancaria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReferenciaBancaria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaBancaria(false) ;
			
			if(referenciabancariaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaBancaria(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaBancaria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReferenciaBancariaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReferenciaBancaria(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReferenciaBancaria(true);
			//this.isEsNuevoReferenciaBancaria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.referenciabancaria.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReferenciaBancaria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReferenciaBancaria(false) ;
			
			if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaBancaria(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaBancaria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.referenciabancariaConstantesFunciones.cargaridclienteReferenciaBancaria) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingReferenciaBancaria(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProduBanco(List<TipoProduBanco> tipoprodubancosForeignKey)throws Exception{
		TableColumn tableColumnTipoProduBanco=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO));
		TableCellEditor tableCellEditorTipoProduBanco =tableColumnTipoProduBanco.getCellEditor();

		TipoProduBancoTableCell tipoprodubancoTableCellFk=(TipoProduBancoTableCell)tableCellEditorTipoProduBanco;

		if(tipoprodubancoTableCellFk!=null) {
			tipoprodubancoTableCellFk.settipoprodubancosForeignKey(tipoprodubancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprodubancoTableCellFk.setRowActual(intSelectedRow);
			//tipoprodubancoTableCellFk.settipoprodubancosForeignKeyActual(tipoprodubancosForeignKey);
		//}


		if(tipoprodubancoTableCellFk!=null) {
			tipoprodubancoTableCellFk.RecargarTipoProduBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCuentaBanco(List<TipoCuentaBanco> tipocuentabancosForeignKey)throws Exception{
		TableColumn tableColumnTipoCuentaBanco=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO));
		TableCellEditor tableCellEditorTipoCuentaBanco =tableColumnTipoCuentaBanco.getCellEditor();

		TipoCuentaBancoTableCell tipocuentabancoTableCellFk=(TipoCuentaBancoTableCell)tableCellEditorTipoCuentaBanco;

		if(tipocuentabancoTableCellFk!=null) {
			tipocuentabancoTableCellFk.settipocuentabancosForeignKey(tipocuentabancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocuentabancoTableCellFk.setRowActual(intSelectedRow);
			//tipocuentabancoTableCellFk.settipocuentabancosForeignKeyActual(tipocuentabancosForeignKey);
		//}


		if(tipocuentabancoTableCellFk!=null) {
			tipocuentabancoTableCellFk.RecargarTipoCuentaBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoValoracion(List<TipoValoracion> tipovaloracionsForeignKey)throws Exception{
		TableColumn tableColumnTipoValoracion=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION));
		TableCellEditor tableCellEditorTipoValoracion =tableColumnTipoValoracion.getCellEditor();

		TipoValoracionTableCell tipovaloracionTableCellFk=(TipoValoracionTableCell)tableCellEditorTipoValoracion;

		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.settipovaloracionsForeignKey(tipovaloracionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovaloracionTableCellFk.setRowActual(intSelectedRow);
			//tipovaloracionTableCellFk.settipovaloracionsForeignKeyActual(tipovaloracionsForeignKey);
		//}


		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.RecargarTipoValoracionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReferenciaBancaria(false);
			
			//if(!this.isEsNuevoReferenciaBancaria) {								
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				
			}
			
			if(this.permiteMantenimiento(this.referenciabancaria)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReferenciaBancaria=true;
					this.inicializarActualizarBindingTablaReferenciaBancaria(false);
					this.isEsNuevoReferenciaBancaria=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReferenciaBancaria=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReferenciaBancaria=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferenciaBancaria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaBancaria(false);
				
				this.habilitarDeshabilitarControlesReferenciaBancaria(false);
			
												
				
				if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReferenciaBancaria();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReferenciaBancariaActionPerformed(evt,referenciabancariaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReferenciaBancaria(this.referenciabancaria,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,referenciabancariaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.referenciabancaria.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				this.referenciabancaria.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				this.referenciabancaria.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.referenciabancaria)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReferenciaBancariaModel) this.jTableDatosReferenciaBancaria.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReferenciaBancaria=true;
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
				this.isEsNuevoReferenciaBancaria=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferenciaBancaria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaBancaria(false);
				
				this.habilitarDeshabilitarControlesReferenciaBancaria(false);
				
				
				
				if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReferenciaBancaria();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReferenciaBancaria.getRowCount()>=1) {
				jTableDatosReferenciaBancaria.removeRowSelectionInterval(0, jTableDatosReferenciaBancaria.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReferenciaBancaria(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaBancaria(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaBancaria(false) ;
			
			this.isEsNuevoReferenciaBancaria=false;
			
			if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReferenciaBancaria();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReferenciaBancaria(false);
				
				//SI ES MANUAL
				if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReferenciaBancaria();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReferenciaBancaria--;			
			//ReferenciaBancaria referenciabancariaAux= new ReferenciaBancaria();			
			//referenciabancariaAux.setId(this.iIdNuevoReferenciaBancaria);
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReferenciaBancaria();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
			
			this.referenciabancaria.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.referenciabancariaLogic.getReferenciaBancarias().add(this.referenciabancariaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.referenciabancarias.add(this.referenciabancariaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			
			this.jTableDatosReferenciaBancaria.setRowSelectionInterval(this.getIndiceNuevoReferenciaBancaria(), this.getIndiceNuevoReferenciaBancaria());
			
			int iLastRow =  this.jTableDatosReferenciaBancaria.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReferenciaBancaria.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReferenciaBancaria.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReferenciaBancaria(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaBancaria(false);
			
			//SI ES MANUAL
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaBancaria();
			}
			
			//this.abrirFrameTreeReferenciaBancaria();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Referencia BancariaS ?", "MANTENIMIENTO DE Referencia Bancaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionReferenciaBancaria.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralReferenciaBancaria();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.referenciabancariaReturnGeneral=referenciabancariaLogic.procesarImportacionReferenciaBancariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.referenciabancariaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarReferenciaBancariaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReferenciaBancaria.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReferenciaBancaria.setFileImportacion(this.jInternalFrameImportacionReferenciaBancaria.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReferenciaBancaria.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReferenciaBancaria.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReferenciaBancaria.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReferenciaBancaria.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		

		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReferenciaBancariaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReferenciaBancariaBaseDesign.jrxml";
			
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
			
			this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProduBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProduBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProduBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProduBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuentaTarjeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuentaTarjeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuentaTarjeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuentaTarjeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_CUPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eneCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eneCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eneCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eneCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCreditos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCreditos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCreditos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCreditos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eneProtestos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eneProtestos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eneProtestos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eneProtestos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroProtestos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroProtestos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroProtestos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroProtestos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldosPromedios_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldosPromedios_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldosPromedios_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldosPromedios_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_opietarioCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_opietarioCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_opietarioCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_opietarioCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoValoracion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoValoracion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoValoracion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoValoracion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="idvalorclientebanco";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO:
					sNombreCampoCategoria="idvalorclienteproductobanco";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					sNombreCampoCategoria="idvalorclientecuentabanco";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA:
					sNombreCampoCategoria="numero_cuenta_tarjeta";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_CUPO:
					sNombreCampoCategoria="cupo";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO:
					sNombreCampoCategoria="tiene_credito";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS:
					sNombreCampoCategoria="numero_creditos";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS:
					sNombreCampoCategoria="tiene_protestos";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS:
					sNombreCampoCategoria="numero_protestos";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS:
					sNombreCampoCategoria="saldos_promedios";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA:
					sNombreCampoCategoria="propietario_cuenta";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoria="id_tipo_valoracion";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="idvalorclientebanco";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO:
					sNombreCampoCategoriaValor="idvalorclienteproductobanco";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					sNombreCampoCategoriaValor="idvalorclientecuentabanco";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA:
					sNombreCampoCategoriaValor="numero_cuenta_tarjeta";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_CUPO:
					sNombreCampoCategoriaValor="cupo";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO:
					sNombreCampoCategoriaValor="tiene_credito";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS:
					sNombreCampoCategoriaValor="numero_creditos";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS:
					sNombreCampoCategoriaValor="tiene_protestos";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS:
					sNombreCampoCategoriaValor="numero_protestos";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS:
					sNombreCampoCategoriaValor="saldos_promedios";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA:
					sNombreCampoCategoriaValor="propietario_cuenta";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoriaValor="id_tipo_valoracion";
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idempresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientebanco");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Produ Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclienteproductobanco");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientecuentabanco");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta/tarjeta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta_tarjeta");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_CUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cupo");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tiene Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tiene_credito");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Creditos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_creditos");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tiene Protestos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tiene_protestos");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Protestos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_protestos");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldos Promedios",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldos_promedios");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Propietario Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"propietario_cuenta");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Valoracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_valoracion");
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ReferenciaBancarias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.gettipoprodubanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.gettipocuentabanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getnumero_cuenta_tarjeta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_CUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_CUPO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getcupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.gettiene_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getnumero_creditos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.gettiene_protestos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getnumero_protestos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getsaldos_promedios());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getpropietario_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.gettipovaloracion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(ReferenciaBancaria referenciabancaria:referenciabancariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciabancaria.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelReferenciaBancaria(row);				
			//	iRow++;
			//}				
			
			//for(ReferenciaBancaria referenciabancariaAux:referenciabancariasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReferenciaBancaria(referenciabancariaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
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
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaBancaria(false);
			
			//SI ES MANUAL
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaBancaria();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaBancaria(false);
			
			//SI ES MANUAL
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferenciaBancaria();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaBancaria(false);
			
			//SI ES MANUAL
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferenciaBancaria();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReferenciaBancaria() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReferenciaBancaria.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReferenciaBancaria.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReferenciaBancaria.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReferenciaBancaria.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReferenciaBancaria.setMinimumSize(dimensionMinimum);
		this.jTableDatosReferenciaBancaria.setMaximumSize(dimensionMaximum);
		this.jTableDatosReferenciaBancaria.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReferenciaBancaria(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReferenciaBancaria(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReferenciaBancaria(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReferenciaBancaria(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReferenciaBancaria(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReferenciaBancaria(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaBancaria(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReferenciaBancaria(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReferenciaBancaria() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReferenciaBancaria();
		
		this.inicializarActualizarBindingBotonesManualReferenciaBancaria(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReferenciaBancaria();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaBancaria() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaBancaria(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaBancaria(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReferenciaBancaria.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReferenciaBancaria.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReferenciaBancaria.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxPostAccionNuevoReferenciaBancaria.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxPostAccionSinCerrarReferenciaBancaria.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxPostAccionSinMensajeReferenciaBancaria.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReferenciaBancaria.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReferenciaBancaria.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReferenciaBancaria.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxPostAccionNuevoReferenciaBancaria.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxPostAccionSinCerrarReferenciaBancaria.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxPostAccionSinMensajeReferenciaBancaria.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReferenciaBancaria.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReferenciaBancaria.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReferenciaBancaria.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReferenciaBancaria.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReferenciaBancaria.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReferenciaBancaria.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReferenciaBancaria.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReferenciaBancaria.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReferenciaBancaria.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReferenciaBancaria(Boolean esInicializar) throws Exception {
		try	{	
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaBancaria(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaBancaria() throws Exception {
		try	{
			if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReferenciaBancaria();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferenciaBancaria() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReferenciaBancaria() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReferenciaBancaria.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReferenciaBancaria.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReferenciaBancaria.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReferenciaBancaria.addItem(reporte);
			}
			
			
			if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReferenciaBancaria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReferenciaBancaria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReferenciaBancaria.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReferenciaBancaria.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReferenciaBancaria.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReferenciaBancaria.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReferenciaBancaria.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaBancaria();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaBancaria() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
				
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ReferenciaBancariaConstantesFunciones.getTiposSeleccionarReferenciaBancaria(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ReferenciaBancariaConstantesFunciones.getTiposSeleccionarReferenciaBancaria(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ReferenciaBancariaConstantesFunciones.getTiposSeleccionarReferenciaBancaria(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoReferenciaBancaria.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReferenciaBancaria()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidclienteFK_IdClienteReferenciaBancaria.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteReferenciaBancaria.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.getSelectedItem()!=null){this.idvalorclientebancoFK_IdTipoBanco=((Banco)this.jComboBoxidvalorclientebancoFK_IdTipoBancoReferenciaBancaria.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.getSelectedItem()!=null){this.idvalorclientecuentabancoFK_IdTipoCuentaBanco=((TipoCuentaBanco)this.jComboBoxidvalorclientecuentabancoFK_IdTipoCuentaBancoReferenciaBancaria.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.getSelectedItem()!=null){this.idvalorclienteproductobancoFK_IdTipoProductoBanco=((TipoProduBanco)this.jComboBoxidvalorclienteproductobancoFK_IdTipoProductoBancoReferenciaBancaria.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.getSelectedItem()!=null){this.id_tipo_valoracionFK_IdTipoValoracion=((TipoValoracion)this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaBancaria.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReferenciaBancaria(Boolean esInicializar) throws Exception {				
		if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReferenciaBancaria();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReferenciaBancaria() throws Exception {
		this.inicializarActualizarBindingTablaReferenciaBancaria(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReferenciaBancaria() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReferenciaBancariaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancariaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReferenciaBancaria(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=referenciabancariaLogic.getReferenciaBancarias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=referenciabancarias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReferenciaBancaria.setModel(new ReferenciaBancariaModel(this.referenciabancariaLogic.getReferenciaBancarias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReferenciaBancaria.setModel(new ReferenciaBancariaModel(this.referenciabancarias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReferenciaBancaria!=null && this.jInternalFrameOrderByReferenciaBancaria.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReferenciaBancaria();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO,referenciabancariaConstantesFunciones.resaltarSeleccionarReferenciaBancaria,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO,referenciabancariaConstantesFunciones.resaltarSeleccionarReferenciaBancaria,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_ID));

		if(this.referenciabancariaConstantesFunciones.mostraridReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciabancariaConstantesFunciones.resaltaridReferenciaBancaria,this.referenciabancariaConstantesFunciones.activaridReferenciaBancaria,iSizeTabla,this,true,"idReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltaridReferenciaBancaria,this.referenciabancariaConstantesFunciones.activaridReferenciaBancaria,this,true,"idReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.referenciabancariaConstantesFunciones.mostrarid_empresaReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.referenciabancariaConstantesFunciones.resaltarid_empresaReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activarid_empresaReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.referenciabancariaConstantesFunciones.resaltarid_empresaReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activarid_empresaReferenciaBancaria,false,"id_empresaReferenciaBancaria","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.referenciabancariaConstantesFunciones.mostraridclienteReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.referenciabancariaConstantesFunciones.resaltaridclienteReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridclienteReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.referenciabancariaConstantesFunciones.resaltaridclienteReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridclienteReferenciaBancaria,true,"idclienteReferenciaBancaria","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO));

		if(this.referenciabancariaConstantesFunciones.mostraridvalorclientebancoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.referenciabancariaConstantesFunciones.resaltaridvalorclientebancoReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridvalorclientebancoReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.referenciabancariaConstantesFunciones.resaltaridvalorclientebancoReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridvalorclientebancoReferenciaBancaria,true,"idvalorclientebancoReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO));

		if(this.referenciabancariaConstantesFunciones.mostraridvalorclienteproductobancoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProduBancoTableCell(this.tipoprodubancosForeignKey,this.referenciabancariaConstantesFunciones.resaltaridvalorclienteproductobancoReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridvalorclienteproductobancoReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new TipoProduBancoTableCell(this.tipoprodubancosForeignKey,this.referenciabancariaConstantesFunciones.resaltaridvalorclienteproductobancoReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridvalorclienteproductobancoReferenciaBancaria,true,"idvalorclienteproductobancoReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO));

		if(this.referenciabancariaConstantesFunciones.mostraridvalorclientecuentabancoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCuentaBancoTableCell(this.tipocuentabancosForeignKey,this.referenciabancariaConstantesFunciones.resaltaridvalorclientecuentabancoReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridvalorclientecuentabancoReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new TipoCuentaBancoTableCell(this.tipocuentabancosForeignKey,this.referenciabancariaConstantesFunciones.resaltaridvalorclientecuentabancoReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activaridvalorclientecuentabancoReferenciaBancaria,true,"idvalorclientecuentabancoReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA));

		if(this.referenciabancariaConstantesFunciones.mostrarnumero_cuenta_tarjetaReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciabancariaConstantesFunciones.resaltarnumero_cuenta_tarjetaReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarnumero_cuenta_tarjetaReferenciaBancaria,iSizeTabla,this,true,"numero_cuenta_tarjetaReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarnumero_cuenta_tarjetaReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarnumero_cuenta_tarjetaReferenciaBancaria,this,true,"numero_cuenta_tarjetaReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION));

		if(this.referenciabancariaConstantesFunciones.mostrarfecha_emisionReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.referenciabancariaConstantesFunciones.resaltarfecha_emisionReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarfecha_emisionReferenciaBancaria,iSizeTabla,this,true,"fecha_emisionReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarfecha_emisionReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarfecha_emisionReferenciaBancaria,this,true,"fecha_emisionReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.referenciabancariaConstantesFunciones.mostrarfecha_vencimientoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.referenciabancariaConstantesFunciones.resaltarfecha_vencimientoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarfecha_vencimientoReferenciaBancaria,iSizeTabla,this,true,"fecha_vencimientoReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarfecha_vencimientoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarfecha_vencimientoReferenciaBancaria,this,true,"fecha_vencimientoReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_CUPO));

		if(this.referenciabancariaConstantesFunciones.mostrarcupoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_CUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciabancariaConstantesFunciones.resaltarcupoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarcupoReferenciaBancaria,iSizeTabla,this,true,"cupoReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarcupoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarcupoReferenciaBancaria,this,true,"cupoReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO));

		if(this.referenciabancariaConstantesFunciones.mostrartiene_creditoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.referenciabancariaConstantesFunciones.resaltartiene_creditoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activartiene_creditoReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.referenciabancariaConstantesFunciones.resaltartiene_creditoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activartiene_creditoReferenciaBancaria,this,true,"tiene_creditoReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS));

		if(this.referenciabancariaConstantesFunciones.mostrarnumero_creditosReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciabancariaConstantesFunciones.resaltarnumero_creditosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarnumero_creditosReferenciaBancaria,iSizeTabla,this,true,"numero_creditosReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarnumero_creditosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarnumero_creditosReferenciaBancaria,this,true,"numero_creditosReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS));

		if(this.referenciabancariaConstantesFunciones.mostrartiene_protestosReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.referenciabancariaConstantesFunciones.resaltartiene_protestosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activartiene_protestosReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.referenciabancariaConstantesFunciones.resaltartiene_protestosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activartiene_protestosReferenciaBancaria,this,true,"tiene_protestosReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS));

		if(this.referenciabancariaConstantesFunciones.mostrarnumero_protestosReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciabancariaConstantesFunciones.resaltarnumero_protestosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarnumero_protestosReferenciaBancaria,iSizeTabla,this,true,"numero_protestosReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarnumero_protestosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarnumero_protestosReferenciaBancaria,this,true,"numero_protestosReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS));

		if(this.referenciabancariaConstantesFunciones.mostrarsaldos_promediosReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciabancariaConstantesFunciones.resaltarsaldos_promediosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarsaldos_promediosReferenciaBancaria,iSizeTabla,this,true,"saldos_promediosReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarsaldos_promediosReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarsaldos_promediosReferenciaBancaria,this,true,"saldos_promediosReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA));

		if(this.referenciabancariaConstantesFunciones.mostrarpropietario_cuentaReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciabancariaConstantesFunciones.resaltarpropietario_cuentaReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarpropietario_cuentaReferenciaBancaria,iSizeTabla,this,true,"propietario_cuentaReferenciaBancaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciabancariaConstantesFunciones.resaltarpropietario_cuentaReferenciaBancaria,this.referenciabancariaConstantesFunciones.activarpropietario_cuentaReferenciaBancaria,this,true,"propietario_cuentaReferenciaBancaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION));

		if(this.referenciabancariaConstantesFunciones.mostrarid_tipo_valoracionReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.referenciabancariaConstantesFunciones.resaltarid_tipo_valoracionReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activarid_tipo_valoracionReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.referenciabancariaConstantesFunciones.resaltarid_tipo_valoracionReferenciaBancaria,this,this.referenciabancariaConstantesFunciones.activarid_tipo_valoracionReferenciaBancaria,true,"id_tipo_valoracionReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO));

		if(this.referenciabancariaConstantesFunciones.mostraresactivoReferenciaBancaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.referenciabancariaConstantesFunciones.resaltaresactivoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activaresactivoReferenciaBancaria,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.referenciabancariaConstantesFunciones.resaltaresactivoReferenciaBancaria,this.referenciabancariaConstantesFunciones.activaresactivoReferenciaBancaria,this,true,"esactivoReferenciaBancaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaBancariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferenciaBancaria.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferenciaBancaria.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.referenciabancariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReferenciaBancaria.addColumn(tableColumn);
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
			
			this.jTableDatosReferenciaBancaria.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReferenciaBancaria.moveColumn(this.jTableDatosReferenciaBancaria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReferenciaBancaria.moveColumn(this.jTableDatosReferenciaBancaria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReferenciaBancaria.moveColumn(this.jTableDatosReferenciaBancaria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReferenciaBancaria.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReferenciaBancaria.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReferenciaBancaria,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReferenciaBancaria.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReferenciaBancaria.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReferenciaBancaria.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReferenciaBancaria.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=referenciabancariaLogic.getReferenciaBancarias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=referenciabancarias.size()-1;
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
		//this.jTableDatosReferenciaBancaria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReferenciaBancaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReferenciaBancaria();
			
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
				
				//this.isEsNuevoReferenciaBancaria=false;
					
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
				if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReferenciaBancaria==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferenciaBancaria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.referenciabancaria.getsType().equals("DUPLICADO")
				   || this.referenciabancaria.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReferenciaBancaria=true;
				
				} else {
					this.isEsNuevoReferenciaBancaria=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
					if(this.referenciabancaria.getId()>=0 && !this.referenciabancaria.getIsNew()) {						
						this.isEsNuevoReferenciaBancaria=false;
						
					} else {
						this.isEsNuevoReferenciaBancaria=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReferenciaBancaria(esRelaciones);						
				
				this.seleccionarReferenciaBancaria(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.referenciabancaria.getId()<0) {
					this.isEsNuevoReferenciaBancaria=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReferenciaBancaria(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReferenciaBancaria(evt,rowIndex);
				}	
				
				if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ReferenciaBancaria: " + this.dDif); 
					}
				}								
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReferenciaBancaria(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.referenciabancaria)) {
					if(this.referenciabancaria.getId()>0) {
						this.referenciabancaria.setIsDeleted(true);
						
						this.referenciabancariasEliminados.add(this.referenciabancaria);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciabancariaLogic.getReferenciaBancarias().remove(this.referenciabancaria);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referenciabancarias.remove(this.referenciabancaria);				
					}
					
					
					((ReferenciaBancariaModel) this.jTableDatosReferenciaBancaria.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaBancaria(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReferenciaBancaria(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReferenciaBancaria) {
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferenciaBancaria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferenciaBancaria.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReferenciaBancaria(this.referenciabancaria);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.referenciabancariaConstantesFunciones.cargarid_empresaReferenciaBancaria || this.referenciabancariaConstantesFunciones.event_dependid_empresaReferenciaBancaria) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.referenciabancaria.getid_empresa());
									//this.inicializarActualizarBindingReferenciaBancaria(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(referenciabancaria.getEmpresa()!=null) {
							this.empresasForeignKey.add(referenciabancaria.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.referenciabancaria.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.referenciabancariaConstantesFunciones.cargaridclienteReferenciaBancaria || this.referenciabancariaConstantesFunciones.event_dependidclienteReferenciaBancaria) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.referenciabancaria.getidcliente());
									//this.inicializarActualizarBindingReferenciaBancaria(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(referenciabancaria.getCliente()!=null) {
							this.clientesForeignKey.add(referenciabancaria.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.referenciabancaria.getidcliente(),false,"Formulario");

					//Banco
					if(!this.referenciabancariaConstantesFunciones.cargaridvalorclientebancoReferenciaBancaria || this.referenciabancariaConstantesFunciones.event_dependidvalorclientebancoReferenciaBancaria) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.referenciabancaria.getidvalorclientebanco());
									//this.inicializarActualizarBindingReferenciaBancaria(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(referenciabancaria.getBanco()!=null) {
							this.bancosForeignKey.add(referenciabancaria.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.referenciabancaria.getidvalorclientebanco(),false,"Formulario");

					//TipoProduBanco
					if(!this.referenciabancariaConstantesFunciones.cargaridvalorclienteproductobancoReferenciaBancaria || this.referenciabancariaConstantesFunciones.event_dependidvalorclienteproductobancoReferenciaBancaria) {
						//this.cargarCombosTipoProduBancosForeignKeyLista(" where id="+this.referenciabancaria.getidvalorclienteproductobanco());
									//this.inicializarActualizarBindingReferenciaBancaria(false,false);
						this.tipoprodubancosForeignKey=new ArrayList<TipoProduBanco>();

						if(referenciabancaria.getTipoProduBanco()!=null) {
							this.tipoprodubancosForeignKey.add(referenciabancaria.getTipoProduBanco());
						}

						this.addItemDefectoCombosForeignKeyTipoProduBanco();
						this.cargarCombosFrameTipoProduBancosForeignKey("Todos");
					}
					this.setActualTipoProduBancoForeignKey(this.referenciabancaria.getidvalorclienteproductobanco(),false,"Formulario");

					//TipoCuentaBanco
					if(!this.referenciabancariaConstantesFunciones.cargaridvalorclientecuentabancoReferenciaBancaria || this.referenciabancariaConstantesFunciones.event_dependidvalorclientecuentabancoReferenciaBancaria) {
						//this.cargarCombosTipoCuentaBancosForeignKeyLista(" where id="+this.referenciabancaria.getidvalorclientecuentabanco());
									//this.inicializarActualizarBindingReferenciaBancaria(false,false);
						this.tipocuentabancosForeignKey=new ArrayList<TipoCuentaBanco>();

						if(referenciabancaria.getTipoCuentaBanco()!=null) {
							this.tipocuentabancosForeignKey.add(referenciabancaria.getTipoCuentaBanco());
						}

						this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
						this.cargarCombosFrameTipoCuentaBancosForeignKey("Todos");
					}
					this.setActualTipoCuentaBancoForeignKey(this.referenciabancaria.getidvalorclientecuentabanco(),false,"Formulario");

					//TipoValoracion
					if(!this.referenciabancariaConstantesFunciones.cargarid_tipo_valoracionReferenciaBancaria || this.referenciabancariaConstantesFunciones.event_dependid_tipo_valoracionReferenciaBancaria) {
						//this.cargarCombosTipoValoracionsForeignKeyLista(" where id="+this.referenciabancaria.getid_tipo_valoracion());
									//this.inicializarActualizarBindingReferenciaBancaria(false,false);
						this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

						if(referenciabancaria.getTipoValoracion()!=null) {
							this.tipovaloracionsForeignKey.add(referenciabancaria.getTipoValoracion());
						}

						this.addItemDefectoCombosForeignKeyTipoValoracion();
						this.cargarCombosFrameTipoValoracionsForeignKey("Todos");
					}
					this.setActualTipoValoracionForeignKey(this.referenciabancaria.getid_tipo_valoracion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReferenciaBancaria("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReferenciaBancaria(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaBancaria() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferenciaBancaria(ReferenciaBancaria referenciabancaria) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReferenciaBancaria(referenciabancaria,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferenciaBancaria(ReferenciaBancaria referenciabancaria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReferenciaBancaria(referenciabancaria);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReferenciaBancaria(referenciabancaria,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReferenciaBancaria(referenciabancaria);
	}
	
	public void setVariablesObjetoActualToFormularioReferenciaBancaria(ReferenciaBancaria referenciabancaria) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setText(referenciabancaria.getId().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setText(referenciabancaria.getnumero_cuenta_tarjeta());
			this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setDate(referenciabancaria.getfecha_emision());
			this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setDate(referenciabancaria.getfecha_vencimiento());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setText(referenciabancaria.getcupo().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setSelected(referenciabancaria.gettiene_credito());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setText(referenciabancaria.getnumero_creditos().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setSelected(referenciabancaria.gettiene_protestos());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setText(referenciabancaria.getnumero_protestos().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setText(referenciabancaria.getsaldos_promedios());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setText(referenciabancaria.getpropietario_cuenta());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setSelected(referenciabancaria.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ReferenciaBancaria referenciabancariaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,referenciabancariaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ReferenciaBancaria referenciabancariaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				referenciabancariaLocal=this.referenciabancaria;
			} else {
				referenciabancariaLocal=this.referenciabancariaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(referenciabancariaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReferenciaBancaria(referenciabancariaLocal,true);
					
					if(referenciabancariaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(referenciabancariaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(referenciabancariaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReferenciaBancaria(ReferenciaBancaria referenciabancaria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferenciaBancaria(referenciabancaria,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(referenciabancaria);
	}
	
	public void setVariablesFormularioToObjetoActualReferenciaBancaria(ReferenciaBancaria referenciabancaria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferenciaBancaria(referenciabancaria,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReferenciaBancaria(ReferenciaBancaria referenciabancaria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.getText()==null || this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.getText()=="" || this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.getText()=="Id") {
				this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setText("0");
			}

			if(conColumnasBase) {referenciabancaria.setId(Long.parseLong(this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelIdReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setnumero_cuenta_tarjeta(this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_cuenta_tarjetaReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setfecha_emision(this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelfecha_emisionReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setfecha_vencimiento(this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelfecha_vencimientoReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setcupo(Double.parseDouble(this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_CUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelcupoReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.settiene_credito(this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabeltiene_creditoReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setnumero_creditos(Integer.parseInt(this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_creditosReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.settiene_protestos(this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabeltiene_protestosReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setnumero_protestos(Integer.parseInt(this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelnumero_protestosReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setsaldos_promedios(this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelsaldos_promediosReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setpropietario_cuenta(this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelpropietario_cuentaReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciabancaria.setesactivo(this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaBancaria.jLabelesactivoReferenciaBancaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferenciaBancaria(ReferenciaBancaria referenciabancariaBean,ReferenciaBancaria referenciabancaria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && referenciabancariaBean.getidcliente()!=null && !referenciabancariaBean.getidcliente().equals(-1L))) {referenciabancaria.setidcliente(referenciabancariaBean.getidcliente());}
			if(conDefault || (!conDefault && referenciabancariaBean.getidvalorclientebanco()!=null && !referenciabancariaBean.getidvalorclientebanco().equals(-1L))) {referenciabancaria.setidvalorclientebanco(referenciabancariaBean.getidvalorclientebanco());}
			if(conDefault || (!conDefault && referenciabancariaBean.getidvalorclienteproductobanco()!=null && !referenciabancariaBean.getidvalorclienteproductobanco().equals(-1L))) {referenciabancaria.setidvalorclienteproductobanco(referenciabancariaBean.getidvalorclienteproductobanco());}
			if(conDefault || (!conDefault && referenciabancariaBean.getidvalorclientecuentabanco()!=null && !referenciabancariaBean.getidvalorclientecuentabanco().equals(-1L))) {referenciabancaria.setidvalorclientecuentabanco(referenciabancariaBean.getidvalorclientecuentabanco());}
			if(conDefault || (!conDefault && referenciabancariaBean.getid_tipo_valoracion()!=null && !referenciabancariaBean.getid_tipo_valoracion().equals(-1L))) {referenciabancaria.setid_tipo_valoracion(referenciabancariaBean.getid_tipo_valoracion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReferenciaBancaria(ReferenciaBancaria referenciabancariaOrigen,ReferenciaBancaria referenciabancaria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciabancariaOrigen.getId()!=null && !referenciabancariaOrigen.getId().equals(0L))) {referenciabancaria.setId(referenciabancariaOrigen.getId());}}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getidcliente()!=null && !referenciabancariaOrigen.getidcliente().equals(-1L))) {referenciabancaria.setidcliente(referenciabancariaOrigen.getidcliente());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getidvalorclientebanco()!=null && !referenciabancariaOrigen.getidvalorclientebanco().equals(-1L))) {referenciabancaria.setidvalorclientebanco(referenciabancariaOrigen.getidvalorclientebanco());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getidvalorclienteproductobanco()!=null && !referenciabancariaOrigen.getidvalorclienteproductobanco().equals(-1L))) {referenciabancaria.setidvalorclienteproductobanco(referenciabancariaOrigen.getidvalorclienteproductobanco());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getidvalorclientecuentabanco()!=null && !referenciabancariaOrigen.getidvalorclientecuentabanco().equals(-1L))) {referenciabancaria.setidvalorclientecuentabanco(referenciabancariaOrigen.getidvalorclientecuentabanco());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getnumero_cuenta_tarjeta()!=null && !referenciabancariaOrigen.getnumero_cuenta_tarjeta().equals(""))) {referenciabancaria.setnumero_cuenta_tarjeta(referenciabancariaOrigen.getnumero_cuenta_tarjeta());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getfecha_emision()!=null && !referenciabancariaOrigen.getfecha_emision().equals(new Date()))) {referenciabancaria.setfecha_emision(referenciabancariaOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getfecha_vencimiento()!=null && !referenciabancariaOrigen.getfecha_vencimiento().equals(new Date()))) {referenciabancaria.setfecha_vencimiento(referenciabancariaOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getcupo()!=null && !referenciabancariaOrigen.getcupo().equals(0.0))) {referenciabancaria.setcupo(referenciabancariaOrigen.getcupo());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.gettiene_credito()!=null && !referenciabancariaOrigen.gettiene_credito().equals(false))) {referenciabancaria.settiene_credito(referenciabancariaOrigen.gettiene_credito());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getnumero_creditos()!=null && !referenciabancariaOrigen.getnumero_creditos().equals(0))) {referenciabancaria.setnumero_creditos(referenciabancariaOrigen.getnumero_creditos());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.gettiene_protestos()!=null && !referenciabancariaOrigen.gettiene_protestos().equals(false))) {referenciabancaria.settiene_protestos(referenciabancariaOrigen.gettiene_protestos());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getnumero_protestos()!=null && !referenciabancariaOrigen.getnumero_protestos().equals(0))) {referenciabancaria.setnumero_protestos(referenciabancariaOrigen.getnumero_protestos());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getsaldos_promedios()!=null && !referenciabancariaOrigen.getsaldos_promedios().equals(""))) {referenciabancaria.setsaldos_promedios(referenciabancariaOrigen.getsaldos_promedios());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getpropietario_cuenta()!=null && !referenciabancariaOrigen.getpropietario_cuenta().equals(""))) {referenciabancaria.setpropietario_cuenta(referenciabancariaOrigen.getpropietario_cuenta());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getid_tipo_valoracion()!=null && !referenciabancariaOrigen.getid_tipo_valoracion().equals(-1L))) {referenciabancaria.setid_tipo_valoracion(referenciabancariaOrigen.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && referenciabancariaOrigen.getesactivo()!=null && !referenciabancariaOrigen.getesactivo().equals(false))) {referenciabancaria.setesactivo(referenciabancariaOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferenciaBancaria(ReferenciaBancaria referenciabancaria) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setText(referenciabancaria.getId().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setText(referenciabancaria.getnumero_cuenta_tarjeta());
			this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setDate(referenciabancaria.getfecha_emision());
			this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setDate(referenciabancaria.getfecha_vencimiento());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setText(referenciabancaria.getcupo().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setSelected(referenciabancaria.gettiene_credito());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setText(referenciabancaria.getnumero_creditos().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setSelected(referenciabancaria.gettiene_protestos());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setText(referenciabancaria.getnumero_protestos().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setText(referenciabancaria.getsaldos_promedios());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setText(referenciabancaria.getpropietario_cuenta());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setSelected(referenciabancaria.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferenciaBancaria(ReferenciaBancariaBean referenciabancariaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setText(referenciabancariaBean.getId().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setText(referenciabancariaBean.getnumero_cuenta_tarjeta());
			this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setDate(referenciabancariaBean.getfecha_emision());
			this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setDate(referenciabancariaBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setText(referenciabancariaBean.getcupo().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setSelected(referenciabancariaBean.gettiene_credito());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setText(referenciabancariaBean.getnumero_creditos().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setSelected(referenciabancariaBean.gettiene_protestos());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setText(referenciabancariaBean.getnumero_protestos().toString());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setText(referenciabancariaBean.getsaldos_promedios());
			this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setText(referenciabancariaBean.getpropietario_cuenta());
			this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setSelected(referenciabancariaBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReferenciaBancaria(ReferenciaBancariaParameterReturnGeneral referenciabancariaReturnGeneral,ReferenciaBancariaBean referenciabancariaBean,Boolean conDefault) throws Exception { 
		try {
			ReferenciaBancaria referenciabancariaLocal=new ReferenciaBancaria();
			
			referenciabancariaLocal=referenciabancariaReturnGeneral.getReferenciaBancaria();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciabancariaLocal.getId()!=null && !referenciabancariaLocal.getId().equals(0L))) {referenciabancariaBean.setId(referenciabancariaLocal.getId());}}
			if(conDefault || (!conDefault && referenciabancariaLocal.getidcliente()!=null && !referenciabancariaLocal.getidcliente().equals(-1L))) {referenciabancariaBean.setidcliente(referenciabancariaLocal.getidcliente());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getidvalorclientebanco()!=null && !referenciabancariaLocal.getidvalorclientebanco().equals(-1L))) {referenciabancariaBean.setidvalorclientebanco(referenciabancariaLocal.getidvalorclientebanco());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getidvalorclienteproductobanco()!=null && !referenciabancariaLocal.getidvalorclienteproductobanco().equals(-1L))) {referenciabancariaBean.setidvalorclienteproductobanco(referenciabancariaLocal.getidvalorclienteproductobanco());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getidvalorclientecuentabanco()!=null && !referenciabancariaLocal.getidvalorclientecuentabanco().equals(-1L))) {referenciabancariaBean.setidvalorclientecuentabanco(referenciabancariaLocal.getidvalorclientecuentabanco());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getnumero_cuenta_tarjeta()!=null && !referenciabancariaLocal.getnumero_cuenta_tarjeta().equals(""))) {referenciabancariaBean.setnumero_cuenta_tarjeta(referenciabancariaLocal.getnumero_cuenta_tarjeta());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getfecha_emision()!=null && !referenciabancariaLocal.getfecha_emision().equals(new Date()))) {referenciabancariaBean.setfecha_emision(referenciabancariaLocal.getfecha_emision());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getfecha_vencimiento()!=null && !referenciabancariaLocal.getfecha_vencimiento().equals(new Date()))) {referenciabancariaBean.setfecha_vencimiento(referenciabancariaLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getcupo()!=null && !referenciabancariaLocal.getcupo().equals(0.0))) {referenciabancariaBean.setcupo(referenciabancariaLocal.getcupo());}
			if(conDefault || (!conDefault && referenciabancariaLocal.gettiene_credito()!=null && !referenciabancariaLocal.gettiene_credito().equals(false))) {referenciabancariaBean.settiene_credito(referenciabancariaLocal.gettiene_credito());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getnumero_creditos()!=null && !referenciabancariaLocal.getnumero_creditos().equals(0))) {referenciabancariaBean.setnumero_creditos(referenciabancariaLocal.getnumero_creditos());}
			if(conDefault || (!conDefault && referenciabancariaLocal.gettiene_protestos()!=null && !referenciabancariaLocal.gettiene_protestos().equals(false))) {referenciabancariaBean.settiene_protestos(referenciabancariaLocal.gettiene_protestos());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getnumero_protestos()!=null && !referenciabancariaLocal.getnumero_protestos().equals(0))) {referenciabancariaBean.setnumero_protestos(referenciabancariaLocal.getnumero_protestos());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getsaldos_promedios()!=null && !referenciabancariaLocal.getsaldos_promedios().equals(""))) {referenciabancariaBean.setsaldos_promedios(referenciabancariaLocal.getsaldos_promedios());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getpropietario_cuenta()!=null && !referenciabancariaLocal.getpropietario_cuenta().equals(""))) {referenciabancariaBean.setpropietario_cuenta(referenciabancariaLocal.getpropietario_cuenta());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getid_tipo_valoracion()!=null && !referenciabancariaLocal.getid_tipo_valoracion().equals(-1L))) {referenciabancariaBean.setid_tipo_valoracion(referenciabancariaLocal.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && referenciabancariaLocal.getesactivo()!=null && !referenciabancariaLocal.getesactivo().equals(false))) {referenciabancariaBean.setesactivo(referenciabancariaLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReferenciaBancariaGenerico(Long idReferenciaBancariaSeleccionado,JComboBox jComboBoxReferenciaBancaria,List<ReferenciaBancaria> referenciabancariasLocal)throws Exception {
		try {
			ReferenciaBancaria  referenciabancariaTemp=null;

			for(ReferenciaBancaria referenciabancariaAux:referenciabancariasLocal) {
				if(referenciabancariaAux.getId()!=null && referenciabancariaAux.getId().equals(idReferenciaBancariaSeleccionado)) {
					referenciabancariaTemp=referenciabancariaAux;
					break;
				}
			}

			jComboBoxReferenciaBancaria.setSelectedItem(referenciabancariaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReferenciaBancariaGenerico(JComboBox jComboBoxReferenciaBancaria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferenciaBancaria.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReferenciaBancaria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferenciaBancaria.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReferenciaBancaria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReferenciaBancaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReferenciaBancaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciabancaria=(ReferenciaBancaria) referenciabancariaLogic.getReferenciaBancarias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciabancaria =(ReferenciaBancaria) referenciabancarias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!referenciabancaria.getIsNew() && !referenciabancaria.getIsChanged() && !referenciabancaria.getIsDeleted()) {
				sDescripcion=referenciabancaria.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=referenciabancaria.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!referenciabancaria.getIsNew() && !referenciabancaria.getIsChanged() && !referenciabancaria.getIsDeleted()) {
				sDescripcion=referenciabancaria.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=referenciabancaria.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!referenciabancaria.getIsNew() && !referenciabancaria.getIsChanged() && !referenciabancaria.getIsDeleted()) {
				sDescripcion=referenciabancaria.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=referenciabancaria.getbanco_descripcion();
			}
		}

		if(sTipo.equals("TipoProduBanco")) {
			//sDescripcion=this.getActualTipoProduBancoForeignKeyDescripcion((Long)value);
			if(!referenciabancaria.getIsNew() && !referenciabancaria.getIsChanged() && !referenciabancaria.getIsDeleted()) {
				sDescripcion=referenciabancaria.gettipoprodubanco_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProduBancoForeignKeyDescripcion((Long)value);
				sDescripcion=referenciabancaria.gettipoprodubanco_descripcion();
			}
		}

		if(sTipo.equals("TipoCuentaBanco")) {
			//sDescripcion=this.getActualTipoCuentaBancoForeignKeyDescripcion((Long)value);
			if(!referenciabancaria.getIsNew() && !referenciabancaria.getIsChanged() && !referenciabancaria.getIsDeleted()) {
				sDescripcion=referenciabancaria.gettipocuentabanco_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCuentaBancoForeignKeyDescripcion((Long)value);
				sDescripcion=referenciabancaria.gettipocuentabanco_descripcion();
			}
		}

		if(sTipo.equals("TipoValoracion")) {
			//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
			if(!referenciabancaria.getIsNew() && !referenciabancaria.getIsChanged() && !referenciabancaria.getIsDeleted()) {
				sDescripcion=referenciabancaria.gettipovaloracion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
				sDescripcion=referenciabancaria.gettipovaloracion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ReferenciaBancaria referenciabancariaRow=new ReferenciaBancaria();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciabancariaRow=(ReferenciaBancaria) referenciabancariaLogic.getReferenciaBancarias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciabancariaRow=(ReferenciaBancaria) referenciabancarias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReferenciaBancaria(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria));			
			this.jButtonDuplicarReferenciaBancaria.setVisible((this.isVisibilidadCeldaDuplicarReferenciaBancaria && this.isPermisoDuplicarReferenciaBancaria));			
			this.jButtonCopiarReferenciaBancaria.setVisible((this.isVisibilidadCeldaCopiarReferenciaBancaria && this.isPermisoCopiarReferenciaBancaria));
			this.jButtonVerFormReferenciaBancaria.setVisible((this.isVisibilidadCeldaVerFormReferenciaBancaria && this.isPermisoVerFormReferenciaBancaria));
			
			this.jButtonAbrirOrderByReferenciaBancaria.setVisible((this.isVisibilidadCeldaOrdenReferenciaBancaria && this.isPermisoOrdenReferenciaBancaria));			
			
			this.jButtonNuevoRelacionesReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria));			
			this.jButtonNuevoGuardarCambiosReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarReferenciaBancaria.setVisible((this.isVisibilidadCeldaModificarReferenciaBancaria && this.isPermisoActualizarReferenciaBancaria));	
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarReferenciaBancaria.setVisible((this.isVisibilidadCeldaActualizarReferenciaBancaria && this.isPermisoActualizarReferenciaBancaria));	
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarReferenciaBancaria.setVisible((this.isVisibilidadCeldaEliminarReferenciaBancaria && this.isPermisoEliminarReferenciaBancaria));
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarReferenciaBancaria.setVisible(this.isVisibilidadCeldaCancelarReferenciaBancaria);							
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));			
			
			}
						
			this.jButtonGuardarCambiosTablaReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria));						
			this.jButtonDuplicarToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaDuplicarReferenciaBancaria && this.isPermisoDuplicarReferenciaBancaria));						
			this.jButtonCopiarToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaCopiarReferenciaBancaria && this.isPermisoCopiarReferenciaBancaria));			
			this.jButtonVerFormToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaVerFormReferenciaBancaria && this.isPermisoVerFormReferenciaBancaria));			
			this.jButtonAbrirOrderByToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaOrdenReferenciaBancaria && this.isPermisoOrdenReferenciaBancaria));
			this.jButtonNuevoRelacionesToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria));			
			this.jButtonNuevoGuardarCambiosToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));			
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaModificarReferenciaBancaria && this.isPermisoActualizarReferenciaBancaria));	
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaActualizarReferenciaBancaria  && this.isPermisoActualizarReferenciaBancaria));	
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaEliminarReferenciaBancaria && this.isPermisoEliminarReferenciaBancaria));
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarToolBarReferenciaBancaria.setVisible(this.isVisibilidadCeldaCancelarReferenciaBancaria);				
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria));			
			this.jMenuItemDuplicarReferenciaBancaria.setVisible((this.isVisibilidadCeldaDuplicarReferenciaBancaria && this.isPermisoDuplicarReferenciaBancaria));			
			this.jMenuItemCopiarReferenciaBancaria.setVisible((this.isVisibilidadCeldaCopiarReferenciaBancaria && this.isPermisoCopiarReferenciaBancaria));			
			this.jMenuItemVerFormReferenciaBancaria.setVisible((this.isVisibilidadCeldaVerFormReferenciaBancaria && this.isPermisoVerFormReferenciaBancaria));			
			this.jMenuItemAbrirOrderByReferenciaBancaria.setVisible((this.isVisibilidadCeldaOrdenReferenciaBancaria && this.isPermisoOrdenReferenciaBancaria));			
			//this.jMenuItemMostrarOcultarReferenciaBancaria.setVisible((this.isVisibilidadCeldaOrdenReferenciaBancaria && this.isPermisoOrdenReferenciaBancaria));
			this.jMenuItemDetalleAbrirOrderByReferenciaBancaria.setVisible((this.isVisibilidadCeldaOrdenReferenciaBancaria && this.isPermisoOrdenReferenciaBancaria));			
			//this.jMenuItemDetalleMostrarOcultarReferenciaBancaria.setVisible((this.isVisibilidadCeldaOrdenReferenciaBancaria && this.isPermisoOrdenReferenciaBancaria));			
			this.jMenuItemNuevoRelacionesReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria));			
			this.jMenuItemNuevoGuardarCambiosReferenciaBancaria.setVisible((this.isVisibilidadCeldaNuevoReferenciaBancaria && this.isPermisoNuevoReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));									
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemModificarReferenciaBancaria.setVisible((this.isVisibilidadCeldaModificarReferenciaBancaria && this.isPermisoActualizarReferenciaBancaria));	
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemActualizarReferenciaBancaria.setVisible((this.isVisibilidadCeldaActualizarReferenciaBancaria && this.isPermisoActualizarReferenciaBancaria));	
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemEliminarReferenciaBancaria.setVisible((this.isVisibilidadCeldaEliminarReferenciaBancaria && this.isPermisoEliminarReferenciaBancaria));
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemCancelarReferenciaBancaria.setVisible(this.isVisibilidadCeldaCancelarReferenciaBancaria);				
			}
			
			this.jMenuItemGuardarCambiosReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));						
			this.jMenuItemGuardarCambiosTablaReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=this.jButtonNuevoReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaDuplicarReferenciaBancaria=this.jButtonDuplicarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaCopiarReferenciaBancaria=this.jButtonCopiarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaVerFormReferenciaBancaria=this.jButtonVerFormReferenciaBancaria.isVisible();
			
			this.isVisibilidadCeldaOrdenReferenciaBancaria=this.jButtonAbrirOrderByReferenciaBancaria.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=this.jButtonNuevoRelacionesReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaModificarReferenciaBancaria=this.jButtonModificarReferenciaBancaria.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.isVisibilidadCeldaActualizarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaGuardarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=this.jButtonGuardarCambiosTablaReferenciaBancaria.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReferenciaBancaria=this.jButtonNuevoToolBarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=this.jButtonNuevoRelacionesToolBarReferenciaBancaria.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.isVisibilidadCeldaModificarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarToolBarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaActualizarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarToolBarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarToolBarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarToolBarReferenciaBancaria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferenciaBancaria=this.jButtonGuardarCambiosToolBarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=this.jButtonGuardarCambiosTablaToolBarReferenciaBancaria.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReferenciaBancaria=this.jMenuItemNuevoReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=this.jMenuItemNuevoRelacionesReferenciaBancaria.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.isVisibilidadCeldaModificarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemModificarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaActualizarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemActualizarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemEliminarReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaBancaria=this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemCancelarReferenciaBancaria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferenciaBancaria=this.jMenuItemGuardarCambiosReferenciaBancaria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=this.jMenuItemGuardarCambiosTablaReferenciaBancaria.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReferenciaBancaria(Boolean esInicializar) {
		if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
				//if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReferenciaBancaria();
			}
			
			this.inicializarActualizarBindingBotonesManualReferenciaBancaria(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReferenciaBancaria() {
		this.jButtonNuevoReferenciaBancaria.setVisible(this.isPermisoNuevoReferenciaBancaria);			
		this.jButtonDuplicarReferenciaBancaria.setVisible(this.isPermisoDuplicarReferenciaBancaria);			
		this.jButtonCopiarReferenciaBancaria.setVisible(this.isPermisoCopiarReferenciaBancaria);			
		this.jButtonVerFormReferenciaBancaria.setVisible(this.isPermisoVerFormReferenciaBancaria);			
		
		this.jButtonAbrirOrderByReferenciaBancaria.setVisible(this.isPermisoOrdenReferenciaBancaria);					
		
		this.jButtonNuevoRelacionesReferenciaBancaria.setVisible(this.isPermisoNuevoReferenciaBancaria);			
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarReferenciaBancaria.setVisible(this.isPermisoActualizarReferenciaBancaria);	
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarReferenciaBancaria.setVisible(this.isPermisoActualizarReferenciaBancaria);	
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarReferenciaBancaria.setVisible(this.isPermisoEliminarReferenciaBancaria);
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarReferenciaBancaria.setVisible(this.isVisibilidadCeldaCancelarReferenciaBancaria);						
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.setVisible(this.isPermisoGuardarCambiosReferenciaBancaria);							
		}
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.setVisible(this.isPermisoActualizarReferenciaBancaria);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReferenciaBancaria() {
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarReferenciaBancaria.setVisible(this.isPermisoActualizarReferenciaBancaria);	
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarReferenciaBancaria.setVisible(this.isPermisoActualizarReferenciaBancaria);	
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarReferenciaBancaria.setVisible(this.isPermisoEliminarReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarReferenciaBancaria.setVisible(this.isVisibilidadCeldaCancelarReferenciaBancaria);							
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.setVisible((this.isVisibilidadCeldaGuardarReferenciaBancaria && this.isPermisoGuardarCambiosReferenciaBancaria));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReferenciaBancaria() {
		if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReferenciaBancaria();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReferenciaBancaria() {
	}
	
	public void jTableDatosReferenciaBancariaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReferenciaBancaria(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.referenciabancaria.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaReferenciaBancariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebReferenciaBancaria(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaBancaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.referenciabancariaLogic.getConnexion());

				if(this.referenciabancaria.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.referenciabancaria.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.referenciabancaria.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteReferenciaBancariaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderReferenciaBancaria=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosReferenciaBancaria.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteReferenciaBancariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebReferenciaBancaria(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaBancaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.referenciabancariaLogic.getConnexion());

				if(this.referenciabancaria.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.referenciabancaria.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.referenciabancaria.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientebancoReferenciaBancariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebReferenciaBancaria(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaBancaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.referenciabancariaLogic.getConnexion());

				if(this.referenciabancaria.getidvalorclientebanco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.referenciabancaria.getidvalorclientebanco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientebancoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getidvalorclientebanco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientebanco = "+this.referenciabancaria.getidvalorclientebanco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclienteproductobancoReferenciaBancariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprodubanco=true;

			idTienePermisotipoprodubanco=this.tienePermisosUsuarioEnPaginaWebReferenciaBancaria(TipoProduBancoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprodubanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaBancaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);

				this.tipoprodubancoBeanSwingJInternalFrame=new TipoProduBancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprodubancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprodubancoBeanSwingJInternalFrame.getTipoProduBancoLogic().setConnexion(this.referenciabancariaLogic.getConnexion());

				if(this.referenciabancaria.getidvalorclienteproductobanco()!=null) {
					this.tipoprodubancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprodubancoBeanSwingJInternalFrame.setIdActual(this.referenciabancaria.getidvalorclienteproductobanco());
					this.tipoprodubancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprodubancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprodubancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProduBanco();
				}

				JInternalFrameBase jinternalFrame =this.tipoprodubancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				TitledBorder titledBordertipoprodubanco=(TitledBorder)this.tipoprodubancoBeanSwingJInternalFrame.jScrollPanelDatosTipoProduBanco.getBorder();

				titledBordertipoprodubanco.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Tipo Produ Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclienteproductobancoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getidvalorclienteproductobanco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclienteproductobanco = "+this.referenciabancaria.getidvalorclienteproductobanco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientecuentabancoReferenciaBancariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocuentabanco=true;

			idTienePermisotipocuentabanco=this.tienePermisosUsuarioEnPaginaWebReferenciaBancaria(TipoCuentaBancoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocuentabanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaBancaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);

				this.tipocuentabancoBeanSwingJInternalFrame=new TipoCuentaBancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocuentabancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocuentabancoBeanSwingJInternalFrame.getTipoCuentaBancoLogic().setConnexion(this.referenciabancariaLogic.getConnexion());

				if(this.referenciabancaria.getidvalorclientecuentabanco()!=null) {
					this.tipocuentabancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocuentabancoBeanSwingJInternalFrame.setIdActual(this.referenciabancaria.getidvalorclientecuentabanco());
					this.tipocuentabancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocuentabancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBanco();
				}

				JInternalFrameBase jinternalFrame =this.tipocuentabancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				TitledBorder titledBordertipocuentabanco=(TitledBorder)this.tipocuentabancoBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBanco.getBorder();

				titledBordertipocuentabanco.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Tipo Cuenta Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientecuentabancoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getidvalorclientecuentabanco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientecuentabanco = "+this.referenciabancaria.getidvalorclientecuentabanco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuenta_tarjetaReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getnumero_cuenta_tarjeta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta_tarjeta like '%"+this.referenciabancaria.getnumero_cuenta_tarjeta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.referenciabancaria.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.referenciabancaria.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncupoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getcupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cupo = "+this.referenciabancaria.getcupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontiene_creditoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.gettiene_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tiene_credito = "+this.referenciabancaria.gettiene_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_creditosReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getnumero_creditos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_creditos = "+this.referenciabancaria.getnumero_creditos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontiene_protestosReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.gettiene_protestos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tiene_protestos = "+this.referenciabancaria.gettiene_protestos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_protestosReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getnumero_protestos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_protestos = "+this.referenciabancaria.getnumero_protestos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldos_promediosReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getsaldos_promedios()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldos_promedios like '%"+this.referenciabancaria.getsaldos_promedios()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpropietario_cuentaReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getpropietario_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where propietario_cuenta like '%"+this.referenciabancaria.getpropietario_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_valoracionReferenciaBancariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovaloracion=true;

			idTienePermisotipovaloracion=this.tienePermisosUsuarioEnPaginaWebReferenciaBancaria(TipoValoracionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovaloracion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaBancaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaBancaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);

				this.tipovaloracionBeanSwingJInternalFrame=new TipoValoracionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovaloracionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovaloracionBeanSwingJInternalFrame.getTipoValoracionLogic().setConnexion(this.referenciabancariaLogic.getConnexion());

				if(this.referenciabancaria.getid_tipo_valoracion()!=null) {
					this.tipovaloracionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovaloracionBeanSwingJInternalFrame.setIdActual(this.referenciabancaria.getid_tipo_valoracion());
					this.tipovaloracionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoValoracion();
				}

				JInternalFrameBase jinternalFrame =this.tipovaloracionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaBancaria=(TitledBorder)this.jScrollPanelDatosReferenciaBancaria.getBorder();
				TitledBorder titledBordertipovaloracion=(TitledBorder)this.tipovaloracionBeanSwingJInternalFrame.jScrollPanelDatosTipoValoracion.getBorder();

				titledBordertipovaloracion.setTitle(titledBorderReferenciaBancaria.getTitle() + " -> Tipo Valoracion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_valoracionReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getid_tipo_valoracion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_valoracion = "+this.referenciabancaria.getid_tipo_valoracion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoReferenciaBancariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.getreferenciabancaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciabancaria==null) {
						this.referenciabancaria = new ReferenciaBancaria();
					}

					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);
				}

				if(this.referenciabancaria.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.referenciabancaria.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaBancaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaBancaria(false,false);

			this.getReferenciaBancariasFK_IdCliente();

			this.inicializarActualizarBindingReferenciaBancaria(false);

			//if(ReferenciaBancariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaBancaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaBancaria(false,false);

			this.getReferenciaBancariasFK_IdEmpresa();

			this.inicializarActualizarBindingReferenciaBancaria(false);

			//if(ReferenciaBancariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaBancaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoBancoReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaBancaria(false,false);

			this.getReferenciaBancariasFK_IdTipoBanco();

			this.inicializarActualizarBindingReferenciaBancaria(false);

			//if(ReferenciaBancariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaBancaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCuentaBancoReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaBancaria(false,false);

			this.getReferenciaBancariasFK_IdTipoCuentaBanco();

			this.inicializarActualizarBindingReferenciaBancaria(false);

			//if(ReferenciaBancariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaBancaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoBancoReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaBancaria(false,false);

			this.getReferenciaBancariasFK_IdTipoProductoBanco();

			this.inicializarActualizarBindingReferenciaBancaria(false);

			//if(ReferenciaBancariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaBancaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoValoracionReferenciaBancariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaBancaria(false,false);

			this.getReferenciaBancariasFK_IdTipoValoracion();

			this.inicializarActualizarBindingReferenciaBancaria(false);

			//if(ReferenciaBancariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaBancaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciabancariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameReferenciaBancaria() {
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
			this.jInternalFrameDetalleFormReferenciaBancaria.setVisible(false);	    			
			this.jInternalFrameDetalleFormReferenciaBancaria.dispose();
			this.jInternalFrameDetalleFormReferenciaBancaria=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
			this.jInternalFrameReporteDinamicoReferenciaBancaria.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReferenciaBancaria.dispose();
			this.jInternalFrameReporteDinamicoReferenciaBancaria=null;
		}
		
		if(this.jInternalFrameImportacionReferenciaBancaria!=null) {
			this.jInternalFrameImportacionReferenciaBancaria.setVisible(false);	    			
			this.jInternalFrameImportacionReferenciaBancaria.dispose();
			this.jInternalFrameImportacionReferenciaBancaria=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReferenciaBancaria();
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			
			if(sTipo.equals("NuevoReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReferenciaBancaria")) {
				jButtonDuplicarReferenciaBancariaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReferenciaBancaria")) {
				jButtonCopiarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("VerFormReferenciaBancaria")) {
				jButtonVerFormReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReferenciaBancaria")) {
				jButtonDuplicarReferenciaBancariaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReferenciaBancaria")) {
				jButtonDuplicarReferenciaBancariaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReferenciaBancaria")) {
				jButtonModificarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReferenciaBancaria")) {
				jButtonModificarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReferenciaBancaria")) {
				jButtonModificarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReferenciaBancaria")) {
				jButtonActualizarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReferenciaBancaria")) {
				jButtonActualizarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReferenciaBancaria")) {
				jButtonActualizarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("EliminarReferenciaBancaria")) {
				jButtonEliminarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReferenciaBancaria")) {
				jButtonEliminarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReferenciaBancaria")) {
				jButtonEliminarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("CancelarReferenciaBancaria")) {
				jButtonCancelarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReferenciaBancaria")) {
				jButtonCancelarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReferenciaBancaria")) {
				jButtonCancelarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("CerrarReferenciaBancaria")) {
				jButtonCerrarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReferenciaBancaria")) {
				jButtonCerrarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReferenciaBancaria")) {
				jButtonCerrarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReferenciaBancaria")) {
				jButtonMostrarOcultarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReferenciaBancaria")) {
				jButtonCancelarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReferenciaBancaria")) {
				jButtonCopiarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReferenciaBancaria")) {
				jButtonVerFormReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReferenciaBancaria")) {
				jButtonCopiarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReferenciaBancaria")) {
				jButtonVerFormReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReferenciaBancaria")) {
				jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReferenciaBancaria")) {
				jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReferenciaBancaria")) {
				jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReferenciaBancaria")) {
				jButtonAnterioresReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReferenciaBancaria")) {
				jButtonAnterioresReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReferenciaBancaria")) {
				jButtonAnterioresReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReferenciaBancaria")) {
				jButtonSiguientesReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReferenciaBancaria")) {
				jButtonSiguientesReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReferenciaBancaria")) {
				jButtonSiguientesReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReferenciaBancaria") || sTipo.equals("MenuItemDetalleAbrirOrderByReferenciaBancaria")) {
				jButtonAbrirOrderByReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReferenciaBancaria") || sTipo.equals("MenuItemDetalleMostrarOcultarReferenciaBancaria")) {
				jButtonMostrarOcultarReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReferenciaBancaria")) {
				jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReferenciaBancaria")) {
				jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReferenciaBancaria")) {
				jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReferenciaBancaria")) {
				jButtonCerrarReporteDinamicoReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReferenciaBancaria")) {
				jButtonGenerarReporteDinamicoReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReferenciaBancaria")) {
				
				jButtonGenerarExcelReporteDinamicoReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReferenciaBancaria")) {
				jButtonCerrarImportacionReferenciaBancariaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReferenciaBancaria")) {
				
				jButtonGenerarImportacionReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReferenciaBancaria")) {
				
				jButtonAbrirImportacionReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReferenciaBancaria")) {
				jComboBoxTiposAccionesReferenciaBancariaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReferenciaBancaria")) {
				jComboBoxTiposRelacionesReferenciaBancariaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReferenciaBancaria")) {
				jComboBoxTiposAccionesReferenciaBancariaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReferenciaBancaria")) {
				
				jComboBoxTiposSeleccionarReferenciaBancariaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReferenciaBancaria")) {
				jTextFieldValorCampoGeneralReferenciaBancariaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReferenciaBancaria")) {
				jButtonAbrirOrderByReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReferenciaBancaria")) {
				jButtonAbrirOrderByReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReferenciaBancaria")) {
				jButtonCerrarOrderByReferenciaBancariaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaBancariaBusqueda")) {
				this.jButtonidReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaBancariaUpdate")) {
				this.jButtonid_empresaReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaBancariaBusqueda")) {
				this.jButtonid_empresaReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteReferenciaBancaria")) {
				this.jButtonidclienteReferenciaBancariaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteReferenciaBancariaUpdate")) {
				this.jButtonidclienteReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteReferenciaBancariaBusqueda")) {
				this.jButtonidclienteReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientebancoReferenciaBancariaUpdate")) {
				this.jButtonidvalorclientebancoReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientebancoReferenciaBancariaBusqueda")) {
				this.jButtonidvalorclientebancoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclienteproductobancoReferenciaBancariaUpdate")) {
				this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclienteproductobancoReferenciaBancariaBusqueda")) {
				this.jButtonidvalorclienteproductobancoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientecuentabancoReferenciaBancariaUpdate")) {
				this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientecuentabancoReferenciaBancariaBusqueda")) {
				this.jButtonidvalorclientecuentabancoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuenta_tarjetaReferenciaBancariaBusqueda")) {
				this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionReferenciaBancariaBusqueda")) {
				this.jButtonfecha_emisionReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoReferenciaBancariaBusqueda")) {
				this.jButtonfecha_vencimientoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cupoReferenciaBancariaBusqueda")) {
				this.jButtoncupoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiene_creditoReferenciaBancariaBusqueda")) {
				this.jButtontiene_creditoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_creditosReferenciaBancariaBusqueda")) {
				this.jButtonnumero_creditosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiene_protestosReferenciaBancariaBusqueda")) {
				this.jButtontiene_protestosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_protestosReferenciaBancariaBusqueda")) {
				this.jButtonnumero_protestosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldos_promediosReferenciaBancariaBusqueda")) {
				this.jButtonsaldos_promediosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("propietario_cuentaReferenciaBancariaBusqueda")) {
				this.jButtonpropietario_cuentaReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaBancariaUpdate")) {
				this.jButtonid_tipo_valoracionReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaBancariaBusqueda")) {
				this.jButtonid_tipo_valoracionReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoReferenciaBancariaBusqueda")) {
				this.jButtonesactivoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteReferenciaBancaria")) {
				this.jButtonidclienteReferenciaBancariaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteReferenciaBancaria")) {
				this.jButtonFK_IdClienteReferenciaBancariaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoBancoReferenciaBancaria")) {
				this.jButtonFK_IdTipoBancoReferenciaBancariaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCuentaBancoReferenciaBancaria")) {
				this.jButtonFK_IdTipoCuentaBancoReferenciaBancariaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoBancoReferenciaBancaria")) {
				this.jButtonFK_IdTipoProductoBancoReferenciaBancariaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoValoracionReferenciaBancaria")) {
				this.jButtonFK_IdTipoValoracionReferenciaBancariaActionPerformed(evt);
			}
			
			;
			
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReferenciaBancaria();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ReferenciaBancaria referenciabancariaLocal=null;
			
			if(!this.getEsControlTabla()) {
				referenciabancariaLocal=this.referenciabancaria;
			} else {
				referenciabancariaLocal=this.referenciabancariaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
							
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
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
			
			


			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
								
						
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
								
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
							
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
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
			
			


			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
								
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReferenciaBancaria")) {
					jCheckBoxSeleccionarTodosReferenciaBancariaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReferenciaBancaria")) {
					jCheckBoxSeleccionadosReferenciaBancariaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReferenciaBancaria")) {
					
				}
				
				


				
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
												
				
				


				
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
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
			
			


			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaBancariaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciabancaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciabancaria);
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
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
				
				


				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaBancaria.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaBancaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaBancariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciabancariaAnterior =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReferenciaBancaria")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReferenciaBancariaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReferenciaBancaria.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.referenciabancaria =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.referenciabancaria =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.referenciabancaria);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReferenciaBancaria")) {
				
				}
				
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReferenciaBancaria")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReferenciaBancaria.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReferenciaBancaria")) {
			
			}
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReferenciaBancaria();
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			if(sTipo.equals("NuevoReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReferenciaBancaria")) {
				jButtonDuplicarReferenciaBancariaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReferenciaBancaria")) {
				jButtonCopiarReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReferenciaBancaria")) {
				jButtonVerFormReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReferenciaBancaria")) {
				jButtonNuevoReferenciaBancariaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReferenciaBancaria")) {
				jButtonModificarReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReferenciaBancaria")) {
				jButtonActualizarReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReferenciaBancaria")) {
				jButtonEliminarReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReferenciaBancaria")) {
				jButtonCancelarReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReferenciaBancaria")) {
				jButtonCerrarReferenciaBancariaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReferenciaBancaria")) {
				jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReferenciaBancaria")) {
				jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReferenciaBancaria")) {
				jButtonAbrirOrderByReferenciaBancariaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReferenciaBancaria")) {
				jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReferenciaBancaria")) {
				jButtonAnterioresReferenciaBancariaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReferenciaBancaria")) {
				jButtonSiguientesReferenciaBancariaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaBancariaBusqueda")) {
				this.jButtonidReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaBancariaUpdate")) {
				this.jButtonid_empresaReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaBancariaBusqueda")) {
				this.jButtonid_empresaReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteReferenciaBancaria")) {
				this.jButtonidclienteReferenciaBancariaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteReferenciaBancariaUpdate")) {
				this.jButtonidclienteReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteReferenciaBancariaBusqueda")) {
				this.jButtonidclienteReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientebancoReferenciaBancariaUpdate")) {
				this.jButtonidvalorclientebancoReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientebancoReferenciaBancariaBusqueda")) {
				this.jButtonidvalorclientebancoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclienteproductobancoReferenciaBancariaUpdate")) {
				this.jButtonidvalorclienteproductobancoReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclienteproductobancoReferenciaBancariaBusqueda")) {
				this.jButtonidvalorclienteproductobancoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientecuentabancoReferenciaBancariaUpdate")) {
				this.jButtonidvalorclientecuentabancoReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientecuentabancoReferenciaBancariaBusqueda")) {
				this.jButtonidvalorclientecuentabancoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuenta_tarjetaReferenciaBancariaBusqueda")) {
				this.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionReferenciaBancariaBusqueda")) {
				this.jButtonfecha_emisionReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoReferenciaBancariaBusqueda")) {
				this.jButtonfecha_vencimientoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cupoReferenciaBancariaBusqueda")) {
				this.jButtoncupoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiene_creditoReferenciaBancariaBusqueda")) {
				this.jButtontiene_creditoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_creditosReferenciaBancariaBusqueda")) {
				this.jButtonnumero_creditosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tiene_protestosReferenciaBancariaBusqueda")) {
				this.jButtontiene_protestosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_protestosReferenciaBancariaBusqueda")) {
				this.jButtonnumero_protestosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldos_promediosReferenciaBancariaBusqueda")) {
				this.jButtonsaldos_promediosReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("propietario_cuentaReferenciaBancariaBusqueda")) {
				this.jButtonpropietario_cuentaReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaBancariaUpdate")) {
				this.jButtonid_tipo_valoracionReferenciaBancariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaBancariaBusqueda")) {
				this.jButtonid_tipo_valoracionReferenciaBancariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoReferenciaBancariaBusqueda")) {
				this.jButtonesactivoReferenciaBancariaBusquedaActionPerformed(evt);
			}
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReferenciaBancaria();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReferenciaBancaria")) {
				closingInternalFrameReferenciaBancaria();
				
			} else if(sTipo.equals("jButtonCancelarReferenciaBancaria")) {
				JInternalFrameBase jInternalFrameDetalleFormReferenciaBancaria = (JInternalFrameBase)evt.getSource();
	            	
	            ReferenciaBancariaBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaBancariaBeanSwingJInternalFrame)jInternalFrameDetalleFormReferenciaBancaria.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReferenciaBancariaActionPerformed(null);
			}
			
			ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referenciabancaria,new Object(),this.referenciabancariaParameterGeneral,this.referenciabancariaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReferenciaBancaria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReferenciaBancaria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReferenciaBancaria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.referenciabancaria)) {
			if(!esControlTabla) {
				if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);			
				}
				
				if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReferenciaBancaria(this.referenciabancaria,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciabancariaReturnGeneral=referenciabancariaLogic.procesarEventosReferenciaBancariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciabancariaLogic.getReferenciaBancarias(),this.referenciabancaria,this.referenciabancariaParameterGeneral,this.isEsNuevoReferenciaBancaria,classes);//this.referenciabancariaLogic.getReferenciaBancaria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReferenciaBancaria(this.referenciabancariaReturnGeneral,this.referenciabancariaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReferenciaBancaria(classes,this.referenciabancariaReturnGeneral,this.referenciabancariaBean,false);
					}
						
					if(this.referenciabancariaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria());	
					}
						
					if(this.referenciabancariaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria(),classes);//this.referenciabancariaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReferenciaBancaria(this.referenciabancaria,classes);//this.referenciabancariaBean);									
				}
			
				if(ReferenciaBancariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReferenciaBancaria(this.referenciabancaria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaBancaria(this.referenciabancaria);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.referenciabancariaAnterior!=null) {
						this.referenciabancaria=this.referenciabancariaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciabancariaReturnGeneral=referenciabancariaLogic.procesarEventosReferenciaBancariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciabancariaLogic.getReferenciaBancarias(),this.referenciabancaria,this.referenciabancariaParameterGeneral,this.isEsNuevoReferenciaBancaria,classes);//this.referenciabancariaLogic.getReferenciaBancaria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciabancariaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciabancariaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.referenciabancariaReturnGeneral.getReferenciaBancaria(),referenciabancariaLogic.getReferenciaBancarias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.referenciabancariaReturnGeneral.getReferenciaBancaria(),this.referenciabancarias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReferenciaBancaria.repaint();
				
				//((AbstractTableModel) this.jTableDatosReferenciaBancaria.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReferenciaBancaria();
			}
		}
	}
	
	public void actualizarVisualTableDatosReferenciaBancaria() throws Exception {
		
		ReferenciaBancariaModel referenciabancariaModel=(ReferenciaBancariaModel)this.jTableDatosReferenciaBancaria.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciabancariaModel.referenciabancarias=this.referenciabancariaLogic.getReferenciaBancarias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			referenciabancariaModel.referenciabancarias=this.referenciabancarias;
		}
		
		
		((ReferenciaBancariaModel) this.jTableDatosReferenciaBancaria.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReferenciaBancaria() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getreferenciabancariaAnterior(),this.referenciabancariaLogic.getReferenciaBancarias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getreferenciabancariaAnterior(),this.referenciabancarias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReferenciaBancaria();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReferenciaBancaria(ReferenciaBancaria referenciabancaria,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
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
										
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciabancaria,new Object(),generalEntityParameterGeneral,this.referenciabancariaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.referenciabancariaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReferenciaBancariaConstantesFunciones.getClassesRelationshipsOfReferenciaBancaria(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReferenciaBancariaConstantesFunciones.getClassesRelationshipsFromStringsOfReferenciaBancaria(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReferenciaBancaria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReferenciaBancariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciabancaria,new Object(),generalEntityParameterGeneral,this.referenciabancariaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReferenciaBancaria(ReferenciaBancariaBean referenciabancariaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReferenciaBancaria(ArrayList<Classe> classes,ReferenciaBancariaReturnGeneral referenciabancariaReturnGeneral,ReferenciaBancariaBean referenciabancariaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReferenciaBancaria(ReferenciaBancaria referenciabancaria,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.referenciabancaria)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReferenciaBancaria = new ReferenciaBancariaDetalleFormJInternalFrame(jDesktopPane,this.referenciabancariaSessionBean.getConGuardarRelaciones(),this.referenciabancariaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.setVisible(false);
		this.jInternalFrameDetalleFormReferenciaBancaria.setSelected(false);						
		
		this.jInternalFrameDetalleFormReferenciaBancaria.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReferenciaBancaria.referenciabancariaLogic=this.referenciabancariaLogic;
		
		this.cargarCombosFrameForeignKeyReferenciaBancaria("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReferenciaBancaria();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferenciaBancaria();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReferenciaBancaria("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReferenciaBancaria();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReferenciaBancaria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferenciaBancaria"));
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"ModificarReferenciaBancaria"));

		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferenciaBancaria"));
					
		this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemModificarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferenciaBancaria"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"ActualizarReferenciaBancaria"));
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferenciaBancaria"));
						
		this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemActualizarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferenciaBancaria"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"EliminarReferenciaBancaria"));
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferenciaBancaria"));
								
		this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemEliminarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferenciaBancaria"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CancelarReferenciaBancaria"));
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferenciaBancaria"));
					
		this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemCancelarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferenciaBancaria"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemDetalleCerrarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferenciaBancaria"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaBancaria"));
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaBancaria"));
		
		
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferenciaBancaria"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_empresaReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_empresaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBancariaBusqueda"));
		//jButtonidclienteReferenciaBancaria.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaBancariaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancaria"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientebancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientebancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientebancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientebancoReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienteproductobancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienteproductobancoReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecuentabancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecuentabancoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuenta_tarjetaReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonfecha_emisionReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonfecha_vencimientoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtoncupoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"cupoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtontiene_creditoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"tiene_creditoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_creditosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_creditosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtontiene_protestosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"tiene_protestosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_protestosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_protestosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonsaldos_promediosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"saldos_promediosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonpropietario_cuentaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"propietario_cuentaReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_tipo_valoracionReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonesactivoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaBancariaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferenciaBancaria"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReferenciaBancaria"));
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferenciaBancaria"));
		}
		
		this.jTableDatosReferenciaBancaria.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReferenciaBancaria"));
		
		this.jTableDatosReferenciaBancaria.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReferenciaBancaria"));
		
		this.jButtonNuevoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"NuevoReferenciaBancaria"));
		
		this.jButtonDuplicarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"DuplicarReferenciaBancaria"));
		
		this.jButtonCopiarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"CopiarReferenciaBancaria"));
		
		this.jButtonVerFormReferenciaBancaria.addActionListener(new ButtonActionListener(this,"VerFormReferenciaBancaria"));
		
		
		this.jButtonNuevoToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"NuevoToolBarReferenciaBancaria"));
			
		this.jButtonDuplicarToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReferenciaBancaria"));
			
		this.jMenuItemNuevoReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReferenciaBancaria"));
			
		this.jMenuItemDuplicarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReferenciaBancaria"));		
		
		
		this.jButtonNuevoRelacionesReferenciaBancaria.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReferenciaBancaria"));
		
		
		this.jButtonNuevoRelacionesToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReferenciaBancaria"));
			
		this.jMenuItemNuevoRelacionesReferenciaBancaria.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReferenciaBancaria"));		
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"ModificarReferenciaBancaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonModificarToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferenciaBancaria"));
			
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemModificarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferenciaBancaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"ActualizarReferenciaBancaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonActualizarToolBarReferenciaBancaria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferenciaBancaria"));
				
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemActualizarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferenciaBancaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"EliminarReferenciaBancaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonEliminarToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferenciaBancaria"));
						
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemEliminarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferenciaBancaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CancelarReferenciaBancaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonCancelarToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferenciaBancaria"));
			
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemCancelarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferenciaBancaria"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReferenciaBancaria"));		
		
		
		this.jButtonCerrarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CerrarReferenciaBancaria"));
		
		
		this.jButtonCerrarToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CerrarToolBarReferenciaBancaria"));
			
		this.jMenuItemCerrarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReferenciaBancaria"));
			
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jMenuItemDetalleCerrarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferenciaBancaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosReferenciaBancaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaBancaria"));
		}
		
		this.jButtonCopiarToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CopiarToolBarReferenciaBancaria"));
			
		this.jButtonVerFormToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"VerFormToolBarReferenciaBancaria"));
		
		this.jMenuItemGuardarCambiosReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReferenciaBancaria"));
			
		this.jMenuItemCopiarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReferenciaBancaria"));		
		
		this.jMenuItemVerFormReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReferenciaBancaria"));		
		
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferenciaBancaria"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReferenciaBancaria"));
			
		this.jMenuItemGuardarCambiosTablaReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferenciaBancaria"));		
		
		
		
		this.jButtonRecargarInformacionReferenciaBancaria.addActionListener (new ButtonActionListener(this,"RecargarInformacionReferenciaBancaria"));
					
		this.jButtonRecargarInformacionToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReferenciaBancaria"));
		
		this.jMenuItemRecargarInformacionReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReferenciaBancaria"));		
		
		
		
		this.jButtonAnterioresReferenciaBancaria.addActionListener (new ButtonActionListener(this,"AnterioresReferenciaBancaria"));
		
		
		this.jButtonAnterioresToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReferenciaBancaria"));
		
		this.jMenuItemAnterioresReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReferenciaBancaria"));		
		
		
		this.jButtonSiguientesReferenciaBancaria.addActionListener (new ButtonActionListener(this,"SiguientesReferenciaBancaria"));
		
		
		this.jButtonSiguientesToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReferenciaBancaria"));
			
		this.jMenuItemSiguientesReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReferenciaBancaria"));
			
		this.jMenuItemAbrirOrderByReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReferenciaBancaria"));
			
		this.jMenuItemMostrarOcultarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReferenciaBancaria"));
			
		this.jMenuItemDetalleAbrirOrderByReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReferenciaBancaria"));
			
		this.jMenuItemDetalleMostarOcultarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReferenciaBancaria"));		
		
		
		this.jButtonNuevoGuardarCambiosReferenciaBancaria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReferenciaBancaria"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReferenciaBancaria"));
			
		this.jMenuItemNuevoGuardarCambiosReferenciaBancaria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReferenciaBancaria"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReferenciaBancaria.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReferenciaBancaria"));

		this.jCheckBoxSeleccionadosReferenciaBancaria.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReferenciaBancaria"));
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferenciaBancaria"));
		}
		
		
		this.jComboBoxTiposRelacionesReferenciaBancaria.addActionListener (new ButtonActionListener(this,"TiposRelacionesReferenciaBancaria"));
			
		this.jComboBoxTiposAccionesReferenciaBancaria.addActionListener (new ButtonActionListener(this,"TiposAccionesReferenciaBancaria"));
					
		this.jComboBoxTiposSeleccionarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReferenciaBancaria"));
			
		this.jTextFieldValorCampoGeneralReferenciaBancaria.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReferenciaBancaria"));		
		
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_empresaReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_empresaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBancariaBusqueda"));
		//jButtonidclienteReferenciaBancaria.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaBancariaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancaria"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientebancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientebancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientebancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientebancoReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienteproductobancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienteproductobancoReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecuentabancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecuentabancoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuenta_tarjetaReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonfecha_emisionReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonfecha_vencimientoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtoncupoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"cupoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtontiene_creditoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"tiene_creditoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_creditosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_creditosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtontiene_protestosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"tiene_protestosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_protestosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_protestosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonsaldos_promediosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"saldos_promediosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonpropietario_cuentaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"propietario_cuentaReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_tipo_valoracionReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonesactivoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaBancariaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdClienteReferenciaBancaria"));

			this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancaria"));

			this.jButtonFK_IdTipoBancoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoBancoReferenciaBancaria"));

			this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoReferenciaBancaria"));

			this.jButtonFK_IdTipoProductoBancoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoBancoReferenciaBancaria"));

			this.jButtonFK_IdTipoValoracionReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionReferenciaBancaria"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReferenciaBancaria!=null) {
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaBancaria"));
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaBancaria"));
				this.jInternalFrameReporteDinamicoReferenciaBancaria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaBancaria"));
			}
			
			//this.jButtonCerrarReporteDinamicoReferenciaBancaria.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaBancaria"));				
			//this.jButtonGenerarReporteDinamicoReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaBancaria"));
			//this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaBancaria"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReferenciaBancaria!=null) {
				this.jInternalFrameImportacionReferenciaBancaria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferenciaBancaria"));
				this.jInternalFrameImportacionReferenciaBancaria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferenciaBancaria"));
				this.jInternalFrameImportacionReferenciaBancaria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferenciaBancaria"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReferenciaBancaria.addActionListener (new ButtonActionListener(this,"AbrirOrderByReferenciaBancaria"));
			
			this.jButtonAbrirOrderByToolBarReferenciaBancaria.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReferenciaBancaria"));			
			
			if(this.jInternalFrameOrderByReferenciaBancaria!=null) {
				this.jInternalFrameOrderByReferenciaBancaria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferenciaBancaria"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaBancaria.jTabbedPaneRelacionesReferenciaBancaria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferenciaBancaria"));
		
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
            		closingInternalFrameReferenciaBancaria();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReferenciaBancaria.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReferenciaBancaria = (JInternalFrameBase)event.getSource();
	            	
	            ReferenciaBancariaBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaBancariaBeanSwingJInternalFrame)jInternalFrameDetalleFormReferenciaBancaria.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReferenciaBancariaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReferenciaBancaria.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReferenciaBancariaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReferenciaBancaria.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReferenciaBancaria.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaBancariaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaBancariaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaBancariaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReferenciaBancaria";
		inputMap = this.jButtonNuevoReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaBancariaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaBancariaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaBancariaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaBancariaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReferenciaBancaria";
		inputMap = this.jButtonNuevoRelacionesReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaBancariaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReferenciaBancaria";
		inputMap = this.jButtonModificarReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReferenciaBancariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReferenciaBancaria";
		inputMap = this.jButtonActualizarReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReferenciaBancariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReferenciaBancaria";
		inputMap = this.jButtonEliminarReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReferenciaBancariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReferenciaBancaria";
		inputMap = this.jButtonCancelarReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReferenciaBancariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReferenciaBancaria";
		inputMap = this.jButtonCerrarReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReferenciaBancariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReferenciaBancaria";
		inputMap = this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonGuardarCambiosReferenciaBancaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReferenciaBancariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReferenciaBancaria.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReferenciaBancariaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReferenciaBancaria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReferenciaBancariaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReferenciaBancaria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReferenciaBancariaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReferenciaBancaria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReferenciaBancariaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_empresaReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_empresaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaBancariaBusqueda"));
		//jButtonidclienteReferenciaBancaria.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaBancariaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancaria"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientebancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientebancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientebancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientebancoReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclienteproductobancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclienteproductobancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclienteproductobancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclienteproductobancoReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientecuentabancoReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecuentabancoReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidvalorclientecuentabancoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecuentabancoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_cuenta_tarjetaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuenta_tarjetaReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonfecha_emisionReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonfecha_vencimientoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtoncupoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"cupoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtontiene_creditoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"tiene_creditoReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_creditosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_creditosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtontiene_protestosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"tiene_protestosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonnumero_protestosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"numero_protestosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonsaldos_promediosReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"saldos_promediosReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonpropietario_cuentaReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"propietario_cuentaReferenciaBancariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_tipo_valoracionReferenciaBancariaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaBancariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonid_tipo_valoracionReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaBancariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaBancaria.jButtonesactivoReferenciaBancariaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaBancariaBusqueda"));
		
		
		this.jButtonFK_IdClienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdClienteReferenciaBancaria"));

		this.jButtonBuscarFK_IdClienteidclienteReferenciaBancaria.addActionListener(new ButtonActionListener(this,"idclienteReferenciaBancaria"));

		this.jButtonFK_IdTipoBancoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoBancoReferenciaBancaria"));

		this.jButtonFK_IdTipoCuentaBancoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoReferenciaBancaria"));

		this.jButtonFK_IdTipoProductoBancoReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoBancoReferenciaBancaria"));

		this.jButtonFK_IdTipoValoracionReferenciaBancaria.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionReferenciaBancaria"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReferenciaBancaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReferenciaBancariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReferenciaBancariaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReferenciaBancaria.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReferenciaBancaria(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
					referenciabancariaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaBancaria referenciabancariaAux:referenciabancarias) {
					referenciabancariaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReferenciaBancariaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferenciaBancaria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
						referenciabancariaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaBancaria referenciabancariaAux:referenciabancarias) {
						referenciabancariaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
					
						if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO)) {
							existe=true;
							referenciabancariaAux.settiene_credito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS)) {
							existe=true;
							referenciabancariaAux.settiene_protestos(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							referenciabancariaAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaBancaria referenciabancariaAux:referenciabancarias) {
						
						if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO)) {
							existe=true;
							referenciabancariaAux.settiene_credito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS)) {
							existe=true;
							referenciabancariaAux.settiene_protestos(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							referenciabancariaAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferenciaBancaria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferenciaBancaria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReferenciaBancariaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferenciaBancaria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReferenciaBancaria.getSelectedRows();
			
			ReferenciaBancaria referenciabancariaLocal=new ReferenciaBancaria();
			
			//this.seleccionarTodosReferenciaBancaria(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciabancariaLocal =(ReferenciaBancaria) this.referenciabancariaLogic.getReferenciaBancarias().toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					referenciabancariaLocal =(ReferenciaBancaria) this.referenciabancarias.toArray()[this.jTableDatosReferenciaBancaria.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				referenciabancariaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
						referenciabancariaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaBancaria referenciabancariaAux:referenciabancarias) {
						referenciabancariaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferenciaBancaria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferenciaBancaria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferenciaBancaria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReferenciaBancariaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReferenciaBancariaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReferenciaBancariaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReferenciaBancaria(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReferenciaBancaria.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReferenciaBancaria referenciabancariaAux:this.referenciabancariaLogic.getReferenciaBancarias()) {
				
						if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA)) {
							existe=true;
							referenciabancariaAux.setnumero_cuenta_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							referenciabancariaAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							referenciabancariaAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_CUPO)) {
							existe=true;
							referenciabancariaAux.setcupo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS)) {
							existe=true;
							referenciabancariaAux.setnumero_creditos(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS)) {
							existe=true;
							referenciabancariaAux.setnumero_protestos(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS)) {
							existe=true;
							referenciabancariaAux.setsaldos_promedios(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA)) {
							existe=true;
							referenciabancariaAux.setpropietario_cuenta(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaBancaria referenciabancariaAux:referenciabancarias) {
					
						if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA)) {
							existe=true;
							referenciabancariaAux.setnumero_cuenta_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							referenciabancariaAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							referenciabancariaAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_CUPO)) {
							existe=true;
							referenciabancariaAux.setcupo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS)) {
							existe=true;
							referenciabancariaAux.setnumero_creditos(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS)) {
							existe=true;
							referenciabancariaAux.setnumero_protestos(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS)) {
							existe=true;
							referenciabancariaAux.setsaldos_promedios(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA)) {
							existe=true;
							referenciabancariaAux.setpropietario_cuenta(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReferenciaBancariaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReferenciaBancaria(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReferenciaBancaria=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReferenciaBancaria.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReferenciaBancaria) {				
					conSplash=true;//false;										
					
					//this.startProcessReferenciaBancaria(conSplash);
				
					this.generarReporteReferenciaBancariasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReferenciaBancariasSeleccionados();
				//this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciaBancariasSeleccionados(false);
				//this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciaBancariasSeleccionados(true);
				//this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferenciaBancaria();
				
				this.exportarReferenciaBancariasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReferenciaBancarias();
				//this.importarReferenciaBancarias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferenciaBancaria();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReferenciaBancariasSeleccionados();
				//this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Referencia Bancaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReferenciaBancaria();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReferenciaBancaria)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReferenciaBancaria(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
				}	
			} 			
			else if(ReferenciaBancariaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReferenciaBancaria) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReferenciaBancaria(conSplash);
					
						//this.actualizarParametrosGeneralReferenciaBancaria();
						
						this.generarReporteProcesoAccionReferenciaBancariasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReferenciaBancariaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Referencia BancariaS SELECCIONADOS?", "MANTENIMIENTO DE Referencia Bancaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReferenciaBancaria();
				
						this.actualizarParametrosGeneralReferenciaBancaria();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.referenciabancariaReturnGeneral=referenciabancariaLogic.procesarAccionReferenciaBancariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.referenciabancariaLogic.getReferenciaBancarias(),this.referenciabancariaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReferenciaBancariaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReferenciaBancaria();
					
					ReferenciaBancariaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReferenciaBancariaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferenciaBancaria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxTiposAccionesFormularioReferenciaBancaria.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReferenciaBancaria(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReferenciaBancariaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReferenciaBancaria();
			
			if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
			ReferenciaBancaria referenciabancaria=new ReferenciaBancaria();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReferenciaBancaria(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReferenciaBancaria.getSelectedItem();
			
			
			
			
			referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
			//this.sTipoAccion;
			
			if(referenciabancariasSeleccionados.size()==1) {
				for(ReferenciaBancaria referenciabancariaAux:referenciabancariasSeleccionados) {
					referenciabancaria=referenciabancariaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReferenciaBancaria();
			
      		//this.finishProcessReferenciaBancaria(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReferenciaBancariaReturnGeneral() throws Exception {
		if(this.referenciabancariaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.referenciabancariaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.referenciabancariaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.referenciabancariaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.referenciabancariaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.referenciabancariaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReferenciaBancaria(false);
		}
		
		if(this.referenciabancariaReturnGeneral.getConRetornoLista() || this.referenciabancariaReturnGeneral.getConRetornoObjeto()) {
			if(this.referenciabancariaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciabancariaLogic.setReferenciaBancarias(this.referenciabancariaReturnGeneral.getReferenciaBancarias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.referenciabancariaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciabancariaLogic.setReferenciaBancaria(this.referenciabancariaReturnGeneral.getReferenciaBancaria());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingReferenciaBancaria(false);
		}
	}
	
	public void actualizarParametrosGeneralReferenciaBancaria() throws Exception {
		
		
	}
	
	public ArrayList<ReferenciaBancaria> getReferenciaBancariasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReferenciaBancaria) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ReferenciaBancaria referenciabancariaAux:referenciabancariaLogic.getReferenciaBancarias()) {
					if(referenciabancariaAux.getIsSelected()) {
						referenciabancariasSeleccionados.add(referenciabancariaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaBancaria referenciabancariaAux:this.referenciabancarias) {
					if(referenciabancariaAux.getIsSelected()) {
						referenciabancariasSeleccionados.add(referenciabancariaAux);				
					}
				}
			}
			
			if(referenciabancariasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						referenciabancariasSeleccionados.addAll(this.referenciabancariaLogic.getReferenciaBancarias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						referenciabancariasSeleccionados.addAll(this.referenciabancarias);				
					}
				}
			}
		} else {
			referenciabancariasSeleccionados.add(this.referenciabancaria);
		}
		
		return referenciabancariasSeleccionados;
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
	
	public void generarReporteReferenciaBancariasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReferenciaBancariasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReferenciaBancariasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciaBancariasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciaBancariasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Referencia Bancaria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReferenciaBancariasSeleccionados() throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados);
		
	}	
	
	public void generarReporteNormalReferenciaBancariasSeleccionados() throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReferenciaBancariasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReferenciaBancariasSeleccionados() throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReferenciaBancaria();
		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReferenciaBancaria();
		
		
		//this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados ,referenciabancariaImplementable,referenciabancariaImplementableHome);
	}
	
	public void mostrarImportacionReferenciaBancarias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReferenciaBancaria();
		
		this.abrirFrameImportacionReferenciaBancaria();		
		
			
		//this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados ,referenciabancariaImplementable,referenciabancariaImplementableHome);
	}
	
	public void importarReferenciaBancarias() throws Exception {		
	
	}
	
	public void exportarReferenciaBancariasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReferenciaBancariasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReferenciaBancariasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReferenciaBancariasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Referencia Bancaria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReferenciaBancariasSeleccionados() throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReferenciaBancaria(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ReferenciaBancaria referenciabancariaAux:referenciabancariasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReferenciaBancaria(referenciabancariaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//referenciabancariaAux.setsDetalleGeneralEntityReporte(referenciabancariaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReferenciaBancaria(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_CUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReferenciaBancaria(ReferenciaBancaria referenciabancaria,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=referenciabancaria.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.gettipoprodubanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.gettipocuentabanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getnumero_cuenta_tarjeta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getcupo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.gettiene_credito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getnumero_creditos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.gettiene_protestos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getnumero_protestos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getsaldos_promedios();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getpropietario_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.gettipovaloracion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciabancaria.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReferenciaBancariasSeleccionados() throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ReferenciaBancarias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReferenciaBancaria(row);				
				iRow++;
			}				
			
			for(ReferenciaBancaria referenciabancariaAux:referenciabancariasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReferenciaBancaria(referenciabancariaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReferenciaBancariasSeleccionados() throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();		
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciabancaria.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("referenciabancarias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("referenciabancaria");
			//elementRoot.appendChild(element);
		
			for(ReferenciaBancaria referenciabancariaAux:referenciabancariasSeleccionados) {
				element = document.createElement("referenciabancaria");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReferenciaBancaria(referenciabancariaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Bancaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReferenciaBancaria(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_CUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReferenciaBancaria(ReferenciaBancaria referenciabancaria,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.gettipoprodubanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.gettipocuentabanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getnumero_cuenta_tarjeta());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getcupo());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.gettiene_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getnumero_creditos());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.gettiene_protestos());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getnumero_protestos());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getsaldos_promedios());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getpropietario_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.gettipovaloracion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciabancaria.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlReferenciaBancaria(ReferenciaBancaria referenciabancaria,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReferenciaBancariaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(referenciabancaria.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReferenciaBancariaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(referenciabancaria.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ReferenciaBancariaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(referenciabancaria.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(ReferenciaBancariaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(referenciabancaria.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementbanco_descripcion = document.createElement(ReferenciaBancariaConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(referenciabancaria.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementtipoprodubanco_descripcion = document.createElement(ReferenciaBancariaConstantesFunciones.IDTIPOPRODUBANCO);
		elementtipoprodubanco_descripcion.appendChild(document.createTextNode(referenciabancaria.gettipoprodubanco_descripcion()));
		element.appendChild(elementtipoprodubanco_descripcion);

		Element elementtipocuentabanco_descripcion = document.createElement(ReferenciaBancariaConstantesFunciones.IDTIPOCUENTABANCO);
		elementtipocuentabanco_descripcion.appendChild(document.createTextNode(referenciabancaria.gettipocuentabanco_descripcion()));
		element.appendChild(elementtipocuentabanco_descripcion);

		Element elementnumero_cuenta_tarjeta = document.createElement(ReferenciaBancariaConstantesFunciones.NUMEROCUENTATARJETA);
		elementnumero_cuenta_tarjeta.appendChild(document.createTextNode(referenciabancaria.getnumero_cuenta_tarjeta().trim()));
		element.appendChild(elementnumero_cuenta_tarjeta);

		Element elementfecha_emision = document.createElement(ReferenciaBancariaConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(referenciabancaria.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(ReferenciaBancariaConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(referenciabancaria.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementcupo = document.createElement(ReferenciaBancariaConstantesFunciones.CUPO);
		elementcupo.appendChild(document.createTextNode(referenciabancaria.getcupo().toString().trim()));
		element.appendChild(elementcupo);

		Element elementtiene_credito = document.createElement(ReferenciaBancariaConstantesFunciones.TIENECREDITO);
		elementtiene_credito.appendChild(document.createTextNode(referenciabancaria.gettiene_credito().toString().trim()));
		element.appendChild(elementtiene_credito);

		Element elementnumero_creditos = document.createElement(ReferenciaBancariaConstantesFunciones.NUMEROCREDITOS);
		elementnumero_creditos.appendChild(document.createTextNode(referenciabancaria.getnumero_creditos().toString().trim()));
		element.appendChild(elementnumero_creditos);

		Element elementtiene_protestos = document.createElement(ReferenciaBancariaConstantesFunciones.TIENEPROTESTOS);
		elementtiene_protestos.appendChild(document.createTextNode(referenciabancaria.gettiene_protestos().toString().trim()));
		element.appendChild(elementtiene_protestos);

		Element elementnumero_protestos = document.createElement(ReferenciaBancariaConstantesFunciones.NUMEROPROTESTOS);
		elementnumero_protestos.appendChild(document.createTextNode(referenciabancaria.getnumero_protestos().toString().trim()));
		element.appendChild(elementnumero_protestos);

		Element elementsaldos_promedios = document.createElement(ReferenciaBancariaConstantesFunciones.SALDOSPROMEDIOS);
		elementsaldos_promedios.appendChild(document.createTextNode(referenciabancaria.getsaldos_promedios().trim()));
		element.appendChild(elementsaldos_promedios);

		Element elementpropietario_cuenta = document.createElement(ReferenciaBancariaConstantesFunciones.PROPIETARIOCUENTA);
		elementpropietario_cuenta.appendChild(document.createTextNode(referenciabancaria.getpropietario_cuenta().trim()));
		element.appendChild(elementpropietario_cuenta);

		Element elementtipovaloracion_descripcion = document.createElement(ReferenciaBancariaConstantesFunciones.IDTIPOVALORACION);
		elementtipovaloracion_descripcion.appendChild(document.createTextNode(referenciabancaria.gettipovaloracion_descripcion()));
		element.appendChild(elementtipovaloracion_descripcion);

		Element elementesactivo = document.createElement(ReferenciaBancariaConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(referenciabancaria.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoReferenciaBancariasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados=new ArrayList<ReferenciaBancaria>();
		
		referenciabancariasSeleccionados=this.getReferenciaBancariasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReferenciaBancaria(referenciabancariasSeleccionados);
		
		this.generarReporteReferenciaBancarias("Todos",referenciabancariasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReferenciaBancaria(ArrayList<ReferenciaBancaria> referenciabancariasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ReferenciaBancaria referenciabancariaAux:referenciabancariasSeleccionados) {
				referenciabancariaAux.setsDetalleGeneralEntityReporte(referenciabancariaAux.toString());
			
				if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOPRODUBANCO)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.gettipoprodubanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOCUENTABANCO)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.gettipocuentabanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCUENTATARJETA)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getnumero_cuenta_tarjeta());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(referenciabancariaAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(referenciabancariaAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_TIENECREDITO)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(referenciabancariaAux.gettiene_credito()));
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROCREDITOS)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getnumero_creditos().toString());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_TIENEPROTESTOS)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(referenciabancariaAux.gettiene_protestos()));
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_NUMEROPROTESTOS)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getnumero_protestos().toString());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_SALDOSPROMEDIOS)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getsaldos_promedios());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_PROPIETARIOCUENTA)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.getpropietario_cuenta());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_IDTIPOVALORACION)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(referenciabancariaAux.gettipovaloracion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaBancariaConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					referenciabancariaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(referenciabancariaAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaBancariaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReferenciaBancaria(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReferenciaBancaria=true;
				this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=true;
				this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=true;
			}
			
			this.isVisibilidadCeldaModificarReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=false;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
			this.isVisibilidadCeldaModificarReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=true;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
			this.isVisibilidadCeldaModificarReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=true;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=true;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
			this.isVisibilidadCeldaModificarReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=true;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=true;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=true;
			this.isVisibilidadCeldaModificarReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=false;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=false;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
			this.isVisibilidadCeldaModificarReferenciaBancaria=true;
			this.isVisibilidadCeldaActualizarReferenciaBancaria=false;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
			this.isVisibilidadCeldaCancelarReferenciaBancaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaBancaria=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReferenciaBancariaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReferenciaBancaria=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=true;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=true;
		} else {
			this.actualizarEstadoPanelsReferenciaBancaria(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReferenciaBancaria=false;
			//this.isVisibilidadCeldaVerFormReferenciaBancaria=false;
			this.isVisibilidadCeldaDuplicarReferenciaBancaria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!referenciabancariaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
		} else {
			this.isVisibilidadCeldaNuevoReferenciaBancaria=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaBancaria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			if(!referenciabancariaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;												
			}
			
			this.jButtonCerrarReferenciaBancaria.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReferenciaBancaria=false;
		}
		
		if(!this.permiteMantenimiento(this.referenciabancaria)) {
			this.isVisibilidadCeldaActualizarReferenciaBancaria=false;
			this.isVisibilidadCeldaEliminarReferenciaBancaria=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReferenciaBancaria() {
	}
	
	public void actualizarEstadoPanelsReferenciaBancaria(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReferenciaBancaria!=null) {
				this.jScrollPanelDatosEdicionReferenciaBancaria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaBancaria!=null) {
				this.jScrollPanelDatosReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaBancaria!=null) {
				this.jPanelPaginacionReferenciaBancaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
					this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaBancaria!=null) {
				this.jTabbedPaneBusquedasReferenciaBancaria.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesReferenciaBancaria!=null) {
				this.jPanelParametrosReportesReferenciaBancaria.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdClienteReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoCuentaBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoProductoBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProductoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoProductoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoValoracion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoValoracionReferenciaBancaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdClienteReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoBanco=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoCuentaBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoProductoBanco=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoProductoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoProductoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoValoracion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoValoracionReferenciaBancaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadFK_IdCliente=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdClienteReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoBanco=isParaBanco;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoCuentaBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoProductoBanco=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoProductoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoProductoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoValoracion=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoValoracionReferenciaBancaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProduBanco(Boolean isParaTipoProduBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProduBancoNegation=!isParaTipoProduBanco;

			this.isVisibilidadFK_IdCliente=isParaTipoProduBancoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdClienteReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoBanco=isParaTipoProduBancoNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaTipoProduBancoNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoCuentaBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoProductoBanco=isParaTipoProduBanco;
			if(!this.isVisibilidadFK_IdTipoProductoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoProductoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoProduBancoNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoValoracionReferenciaBancaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCuentaBanco(Boolean isParaTipoCuentaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCuentaBancoNegation=!isParaTipoCuentaBanco;

			this.isVisibilidadFK_IdCliente=isParaTipoCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdClienteReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoBanco=isParaTipoCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaTipoCuentaBanco;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoCuentaBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoProductoBanco=isParaTipoCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoProductoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoProductoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoValoracionReferenciaBancaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoValoracion(Boolean isParaTipoValoracion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoValoracionNegation=!isParaTipoValoracion;

			this.isVisibilidadFK_IdCliente=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdClienteReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoBanco=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdTipoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoCuentaBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoProductoBanco=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdTipoProductoBanco) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoProductoBancoReferenciaBancaria);}

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoValoracion;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaBancaria.remove(jPanelFK_IdTipoValoracionReferenciaBancaria);}
		}
		
	}
	
	
	
	

	public String registrarSesionReferenciaBancariaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(referenciabancariaSessionBean==null) {
				referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(referenciabancariaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.referenciabancariaFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionReferenciaBancaria(true);
			//clienteSessionBean.setlidReferenciaBancariaActual(this.idReferenciaBancariaActual);

			referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaBancaria(true);
			referenciabancariaSessionBean.setlIdReferenciaBancariaActualForeignKey(this.idReferenciaBancariaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ReferenciaBancariaSessionBean referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		
		if(this.referenciabancariaSessionBean==null) {
			this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		}
		
		this.referenciabancariaSessionBean.setsUltimaBusquedaReferenciaBancaria(this.getsAccionBusqueda());
		this.referenciabancariaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.referenciabancariaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			referenciabancariaSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			referenciabancariaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoBanco")) {
			referenciabancariaSessionBean.setidvalorclientebanco(this.getidvalorclientebancoFK_IdTipoBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBanco")) {
			referenciabancariaSessionBean.setidvalorclientecuentabanco(this.getidvalorclientecuentabancoFK_IdTipoCuentaBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProductoBanco")) {
			referenciabancariaSessionBean.setidvalorclienteproductobanco(this.getidvalorclienteproductobancoFK_IdTipoProductoBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
			referenciabancariaSessionBean.setid_tipo_valoracion(this.getid_tipo_valoracionFK_IdTipoValoracion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ReferenciaBancariaSessionBean referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		
		if(this.referenciabancariaSessionBean==null) {
			this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		}
		
		if(this.referenciabancariaSessionBean.getsUltimaBusquedaReferenciaBancaria()!=null&&!this.referenciabancariaSessionBean.getsUltimaBusquedaReferenciaBancaria().equals("")) {
			this.setsAccionBusqueda(referenciabancariaSessionBean.getsUltimaBusquedaReferenciaBancaria());
			this.setiNumeroPaginacion(referenciabancariaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(referenciabancariaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(referenciabancariaSessionBean.getidcliente());
				referenciabancariaSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(referenciabancariaSessionBean.getid_empresa());
				referenciabancariaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoBanco")) {
				this.setidvalorclientebancoFK_IdTipoBanco(referenciabancariaSessionBean.getidvalorclientebanco());
				referenciabancariaSessionBean.setidvalorclientebanco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBanco")) {
				this.setidvalorclientecuentabancoFK_IdTipoCuentaBanco(referenciabancariaSessionBean.getidvalorclientecuentabanco());
				referenciabancariaSessionBean.setidvalorclientecuentabanco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProductoBanco")) {
				this.setidvalorclienteproductobancoFK_IdTipoProductoBanco(referenciabancariaSessionBean.getidvalorclienteproductobanco());
				referenciabancariaSessionBean.setidvalorclienteproductobanco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
				this.setid_tipo_valoracionFK_IdTipoValoracion(referenciabancariaSessionBean.getid_tipo_valoracion());
				referenciabancariaSessionBean.setid_tipo_valoracion(-1L);
			}
		}
		
		this.referenciabancariaSessionBean.setsUltimaBusquedaReferenciaBancaria("");
		this.referenciabancariaSessionBean.setiNumeroPaginacion(ReferenciaBancariaConstantesFunciones.INUMEROPAGINACION);
		this.referenciabancariaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaReferenciaBancaria(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReferenciaBancaria() {
		this.updateBorderResaltarBusquedasFormularioReferenciaBancaria();
		this.updateVisibilidadBusquedasFormularioReferenciaBancaria();
		this.updateHabilitarBusquedasFormularioReferenciaBancaria();
	}
	
	public void updateBorderResaltarBusquedasFormularioReferenciaBancaria() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasReferenciaBancaria.getComponents().length>0) {
	

		if(this.referenciabancariaConstantesFunciones.resaltarFK_IdClienteReferenciaBancaria!=null) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdClienteReferenciaBancaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdClienteReferenciaBancaria);
			}
		}

		if(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoBancoReferenciaBancaria!=null) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoBancoReferenciaBancaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoBancoReferenciaBancaria);
			}
		}

		if(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoCuentaBancoReferenciaBancaria!=null) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoReferenciaBancaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoCuentaBancoReferenciaBancaria);
			}
		}

		if(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoProductoBancoReferenciaBancaria!=null) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoProductoBancoReferenciaBancaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoProductoBancoReferenciaBancaria);
			}
		}

		if(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoValoracionReferenciaBancaria!=null) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaBancaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoValoracionReferenciaBancaria);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioReferenciaBancaria() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasReferenciaBancaria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdClienteReferenciaBancaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciabancariaConstantesFunciones.mostrarFK_IdClienteReferenciaBancaria);
			if(!this.referenciabancariaConstantesFunciones.mostrarFK_IdClienteReferenciaBancaria && index>-1) {
				this.jTabbedPaneBusquedasReferenciaBancaria.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoBancoReferenciaBancaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoBancoReferenciaBancaria);
			if(!this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoBancoReferenciaBancaria && index>-1) {
				this.jTabbedPaneBusquedasReferenciaBancaria.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoReferenciaBancaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoCuentaBancoReferenciaBancaria);
			if(!this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoCuentaBancoReferenciaBancaria && index>-1) {
				this.jTabbedPaneBusquedasReferenciaBancaria.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoProductoBancoReferenciaBancaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoProductoBancoReferenciaBancaria);
			if(!this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoProductoBancoReferenciaBancaria && index>-1) {
				this.jTabbedPaneBusquedasReferenciaBancaria.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaBancaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoValoracionReferenciaBancaria);
			if(!this.referenciabancariaConstantesFunciones.mostrarFK_IdTipoValoracionReferenciaBancaria && index>-1) {
				this.jTabbedPaneBusquedasReferenciaBancaria.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioReferenciaBancaria() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasReferenciaBancaria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdClienteReferenciaBancaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciabancariaConstantesFunciones.activarFK_IdClienteReferenciaBancaria);
				this.jTabbedPaneBusquedasReferenciaBancaria.setEnabledAt(index,this.referenciabancariaConstantesFunciones.activarFK_IdClienteReferenciaBancaria);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoBancoReferenciaBancaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciabancariaConstantesFunciones.activarFK_IdTipoBancoReferenciaBancaria);
				this.jTabbedPaneBusquedasReferenciaBancaria.setEnabledAt(index,this.referenciabancariaConstantesFunciones.activarFK_IdTipoBancoReferenciaBancaria);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoReferenciaBancaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciabancariaConstantesFunciones.activarFK_IdTipoCuentaBancoReferenciaBancaria);
				this.jTabbedPaneBusquedasReferenciaBancaria.setEnabledAt(index,this.referenciabancariaConstantesFunciones.activarFK_IdTipoCuentaBancoReferenciaBancaria);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoProductoBancoReferenciaBancaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciabancariaConstantesFunciones.activarFK_IdTipoProductoBancoReferenciaBancaria);
				this.jTabbedPaneBusquedasReferenciaBancaria.setEnabledAt(index,this.referenciabancariaConstantesFunciones.activarFK_IdTipoProductoBancoReferenciaBancaria);
			}

			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaBancaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciabancariaConstantesFunciones.activarFK_IdTipoValoracionReferenciaBancaria);
				this.jTabbedPaneBusquedasReferenciaBancaria.setEnabledAt(index,this.referenciabancariaConstantesFunciones.activarFK_IdTipoValoracionReferenciaBancaria);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaReferenciaBancaria(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdClienteReferenciaBancaria);

			this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);

			this.referenciabancariaConstantesFunciones.setResaltarFK_IdClienteReferenciaBancaria(resaltar);

			jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdClienteReferenciaBancaria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoBanco")) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoBancoReferenciaBancaria);

			this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);

			this.referenciabancariaConstantesFunciones.setResaltarFK_IdTipoBancoReferenciaBancaria(resaltar);

			jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoBancoReferenciaBancaria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCuentaBanco")) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoReferenciaBancaria);

			this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);

			this.referenciabancariaConstantesFunciones.setResaltarFK_IdTipoCuentaBancoReferenciaBancaria(resaltar);

			jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoCuentaBancoReferenciaBancaria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProductoBanco")) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoProductoBancoReferenciaBancaria);

			this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);

			this.referenciabancariaConstantesFunciones.setResaltarFK_IdTipoProductoBancoReferenciaBancaria(resaltar);

			jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoProductoBancoReferenciaBancaria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoValoracion")) {
			index= this.jTabbedPaneBusquedasReferenciaBancaria.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaBancaria);

			this.jTabbedPaneBusquedasReferenciaBancaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaBancaria.getComponent(index);

			this.referenciabancariaConstantesFunciones.setResaltarFK_IdTipoValoracionReferenciaBancaria(resaltar);

			jPanel.setBorder(this.referenciabancariaConstantesFunciones.resaltarFK_IdTipoValoracionReferenciaBancaria);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarReferenciaBancaria.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioReferenciaBancaria() throws Exception {

		if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReferenciaBancaria();
		this.updateVisibilidadResaltarControlesFormularioReferenciaBancaria();
		this.updateHabilitarResaltarControlesFormularioReferenciaBancaria();
		
	}
	
	public void updateBorderResaltarControlesFormularioReferenciaBancaria() throws Exception {
		if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.referenciabancariaConstantesFunciones.resaltaridReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltaridReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarid_empresaReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarid_empresaReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltaridclienteReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltaridclienteReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltaridvalorclientebancoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltaridvalorclientebancoReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltaridvalorclienteproductobancoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltaridvalorclienteproductobancoReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltaridvalorclientecuentabancoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltaridvalorclientecuentabancoReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarnumero_cuenta_tarjetaReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarnumero_cuenta_tarjetaReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarfecha_emisionReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarfecha_emisionReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarfecha_vencimientoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarfecha_vencimientoReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarcupoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarcupoReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltartiene_creditoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setBorderPainted(true);this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltartiene_creditoReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarnumero_creditosReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarnumero_creditosReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltartiene_protestosReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setBorderPainted(true);this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltartiene_protestosReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarnumero_protestosReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarnumero_protestosReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarsaldos_promediosReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarsaldos_promediosReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarpropietario_cuentaReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarpropietario_cuentaReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltarid_tipo_valoracionReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltarid_tipo_valoracionReferenciaBancaria);}
		if(this.referenciabancariaConstantesFunciones.resaltaresactivoReferenciaBancaria!=null && this.jInternalFrameDetalleFormReferenciaBancaria!=null) {this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setBorderPainted(true);this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setBorder(this.referenciabancariaConstantesFunciones.resaltaresactivoReferenciaBancaria);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReferenciaBancaria() throws Exception {		
		if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
	
		//this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelidReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarid_empresaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelid_empresaReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarid_empresaReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridclienteReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelidclienteReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridclienteReferenciaBancaria);
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridclienteReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridvalorclientebancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelidvalorclientebancoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridvalorclientebancoReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridvalorclienteproductobancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelidvalorclienteproductobancoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridvalorclienteproductobancoReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridvalorclientecuentabancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelidvalorclientecuentabancoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraridvalorclientecuentabancoReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarnumero_cuenta_tarjetaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelnumero_cuenta_tarjetaReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarnumero_cuenta_tarjetaReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarfecha_emisionReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelfecha_emisionReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarfecha_emisionReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarfecha_vencimientoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelfecha_vencimientoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarfecha_vencimientoReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarcupoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelcupoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarcupoReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrartiene_creditoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPaneltiene_creditoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrartiene_creditoReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarnumero_creditosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelnumero_creditosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarnumero_creditosReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrartiene_protestosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPaneltiene_protestosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrartiene_protestosReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarnumero_protestosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelnumero_protestosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarnumero_protestosReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarsaldos_promediosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelsaldos_promediosReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarsaldos_promediosReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarpropietario_cuentaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelpropietario_cuentaReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarpropietario_cuentaReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarid_tipo_valoracionReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelid_tipo_valoracionReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostrarid_tipo_valoracionReferenciaBancaria);
		//this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraresactivoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jPanelesactivoReferenciaBancaria.setVisible(this.referenciabancariaConstantesFunciones.mostraresactivoReferenciaBancaria);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReferenciaBancaria() throws Exception {
		if(this.jInternalFrameDetalleFormReferenciaBancaria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferenciaBancaria!=null) {
	
		this.jInternalFrameDetalleFormReferenciaBancaria.jLabelidReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaridReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_empresaReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarid_empresaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidclienteReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaridclienteReferenciaBancaria);
			this.jInternalFrameDetalleFormReferenciaBancaria.jButtonidclienteReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaridclienteReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientebancoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaridvalorclientebancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclienteproductobancoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaridvalorclienteproductobancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxidvalorclientecuentabancoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaridvalorclientecuentabancoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_cuenta_tarjetaReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarnumero_cuenta_tarjetaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_emisionReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarfecha_emisionReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jDateChooserfecha_vencimientoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarfecha_vencimientoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldcupoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarcupoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_creditoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activartiene_creditoReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_creditosReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarnumero_creditosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxtiene_protestosReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activartiene_protestosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldnumero_protestosReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarnumero_protestosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldsaldos_promediosReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarsaldos_promediosReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jTextFieldpropietario_cuentaReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarpropietario_cuentaReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jComboBoxid_tipo_valoracionReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activarid_tipo_valoracionReferenciaBancaria);
		this.jInternalFrameDetalleFormReferenciaBancaria.jCheckBoxesactivoReferenciaBancaria.setEnabled(this.referenciabancariaConstantesFunciones.activaresactivoReferenciaBancaria);
		}
	}
	
		
}